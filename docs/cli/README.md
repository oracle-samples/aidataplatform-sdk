<a id="top"></a>
# AIDP CLI Command Reference
This guide summarizes the command groups, commands, options, and payload requirements exposed by the `aidp` command-line interface.
## Security guidance
- Treat PAR URLs and signed URLs returned by commands as bearer access material. Redact them from logs, tickets, and support bundles.
- Do not commit OCI configuration files, private keys, session-token files, or request bodies containing credentials. Avoid `--debug` when command output could contain sensitive request or response data.
- Use `--endpoint` only with a trusted, approved service endpoint. Prefer region-based endpoint resolution when an explicit endpoint is not required.
- Use short-lived, workload-scoped OCI identities and least-privilege permissions where available. Review destructive commands carefully before running them.
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
- [Data Lineage](#data-lineage)
- [Delta Share](#delta-share)
- [Git](#git)
- [Lake Authorization](#lake-authorization)
- [ML Ops](#mlops)
- [Notebook](#notebook)
- [Private Network Profile](#private-network-profile)
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
Copies an agent.

**Usage:**

`aidp agent copy <WORKSPACE-KEY> <AGENT-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `agent-key` (string, required) — The UUID of the agent.
**Options:**
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.

**Request Body (`CopyAgentDetails`):**
- `targetDescription` (string, optional) — Agent description.
- `targetDisplayName` (string, optional) — Agent name.
- `targetPathInfo` (string, required) — Path inside volume where the agent JSON is written.
- `targetWorkspaceKey` (string, required) — Key of the target workspace where the agent is copied.

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
Creates an agent.

**Usage:**

`aidp agent create <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`AgentCardCapabilitiesDetail`):**
- `isStreaming` (boolean, optional) — Indicates whether streaming responses are supported.

**Example:**
```json
{
  "isStreaming": true
}
```

**Request Body (`AgentCardConfigDetail`):**
- `capabilities` (object, optional) —
- `description` (string, optional) — Human-readable agent description.
- `documentationUrl` (string, optional) — Documentation URL for the agent. Serialized as `documentation_url`.
- `name` (string, required) — Human-readable agent name.
- `provider` (object, optional) —
- `skills` (array, optional) — List of skills supported by the agent.
- `version` (string, optional) — Agent version string.

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
- `description` (string, optional) — Description of what the skill does.
- `examples` (array, optional) — Optional example prompts for this skill.
- `id` (string, required) — Unique skill identifier.
- `name` (string, required) — Display name of the skill.
- `tags` (array, optional) — Optional tags for categorization/search.

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
- `description` (string, optional) — Agent description.
- `displayName` (string, optional) — Agent name.
- `edges` (object, optional) — Mapping of edgeId to edge objects.
- `guardrailsMap` (object, optional) — A hash map with key=guardrails config key, value=guardrails definition. It is used to find the guardrails definition for a guardrails reference by name.
- `key` (string, optional) — The unique identifier (UUID) of the agent.
- `modelVersion` (string, optional) — The model and upgrade compatibility version for this agent diagram.
- `nodes` (object, optional) — Mapping of nodeId to node objects.
- `toolsMap` (object, optional) — A hash map with key=tool key, value=tool definition. It is used to find the tool definition for a tool reference, where the tool is marked as a reference.

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
- `organization` (string, optional) — The name of the agent provider's organization.
- `url` (string, optional) — A URL for the agent provider's website or documentation.

**Example:**
```json
{
  "organization": "<string>",
  "url": "<string>"
}
```

**Request Body (`AutomaticSummarizationConfiguration`):**
- `isEnabled` (boolean, optional) — Whether automatic conversation-history summarization is enabled for this Agent Flow. The setting is ineffective for agent nodes whose memory is disabled.

**Example:**
```json
{
  "isEnabled": true
}
```

**Request Body (`ContentModerationCategoryConfig`):**
- `action` (string, required) — Action to take for this category. Allowed values: BLOCK, INFORM, MASK.
- `category` (string, required) — Content moderation category. Allowed values: HATE_SPEECH, HARASSMENT, VIOLENCE, SEXUAL, DEROGATORY, TOXIC.
- `isEnabled` (boolean, required) — Whether this category is enabled.
- `threshold` (number, required) — Threshold value for this category (0.0 to 1.0).

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
- `action` (string, required) — Action to take when policy is violated. Allowed values: BLOCK, INFORM, MASK.
- `categories` (array, optional) — Content moderation categories and their configurations.
- `policyDescription` (string, optional) — Description of the policy.
- `policyName` (string, optional) — Custom name for the policy.
- `policyType` (string, required) — Type of safety policy. Must be `CONTENT_MODERATION` for this variant.
- `scope` (string, required) — Scope of policy application. Allowed values: USER_REQUEST, AGENT_RESPONSE, BOTH.
- `threshold` (number, optional) — Threshold value for policy violation (0.0 to 1.0).

**Example:**
```json
{
  "action": "BLOCK",
  "categories": [],
  "policyDescription": "<string>",
  "policyName": "<string>",
  "policyType": "CONTENT_MODERATION",
  "scope": "USER_REQUEST",
  "threshold": 0
}
```

**Request Body (`CreateAgentDetails`):**
- `agentCardConfig` (object, optional) —
- `computeKey` (string, optional) — The key of the agent compute associated with this agent.
- `dependenciesFilePath` (string, optional) — The path to dependencies file.
- `description` (string, optional) — Agent description.
- `diagram` (object, optional) —
- `displayName` (string, required) — Agent name.
- `entryFilePath` (string, optional) — The path to project entry file.
- `guardrails` (object, optional) —
- `pathInfo` (string, required) — Path inside volume where the agent JSON is written.
- `sessionConfig` (object, optional) —
- `type` (string, optional) — The type of agent (Canvas or Code). Allowed values: CANVAS, CODE.

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
- `isCaseSensitive` (boolean, optional) — Whether the pattern is case sensitive.
- `maxDistance` (integer, optional) — Maximum distance for pattern matching.
- `name` (string, required) — Name of the custom rule.
- `pattern` (string, required) — Regex pattern for detection.
- `prefix` (string, optional) — Prefix pattern to match.
- `priority` (integer, optional) — Priority of this rule.
- `suffix` (string, optional) — Suffix pattern to match.

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
- `definition` (string, required) — Definition of the denied topic.
- `examples` (array, optional) — Examples of content that would violate this topic.
- `name` (string, required) — Name of the denied topic.

**Example:**
```json
{
  "definition": "<string>",
  "examples": [],
  "name": "<string>"
}
```

**Request Body (`DeniedTopicsPolicy`):**
- `action` (string, required) — Action to take when policy is violated. Allowed values: BLOCK, INFORM, MASK.
- `policyDescription` (string, optional) — Description of the policy.
- `policyName` (string, optional) — Custom name for the policy.
- `policyType` (string, required) — Type of safety policy. Must be `DENIED_TOPICS` for this variant.
- `scope` (string, required) — Scope of policy application. Allowed values: USER_REQUEST, AGENT_RESPONSE, BOTH.
- `threshold` (number, optional) — Threshold value for policy violation (0.0 to 1.0).
- `topics` (array, optional) — List of denied topics.

**Example:**
```json
{
  "action": "BLOCK",
  "policyDescription": "<string>",
  "policyName": "<string>",
  "policyType": "DENIED_TOPICS",
  "scope": "USER_REQUEST",
  "threshold": 0,
  "topics": []
}
```

**Request Body (`FileConfiguration`):**
- `isEnabled` (boolean, optional) — Overall preview/codegen gate for runtime session-file helper tools.
- `read` (object, optional) —
- `write` (object, optional) —

**Example:**
```json
{
  "isEnabled": true,
  "read": {},
  "write": {}
}
```

**Request Body (`FileReadConfiguration`):**
- `allowedFileTypes` (array, optional) — File type enum values accepted by the UI/runtime contract. Allowed values: pdf, txt, csv, json, ndjson, png, jpg, jpeg.
- `isEnabled` (boolean, optional) — Whether file read/upload configuration is enabled.
- `isPersistenceEnabled` (boolean, optional) — Whether uploaded files should be retained beyond the current request/session intent.
- `maxFileCount` (integer, optional) — Maximum number of active files allowed in a session. When omitted, Agent Service applies the five-file default; explicit values may raise the limit to twenty while the aggregate byte quota remains authoritative.
- `maxFileSizeMb` (integer, optional) — Requested maximum uploaded file size in megabytes. When omitted, Agent Service applies the 10 MiB default; explicit values may raise the per-file limit up to 50 MiB while the active session remains capped at 500 MiB.
- `retentionDays` (integer, optional) — Retention period in days for persisted files.
- `targetPath` (string, optional) — Canonical /Volumes/catalog/schema/volume path, optionally followed by safe folder segments, or a legacy relative volumeRef/workspaceFolder path where uploaded/readable files are stored or located for later runtime access.

**Example:**
```json
{
  "allowedFileTypes": [
    "pdf"
  ],
  "isEnabled": true,
  "isPersistenceEnabled": true,
  "maxFileCount": 0,
  "maxFileSizeMb": 0,
  "retentionDays": 0,
  "targetPath": "<string>"
}
```

**Request Body (`FileWriteConfiguration`):**
- `allowedFileTypes` (array, optional) — File type enum values allowed for generated/downloadable files. Allowed values: pdf, txt, csv, json, ndjson, png, jpg, jpeg.
- `downloadLinkExpiry` (string, optional) — Intended download link expiry behavior, for example session duration. Allowed values: SESSION_DURATION.
- `isDownloadToCatalogEnabled` (boolean, optional) — Whether generated/downloadable files should be written to AIDP Catalog or a configured volume.
- `isEnabled` (boolean, optional) — Whether file write/download configuration is enabled.
- `isPersistenceEnabled` (boolean, optional) — Whether generated/downloadable files should be retained beyond the current request/session intent.
- `maxFileSizeMb` (integer, optional) — Maximum generated/downloadable file size in megabytes.
- `retentionDays` (integer, optional) — Retention period in days for generated/downloadable files.
- `targetPath` (string, optional) — Canonical /Volumes/catalog/schema/volume path, optionally followed by safe folder segments, or a legacy relative volumeRef/workspaceFolder path where generated/downloadable files should be stored for retention or delivery.
- `visibility` (string, optional) — Intended file visibility for generated/downloadable files. Allowed values: END_USER_ONLY, DEVELOPER_ONLY, END_USER_AND_DEVELOPER.

**Example:**
```json
{
  "allowedFileTypes": [
    "pdf"
  ],
  "downloadLinkExpiry": "SESSION_DURATION",
  "isDownloadToCatalogEnabled": true,
  "isEnabled": true,
  "isPersistenceEnabled": true,
  "maxFileSizeMb": 0,
  "retentionDays": 0,
  "targetPath": "<string>",
  "visibility": "END_USER_ONLY"
}
```

**Request Body (`GuardrailsConfiguration`):**
- `description` (string, optional) — Description of the guardrails configuration
- `key` (string, optional) — The unique identifier (UUID) of the guardrails configuration.
- `name` (string, optional) — Name of the guardrails configuration
- `policies` (array, optional) — List of safety policies configured in this guardrails

**Example:**
```json
{
  "description": "<string>",
  "key": "<string>",
  "name": "<string>",
  "policies": []
}
```

**Request Body (`LlmConfig`):**
- `compartmentId` (string, optional) — The compartment id of the Large Language Model (LLM) to use in the Agent or Tool
- `endpointUrl` (string, optional) — The endpoint URL of the Large Language Model (LLM) to use in the Agent or Tool
- `modelId` (string, optional) — The unique identifier of the Large Language Model (LLM) to use in the Agent or Tool.
- `provider` (string, optional) — The OCI Generative AI provider name.
- `regionId` (string, optional) — The OCI Generative AI region ID.
- `type` (string, optional) — The type of the Large Language Model configuration.

**Example:**
```json
{
  "compartmentId": "<string>",
  "endpointUrl": "<string>",
  "modelId": "<string>",
  "provider": "<string>",
  "regionId": "<string>",
  "type": "<string>"
}
```

**Request Body (`LongTermMemoryConfiguration`):**
- `isEnabled` (boolean, optional) — UI-only authoring state for long-term memory. It is not sent to the deployed runtime.
- `llmConfig` (object, optional) —
- `shareBetweenChatThreads` (boolean, optional) — Whether long-term-memory retrieval can use memories saved in other chat threads for the same user and Agent Flow.

**Example:**
```json
{
  "isEnabled": true,
  "llmConfig": {},
  "shareBetweenChatThreads": true
}
```

**Request Body (`PiiCategory`):**
- `action` (string, required) — Action to take for this category. Allowed values: BLOCK, INFORM, MASK.
- `category` (string, required) — PII category name (e.g., PERSON, EMAIL, TELEPHONE_NUMBER). Allowed values: PERSON, ADDRESS, TELEPHONE_NUMBER, EMAIL.
- `isEnabled` (boolean, required) — Whether this category is enabled.
- `threshold` (number, optional) — Detection threshold for this category.

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
- `action` (string, required) — Action to take when policy is violated. Allowed values: BLOCK, INFORM, MASK.
- `customPiiRules` (array, optional) — Custom PII detection rules.
- `piiCategories` (array, optional) — List of PII categories to detect.
- `policyDescription` (string, optional) — Description of the policy.
- `policyName` (string, optional) — Custom name for the policy.
- `policyType` (string, required) — Type of safety policy. Must be `PII_DETECTION` for this variant.
- `scope` (string, required) — Scope of policy application. Allowed values: USER_REQUEST, AGENT_RESPONSE, BOTH.
- `threshold` (number, optional) — Threshold value for policy violation (0.0 to 1.0).

**Example:**
```json
{
  "action": "BLOCK",
  "customPiiRules": [],
  "piiCategories": [],
  "policyDescription": "<string>",
  "policyName": "<string>",
  "policyType": "PII_DETECTION",
  "scope": "USER_REQUEST",
  "threshold": 0
}
```

**Request Body (`PromptAttacksPreventionPolicy`):**
- `action` (string, required) — Action to take when policy is violated. Allowed values: BLOCK, INFORM, MASK.
- `policyDescription` (string, optional) — Description of the policy.
- `policyName` (string, optional) — Custom name for the policy.
- `policyType` (string, required) — Type of safety policy. Must be `PROMPT_ATTACKS_PREVENTION` for this variant.
- `scope` (string, required) — Scope of policy application. Allowed values: USER_REQUEST, AGENT_RESPONSE, BOTH.
- `threshold` (number, optional) — Threshold value for policy violation (0.0 to 1.0).

**Example:**
```json
{
  "action": "BLOCK",
  "policyDescription": "<string>",
  "policyName": "<string>",
  "policyType": "PROMPT_ATTACKS_PREVENTION",
  "scope": "USER_REQUEST",
  "threshold": 0
}
```

**Request Body (`SafetyPolicy`):**
- `action` (string, required) — Action to take when policy is violated. Allowed values: BLOCK, INFORM, MASK.
- `policyDescription` (string, optional) — Description of the policy.
- `policyName` (string, optional) — Custom name for the policy.
- `policyType` (string, required) — Type of safety policy. Allowed values: CONTENT_MODERATION, PROMPT_ATTACKS_PREVENTION, PII_DETECTION, DENIED_TOPICS, WORD_FILTERS, CONTEXTUAL_GROUNDING, CUSTOM_POLICY.
- `scope` (string, required) — Scope of policy application. Allowed values: USER_REQUEST, AGENT_RESPONSE, BOTH.
- `threshold` (number, optional) — Threshold value for policy violation (0.0 to 1.0).

**Variants** (selected by `policyType`):
- `PII_DETECTION` → `PiiDetectionPolicy`
- `DENIED_TOPICS` → `DeniedTopicsPolicy`
- `CONTENT_MODERATION` → `ContentModerationPolicy`
- `WORD_FILTERS` → `WordFiltersPolicy`
- `PROMPT_ATTACKS_PREVENTION` → `PromptAttacksPreventionPolicy`

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
- `automaticSummarizationConfig` (object, optional) —
- `fileConfig` (object, optional) —
- `longTermMemoryConfig` (object, optional) —
- `sessionRetentionConfig` (object, optional) —
- `variables` (object, optional) — Map of session variable name to variable definition.

**Example:**
```json
{
  "automaticSummarizationConfig": {},
  "fileConfig": {},
  "longTermMemoryConfig": {},
  "sessionRetentionConfig": {},
  "variables": {}
}
```

**Request Body (`SessionRetentionConfiguration`):**
- `breachAction` (string, optional) — Action taken when the enabled retention condition is breached. Allowed values: DELETE_FIFO.
- `isRetentionPolicyEnabled` (boolean, optional) — Whether session-message retention is enabled.
- `retentionPeriodInDays` (integer, optional) — No. of days session data will be kept
- `sessionSizeLimit` (integer, optional) — Max storage allocated to session data (in MB).
- `threadCountLimit` (integer, optional) — Maximum no. of user prompt and agent response pairs per session

**Example:**
```json
{
  "breachAction": "DELETE_FIFO",
  "isRetentionPolicyEnabled": true,
  "retentionPeriodInDays": 0,
  "sessionSizeLimit": 0,
  "threadCountLimit": 0
}
```

**Request Body (`WordFiltersPolicy`):**
- `action` (string, required) — Action to take when policy is violated. Allowed values: BLOCK, INFORM, MASK.
- `policyDescription` (string, optional) — Description of the policy.
- `policyName` (string, optional) — Custom name for the policy.
- `policyType` (string, required) — Type of safety policy. Must be `WORD_FILTERS` for this variant.
- `regexPatterns` (array, optional) — List of regex patterns to filter.
- `scope` (string, required) — Scope of policy application. Allowed values: USER_REQUEST, AGENT_RESPONSE, BOTH.
- `threshold` (number, optional) — Threshold value for policy violation (0.0 to 1.0).
- `words` (array, optional) — List of banned words or regex patterns.

**Example:**
```json
{
  "action": "BLOCK",
  "policyDescription": "<string>",
  "policyName": "<string>",
  "policyType": "WORD_FILTERS",
  "regexPatterns": [],
  "scope": "USER_REQUEST",
  "threshold": 0,
  "words": []
}
```
---
**Return:** [Back to Agent](#agent) • [Top](#top)

#### `aidp agent delete`
<a id="agent-delete"></a>
Delete an agent from the schema.

**Usage:**

`aidp agent delete <WORKSPACE-KEY> <AGENT-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `agent-key` (string, required) — The UUID of the agent.
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---
**Return:** [Back to Agent](#agent) • [Top](#top)

#### `aidp agent delete-deployment`
<a id="agent-delete-deployment"></a>
Deletes an agent deployment.

**Usage:**

`aidp agent delete-deployment <WORKSPACE-KEY> <AGENT-KEY> <AGENT-DEPLOYMENT-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `agent-key` (string, required) — The UUID of the agent.
- `agent-deployment-key` (string, required) — The UUID of the agent deployment.
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Agent](#agent) • [Top](#top)

#### `aidp agent delete-session`
<a id="agent-delete-session"></a>
Deletes an agent Session.

**Usage:**

`aidp agent delete-session <WORKSPACE-KEY> <AGENT-KEY> <SESSION-ID> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `agent-key` (string, required) — The UUID of the agent.
- `session-id` (string, required) — The UUID of the agent session.
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
---
**Return:** [Back to Agent](#agent) • [Top](#top)

#### `aidp agent deploy`
<a id="agent-deploy"></a>
Deploys a specified agent.

**Usage:**

`aidp agent deploy <WORKSPACE-KEY> <AGENT-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `agent-key` (string, required) — The UUID of the agent.
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`DeployAgentDetails`):**
- `agentComputeKey` (string, optional) — The Agent Compute Key where client can run or test the agent.
- `agentKey` (string, required) — The Agent key for which the session is started.
- `description` (string, optional) — deployment description.
- `displayName` (string, optional) — Display name.
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
- `audienceClaim` (array, optional) — List of Audience Claim of OAuthConfiguration
- `issuerClaim` (string, optional) — Issuer Claim of OAuthConfiguration
- `jwksUri` (string, optional) — JWKS URI of OAuthConfiguration

**Example:**
```json
{
  "audienceClaim": [],
  "issuerClaim": "<string>",
  "jwksUri": "<string>"
}
```

**Request Body (`SessionRetentionConfiguration`):**
- `breachAction` (string, optional) — Action taken when the enabled retention condition is breached. Allowed values: DELETE_FIFO.
- `isRetentionPolicyEnabled` (boolean, optional) — Whether session-message retention is enabled.
- `retentionPeriodInDays` (integer, optional) — No. of days session data will be kept
- `sessionSizeLimit` (integer, optional) — Max storage allocated to session data (in MB).
- `threadCountLimit` (integer, optional) — Maximum no. of user prompt and agent response pairs per session

**Example:**
```json
{
  "breachAction": "DELETE_FIFO",
  "isRetentionPolicyEnabled": true,
  "retentionPeriodInDays": 0,
  "sessionSizeLimit": 0,
  "threadCountLimit": 0
}
```
---
**Return:** [Back to Agent](#agent) • [Top](#top)

#### `aidp agent get`
<a id="agent-get"></a>
Returns detailed information about an agent.

**Usage:**

`aidp agent get <WORKSPACE-KEY> <AGENT-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `agent-key` (string, required) — The UUID of the agent.
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---
**Return:** [Back to Agent](#agent) • [Top](#top)

#### `aidp agent get-deployment`
<a id="agent-get-deployment"></a>
Returns detailed information about an agent deployment.

**Usage:**

`aidp agent get-deployment <WORKSPACE-KEY> <AGENT-KEY> <AGENT-DEPLOYMENT-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `agent-key` (string, required) — The UUID of the agent.
- `agent-deployment-key` (string, required) — The UUID of the agent deployment.
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Agent](#agent) • [Top](#top)

#### `aidp agent get-session`
<a id="agent-get-session"></a>
Returns detailed information about an agent session.

**Usage:**

`aidp agent get-session <WORKSPACE-KEY> <AGENT-KEY> <SESSION-ID> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `agent-key` (string, required) — The UUID of the agent.
- `session-id` (string, required) — The UUID of the agent session.
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Agent](#agent) • [Top](#top)

#### `aidp agent get-session-trace`
<a id="agent-get-session-trace"></a>
Returns trace details for a given message key.

**Usage:**

`aidp agent get-session-trace <WORKSPACE-KEY> <AGENT-KEY> <SESSION-ID> <TRACE-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `agent-key` (string, required) — The UUID of the agent.
- `session-id` (string, required) — The UUID of the agent session.
- `trace-key` (string, required) — A filter to return only resources that match the given display trace key exactly.
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Agent](#agent) • [Top](#top)

#### `aidp agent list`
<a id="agent-list"></a>
Returns a list of agents in a schema.

**Usage:**

`aidp agent list <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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
Returns a list of all deployments of an agent.

**Usage:**

`aidp agent list-deployments <WORKSPACE-KEY> <AGENT-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `agent-key` (string, required) — The UUID of the agent.
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
Returns a list of permissions for a given agent.

**Usage:**

`aidp agent list-permissions <WORKSPACE-KEY> <AGENT-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `agent-key` (string, required) — The UUID of the agent.
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
Returns list of agent session chat messages.

**Usage:**

`aidp agent list-session-chat-histories <WORKSPACE-KEY> <AGENT-KEY> <SESSION-ID> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `agent-key` (string, required) — The UUID of the agent.
- `session-id` (string, required) — The UUID of the agent session.
**Options:**
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Agent](#agent) • [Top](#top)

#### `aidp agent list-sessions`
<a id="agent-list-sessions"></a>
Returns a list of testing sessions of an agent.

**Usage:**

`aidp agent list-sessions <WORKSPACE-KEY> <AGENT-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `agent-key` (string, required) — The UUID of the agent.
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
Update the permissions for a given agent.

**Usage:**

`aidp agent manage-permission <WORKSPACE-KEY> <AGENT-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `agent-key` (string, required) — The UUID of the agent.
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`AssignAgentPermissionDetails`):**
- `assignees` (object, required) —
- `excludeColumns` (array, required) — The list of columns to be excluded for the assigning of permissions
- `includeColumns` (array, required) — The list of columns to be included for the assigning of permissions
- `permissions` (array, required) — The permissions assigned to the assignees. Allowed values: READ, MANAGE, ADMIN, USE.

**Example:**
```json
{
  "assignees": {},
  "excludeColumns": [],
  "includeColumns": [],
  "permissions": [
    "READ"
  ]
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
- `targets` (array, required) — The names/ocids of the users, groups or roles.
- `type` (string, required) — Grantee type. Allowed values: USER, ROLE, GROUP.

**Example:**
```json
{
  "targets": [],
  "type": "USER"
}
```

**Request Body (`RevokeAgentPermissionDetails`):**
- `assignees` (object, required) —
- `excludeColumns` (array, required) — The list of columns to be excluded for the revoking of permissions.
- `includeColumns` (array, required) — The list of columns to be included for the revoking of permissions.
- `permissions` (array, required) — The permissions revoked from the assignee. Allowed values: READ, MANAGE, ADMIN, USE.

**Example:**
```json
{
  "assignees": {},
  "excludeColumns": [],
  "includeColumns": [],
  "permissions": [
    "READ"
  ]
}
```
---
**Return:** [Back to Agent](#agent) • [Top](#top)

#### `aidp agent preview-agent-agent-card`
<a id="agent-preview-agent-agent-card"></a>
Returns the agent card based on the given agent card configuration.

**Usage:**

`aidp agent preview-agent-agent-card <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`AgentCardCapabilitiesDetail`):**
- `isStreaming` (boolean, optional) — Indicates whether streaming responses are supported.

**Example:**
```json
{
  "isStreaming": true
}
```

**Request Body (`AgentCardConfigDetail`):**
- `capabilities` (object, optional) —
- `description` (string, optional) — Human-readable agent description.
- `documentationUrl` (string, optional) — Documentation URL for the agent. Serialized as `documentation_url`.
- `name` (string, required) — Human-readable agent name.
- `provider` (object, optional) —
- `skills` (array, optional) — List of skills supported by the agent.
- `version` (string, optional) — Agent version string.

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
- `description` (string, optional) — Description of what the skill does.
- `examples` (array, optional) — Optional example prompts for this skill.
- `id` (string, required) — Unique skill identifier.
- `name` (string, required) — Display name of the skill.
- `tags` (array, optional) — Optional tags for categorization/search.

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
- `organization` (string, optional) — The name of the agent provider's organization.
- `url` (string, optional) — A URL for the agent provider's website or documentation.

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
Redeploys an agent.

**Usage:**

`aidp agent redeploy-agent-by-key <WORKSPACE-KEY> <AGENT-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `agent-key` (string, required) — The UUID of the agent.
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`OAuthConfiguration`):**
- `audienceClaim` (array, optional) — List of Audience Claim of OAuthConfiguration
- `issuerClaim` (string, optional) — Issuer Claim of OAuthConfiguration
- `jwksUri` (string, optional) — JWKS URI of OAuthConfiguration

**Example:**
```json
{
  "audienceClaim": [],
  "issuerClaim": "<string>",
  "jwksUri": "<string>"
}
```

**Request Body (`UpdateAgentDeploymentDetails`):**
- `agentComputeKey` (string, optional) — The Agent Compute Key where client can run or test the agent.
- `agentKey` (string, required) — The Agent key for which the session is started.
- `description` (string, optional) — deployment description.
- `displayName` (string, optional) — Display name.
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
Updates an agent with provided details.

**Usage:**

`aidp agent update <WORKSPACE-KEY> <AGENT-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `agent-key` (string, required) — The UUID of the agent.
**Options:**
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`AgentCardCapabilitiesDetail`):**
- `isStreaming` (boolean, optional) — Indicates whether streaming responses are supported.

**Example:**
```json
{
  "isStreaming": true
}
```

**Request Body (`AgentCardConfigDetail`):**
- `capabilities` (object, optional) —
- `description` (string, optional) — Human-readable agent description.
- `documentationUrl` (string, optional) — Documentation URL for the agent. Serialized as `documentation_url`.
- `name` (string, required) — Human-readable agent name.
- `provider` (object, optional) —
- `skills` (array, optional) — List of skills supported by the agent.
- `version` (string, optional) — Agent version string.

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
- `description` (string, optional) — Description of what the skill does.
- `examples` (array, optional) — Optional example prompts for this skill.
- `id` (string, required) — Unique skill identifier.
- `name` (string, required) — Display name of the skill.
- `tags` (array, optional) — Optional tags for categorization/search.

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
- `description` (string, optional) — Agent description.
- `displayName` (string, optional) — Agent name.
- `edges` (object, optional) — Mapping of edgeId to edge objects.
- `guardrailsMap` (object, optional) — A hash map with key=guardrails config key, value=guardrails definition. It is used to find the guardrails definition for a guardrails reference by name.
- `key` (string, optional) — The unique identifier (UUID) of the agent.
- `modelVersion` (string, optional) — The model and upgrade compatibility version for this agent diagram.
- `nodes` (object, optional) — Mapping of nodeId to node objects.
- `toolsMap` (object, optional) — A hash map with key=tool key, value=tool definition. It is used to find the tool definition for a tool reference, where the tool is marked as a reference.

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
- `organization` (string, optional) — The name of the agent provider's organization.
- `url` (string, optional) — A URL for the agent provider's website or documentation.

**Example:**
```json
{
  "organization": "<string>",
  "url": "<string>"
}
```

**Request Body (`AutomaticSummarizationConfiguration`):**
- `isEnabled` (boolean, optional) — Whether automatic conversation-history summarization is enabled for this Agent Flow. The setting is ineffective for agent nodes whose memory is disabled.

**Example:**
```json
{
  "isEnabled": true
}
```

**Request Body (`ContentModerationCategoryConfig`):**
- `action` (string, required) — Action to take for this category. Allowed values: BLOCK, INFORM, MASK.
- `category` (string, required) — Content moderation category. Allowed values: HATE_SPEECH, HARASSMENT, VIOLENCE, SEXUAL, DEROGATORY, TOXIC.
- `isEnabled` (boolean, required) — Whether this category is enabled.
- `threshold` (number, required) — Threshold value for this category (0.0 to 1.0).

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
- `action` (string, required) — Action to take when policy is violated. Allowed values: BLOCK, INFORM, MASK.
- `categories` (array, optional) — Content moderation categories and their configurations.
- `policyDescription` (string, optional) — Description of the policy.
- `policyName` (string, optional) — Custom name for the policy.
- `policyType` (string, required) — Type of safety policy. Must be `CONTENT_MODERATION` for this variant.
- `scope` (string, required) — Scope of policy application. Allowed values: USER_REQUEST, AGENT_RESPONSE, BOTH.
- `threshold` (number, optional) — Threshold value for policy violation (0.0 to 1.0).

**Example:**
```json
{
  "action": "BLOCK",
  "categories": [],
  "policyDescription": "<string>",
  "policyName": "<string>",
  "policyType": "CONTENT_MODERATION",
  "scope": "USER_REQUEST",
  "threshold": 0
}
```

**Request Body (`CustomPiiRule`):**
- `isCaseSensitive` (boolean, optional) — Whether the pattern is case sensitive.
- `maxDistance` (integer, optional) — Maximum distance for pattern matching.
- `name` (string, required) — Name of the custom rule.
- `pattern` (string, required) — Regex pattern for detection.
- `prefix` (string, optional) — Prefix pattern to match.
- `priority` (integer, optional) — Priority of this rule.
- `suffix` (string, optional) — Suffix pattern to match.

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
- `definition` (string, required) — Definition of the denied topic.
- `examples` (array, optional) — Examples of content that would violate this topic.
- `name` (string, required) — Name of the denied topic.

**Example:**
```json
{
  "definition": "<string>",
  "examples": [],
  "name": "<string>"
}
```

**Request Body (`DeniedTopicsPolicy`):**
- `action` (string, required) — Action to take when policy is violated. Allowed values: BLOCK, INFORM, MASK.
- `policyDescription` (string, optional) — Description of the policy.
- `policyName` (string, optional) — Custom name for the policy.
- `policyType` (string, required) — Type of safety policy. Must be `DENIED_TOPICS` for this variant.
- `scope` (string, required) — Scope of policy application. Allowed values: USER_REQUEST, AGENT_RESPONSE, BOTH.
- `threshold` (number, optional) — Threshold value for policy violation (0.0 to 1.0).
- `topics` (array, optional) — List of denied topics.

**Example:**
```json
{
  "action": "BLOCK",
  "policyDescription": "<string>",
  "policyName": "<string>",
  "policyType": "DENIED_TOPICS",
  "scope": "USER_REQUEST",
  "threshold": 0,
  "topics": []
}
```

**Request Body (`FileConfiguration`):**
- `isEnabled` (boolean, optional) — Overall preview/codegen gate for runtime session-file helper tools.
- `read` (object, optional) —
- `write` (object, optional) —

**Example:**
```json
{
  "isEnabled": true,
  "read": {},
  "write": {}
}
```

**Request Body (`FileReadConfiguration`):**
- `allowedFileTypes` (array, optional) — File type enum values accepted by the UI/runtime contract. Allowed values: pdf, txt, csv, json, ndjson, png, jpg, jpeg.
- `isEnabled` (boolean, optional) — Whether file read/upload configuration is enabled.
- `isPersistenceEnabled` (boolean, optional) — Whether uploaded files should be retained beyond the current request/session intent.
- `maxFileCount` (integer, optional) — Maximum number of active files allowed in a session. When omitted, Agent Service applies the five-file default; explicit values may raise the limit to twenty while the aggregate byte quota remains authoritative.
- `maxFileSizeMb` (integer, optional) — Requested maximum uploaded file size in megabytes. When omitted, Agent Service applies the 10 MiB default; explicit values may raise the per-file limit up to 50 MiB while the active session remains capped at 500 MiB.
- `retentionDays` (integer, optional) — Retention period in days for persisted files.
- `targetPath` (string, optional) — Canonical /Volumes/catalog/schema/volume path, optionally followed by safe folder segments, or a legacy relative volumeRef/workspaceFolder path where uploaded/readable files are stored or located for later runtime access.

**Example:**
```json
{
  "allowedFileTypes": [
    "pdf"
  ],
  "isEnabled": true,
  "isPersistenceEnabled": true,
  "maxFileCount": 0,
  "maxFileSizeMb": 0,
  "retentionDays": 0,
  "targetPath": "<string>"
}
```

**Request Body (`FileWriteConfiguration`):**
- `allowedFileTypes` (array, optional) — File type enum values allowed for generated/downloadable files. Allowed values: pdf, txt, csv, json, ndjson, png, jpg, jpeg.
- `downloadLinkExpiry` (string, optional) — Intended download link expiry behavior, for example session duration. Allowed values: SESSION_DURATION.
- `isDownloadToCatalogEnabled` (boolean, optional) — Whether generated/downloadable files should be written to AIDP Catalog or a configured volume.
- `isEnabled` (boolean, optional) — Whether file write/download configuration is enabled.
- `isPersistenceEnabled` (boolean, optional) — Whether generated/downloadable files should be retained beyond the current request/session intent.
- `maxFileSizeMb` (integer, optional) — Maximum generated/downloadable file size in megabytes.
- `retentionDays` (integer, optional) — Retention period in days for generated/downloadable files.
- `targetPath` (string, optional) — Canonical /Volumes/catalog/schema/volume path, optionally followed by safe folder segments, or a legacy relative volumeRef/workspaceFolder path where generated/downloadable files should be stored for retention or delivery.
- `visibility` (string, optional) — Intended file visibility for generated/downloadable files. Allowed values: END_USER_ONLY, DEVELOPER_ONLY, END_USER_AND_DEVELOPER.

**Example:**
```json
{
  "allowedFileTypes": [
    "pdf"
  ],
  "downloadLinkExpiry": "SESSION_DURATION",
  "isDownloadToCatalogEnabled": true,
  "isEnabled": true,
  "isPersistenceEnabled": true,
  "maxFileSizeMb": 0,
  "retentionDays": 0,
  "targetPath": "<string>",
  "visibility": "END_USER_ONLY"
}
```

**Request Body (`GuardrailsConfiguration`):**
- `description` (string, optional) — Description of the guardrails configuration
- `key` (string, optional) — The unique identifier (UUID) of the guardrails configuration.
- `name` (string, optional) — Name of the guardrails configuration
- `policies` (array, optional) — List of safety policies configured in this guardrails

**Example:**
```json
{
  "description": "<string>",
  "key": "<string>",
  "name": "<string>",
  "policies": []
}
```

**Request Body (`LlmConfig`):**
- `compartmentId` (string, optional) — The compartment id of the Large Language Model (LLM) to use in the Agent or Tool
- `endpointUrl` (string, optional) — The endpoint URL of the Large Language Model (LLM) to use in the Agent or Tool
- `modelId` (string, optional) — The unique identifier of the Large Language Model (LLM) to use in the Agent or Tool.
- `provider` (string, optional) — The OCI Generative AI provider name.
- `regionId` (string, optional) — The OCI Generative AI region ID.
- `type` (string, optional) — The type of the Large Language Model configuration.

**Example:**
```json
{
  "compartmentId": "<string>",
  "endpointUrl": "<string>",
  "modelId": "<string>",
  "provider": "<string>",
  "regionId": "<string>",
  "type": "<string>"
}
```

**Request Body (`LongTermMemoryConfiguration`):**
- `isEnabled` (boolean, optional) — UI-only authoring state for long-term memory. It is not sent to the deployed runtime.
- `llmConfig` (object, optional) —
- `shareBetweenChatThreads` (boolean, optional) — Whether long-term-memory retrieval can use memories saved in other chat threads for the same user and Agent Flow.

**Example:**
```json
{
  "isEnabled": true,
  "llmConfig": {},
  "shareBetweenChatThreads": true
}
```

**Request Body (`PiiCategory`):**
- `action` (string, required) — Action to take for this category. Allowed values: BLOCK, INFORM, MASK.
- `category` (string, required) — PII category name (e.g., PERSON, EMAIL, TELEPHONE_NUMBER). Allowed values: PERSON, ADDRESS, TELEPHONE_NUMBER, EMAIL.
- `isEnabled` (boolean, required) — Whether this category is enabled.
- `threshold` (number, optional) — Detection threshold for this category.

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
- `action` (string, required) — Action to take when policy is violated. Allowed values: BLOCK, INFORM, MASK.
- `customPiiRules` (array, optional) — Custom PII detection rules.
- `piiCategories` (array, optional) — List of PII categories to detect.
- `policyDescription` (string, optional) — Description of the policy.
- `policyName` (string, optional) — Custom name for the policy.
- `policyType` (string, required) — Type of safety policy. Must be `PII_DETECTION` for this variant.
- `scope` (string, required) — Scope of policy application. Allowed values: USER_REQUEST, AGENT_RESPONSE, BOTH.
- `threshold` (number, optional) — Threshold value for policy violation (0.0 to 1.0).

**Example:**
```json
{
  "action": "BLOCK",
  "customPiiRules": [],
  "piiCategories": [],
  "policyDescription": "<string>",
  "policyName": "<string>",
  "policyType": "PII_DETECTION",
  "scope": "USER_REQUEST",
  "threshold": 0
}
```

**Request Body (`PromptAttacksPreventionPolicy`):**
- `action` (string, required) — Action to take when policy is violated. Allowed values: BLOCK, INFORM, MASK.
- `policyDescription` (string, optional) — Description of the policy.
- `policyName` (string, optional) — Custom name for the policy.
- `policyType` (string, required) — Type of safety policy. Must be `PROMPT_ATTACKS_PREVENTION` for this variant.
- `scope` (string, required) — Scope of policy application. Allowed values: USER_REQUEST, AGENT_RESPONSE, BOTH.
- `threshold` (number, optional) — Threshold value for policy violation (0.0 to 1.0).

**Example:**
```json
{
  "action": "BLOCK",
  "policyDescription": "<string>",
  "policyName": "<string>",
  "policyType": "PROMPT_ATTACKS_PREVENTION",
  "scope": "USER_REQUEST",
  "threshold": 0
}
```

**Request Body (`SafetyPolicy`):**
- `action` (string, required) — Action to take when policy is violated. Allowed values: BLOCK, INFORM, MASK.
- `policyDescription` (string, optional) — Description of the policy.
- `policyName` (string, optional) — Custom name for the policy.
- `policyType` (string, required) — Type of safety policy. Allowed values: CONTENT_MODERATION, PROMPT_ATTACKS_PREVENTION, PII_DETECTION, DENIED_TOPICS, WORD_FILTERS, CONTEXTUAL_GROUNDING, CUSTOM_POLICY.
- `scope` (string, required) — Scope of policy application. Allowed values: USER_REQUEST, AGENT_RESPONSE, BOTH.
- `threshold` (number, optional) — Threshold value for policy violation (0.0 to 1.0).

**Variants** (selected by `policyType`):
- `PII_DETECTION` → `PiiDetectionPolicy`
- `DENIED_TOPICS` → `DeniedTopicsPolicy`
- `CONTENT_MODERATION` → `ContentModerationPolicy`
- `WORD_FILTERS` → `WordFiltersPolicy`
- `PROMPT_ATTACKS_PREVENTION` → `PromptAttacksPreventionPolicy`

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
- `automaticSummarizationConfig` (object, optional) —
- `fileConfig` (object, optional) —
- `longTermMemoryConfig` (object, optional) —
- `sessionRetentionConfig` (object, optional) —
- `variables` (object, optional) — Map of session variable name to variable definition.

**Example:**
```json
{
  "automaticSummarizationConfig": {},
  "fileConfig": {},
  "longTermMemoryConfig": {},
  "sessionRetentionConfig": {},
  "variables": {}
}
```

**Request Body (`SessionRetentionConfiguration`):**
- `breachAction` (string, optional) — Action taken when the enabled retention condition is breached. Allowed values: DELETE_FIFO.
- `isRetentionPolicyEnabled` (boolean, optional) — Whether session-message retention is enabled.
- `retentionPeriodInDays` (integer, optional) — No. of days session data will be kept
- `sessionSizeLimit` (integer, optional) — Max storage allocated to session data (in MB).
- `threadCountLimit` (integer, optional) — Maximum no. of user prompt and agent response pairs per session

**Example:**
```json
{
  "breachAction": "DELETE_FIFO",
  "isRetentionPolicyEnabled": true,
  "retentionPeriodInDays": 0,
  "sessionSizeLimit": 0,
  "threadCountLimit": 0
}
```

**Request Body (`UpdateAgentDetails`):**
- `addedNodes` (array, optional) — List of node keys that were newly added to the agent diagram.
- `agentCardConfig` (object, optional) —
- `computeKey` (string, optional) — The key of the agent compute associated with this agent.
- `deletedNodes` (array, optional) — List of node keys that were removed from the agent diagram.
- `dependenciesFilePath` (string, optional) — The path to dependencies file.
- `description` (string, optional) — Agent description.
- `diagram` (object, optional) —
- `displayName` (string, optional) — Agent name.
- `entryFilePath` (string, optional) — The path to project entry file.
- `guardrails` (object, optional) —
- `sessionConfig` (object, optional) —
- `updatedNodes` (array, optional) — List of node keys that were updated in the agent diagram.

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
- `action` (string, required) — Action to take when policy is violated. Allowed values: BLOCK, INFORM, MASK.
- `policyDescription` (string, optional) — Description of the policy.
- `policyName` (string, optional) — Custom name for the policy.
- `policyType` (string, required) — Type of safety policy. Must be `WORD_FILTERS` for this variant.
- `regexPatterns` (array, optional) — List of regex patterns to filter.
- `scope` (string, required) — Scope of policy application. Allowed values: USER_REQUEST, AGENT_RESPONSE, BOTH.
- `threshold` (number, optional) — Threshold value for policy violation (0.0 to 1.0).
- `words` (array, optional) — List of banned words or regex patterns.

**Example:**
```json
{
  "action": "BLOCK",
  "policyDescription": "<string>",
  "policyName": "<string>",
  "policyType": "WORD_FILTERS",
  "regexPatterns": [],
  "scope": "USER_REQUEST",
  "threshold": 0,
  "words": []
}
```
---
**Return:** [Back to Agent](#agent) • [Top](#top)

#### `aidp agent update-deployment-metadata`
<a id="agent-update-deployment-metadata"></a>
Updates the deployment metadata for an agent.

**Usage:**

`aidp agent update-deployment-metadata <WORKSPACE-KEY> <AGENT-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `agent-key` (string, required) — The UUID of the agent.
**Options:**
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.

**Request Body (`AgentCardCapabilitiesDetail`):**
- `isStreaming` (boolean, optional) — Indicates whether streaming responses are supported.

**Example:**
```json
{
  "isStreaming": true
}
```

**Request Body (`AgentCardConfigDetail`):**
- `capabilities` (object, optional) —
- `description` (string, optional) — Human-readable agent description.
- `documentationUrl` (string, optional) — Documentation URL for the agent. Serialized as `documentation_url`.
- `name` (string, required) — Human-readable agent name.
- `provider` (object, optional) —
- `skills` (array, optional) — List of skills supported by the agent.
- `version` (string, optional) — Agent version string.

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
- `description` (string, optional) — Description of what the skill does.
- `examples` (array, optional) — Optional example prompts for this skill.
- `id` (string, required) — Unique skill identifier.
- `name` (string, required) — Display name of the skill.
- `tags` (array, optional) — Optional tags for categorization/search.

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
- `organization` (string, optional) — The name of the agent provider's organization.
- `url` (string, optional) — A URL for the agent provider's website or documentation.

**Example:**
```json
{
  "organization": "<string>",
  "url": "<string>"
}
```

**Request Body (`UpdateAgentDeploymentMetadataDetails`):**
- `agentCardConfigDetail` (object, optional) —
- `deploymentKey` (string, optional) — Deployment Id on Agent Service
- `updateAgentFlowAgentCardConfig` (boolean, optional) — Whether to update the Agent Flow's stored agent card config after deployment metadata is updated.

**Example:**
```json
{
  "agentCardConfigDetail": {},
  "deploymentKey": "<string>",
  "updateAgentFlowAgentCardConfig": true
}
```
---
**Return:** [Back to Agent](#agent) • [Top](#top)

#### `aidp agent validate-agent`
<a id="agent-validate-agent"></a>
Validates the agent JSON diagram generated by UI.

**Usage:**

`aidp agent validate-agent <WORKSPACE-KEY> <AGENT-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `agent-key` (string, required) — The UUID of the agent.
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---
**Return:** [Back to Agent](#agent) • [Top](#top)

## <a id="async-operations"></a>Async Operations
Async operations.
**Command Index:**
- [async-operations cancel](#async-operations-cancel)
- [async-operations get](#async-operations-get)
- [async-operations list](#async-operations-list)
### Commands

#### `aidp async-operations cancel`
<a id="async-operations-cancel"></a>
Cancels a supported asynchronous operation created by the caller.
Cancels a supported asynchronous operation created by the caller. Support depends on the operation type and its current state.

**Usage:**

`aidp async-operations cancel <ASYNC-OPERATION-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `async-operation-key` (string, required) — The unique identifier of an async operation
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Async-Operations](#async-operations) • [Top](#top)

#### `aidp async-operations get`
<a id="async-operations-get"></a>
Get detailed information for a particular async operation.
Get detailed information for a particular async operation

**Usage:**

`aidp async-operations get <ASYNC-OPERATION-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp async-operations list --instance-id <AI-DATA-PLATFORM-ID>`

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

`aidp audit manage-logs --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`ManageAuditLogsDetails`):**
- `action` (string, optional) — Action to enable or disable the logs. Allowed values: ENABLE, DISABLE.
- `retentionPeriod` (integer, optional) — Retention period of the audit logs.

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

`aidp audit search-logs --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`SearchAuditLogsDetails`):**
- `objectName` (string, optional) — Name of the object.
- `objectType` (string, optional) — Type of object. Allowed values: DATA_LAKE, ROLE, CATALOG, SCHEMA, TABLE, VOLUME, VIEW, WORKSPACE, WORKSPACE_FILE, WORKSPACE_FOLDER, COMPUTE, FOLDER, FILE, AUTO_POPULATE, VOLUME_FILE, VOLUME_FOLDER, KNOWLEDGE_BASE, KNOWLEDGE_BASE_JOB, KNOWLEDGE_BASE_JOB_RUN, KNOWLEDGE_BASE_OWNERSHIP, VECTOR_STORE_CREDENTIALS, AUDIT_LOG, WORKFLOW, CREDENTIAL, AGENT.
- `operation` (string, optional) — Type of operation. Allowed values: CREATE, UPDATE, DELETE, VIEW, GRANT, REVOKE, ATTACH, DETACH, VIEW_LOGS, RENAME, TERMINATE, MOVE, EXECUTE, MANAGE_ACCESS, QUERY, SQL_STATEMENT, MANAGE, READ, WRITE, START, STOP, COPY, DEPLOY, UNDEPLOY.
- `query` (string, optional) — Query to search the log.
- `sortBy` (string, optional) — The field to sort by. Allowed values: startedBy, status, operation, objectType, objectName, time.
- `sortOrder` (string, optional) — Sort order for search results. Allowed values: ASC, DESC.
- `startedBy` (string, optional) — Operation started by.
- `status` (string, optional) — Status of log. Allowed values: SUCCEEDED, FAILED.
- `timeBegin` (datetime, optional) — Start time of the logs.
- `timeEnd` (datetime, optional) — End time of the logs.

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
- [bundle fetch-publish-status-action](#bundle-fetch-publish-status-action)
- [bundle publish-bundle-action](#bundle-publish-bundle-action)
- [bundle purge](#bundle-purge)
- [bundle purge-action](#bundle-purge-action)
- [bundle sync-bundle](#bundle-sync-bundle)
- [bundle sync-bundle-action](#bundle-sync-bundle-action)
### Commands

#### `aidp bundle create`
<a id="bundle-create"></a>
(Deprecated).
(Deprecated)

**Usage:**

`aidp bundle create <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`BundledResource`):**
- `resourceKey` (string, required) — Workspace unique key for the resource.
- `resourceType` (string, required) — Type of resource (job or agentflow). Allowed values: JOB, AGENTFLOW.

**Example:**
```json
{
  "resourceKey": "<string>",
  "resourceType": "JOB"
}
```

**Request Body (`CreateBundleDetails`):**
- `bundledResources` (array, optional) — List of workspace resource descriptors (jobs, agentflows) to be included. Each has minimally resourceType and resourceKey.
- `description` (string, optional) — Description for the bundle.
- `name` (string, required) — Name for the new bundle.
- `path` (string, required) — Target folder for the new bundle.

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
(Preview) Creates a new bundle. This operation is asynchronous. The service validates the request, starts bundle creation, and returns an async operation key in the response headers. Use the async operation APIs to track completion. Typical use cases: - capture selected workspace resources into a version-controlled bundle - prepare a bundle for later deployment or promotion - establish a bundle root that can later be inspected, updated, or deployed Request notes: - path identifies the parent folder in the workspace volume where the bundle should be created - name identifies the bundle folder name - bundledResources identifies which workspace resources should be included

**Usage:**

`aidp bundle create-action <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`BundledResource`):**
- `resourceKey` (string, required) — Workspace unique key for the resource.
- `resourceType` (string, required) — Type of resource (job or agentflow). Allowed values: JOB, AGENTFLOW.

**Example:**
```json
{
  "resourceKey": "<string>",
  "resourceType": "JOB"
}
```

**Request Body (`CreateBundleDetails`):**
- `bundledResources` (array, optional) — List of workspace resource descriptors (jobs, agentflows) to be included. Each has minimally resourceType and resourceKey.
- `description` (string, optional) — Description for the bundle.
- `name` (string, required) — Name for the new bundle.
- `path` (string, required) — Target folder for the new bundle.

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
(Deprecated).
(Deprecated)

**Usage:**

`aidp bundle deploy <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`DeployBundleDetails`):**
- `path` (string, required) — Target folder for the new bundle.

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
Deprecated compatibility API.
Deprecated compatibility API. Use publish for new callers.

**Usage:**

`aidp bundle deploy-action <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`DeployBundleDetails`):**
- `path` (string, required) — Target folder for the new bundle.

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
(Deprecated).
(Deprecated)

**Usage:**

`aidp bundle fetch-deployment-status <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`FetchBundleDeploymentStatusDetails`):**
- `path` (string, required) — Target folder for the new bundle.

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
Deprecated compatibility API.
Deprecated compatibility API. Use getBundlePublishStatus for new callers.

**Usage:**

`aidp bundle fetch-deployment-status-action <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`FetchBundleDeploymentStatusDetails`):**
- `path` (string, required) — Target folder for the new bundle.

**Example:**
```json
{
  "path": "<string>"
}
```
---
**Return:** [Back to Bundle](#bundle) • [Top](#top)

#### `aidp bundle fetch-publish-status-action`
<a id="bundle-fetch-publish-status-action"></a>
(Preview) Returns the latest publish summary.

**Usage:**

`aidp bundle fetch-publish-status-action <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`FetchBundlePublishStatusDetails`):**
- `path` (string, required) — Target folder for the new bundle.

**Example:**
```json
{
  "path": "<string>"
}
```
---
**Return:** [Back to Bundle](#bundle) • [Top](#top)

#### `aidp bundle publish-bundle-action`
<a id="bundle-publish-bundle-action"></a>
(Preview) Publishes the specified bundle, creating or updating jobs and agent flows according to the bundle manifest.
(Preview) Publishes the specified bundle, creating or updating jobs and agent flows according to the bundle manifest. Returns an async job key for tracking publish progress. This operation is asynchronous. The request is accepted for background execution and returns an async operation key in the response headers. Publishing typically uses: - the bundle manifest at the bundle root - top-level resource descriptors in the bundle - dependency descriptors referenced by those top-level resources - default or override variable values when present Use this operation when you want to apply the bundle contents into the target workspace state. Request notes: - path identifies the bundle root folder in the workspace volume

**Usage:**

`aidp bundle publish-bundle-action <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`PublishBundleDetails`):**
- `path` (string, required) — Target folder for the new bundle.

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
(Deprecated).
(Deprecated)

**Usage:**

`aidp bundle purge <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`PurgeBundleDetails`):**
- `path` (string, required) — Target folder for the new bundle.

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

`aidp bundle purge-action <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`PurgeBundleDetails`):**
- `path` (string, required) — Target folder for the new bundle.

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
(Deprecated).
(Deprecated)

**Usage:**

`aidp bundle sync-bundle <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`SyncBundleDetails`):**
- `path` (string, required) — Target folder for the new bundle.

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
(Preview) Synchronizes the code, descriptors, and mapping in the bundle by reconciling the contents with the resource origins. Returns an async job key for tracking sync progress. This operation is intended for cases where the bundle should be refreshed to reflect newer source changes while preserving the bundle structure and identity. This operation is asynchronous and returns async operation headers when accepted. Typical use cases: - refresh bundle contents after upstream workspace resources have changed - reconcile descriptor or artifact content with current resource origins - preserve local bundle overrides while pulling in source resource updates - keep a bundle current before promoting it Request notes: - path identifies the bundle root folder in the workspace volume - the bundle must contain a valid aidp_workbench.yaml - the bundle must contain .aidp/resource_origins.yaml - origin metadata must refer to the same AIDP/Data Lake and workspace as the request

**Usage:**

`aidp bundle sync-bundle-action <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`SyncBundleDetails`):**
- `path` (string, required) — Target folder for the new bundle.

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

`aidp catalog create --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`CreateCatalogDetails`):**
- `catalogType` (string, optional) — Type of catalog. Allowed values: EXTERNAL, INTERNAL.
- `connectionDetails` (object, optional) —
- `description` (string, optional) — Short description of the catalog.
- `displayName` (string, required) — Catalog display name.
- `properties` (object, optional) — Key-value pair used to provide catalog properties like the subCompartment OCID where the buckets need to reside.
- `sourceType` (string, optional) — External catalog source type. Allowed values: ADW, ALH, KAFKA, ATP, ORACLE, EXADATA, MYSQL, AZURE_SQLSERVER, SNOWFLAKE, GOOGLE_BIGQUERY, DB2, ORACLE_ANALYTICS.

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
- `connectionProperties` (object, required) — Connection properties.

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

`aidp catalog delete <CATALOG-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp catalog get <CATALOG-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `catalog-key` (string, required) — The key of the catalog.
**Options:**
- `is-catalog-guid` (boolean, optional) — A boolean which decides if catalogKey path parameter is catalog GUID (UUID) or name.
- `should-skip-ocid-translation` (boolean, optional) — When true, skip user OCID translation and return raw OCIDs.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---
**Return:** [Back to Catalog](#catalog) • [Top](#top)

#### `aidp catalog list`
<a id="catalog-list"></a>
Gets a list of catalogs with a given ID.

**Usage:**

`aidp catalog list --instance-id <AI-DATA-PLATFORM-ID>`

**Options:**
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `catalog-state` (string, optional) — The state of the catalog. Allowed values are: "ACTIVE", "CREATING", "DELETING"
- `catalog-type` (string, optional) — The type of the catalog. Allowed values are: "INTERNAL", "EXTERNAL"
- `should-skip-ocid-translation` (boolean, optional) — When true, skip user OCID translation and return raw OCIDs.
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

`aidp catalog list-permissions <CATALOG-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp catalog manage-permission <CATALOG-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `catalog-key` (string, required) — The key of the catalog.
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`AssignCatalogPermissionDetails`):**
- `assignees` (object, required) —
- `permissions` (array, required) — The permissions assigned to the assignees. Allowed values: SELECT, MANAGE, CREATE_SCHEMA, ADMIN.

**Example:**
```json
{
  "assignees": {},
  "permissions": [
    "SELECT"
  ]
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
- `targets` (array, required) — The names/ocids of the users, groups or roles.
- `type` (string, required) — Grantee type. Allowed values: USER, ROLE, GROUP.

**Example:**
```json
{
  "targets": [],
  "type": "USER"
}
```

**Request Body (`RevokeCatalogPermissionDetails`):**
- `assignees` (object, required) —
- `permissions` (array, required) — The permissions revoked from the assignees. Allowed values: SELECT, MANAGE, CREATE_SCHEMA, ADMIN.

**Example:**
```json
{
  "assignees": {},
  "permissions": [
    "SELECT"
  ]
}
```
---
**Return:** [Back to Catalog](#catalog) • [Top](#top)

#### `aidp catalog refresh`
<a id="catalog-refresh"></a>
Refreshes a catalog through a crawler.

**Usage:**

`aidp catalog refresh <CATALOG-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp catalog test-connection --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`CatalogConnectionDetails`):**
- `connectionProperties` (object, required) — Connection properties.
- `displayName` (string, optional) — Connection name.

**Example:**
```json
{
  "connectionProperties": {},
  "displayName": "<string>"
}
```

**Request Body (`CatalogTestConnectionDetails`):**
- `connectionDetails` (object, optional) —
- `key` (string, optional) — The AI Data Platform catalog key.
- `sourceType` (string, optional) — External catalog source type. Allowed values: ADW, ALH, KAFKA, ATP, ORACLE, EXADATA, MYSQL, AZURE_SQLSERVER, SNOWFLAKE, GOOGLE_BIGQUERY, DB2, ORACLE_ANALYTICS.

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

`aidp catalog update <CATALOG-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `catalog-key` (string, required) — The key of the catalog.
**Options:**
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`UpdateCatalogDetails`):**
- `connectionDetails` (object, optional) —
- `description` (string, optional) — Short description of the catalog.
- `displayName` (string, optional) — Catalog display name.
- `properties` (object, optional) — Key-value pair used to provide catalog properties like the subCompartment OCID where the buckets need to reside.

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
- `connectionProperties` (object, required) — Connection properties.

**Example:**
```json
{
  "connectionProperties": {}
}
```
---
**Return:** [Back to Catalog](#catalog) • [Top](#top)

## <a id="cluster"></a>Cluster
Clusters, cluster logs, compute configurations, and cluster libraries.
**Command Index:**
- [cluster clone-compute](#cluster-clone-compute)
- [cluster create](#cluster-create)
- [cluster delete](#cluster-delete)
- [cluster download-logs](#cluster-download-logs)
- [cluster export-compute-configuration](#cluster-export-compute-configuration)
- [cluster get](#cluster-get)
- [cluster get-compute-configuration](#cluster-get-compute-configuration)
- [cluster get-default](#cluster-get-default)
- [cluster import-compute-configuration](#cluster-import-compute-configuration)
- [cluster list](#cluster-list)
- [cluster list-libraries](#cluster-list-libraries)
- [cluster list-permissions](#cluster-list-permissions)
- [cluster manage-permission](#cluster-manage-permission)
- [cluster patch-library](#cluster-patch-library)
- [cluster query-replica-ids](#cluster-query-replica-ids)
- [cluster restart](#cluster-restart)
- [cluster search-logs](#cluster-search-logs)
- [cluster search-maven-packages](#cluster-search-maven-packages)
- [cluster start](#cluster-start)
- [cluster stop](#cluster-stop)
- [cluster summarize-metrics-data](#cluster-summarize-metrics-data)
- [cluster update](#cluster-update)
### Commands

#### `aidp cluster clone-compute`
<a id="cluster-clone-compute"></a>
Creates one Spark Compute by copying all source Compute settings and configuration.

**Usage:**

`aidp cluster clone-compute <WORKSPACE-KEY> <CLUSTER-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `cluster-key` (string, required) — Cluster key.
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Cluster](#cluster) • [Top](#top)

#### `aidp cluster create`
<a id="cluster-create"></a>
Creates a new cluster with the provided details.

**Usage:**

`aidp cluster create <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`AttachToNotebookConfig`):**
- `notebookPath` (string, required) — Notebook URI path.

**Example:**
```json
{
  "notebookPath": "<string>"
}
```

**Request Body (`AutoScaleConfiguration`):**
- `cooldownPeriodInMinutes` (integer, optional) — Minimum time in minutes between autoscaling actions. API-handler applies this value to both Data Flow stabilization windows.
- `metrics` (array, optional) — Autoscaling metric targets. At least one request-rate, CPU, or memory metric is required when autoscaling is enabled. API_REQUESTS_PER_SECOND accepts 1-15 requests per second per runtime pod. CPU_UTILIZATION accepts 0-100 percent mean CPU utilization across the replica set. Missing metrics use the defaults documented on AutoScaleConfiguration.

**Example:**
```json
{
  "cooldownPeriodInMinutes": 0,
  "metrics": []
}
```

**Request Body (`AutoScaleMetricConfiguration`):**
- `name` (string, required) — Metric used to determine whether AI Compute should scale. API_REQUESTS_PER_SECOND measures average request traffic per runtime pod; CPU_UTILIZATION measures mean CPU utilization across the replica set; MEMORY_UTILIZATION measures mean memory utilization across the replica set. Allowed values: API_REQUESTS_PER_SECOND, CPU_UTILIZATION, MEMORY_UTILIZATION.
- `targetAverageValue` (string, required) — Target average value for the selected metric. Use requests per second for API_REQUESTS_PER_SECOND (supported range 1-15; default 10 when omitted), and percent for CPU_UTILIZATION and MEMORY_UTILIZATION (supported range 0-100; default 75 when omitted).

**Example:**
```json
{
  "name": "API_REQUESTS_PER_SECOND",
  "targetAverageValue": "<string>"
}
```

**Request Body (`ClusterRuntimeConfig`):**
- `initScripts` (array, optional) — Init script paths that are run in the order of definition.
- `type` (string, optional) — Runtime type. Allowed values: SPARK.

**Variants** (selected by `type`):
- `SPARK` → `SparkRuntimeConfig`

**Example:**
```json
{
  "initScripts": [],
  "type": "SPARK"
}
```

**Request Body (`CreateAiComputeDetails`):**
- `autoScaleConfiguration` (object, optional) —
- `description` (string, optional) — Cluster description.
- `displayName` (string, required) — Cluster name.
- `driverConfig` (object, required) —
- `nodeType` (string, optional) — Cluster node type encodes the node shape and associated resources.
- `replicaConfig` (object, optional) —
- `type` (string, required) — ClusterType. Must be `AI_COMPUTE` for this variant.

**Example:**
```json
{
  "autoScaleConfiguration": {},
  "description": "<string>",
  "displayName": "<string>",
  "driverConfig": {},
  "nodeType": "<string>",
  "replicaConfig": {},
  "type": "AI_COMPUTE"
}
```

**Request Body (`CreateClusterDetails`):**
- `description` (string, optional) — Cluster description.
- `displayName` (string, required) — Cluster name.
- `driverConfig` (object, required) —
- `nodeType` (string, optional) — Cluster node type encodes the node shape and associated resources.
- `type` (string, required) — ClusterType. Allowed values: USER, AI_COMPUTE.

**Variants** (selected by `type`):
- `DFL` → `CreateDflComputeDetails`
- `USER` → `CreateSparkClusterDetails`
- `AI_COMPUTE` → `CreateAiComputeDetails`

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
- `description` (string, optional) — Cluster description.
- `displayName` (string, required) — Cluster name.
- `driverConfig` (object, required) —
- `nodeType` (string, optional) — Cluster node type encodes the node shape and associated resources.
- `type` (string, required) — ClusterType. Must be `DFL` for this variant.

**Example:**
```json
{
  "description": "<string>",
  "displayName": "<string>",
  "driverConfig": {},
  "nodeType": "<string>",
  "type": "DFL"
}
```

**Request Body (`CreateSparkClusterDetails`):**
- `attachToNotebookConfig` (object, optional) —
- `autoTerminationMinutes` (integer, optional) — Optional timeout value in minutes used to automatically stop idle compute clusters.
- `clusterRuntimeConfig` (object, optional) —
- `description` (string, optional) — Cluster description.
- `displayName` (string, required) — Cluster name.
- `driverConfig` (object, required) —
- `loggingConfig` (object, optional) —
- `nodeType` (string, optional) — Cluster node type encodes the node shape and associated resources.
- `subscription` (object, optional) —
- `type` (string, required) — ClusterType. Must be `USER` for this variant.
- `workerConfig` (object, optional) —
- `yamlPaths` (array, optional) — Optional, unique workspace or volume YAML paths to install after cluster provisioning starts. Use a workspace-relative path, /Workspace/..., or /Volumes/<catalog>/<schema>/<volume>/....

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
  "type": "USER",
  "workerConfig": {},
  "yamlPaths": []
}
```

**Request Body (`DriverConfig`):**
- `driverNodeType` (string, optional) — Node type of optional driver node that encodes the driver node shape and associated resources.
- `driverShape` (string, optional) — Shape of compute cluster driver instance. Example - VM.Standard2.x, VM.Standard.E3.Flex
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
- `destination` (string, required) — Full path of the init script file. Example - /Workspace/Shared/Folder1/my-init.sh or /Volumes/catalogName/schemaName/volumeName/Shared/Folder1/my-init.sh.

**Example:**
```json
{
  "destination": "<string>"
}
```

**Request Body (`LogGroup`):**
- `compartmentId` (string, optional) — The compartment ID of the log group.
- `groupName` (string, optional) — Log group name.
- `logName` (string, optional) — Log name.

**Example:**
```json
{
  "compartmentId": "<string>",
  "groupName": "<string>",
  "logName": "<string>"
}
```

**Request Body (`LoggingConfig`):**
- `type` (string, optional) — Type of logging service. Allowed values: OCI_LOGGING.

**Variants** (selected by `type`):
- `OCI_LOGGING` → `OciLogging`

**Example:**
```json
{
  "type": "OCI_LOGGING"
}
```

**Request Body (`OciLogging`):**
- `logGroups` (array, optional) — Init script paths that are run in the order of definition.
- `type` (string, optional) — Type of logging service. Must be `OCI_LOGGING` for this variant.

**Example:**
```json
{
  "logGroups": [],
  "type": "OCI_LOGGING"
}
```

**Request Body (`ReplicaConfig`):**
- `maxReplica` (integer, optional) — Maximum number of AI Compute replicas. The default service soft limit is 10; AI Compute uses a fixed replica count when minReplica and maxReplica match.
- `minReplica` (integer, optional) — Minimum number of AI Compute replicas. If replica configuration is not specified, AI Compute uses one replica by default.

**Example:**
```json
{
  "maxReplica": 0,
  "minReplica": 0
}
```

**Request Body (`ShapeConfig`):**
- `gpus` (integer, optional) — Total number of GPUs used for the driver or workers.
- `memoryInGBs` (integer, optional) — Amount of memory used for the driver or workers.
- `ocpus` (integer, optional) — Total number of OCPUs used for the driver or workers.

**Example:**
```json
{
  "gpus": 0,
  "memoryInGBs": 0,
  "ocpus": 0
}
```

**Request Body (`SparkRuntimeConfig`):**
- `initScripts` (array, optional) — Init script paths that are run in the order of definition.
- `sparkAdvancedConfigurations` (object, optional) — Spark configuration passed to the running process.
- `sparkEnvVariables` (object, optional) — Environment variables passed to the running process. See <a href="https://spark.apache.org/docs/latest/configuration.html#available-properties" target="_blank" rel="noopener noreferrer">Available Properties</a>. Example - { "spark.app.name" : "My App Name", "spark.shuffle.io.maxRetries" : "4" } Note: Not all Spark properties are permitted to be set. Attempting to set a property that is not allowed to be overwritten will cause a 400 status to be returned.
- `sparkVersion` (string, optional) — Spark version used to run the application.
- `type` (string, optional) — Runtime type. Must be `SPARK` for this variant.

**Example:**
```json
{
  "initScripts": [],
  "sparkAdvancedConfigurations": {},
  "sparkEnvVariables": {},
  "sparkVersion": "<string>",
  "type": "SPARK"
}
```

**Request Body (`SubscriptionDetails`):**
- `callbackUrl` (string, optional) — The notification callback URL.
- `serviceName` (string, optional) — The name of the service.

**Example:**
```json
{
  "callbackUrl": "<string>",
  "serviceName": "<string>"
}
```

**Request Body (`WorkerConfig`):**
- `maxWorkerCount` (integer, optional) — Maximum number of workers. When this property is specified, the cluster is auto-scaled.
- `minWorkerCount` (integer, optional) — Minimum number of workers.
- `workerShape` (string, optional) — Shape of the compute cluster worker instance.
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

`aidp cluster delete <WORKSPACE-KEY> <CLUSTER-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp cluster download-logs <WORKSPACE-KEY> <CLUSTER-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `cluster-key` (string, required) — Cluster key.
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.

**Request Body (`DownloadClusterLogsDetails`):**
- `clientContext` (string, optional) — UI-generated identifier to correlate the async job.
- `eventType` (string, optional) — Filters logs based on the event type. Supported only when `logContentTypeContains` is `events`.
- `executionContextId` (string, optional) — The execution context identifier associated with the log. Supported only when `logContentTypeContains` is `executor` or `driver`.
- `logContentTypeContains` (string, required) — The string represent the type of compute logs Common values include `events`, `driver`, `executor`. Supported only when `logContentTypeContains` is `executor` or `driver`.
- `logLevel` (string, optional) — The severity level of the log messages to filter. Common values include `INFO`, `WARN`, `ERROR`, `DEBUG`, etc. Supported only when `logContentTypeContains` is `executor` or `driver`.
- `logStreamTypeContains` (string, optional) — Filters logs based on the output stream type. - This includes standard output (`stdout`) for regular program output - and standard error (`stderr`) for error messages and diagnostics. Only supported when logContentTypeContains=executor/driver.
- `opcRequestId` (string, optional) — The unique request identifier used for tracking the API call. Supported only when `logContentTypeContains` is `executor` or `driver`.
- `subjectContains` (string, optional) — The string represent the specific of compute nodes Common values include `spark-driver`, `spark-executor-1`.
- `thread` (string, optional) — The thread identifier that generated the log. Supported only when `logContentTypeContains` is `executor` or `driver`.
- `timeBegin` (datetime, required) — Start filter log's date and time, in RFC 3339 format.
- `timeEnd` (datetime, required) — End filter log's date and time, in RFC 3339 format.

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

#### `aidp cluster export-compute-configuration`
<a id="cluster-export-compute-configuration"></a>
Writes selected Compute configuration values supplied by the caller to a workspace YAML file without overwriting an existing file.

**Usage:**

`aidp cluster export-compute-configuration <WORKSPACE-KEY> <CLUSTER-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `cluster-key` (string, required) — Cluster key.
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`ComputeConfigurationLibraryEntry`):**
- `jar` (string, optional) — JAR coordinate or workspace/volume path.
- `path` (string, optional) — Workspace or volume path containing library configuration.
- `pip` (string, optional) — Python package identifier.

**Example:**
```json
{
  "jar": "<string>",
  "path": "<string>",
  "pip": "<string>"
}
```

**Request Body (`ExportComputeConfigurationDetails`):**
- `clusterScopedLibraries` (array, optional) — Selected cluster-scoped library entries. Each entry must set exactly one of path, pip, or jar.
- `destinationPath` (string, optional) — Destination folder. Use /Workspace/... for a workspace file or /Volumes/<catalog>/<schema>/<volume>/... for a volume file. Defaults to /Workspace/configurations/.
- `environmentVariables` (object, optional) — Selected environment-variable keys and values to write to the YAML file.
- `fileName` (string, optional) — Optional YAML filename. API-handler appends .yaml when omitted.

**Example:**
```json
{
  "clusterScopedLibraries": [],
  "destinationPath": "<string>",
  "environmentVariables": {},
  "fileName": "<string>"
}
```
---
**Return:** [Back to Cluster](#cluster) • [Top](#top)

#### `aidp cluster get`
<a id="cluster-get"></a>
Returns detailed information about a cluster.

**Usage:**

`aidp cluster get <WORKSPACE-KEY> <CLUSTER-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `cluster-key` (string, required) — Cluster key.
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---
**Return:** [Back to Cluster](#cluster) • [Top](#top)

#### `aidp cluster get-compute-configuration`
<a id="cluster-get-compute-configuration"></a>
Gets cluster-scoped Python and JAR libraries and environment variables from Spark Compute.

**Usage:**

`aidp cluster get-compute-configuration <WORKSPACE-KEY> <CLUSTER-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `cluster-key` (string, required) — Cluster key.
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Cluster](#cluster) • [Top](#top)

#### `aidp cluster get-default`
<a id="cluster-get-default"></a>
Gets information about the master catalog default cluster.

**Usage:**

`aidp cluster get-default --instance-id <AI-DATA-PLATFORM-ID>`

**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Cluster](#cluster) • [Top](#top)

#### `aidp cluster import-compute-configuration`
<a id="cluster-import-compute-configuration"></a>
Imports one or more unique workspace YAML files into an active Spark Compute.

**Usage:**

`aidp cluster import-compute-configuration <WORKSPACE-KEY> <CLUSTER-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `cluster-key` (string, required) — Cluster key.
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`ImportComputeConfigurationDetails`):**
- `yamlPaths` (array, required) — Non-empty, unique workspace or volume paths ending in .yaml. Use a workspace-relative path, /Workspace/..., or /Volumes/<catalog>/<schema>/<volume>/....

**Example:**
```json
{
  "yamlPaths": []
}
```
---
**Return:** [Back to Cluster](#cluster) • [Top](#top)

#### `aidp cluster list`
<a id="cluster-list"></a>
Returns a list of all clusters in a given workspace.

**Usage:**

`aidp cluster list <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp cluster list-libraries <WORKSPACE-KEY> <CLUSTER-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp cluster list-permissions <WORKSPACE-KEY> <CLUSTER-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp cluster manage-permission <WORKSPACE-KEY> <CLUSTER-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `cluster-key` (string, required) — Cluster key.
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`AssignClusterPermissionDetails`):**
- `assignees` (object, required) —
- `permissions` (array, required) — Permissions assigned to the assignees. Allowed values: READ, USE, ADMIN.

**Example:**
```json
{
  "assignees": {},
  "permissions": [
    "READ"
  ]
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
- `targets` (array, required) — The names/ocids of the users, groups or roles.
- `type` (string, required) — Grantee type. Allowed values: USER, ROLE, GROUP.

**Example:**
```json
{
  "targets": [],
  "type": "USER"
}
```

**Request Body (`RevokeClusterPermissionDetails`):**
- `assignees` (object, required) —
- `permissions` (array, required) — Permissions revoked from the assignees. Allowed values: READ, USE, ADMIN.

**Example:**
```json
{
  "assignees": {},
  "permissions": [
    "READ"
  ]
}
```
---
**Return:** [Back to Cluster](#cluster) • [Top](#top)

#### `aidp cluster patch-library`
<a id="cluster-patch-library"></a>
Updates libraries of a cluster with the provided patches.

**Usage:**

`aidp cluster patch-library <WORKSPACE-KEY> <CLUSTER-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `cluster-key` (string, required) — Cluster key.
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`ClusterLibraryDetails`):**
- `operation` (string, required) — Operation to perform on this library from the cluster. Install or uninstall. Allowed values: INSTALL, UNINSTALL.
- `type` (string, optional) — Library type. Allowed values: WORKSPACE_FILE, VOLUME_FILE, PYPI, MAVEN.

**Variants** (selected by `operation`):
- `UNINSTALL` → `UninstallClusterLibraryDetails`
- `INSTALL` → `InstallClusterLibraryDetails`

**Example:**
```json
{
  "operation": "INSTALL",
  "type": "WORKSPACE_FILE"
}
```

**Request Body (`InstallClusterLibraryDetails`):**
- `coordinate` (string, optional) — Maven coordinate in `groupId:artifactId:version` format.
- `exclusions` (array, optional) — Optional Maven dependency exclusions.
- `operation` (string, required) — Operation to perform on this library from the cluster. Install or uninstall. Must be `INSTALL` for this variant.
- `path` (string, optional) — File path for the library to install. Example - /Workspace/shared/example/test.txt or /Volumes/catalogName/schemaName/volumeName/test.txt
- `pipIndexUrl` (string, optional) — Optional pip index URL used to resolve a PyPI package. Example - `https://pypi.org/simple`.
- `pythonPackage` (string, optional) — PyPI package specifier to install. Example - `requests==2.31.0`.
- `repository` (string, optional) — Optional Maven repository name or URL used to resolve the module.
- `type` (string, optional) — Library type. Allowed values: WORKSPACE_FILE, VOLUME_FILE, PYPI, MAVEN.

**Example:**
```json
{
  "coordinate": "<string>",
  "exclusions": [],
  "operation": "INSTALL",
  "path": "<string>",
  "pipIndexUrl": "<string>",
  "pythonPackage": "<string>",
  "repository": "<string>",
  "type": "WORKSPACE_FILE"
}
```

**Request Body (`PatchClusterLibraryDetails`):**
- `items` (array, required) — List of library changes to make.

**Example:**
```json
{
  "items": []
}
```

**Request Body (`UninstallClusterLibraryDetails`):**
- `coordinate` (string, optional) — Maven coordinate in `groupId:artifactId:version` format.
- `exclusions` (array, optional) — Optional Maven dependency exclusions.
- `name` (string, optional) — Name of the workspace or volume file library to uninstall.
- `operation` (string, required) — Operation to perform on this library from the cluster. Install or uninstall. Must be `UNINSTALL` for this variant.
- `pipIndexUrl` (string, optional) — Optional pip index URL associated with the PyPI package. Example - `https://pypi.org/simple`.
- `pythonPackage` (string, optional) — PyPI package specifier to uninstall. Example - `requests==2.31.0`.
- `repository` (string, optional) — Optional Maven repository name or URL associated with the module.
- `type` (string, optional) — Library type. Allowed values: WORKSPACE_FILE, VOLUME_FILE, PYPI, MAVEN.

**Example:**
```json
{
  "coordinate": "<string>",
  "exclusions": [],
  "name": "<string>",
  "operation": "UNINSTALL",
  "pipIndexUrl": "<string>",
  "pythonPackage": "<string>",
  "repository": "<string>",
  "type": "WORKSPACE_FILE"
}
```
---
**Return:** [Back to Cluster](#cluster) • [Top](#top)

#### `aidp cluster query-replica-ids`
<a id="cluster-query-replica-ids"></a>
Queries compute replica identifiers for a compute cluster in the given workspace.
Queries compute replica identifiers for a compute cluster in the given workspace. The response contains distinct replica identifiers derived from the Monitoring agentNode metric dimension.

**Usage:**

`aidp cluster query-replica-ids <WORKSPACE-KEY> <CLUSTER-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `cluster-key` (string, required) — Cluster key.
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`QueryReplicaIdsDetails`):**
- `metricName` (string, required) — The metric to use when discovering replica identifiers for the selected compute cluster. Allowed values are CpuUtilization, MemoryUtilization, NetworkReceiveBytes, and NetworkTransmitBytes.
- `timeBegin` (datetime, required) — The beginning of the time range to use when searching for replica metric data points. Format is RFC 3339.
- `timeEnd` (datetime, required) — The end of the time range to use when searching for replica metric data points. Format is RFC 3339.

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

`aidp cluster restart <WORKSPACE-KEY> <CLUSTER-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
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

`aidp cluster search-logs <WORKSPACE-KEY> <CLUSTER-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `cluster-key` (string, required) — Cluster key.
**Options:**
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.

**Request Body (`SearchClusterLogsDetails`):**
- `advancedFilter` (string, optional) — Contains any key and value that you want to search in the logs. Should be provided in the format 'key = value'. As of now supported keys are 'taskRunKey' and 'jobRunKey'
- `eventType` (string, optional) — Filters logs based on the event type. Supported only when `logContentTypeContains` is `events`.
- `executionContextId` (string, optional) — The execution context identifier associated with the log. Supported only when `logContentTypeContains` is `executor` or `driver`.
- `logContentTypeContains` (string, required) — The string represent the type of compute logs Common values include `events`, `driver`, `executor`.
- `logLevel` (string, optional) — The severity level of the log messages to filter. Common values include `INFO`, `WARN`, `ERROR`, `DEBUG`, etc. Supported only when `logContentTypeContains` is `executor` or `driver`.
- `logStreamTypeContains` (string, optional) — Filters logs based on the output stream type. - This includes standard output (`stdout`) for regular program output - and standard error (`stderr`) for error messages and diagnostics. Only supported when logContentTypeContains=executor/driver.
- `messageContains` (string, optional) — The string represent a filter to search message string from the log Supported only when `logContentTypeContains` is `events`.
- `opcRequestId` (string, optional) — The unique request identifier used for tracking the API call. Supported only when `logContentTypeContains` is `executor` or `driver`.
- `subjectContains` (string, optional) — The string represent the specific of compute nodes Common values include `spark-driver`, `spark-executor-1`.
- `thread` (string, optional) — The thread identifier that generated the log. Supported only when `logContentTypeContains` is `executor` or `driver`.
- `timeBegin` (datetime, required) — Start filter log's date and time, in RFC 3339 format.
- `timeEnd` (datetime, required) — End filter log's date and time, in RFC 3339 format.

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

#### `aidp cluster search-maven-packages`
<a id="cluster-search-maven-packages"></a>
Searches Maven packages available for cluster library installation.

**Usage:**

`aidp cluster search-maven-packages <WORKSPACE-KEY> <CLUSTER-KEY> --instance-id <AI-DATA-PLATFORM-ID> --maven-search-query <text>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `cluster-key` (string, required) — Cluster key.
**Options:**
- `maven-search-query` (string, required) — Search text matched against Maven package metadata, including group and artifact identifiers. For example, commons-csv can return org.apache.commons:commons-csv.
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Cluster](#cluster) • [Top](#top)

#### `aidp cluster start`
<a id="cluster-start"></a>
Starts a cluster that has halted operation.

**Usage:**

`aidp cluster start <WORKSPACE-KEY> <CLUSTER-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
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

`aidp cluster stop <WORKSPACE-KEY> <CLUSTER-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
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

`aidp cluster summarize-metrics-data <WORKSPACE-KEY> <CLUSTER-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `cluster-key` (string, required) — Cluster key.
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.

**Request Body (`SummarizeMetricsDataDetails`):**
- `agentNode` (string, optional) — Optional Monitoring `agentNode` dimension value used to filter AI compute metrics to a specific AI compute replica. This filter applies only to AI compute clusters.
- `aggregationType` (string, required) — The type of aggregation to apply. - Standard Aggregations: `MAX`, `MEAN`, `MIN`, `SUM`, `RATE`. - Percentile Aggregation: Use `Pxx`, where `xx` is the percentile value (e.g., `P80` for the 80th percentile). Allowed values: MAX, MEAN, MIN, SUM, RATE, P50, P80, P90, P95, P99, P99_9.
- `interval` (string, required) — The time window used to convert the set of raw data points. The timestamp of the aggregated data point corresponds to the end of the time window during which raw data points are assessed. For example, for a five-minute interval, the timestamp "2:05" corresponds to the five-minute time window from 2:00:00 to 2:05:00.
- `metricName` (string, required) — The metric to summarize. - Supported values include but are not limited to: - `CPU_UTILIZATION`, `MEMORY_UTILIZATION`, `FILE_SYSTEM_UTILIZATION`, `GC_CPU_UTILIZATION` - `DISK_READ_BYTES`, `DISK_WRITE_BYTES`, `NETWORK_RECEIVE_BYTES`, `NETWORK_TRANSMIT_BYTES` - `APP_STATUS`, `EXECUTOR_METRICS`, `SYSTEM_CPU`, `SYSTEM_MEMORY` - `SYSTEM_NETWORK_IN`, `SYSTEM_NETWORK_OUT`, `SYSTEM_DISK_READ`, `SYSTEM_DISK_WRITE` - Additional metrics such as task-related and shuffle metrics may be introduced in the future. - Refer to API documentation or contact support for the latest supported metric list.
- `resolution` (string, optional) — The time between calculated aggregation windows. Use with the query interval to vary the frequency for returning aggregated data points. For example, use a query interval of 5 minutes with a resolution of 1 minute to retrieve five-minute aggregations at a one-minute frequency. The resolution must be equal to or less than the interval in the query. The default resolution is 1m (one minute). Supported values: 1m-60m, 1h-24h, 1d.
- `timeBegin` (datetime, required) — The beginning of the time range to use when searching for metric data points. Format is RFC 3339.
- `timeEnd` (datetime, required) — The end of the time range to use when searching for metric data points. Format is RFC 3339.

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

`aidp cluster update <WORKSPACE-KEY> <CLUSTER-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `cluster-key` (string, required) — Cluster key.
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`AutoScaleConfiguration`):**
- `cooldownPeriodInMinutes` (integer, optional) — Minimum time in minutes between autoscaling actions. API-handler applies this value to both Data Flow stabilization windows.
- `metrics` (array, optional) — Autoscaling metric targets. At least one request-rate, CPU, or memory metric is required when autoscaling is enabled. API_REQUESTS_PER_SECOND accepts 1-15 requests per second per runtime pod. CPU_UTILIZATION accepts 0-100 percent mean CPU utilization across the replica set. Missing metrics use the defaults documented on AutoScaleConfiguration.

**Example:**
```json
{
  "cooldownPeriodInMinutes": 0,
  "metrics": []
}
```

**Request Body (`AutoScaleMetricConfiguration`):**
- `name` (string, required) — Metric used to determine whether AI Compute should scale. API_REQUESTS_PER_SECOND measures average request traffic per runtime pod; CPU_UTILIZATION measures mean CPU utilization across the replica set; MEMORY_UTILIZATION measures mean memory utilization across the replica set. Allowed values: API_REQUESTS_PER_SECOND, CPU_UTILIZATION, MEMORY_UTILIZATION.
- `targetAverageValue` (string, required) — Target average value for the selected metric. Use requests per second for API_REQUESTS_PER_SECOND (supported range 1-15; default 10 when omitted), and percent for CPU_UTILIZATION and MEMORY_UTILIZATION (supported range 0-100; default 75 when omitted).

**Example:**
```json
{
  "name": "API_REQUESTS_PER_SECOND",
  "targetAverageValue": "<string>"
}
```

**Request Body (`ClusterRuntimeConfig`):**
- `initScripts` (array, optional) — Init script paths that are run in the order of definition.
- `type` (string, optional) — Runtime type. Allowed values: SPARK.

**Variants** (selected by `type`):
- `SPARK` → `SparkRuntimeConfig`

**Example:**
```json
{
  "initScripts": [],
  "type": "SPARK"
}
```

**Request Body (`DriverConfig`):**
- `driverNodeType` (string, optional) — Node type of optional driver node that encodes the driver node shape and associated resources.
- `driverShape` (string, optional) — Shape of compute cluster driver instance. Example - VM.Standard2.x, VM.Standard.E3.Flex
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
- `destination` (string, required) — Full path of the init script file. Example - /Workspace/Shared/Folder1/my-init.sh or /Volumes/catalogName/schemaName/volumeName/Shared/Folder1/my-init.sh.

**Example:**
```json
{
  "destination": "<string>"
}
```

**Request Body (`LogGroup`):**
- `compartmentId` (string, optional) — The compartment ID of the log group.
- `groupName` (string, optional) — Log group name.
- `logName` (string, optional) — Log name.

**Example:**
```json
{
  "compartmentId": "<string>",
  "groupName": "<string>",
  "logName": "<string>"
}
```

**Request Body (`LoggingConfig`):**
- `type` (string, optional) — Type of logging service. Allowed values: OCI_LOGGING.

**Variants** (selected by `type`):
- `OCI_LOGGING` → `OciLogging`

**Example:**
```json
{
  "type": "OCI_LOGGING"
}
```

**Request Body (`OciLogging`):**
- `logGroups` (array, optional) — Init script paths that are run in the order of definition.
- `type` (string, optional) — Type of logging service. Must be `OCI_LOGGING` for this variant.

**Example:**
```json
{
  "logGroups": [],
  "type": "OCI_LOGGING"
}
```

**Request Body (`ReplicaConfig`):**
- `maxReplica` (integer, optional) — Maximum number of AI Compute replicas. The default service soft limit is 10; AI Compute uses a fixed replica count when minReplica and maxReplica match.
- `minReplica` (integer, optional) — Minimum number of AI Compute replicas. If replica configuration is not specified, AI Compute uses one replica by default.

**Example:**
```json
{
  "maxReplica": 0,
  "minReplica": 0
}
```

**Request Body (`ShapeConfig`):**
- `gpus` (integer, optional) — Total number of GPUs used for the driver or workers.
- `memoryInGBs` (integer, optional) — Amount of memory used for the driver or workers.
- `ocpus` (integer, optional) — Total number of OCPUs used for the driver or workers.

**Example:**
```json
{
  "gpus": 0,
  "memoryInGBs": 0,
  "ocpus": 0
}
```

**Request Body (`SparkRuntimeConfig`):**
- `initScripts` (array, optional) — Init script paths that are run in the order of definition.
- `sparkAdvancedConfigurations` (object, optional) — Spark configuration passed to the running process.
- `sparkEnvVariables` (object, optional) — Environment variables passed to the running process. See <a href="https://spark.apache.org/docs/latest/configuration.html#available-properties" target="_blank" rel="noopener noreferrer">Available Properties</a>. Example - { "spark.app.name" : "My App Name", "spark.shuffle.io.maxRetries" : "4" } Note: Not all Spark properties are permitted to be set. Attempting to set a property that is not allowed to be overwritten will cause a 400 status to be returned.
- `sparkVersion` (string, optional) — Spark version used to run the application.
- `type` (string, optional) — Runtime type. Must be `SPARK` for this variant.

**Example:**
```json
{
  "initScripts": [],
  "sparkAdvancedConfigurations": {},
  "sparkEnvVariables": {},
  "sparkVersion": "<string>",
  "type": "SPARK"
}
```

**Request Body (`SubscriptionDetails`):**
- `callbackUrl` (string, optional) — The notification callback URL.
- `serviceName` (string, optional) — The name of the service.

**Example:**
```json
{
  "callbackUrl": "<string>",
  "serviceName": "<string>"
}
```

**Request Body (`UpdateAiComputeDetails`):**
- `autoScaleConfiguration` (object, optional) —
- `description` (string, optional) — Cluster description.
- `displayName` (string, optional) — Cluster name.
- `driverConfig` (object, optional) —
- `nodeType` (string, optional) — Cluster node type encodes the node shape and associated resources.
- `replicaConfig` (object, optional) —
- `type` (string, required) — ClusterType. Must be `AI_COMPUTE` for this variant.

**Example:**
```json
{
  "autoScaleConfiguration": {},
  "description": "<string>",
  "displayName": "<string>",
  "driverConfig": {},
  "nodeType": "<string>",
  "replicaConfig": {},
  "type": "AI_COMPUTE"
}
```

**Request Body (`UpdateClusterDetails`):**
- `description` (string, optional) — Cluster description.
- `displayName` (string, optional) — Cluster name.
- `driverConfig` (object, optional) —
- `nodeType` (string, optional) — Cluster node type encodes the node shape and associated resources.
- `type` (string, required) — ClusterType. Allowed values: USER, AI_COMPUTE.

**Variants** (selected by `type`):
- `AI_COMPUTE` → `UpdateAiComputeDetails`
- `USER` → `UpdateSparkClusterDetails`

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
- `autoTerminationMinutes` (integer, optional) — Optional timeout value in minutes used to automatically stop idle compute clusters.
- `clusterRuntimeConfig` (object, optional) —
- `description` (string, optional) — Cluster description.
- `displayName` (string, optional) — Cluster name.
- `driverConfig` (object, optional) —
- `loggingConfig` (object, optional) —
- `nodeType` (string, optional) — Cluster node type encodes the node shape and associated resources.
- `subscription` (object, optional) —
- `type` (string, required) — ClusterType. Must be `USER` for this variant.
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
  "type": "USER",
  "workerConfig": {}
}
```

**Request Body (`WorkerConfig`):**
- `maxWorkerCount` (integer, optional) — Maximum number of workers. When this property is specified, the cluster is auto-scaled.
- `minWorkerCount` (integer, optional) — Minimum number of workers.
- `workerShape` (string, optional) — Shape of the compute cluster worker instance.
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

`aidp credentials create --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`CreateDataLakeCredentialDetails`):**
- `credentialDescription` (string, optional) — A brief summary of the credential object and its purpose.
- `credentialDetails` (object, required) —
- `displayName` (string, required) — A user-friendly name for the credential object. This value does not have to be unique and can be changed. Must start with a letter and contain only letters, numbers, or underscores. Avoid entering confidential information.
- `type` (string, required) — The type of credential stored. Allowed values are defined in CredentialType.

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
- `credentialType` (string, required) — Specifies the type of credential. Allowed values are defined in CredentialType.

**Variants** (selected by `credentialType`):
- `SERVICE_ACCOUNT` → `ServiceAccountCredentialDetails`
- `SECRET_TOKEN` → `SecretTokenCredentialDetails`
- `VAULT_REFERENCE` → `VaultReferenceCredentialDetails`

**Example:**
```json
{
  "credentialType": "SECRET_TOKEN"
}
```

**Request Body (`SecretPair`):**
- `secretKey` (string, required) — The secret key. The minimum length is 1 character and the maximum is 255 characters.
- `secretValue` (string, required) — The secret value. The minimum length is 1 character and the maximum is 1 MB.

**Example:**
```json
{
  "secretKey": "<string>",
  "secretValue": "<string>"
}
```

**Request Body (`SecretTokenCredentialDetails`):**
- `credentialType` (string, required) — Specifies the type of credential. Allowed values are defined in CredentialType. Must be `SECRET_TOKEN` for this variant.
- `secretTokenPair` (array, required) — A list of secret key-value pairs used as secret tokens or API keys.

**Example:**
```json
{
  "credentialType": "SECRET_TOKEN",
  "secretTokenPair": []
}
```

**Request Body (`ServiceAccountCredentialDetails`):**
- `credentialType` (string, required) — Specifies the type of credential. Allowed values are defined in CredentialType. Must be `SERVICE_ACCOUNT` for this variant.
- `fingerprint` (string, required) — The fingerprint of the service account's API key.
- `isReadOnly` (boolean, required) — Whether the credentials are read-only.
- `privateKey` (string, required) — The private key associated with the service account.
- `region` (string, required) — The region for the service account (e.g., us-ashburn-1).
- `tenancy` (string, required) — The OCID of the tenancy for the service account.
- `userId` (string, required) — The OCID of the user for the service account.

**Example:**
```json
{
  "credentialType": "SERVICE_ACCOUNT",
  "fingerprint": "<string>",
  "isReadOnly": true,
  "privateKey": "<string>",
  "region": "<string>",
  "tenancy": "<string>",
  "userId": "<string>"
}
```

**Request Body (`VaultReferenceCredentialDetails`):**
- `credentialType` (string, required) — Specifies the type of credential. Allowed values are defined in CredentialType. Must be `VAULT_REFERENCE` for this variant.
- `secretId` (string, required) — The OCID of the external secret to reference.

**Example:**
```json
{
  "credentialType": "VAULT_REFERENCE",
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

`aidp credentials delete <CREDENTIAL-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp credentials get <CREDENTIAL-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp credentials list --instance-id <AI-DATA-PLATFORM-ID>`

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

`aidp credentials update <CREDENTIAL-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `credential-key` (string, required) — The unique identifier of an credential
**Options:**
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`CredentialDetails`):**
- `credentialType` (string, required) — Specifies the type of credential. Allowed values are defined in CredentialType.

**Variants** (selected by `credentialType`):
- `SERVICE_ACCOUNT` → `ServiceAccountCredentialDetails`
- `SECRET_TOKEN` → `SecretTokenCredentialDetails`
- `VAULT_REFERENCE` → `VaultReferenceCredentialDetails`

**Example:**
```json
{
  "credentialType": "SECRET_TOKEN"
}
```

**Request Body (`SecretPair`):**
- `secretKey` (string, required) — The secret key. The minimum length is 1 character and the maximum is 255 characters.
- `secretValue` (string, required) — The secret value. The minimum length is 1 character and the maximum is 1 MB.

**Example:**
```json
{
  "secretKey": "<string>",
  "secretValue": "<string>"
}
```

**Request Body (`SecretTokenCredentialDetails`):**
- `credentialType` (string, required) — Specifies the type of credential. Allowed values are defined in CredentialType. Must be `SECRET_TOKEN` for this variant.
- `secretTokenPair` (array, required) — A list of secret key-value pairs used as secret tokens or API keys.

**Example:**
```json
{
  "credentialType": "SECRET_TOKEN",
  "secretTokenPair": []
}
```

**Request Body (`ServiceAccountCredentialDetails`):**
- `credentialType` (string, required) — Specifies the type of credential. Allowed values are defined in CredentialType. Must be `SERVICE_ACCOUNT` for this variant.
- `fingerprint` (string, required) — The fingerprint of the service account's API key.
- `isReadOnly` (boolean, required) — Whether the credentials are read-only.
- `privateKey` (string, required) — The private key associated with the service account.
- `region` (string, required) — The region for the service account (e.g., us-ashburn-1).
- `tenancy` (string, required) — The OCID of the tenancy for the service account.
- `userId` (string, required) — The OCID of the user for the service account.

**Example:**
```json
{
  "credentialType": "SERVICE_ACCOUNT",
  "fingerprint": "<string>",
  "isReadOnly": true,
  "privateKey": "<string>",
  "region": "<string>",
  "tenancy": "<string>",
  "userId": "<string>"
}
```

**Request Body (`UpdateDataLakeCredentialDetails`):**
- `credentialDescription` (string, optional) — A brief summary of the credential object and its purpose.
- `credentialDetails` (object, optional) —
- `displayName` (string, optional) — A user-friendly name for the credential object. This value does not have to be unique and can be changed. Must start with a letter and contain only letters, numbers, or underscores. Avoid entering confidential information.
- `type` (string, optional) — The type of credential stored. Allowed values are defined in CredentialType.

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
- `credentialType` (string, required) — Specifies the type of credential. Allowed values are defined in CredentialType. Must be `VAULT_REFERENCE` for this variant.
- `secretId` (string, required) — The OCID of the external secret to reference.

**Example:**
```json
{
  "credentialType": "VAULT_REFERENCE",
  "secretId": "<string>"
}
```
---
**Return:** [Back to Credentials](#credentials) • [Top](#top)

## <a id="data-lineage"></a>Data Lineage
Entity lineages.
**Command Index:**
- [data-lineage export](#data-lineage-export)
- [data-lineage fetch-entity-lineage](#data-lineage-fetch-entity-lineage)
### Commands

#### `aidp data-lineage export`
<a id="data-lineage-export"></a>
(Preview) Returns complete lineage for the provided anchor node in CSV format.

**Usage:**

`aidp data-lineage export --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.

**Request Body (`ExportLineageDetails`):**
- `anchorNode` (string, required) — Root entity node from which lineage is to be exported. Example format: `aidp://catalogs@<aidpocid>/o/{catalog.db.table}`.
- `direction` (string, required) — Direction of the lineage returned. Allowed values: UPSTREAM, BOTH, DOWNSTREAM.

**Example:**
```json
{
  "anchorNode": "<string>",
  "direction": "UPSTREAM"
}
```
---
**Return:** [Back to Data-Lineage](#data-lineage) • [Top](#top)

#### `aidp data-lineage fetch-entity-lineage`
<a id="data-lineage-fetch-entity-lineage"></a>
(Preview) Returns lineage for a given entity object.

**Usage:**

`aidp data-lineage fetch-entity-lineage --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.

**Request Body (`FetchEntityLineageDetails`):**
- `anchorNode` (string, required) — Root entity node from with the lineage is to be fetched.
- `direction` (string, required) — Direction of the lineage returned. Allowed values: UPSTREAM, BOTH, DOWNSTREAM.
- `level` (string, required) — Indicates the level for lineage fetch. It is one of ENTITY/COLUMN. Allowed values: ENTITY, COLUMN.
- `maxDepth` (integer, required) — Maximum depth to traverse in lineage graph. Depth is measured as number of links from anchor node to matching nodes.
- `nodeFilters` (object, optional) —
- `pathFilters` (object, optional) —
- `shouldIncludeEdges` (boolean, optional) — Controls if the edges will be returned with vertices.

**Example:**
```json
{
  "anchorNode": "<string>",
  "direction": "UPSTREAM",
  "level": "ENTITY",
  "maxDepth": 0,
  "nodeFilters": {},
  "pathFilters": {},
  "shouldIncludeEdges": true
}
```

**Request Body (`NodeFilterObject`):**
- `predicates` (object, required) —

**Example:**
```json
{
  "predicates": {}
}
```

**Request Body (`NodeFilterPredicates`):**
- `displayNameContains` (string, optional) — Filters nodes whose display name contains the specified value.
- `typeEquals` (string, optional) — Filters nodes whose type exactly matches the specified value.

**Example:**
```json
{
  "displayNameContains": "<string>",
  "typeEquals": "<string>"
}
```

**Request Body (`PassThroughNodeFilterPredicate`):**
- `depth` (integer, optional) — Depth of the pass through node from anchor node.
- `id` (string, optional) — ID of the pass through node.

**Example:**
```json
{
  "depth": 0,
  "id": "<string>"
}
```

**Request Body (`PathFilterObject`):**
- `predicates` (object, required) —

**Example:**
```json
{
  "predicates": {}
}
```

**Request Body (`PathFilterPredicates`):**
- `anchorNodeColumnsIn` (array, optional) — Includes only lineage paths where the anchor node's column is one of the specified values, and column-level traversal starts only from these anchor columns.
- `parentIdIn` (array, optional) — Includes only those lineage paths in which each node's parent ID is present in the specified list.
- `passThroughNode` (object, optional) —

**Example:**
```json
{
  "anchorNodeColumnsIn": [],
  "parentIdIn": [],
  "passThroughNode": {}
}
```
---
**Return:** [Back to Data-Lineage](#data-lineage) • [Top](#top)

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

`aidp delta-share create --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`CreateShareDetails`):**
- `description` (string, optional) — A description associated with this share.
- `displayName` (string, required) — A user-friendly name. Has to be unique within the AI Data Platform instance.

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

`aidp delta-share create-recipient --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`CreateRecipientDetails`):**
- `description` (string, optional) — Short description of the Recipient
- `displayName` (string, required) — A user-friendly name. Has to be unique within the AI Data Platform instance.
- `properties` (object, optional) — Key-value pair representing a defined tag key and value. Example: `{ "CostCenter": "42" }`

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

`aidp delta-share delete <SHARE-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp delta-share delete-recipient <RECIPIENT-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp delta-share get <SHARE-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp delta-share get-recipient <RECIPIENT-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp delta-share list --instance-id <AI-DATA-PLATFORM-ID>`

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

`aidp delta-share list-data-assets <SHARE-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp delta-share list-permissions <SHARE-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp delta-share list-recipient-permissions <RECIPIENT-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp delta-share list-recipient-shares <RECIPIENT-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp delta-share list-recipients --instance-id <AI-DATA-PLATFORM-ID>`

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

`aidp delta-share list-share-recipients <SHARE-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp delta-share manage-access <SHARE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `share-key` (string, required) — The unique key of the Share.
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`ManageShareAccessDetails`):**
- `action` (string, required) — The action. Either Grant or Revoke. Allowed values: GRANT, REVOKE.
- `recipient` (string, required) — The simplified name of the grantee.

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

`aidp delta-share manage-data-asset <SHARE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `share-key` (string, required) — The unique key of the Share.
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`ManageShareDataAssetDetails`):**
- `action` (string, required) — The action of this update. Allowed values: ADD, REMOVE.
- `alias` (string, optional) — The data asset alias for this operation, only applicable for TABLE and VIEW.
- `description` (string, optional) — The data asset description for this operation.
- `name` (string, required) — The data asset name for this operation. For relational assets, it should be fully qualified name. For example, catalog.schema or catalog.schema.table.
- `partition` (string, optional) — Partition clause information, only applicable for TABLE.
- `type` (string, required) — The asset type for this update. Allowed values: SCHEMA, TABLE, VIEW.

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

`aidp delta-share manage-permission <SHARE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `share-key` (string, required) — The unique key of the Share.
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`AssignSharePermissionDetails`):**
- `assignees` (object, required) —
- `permissions` (array, required) — The permissions assigned to the assignees. Allowed values: ADMIN, READ, USE.

**Example:**
```json
{
  "assignees": {},
  "permissions": [
    "ADMIN"
  ]
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
- `targets` (array, required) — The names/ocids of the users, groups or roles.
- `type` (string, required) — Grantee type. Allowed values: USER, ROLE, GROUP.

**Example:**
```json
{
  "targets": [],
  "type": "USER"
}
```

**Request Body (`RevokeSharePermissionDetails`):**
- `assignees` (object, required) —
- `permissions` (array, required) — The permissions revoked from the assignees. Allowed values: ADMIN, READ, USE.

**Example:**
```json
{
  "assignees": {},
  "permissions": [
    "ADMIN"
  ]
}
```
---
**Return:** [Back to Delta-Share](#delta-share) • [Top](#top)

#### `aidp delta-share manage-recipient-permission`
<a id="delta-share-manage-recipient-permission"></a>
Updates the permissions of a Delta Share recipient.

**Usage:**

`aidp delta-share manage-recipient-permission <RECIPIENT-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `recipient-key` (string, required) — The key of the recipient resource
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`AssignRecipientPermissionDetails`):**
- `assignees` (object, required) —
- `permissions` (array, required) — The permissions assigned to the assignees. Allowed values: ADMIN, USE, READ.

**Example:**
```json
{
  "assignees": {},
  "permissions": [
    "ADMIN"
  ]
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
- `targets` (array, required) — The names/ocids of the users, groups or roles.
- `type` (string, required) — Grantee type. Allowed values: USER, ROLE, GROUP.

**Example:**
```json
{
  "targets": [],
  "type": "USER"
}
```

**Request Body (`RevokeRecipientPermissionDetails`):**
- `assignees` (object, required) —
- `permissions` (array, required) — The permissions revoked from the assignees. Allowed values: ADMIN, USE, READ.

**Example:**
```json
{
  "assignees": {},
  "permissions": [
    "ADMIN"
  ]
}
```
---
**Return:** [Back to Delta-Share](#delta-share) • [Top](#top)

#### `aidp delta-share update`
<a id="delta-share-update"></a>
Update a Delta Share with the provided metadata.

**Usage:**

`aidp delta-share update <SHARE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `share-key` (string, required) — The unique key of the Share.
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`UpdateShareDetails`):**
- `description` (string, optional) — A description associated with this share.
- `displayName` (string, optional) — A user-friendly name. Has to be unique within the AI Data Platform instance.

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

`aidp delta-share update-recipient <RECIPIENT-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `recipient-key` (string, required) — The key of the recipient resource
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`UpdateRecipientDetails`):**
- `description` (string, optional) — Short description of the Recipient
- `displayName` (string, optional) — A user-friendly name. Has to be unique within the AI Data Platform instance.
- `properties` (object, optional) — Key-value pair representing a defined tag key and value. Example: `{ "CostCenter": "42" }`

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

## <a id="git"></a>Git
Git repositories, git branches, git diffs, and git operation state.
**Command Index:**
- [git checkout-branch](#git-checkout-branch)
- [git commit-push-repository](#git-commit-push-repository)
- [git create-branch](#git-create-branch)
- [git get-diff-detail](#git-get-diff-detail)
- [git get-operation-state](#git-get-operation-state)
- [git get-repository](#git-get-repository)
- [git list-branches](#git-list-branches)
- [git list-diffs](#git-list-diffs)
- [git merge-repository](#git-merge-repository)
- [git pull-repository](#git-pull-repository)
- [git rebase-repository](#git-rebase-repository)
- [git reset-folder-state](#git-reset-folder-state)
- [git reset-repository](#git-reset-repository)
- [git resolve-conflicts](#git-resolve-conflicts)
- [git update-repository](#git-update-repository)
### Commands

#### `aidp git checkout-branch`
<a id="git-checkout-branch"></a>
(Preview) Asynchronously checks out the requested branch in the workspace Git folder.
(Preview) Asynchronously checks out the requested branch in the workspace Git folder. Checkout normally resets the local branch to origin/{branchName}, with a local-branch fallback. The aidp-async-operation-key response header identifies the job; its SUCCEEDED status confirms completion.

**Usage:**

`aidp git checkout-branch <WORKSPACE-KEY> <GIT-REPOSITORY-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `git-repository-key` (string, required) — The opaque repository key, available as GitRepository.key or system:repoKey in the folder's JSON file-metadata HEAD response header when shouldIncludeMetadata=true. Distinct from the async operation resourceName.
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.

**Request Body (`CheckoutBranchDetails`):**
- `branchName` (string, required) — Branch to check out. This selects the target branch rather than asserting the current branch.
- `gitFolderPath` (string, required) — Workspace path of the Git folder associated with gitRepositoryKey.

**Example:**
```json
{
  "branchName": "<string>",
  "gitFolderPath": "<string>"
}
```
---
**Return:** [Back to Git](#git) • [Top](#top)

#### `aidp git commit-push-repository`
<a id="git-commit-push-repository"></a>
(Preview) Asynchronously commits and pushes the stored repository branch.
(Preview) Asynchronously commits and pushes the stored repository branch. For normal commits, omitting files stages all local changes. After conflicts are resolved, completes a merge or continues a rebase; rebase continuation force-pushes. The aidp-async-operation-key response header identifies the job; its SUCCEEDED status confirms completion.

**Usage:**

`aidp git commit-push-repository <WORKSPACE-KEY> <GIT-REPOSITORY-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `git-repository-key` (string, required) — The opaque repository key, available as GitRepository.key or system:repoKey in the folder's JSON file-metadata HEAD response header when shouldIncludeMetadata=true. Distinct from the async operation resourceName.
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.

**Request Body (`CommitPushDetails`):**
- `branchName` (string, optional) — Repository branch name. The effective branch is taken from the repository identified by gitRepositoryKey; the supplied value does not override it.
- `commitDescription` (string, optional) — Commit description.
- `commitMessage` (string, required) — Commit message.
- `files` (array, optional) — Repository-relative paths staged for a normal commit. When omitted, all local changes are staged with git add -A. Not applied when continuing a resolved rebase. Selected paths must be included by sparse checkout, if enabled.
- `gitFolderPath` (string, optional) — Workspace Git folder path. The effective path is taken from the repository identified by gitRepositoryKey; the supplied value does not override it.

**Example:**
```json
{
  "branchName": "<string>",
  "commitDescription": "<string>",
  "commitMessage": "<string>",
  "files": [],
  "gitFolderPath": "<string>"
}
```
---
**Return:** [Back to Git](#git) • [Top](#top)

#### `aidp git create-branch`
<a id="git-create-branch"></a>
(Preview) Asynchronously creates a branch from the current HEAD, checks it out in the stored Git folder, and pushes it to origin.
(Preview) Asynchronously creates a branch from the current HEAD, checks it out in the stored Git folder, and pushes it to origin. The aidp-async-operation-key response header identifies the job; its SUCCEEDED status confirms completion.

**Usage:**

`aidp git create-branch <WORKSPACE-KEY> <GIT-REPOSITORY-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `git-repository-key` (string, required) — The opaque repository key, available as GitRepository.key or system:repoKey in the folder's JSON file-metadata HEAD response header when shouldIncludeMetadata=true. Distinct from the async operation resourceName.
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`CreateGitBranchDetails`):**
- `gitBranchName` (string, required) — Name of the new branch. The branch must not already exist locally or on origin.
- `gitFolderPath` (string, optional) — Workspace Git folder path. The effective path is taken from the repository identified by gitRepositoryKey; the supplied value does not override it.

**Example:**
```json
{
  "gitBranchName": "<string>",
  "gitFolderPath": "<string>"
}
```
---
**Return:** [Back to Git](#git) • [Top](#top)

#### `aidp git get-diff-detail`
<a id="git-get-diff-detail"></a>
(Preview) Returns a local unified diff for a repository-relative file.
(Preview) Returns a local unified diff for a repository-relative file. contextLines and maxPatchBytes are not currently applied by execution.

**Usage:**

`aidp git get-diff-detail <WORKSPACE-KEY> <GIT-REPOSITORY-KEY> --instance-id <AI-DATA-PLATFORM-ID> --git-folder-path <git-folder-path> --branch-name <branch-name> --git-file-path <git-file-path>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `git-repository-key` (string, required) — The opaque repository key, available as GitRepository.key or system:repoKey in the folder's JSON file-metadata HEAD response header when shouldIncludeMetadata=true. Distinct from the async operation resourceName.
**Options:**
- `git-folder-path` (string, required) — Workspace path of the Git folder, distinct from repository-relative file paths.
- `branch-name` (string, required) — Expected branch name for the folder context.
- `git-file-path` (string, required) — File path relative to repository root.
- `context-lines` (integer, optional) — Requested diff context lines. Current execution does not apply this value.
- `max-patch-bytes` (integer, optional) — Requested maximum patch bytes. Current execution does not enforce this value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Git](#git) • [Top](#top)

#### `aidp git get-operation-state`
<a id="git-get-operation-state"></a>
(Preview) Returns a snapshot of Git worktree operation state and readiness for an optional operationName.
(Preview) Returns a snapshot of Git worktree operation state and readiness for an optional operationName. CLEAN does not imply no local changes. This endpoint does not report asynchronous job progress.

**Usage:**

`aidp git get-operation-state <WORKSPACE-KEY> <GIT-REPOSITORY-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `git-repository-key` (string, required) — The opaque repository key, available as GitRepository.key or system:repoKey in the folder's JSON file-metadata HEAD response header when shouldIncludeMetadata=true. Distinct from the async operation resourceName.
**Options:**
- `operation-name` (string, optional) — Operation intent, such as PULL, PUSH, or DIFF_LIST, used to compute isAllowed. Does not execute the operation.
- `branch-name` (string, optional) — Expected branch name for the folder context.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Git](#git) • [Top](#top)

#### `aidp git get-repository`
<a id="git-get-repository"></a>
(Preview) Returns stored repository URL, folder, branch, and connectivity references.
(Preview) Returns stored repository URL, folder, branch, and connectivity references. The authentication setting key is included only when shouldIncludeCredentialKey=true.

**Usage:**

`aidp git get-repository <WORKSPACE-KEY> <GIT-REPOSITORY-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `git-repository-key` (string, required) — The opaque repository key, available as GitRepository.key or system:repoKey in the folder's JSON file-metadata HEAD response header when shouldIncludeMetadata=true. Distinct from the async operation resourceName.
**Options:**
- `should-include-credential-key` (boolean, optional) — A flag to include credential key in response. If 'true', credential key will be returned in response. Default 'false'.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Git](#git) • [Top](#top)

#### `aidp git list-branches`
<a id="git-list-branches"></a>
(Preview) Lists branches on origin with pagination.
(Preview) Lists branches on origin with pagination. Name filters and sort controls are not currently applied. Page tokens become invalid if the branch listing changes.

**Usage:**

`aidp git list-branches <WORKSPACE-KEY> <GIT-REPOSITORY-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `git-repository-key` (string, required) — The opaque repository key, available as GitRepository.key or system:repoKey in the folder's JSON file-metadata HEAD response header when shouldIncludeMetadata=true. Distinct from the async operation resourceName.
**Options:**
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `display-name-contains` (string, optional) — A filter to return only resources that have a display name containing the text provided.
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName", "status"
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Git](#git) • [Top](#top)

#### `aidp git list-diffs`
<a id="git-list-diffs"></a>
(Preview) Lists local file changes with snapshot pagination.
(Preview) Lists local file changes with snapshot pagination. compareTo, filter, displayName, and sort controls are not currently applied; this is not an upstream comparison.

**Usage:**

`aidp git list-diffs <WORKSPACE-KEY> <GIT-REPOSITORY-KEY> --instance-id <AI-DATA-PLATFORM-ID> --git-folder-path <git-folder-path> --branch-name <branch-name>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `git-repository-key` (string, required) — The opaque repository key, available as GitRepository.key or system:repoKey in the folder's JSON file-metadata HEAD response header when shouldIncludeMetadata=true. Distinct from the async operation resourceName.
**Options:**
- `git-folder-path` (string, required) — Workspace path of the Git folder, distinct from repository-relative file paths.
- `branch-name` (string, required) — Expected branch name for the folder context.
- `compare-to` (string, optional) — Requested comparison reference. Results describe local file changes regardless of the supplied value. Allowed values are: "HEAD", "UPSTREAM", "INDEX", "WORKTREE", "MERGE_BASE"
- `filter` (string, optional) — Requested file-change filter. Results include all detected local file changes regardless of the supplied value. Allowed values are: "ALL", "DIFF_ONLY", "CONFLICTS_ONLY"
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. The default order for timeCreated is descending. Allowed values are: "timeCreated"
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Git](#git) • [Top](#top)

#### `aidp git merge-repository`
<a id="git-merge-repository"></a>
(Preview) Asynchronously merges origin/{remoteBranchName} into the stored repository branch and pushes it to origin on a conflict-free merge.
(Preview) Asynchronously merges origin/{remoteBranchName} into the stored repository branch and pushes it to origin on a conflict-free merge. commitId is not applied. The aidp-async-operation-key response header identifies the job; its SUCCEEDED status confirms completion.

**Usage:**

`aidp git merge-repository <WORKSPACE-KEY> <GIT-REPOSITORY-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `git-repository-key` (string, required) — The opaque repository key, available as GitRepository.key or system:repoKey in the folder's JSON file-metadata HEAD response header when shouldIncludeMetadata=true. Distinct from the async operation resourceName.
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`GitMergeDetails`):**
- `branchName` (string, optional) — Requested destination branch name. The merge destination is the stored repository branch; the supplied value does not override it.
- `commitId` (string, optional) — Requested source commit identifier. The merge source is origin/{remoteBranchName}; the supplied value does not override it.
- `gitFolderPath` (string, optional) — Workspace Git folder path. The effective path is taken from the repository identified by gitRepositoryKey; the supplied value does not override it.
- `remoteBranchName` (string, required) — Remote branch whose origin reference is merged into the stored repository branch.

**Example:**
```json
{
  "branchName": "<string>",
  "commitId": "<string>",
  "gitFolderPath": "<string>",
  "remoteBranchName": "<string>"
}
```
---
**Return:** [Back to Git](#git) • [Top](#top)

#### `aidp git pull-repository`
<a id="git-pull-repository"></a>
(Preview) Asynchronously pulls origin changes into the stored repository branch using autostash.
(Preview) Asynchronously pulls origin changes into the stored repository branch using autostash. Supplied branch, pullAction, and commitMessage overrides are not applied. The aidp-async-operation-key response header identifies the job; its SUCCEEDED status confirms completion.

**Usage:**

`aidp git pull-repository <WORKSPACE-KEY> <GIT-REPOSITORY-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `git-repository-key` (string, required) — The opaque repository key, available as GitRepository.key or system:repoKey in the folder's JSON file-metadata HEAD response header when shouldIncludeMetadata=true. Distinct from the async operation resourceName.
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`GitPullDetails`):**
- `branchName` (string, optional) — Repository branch name. The effective branch is taken from the repository identified by gitRepositoryKey; the supplied value does not override it.
- `commitMessage` (string, optional) — Requested merge-continuation commit message. The supplied value has no effect, including when pullAction is MERGE_CONTINUE.
- `gitFolderPath` (string, optional) — Workspace Git folder path. The effective path is taken from the repository identified by gitRepositoryKey; the supplied value does not override it.
- `pullAction` (string, optional) — Requested pull action. The effective action is PULL regardless of the supplied value; MERGE_CONTINUE and MERGE_ABORT do not select separate actions. Allowed values: PULL, MERGE_CONTINUE, MERGE_ABORT.
- `remoteBranchName` (string, optional) — Requested remote branch name. The pull source is origin for the stored repository branch; the supplied value does not override it.

**Example:**
```json
{
  "branchName": "<string>",
  "commitMessage": "<string>",
  "gitFolderPath": "<string>",
  "pullAction": "PULL",
  "remoteBranchName": "<string>"
}
```
---
**Return:** [Back to Git](#git) • [Top](#top)

#### `aidp git rebase-repository`
<a id="git-rebase-repository"></a>
(Preview) Asynchronously rebases the stored repository branch onto origin/{remoteBranchName} and force-pushes it on success.
(Preview) Asynchronously rebases the stored repository branch onto origin/{remoteBranchName} and force-pushes it on success. commitId is not applied. The aidp-async-operation-key response header identifies the job; its SUCCEEDED status confirms completion. The stored branch must pass its remote synchronization check before rebasing.

**Usage:**

`aidp git rebase-repository <WORKSPACE-KEY> <GIT-REPOSITORY-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `git-repository-key` (string, required) — The opaque repository key, available as GitRepository.key or system:repoKey in the folder's JSON file-metadata HEAD response header when shouldIncludeMetadata=true. Distinct from the async operation resourceName.
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`GitRebaseDetails`):**
- `branchName` (string, optional) — Requested branch name. The branch being rebased is the stored repository branch; the supplied value does not override it.
- `commitId` (string, optional) — Requested target commit identifier. The rebase target is origin/{remoteBranchName}; the supplied value does not override it.
- `gitFolderPath` (string, optional) — Workspace Git folder path. The effective path is taken from the repository identified by gitRepositoryKey; the supplied value does not override it.
- `remoteBranchName` (string, required) — Required remote branch whose origin reference is the rebase target.

**Example:**
```json
{
  "branchName": "<string>",
  "commitId": "<string>",
  "gitFolderPath": "<string>",
  "remoteBranchName": "<string>"
}
```
---
**Return:** [Back to Git](#git) • [Top](#top)

#### `aidp git reset-folder-state`
<a id="git-reset-folder-state"></a>
(Preview) Aborts an in-progress Git operation or discards selected local changes according to action.
(Preview) Aborts an in-progress Git operation or discards selected local changes according to action. Single-path DISCARD runs synchronously; other requests submit a job. When present, datalake-async-operation-key identifies that job.

**Usage:**

`aidp git reset-folder-state <WORKSPACE-KEY> <GIT-REPOSITORY-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `git-repository-key` (string, required) — The opaque repository key, available as GitRepository.key or system:repoKey in the folder's JSON file-metadata HEAD response header when shouldIncludeMetadata=true. Distinct from the async operation resourceName.
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.

**Request Body (`ResetGitFolderStateDetails`):**
- `action` (string, required) — ABORT_MERGE, ABORT_REBASE, and ABORT_PULL abort the respective in-progress operation. DISCARD restores selected tracked paths and removes selected new files. Allowed values: ABORT_MERGE, ABORT_REBASE, ABORT_PULL, DISCARD.
- `canIncludeIgnored` (boolean, optional) — Requested inclusion of ignored files in a DISCARD request. The supplied value does not enable ignored-file removal.
- `discardPaths` (array, optional) — Repository-relative paths whose local changes are to be discarded. Required and nonempty when action is DISCARD.

**Example:**
```json
{
  "action": "ABORT_MERGE",
  "canIncludeIgnored": true,
  "discardPaths": []
}
```
---
**Return:** [Back to Git](#git) • [Top](#top)

#### `aidp git reset-repository`
<a id="git-reset-repository"></a>
(Preview) Asynchronously hard-resets the stored repository branch to origin/{branchName}, discards tracked local changes, and force-pushes the stored branch.
(Preview) Asynchronously hard-resets the stored repository branch to origin/{branchName}, discards tracked local changes, and force-pushes the stored branch. resetMode and commitId are not applied. The aidp-async-operation-key response header identifies the job; its SUCCEEDED status confirms completion.

**Usage:**

`aidp git reset-repository <WORKSPACE-KEY> <GIT-REPOSITORY-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `git-repository-key` (string, required) — The opaque repository key, available as GitRepository.key or system:repoKey in the folder's JSON file-metadata HEAD response header when shouldIncludeMetadata=true. Distinct from the async operation resourceName.
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`GitResetDetails`):**
- `branchName` (string, optional) — Remote branch whose origin reference is the reset target. Current execution requires a target branch; the stored repository branch is the branch being reset and force-pushed.
- `commitId` (string, optional) — Requested target commit identifier. The reset target is origin/{branchName}; the supplied value does not override it.
- `gitFolderPath` (string, optional) — Workspace Git folder path. The effective path is taken from the repository identified by gitRepositoryKey; the supplied value does not override it.
- `resetMode` (string, optional) — Requested reset mode. The effective mode is HARD regardless of the supplied value, including SOFT or MIXED. Allowed values: SOFT, MIXED, HARD.

**Example:**
```json
{
  "branchName": "<string>",
  "commitId": "<string>",
  "gitFolderPath": "<string>",
  "resetMode": "SOFT"
}
```
---
**Return:** [Back to Git](#git) • [Top](#top)

#### `aidp git resolve-conflicts`
<a id="git-resolve-conflicts"></a>
(Preview) Synchronously selects LOCAL or REMOTE file versions, or stages manually resolved content with MARK_RESOLVED.
(Preview) Synchronously selects LOCAL or REMOTE file versions, or stages manually resolved content with MARK_RESOLVED. Does not complete or push an in-progress merge or rebase.

**Usage:**

`aidp git resolve-conflicts <WORKSPACE-KEY> <GIT-REPOSITORY-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `git-repository-key` (string, required) — The opaque repository key, available as GitRepository.key or system:repoKey in the folder's JSON file-metadata HEAD response header when shouldIncludeMetadata=true. Distinct from the async operation resourceName.
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.

**Request Body (`ConflictResolveDetails`):**
- `action` (string, required) — LOCAL selects the local version and REMOTE selects the incoming version, with Git side mapping adjusted during rebase. MARK_RESOLVED stages manually resolved workspace content. Allowed values: LOCAL, REMOTE, MARK_RESOLVED.
- `files` (array, required) — Repository-relative paths of the conflicted files to resolve or stage.

**Example:**
```json
{
  "action": "LOCAL",
  "files": []
}
```
---
**Return:** [Back to Git](#git) • [Top](#top)

#### `aidp git update-repository`
<a id="git-update-repository"></a>
(Preview) Updates repository settings.
(Preview) Updates repository settings. URL changes and changed sparse checkout patterns submit asynchronous operations; credential and private connectivity reference changes may complete without an operation key. This operation does not change the default branch or relocate the folder. Omitted fields retain their stored values.

**Usage:**

`aidp git update-repository <WORKSPACE-KEY> <GIT-REPOSITORY-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `git-repository-key` (string, required) — The opaque repository key, available as GitRepository.key or system:repoKey in the folder's JSON file-metadata HEAD response header when shouldIncludeMetadata=true. Distinct from the async operation resourceName.
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`SparseCheckoutDetails`):**
- `mode` (string, optional) — Sparse checkout matching mode. Git supports cone and non-cone sparse checkout pattern styles; AIDP supports cone mode only. Allowed values: CONE.
- `patterns` (array, optional) — Repository-root-relative folder paths to include in the sparse worktree. Cone patterns apply only to folders; root-level files in the repository are always materialized. Empty or omitted patterns materialize root-level files only.

**Example:**
```json
{
  "mode": "CONE",
  "patterns": []
}
```

**Request Body (`UpdateGitRepositoryDetails`):**
- `credentialKey` (string, optional) — Key of the current user's GIT_ACCOUNT user setting containing Git authentication credentials. Identified by settingType=GIT_ACCOUNT and displayName in user setting listings. Distinct from credentialStoreKey, which references a TLS CA certificate.
- `credentialStoreKey` (string, optional) — Key of the credential-store entry containing the Git server's TLS CA certificate, identified by displayName in credential listings. Provides server certificate trust, separate from the Git authentication user setting referenced by credentialKey. Required when isPrivateConnectivityEnabled is true.
- `gitConnectivityProfileKey` (string, optional) — Key of the private network profile used for Git connectivity, returned by private network profile listings filtered by name. Required when isPrivateConnectivityEnabled is true.
- `gitFolderPath` (string, optional) — Workspace Git folder path. The stored repository path is retained; the supplied value does not rename or relocate the folder.
- `gitUrl` (string, optional) — The Git repository url corresponding to the branch.
- `isPrivateConnectivityEnabled` (boolean, optional) — Whether this repository uses private network connectivity.
- `sparseCheckout` (object, optional) —

**Example:**
```json
{
  "credentialKey": "<string>",
  "credentialStoreKey": "<string>",
  "gitConnectivityProfileKey": "<string>",
  "gitFolderPath": "<string>",
  "gitUrl": "<string>",
  "isPrivateConnectivityEnabled": true,
  "sparseCheckout": {}
}
```
---
**Return:** [Back to Git](#git) • [Top](#top)

## <a id="lake-authorization"></a>Lake Authorization
Access granted fors.
**Command Index:**
- [lake-authorization access-granted-for](#lake-authorization-access-granted-for)
### Commands

#### `aidp lake-authorization access-granted-for`
<a id="lake-authorization-access-granted-for"></a>
Internal OAC integration API available to any authenticated caller with manage permission on the target AI Data Platform.
Internal OAC integration API available to any authenticated caller with manage permission on the target AI Data Platform. The caller permission is checked by SPLAT independently of the subjects in the body. Delegated context only selects evaluation subjects. Resource checks are forwarded in one batch, with flattened results. HTTP 200 may contain DENIED results. OBO takes precedence over OAC user context. A supplied dh-user-principal must agree with either resolved delegated context. Without those contexts it supplies the fallback subject; otherwise the authenticated caller is the fallback. Explicit UNSIGNED subjects remain distinct. Malformed or conflicting principal inputs are rejected before evaluation.

**Usage:**

`aidp lake-authorization access-granted-for --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `dh-user-principal` (string, optional) — Optional Base64-encoded serialized evaluation principal; not caller authentication.

**Request Body (`AccessGrantedForCatalogDetails`):**
- `catalogName` (string, required) — Lakeproxy catalogName.

**Example:**
```json
{
  "catalogName": "<string>"
}
```

**Request Body (`AccessGrantedForCatalogResource`):**
- `resourceDetails` (object, required) —
- `resourceType` (string, required) — Lakeproxy resource discriminator. Must be `CATALOG` for this variant.

**Example:**
```json
{
  "resourceDetails": {},
  "resourceType": "CATALOG"
}
```

**Request Body (`AccessGrantedForComputeDetails`):**
- `computeId` (string, required) — Lakeproxy computeId.
- `datalakeId` (string, required) — Lakeproxy datalakeId.
- `workspaceId` (string, required) — Lakeproxy workspaceId.

**Example:**
```json
{
  "computeId": "<string>",
  "datalakeId": "<string>",
  "workspaceId": "<string>"
}
```

**Request Body (`AccessGrantedForComputeResource`):**
- `resourceDetails` (object, required) —
- `resourceType` (string, required) — Lakeproxy resource discriminator. Must be `COMPUTE` for this variant.

**Example:**
```json
{
  "resourceDetails": {},
  "resourceType": "COMPUTE"
}
```

**Request Body (`AccessGrantedForCredentialDetails`):**
- `credentialDetails` (string, optional) — Lakeproxy credentialDetails.
- `credentialOperationTarget` (string, required) — Lakeproxy credentialOperationTarget. Allowed values: CENTRIFY_CATALOG, CREDENTIAL.

**Example:**
```json
{
  "credentialDetails": "<string>",
  "credentialOperationTarget": "CENTRIFY_CATALOG"
}
```

**Request Body (`AccessGrantedForCredentialResource`):**
- `resourceDetails` (object, required) —
- `resourceType` (string, required) — Lakeproxy resource discriminator. Must be `CREDENTIAL` for this variant.

**Example:**
```json
{
  "resourceDetails": {},
  "resourceType": "CREDENTIAL"
}
```

**Request Body (`AccessGrantedForDatabaseDetails`):**
- `catalogName` (string, required) — Lakeproxy catalogName.
- `databaseName` (string, required) — Lakeproxy databaseName.

**Example:**
```json
{
  "catalogName": "<string>",
  "databaseName": "<string>"
}
```

**Request Body (`AccessGrantedForDatabaseResource`):**
- `resourceDetails` (object, required) —
- `resourceType` (string, required) — Lakeproxy resource discriminator. Must be `DATABASE` for this variant.

**Example:**
```json
{
  "resourceDetails": {},
  "resourceType": "DATABASE"
}
```

**Request Body (`AccessGrantedForDatalakeDetails`):**
- `datalakeId` (string, required) — Lakeproxy datalakeId.

**Example:**
```json
{
  "datalakeId": "<string>"
}
```

**Request Body (`AccessGrantedForDatalakeResource`):**
- `resourceDetails` (object, required) —
- `resourceType` (string, required) — Lakeproxy resource discriminator. Must be `DATALAKE` for this variant.

**Example:**
```json
{
  "resourceDetails": {},
  "resourceType": "DATALAKE"
}
```

**Request Body (`AccessGrantedForDeltaShareDetails`):**
- `deltaShareOperationTarget` (string, required) — Lakeproxy deltaShareOperationTarget. Allowed values: CENTRIFY_CATALOG, SHARE, RECIPIENT.
- `recipientName` (string, optional) — Lakeproxy recipientName.
- `shareName` (string, optional) — Lakeproxy shareName.

**Example:**
```json
{
  "deltaShareOperationTarget": "CENTRIFY_CATALOG",
  "recipientName": "<string>",
  "shareName": "<string>"
}
```

**Request Body (`AccessGrantedForDeltaShareResource`):**
- `resourceDetails` (object, required) —
- `resourceType` (string, required) — Lakeproxy resource discriminator. Must be `DELTASHARE` for this variant.

**Example:**
```json
{
  "resourceDetails": {},
  "resourceType": "DELTASHARE"
}
```

**Request Body (`AccessGrantedForExternalCatalogDetails`):**
- `externalCatalogName` (string, required) — Lakeproxy externalCatalogName.

**Example:**
```json
{
  "externalCatalogName": "<string>"
}
```

**Request Body (`AccessGrantedForExternalCatalogResource`):**
- `resourceDetails` (object, required) —
- `resourceType` (string, required) — Lakeproxy resource discriminator. Must be `EXTERNALCATALOG` for this variant.

**Example:**
```json
{
  "resourceDetails": {},
  "resourceType": "EXTERNALCATALOG"
}
```

**Request Body (`AccessGrantedForFileDetails`):**
- `datalakeId` (string, required) — Lakeproxy datalakeId.
- `fileId` (string, required) — Lakeproxy fileId.
- `workspaceId` (string, required) — Lakeproxy workspaceId.

**Example:**
```json
{
  "datalakeId": "<string>",
  "fileId": "<string>",
  "workspaceId": "<string>"
}
```

**Request Body (`AccessGrantedForFileResource`):**
- `resourceDetails` (object, required) —
- `resourceType` (string, required) — Lakeproxy resource discriminator. Must be `FILE` for this variant.

**Example:**
```json
{
  "resourceDetails": {},
  "resourceType": "FILE"
}
```

**Request Body (`AccessGrantedForFolderDetails`):**
- `datalakeId` (string, required) — Lakeproxy datalakeId.
- `folderId` (string, required) — Lakeproxy folderId.
- `workspaceId` (string, required) — Lakeproxy workspaceId.

**Example:**
```json
{
  "datalakeId": "<string>",
  "folderId": "<string>",
  "workspaceId": "<string>"
}
```

**Request Body (`AccessGrantedForFolderResource`):**
- `resourceDetails` (object, required) —
- `resourceType` (string, required) — Lakeproxy resource discriminator. Must be `FOLDER` for this variant.

**Example:**
```json
{
  "resourceDetails": {},
  "resourceType": "FOLDER"
}
```

**Request Body (`AccessGrantedForKnowledgeBaseDetails`):**
- `catalogName` (string, required) — Lakeproxy catalogName.
- `databaseName` (string, required) — Lakeproxy databaseName.
- `knowledgeBaseName` (string, required) — Lakeproxy knowledgeBaseName.

**Example:**
```json
{
  "catalogName": "<string>",
  "databaseName": "<string>",
  "knowledgeBaseName": "<string>"
}
```

**Request Body (`AccessGrantedForKnowledgeBaseResource`):**
- `resourceDetails` (object, required) —
- `resourceType` (string, required) — Lakeproxy resource discriminator. Must be `KNOWLEDGE_BASE` for this variant.

**Example:**
```json
{
  "resourceDetails": {},
  "resourceType": "KNOWLEDGE_BASE"
}
```

**Request Body (`AccessGrantedForMasterCatalogResource`):**
- `resourceType` (string, required) — Lakeproxy resource discriminator. Must be `CENTRIFYCATALOG` for this variant.

**Example:**
```json
{
  "resourceType": "CENTRIFYCATALOG"
}
```

**Request Body (`AccessGrantedForRequestCollection`):**
- `items` (array, required) — Resource checks in evaluation order.

**Example:**
```json
{
  "items": []
}
```

**Request Body (`AccessGrantedForRequestItem`):**
- `accessType` (string, required) — Lakeproxy access type for the selected resource.
- `resource` (object, required) —

**Example:**
```json
{
  "accessType": "<string>",
  "resource": {}
}
```

**Request Body (`AccessGrantedForResource`):**
- `resourceType` (string, required) — Lakeproxy resource discriminator.

**Variants** (selected by `resourceType`):
- `CENTRIFYCATALOG` → `AccessGrantedForMasterCatalogResource`
- `TABLE` → `AccessGrantedForTableResource`
- `FILE` → `AccessGrantedForFileResource`
- `WORKSPACE` → `AccessGrantedForWorkspaceResource`
- `CATALOG` → `AccessGrantedForCatalogResource`
- `VOLUME` → `AccessGrantedForVolumeResource`
- `DELTASHARE` → `AccessGrantedForDeltaShareResource`
- `DATABASE` → `AccessGrantedForDatabaseResource`
- `KNOWLEDGE_BASE` → `AccessGrantedForKnowledgeBaseResource`
- `DATALAKE` → `AccessGrantedForDatalakeResource`
- `EXTERNALCATALOG` → `AccessGrantedForExternalCatalogResource`
- `COMPUTE` → `AccessGrantedForComputeResource`
- `WORKFLOW` → `AccessGrantedForWorkflowResource`
- `FOLDER` → `AccessGrantedForFolderResource`
- `CREDENTIAL` → `AccessGrantedForCredentialResource`

**Example:**
```json
{
  "resourceType": "<string>"
}
```

**Request Body (`AccessGrantedForTableDetails`):**
- `catalogName` (string, required) — Lakeproxy catalogName.
- `databaseName` (string, required) — Lakeproxy databaseName.
- `tableName` (string, required) — Lakeproxy tableName.

**Example:**
```json
{
  "catalogName": "<string>",
  "databaseName": "<string>",
  "tableName": "<string>"
}
```

**Request Body (`AccessGrantedForTableResource`):**
- `resourceDetails` (object, required) —
- `resourceType` (string, required) — Lakeproxy resource discriminator. Must be `TABLE` for this variant.

**Example:**
```json
{
  "resourceDetails": {},
  "resourceType": "TABLE"
}
```

**Request Body (`AccessGrantedForVolumeDetails`):**
- `catalogName` (string, required) — Lakeproxy catalogName.
- `databaseName` (string, required) — Lakeproxy databaseName.
- `volumeName` (string, required) — Lakeproxy volumeName.

**Example:**
```json
{
  "catalogName": "<string>",
  "databaseName": "<string>",
  "volumeName": "<string>"
}
```

**Request Body (`AccessGrantedForVolumeResource`):**
- `resourceDetails` (object, required) —
- `resourceType` (string, required) — Lakeproxy resource discriminator. Must be `VOLUME` for this variant.

**Example:**
```json
{
  "resourceDetails": {},
  "resourceType": "VOLUME"
}
```

**Request Body (`AccessGrantedForWorkflowDetails`):**
- `datalakeId` (string, required) — Lakeproxy datalakeId.
- `workflowId` (string, required) — Lakeproxy workflowId.
- `workspaceId` (string, required) — Lakeproxy workspaceId.

**Example:**
```json
{
  "datalakeId": "<string>",
  "workflowId": "<string>",
  "workspaceId": "<string>"
}
```

**Request Body (`AccessGrantedForWorkflowResource`):**
- `resourceDetails` (object, required) —
- `resourceType` (string, required) — Lakeproxy resource discriminator. Must be `WORKFLOW` for this variant.

**Example:**
```json
{
  "resourceDetails": {},
  "resourceType": "WORKFLOW"
}
```

**Request Body (`AccessGrantedForWorkspaceDetails`):**
- `datalakeId` (string, required) — Lakeproxy datalakeId.
- `workspaceId` (string, required) — Lakeproxy workspaceId.

**Example:**
```json
{
  "datalakeId": "<string>",
  "workspaceId": "<string>"
}
```

**Request Body (`AccessGrantedForWorkspaceResource`):**
- `resourceDetails` (object, required) —
- `resourceType` (string, required) — Lakeproxy resource discriminator. Must be `WORKSPACE` for this variant.

**Example:**
```json
{
  "resourceDetails": {},
  "resourceType": "WORKSPACE"
}
```

**Request Body (`MultiplePrincipalAccessGrantedDetails`):**
- `items` (array, required) — Subjects in evaluation order.

**Example:**
```json
{
  "items": []
}
```

**Request Body (`PrincipalAccessGrantedDetails`):**
- `authCheckRequestCollection` (object, required) —
- `iamCheckAccessType` (string, optional) — Optional IAM access check passed unchanged to Lakeproxy.
- `principal` (string, optional) — Base64-encoded serialized OCI principal for an explicit subject. If omitted, use the resolved request identity. With principalType SIGNED, any supplied principal must match that identity. Base64 is a transport encoding, not proof of caller authorization.
- `principalType` (string, optional) — SIGNED selects the resolved request identity; UNSIGNED selects an explicit Base64 principal or falls back to the resolved identity. Allowed values: SIGNED, UNSIGNED.

**Example:**
```json
{
  "authCheckRequestCollection": {},
  "iamCheckAccessType": "<string>",
  "principal": "<string>",
  "principalType": "SIGNED"
}
```
---
**Return:** [Back to Lake-Authorization](#lake-authorization) • [Top](#top)

## <a id="mlops"></a>ML Ops
Experiments, experiment runs, registered models, and model deployments.
**Command Index:**
- [mlops activate-model-deployment](#mlops-activate-model-deployment)
- [mlops create-experiment](#mlops-create-experiment)
- [mlops create-experiment-run](#mlops-create-experiment-run)
- [mlops create-model-deployment](#mlops-create-model-deployment)
- [mlops create-model-version](#mlops-create-model-version)
- [mlops create-registered-model](#mlops-create-registered-model)
- [mlops create-workspace-model-version](#mlops-create-workspace-model-version)
- [mlops deactivate-model-deployment](#mlops-deactivate-model-deployment)
- [mlops delete-experiment](#mlops-delete-experiment)
- [mlops delete-experiment-run](#mlops-delete-experiment-run)
- [mlops delete-experiment-run-tag](#mlops-delete-experiment-run-tag)
- [mlops delete-experiment-tag](#mlops-delete-experiment-tag)
- [mlops delete-model-deployment](#mlops-delete-model-deployment)
- [mlops delete-model-version](#mlops-delete-model-version)
- [mlops delete-model-version-tag](#mlops-delete-model-version-tag)
- [mlops delete-registered-model](#mlops-delete-registered-model)
- [mlops delete-registered-model-tag](#mlops-delete-registered-model-tag)
- [mlops export-model-deployment-inferences](#mlops-export-model-deployment-inferences)
- [mlops get-deployment-log](#mlops-get-deployment-log)
- [mlops get-experiment-by-id](#mlops-get-experiment-by-id)
- [mlops get-experiment-by-name](#mlops-get-experiment-by-name)
- [mlops get-experiment-run-by-id](#mlops-get-experiment-run-by-id)
- [mlops get-experiment-run-metric-history](#mlops-get-experiment-run-metric-history)
- [mlops get-model-deployment](#mlops-get-model-deployment)
- [mlops get-model-deployment-activity](#mlops-get-model-deployment-activity)
- [mlops get-model-deployment-contract](#mlops-get-model-deployment-contract)
- [mlops get-model-deployment-inference-details](#mlops-get-model-deployment-inference-details)
- [mlops get-model-deployment-inference-summary](#mlops-get-model-deployment-inference-summary)
- [mlops get-model-version](#mlops-get-model-version)
- [mlops get-registered-model](#mlops-get-registered-model)
- [mlops get-registered-model-summary](#mlops-get-registered-model-summary)
- [mlops list-artifacts](#mlops-list-artifacts)
- [mlops list-experiment-runs](#mlops-list-experiment-runs)
- [mlops list-experiments](#mlops-list-experiments)
- [mlops list-logged-models](#mlops-list-logged-models)
- [mlops list-model-deployment-activities](#mlops-list-model-deployment-activities)
- [mlops list-model-versions](#mlops-list-model-versions)
- [mlops list-registered-model-permissions](#mlops-list-registered-model-permissions)
- [mlops list-registered-models](#mlops-list-registered-models)
- [mlops log-experiment-run-batch](#mlops-log-experiment-run-batch)
- [mlops log-experiment-run-inputs](#mlops-log-experiment-run-inputs)
- [mlops log-experiment-run-metric](#mlops-log-experiment-run-metric)
- [mlops log-experiment-run-model](#mlops-log-experiment-run-model)
- [mlops log-experiment-run-param](#mlops-log-experiment-run-param)
- [mlops manage-registered-model-permission](#mlops-manage-registered-model-permission)
- [mlops rename-registered-model](#mlops-rename-registered-model)
- [mlops restore-experiment](#mlops-restore-experiment)
- [mlops restore-experiment-run](#mlops-restore-experiment-run)
- [mlops roll-back-model-deployment](#mlops-roll-back-model-deployment)
- [mlops roll-forward-model-deployment](#mlops-roll-forward-model-deployment)
- [mlops search-deployment-logs](#mlops-search-deployment-logs)
- [mlops search-model-deployment-inferences](#mlops-search-model-deployment-inferences)
- [mlops search-model-deployments](#mlops-search-model-deployments)
- [mlops set-experiment-run-tag](#mlops-set-experiment-run-tag)
- [mlops set-experiment-tag](#mlops-set-experiment-tag)
- [mlops set-model-version-tag](#mlops-set-model-version-tag)
- [mlops set-registered-model-tag](#mlops-set-registered-model-tag)
- [mlops transition-model-version-stage](#mlops-transition-model-version-stage)
- [mlops update-experiment](#mlops-update-experiment)
- [mlops update-experiment-run](#mlops-update-experiment-run)
- [mlops update-experiment-run-tags](#mlops-update-experiment-run-tags)
- [mlops update-experiment-tags](#mlops-update-experiment-tags)
- [mlops update-model-deployment](#mlops-update-model-deployment)
- [mlops update-model-deployment-tags](#mlops-update-model-deployment-tags)
- [mlops update-model-version](#mlops-update-model-version)
- [mlops update-model-version-tags](#mlops-update-model-version-tags)
- [mlops update-registered-model](#mlops-update-registered-model)
- [mlops update-registered-model-tags](#mlops-update-registered-model-tags)
### Commands

#### `aidp mlops activate-model-deployment`
<a id="mlops-activate-model-deployment"></a>
(Preview) Activates a model deployment so the model becomes available for inference.

**Usage:**

`aidp mlops activate-model-deployment --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`ActivateModelDeploymentDetails`):**
- `deployment_id` (string, required) — ID of the deployment to activate.
- `message` (string, optional) — Optional deployment activation message. At most 2000 characters and 2000 UTF-8 bytes.

**Example:**
```json
{
  "deployment_id": "<string>",
  "message": "<string>"
}
```
---
**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops create-experiment`
<a id="mlops-create-experiment"></a>
(Preview) Creates an experiment in a workspace.

**Usage:**

`aidp mlops create-experiment <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`CreateExperimentDetails`):**
- `artifact_location` (string, optional) — Location where all artifacts for the experiment are stored. If not provided, the remote server will select an appropriate default.
- `name` (string, required) — Name of the experiment.
- `tags` (array, optional) — List of tags set on the experiment.

**Example:**
```json
{
  "artifact_location": "<string>",
  "name": "<string>",
  "tags": []
}
```

**Request Body (`ExperimentTag`):**
- `key` (string, required) — Key of the experiment tag.
- `value` (string, optional) — Value of the experiment tag.

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

`aidp mlops create-experiment-run <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`CreateExperimentRunDetails`):**
- `experiment_id` (string, optional) — ID of the associated experiment.
- `run_name` (string, optional) — Name of the run.
- `start_time` (integer, optional) — Unix timestamp in milliseconds when the run started.
- `tags` (array, optional) — Tags to log.

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
- `key` (string, optional) — Key of the run tag.
- `value` (string, optional) — Value of the run tag.

**Example:**
```json
{
  "key": "<string>",
  "value": "<string>"
}
```
---
**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops create-model-deployment`
<a id="mlops-create-model-deployment"></a>
(Preview) Creates a model deployment for a registered model.

**Usage:**

`aidp mlops create-model-deployment --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`CreateModelDeploymentDetails`):**
- `authDetails` (object, optional) —
- `authType` (string, required) — Authentication mechanism for the deployment's query endpoint. Required. Allowed values: AIDP, OAUTH.
- `computeKey` (string, required) — Compute key of the deployment. At most 255 characters and 255 UTF-8 bytes.
- `deployment_targets` (array, required) — Deployment targets of the deployment.
- `description` (string, optional) — Description of the deployment. At most 2000 characters and 2000 UTF-8 bytes.
- `model_name` (string, required) — Name of the registered model. At most 256 characters and 256 UTF-8 bytes.
- `name` (string, required) — Name of the deployment. At most 255 characters and 255 UTF-8 bytes.
- `tags` (array, optional) — List of tags set on the model deployment.
- `workspaceKey` (string, required) — Workspace key of the deployment. At most 255 characters and 255 UTF-8 bytes.

**Example:**
```json
{
  "authDetails": {},
  "authType": "AIDP",
  "computeKey": "<string>",
  "deployment_targets": [],
  "description": "<string>",
  "model_name": "<string>",
  "name": "<string>",
  "tags": [],
  "workspaceKey": "<string>"
}
```

**Request Body (`DeploymentOAuthDetails`):**
- `audienceClaim` (array, required) — OAuth audience claims (aud) the query endpoint accepts. Entries must be unique.
- `issuerClaim` (string, required) — OAuth issuer claim (iss) the query endpoint requires. An https URI whose host is a fully qualified domain name, not an IP literal in any notation, and which carries no userinfo and no fragment.
- `jwksUri` (string, required) — URI the gateway retrieves the signing keys (JWKS) from. An https URI whose host is a fully qualified domain name, not an IP literal in any notation, and which carries no userinfo and no fragment. A query string and a non-default port are permitted: published provider JWKS endpoints use both.

**Example:**
```json
{
  "audienceClaim": [],
  "issuerClaim": "<string>",
  "jwksUri": "<string>"
}
```

**Request Body (`DeploymentTarget`):**
- `model_version` (string, required) — Version number of the model version.
- `traffic_percentage` (integer, required) — Percentage of deployment traffic routed to this model version.

**Example:**
```json
{
  "model_version": "<string>",
  "traffic_percentage": 0
}
```

**Request Body (`ModelDeploymentTag`):**
- `key` (string, required) — Key of the model deployment tag. At most 250 characters and 250 UTF-8 bytes.
- `value` (string, optional) — Value of the model deployment tag. At most 5000 characters and 5000 UTF-8 bytes.

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

`aidp mlops create-model-version --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`CreateModelVersionDetails`):**
- `description` (string, optional) — Description of this model version.
- `model_id` (string, optional) — Model ID for model version that is used to link the registered model to the source logged model.
- `name` (string, required) — Register models under this name.
- `run_id` (string, optional) — Run ID that generated the model version.
- `run_link` (string, optional) — Direct link to the run that generated this version.
- `source` (string, required) — URI indicating the location of the source model artifacts.
- `tags` (array, optional) — Tags of model version.

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
- `key` (string, optional) — Key of the tag.
- `value` (string, optional) — Value of the tag.

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

`aidp mlops create-registered-model --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`CreateRegisteredModelDetails`):**
- `deployment_job_id` (string, optional) — Deployment job ID for this model.
- `description` (string, optional) — Description for the registered model.
- `name` (string, required) — Register models under this name.
- `tags` (array, optional) — Tags for the registered model.

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
- `key` (string, optional) — Key of the registered model tag.
- `value` (string, optional) — Value of the registered model tag.

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

`aidp mlops create-workspace-model-version <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`CreateModelVersionDetails`):**
- `description` (string, optional) — Description of this model version.
- `model_id` (string, optional) — Model ID for model version that is used to link the registered model to the source logged model.
- `name` (string, required) — Register models under this name.
- `run_id` (string, optional) — Run ID that generated the model version.
- `run_link` (string, optional) — Direct link to the run that generated this version.
- `source` (string, required) — URI indicating the location of the source model artifacts.
- `tags` (array, optional) — Tags of model version.

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
- `key` (string, optional) — Key of the tag.
- `value` (string, optional) — Value of the tag.

**Example:**
```json
{
  "key": "<string>",
  "value": "<string>"
}
```
---
**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops deactivate-model-deployment`
<a id="mlops-deactivate-model-deployment"></a>
(Preview) Deactivates a model deployment to safely take the model offline.

**Usage:**

`aidp mlops deactivate-model-deployment --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`DeactivateModelDeploymentDetails`):**
- `deployment_id` (string, required) — ID of the deployment to deactivate.
- `message` (string, optional) — Optional deployment deactivation message. At most 2000 characters and 2000 UTF-8 bytes.

**Example:**
```json
{
  "deployment_id": "<string>",
  "message": "<string>"
}
```
---
**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops delete-experiment`
<a id="mlops-delete-experiment"></a>
(Preview) Deletes an experiment.

**Usage:**

`aidp mlops delete-experiment <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`DeleteExperimentDetails`):**
- `experiment_id` (string, required) — Unique identifier for the experiment.
- `is_permanent` (boolean, optional) — If true, the experiment is permanently deleted from the database instead of being soft deleted. Permanent deletion is rejected if the experiment has any associated run. Defaults to false.

**Example:**
```json
{
  "experiment_id": "<string>",
  "is_permanent": true
}
```
---
**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops delete-experiment-run`
<a id="mlops-delete-experiment-run"></a>
(Preview) Deletes an experiment run.

**Usage:**

`aidp mlops delete-experiment-run <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`DeleteExperimentRunDetails`):**
- `is_permanent` (boolean, optional) — If true, the run is permanently deleted from the database instead of being soft deleted. Defaults to false.
- `run_id` (string, required) — Unique identifier for the run.

**Example:**
```json
{
  "is_permanent": true,
  "run_id": "<string>"
}
```
---
**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops delete-experiment-run-tag`
<a id="mlops-delete-experiment-run-tag"></a>
(Preview) Deletes a tag on an experiment run.

**Usage:**

`aidp mlops delete-experiment-run-tag <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`DeleteExperimentRunTagDetails`):**
- `key` (string, required) — Key of the run tag.
- `run_id` (string, required) — Unique identifier for the run.

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

`aidp mlops delete-experiment-tag <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`DeleteExperimentTagDetails`):**
- `experiment_id` (string, required) — Unique identifier for the experiment.
- `key` (string, required) — Key of the experiment tag.

**Example:**
```json
{
  "experiment_id": "<string>",
  "key": "<string>"
}
```
---
**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops delete-model-deployment`
<a id="mlops-delete-model-deployment"></a>
(Preview) Deletes a model deployment that is not active.

**Usage:**

`aidp mlops delete-model-deployment --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`DeleteModelDeploymentDetails`):**
- `deployment_id` (string, required) — ID of the deployment to delete.

**Example:**
```json
{
  "deployment_id": "<string>"
}
```
---
**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops delete-model-version`
<a id="mlops-delete-model-version"></a>
(Preview) Deletes a model version.

**Usage:**

`aidp mlops delete-model-version --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`DeleteModelVersionDetails`):**
- `name` (string, required) — Name of the registered model.
- `version` (string, required) — Model version number.

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

`aidp mlops delete-model-version-tag --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`DeleteModelVersionTagDetails`):**
- `key` (string, required) — Tag key.
- `name` (string, required) — Name of the registered model.
- `version` (string, required) — Model version number.

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

`aidp mlops delete-registered-model --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`DeleteRegisteredModelDetails`):**
- `name` (string, required) — Name of the registered model.

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

`aidp mlops delete-registered-model-tag --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`DeleteRegisteredModelTagDetails`):**
- `key` (string, required) — Tag key.
- `name` (string, required) — Name of the registered model.

**Example:**
```json
{
  "key": "<string>",
  "name": "<string>"
}
```
---
**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops export-model-deployment-inferences`
<a id="mlops-export-model-deployment-inferences"></a>
(Preview) Starts an asynchronous export of the correlated inference invocation records in the requested publish-time window to a JSON file in a Volume.
(Preview) Starts an asynchronous export of the correlated inference invocation records in the requested publish-time window to a JSON file in a Volume. The window defaults to the last 30 days and must not exceed 30 days; export a longer history as consecutive windows. The export runs as a tracked asynchronous operation; a second export to the same destination while one is in progress is rejected with 409.

**Usage:**

`aidp mlops export-model-deployment-inferences <DEPLOYMENT-ID> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `deployment-id` (string, required) — The unique 32-character hexadecimal ID of the model deployment.
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`ExportInferenceInvocationsDetails`):**
- `filters` (object, optional) —
- `is_overwrite` (boolean, optional) — Whether an existing destination file may be replaced in place. Defaults to false, in which case the existing file is preserved and _copy is appended before the extension until the name is free; the resolved path is returned in the aidp-export-destination response header. The request is rejected only when the requested name and its first 10 generated alternatives are all taken.
- `timeEnd` (datetime, optional) — End of the exported publish-time window (RFC 3339, exclusive). Defaults to the current time. Must not be in the future. Body timestamps require millisecond precision. Example: 2026-10-01T00:00:00.000Z.
- `timeStart` (datetime, optional) — Start of the exported publish-time window (RFC 3339, inclusive). Defaults to 30 days before timeEnd. The window must not exceed 30 days; export a longer history as consecutive windows. Body timestamps require millisecond precision. Example: 2026-09-01T00:00:00.000Z.
- `volume_location` (string, required) — Destination JSON file, as /Volumes/<catalog>/<schema>/<volume>/<path>.json. The caller must have write access to the destination volume. If the file already exists it is preserved and the export is written to a non-colliding name instead, unless is_overwrite is true. The path actually written is returned in the aidp-export-destination response header.

**Example:**
```json
{
  "filters": {},
  "is_overwrite": true,
  "timeEnd": "<string>",
  "timeStart": "<string>",
  "volume_location": "<string>"
}
```

**Request Body (`ExportInferenceInvocationsFilters`):**
- `model_version` (string, optional) — Only export invocations served by this model version. Accepted for forward compatibility; producer records do not carry a model version yet, so this filter currently matches no records.
- `request_uri` (string, optional) — Only export invocations whose request URI exactly matches this value.
- `status` (string, optional) — Only export invocations with this outcome. Accepts every status the export emits, including MALFORMED (a 4xx response) and UNKNOWN (no status code on the response event). Allowed values: SUCCESS, MALFORMED, FAILED, UNKNOWN.

**Example:**
```json
{
  "model_version": "<string>",
  "request_uri": "<string>",
  "status": "SUCCESS"
}
```
---
**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops get-deployment-log`
<a id="mlops-get-deployment-log"></a>
(Preview) Returns one deployment log event with its full, redacted message, located by the opaque expiring locator returned from a log search.

**Usage:**

`aidp mlops get-deployment-log <DEPLOYMENT-ID> <LOG-ID> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `deployment-id` (string, required) — The unique 32-character hexadecimal ID of the model deployment.
- `log-id` (string, required) — The opaque, expiring log locator returned by a deployment log search. It binds the platform, deployment, and source event identity, and grants no permission by itself.
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops get-experiment-by-id`
<a id="mlops-get-experiment-by-id"></a>
(Preview) Returns metadata for an experiment by ID.
(Preview) Returns metadata for an experiment by ID. This method works on deleted experiments.

**Usage:**

`aidp mlops get-experiment-by-id <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --experiment-id <experiment-id>`

**Path Arguments:**
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

`aidp mlops get-experiment-by-name <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --experiment-name <experiment-name>`

**Path Arguments:**
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

`aidp mlops get-experiment-run-by-id <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --run-id <run-id>`

**Path Arguments:**
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

`aidp mlops get-experiment-run-metric-history <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --run-id <run-id> --metric-key <metric-key>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `run-id` (string, required) — ID of the run metric history to fetch.
- `metric-key` (string, required) — Name of the metric key.
- `page-token` (string, optional) — Pagination token to go to the next page of metric history.
- `max-results` (integer, optional) — Maximum number of logged instances of a metric for a run to return per call. Backend servers may restrict the value of max_results depending on performance requirements. Requests that do not specify this value will behave as non-paginated queries where all metric history values for a given metric within a run are returned in a single response.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops get-model-deployment`
<a id="mlops-get-model-deployment"></a>
(Preview) Returns details for a specified model deployment.

**Usage:**

`aidp mlops get-model-deployment --instance-id <AI-DATA-PLATFORM-ID> --deployment-id <deployment-id>`

**Options:**
- `deployment-id` (string, required) — The unique 32-character hexadecimal ID of the model deployment.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops get-model-deployment-activity`
<a id="mlops-get-model-deployment-activity"></a>
(Preview) Returns the full detail for a single deployment activity, including the configuration snapshot and the comment.

**Usage:**

`aidp mlops get-model-deployment-activity --instance-id <AI-DATA-PLATFORM-ID> --activity-id <activity-id>`

**Options:**
- `activity-id` (string, required) — The unique 32-character hexadecimal ID of the deployment activity to retrieve.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops get-model-deployment-contract`
<a id="mlops-get-model-deployment-contract"></a>
(Preview) Returns the model contract (input/output signatures and a sample request) for the query-endpoint playground.

**Usage:**

`aidp mlops get-model-deployment-contract --instance-id <AI-DATA-PLATFORM-ID> --deployment-id <deployment-id>`

**Options:**
- `deployment-id` (string, required) — The unique 32-character hexadecimal ID of the model deployment.
- `model-version` (integer, optional) — The model version whose contract to return; when omitted the latest (highest) version on the deployment is used.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops get-model-deployment-inference-details`
<a id="mlops-get-model-deployment-inference-details"></a>
(Preview) Returns request and response payloads for one correlated inference invocation identified by its request ID.
(Preview) Returns request and response payloads for one correlated inference invocation identified by its request ID. The identifier contains forward slashes, so each slash must be percent-encoded as %2F in the path. Example requestId: abc123%2Fdef456%2F789abc.

**Usage:**

`aidp mlops get-model-deployment-inference-details <DEPLOYMENT-ID> <REQUEST-ID> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `deployment-id` (string, required) — The unique 32-character hexadecimal ID of the model deployment.
- `request-id` (string, required) — Request ID that identifies the inference invocation record, as returned in the requestId field of the search results. This value contains forward slashes, so each slash must be percent-encoded as %2F when the value is placed in the path. Example encoded value: abc123%2Fdef456%2F789abc.
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops get-model-deployment-inference-summary`
<a id="mlops-get-model-deployment-inference-summary"></a>
(Preview) Returns aggregate metrics for correlated request and response inference events within the requested timestamp range.
(Preview) Returns aggregate metrics for correlated request and response inference events within the requested timestamp range. Query parameters timeStart and timeEnd are optional; when omitted, the API uses the previous 24 hours. Any requested range must be within the most recent 14 days.

**Usage:**

`aidp mlops get-model-deployment-inference-summary <DEPLOYMENT-ID> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `deployment-id` (string, required) — The unique 32-character hexadecimal ID of the model deployment.
**Options:**
- `time-start` (datetime, optional) — Inclusive start of the request timestamp range. The range must be within the most recent 14 days. Example: 2026-09-01T00:00:00Z.
- `time-end` (datetime, optional) — Inclusive end of the request timestamp range. The range must be within the most recent 14 days. Example: 2026-09-15T00:00:00Z.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops get-model-version`
<a id="mlops-get-model-version"></a>
(Preview) Returns detailed information for a model version.

**Usage:**

`aidp mlops get-model-version --instance-id <AI-DATA-PLATFORM-ID> --name <name> --version <version>`

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

`aidp mlops get-registered-model --instance-id <AI-DATA-PLATFORM-ID> --name <name>`

**Options:**
- `name` (string, required) — Name of the registered model.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops get-registered-model-summary`
<a id="mlops-get-registered-model-summary"></a>
(Preview) Returns aggregate counts of the registered-model footprint within a catalog and schema.

**Usage:**

`aidp mlops get-registered-model-summary --instance-id <AI-DATA-PLATFORM-ID> --catalog <catalog> --schema <schema>`

**Options:**
- `catalog` (string, required) — Catalog whose registered-model footprint should be summarized.
- `schema` (string, required) — Schema (within the catalog) whose registered-model footprint should be summarized.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops list-artifacts`
<a id="mlops-list-artifacts"></a>
(Preview) Returns a list of artifacts.

**Usage:**

`aidp mlops list-artifacts <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --run-id <run-id>`

**Path Arguments:**
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

`aidp mlops list-experiment-runs <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`ListExperimentRunsDetails`):**
- `experiment_ids` (array, optional) — List of experiment IDs to search over.
- `filter` (string, optional) — A filter expression over params, metrics, and tags, that allows returning a subset of runs. The syntax is a subset of SQL that supports ANDing together binary operations between a param, metric, or tag and a constant. Example: metrics.rmse < 1 and params.model_class = 'LogisticRegression' You can select columns with special characters (hyphen, space, period, etc.) by using double quotes: metrics."model class" = 'LinearRegression' and tags."user-name" = 'Tomas' Supported operators are =, !=, >, >=, <, and <=.
- `max_results` (integer, optional) — Maximum number of runs desired. If unspecified, defaults to 1000. All servers are guaranteed to support a max_results threshold of at least 50,000 but may support more. Callers are encouraged to pass max_results explicitly and leverage page_token to iterate.
- `order_by` (array, optional) — List of columns to be ordered by, including attributes, params, metrics, and tags with an optional "DESC" or "ASC" annotation, where "ASC" is the default. Example: ["params.input DESC", "metrics.alpha ASC", "metrics.rmse"] Tiebreaks are done by start_time DESC followed by run_id for runs with the same start time (and this is the default ordering criterion if order_by is not provided).
- `page_token` (string, optional) — Token indicating the page of experiment runs to fetch.
- `run_view_type` (string, optional) — Qualifier for type of runs to be returned. If unspecified, returns only active runs. Allowed values: ACTIVE_ONLY, DELETED_ONLY, ALL.

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

`aidp mlops list-experiments <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`ListExperimentsDetails`):**
- `filter` (string, optional) — A filter expression over experiment attributes and tags that allows returning a subset of experiments. The syntax is a subset of SQL that supports ANDing together binary operations between an attribute or tag and a constant. Example: name LIKE 'test-%' AND tags.key = 'value' Columns with special characters (hyphen, space, period, etc.) can be selected using double quotes or backticks. Example: tags."extra-key" = 'value' or tags.`extra-key` = 'value' Supported operators are =, !=, LIKE, and ILIKE.
- `max_results` (integer, optional) — Maximum number of experiments desired. Servers may select a default. All servers are guaranteed to support a max_results threshold of at least 1,000 but may support more. Callers are encouraged to pass max_results explicitly and leverage page_token to iterate.
- `order_by` (array, optional) — List of columns for ordering search results, which can include experiment name and ID with an optional "DESC" or "ASC" annotation, where "ASC" is the default. Tiebreaks are done by experiment ID DESC.
- `page_token` (string, optional) — Token indicating the page of experiments to fetch.
- `view_type` (string, optional) — Qualifier for type of experiments to be returned. If unspecified, returns only active experiments. Allowed values: ACTIVE_ONLY, DELETED_ONLY, ALL.

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

`aidp mlops list-logged-models <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`ListLoggedModelsDetails`):**
- `experiment_ids` (array, optional) — Fetch logged-models under list of experiments.
- `filter` (string, optional) — A filter expression over logged-models attributes.
- `max_results` (integer, optional) — Maximum number of logged-models desired. Servers may select a default. Callers are encouraged to pass max_results explicitly and leverage page_token to iterate.
- `order_by` (array, optional) — List of attributes for ordering search results.
- `page_token` (string, optional) — Token indicating the page of logged-models to fetch.

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
- `ascending` (boolean, optional) — Whether the order is ascending.
- `field_name` (string, required) — Field name. Allowed values are creation_time.

**Example:**
```json
{
  "ascending": true,
  "field_name": "<string>"
}
```
---
**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops list-model-deployment-activities`
<a id="mlops-list-model-deployment-activities"></a>
(Preview) Returns the activity history for a model deployment.

**Usage:**

`aidp mlops list-model-deployment-activities --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`ListModelDeploymentActivitiesDetails`):**
- `deployment_id` (string, required) — ID of the deployment whose activities to list.
- `max_results` (integer, optional) — Maximum number of activities desired. Default is 100. Max threshold is 1000.
- `order_by` (array, optional) — List of columns for ordering search results, e.g. 'start_time DESC'.
- `page_token` (string, optional) — Token indicating the page of activities to fetch.
- `status` (string, optional) — A filter over activity status. Allowed values: SUCCESS, FAILURE.

**Example:**
```json
{
  "deployment_id": "<string>",
  "max_results": 0,
  "order_by": [],
  "page_token": "<string>",
  "status": "SUCCESS"
}
```
---
**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops list-model-versions`
<a id="mlops-list-model-versions"></a>
(Preview) Returns a list of model versions.

**Usage:**

`aidp mlops list-model-versions --instance-id <AI-DATA-PLATFORM-ID>`

**Options:**
- `filter` (string, optional) — String filter condition, like "name LIKE 'my-model-name'". Single boolean condition, with string values wrapped in single quotes.
- `max-results` (integer, optional) — Maximum number of model versions to retrieve.
- `page-token` (string, optional) — Pagination token to go to the next page based on a previous search query.
- `order-by` (string, optional) — List of columns to be ordered by including model name, version, stage with an optional "DESC" or "ASC" annotation, where "ASC" is the default. Tiebreaks are done by latest stage transition timestamp, followed by name ASC, followed by version DESC.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops list-registered-model-permissions`
<a id="mlops-list-registered-model-permissions"></a>
(Preview) Returns the users, groups, and roles granted READ, MANAGE, or ADMIN on a registered model.
(Preview) Returns the users, groups, and roles granted READ, MANAGE, or ADMIN on a registered model. Any caller who can view the model can read the list.

**Usage:**

`aidp mlops list-registered-model-permissions <REGISTERED-MODEL-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `registered-model-key` (string, required) — The fully-qualified registered model name in the format <catalog>.<schema>.<model>.
**Options:**
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Default order for displayName is ascending. Allowed values are: "timeCreated", "displayName"
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops list-registered-models`
<a id="mlops-list-registered-models"></a>
(Preview) Returns a list of registered models in a workspace.

**Usage:**

`aidp mlops list-registered-models --instance-id <AI-DATA-PLATFORM-ID>`

**Options:**
- `filter` (string, optional) — String filter condition, like "name LIKE 'my-model-name'". Interpreted in the backend automatically as "name LIKE '%my-model-name%'". Single boolean condition, with string values wrapped in single quotes.
- `max-results` (integer, optional) — Maximum number of models desired. Default is 100. Max threshold is 1000.
- `page-token` (string, optional) — Pagination token to go to the next page based on a previous search query.
- `order-by` (string, optional) — List of columns for ordering search results, which can include model name and last updated timestamp with an optional "DESC" or "ASC" annotation, where "ASC" is the default. Tiebreaks are done by model name ASC.
- `is-deployment-summary-enabled` (boolean, optional) — Whether to include the per-model deployment_summary (total_deployment and active_deployment) in each returned registered model. The summary is omitted from a model when it cannot be resolved, so an absent summary means "not requested or unavailable" rather than zero.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops log-experiment-run-batch`
<a id="mlops-log-experiment-run-batch"></a>
(Preview) Logs an experiment run batch.

**Usage:**

`aidp mlops log-experiment-run-batch <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`ExperimentRunMetric`):**
- `key` (string, optional) — Name of the metric.
- `step` (integer, optional) — Step at which to log the metric.
- `timestamp` (integer, optional) — Unix timestamp in milliseconds when this metric was recorded.
- `value` (number, optional) — Value of the metric.

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
- `key` (string, optional) — Key of the parameter.
- `value` (string, optional) — Value of the parameter.

**Example:**
```json
{
  "key": "<string>",
  "value": "<string>"
}
```

**Request Body (`ExperimentRunTag`):**
- `key` (string, optional) — Key of the run tag.
- `value` (string, optional) — Value of the run tag.

**Example:**
```json
{
  "key": "<string>",
  "value": "<string>"
}
```

**Request Body (`LogExperimentRunBatchDetails`):**
- `metrics` (array, optional) — Metrics to log.
- `params` (array, optional) — Params to log.
- `run_id` (string, required) — Unique identifier for the run.
- `tags` (array, optional) — Tags to log.

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

`aidp mlops log-experiment-run-inputs <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`Dataset`):**
- `digest` (string, required) — Digest (hash) of the dataset.
- `name` (string, required) — Name of the dataset.
- `profile` (string, optional) — Profile of the dataset.
- `schema` (string, optional) — Schema of the dataset.
- `source` (string, required) — URI or path to the dataset source.
- `source_type` (string, required) — Type of the dataset source.

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
- `tags` (array, optional) — Tags for the dataset input.

**Example:**
```json
{
  "dataset": {},
  "tags": []
}
```

**Request Body (`InputTag`):**
- `key` (string, required) — Key of the tag.
- `value` (string, required) — Value of the tag.

**Example:**
```json
{
  "key": "<string>",
  "value": "<string>"
}
```

**Request Body (`LogExperimentRunInputsDetails`):**
- `dataset_inputs` (array, optional) — Dataset inputs for the run.
- `run_id` (string, required) — Unique identifier for the run.

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

`aidp mlops log-experiment-run-metric <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`LogExperimentRunMetricDetails`):**
- `key` (string, required) — Name of the metric.
- `run_id` (string, required) — Unique identifier for the run.
- `step` (integer, optional) — Step at which to log the metric.
- `timestamp` (integer, required) — Unix timestamp in milliseconds when this metric being recorded.
- `value` (number, required) — Value of the metric.

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

`aidp mlops log-experiment-run-model <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`LogExperimentRunModelDetails`):**
- `model_json` (string, required) — Model file in JSON format
- `run_id` (string, required) — Unique identifier for the run.

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

`aidp mlops log-experiment-run-param <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`LogExperimentRunParamDetails`):**
- `key` (string, required) — Name of the param.
- `run_id` (string, required) — Unique identifier for the run.
- `value` (string, required) — Value of the param.

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

#### `aidp mlops manage-registered-model-permission`
<a id="mlops-manage-registered-model-permission"></a>
(Preview) Grants or revokes READ, MANAGE, or ADMIN on a registered model's dedicated volume.
(Preview) Grants or revokes READ, MANAGE, or ADMIN on a registered model's dedicated volume. The model-to-volume link is resolved on the server; no volume name is accepted from the client.

**Usage:**

`aidp mlops manage-registered-model-permission <REGISTERED-MODEL-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `registered-model-key` (string, required) — The fully-qualified registered model name in the format <catalog>.<schema>.<model>.
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`AssignRegisteredModelPermissionDetails`):**
- `assignees` (object, required) —
- `permissions` (array, required) — The permissions assigned to the assignees. Allowed values: READ, MANAGE, ADMIN.

**Example:**
```json
{
  "assignees": {},
  "permissions": [
    "READ"
  ]
}
```

**Request Body (`ManageRegisteredModelPermissionDetails`):**
- `assignRegisteredModelPermissionDetails` (object, optional) —
- `revokeRegisteredModelPermissionDetails` (object, optional) —

**Example:**
```json
{
  "assignRegisteredModelPermissionDetails": {},
  "revokeRegisteredModelPermissionDetails": {}
}
```

**Request Body (`PermissionAssignees`):**
- `targets` (array, required) — The names/ocids of the users, groups or roles.
- `type` (string, required) — Grantee type. Allowed values: USER, ROLE, GROUP.

**Example:**
```json
{
  "targets": [],
  "type": "USER"
}
```

**Request Body (`RevokeRegisteredModelPermissionDetails`):**
- `assignees` (object, required) —
- `permissions` (array, required) — The permissions revoked from the assignees. Allowed values: READ, MANAGE, ADMIN.

**Example:**
```json
{
  "assignees": {},
  "permissions": [
    "READ"
  ]
}
```
---
**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops rename-registered-model`
<a id="mlops-rename-registered-model"></a>
(Preview) Renames a registered model.

**Usage:**

`aidp mlops rename-registered-model --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`RenameRegisteredModelDetails`):**
- `name` (string, required) — Current name of the registered model.
- `new_name` (string, optional) — New name for the registered model.

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

`aidp mlops restore-experiment <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`RestoreExperimentDetails`):**
- `experiment_id` (string, required) — Unique identifier for the experiment.

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

`aidp mlops restore-experiment-run <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`RestoreExperimentRunDetails`):**
- `run_id` (string, required) — Unique identifier for the run.

**Example:**
```json
{
  "run_id": "<string>"
}
```
---
**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops roll-back-model-deployment`
<a id="mlops-roll-back-model-deployment"></a>
(Preview) Rolls an active model deployment back to a lower model version of the same registered model.

**Usage:**

`aidp mlops roll-back-model-deployment --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`DeploymentTarget`):**
- `model_version` (string, required) — Version number of the model version.
- `traffic_percentage` (integer, required) — Percentage of deployment traffic routed to this model version.

**Example:**
```json
{
  "model_version": "<string>",
  "traffic_percentage": 0
}
```

**Request Body (`RollBackModelDeploymentDetails`):**
- `deployment_id` (string, required) — ID of the deployment to roll back.
- `deployment_targets` (array, required) — The single target model version to roll back to (exactly one, at 100% traffic).
- `message` (string, optional) — Optional deployment roll-back message. At most 2000 characters and 2000 UTF-8 bytes.

**Example:**
```json
{
  "deployment_id": "<string>",
  "deployment_targets": [],
  "message": "<string>"
}
```
---
**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops roll-forward-model-deployment`
<a id="mlops-roll-forward-model-deployment"></a>
(Preview) Rolls an active model deployment forward to a higher model version of the same registered model.

**Usage:**

`aidp mlops roll-forward-model-deployment --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`DeploymentTarget`):**
- `model_version` (string, required) — Version number of the model version.
- `traffic_percentage` (integer, required) — Percentage of deployment traffic routed to this model version.

**Example:**
```json
{
  "model_version": "<string>",
  "traffic_percentage": 0
}
```

**Request Body (`RollForwardModelDeploymentDetails`):**
- `deployment_id` (string, required) — ID of the deployment to roll forward.
- `deployment_targets` (array, required) — The single target model version to roll forward to (exactly one, at 100% traffic).
- `message` (string, optional) — Optional deployment roll-forward message. At most 2000 characters and 2000 UTF-8 bytes.

**Example:**
```json
{
  "deployment_id": "<string>",
  "deployment_targets": [],
  "message": "<string>"
}
```
---
**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops search-deployment-logs`
<a id="mlops-search-deployment-logs"></a>
(Preview) Returns one page of deployment lifecycle log events for the model deployment, newest first, read live from OCI Logging.
(Preview) Returns one page of deployment lifecycle log events for the model deployment, newest first, read live from OCI Logging. No log content is persisted by the platform.

**Usage:**

`aidp mlops search-deployment-logs <DEPLOYMENT-ID> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `deployment-id` (string, required) — The unique 32-character hexadecimal ID of the model deployment.
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`SearchDeploymentLogsDetails`):**
- `levels` (array, optional) — Optional severity filter. Allowed values: DEBUG, INFO, WARNING, ERROR, CRITICAL, UNKNOWN; any other value is rejected with 400. An empty or absent array means all levels.
- `limit` (integer, optional) — Maximum rows per page.
- `opcRequestId` (string, optional) — Optional exact match on the original request identifier of a log event. Only events that carry a request identifier can match. Model deployment lifecycle events are not emitted per request and carry none, so this filter excludes them.
- `pageToken` (string, optional) — Opaque continuation token from a previous page. Bound to the platform, deployment, and query; expires.
- `replicaId` (string, optional) — Optional exact match on the emitting replica or source scope.
- `sortBy` (string, optional) — Sort column. Only TIMESTAMP is supported. Allowed values: TIMESTAMP.
- `sortOrder` (string, optional) — Sort order. Only DESC is supported. Allowed values: DESC.
- `timeEnd` (datetime, required) — End of the requested publish-time window (RFC 3339, exclusive). Must not be in the future.
- `timeStart` (datetime, required) — Start of the requested publish-time window (RFC 3339, inclusive).

**Example:**
```json
{
  "levels": [],
  "limit": 0,
  "opcRequestId": "<string>",
  "pageToken": "<string>",
  "replicaId": "<string>",
  "sortBy": "TIMESTAMP",
  "sortOrder": "DESC",
  "timeEnd": "<string>",
  "timeStart": "<string>"
}
```
---
**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops search-model-deployment-inferences`
<a id="mlops-search-model-deployment-inferences"></a>
(Preview) Returns paginated request and response-correlated inference invocation records for a model deployment.
(Preview) Returns paginated request and response-correlated inference invocation records for a model deployment. Each response contains at most 20 rows, OCI Logging pagination is used internally, and only the first 10,000 matching rows can be retrieved within a maximum 14-day range. When no time range is provided, the previous 24 hours is used.

**Usage:**

`aidp mlops search-model-deployment-inferences <DEPLOYMENT-ID> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `deployment-id` (string, required) — The unique 32-character hexadecimal ID of the model deployment.
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`InferenceInvocationSearchDetails`):**
- `modelVersion` (string, optional) — Restricts results to invocations served by this model version.
- `pageToken` (string, optional) — Opaque token from a previous response. It continues pagination of the filtered, correlated invocation rows.
- `requestUri` (string, optional) — Restricts results to invocations against this inference endpoint URI.
- `status` (string, optional) — Restricts results to correlated invocations with this status. Allowed values: SUCCESS, MALFORMED, FAILED, UNKNOWN.
- `timeEnd` (datetime, optional) — Inclusive request timestamp end. Defaults to current time when omitted. The range must be within the most recent 14 days. Body timestamps require millisecond precision. Example: 2026-09-15T00:00:00.000Z.
- `timeStart` (datetime, optional) — Inclusive request timestamp start. Defaults to current time minus 24 hours when omitted. The range must be within the most recent 14 days. Body timestamps require millisecond precision. Example: 2026-09-01T00:00:00.000Z.

**Example:**
```json
{
  "modelVersion": "<string>",
  "pageToken": "<string>",
  "requestUri": "<string>",
  "status": "SUCCESS",
  "timeEnd": "<string>",
  "timeStart": "<string>"
}
```
---
**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops search-model-deployments`
<a id="mlops-search-model-deployments"></a>
(Preview) Returns a list of model deployments matching the given criteria.

**Usage:**

`aidp mlops search-model-deployments --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`SearchModelDeploymentsDetails`):**
- `max_results` (integer, optional) — Maximum number of deployments desired. Default is 100. Max threshold is 1000.
- `model_name` (string, required) — A filter over the registered model name.
- `order_by` (array, optional) — List of columns for ordering search results, e.g. 'created_time DESC'.
- `page_token` (string, optional) — Token indicating the page of deployments to fetch.
- `status` (string, optional) — A filter over deployment status. Allowed values: INACTIVE, ACTIVATING, ACTIVE, DEACTIVATING, UPDATING.

**Example:**
```json
{
  "max_results": 0,
  "model_name": "<string>",
  "order_by": [],
  "page_token": "<string>",
  "status": "INACTIVE"
}
```
---
**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops set-experiment-run-tag`
<a id="mlops-set-experiment-run-tag"></a>
(Preview) Sets a tag on an experiment run.

**Usage:**

`aidp mlops set-experiment-run-tag <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`SetExperimentRunTagDetails`):**
- `key` (string, required) — Key of the run tag.
- `run_id` (string, required) — Unique identifier for the run.
- `value` (string, required) — Value of the run tag.

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

`aidp mlops set-experiment-tag <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`SetExperimentTagDetails`):**
- `experiment_id` (string, required) — Unique identifier for the experiment.
- `key` (string, required) — Key of the experiment tag.
- `value` (string, required) — Value of the experiment tag.

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

`aidp mlops set-model-version-tag --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`SetModelVersionTagDetails`):**
- `key` (string, required) — Tag key.
- `name` (string, required) — Name of the registered model.
- `value` (string, required) — Tag value.
- `version` (string, required) — Model version number.

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

`aidp mlops set-registered-model-tag --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`SetRegisteredModelTagDetails`):**
- `key` (string, required) — Tag key.
- `name` (string, required) — Name of the registered model.
- `value` (string, required) — Tag value.

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

`aidp mlops transition-model-version-stage --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`TransitionModelVersionStageDetails`):**
- `archive_existing_versions` (boolean, required) — Whether to archive existing versions in the target stage.
- `name` (string, required) — Name of the registered model.
- `stage` (string, required) — New stage for the model version.
- `version` (string, required) — Model’s version number.

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

`aidp mlops update-experiment <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`UpdateExperimentDetails`):**
- `experiment_id` (string, required) — Unique identifier for the experiment.
- `new_name` (string, optional) — If provided, name of the experiment is changed to the new name. The new name must be unique.

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

`aidp mlops update-experiment-run <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`UpdateExperimentRunDetails`):**
- `end_time` (integer, optional) — Unix timestamp in milliseconds when the run ended.
- `run_id` (string, required) — Unique identifier for the run.
- `run_name` (string, optional) — Updated name of the run.
- `status` (string, optional) — Updated status of the run. Allowed values: RUNNING, SCHEDULED, FINISHED, FAILED, KILLED, INTERNAL_ERROR.

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

`aidp mlops update-experiment-run-tags <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`ExperimentRunTag`):**
- `key` (string, optional) — Key of the run tag.
- `value` (string, optional) — Value of the run tag.

**Example:**
```json
{
  "key": "<string>",
  "value": "<string>"
}
```

**Request Body (`ExperimentRunTagKey`):**
- `key` (string, required) — Tag key.

**Example:**
```json
{
  "key": "<string>"
}
```

**Request Body (`UpdateExperimentRunTagsDetails`):**
- `delete_tags` (array, optional) — ExperimentRun tags to delete
- `run_id` (string, required) — Unique identifier for the run.
- `set_tags` (array, optional) — ExperimentRun tags to set

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

`aidp mlops update-experiment-tags <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`ExperimentTag`):**
- `key` (string, required) — Key of the experiment tag.
- `value` (string, optional) — Value of the experiment tag.

**Example:**
```json
{
  "key": "<string>",
  "value": "<string>"
}
```

**Request Body (`ExperimentTagKey`):**
- `key` (string, required) — Tag key.

**Example:**
```json
{
  "key": "<string>"
}
```

**Request Body (`UpdateExperimentTagsDetails`):**
- `delete_tags` (array, optional) — Experiment tags to delete.
- `experiment_id` (string, required) — Unique identifier for the experiment.
- `set_tags` (array, optional) — Experiment tags to set.

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

#### `aidp mlops update-model-deployment`
<a id="mlops-update-model-deployment"></a>
(Preview) Updates a model deployment.

**Usage:**

`aidp mlops update-model-deployment --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`DeploymentOAuthDetails`):**
- `audienceClaim` (array, required) — OAuth audience claims (aud) the query endpoint accepts. Entries must be unique.
- `issuerClaim` (string, required) — OAuth issuer claim (iss) the query endpoint requires. An https URI whose host is a fully qualified domain name, not an IP literal in any notation, and which carries no userinfo and no fragment.
- `jwksUri` (string, required) — URI the gateway retrieves the signing keys (JWKS) from. An https URI whose host is a fully qualified domain name, not an IP literal in any notation, and which carries no userinfo and no fragment. A query string and a non-default port are permitted: published provider JWKS endpoints use both.

**Example:**
```json
{
  "audienceClaim": [],
  "issuerClaim": "<string>",
  "jwksUri": "<string>"
}
```

**Request Body (`DeploymentTarget`):**
- `model_version` (string, required) — Version number of the model version.
- `traffic_percentage` (integer, required) — Percentage of deployment traffic routed to this model version.

**Example:**
```json
{
  "model_version": "<string>",
  "traffic_percentage": 0
}
```

**Request Body (`UpdateModelDeploymentDetails`):**
- `authDetails` (object, optional) —
- `authType` (string, optional) — Authentication mechanism for the deployment's query endpoint. Required when authDetails is provided. Cannot be changed while the deployment is ACTIVE. Allowed values: AIDP, OAUTH.
- `computeKey` (string, required) — Compute key of the deployment. At most 255 characters and 255 UTF-8 bytes.
- `deployment_id` (string, required) — ID of the deployment.
- `deployment_targets` (array, optional) — Model versions served by the deployment. Immutable through update (use roll-forward/roll-back); accepted here only when unchanged.
- `description` (string, optional) — Description of the deployment. At most 2000 characters and 2000 UTF-8 bytes.
- `name` (string, required) — Name of the deployment. At most 255 characters and 255 UTF-8 bytes.
- `workspaceKey` (string, required) — Workspace key of the deployment. At most 255 characters and 255 UTF-8 bytes.

**Example:**
```json
{
  "authDetails": {},
  "authType": "AIDP",
  "computeKey": "<string>",
  "deployment_id": "<string>",
  "deployment_targets": [],
  "description": "<string>",
  "name": "<string>",
  "workspaceKey": "<string>"
}
```
---
**Return:** [Back to Mlops](#mlops) • [Top](#top)

#### `aidp mlops update-model-deployment-tags`
<a id="mlops-update-model-deployment-tags"></a>
(Preview) Updates tags on a model deployment.

**Usage:**

`aidp mlops update-model-deployment-tags --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`ModelDeploymentTag`):**
- `key` (string, required) — Key of the model deployment tag. At most 250 characters and 250 UTF-8 bytes.
- `value` (string, optional) — Value of the model deployment tag. At most 5000 characters and 5000 UTF-8 bytes.

**Example:**
```json
{
  "key": "<string>",
  "value": "<string>"
}
```

**Request Body (`ModelDeploymentTagKey`):**
- `key` (string, required) — Tag key. At most 250 characters and 250 UTF-8 bytes.

**Example:**
```json
{
  "key": "<string>"
}
```

**Request Body (`UpdateModelDeploymentTagsDetails`):**
- `delete_tags` (array, optional) — Model deployment tags to delete.
- `deployment_id` (string, required) — ID of the deployment.
- `set_tags` (array, optional) — Model deployment tags to set.

**Example:**
```json
{
  "delete_tags": [],
  "deployment_id": "<string>",
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

`aidp mlops update-model-version --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`UpdateModelVersionDetails`):**
- `description` (string, optional) — New description for the model version.
- `name` (string, required) — Name of the registered model.
- `version` (string, required) — Model version number.

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

`aidp mlops update-model-version-tags --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`ModelVersionTag`):**
- `key` (string, optional) — Key of the tag.
- `value` (string, optional) — Value of the tag.

**Example:**
```json
{
  "key": "<string>",
  "value": "<string>"
}
```

**Request Body (`ModelVersionTagKey`):**
- `key` (string, required) — Tag key.

**Example:**
```json
{
  "key": "<string>"
}
```

**Request Body (`UpdateModelVersionTagsDetails`):**
- `delete_tags` (array, optional) — Model version tags to delete.
- `name` (string, required) — Name of the registered model.
- `set_tags` (array, optional) — Model version tags to set.
- `version` (string, required) — Model version number.

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

`aidp mlops update-registered-model --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`UpdateRegisteredModelDetails`):**
- `deployment_job_id` (string, optional) — Deployment job id for this model.
- `description` (string, optional) — Description for the registered model.
- `name` (string, required) — Registered model unique name.

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

`aidp mlops update-registered-model-tags --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`RegisteredModelTag`):**
- `key` (string, optional) — Key of the registered model tag.
- `value` (string, optional) — Value of the registered model tag.

**Example:**
```json
{
  "key": "<string>",
  "value": "<string>"
}
```

**Request Body (`RegisteredModelTagKey`):**
- `key` (string, required) — Tag key.

**Example:**
```json
{
  "key": "<string>"
}
```

**Request Body (`UpdateRegisteredModelTagsDetails`):**
- `delete_tags` (array, optional) — Registered model tags to delete.
- `name` (string, required) — Name of the registered model.
- `set_tags` (array, optional) — Registered model tags to set.

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

`aidp notebook create-content <WORKSPACE-KEY> <CONTENT-PATH> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `content-path` (string, required) — The path to the notebook file.
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `datalake-tenant-id` (string, optional) — The tenant ID header.

**Request Body (`CreateContentDetails`):**
- `content` (object, optional) — Base64-encoded notebook content chunk when upload_id is supplied.
- `copy_from` (string, optional) — Copy from Path. For example, /path/to/OtherNotebook.ipynb.
- `ext` (string, optional) — File format extension
- `format` (string, optional) — Content format. Chunked notebook uploads require json. Allowed values: json.
- `sha256` (string, optional) — SHA-256 digest of the complete decoded notebook content.
- `total_chunks` (integer, optional) — Total request chunks, including the final chunk.
- `total_size_bytes` (integer, optional) — Total decoded notebook bytes.
- `type` (string, optional) — Type of Content model. Either notebook, file, or directory.
- `upload_chunk_index` (integer, optional) — One-based upload chunk index, or -1 for the final upload chunk.
- `upload_id` (string, optional) — UI-generated UUID that identifies one notebook upload.

**Example:**
```json
{
  "content": {},
  "copy_from": "<string>",
  "ext": "<string>",
  "format": "json",
  "sha256": "<string>",
  "total_chunks": 0,
  "total_size_bytes": 0,
  "type": "<string>",
  "upload_chunk_index": 0,
  "upload_id": "<string>"
}
```
---
**Return:** [Back to Notebook](#notebook) • [Top](#top)

#### `aidp notebook create-session`
<a id="notebook-create-session"></a>
Creates a new session or returns an existing session if a session for the given path already exists.

**Usage:**

`aidp notebook create-session <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `datalake-tenant-id` (string, optional) — The tenant ID header.

**Request Body (`CreateSessionDetails`):**
- `agentFlowKey` (string, optional) — Key of the agent flow.
- `cluster_id` (string, optional) — Cluster ID.
- `id` (string, optional) — UUID of the session.
- `kernel` (object, optional) —
- `name` (string, optional) — A user-friendly name for the session.
- `path` (string, optional) — Path to the session. A directory where notebook server is started and where notebooks are saved. For example, /data/test.ipynb.
- `type` (string, optional) — Type of session.

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
- `connections` (integer, optional) — The number of active connections to this kernel.
- `execution_state` (string, optional) — Current execution state of Kernel (typically 'idle' or 'busy', but may be other values, such as 'starting'). Added in notebook server 5.0. Allowed values: unknown, starting, idle, busy, terminating, restarting, autorestarting, dead.
- `id` (string, optional) — UUID of kernel.
- `last_activity` (string, optional) — ISO 8601 timestamp for last-seen activity on this kernel. Use this in combination with execution_state == 'idle' to identify which kernels have been idle since a given time. Timestamps will be UTC, indicated 'Z' suffix.
- `name` (string, optional) — Kernel spec name. (Example python3)

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

`aidp notebook delete-content <WORKSPACE-KEY> <CONTENT-PATH> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp notebook delete-session <WORKSPACE-KEY> <SESSION-ID> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp notebook export-contents <WORKSPACE-KEY> <CONTENT-PATH> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `content-path` (string, required) — The path to the notebook file.
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`ExportContentsDetails`):**
- `format` (string, optional) — The format in which contents should be exported, supported formats are HTML and ipynb only. Allowed values: ipynb, html.

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
Returns content for a given file or metadata for a directory.
Returns content for a given file or metadata for a directory. Directory content listing is not supported; requests with type=directory and content=1 return 400 and should use content=0 to retrieve directory metadata. You can optionally specify a type and/or format argument via URL parameter. When given, the Content service returns a model in the requested type and/or format. If the request cannot be satisfied, for example if type=text is requested, but the file is binary, then the request returns a 400 message and a JSON response with a Reason field identifying the issue. The value of the Reason field is ‘bad format’ or ‘bad type’, depending on what was requested.

**Usage:**

`aidp notebook get-content <WORKSPACE-KEY> <CONTENT-PATH> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp notebook get-session <WORKSPACE-KEY> <SESSION-ID> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp notebook list-sessions <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `cluster-id` (string, optional) — Cluster ID attached to a session.
- `path` (string, optional) — Notebook file path attached to a session.
- `agent-flow-key` (string, optional) — Agent flow key of the attached agent flow.
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. Default order for timeCreated is descending. Allowed values are: "timeCreated"
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Notebook](#notebook) • [Top](#top)

#### `aidp notebook modify-content`
<a id="notebook-modify-content"></a>
Renames a file or directory without re-uploading content.

**Usage:**

`aidp notebook modify-content <WORKSPACE-KEY> <CONTENT-PATH> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `content-path` (string, required) — The path to the notebook file.
**Options:**
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`ModifyContentDetails`):**
- `path` (string, optional) — New path for file or directory

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

`aidp notebook patch-session <WORKSPACE-KEY> <SESSION-ID> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `session-id` (string, required) — The ID of the Data Lake Notebook Session
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`Kernel`):**
- `connections` (integer, optional) — The number of active connections to this kernel.
- `execution_state` (string, optional) — Current execution state of Kernel (typically 'idle' or 'busy', but may be other values, such as 'starting'). Added in notebook server 5.0. Allowed values: unknown, starting, idle, busy, terminating, restarting, autorestarting, dead.
- `id` (string, optional) — UUID of kernel.
- `last_activity` (string, optional) — ISO 8601 timestamp for last-seen activity on this kernel. Use this in combination with execution_state == 'idle' to identify which kernels have been idle since a given time. Timestamps will be UTC, indicated 'Z' suffix.
- `name` (string, optional) — Kernel spec name. (Example python3)

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
- `cluster_id` (string, optional) — Cluster ID.
- `id` (string, optional) — UUID of the session.
- `kernel` (object, optional) —
- `must_refresh_context` (boolean, optional) — Set as True, if a new execution context is needed.
- `name` (string, optional) — A user-friendly name for the session.
- `path` (string, optional) — Path to the session. A directory where notebook server is started and where notebooks are saved. For example, /data/test.ipynb.
- `type` (string, optional) — Type of session.

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

`aidp notebook update-content <WORKSPACE-KEY> <CONTENT-PATH> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `content-path` (string, required) — The path to the notebook file.
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`UpdateContentDetails`):**
- `content` (object, optional) — Content if requested (otherwise null). For Notebook model, this contains a nbformat NotebookNode representing the .ipynb file represented by the model. For File model, content field is always of type unicode. For text-format file models, content simply contains the file’s bytes after decoding as UTF-8. Non-text (base64) files are read as bytes, base64 encoded, and then decoded as UTF-8. For Directory model, content field contains a list of content-free models representing the entities in the directory.
- `format` (string, optional) — Format of content. For Notebook model, format field is always JSON. For File model, format field is either Text or Base64. For Directory model, format field is always JSON. Allowed values: NULL, json, text, base64.
- `name` (string, optional) — Name of notebook, file or directory, equivalent to the last part of the path
- `path` (string, optional) — Full path for notebook, file, or directory.
- `sha256` (string, optional) — SHA-256 digest of the complete decoded notebook content.
- `total_chunks` (integer, optional) — Total request chunks, including the final chunk.
- `total_size_bytes` (integer, optional) — Total decoded notebook bytes.
- `type` (string, optional) — Type of Content model. Allowed values: notebook, file, directory.
- `upload_chunk_index` (integer, optional) — One-based upload chunk index, or -1 for the final upload chunk.
- `upload_id` (string, optional) — UI-generated UUID that identifies one notebook upload.

**Example:**
```json
{
  "content": {},
  "format": "NULL",
  "name": "<string>",
  "path": "<string>",
  "sha256": "<string>",
  "total_chunks": 0,
  "total_size_bytes": 0,
  "type": "notebook",
  "upload_chunk_index": 0,
  "upload_id": "<string>"
}
```
---
**Return:** [Back to Notebook](#notebook) • [Top](#top)

## <a id="private-network-profile"></a>Private Network Profile
Private network profiles.
**Command Index:**
- [private-network-profile create](#private-network-profile-create)
- [private-network-profile delete](#private-network-profile-delete)
- [private-network-profile get](#private-network-profile-get)
- [private-network-profile list](#private-network-profile-list)
- [private-network-profile update](#private-network-profile-update)
### Commands

#### `aidp private-network-profile create`
<a id="private-network-profile-create"></a>
Creates a reusable private network profile for Git repositories in an AI data platform.

**Usage:**

`aidp private-network-profile create --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`CreatePrivateNetworkProfileDetails`):**
- `customerCompartmentId` (string, required) — Customer compartment identifier containing the private network resources.
- `customerSubnetId` (string, required) — Customer subnet identifier used for Git connectivity.
- `customerVcnId` (string, required) — Customer VCN identifier used for Git connectivity.
- `description` (string, optional) — Optional description of the Git connectivity profile.
- `name` (string, required) — Display name of the Git connectivity profile.

**Example:**
```json
{
  "customerCompartmentId": "<string>",
  "customerSubnetId": "<string>",
  "customerVcnId": "<string>",
  "description": "<string>",
  "name": "<string>"
}
```
---
**Return:** [Back to Private-Network-Profile](#private-network-profile) • [Top](#top)

#### `aidp private-network-profile delete`
<a id="private-network-profile-delete"></a>
Deletes an unused private network profile from an AI data platform.

**Usage:**

`aidp private-network-profile delete <PRIVATE-NETWORK-PROFILE-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `private-network-profile-key` (string, required) — The private network profile key.
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Private-Network-Profile](#private-network-profile) • [Top](#top)

#### `aidp private-network-profile get`
<a id="private-network-profile-get"></a>
Returns a private network profile for the requested AI data platform.

**Usage:**

`aidp private-network-profile get <PRIVATE-NETWORK-PROFILE-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `private-network-profile-key` (string, required) — The private network profile key.
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Private-Network-Profile](#private-network-profile) • [Top](#top)

#### `aidp private-network-profile list`
<a id="private-network-profile-list"></a>
Returns private network profile summaries for the requested AI data platform.

**Usage:**

`aidp private-network-profile list --instance-id <AI-DATA-PLATFORM-ID>`

**Options:**
- `name` (string, optional) — An exact-name filter for private network profiles.
- `lifecycle-state` (string, optional) — A filter to return only private network profiles with the given lifecycle state. Allowed values are: "CREATING", "ACTIVE", "DELETING", "FAILED"
- `display-name-contains` (string, optional) — A filter to return only resources that have a display name containing the text provided.
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
- `page` (string, optional) — For list pagination. The value of the opc-next-page response header from the previous "List" call. For important details about how pagination works, see List Pagination.
- `sort-order` (string, optional) — The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: "ASC", "DESC"
- `sort-by` (string, optional) — The field to sort by. You can provide only one sort order. The default order for timeCreated is descending. Allowed values are: "timeCreated"
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Private-Network-Profile](#private-network-profile) • [Top](#top)

#### `aidp private-network-profile update`
<a id="private-network-profile-update"></a>
Updates selected fields of a reusable private network profile in an AI data platform.

**Usage:**

`aidp private-network-profile update <PRIVATE-NETWORK-PROFILE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `private-network-profile-key` (string, required) — The private network profile key.
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`UpdatePrivateNetworkProfileDetails`):**
- `customerCompartmentId` (string, optional) — Updated customer compartment identifier containing the private network resources.
- `customerSubnetId` (string, optional) — Updated customer subnet identifier used for Git connectivity.
- `customerVcnId` (string, optional) — Updated customer VCN identifier used for Git connectivity.
- `description` (string, optional) — Updated profile description. An empty value clears the description.
- `name` (string, optional) — Updated display name of the Git connectivity profile.

**Example:**
```json
{
  "customerCompartmentId": "<string>",
  "customerSubnetId": "<string>",
  "customerVcnId": "<string>",
  "description": "<string>",
  "name": "<string>"
}
```
---
**Return:** [Back to Private-Network-Profile](#private-network-profile) • [Top](#top)

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

`aidp role add-member <ROLE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `role-key` (string, required) — The unique key of the Role.
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`AddMemberToRoleDetails`):**
- `assignees` (array, required) — The assignees on the role.

**Example:**
```json
{
  "assignees": []
}
```

**Request Body (`RoleAssignee`):**
- `target` (string, required) — The OCID for a principal or role.
- `targetName` (string, optional) — The name for a principal or role.
- `type` (string, required) — assignee type. Allowed values: USER, ROLE, GROUP.

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

`aidp role create --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`CreateRoleDetails`):**
- `description` (string, optional) — The description of the role.
- `displayName` (string, required) — The role name, it can be changed. No special characters except for “_”. Case insensitive.

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

`aidp role delete <ROLE-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp role get <ROLE-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp role list --instance-id <AI-DATA-PLATFORM-ID>`

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

`aidp role list-permissions <ROLE-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp role remove-member <ROLE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `role-key` (string, required) — The unique key of the Role.
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`RemoveMemberFromRoleDetails`):**
- `assignees` (array, required) — The assignees on the role.

**Example:**
```json
{
  "assignees": []
}
```

**Request Body (`RoleAssignee`):**
- `target` (string, required) — The OCID for a principal or role.
- `targetName` (string, optional) — The name for a principal or role.
- `type` (string, required) — assignee type. Allowed values: USER, ROLE, GROUP.

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

`aidp role update <ROLE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `role-key` (string, required) — The unique key of the Role.
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`UpdateRoleDetails`):**
- `description` (string, optional) — The description of the role.
- `displayName` (string, optional) — The role name, it can be changed. No special characters except for “_”. Case insensitive.

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

`aidp schema create --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`CreateSchemaDetails`):**
- `catalogName` (string, required) — The name of the catalog to which this schema belongs.
- `description` (string, optional) — Schema description.
- `displayName` (string, required) — Schema name.
- `properties` (object, optional) — Key-value pair representing a defined tag key and value.

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

`aidp schema create-data-table --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`CreateDataTableDetails`):**
- `catalogKey` (string, required) — The name of the catalog to which this table belongs.
- `description` (string, optional) — Table description.
- `displayName` (string, required) — Table name.
- `fileFormat` (string, required) — Format of the sample file from which data needs to be copied. Allowed values: AVRO, ORC, PARQUET, TEXTFILE, JSON, CSV, DELTA, ICEBERG.
- `managedTableDefinition` (object, required) —
- `objectStorageLocationPath` (string, required) — The file location from which table details will be used.
- `partitionKeys` (array, optional) — Columns to be used in partition for table.
- `schemaKey` (string, required) — The name of the schema to which this table belongs.
- `selectedColumns` (array, required) — The list of the columns from which data needs to be copied.
- `tableFields` (array, required) — Columns for table.
- `tableProperties` (array, optional) — Table properties.

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
- `managedTableDataFormat` (string, required) — Data format of the managed table. Allowed values: AVRO, ORC, PARQUET, TEXTFILE, JSON, CSV, DELTA, ICEBERG.

**Example:**
```json
{
  "managedTableDataFormat": "AVRO"
}
```

**Request Body (`TableFieldDetails`):**
- `fieldDescription` (string, optional) — Description of the column.
- `fieldName` (string, required) — Name of the column.
- `fieldPrecision` (string, optional) — Precision of the column.
- `fieldScale` (string, optional) — Scale of the column.
- `fieldType` (string, optional) — Type of the column.

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
- `propertyName` (string, required) — Property name.
- `propertyValue` (string, optional) — Property value.

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

`aidp schema create-table --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`CreateTableDetails`):**
- `catalogKey` (string, required) — The name of the catalog to which this table belongs.
- `description` (string, optional) — Table description.
- `displayName` (string, required) — Table name.
- `externalTableDefinition` (object, optional) —
- `managedTableDefinition` (object, optional) —
- `partitionKeys` (array, optional) — Columns to be used in partition for table.
- `schemaKey` (string, required) — The name of the schema to which this table belongs.
- `tableFields` (array, optional) — Columns for table.
- `tableProperties` (array, optional) — Table properties.
- `tableType` (string, required) — Type of table. Managed, external, mount or synonym table. Allowed values: MANAGED, EXTERNAL, SYNONYM.

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
- `externalTableDataFormat` (string, required) — External table data format. Allowed values: AVRO, ORC, PARQUET, TEXTFILE, JSON, CSV, DELTA, ICEBERG.
- `externalTableLocationType` (string, optional) — External table location type, either object store location or mount location. Allowed values: OBJECT_STORAGE, MOUNT.
- `objectStorageLocationPath` (string, optional) — The file location from which table properties are loaded.
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
- `managedTableDataFormat` (string, required) — Data format of the managed table. Allowed values: AVRO, ORC, PARQUET, TEXTFILE, JSON, CSV, DELTA, ICEBERG.

**Example:**
```json
{
  "managedTableDataFormat": "AVRO"
}
```

**Request Body (`TableFieldDetails`):**
- `fieldDescription` (string, optional) — Description of the column.
- `fieldName` (string, required) — Name of the column.
- `fieldPrecision` (string, optional) — Precision of the column.
- `fieldScale` (string, optional) — Scale of the column.
- `fieldType` (string, optional) — Type of the column.

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
- `propertyName` (string, required) — Property name.
- `propertyValue` (string, optional) — Property value.

**Example:**
```json
{
  "propertyName": "<string>",
  "propertyValue": "<string>"
}
```

**Request Body (`TxtFileDefinition`):**
- `delimiter` (string, optional) — Delimiter to be used with text file.
- `quote` (string, optional) — Type of quote to be used with text file.

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

`aidp schema create-view --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`CreateViewDetails`):**
- `catalogKey` (string, required) — The name of the catalog to which this view belongs.
- `description` (string, optional) — The description of the view.
- `displayName` (string, required) — A user-friendly name. Has to be unique within the scope of the schema and is changeable.
- `schemaKey` (string, required) — The name of the Schema to which this view belongs.
- `viewFields` (array, optional) — Columns for view.
- `viewProperties` (array, optional) — View Properties.
- `viewText` (string, required) — The Query used to create the view.

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
- `fieldDescription` (string, optional) — Description of the column.
- `fieldName` (string, required) — Name of the column.
- `fieldPrecision` (string, optional) — Precision of the column.
- `fieldScale` (string, optional) — Scale of the column.
- `fieldType` (string, optional) — Type of the column.

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
- `propertyName` (string, required) — Property name.
- `propertyValue` (string, optional) — Property value.

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

`aidp schema delete <SCHEMA-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp schema delete-table <TABLE-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp schema delete-view <VIEW-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp schema generate-temp-file-upload-target <SCHEMA-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp schema get <SCHEMA-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `schema-key` (string, required) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.
**Options:**
- `should-skip-ocid-translation` (boolean, optional) — When true, skip user OCID translation and return raw OCIDs.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---
**Return:** [Back to Schema](#schema) • [Top](#top)

#### `aidp schema get-table`
<a id="schema-get-table"></a>
Returns detailed information about a table.

**Usage:**

`aidp schema get-table <TABLE-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `table-key` (string, required) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.
**Options:**
- `should-skip-ocid-translation` (boolean, optional) — When true, skip user OCID translation and return raw OCIDs.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---
**Return:** [Back to Schema](#schema) • [Top](#top)

#### `aidp schema get-view`
<a id="schema-get-view"></a>
Returns information about a view.

**Usage:**

`aidp schema get-view <VIEW-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp schema infer <SCHEMA-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `schema-key` (string, required) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`InferSchemaProperties`):**
- `propertyName` (string, optional) — Name of the property.
- `propertyValue` (string, optional) — Property value.

**Example:**
```json
{
  "propertyName": "<string>",
  "propertyValue": "<string>"
}
```

**Request Body (`PerformInferSchemaDetails`):**
- `dataFormat` (string, required) — Data format of the schema location. Allowed values: AVRO, ORC, PARQUET, TEXTFILE, JSON, CSV, DELTA, ICEBERG.
- `inferSchemaProperties` (array, optional) — Properties which are needed for inferring schema.
- `location` (string, required) — Location of the table to infer schema.
- `numberOfPartitions` (integer, optional) — Number of root partition folders to scan.

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

`aidp schema infer-with-preview <SCHEMA-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `schema-key` (string, required) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`InferSchemaProperties`):**
- `propertyName` (string, optional) — Name of the property.
- `propertyValue` (string, optional) — Property value.

**Example:**
```json
{
  "propertyName": "<string>",
  "propertyValue": "<string>"
}
```

**Request Body (`PerformInferSchemaDetails`):**
- `dataFormat` (string, required) — Data format of the schema location. Allowed values: AVRO, ORC, PARQUET, TEXTFILE, JSON, CSV, DELTA, ICEBERG.
- `inferSchemaProperties` (array, optional) — Properties which are needed for inferring schema.
- `location` (string, required) — Location of the table to infer schema.
- `numberOfPartitions` (integer, optional) — Number of root partition folders to scan.

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

`aidp schema list --instance-id <AI-DATA-PLATFORM-ID> --catalog-key <catalog-key>`

**Options:**
- `catalog-key` (string, required) — The key of the catalog.
- `should-skip-ocid-translation` (boolean, optional) — When true, skip user OCID translation and return raw OCIDs.
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

`aidp schema list-permissions <SCHEMA-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp schema list-table-permissions <TABLE-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp schema list-tables --instance-id <AI-DATA-PLATFORM-ID> --catalog-key <catalog-key> --schema-key <schema-key>`

**Options:**
- `catalog-key` (string, required) — The key of the catalog.
- `should-skip-ocid-translation` (boolean, optional) — When true, skip user OCID translation and return raw OCIDs.
- `schema-key` (string, required) — The fully qualified name of the Data Lake Schema in the format <catalog_name>.<schema_name>
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `table-type` (string, optional) — Filters the response by table type. When omitted, existing ListTables behavior is preserved. Allowed values are: "MANAGED", "EXTERNAL", "SYNONYM"
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

`aidp schema list-view-permissions <VIEW-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp schema list-views --instance-id <AI-DATA-PLATFORM-ID> --catalog-key <catalog-key> --schema-key <schema-key>`

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

`aidp schema manage-permission <SCHEMA-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `schema-key` (string, required) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`AssignSchemaPermissionDetails`):**
- `assignees` (object, required) —
- `permissions` (array, required) — The permissions assigned to the assignees. Allowed values: SELECT, WRITE, CREATE_VIEW, CREATE_VOLUME, CREATE_TABLE, ADMIN, CREATE_KNOWLEDGE_BASE, CREATE_MODEL.

**Example:**
```json
{
  "assignees": {},
  "permissions": [
    "SELECT"
  ]
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
- `targets` (array, required) — The names/ocids of the users, groups or roles.
- `type` (string, required) — Grantee type. Allowed values: USER, ROLE, GROUP.

**Example:**
```json
{
  "targets": [],
  "type": "USER"
}
```

**Request Body (`RevokeSchemaPermissionDetails`):**
- `assignees` (object, required) —
- `permissions` (array, required) — The permissions revoked from the assignees. Allowed values: SELECT, WRITE, CREATE_VIEW, CREATE_VOLUME, CREATE_TABLE, ADMIN, CREATE_KNOWLEDGE_BASE, CREATE_MODEL.

**Example:**
```json
{
  "assignees": {},
  "permissions": [
    "SELECT"
  ]
}
```
---
**Return:** [Back to Schema](#schema) • [Top](#top)

#### `aidp schema manage-table-permission`
<a id="schema-manage-table-permission"></a>
Updates the permissions for a given table.

**Usage:**

`aidp schema manage-table-permission <TABLE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `table-key` (string, required) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`AssignTablePermissionDetails`):**
- `assignees` (object, required) —
- `excludeColumns` (array, required) — The list of columns to be excluded for the assigning of permissions.
- `includeColumns` (array, required) — The list of columns to be included for the assigning of permissions.
- `permissions` (array, required) — The permissions assigned to the assignees. Allowed values: SELECT, INSERT, UPDATE, DELETE, ALTER, ADMIN.
- `rowFilter` (string, optional) — Row filter expression applied while assigning table permissions.
- `rowFilterType` (string, optional) — Type of row filter expression. Allowed values: SQL.

**Example:**
```json
{
  "assignees": {},
  "excludeColumns": [],
  "includeColumns": [],
  "permissions": [
    "SELECT"
  ],
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
- `targets` (array, required) — The names/ocids of the users, groups or roles.
- `type` (string, required) — Grantee type. Allowed values: USER, ROLE, GROUP.

**Example:**
```json
{
  "targets": [],
  "type": "USER"
}
```

**Request Body (`RevokeTablePermissionDetails`):**
- `assignees` (object, required) —
- `excludeColumns` (array, required) — The list of columns to be excluded for the revoking of permissions.
- `includeColumns` (array, required) — The list of columns to be included for the revoking of permissions.
- `permissions` (array, required) — The permissions revoked from the assignee. Allowed values: SELECT, INSERT, UPDATE, DELETE, ALTER, ADMIN.
- `rowFilter` (string, optional) — Row filter expression applied while assigning table permissions.
- `rowFilterType` (string, optional) — Type of row filter expression. Allowed values: SQL.

**Example:**
```json
{
  "assignees": {},
  "excludeColumns": [],
  "includeColumns": [],
  "permissions": [
    "SELECT"
  ],
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

`aidp schema manage-view-permission <VIEW-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `view-key` (string, required) — The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>.
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`AssignViewPermissionDetails`):**
- `assignees` (object, required) —
- `excludeColumns` (array, required) — The list of columns to be excluded for the assigning of permissions.
- `includeColumns` (array, required) — The list of columns to be included for the assigning of permissions.
- `permissions` (array, required) — The permissions assigned to the assignees. Allowed values: SELECT, ALTER, ADMIN.

**Example:**
```json
{
  "assignees": {},
  "excludeColumns": [],
  "includeColumns": [],
  "permissions": [
    "SELECT"
  ]
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
- `targets` (array, required) — The names/ocids of the users, groups or roles.
- `type` (string, required) — Grantee type. Allowed values: USER, ROLE, GROUP.

**Example:**
```json
{
  "targets": [],
  "type": "USER"
}
```

**Request Body (`RevokeViewPermissionDetails`):**
- `assignees` (object, required) —
- `excludeColumns` (array, required) — The list of columns to be excluded for the revoking of permissions.
- `includeColumns` (array, required) — The list of columns to be included for the revoking of permissions.
- `permissions` (array, required) — The permissions revoked from the assignee. Allowed values: SELECT, ALTER, ADMIN.

**Example:**
```json
{
  "assignees": {},
  "excludeColumns": [],
  "includeColumns": [],
  "permissions": [
    "SELECT"
  ]
}
```
---
**Return:** [Back to Schema](#schema) • [Top](#top)

#### `aidp schema refresh`
<a id="schema-refresh"></a>
Refreshes schema through the crawler.

**Usage:**

`aidp schema refresh <SCHEMA-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp schema refresh-table <TABLE-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp schema retrieve-par <TABLE-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp schema update <SCHEMA-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `schema-key` (string, required) — The fully qualified name of the schema in the format <catalog_name>.<schema_name>.
**Options:**
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`UpdateSchemaDetails`):**
- `description` (string, optional) — Schema description.
- `displayName` (string, optional) — Schema name.
- `properties` (object, optional) — Key-value pair representing a defined tag key and value.

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

`aidp schema update-table <TABLE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `table-key` (string, required) — The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.
**Options:**
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`RenameTableFieldDetails`):**
- `fieldName` (string, required) — Name of the column.
- `updatedFieldName` (string, required) — Updated name of the column.

**Example:**
```json
{
  "fieldName": "<string>",
  "updatedFieldName": "<string>"
}
```

**Request Body (`TableFieldDetails`):**
- `fieldDescription` (string, optional) — Description of the column.
- `fieldName` (string, required) — Name of the column.
- `fieldPrecision` (string, optional) — Precision of the column.
- `fieldScale` (string, optional) — Scale of the column.
- `fieldType` (string, optional) — Type of the column.

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
- `propertyName` (string, required) — Property name.
- `propertyValue` (string, optional) — Property value.

**Example:**
```json
{
  "propertyName": "<string>",
  "propertyValue": "<string>"
}
```

**Request Body (`UpdateTableDetails`):**
- `addTableFields` (array, optional) — Columns for table.
- `addTableProperties` (array, optional) — Table properties.
- `description` (string, optional) — Table description.
- `displayName` (string, optional) — Table name.
- `dropTableFields` (array, optional) — Columns for table.
- `dropTableProperties` (array, optional) — Table properties.
- `renameTableFields` (array, optional) — Columns for table.
- `updateTableFields` (array, optional) — Update columns in table.

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
- `fieldDescription` (string, optional) — Description of the column.
- `fieldName` (string, required) — Name of the column.

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

`aidp schema update-view <VIEW-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `view-key` (string, required) — The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>.
**Options:**
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`UpdateViewDetails`):**
- `updateMode` (string, required) — The mode of update for a view. Allowed values: RENAME_VIEW, ADD_PROPERTIES, DROP_PROPERTIES, UPDATE_VIEW_DESCRIPTION, UPDATE_VIEW_QUERY, UPDATE_COLUMN_DESCRIPTION.
- `viewUpdateDetails` (object, optional) —

**Example:**
```json
{
  "updateMode": "RENAME_VIEW",
  "viewUpdateDetails": {}
}
```

**Request Body (`ViewFieldDetails`):**
- `fieldDescription` (string, optional) — Description of the column.
- `fieldName` (string, required) — Name of the column.
- `fieldPrecision` (string, optional) — Precision of the column.
- `fieldScale` (string, optional) — Scale of the column.
- `fieldType` (string, optional) — Type of the column.

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
- `propertyName` (string, required) — Property name.
- `propertyValue` (string, optional) — Property value.

**Example:**
```json
{
  "propertyName": "<string>",
  "propertyValue": "<string>"
}
```

**Request Body (`ViewUpdateDetails`):**
- `addViewProperties` (array, optional) — View Properties.
- `description` (string, optional) — The description of the view.
- `displayName` (string, optional) — A user-friendly name. Has to be unique within the scope of the schema and is changeable.
- `dropViewProperties` (array, optional) — View Properties.
- `viewFields` (array, optional) — Columns for view.
- `viewText` (string, optional) — The Query used to create the view.

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

`aidp user-setting create --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.

**Request Body (`CreateUserSettingDetails`):**
- `data` (object, required) —
- `isDefault` (boolean, required) — Indicates whether this setting is the default.
- `name` (string, required) — A user-friendly name for the setting.

**Example:**
```json
{
  "data": {},
  "isDefault": true,
  "name": "<string>"
}
```

**Request Body (`GitAccountUserSetting`):**
- `entityType` (string, required) — The type of Git account entity. Allowed values: PERSONAL_ACCESS_TOKEN.
- `personalAccessToken` (string, optional) — The personal access token for the Git account.
- `providerName` (string, required) — The name of the Git provider. Allowed values: GITHUB, BITBUCKET, GITLAB, OCI_DEVOPS.
- `type` (string, required) — Setting data type discriminator. Must be `GIT_ACCOUNT` for this variant.
- `username` (string, optional) — The username for the Git account.

**Example:**
```json
{
  "entityType": "PERSONAL_ACCESS_TOKEN",
  "personalAccessToken": "<string>",
  "providerName": "GITHUB",
  "type": "GIT_ACCOUNT",
  "username": "<string>"
}
```

**Request Body (`IamUserCredentialUserSetting`):**
- `fingerprint` (string, required) — Fingerprint.
- `privateApiKey` (string, required) — Private API Key.
- `region` (string, required) — Region of the user.
- `tenancy` (string, required) — Tenancy of the user.
- `type` (string, required) — Setting data type discriminator. Must be `IAM_USER_CREDENTIAL` for this variant.
- `userId` (string, required) — User OCID or User Name.

**Example:**
```json
{
  "fingerprint": "<string>",
  "privateApiKey": "<string>",
  "region": "<string>",
  "tenancy": "<string>",
  "type": "IAM_USER_CREDENTIAL",
  "userId": "<string>"
}
```

**Request Body (`OAuthAdminSetting`):**
- `identityProviderUrl` (string, required) — Issuer / authorization server base URL.
- `retrieveJksUrl` (string, required) — URL to retrieve JKS keystore.
- `type` (string, required) — Setting data type discriminator. Must be `OAUTH` for this variant.

**Example:**
```json
{
  "identityProviderUrl": "<string>",
  "retrieveJksUrl": "<string>",
  "type": "OAUTH"
}
```

**Request Body (`SettingData`):**
- `type` (string, required) — Setting data type discriminator. Allowed values: IAM_USER_CREDENTIAL, GIT_ACCOUNT, OAUTH.

**Variants** (selected by `type`):
- `GIT_ACCOUNT` → `GitAccountUserSetting`
- `IAM_USER_CREDENTIAL` → `IamUserCredentialUserSetting`
- `OAUTH` → `OAuthAdminSetting`

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

`aidp user-setting delete <SETTING-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp user-setting get <SETTING-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `setting-key` (string, required) — The UUID of the user setting.
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to User-Setting](#user-setting) • [Top](#top)

#### `aidp user-setting list`
<a id="user-setting-list"></a>
(Preview) Returns a list of all user-specific configurations, with filters for setting type, default flag, and pagination when needed.

**Usage:**

`aidp user-setting list --instance-id <AI-DATA-PLATFORM-ID>`

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

`aidp user-setting update <SETTING-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `setting-key` (string, required) — The UUID of the user setting.
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.

**Request Body (`GitAccountUserSetting`):**
- `entityType` (string, required) — The type of Git account entity. Allowed values: PERSONAL_ACCESS_TOKEN.
- `personalAccessToken` (string, optional) — The personal access token for the Git account.
- `providerName` (string, required) — The name of the Git provider. Allowed values: GITHUB, BITBUCKET, GITLAB, OCI_DEVOPS.
- `type` (string, required) — Setting data type discriminator. Must be `GIT_ACCOUNT` for this variant.
- `username` (string, optional) — The username for the Git account.

**Example:**
```json
{
  "entityType": "PERSONAL_ACCESS_TOKEN",
  "personalAccessToken": "<string>",
  "providerName": "GITHUB",
  "type": "GIT_ACCOUNT",
  "username": "<string>"
}
```

**Request Body (`IamUserCredentialUserSetting`):**
- `fingerprint` (string, required) — Fingerprint.
- `privateApiKey` (string, required) — Private API Key.
- `region` (string, required) — Region of the user.
- `tenancy` (string, required) — Tenancy of the user.
- `type` (string, required) — Setting data type discriminator. Must be `IAM_USER_CREDENTIAL` for this variant.
- `userId` (string, required) — User OCID or User Name.

**Example:**
```json
{
  "fingerprint": "<string>",
  "privateApiKey": "<string>",
  "region": "<string>",
  "tenancy": "<string>",
  "type": "IAM_USER_CREDENTIAL",
  "userId": "<string>"
}
```

**Request Body (`OAuthAdminSetting`):**
- `identityProviderUrl` (string, required) — Issuer / authorization server base URL.
- `retrieveJksUrl` (string, required) — URL to retrieve JKS keystore.
- `type` (string, required) — Setting data type discriminator. Must be `OAUTH` for this variant.

**Example:**
```json
{
  "identityProviderUrl": "<string>",
  "retrieveJksUrl": "<string>",
  "type": "OAUTH"
}
```

**Request Body (`SettingData`):**
- `type` (string, required) — Setting data type discriminator. Allowed values: IAM_USER_CREDENTIAL, GIT_ACCOUNT, OAUTH.

**Variants** (selected by `type`):
- `GIT_ACCOUNT` → `GitAccountUserSetting`
- `IAM_USER_CREDENTIAL` → `IamUserCredentialUserSetting`
- `OAUTH` → `OAuthAdminSetting`

**Example:**
```json
{
  "type": "IAM_USER_CREDENTIAL"
}
```

**Request Body (`UpdateUserSettingDetails`):**
- `data` (object, required) —
- `isDefault` (boolean, required) — Indicates whether this setting is the default.
- `name` (string, required) — A user-friendly name for the setting.

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
- [volume upload-and-extract-volume-zip](#volume-upload-and-extract-volume-zip)
- [volume upload-file](#volume-upload-file)
- [volume upload-file-with-par](#volume-upload-file-with-par)
- [volume zip-and-download-volume-folder](#volume-zip-and-download-volume-folder)
### Commands

#### `aidp volume create`
<a id="volume-create"></a>
Creates a volume.

**Usage:**

`aidp volume create --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`CreateVolumeDetails`):**
- `catalogName` (string, required) — The name of the catalog to which this volume belongs.
- `description` (string, optional) — Short description of the volume
- `displayName` (string, required) — A user-friendly name. Has to be unique within the schema and is changeable.
- `schemaName` (string, required) — The name of the schema to which this volume belongs.
- `storageLocation` (string, optional) — The storage location of the external volume. Only applicable for external volumes.
- `volumeType` (string, optional) — The type of volume. Allowed values: MANAGED, EXTERNAL.

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

`aidp volume delete <VOLUME-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp volume delete-dir <VOLUME-KEY> --instance-id <AI-DATA-PLATFORM-ID> --path <target-path>`

**Path Arguments:**
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

`aidp volume delete-file <VOLUME-KEY> --instance-id <AI-DATA-PLATFORM-ID> --path <target-path>`

**Path Arguments:**
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

`aidp volume download-file <VOLUME-KEY> --instance-id <AI-DATA-PLATFORM-ID> --path <target-path>`

**Path Arguments:**
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

`aidp volume download-file-with-par <VOLUME-KEY> --instance-id <AI-DATA-PLATFORM-ID> --path <target-path>`

**Path Arguments:**
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

`aidp volume get <VOLUME-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp volume list --instance-id <AI-DATA-PLATFORM-ID> --catalog-key <catalog-key> --schema-key <schema-key>`

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

`aidp volume list-files <VOLUME-KEY> --instance-id <AI-DATA-PLATFORM-ID> --path <target-path>`

**Path Arguments:**
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

`aidp volume list-permissions <VOLUME-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp volume make-dir <VOLUME-KEY> --instance-id <AI-DATA-PLATFORM-ID> --path <target-path>`

**Path Arguments:**
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

`aidp volume manage-permission <VOLUME-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `volume-key` (string, required) — The key of the volume.
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`AssignVolumePermissionDetails`):**
- `assignees` (object, required) —
- `permissions` (array, required) — The permissions assigned to the assignees. Allowed values: READ, WRITE, ADMIN.

**Example:**
```json
{
  "assignees": {},
  "permissions": [
    "READ"
  ]
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
- `targets` (array, required) — The names/ocids of the users, groups or roles.
- `type` (string, required) — Grantee type. Allowed values: USER, ROLE, GROUP.

**Example:**
```json
{
  "targets": [],
  "type": "USER"
}
```

**Request Body (`RevokeVolumePermissionDetails`):**
- `assignees` (object, required) —
- `permissions` (array, required) — The permissions revoked from the assignees. Allowed values: READ, WRITE, ADMIN.

**Example:**
```json
{
  "assignees": {},
  "permissions": [
    "READ"
  ]
}
```
---
**Return:** [Back to Volume](#volume) • [Top](#top)

#### `aidp volume update`
<a id="volume-update"></a>
Updates a volume with the provided information.

**Usage:**

`aidp volume update <VOLUME-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `volume-key` (string, required) — The key of the volume.
**Options:**
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`UpdateVolumeDetails`):**
- `description` (string, optional) — Short description of the volume
- `displayName` (string, optional) — A user-friendly name. Has to be unique within the schema and is changeable.

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

`aidp volume update-dir <VOLUME-KEY> --instance-id <AI-DATA-PLATFORM-ID> --path <target-path> --body <JSON>`

**Path Arguments:**
- `volume-key` (string, required) — The key of the volume.
**Options:**
- `path` (string, required) — The absolute path of the file or folder
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`UpdateDirDetails`):**
- `displayName` (string, optional) — The name of the volume folder. This will be the name of the folder in the volume.

**Example:**
```json
{
  "displayName": "<string>"
}
```
---
**Return:** [Back to Volume](#volume) • [Top](#top)

#### `aidp volume upload-and-extract-volume-zip`
<a id="volume-upload-and-extract-volume-zip"></a>
Creates or updates an asynchronous volume ZIP upload and extraction operation.
Creates or updates an asynchronous volume ZIP upload and extraction operation. CREATE returns a PAR URL for uploading the ZIP bytes and an async operation key. UPDATE records the uploaded ZIP metadata so extraction can continue.

**Usage:**

`aidp volume upload-and-extract-volume-zip <VOLUME-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `volume-key` (string, required) — The key of the volume.
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`UploadAndExtractZipDetails`):**
- `action` (string, required) — Action to perform for the upload and extract operation. CREATE starts the async operation and returns an upload PAR URL. UPDATE records final uploaded object metadata for an existing operation. Allowed values: CREATE, UPDATE.
- `destinationFolderPath` (string, optional) — Workspace folder where the zip root folder will be extracted. Required for CREATE.
- `eTag` (string, optional) — Final Object Storage ETag for the uploaded zip object. If multipart upload is used, the caller commits the multipart upload directly with Object Storage before calling UPDATE.
- `isOverwrite` (boolean, optional) — Flag to overwrite existing files during extraction. If false, existing files are skipped.
- `operationKey` (string, optional) — Async operation key returned by the CREATE action. Required for UPDATE.
- `sizeInBytes` (integer, optional) — Final uploaded zip object size in bytes. Required for UPDATE.
- `zipFileName` (string, optional) — Name of the zip file that will be uploaded through the returned PAR URL. Required for CREATE.

**Example:**
```json
{
  "action": "CREATE",
  "destinationFolderPath": "<string>",
  "eTag": "<string>",
  "isOverwrite": true,
  "operationKey": "<string>",
  "sizeInBytes": 0,
  "zipFileName": "<string>"
}
```
---
**Return:** [Back to Volume](#volume) • [Top](#top)

#### `aidp volume upload-file`
<a id="volume-upload-file"></a>
Uploads a file to volume.
Uploads a file to volume. If the file already exists, it is updated.

**Usage:**

`aidp volume upload-file <VOLUME-KEY> --instance-id <AI-DATA-PLATFORM-ID> --path <target-path> --body @<local-file>`

**Path Arguments:**
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

`aidp volume upload-file-with-par <VOLUME-KEY> --instance-id <AI-DATA-PLATFORM-ID> --path <target-path> --body <JSON>`

**Path Arguments:**
- `volume-key` (string, required) — The key of the volume.
**Options:**
- `is-overwrite` (boolean, optional) — A boolean which decides if overwrite is allowed
- `should-generate-new-par` (boolean, optional) — Flag to toggle to generate short living par
- `should-create-recursively` (boolean, optional) — A boolean which decides if parent directories should be created recursively during upload.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `path` (string, required) — The absolute path of the file or folder
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`UploadFileWithParDetails`):**
- `action` (string, optional) — Action type on create or close. Allowed values: CREATE, REFRESH, UPDATE.
- `eTag` (string, optional) — Etag that needs to be updated.
- `size` (integer, optional) — Size of the file needed when closed.
- `systemTags` (object, optional) — System tags for this resource. Each key is predefined and scoped to a namespace. Example: `{"orcl-cloud": {"free-tier-retained": "true"}}`

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

#### `aidp volume zip-and-download-volume-folder`
<a id="volume-zip-and-download-volume-folder"></a>
Starts asynchronous creation of a ZIP archive for a volume folder.
Starts asynchronous creation of a ZIP archive for a volume folder. The response includes a PAR URL for downloading the archive after the operation succeeds.

**Usage:**

`aidp volume zip-and-download-volume-folder <VOLUME-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `volume-key` (string, required) — The key of the volume.
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`ZipAndDownloadFolderDetails`):**
- `sourceFolderPath` (string, required) — Workspace folder path to zip for download.

**Example:**
```json
{
  "sourceFolderPath": "<string>"
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
- [workflow list-task-run-retries](#workflow-list-task-run-retries)
- [workflow list-task-runs](#workflow-list-task-runs)
- [workflow manage-job-permission](#workflow-manage-job-permission)
- [workflow repair-job-run](#workflow-repair-job-run)
- [workflow update-job](#workflow-update-job)
### Commands

#### `aidp workflow cancel-job-run`
<a id="workflow-cancel-job-run"></a>
Cancels a job run.

**Usage:**

`aidp workflow cancel-job-run <WORKSPACE-KEY> <JOB-RUN-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp workflow cancel-job-runs <WORKSPACE-KEY> <JOB-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp workflow create-job <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`AgentTask`):**
- `agentKey` (string, required) — Unique key of the deployed Agent or Multi-Agent System. At execution time, DataHub resolves this key to one active PROD deployment, fetches its Agent Card through a workload-authenticated internal route, and invokes the validated internal JSON-RPC URL advertised by the Card. AgentTask supports A2A protocol 0.3.x.
- `dependsOn` (array, optional) — Specifies the dependency graph of the task. All the tasks mentioned in this field need to be completed before executing this task.
- `isRetryOnTimeout` (boolean, optional) — An optional policy to specify whether to retry a task when it times out. The default behavior is to not retry on timeout. This property is not applicable for streaming task.
- `maxRetries` (integer, optional) — The maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it fails with status FAILED or INTERNAL_ERROR. Maximum value is 10. This property is not applicable for streaming task.
- `minRetryIntervalMillis` (integer, optional) — An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. If value is not provided, the run would be immediately retried. Maximum value is 10 mins (600000). This property is not applicable for streaming task.
- `parameters` (array, optional) — An optional list of parameters.
- `prompt` (string, required) — Required user input text sent as an A2A user message part.
- `runIf` (string, required) — The trigger rule based on which the current task execution is determined. Allowed values: ALL_SUCCESS, ALL_DONE, NONE_FAILED, AT_LEAST_ONE_SUCCESS, ALL_FAILED, AT_LEAST_ONE_FAILED.
- `taskKey` (string, required) — The display name of the task. User can specify a value for this.
- `type` (string, required) — The type of the task. Must be `AGENT_TASK` for this variant.

**Example:**
```json
{
  "agentKey": "<string>",
  "dependsOn": [],
  "isRetryOnTimeout": true,
  "maxRetries": 0,
  "minRetryIntervalMillis": 0,
  "parameters": [],
  "prompt": "<string>",
  "runIf": "ALL_SUCCESS",
  "taskKey": "<string>",
  "type": "AGENT_TASK"
}
```

**Request Body (`AutoScale`):**
- `maxWorkers` (integer, optional) — The maximum number of workers to which the cluster can scale up when overloaded.
- `minWorkers` (integer, optional) — The minimum number of workers to which the cluster can scale down when underused.

**Example:**
```json
{
  "maxWorkers": 0,
  "minWorkers": 0
}
```

**Request Body (`Continuous`):**
- `pauseStatus` (string, optional) — Indicates whether the continuous execution of this job is paused or not. Allowed values: PAUSED, UNPAUSED.

**Example:**
```json
{
  "pauseStatus": "PAUSED"
}
```

**Request Body (`CreateJobDetails`):**
- `continuous` (object, optional) —
- `description` (string, optional) — A description for the job.
- `gitConfig` (object, optional) —
- `jobClusters` (array, optional) — List of job cluster configurations.
- `maxConcurrentRuns` (integer, optional) — Indicates the number of executions for the same job that can be run concurrently. The maximum value cannot exceed 1000.
- `name` (string, required) — A user-friendly name. Does not have to be unique, and is changeable.
- `parameters` (array, optional) — An optional list of parameters.
- `path` (string, optional) — The path to store the job definition in.
- `queue` (object, optional) —
- `runAs` (string, optional) — This points to the user or service account executing the job.
- `schedule` (object, optional) —
- `tasks` (array, optional) — List of tasks in a job.
- `timeoutSeconds` (integer, optional) — An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value.

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
- `outcome` (string, optional) — Specified on condition task dependencies. The outcome of the dependent task should be met for this task to be executed.
- `taskKey` (string, required) — The name of the task that it depends on.

**Example:**
```json
{
  "outcome": "<string>",
  "taskKey": "<string>"
}
```

**Request Body (`Expression`):**
- `key` (string, required) — A unique character to map the expression. This character is used to refer the expression string in condition field of the task. May only contain alphanumeric characters.
- `value` (string, required) — Expression string.

**Example:**
```json
{
  "key": "<string>",
  "value": "<string>"
}
```

**Request Body (`GitConfig`):**
- `branch` (string, optional) — Git branch path.
- `credential` (string, optional) — Git credential to access the repository.
- `provider` (string, optional) — Git provider. Allowed values: GITHUB, BITBUCKET, GITLAB, OCI_DEVOPS.
- `repositoryUrl` (string, optional) — Git repository URL.

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
- `condition` (string, required) — The condition string which binds expressions from expressions list using AND, OR or NOT operator. Expression key should be used to bind the expressions.
- `dependsOn` (array, optional) — Specifies the dependency graph of the task. All the tasks mentioned in this field need to be completed before executing this task.
- `expressions` (array, required) — List of expressions.
- `isRetryOnTimeout` (boolean, optional) — An optional policy to specify whether to retry a task when it times out. The default behavior is to not retry on timeout. This property is not applicable for streaming task.
- `maxRetries` (integer, optional) — The maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it fails with status FAILED or INTERNAL_ERROR. Maximum value is 10. This property is not applicable for streaming task.
- `minRetryIntervalMillis` (integer, optional) — An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. If value is not provided, the run would be immediately retried. Maximum value is 10 mins (600000). This property is not applicable for streaming task.
- `parameters` (array, optional) — An optional list of parameters.
- `runIf` (string, required) — The trigger rule based on which the current task execution is determined. Allowed values: ALL_SUCCESS, ALL_DONE, NONE_FAILED, AT_LEAST_ONE_SUCCESS, ALL_FAILED, AT_LEAST_ONE_FAILED.
- `taskKey` (string, required) — The display name of the task. User can specify a value for this.
- `type` (string, required) — The type of the task. Must be `IF_ELSE_TASK` for this variant.

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
  "runIf": "ALL_SUCCESS",
  "taskKey": "<string>",
  "type": "IF_ELSE_TASK"
}
```

**Request Body (`JarTask`):**
- `cluster` (object, required) —
- `commandLineArguments` (string, optional) — The command line arguments to pass to Python task.
- `dependentLibraries` (array, optional) — The list of dependent jars
- `dependsOn` (array, optional) — Specifies the dependency graph of the task. All the tasks mentioned in this field need to be completed before executing this task.
- `gitConfig` (object, optional) —
- `isRetryOnTimeout` (boolean, optional) — An optional policy to specify whether to retry a task when it times out. The default behavior is to not retry on timeout. This property is not applicable for streaming task.
- `isStreaming` (boolean, optional) — An optional property to enable or disable the streaming capability for a task.
- `mainClass` (string, required) — Name of the main class.
- `maxRetries` (integer, optional) — The maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it fails with status FAILED or INTERNAL_ERROR. Maximum value is 10. This property is not applicable for streaming task.
- `minRetryIntervalMillis` (integer, optional) — An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. If value is not provided, the run would be immediately retried. Maximum value is 10 mins (600000). This property is not applicable for streaming task.
- `parameters` (array, optional) — An optional list of parameters.
- `runIf` (string, required) — The trigger rule based on which the current task execution is determined. Allowed values: ALL_SUCCESS, ALL_DONE, NONE_FAILED, AT_LEAST_ONE_SUCCESS, ALL_FAILED, AT_LEAST_ONE_FAILED.
- `source` (string, optional) — Source selected for a task. Either workspace or Git provider. Allowed values: WORKSPACE, GIT_PROVIDER.
- `taskKey` (string, required) — The display name of the task. User can specify a value for this.
- `timeoutSeconds` (integer, optional) — An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value.
- `type` (string, required) — The type of the task. Must be `JAR_TASK` for this variant.

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
  "runIf": "ALL_SUCCESS",
  "source": "WORKSPACE",
  "taskKey": "<string>",
  "timeoutSeconds": 0,
  "type": "JAR_TASK"
}
```

**Request Body (`JobCluster`):**
- `clusterKey` (string, optional) — A unique identifier for the job cluster.
- `clusterName` (string, optional) — A unique name for the job cluster.
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
- `dependsOn` (array, optional) — Specifies the dependency graph of the task. All the tasks mentioned in this field need to be completed before executing this task.
- `isRetryOnTimeout` (boolean, optional) — An optional policy to specify whether to retry a task when it times out. The default behavior is to not retry on timeout. This property is not applicable for streaming task.
- `jobKey` (string, required) — The OCID of the job.
- `maxRetries` (integer, optional) — The maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it fails with status FAILED or INTERNAL_ERROR. Maximum value is 10. This property is not applicable for streaming task.
- `minRetryIntervalMillis` (integer, optional) — An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. If value is not provided, the run would be immediately retried. Maximum value is 10 mins (600000). This property is not applicable for streaming task.
- `parameters` (array, optional) — An optional list of parameters.
- `runIf` (string, required) — The trigger rule based on which the current task execution is determined. Allowed values: ALL_SUCCESS, ALL_DONE, NONE_FAILED, AT_LEAST_ONE_SUCCESS, ALL_FAILED, AT_LEAST_ONE_FAILED.
- `taskKey` (string, required) — The display name of the task. User can specify a value for this.
- `timeoutSeconds` (integer, optional) — An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value.
- `type` (string, required) — The type of the task. Must be `JOB_TASK` for this variant.

**Example:**
```json
{
  "dependsOn": [],
  "isRetryOnTimeout": true,
  "jobKey": "<string>",
  "maxRetries": 0,
  "minRetryIntervalMillis": 0,
  "parameters": [],
  "runIf": "ALL_SUCCESS",
  "taskKey": "<string>",
  "timeoutSeconds": 0,
  "type": "JOB_TASK"
}
```

**Request Body (`NewClusterConfiguration`):**
- `autoScale` (object, optional) —
- `clusterName` (string, optional) — A unique name for the job cluster.
- `numWorkers` (integer, optional) — Number of worker nodes configured for this cluster.
- `sparkConf` (string, optional) — The spark configuration in key-value pairs.
- `sparkVersion` (string, optional) — The Spark version used to run the application.

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
- `dependsOn` (array, optional) — Specifies the dependency graph of the task. All the tasks mentioned in this field need to be completed before executing this task.
- `gitConfig` (object, optional) —
- `isRetryOnTimeout` (boolean, optional) — An optional policy to specify whether to retry a task when it times out. The default behavior is to not retry on timeout. This property is not applicable for streaming task.
- `isStreaming` (boolean, optional) — An optional property to enable or disable the streaming capability for a task.
- `maxRetries` (integer, optional) — The maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it fails with status FAILED or INTERNAL_ERROR. Maximum value is 10. This property is not applicable for streaming task.
- `minRetryIntervalMillis` (integer, optional) — An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. If value is not provided, the run would be immediately retried. Maximum value is 10 mins (600000). This property is not applicable for streaming task.
- `notebookPath` (string, required) — The path where the notebook exists.
- `parameters` (array, optional) — An optional list of parameters.
- `runIf` (string, required) — The trigger rule based on which the current task execution is determined. Allowed values: ALL_SUCCESS, ALL_DONE, NONE_FAILED, AT_LEAST_ONE_SUCCESS, ALL_FAILED, AT_LEAST_ONE_FAILED.
- `source` (string, optional) — Source selected for a task. Either workspace or Git provider. Allowed values: WORKSPACE, GIT_PROVIDER.
- `taskKey` (string, required) — The display name of the task. User can specify a value for this.
- `timeoutSeconds` (integer, optional) — An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value.
- `type` (string, required) — The type of the task. Must be `NOTEBOOK_TASK` for this variant.

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
  "runIf": "ALL_SUCCESS",
  "source": "WORKSPACE",
  "taskKey": "<string>",
  "timeoutSeconds": 0,
  "type": "NOTEBOOK_TASK"
}
```

**Request Body (`Parameter`):**
- `name` (string, required) — The name of the defined parameter. May only contain alphanumeric characters, '_', '-', and '.'
- `value` (string, optional) — Value of the defined parameter.

**Example:**
```json
{
  "name": "<string>",
  "value": "<string>"
}
```

**Request Body (`PythonTask`):**
- `cluster` (object, required) —
- `commandLineArguments` (string, optional) — The command line arguments to pass to Python task.
- `dependsOn` (array, optional) — Specifies the dependency graph of the task. All the tasks mentioned in this field need to be completed before executing this task.
- `filePath` (string, required) — The path where the Python file exists.
- `gitConfig` (object, optional) —
- `isRetryOnTimeout` (boolean, optional) — An optional policy to specify whether to retry a task when it times out. The default behavior is to not retry on timeout. This property is not applicable for streaming task.
- `isStreaming` (boolean, optional) — An optional property to enable or disable the streaming capability for a task.
- `maxRetries` (integer, optional) — The maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it fails with status FAILED or INTERNAL_ERROR. Maximum value is 10. This property is not applicable for streaming task.
- `minRetryIntervalMillis` (integer, optional) — An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. If value is not provided, the run would be immediately retried. Maximum value is 10 mins (600000). This property is not applicable for streaming task.
- `runIf` (string, required) — The trigger rule based on which the current task execution is determined. Allowed values: ALL_SUCCESS, ALL_DONE, NONE_FAILED, AT_LEAST_ONE_SUCCESS, ALL_FAILED, AT_LEAST_ONE_FAILED.
- `source` (string, optional) — Source selected for a task. Either workspace or Git provider. Allowed values: WORKSPACE, GIT_PROVIDER.
- `taskKey` (string, required) — The display name of the task. User can specify a value for this.
- `timeoutSeconds` (integer, optional) — An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value.
- `type` (string, required) — The type of the task. Must be `PYTHON_TASK` for this variant.

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
  "runIf": "ALL_SUCCESS",
  "source": "WORKSPACE",
  "taskKey": "<string>",
  "timeoutSeconds": 0,
  "type": "PYTHON_TASK"
}
```

**Request Body (`Queue`):**
- `isEnabled` (boolean, required) — True if job queue is enabled.

**Example:**
```json
{
  "isEnabled": true
}
```

**Request Body (`Schedule`):**
- `pauseStatus` (string, optional) — Indicates whether the schedule is paused or not. Allowed values: PAUSED, UNPAUSED.
- `quartzCronExpression` (string, required) — A cron expression using Quartz syntax that describes the schedule for a job.
- `timezoneId` (string, required) — A Java timezone ID. The schedule of the job is resolved with respect to this timezone. Example - US/Pacific.

**Example:**
```json
{
  "pauseStatus": "PAUSED",
  "quartzCronExpression": "<string>",
  "timezoneId": "<string>"
}
```

**Request Body (`Task`):**
- `dependsOn` (array, optional) — Specifies the dependency graph of the task. All the tasks mentioned in this field need to be completed before executing this task.
- `isRetryOnTimeout` (boolean, optional) — An optional policy to specify whether to retry a task when it times out. The default behavior is to not retry on timeout. This property is not applicable for streaming task.
- `maxRetries` (integer, optional) — The maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it fails with status FAILED or INTERNAL_ERROR. Maximum value is 10. This property is not applicable for streaming task.
- `minRetryIntervalMillis` (integer, optional) — An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. If value is not provided, the run would be immediately retried. Maximum value is 10 mins (600000). This property is not applicable for streaming task.
- `runIf` (string, required) — The trigger rule based on which the current task execution is determined. Allowed values: ALL_SUCCESS, ALL_DONE, NONE_FAILED, AT_LEAST_ONE_SUCCESS, ALL_FAILED, AT_LEAST_ONE_FAILED.
- `taskKey` (string, required) — The display name of the task. User can specify a value for this.
- `type` (string, required) — The type of the task. Allowed values: NOTEBOOK_TASK, PYTHON_TASK, SPARK_SUBMIT_TASK, IF_ELSE_TASK, JOB_TASK, JAR_TASK, AGENT_TASK.

**Variants** (selected by `type`):
- `IF_ELSE_TASK` → `IfElseTask`
- `JOB_TASK` → `JobTask`
- `JAR_TASK` → `JarTask`
- `AGENT_TASK` → `AgentTask`
- `PYTHON_TASK` → `PythonTask`
- `NOTEBOOK_TASK` → `NotebookTask`

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

`aidp workflow create-job-run <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`CreateJobRunDetails`):**
- `jobKey` (string, required) — The OCID of the job.
- `key` (string, optional) — The OCID of the job.
- `originalAttemptRunId` (string, optional) — The OCID of the job.
- `parameters` (array, optional) — An optional list of parameters.
- `queue` (object, optional) —
- `repairHistory` (array, optional) — Array of repaired runs.
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
- `endTime` (integer, optional) — The time at which the job execution started in epoch milliseconds.
- `errorTrace` (string, optional) — If there was an error executing the run, this field contains any available stack traces.
- `isUserCanceledOrTimedOut` (boolean, optional) — Set to true, if the job execution is canceled by the user or by the scheduler due to timeout.
- `startTime` (integer, optional) — The time at which the job execution started in epoch milliseconds.
- `stateMessage` (string, optional) — A descriptive message of the current state.
- `status` (string, optional) — Current state of execution. Allowed values: PENDING, QUEUED, RUNNING, SKIPPED, INTERNAL_ERROR, BLOCKED, SUCCESS, FAILED, CANCELING, CANCELED, UPSTREAM_CANCELED, UPSTREAM_FAILED, EXCLUDED, TIMED_OUT, PAUSED_MAINTENANCE.

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
- `name` (string, required) — The name of the defined parameter. May only contain alphanumeric characters, '_', '-', and '.'
- `value` (string, optional) — Value of the defined parameter.

**Example:**
```json
{
  "name": "<string>",
  "value": "<string>"
}
```

**Request Body (`Queue`):**
- `isEnabled` (boolean, required) — True if job queue is enabled.

**Example:**
```json
{
  "isEnabled": true
}
```

**Request Body (`RepairHistory`):**
- `endTime` (integer, optional) — The time at which the job execution started in epoch milliseconds.
- `executionDuration` (integer, optional) — The time (in milliseconds) taken to complete the job execution.
- `key` (integer, optional) — The repair version represented by this JobRun. Zero represents the original execution. Nested JobRuns use the repair key allocated by the root JobRun and can therefore have gaps when they do not participate in every repair.
- `lifecycleStates` (array, optional) — The collection of lifecycle states.
- `parameters` (array, optional) — An optional list of parameters.
- `parentTaskRunKey` (string, optional) — The OCID of the task run.
- `repairedTasks` (array, optional) — A list of repaired tasks.
- `startTime` (integer, optional) — The time at which the job execution started in epoch milliseconds.
- `state` (object, optional) —
- `taskToTaskRunMap` (object, optional) — Task to TaskRun map for given job run.
- `type` (string, optional) — Indicates whether the job run is Original or Repaired. Allowed values: ORIGINAL, REPAIR.

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
- `pauseStatus` (string, optional) — Indicates whether the schedule is paused or not. Allowed values: PAUSED, UNPAUSED.
- `quartzCronExpression` (string, required) — A cron expression using Quartz syntax that describes the schedule for a job.
- `timezoneId` (string, required) — A Java timezone ID. The schedule of the job is resolved with respect to this timezone. Example - US/Pacific.

**Example:**
```json
{
  "pauseStatus": "PAUSED",
  "quartzCronExpression": "<string>",
  "timezoneId": "<string>"
}
```

**Request Body (`State`):**
- `errorTrace` (string, optional) — If there was an error executing the run, this field contains any available stack traces.
- `isUserCanceledOrTimedOut` (boolean, optional) — Set to true, if the job execution is canceled by the user or by the scheduler due to timeout.
- `stateMessage` (string, optional) — A descriptive message of the current state.
- `status` (string, optional) — Current state of execution. Allowed values: PENDING, QUEUED, RUNNING, SKIPPED, INTERNAL_ERROR, BLOCKED, SUCCESS, FAILED, CANCELING, CANCELED, UPSTREAM_CANCELED, UPSTREAM_FAILED, EXCLUDED, TIMED_OUT, PAUSED_MAINTENANCE.

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

`aidp workflow delete-job <WORKSPACE-KEY> <JOB-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp workflow delete-job-run <WORKSPACE-KEY> <JOB-RUN-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp workflow export-task-run-output <WORKSPACE-KEY> <TASK-RUN-KEY> <TASK-RUN-OUTPUT-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `task-run-key` (string, required) — Task run key.
- `task-run-output-key` (string, required) — Task run output key.
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`ExportTaskRunOutputDetails`):**
- `format` (string, optional) — The format in which task run output should be exported, supported formats are HTML and ipynb only. Allowed values: HTML, IPYNB.

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

`aidp workflow fetch-output <WORKSPACE-KEY> <TASK-RUN-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `task-run-key` (string, required) — Task run key.
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.

**Request Body (`FetchOutputDetails`):**
- `outputKey` (string, optional) — A unique identifier for the output.

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

`aidp workflow get-job <WORKSPACE-KEY> <JOB-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp workflow get-job-run <WORKSPACE-KEY> <JOB-RUN-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `job-run-key` (string, required) — Job run key.
**Options:**
- `should-include-task-run-summaries` (boolean, optional) — A flag to identify if task run summaries should be included in the job run response. If omitted, the service applies its configured default behavior.
- `repair-key` (integer, optional) — The root repair version whose corresponding local history should be returned. The response repairHistory contains only the latest retained local entry at or before this key. It is empty when the current JobRun is the applicable version or a child JobRun had not participated in a repair by this key. JobRun fields and TaskRun summaries remain current and complete.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---
**Return:** [Back to Workflow](#workflow) • [Top](#top)

#### `aidp workflow get-task-run`
<a id="workflow-get-task-run"></a>
Returns detailed information about a task run with a given task run key.

**Usage:**

`aidp workflow get-task-run <WORKSPACE-KEY> <TASK-RUN-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `task-run-key` (string, required) — Task run key.
**Options:**
- `should-include-task-run-retries` (boolean, optional) — Indicates whether a get task run response should include task run retries.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Workflow](#workflow) • [Top](#top)

#### `aidp workflow list-job-permissions`
<a id="workflow-list-job-permissions"></a>
Returns a list of job permissions.

**Usage:**

`aidp workflow list-job-permissions <WORKSPACE-KEY> <JOB-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp workflow list-job-runs <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp workflow list-jobs <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `display-name-contains` (string, optional) — A filter to return only resources that have a display name containing the text provided.
- `path` (string, optional) — The fully qualified path where the job is stored.
- `created-by` (string, optional) — A filter to return only resources that are created by given user with username that matches exactly.
- `updated-by` (string, optional) — A filter to return only resources that was last updated by given user with username that matches exactly.
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated List call.
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

`aidp workflow list-recent-job-runs <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

#### `aidp workflow list-task-run-retries`
<a id="workflow-list-task-run-retries"></a>
Returns detailed information about retries of a task run with a given task run key.

**Usage:**

`aidp workflow list-task-run-retries <WORKSPACE-KEY> <TASK-RUN-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `task-run-key` (string, required) — Task run key.
**Options:**
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see List Pagination.
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

`aidp workflow list-task-runs <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --job-run-key <job-run-key>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `job-run-key` (string, required) — The field to filter based on job run key.
- `display-name` (string, optional) — A filter to return only resources that match the given display name exactly.
- `parent-job-run-key` (string, optional) — The field to filter based on parent job run key.
- `root-job-run-key` (string, optional) — The field to filter based on root job run key.
- `limit` (integer, optional) — For list pagination. The maximum number of results per page, or items to return in a paginated List call.
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

`aidp workflow manage-job-permission <WORKSPACE-KEY> <JOB-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `job-key` (string, required) — Job key.
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`AssignJobPermissionDetails`):**
- `assignees` (object, required) —
- `permissions` (array, required) — The permission assigned to the assignee as per the index of assignee. This list should be same size as assignees list. Allowed values: READ, USE, MANAGE, ADMIN.

**Example:**
```json
{
  "assignees": {},
  "permissions": [
    "READ"
  ]
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
- `targets` (array, required) — The names/ocids of the users, groups or roles.
- `type` (string, required) — Grantee type. Allowed values: USER, ROLE, GROUP.

**Example:**
```json
{
  "targets": [],
  "type": "USER"
}
```

**Request Body (`RevokeJobPermissionDetails`):**
- `assignees` (object, required) —
- `permissions` (array, required) — The permission revoked from the assignee as per the index of assignee. This list should be same size as assignees list. Allowed values: READ, USE, MANAGE, ADMIN.

**Example:**
```json
{
  "assignees": {},
  "permissions": [
    "READ"
  ]
}
```
---
**Return:** [Back to Workflow](#workflow) • [Top](#top)

#### `aidp workflow repair-job-run`
<a id="workflow-repair-job-run"></a>
Repairs and reruns a root job run.
Repairs and reruns a root job run. Nested job runs can be repaired only through their root job run repair plan.

**Usage:**

`aidp workflow repair-job-run <WORKSPACE-KEY> <JOB-RUN-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `job-run-key` (string, required) — Job run key.
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`Parameter`):**
- `name` (string, required) — The name of the defined parameter. May only contain alphanumeric characters, '_', '-', and '.'
- `value` (string, optional) — Value of the defined parameter.

**Example:**
```json
{
  "name": "<string>",
  "value": "<string>"
}
```

**Request Body (`RepairJobRunDetails`):**
- `parameters` (array, optional) — An optional list of parameters.
- `repairMode` (string, optional) — repairMode is no longer supported. Select tasks explicitly, or use the default nested task selection. For a failed nested JobRun, the default selects only unsuccessful tasks. For a successful nested JobRun, the default selects all tasks. Allowed values: RESUME, RERUN.
- `repairTasks` (array, optional) — The collection of selected task details to be repaired.
- `taskKeys` (array, optional) — Deprecated. Use repairTasks to select tasks to be repaired.

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
- `nestedRepairJobRunDetails` (object, optional) —
- `shouldIncludeDownstream` (boolean, optional) — Include transitive downstream tasks for this task selection.
- `shouldIncludeUpstream` (boolean, optional) — Include transitive upstream tasks for this task selection.
- `taskKey` (string, required) — The display name of the task. User can specify a value for this.

**Example:**
```json
{
  "nestedRepairJobRunDetails": {},
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

`aidp workflow update-job <WORKSPACE-KEY> <JOB-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `job-key` (string, required) — Job key.
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`AgentTask`):**
- `agentKey` (string, required) — Unique key of the deployed Agent or Multi-Agent System. At execution time, DataHub resolves this key to one active PROD deployment, fetches its Agent Card through a workload-authenticated internal route, and invokes the validated internal JSON-RPC URL advertised by the Card. AgentTask supports A2A protocol 0.3.x.
- `dependsOn` (array, optional) — Specifies the dependency graph of the task. All the tasks mentioned in this field need to be completed before executing this task.
- `isRetryOnTimeout` (boolean, optional) — An optional policy to specify whether to retry a task when it times out. The default behavior is to not retry on timeout. This property is not applicable for streaming task.
- `maxRetries` (integer, optional) — The maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it fails with status FAILED or INTERNAL_ERROR. Maximum value is 10. This property is not applicable for streaming task.
- `minRetryIntervalMillis` (integer, optional) — An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. If value is not provided, the run would be immediately retried. Maximum value is 10 mins (600000). This property is not applicable for streaming task.
- `parameters` (array, optional) — An optional list of parameters.
- `prompt` (string, required) — Required user input text sent as an A2A user message part.
- `runIf` (string, required) — The trigger rule based on which the current task execution is determined. Allowed values: ALL_SUCCESS, ALL_DONE, NONE_FAILED, AT_LEAST_ONE_SUCCESS, ALL_FAILED, AT_LEAST_ONE_FAILED.
- `taskKey` (string, required) — The display name of the task. User can specify a value for this.
- `type` (string, required) — The type of the task. Must be `AGENT_TASK` for this variant.

**Example:**
```json
{
  "agentKey": "<string>",
  "dependsOn": [],
  "isRetryOnTimeout": true,
  "maxRetries": 0,
  "minRetryIntervalMillis": 0,
  "parameters": [],
  "prompt": "<string>",
  "runIf": "ALL_SUCCESS",
  "taskKey": "<string>",
  "type": "AGENT_TASK"
}
```

**Request Body (`AutoScale`):**
- `maxWorkers` (integer, optional) — The maximum number of workers to which the cluster can scale up when overloaded.
- `minWorkers` (integer, optional) — The minimum number of workers to which the cluster can scale down when underused.

**Example:**
```json
{
  "maxWorkers": 0,
  "minWorkers": 0
}
```

**Request Body (`Continuous`):**
- `pauseStatus` (string, optional) — Indicates whether the continuous execution of this job is paused or not. Allowed values: PAUSED, UNPAUSED.

**Example:**
```json
{
  "pauseStatus": "PAUSED"
}
```

**Request Body (`DependsOn`):**
- `outcome` (string, optional) — Specified on condition task dependencies. The outcome of the dependent task should be met for this task to be executed.
- `taskKey` (string, required) — The name of the task that it depends on.

**Example:**
```json
{
  "outcome": "<string>",
  "taskKey": "<string>"
}
```

**Request Body (`Expression`):**
- `key` (string, required) — A unique character to map the expression. This character is used to refer the expression string in condition field of the task. May only contain alphanumeric characters.
- `value` (string, required) — Expression string.

**Example:**
```json
{
  "key": "<string>",
  "value": "<string>"
}
```

**Request Body (`GitConfig`):**
- `branch` (string, optional) — Git branch path.
- `credential` (string, optional) — Git credential to access the repository.
- `provider` (string, optional) — Git provider. Allowed values: GITHUB, BITBUCKET, GITLAB, OCI_DEVOPS.
- `repositoryUrl` (string, optional) — Git repository URL.

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
- `condition` (string, required) — The condition string which binds expressions from expressions list using AND, OR or NOT operator. Expression key should be used to bind the expressions.
- `dependsOn` (array, optional) — Specifies the dependency graph of the task. All the tasks mentioned in this field need to be completed before executing this task.
- `expressions` (array, required) — List of expressions.
- `isRetryOnTimeout` (boolean, optional) — An optional policy to specify whether to retry a task when it times out. The default behavior is to not retry on timeout. This property is not applicable for streaming task.
- `maxRetries` (integer, optional) — The maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it fails with status FAILED or INTERNAL_ERROR. Maximum value is 10. This property is not applicable for streaming task.
- `minRetryIntervalMillis` (integer, optional) — An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. If value is not provided, the run would be immediately retried. Maximum value is 10 mins (600000). This property is not applicable for streaming task.
- `parameters` (array, optional) — An optional list of parameters.
- `runIf` (string, required) — The trigger rule based on which the current task execution is determined. Allowed values: ALL_SUCCESS, ALL_DONE, NONE_FAILED, AT_LEAST_ONE_SUCCESS, ALL_FAILED, AT_LEAST_ONE_FAILED.
- `taskKey` (string, required) — The display name of the task. User can specify a value for this.
- `type` (string, required) — The type of the task. Must be `IF_ELSE_TASK` for this variant.

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
  "runIf": "ALL_SUCCESS",
  "taskKey": "<string>",
  "type": "IF_ELSE_TASK"
}
```

**Request Body (`JarTask`):**
- `cluster` (object, required) —
- `commandLineArguments` (string, optional) — The command line arguments to pass to Python task.
- `dependentLibraries` (array, optional) — The list of dependent jars
- `dependsOn` (array, optional) — Specifies the dependency graph of the task. All the tasks mentioned in this field need to be completed before executing this task.
- `gitConfig` (object, optional) —
- `isRetryOnTimeout` (boolean, optional) — An optional policy to specify whether to retry a task when it times out. The default behavior is to not retry on timeout. This property is not applicable for streaming task.
- `isStreaming` (boolean, optional) — An optional property to enable or disable the streaming capability for a task.
- `mainClass` (string, required) — Name of the main class.
- `maxRetries` (integer, optional) — The maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it fails with status FAILED or INTERNAL_ERROR. Maximum value is 10. This property is not applicable for streaming task.
- `minRetryIntervalMillis` (integer, optional) — An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. If value is not provided, the run would be immediately retried. Maximum value is 10 mins (600000). This property is not applicable for streaming task.
- `parameters` (array, optional) — An optional list of parameters.
- `runIf` (string, required) — The trigger rule based on which the current task execution is determined. Allowed values: ALL_SUCCESS, ALL_DONE, NONE_FAILED, AT_LEAST_ONE_SUCCESS, ALL_FAILED, AT_LEAST_ONE_FAILED.
- `source` (string, optional) — Source selected for a task. Either workspace or Git provider. Allowed values: WORKSPACE, GIT_PROVIDER.
- `taskKey` (string, required) — The display name of the task. User can specify a value for this.
- `timeoutSeconds` (integer, optional) — An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value.
- `type` (string, required) — The type of the task. Must be `JAR_TASK` for this variant.

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
  "runIf": "ALL_SUCCESS",
  "source": "WORKSPACE",
  "taskKey": "<string>",
  "timeoutSeconds": 0,
  "type": "JAR_TASK"
}
```

**Request Body (`JobCluster`):**
- `clusterKey` (string, optional) — A unique identifier for the job cluster.
- `clusterName` (string, optional) — A unique name for the job cluster.
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
- `dependsOn` (array, optional) — Specifies the dependency graph of the task. All the tasks mentioned in this field need to be completed before executing this task.
- `isRetryOnTimeout` (boolean, optional) — An optional policy to specify whether to retry a task when it times out. The default behavior is to not retry on timeout. This property is not applicable for streaming task.
- `jobKey` (string, required) — The OCID of the job.
- `maxRetries` (integer, optional) — The maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it fails with status FAILED or INTERNAL_ERROR. Maximum value is 10. This property is not applicable for streaming task.
- `minRetryIntervalMillis` (integer, optional) — An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. If value is not provided, the run would be immediately retried. Maximum value is 10 mins (600000). This property is not applicable for streaming task.
- `parameters` (array, optional) — An optional list of parameters.
- `runIf` (string, required) — The trigger rule based on which the current task execution is determined. Allowed values: ALL_SUCCESS, ALL_DONE, NONE_FAILED, AT_LEAST_ONE_SUCCESS, ALL_FAILED, AT_LEAST_ONE_FAILED.
- `taskKey` (string, required) — The display name of the task. User can specify a value for this.
- `timeoutSeconds` (integer, optional) — An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value.
- `type` (string, required) — The type of the task. Must be `JOB_TASK` for this variant.

**Example:**
```json
{
  "dependsOn": [],
  "isRetryOnTimeout": true,
  "jobKey": "<string>",
  "maxRetries": 0,
  "minRetryIntervalMillis": 0,
  "parameters": [],
  "runIf": "ALL_SUCCESS",
  "taskKey": "<string>",
  "timeoutSeconds": 0,
  "type": "JOB_TASK"
}
```

**Request Body (`NewClusterConfiguration`):**
- `autoScale` (object, optional) —
- `clusterName` (string, optional) — A unique name for the job cluster.
- `numWorkers` (integer, optional) — Number of worker nodes configured for this cluster.
- `sparkConf` (string, optional) — The spark configuration in key-value pairs.
- `sparkVersion` (string, optional) — The Spark version used to run the application.

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
- `dependsOn` (array, optional) — Specifies the dependency graph of the task. All the tasks mentioned in this field need to be completed before executing this task.
- `gitConfig` (object, optional) —
- `isRetryOnTimeout` (boolean, optional) — An optional policy to specify whether to retry a task when it times out. The default behavior is to not retry on timeout. This property is not applicable for streaming task.
- `isStreaming` (boolean, optional) — An optional property to enable or disable the streaming capability for a task.
- `maxRetries` (integer, optional) — The maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it fails with status FAILED or INTERNAL_ERROR. Maximum value is 10. This property is not applicable for streaming task.
- `minRetryIntervalMillis` (integer, optional) — An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. If value is not provided, the run would be immediately retried. Maximum value is 10 mins (600000). This property is not applicable for streaming task.
- `notebookPath` (string, required) — The path where the notebook exists.
- `parameters` (array, optional) — An optional list of parameters.
- `runIf` (string, required) — The trigger rule based on which the current task execution is determined. Allowed values: ALL_SUCCESS, ALL_DONE, NONE_FAILED, AT_LEAST_ONE_SUCCESS, ALL_FAILED, AT_LEAST_ONE_FAILED.
- `source` (string, optional) — Source selected for a task. Either workspace or Git provider. Allowed values: WORKSPACE, GIT_PROVIDER.
- `taskKey` (string, required) — The display name of the task. User can specify a value for this.
- `timeoutSeconds` (integer, optional) — An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value.
- `type` (string, required) — The type of the task. Must be `NOTEBOOK_TASK` for this variant.

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
  "runIf": "ALL_SUCCESS",
  "source": "WORKSPACE",
  "taskKey": "<string>",
  "timeoutSeconds": 0,
  "type": "NOTEBOOK_TASK"
}
```

**Request Body (`Parameter`):**
- `name` (string, required) — The name of the defined parameter. May only contain alphanumeric characters, '_', '-', and '.'
- `value` (string, optional) — Value of the defined parameter.

**Example:**
```json
{
  "name": "<string>",
  "value": "<string>"
}
```

**Request Body (`PythonTask`):**
- `cluster` (object, required) —
- `commandLineArguments` (string, optional) — The command line arguments to pass to Python task.
- `dependsOn` (array, optional) — Specifies the dependency graph of the task. All the tasks mentioned in this field need to be completed before executing this task.
- `filePath` (string, required) — The path where the Python file exists.
- `gitConfig` (object, optional) —
- `isRetryOnTimeout` (boolean, optional) — An optional policy to specify whether to retry a task when it times out. The default behavior is to not retry on timeout. This property is not applicable for streaming task.
- `isStreaming` (boolean, optional) — An optional property to enable or disable the streaming capability for a task.
- `maxRetries` (integer, optional) — The maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it fails with status FAILED or INTERNAL_ERROR. Maximum value is 10. This property is not applicable for streaming task.
- `minRetryIntervalMillis` (integer, optional) — An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. If value is not provided, the run would be immediately retried. Maximum value is 10 mins (600000). This property is not applicable for streaming task.
- `runIf` (string, required) — The trigger rule based on which the current task execution is determined. Allowed values: ALL_SUCCESS, ALL_DONE, NONE_FAILED, AT_LEAST_ONE_SUCCESS, ALL_FAILED, AT_LEAST_ONE_FAILED.
- `source` (string, optional) — Source selected for a task. Either workspace or Git provider. Allowed values: WORKSPACE, GIT_PROVIDER.
- `taskKey` (string, required) — The display name of the task. User can specify a value for this.
- `timeoutSeconds` (integer, optional) — An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value.
- `type` (string, required) — The type of the task. Must be `PYTHON_TASK` for this variant.

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
  "runIf": "ALL_SUCCESS",
  "source": "WORKSPACE",
  "taskKey": "<string>",
  "timeoutSeconds": 0,
  "type": "PYTHON_TASK"
}
```

**Request Body (`Queue`):**
- `isEnabled` (boolean, required) — True if job queue is enabled.

**Example:**
```json
{
  "isEnabled": true
}
```

**Request Body (`Schedule`):**
- `pauseStatus` (string, optional) — Indicates whether the schedule is paused or not. Allowed values: PAUSED, UNPAUSED.
- `quartzCronExpression` (string, required) — A cron expression using Quartz syntax that describes the schedule for a job.
- `timezoneId` (string, required) — A Java timezone ID. The schedule of the job is resolved with respect to this timezone. Example - US/Pacific.

**Example:**
```json
{
  "pauseStatus": "PAUSED",
  "quartzCronExpression": "<string>",
  "timezoneId": "<string>"
}
```

**Request Body (`Task`):**
- `dependsOn` (array, optional) — Specifies the dependency graph of the task. All the tasks mentioned in this field need to be completed before executing this task.
- `isRetryOnTimeout` (boolean, optional) — An optional policy to specify whether to retry a task when it times out. The default behavior is to not retry on timeout. This property is not applicable for streaming task.
- `maxRetries` (integer, optional) — The maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it fails with status FAILED or INTERNAL_ERROR. Maximum value is 10. This property is not applicable for streaming task.
- `minRetryIntervalMillis` (integer, optional) — An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. If value is not provided, the run would be immediately retried. Maximum value is 10 mins (600000). This property is not applicable for streaming task.
- `runIf` (string, required) — The trigger rule based on which the current task execution is determined. Allowed values: ALL_SUCCESS, ALL_DONE, NONE_FAILED, AT_LEAST_ONE_SUCCESS, ALL_FAILED, AT_LEAST_ONE_FAILED.
- `taskKey` (string, required) — The display name of the task. User can specify a value for this.
- `type` (string, required) — The type of the task. Allowed values: NOTEBOOK_TASK, PYTHON_TASK, SPARK_SUBMIT_TASK, IF_ELSE_TASK, JOB_TASK, JAR_TASK, AGENT_TASK.

**Variants** (selected by `type`):
- `IF_ELSE_TASK` → `IfElseTask`
- `JOB_TASK` → `JobTask`
- `JAR_TASK` → `JarTask`
- `AGENT_TASK` → `AgentTask`
- `PYTHON_TASK` → `PythonTask`
- `NOTEBOOK_TASK` → `NotebookTask`

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
- `description` (string, optional) — A description for the job.
- `gitConfig` (object, optional) —
- `jobClusters` (array, optional) — List of job cluster configurations.
- `maxConcurrentRuns` (integer, optional) — Indicates the number of executions for the same job that can be run concurrently. The maximum value cannot exceed 1000.
- `name` (string, required) — A user-friendly name. Does not have to be unique, and is changeable.
- `parameters` (array, optional) — An optional list of parameters.
- `path` (string, optional) — The path to store the job definition in.
- `queue` (object, optional) —
- `runAs` (string, optional) — This points to the user or service account executing the job.
- `schedule` (object, optional) —
- `tasks` (array, optional) — List of tasks in a job.
- `timeoutSeconds` (integer, optional) — An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value.

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

`aidp workspace create --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`CreateWorkspaceDetails`):**
- `defaultCatalogKey` (string, optional) — The key of the catalog to be used as the default catalog for this workspace. A default catalog in the workspace will allow users to use that catalog without the need to refer it in the notebook. For example, if default catalog is iCat1, and it has schema1 and table1, you can refer to the table in a notebook using: schema1.table1.
- `description` (string, optional) — Description of the workspace.
- `displayName` (string, required) — A user-friendly name that has to be unique in a AI Data Platform instance.
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
- `fqdn` (string, optional) — A fully-qualified domain name (FQDN).
- `port` (string, optional) — Port number of the FQDN.

**Example:**
```json
{
  "fqdn": "<string>",
  "port": "<string>"
}
```

**Request Body (`WorkspaceNetworkConfigurationDetails`):**
- `dnsZones` (array, optional) — An array of fully qualified domain names to whitelist for workspace network access. Example: `[ "app.examplecorp.com", "app.examplecorp2.com" ]`
- `nsgIds` (array, optional) — An array of network security group OCIDs.
- `scanDetails` (array, optional) — An array of fqdn/port pairs used to create private endpoint. Each object is a simple key-value pair with FQDN as key and port number as value. [ { fqdn: "scan1.oracle.com", port: "1521"}, { fqdn: "scan2.oracle.com", port: "1521" } ]
- `subnetId` (string, optional) — The OCID of a subnet.

**Example:**
```json
{
  "dnsZones": [],
  "nsgIds": [],
  "scanDetails": [],
  "subnetId": "<string>"
}
```
---
**Return:** [Back to Workspace](#workspace) • [Top](#top)

#### `aidp workspace create-git-folder`
<a id="workspace-create-git-folder"></a>
Asynchronously creates a Git folder and clones the repository.
Asynchronously creates a Git folder and clones the repository. The aidp-async-operation-key header identifies the operation. Once SUCCEEDED, the folder's HEAD response with shouldIncludeMetadata=true exposes system:repoKey in the JSON file-metadata header for subsequent Git APIs.

**Usage:**

`aidp workspace create-git-folder <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`CreateGitFolderDetails`):**
- `branchName` (string, required) — Git branch name that is cloned.
- `credentialKey` (string, required) — Key of the current user's GIT_ACCOUNT user setting for repository authentication. User setting listings identify it by settingType=GIT_ACCOUNT and displayName; the matching entry's key is the credentialKey.
- `credentialStoreKey` (string, optional) — Key of the credential containing the Git server's TLS CA certificate, returned by credential listings filtered by displayName. Required when isPrivateConnectivityEnabled is true.
- `description` (string, optional) — Short description about the git repository.
- `folderPath` (string, required) — Workspace-relative path of the Git folder, without a leading slash (for example, `sample-repo`). The folder is located at `/Workspace/<folderPath>`.
- `gitConnectivityProfileKey` (string, optional) — Key of the private network profile used for Git connectivity, returned by private network profile listings filtered by name. Required when isPrivateConnectivityEnabled is true.
- `gitProviderKey` (string, optional) — key corresponding to Git service provider in git provider table.
- `gitRepositoryUrl` (string, required) — Git repository url used to clone.
- `isPrivateConnectivityEnabled` (boolean, optional) — Whether this Git folder uses private network connectivity.
- `sparseCheckout` (object, optional) —

**Example:**
```json
{
  "branchName": "<string>",
  "credentialKey": "<string>",
  "credentialStoreKey": "<string>",
  "description": "<string>",
  "folderPath": "<string>",
  "gitConnectivityProfileKey": "<string>",
  "gitProviderKey": "<string>",
  "gitRepositoryUrl": "<string>",
  "isPrivateConnectivityEnabled": true,
  "sparseCheckout": {}
}
```

**Request Body (`SparseCheckoutDetails`):**
- `mode` (string, optional) — Sparse checkout matching mode. Git supports cone and non-cone sparse checkout pattern styles; AIDP supports cone mode only. Allowed values: CONE.
- `patterns` (array, optional) — Repository-root-relative folder paths to include in the sparse worktree. Cone patterns apply only to folders; root-level files in the repository are always materialized. Empty or omitted patterns materialize root-level files only.

**Example:**
```json
{
  "mode": "CONE",
  "patterns": []
}
```
---
**Return:** [Back to Workspace](#workspace) • [Top](#top)

#### `aidp workspace delete`
<a id="workspace-delete"></a>
Deletes a workspace.

**Usage:**

`aidp workspace delete <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `time-data-lake-deletion` (datetime, optional) — Deletion time in the case that a workspace is deleted during AI Data Platform deletion.
---
**Return:** [Back to Workspace](#workspace) • [Top](#top)

#### `aidp workspace get`
<a id="workspace-get"></a>
Gets detailed information about a workspace.

**Usage:**

`aidp workspace get <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
---
**Return:** [Back to Workspace](#workspace) • [Top](#top)

#### `aidp workspace list`
<a id="workspace-list"></a>
Gets a list of workspaces.

**Usage:**

`aidp workspace list --instance-id <AI-DATA-PLATFORM-ID>`

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

`aidp workspace list-create-permissions --instance-id <AI-DATA-PLATFORM-ID>`

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

`aidp workspace list-permissions <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp workspace manage-create-permission --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

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
- `targets` (array, required) — The names/ocids of the users, groups or roles.
- `type` (string, required) — Grantee type. Allowed values: USER, ROLE, GROUP.

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

`aidp workspace manage-permission <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`AssignWorkspacePermissionDetails`):**
- `assignees` (object, required) —
- `permissions` (array, required) — The permissions assigned to the assignees. Allowed values: USER, PRIVILEGED_USER, ADMINISTRATOR.

**Example:**
```json
{
  "assignees": {},
  "permissions": [
    "USER"
  ]
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
- `targets` (array, required) — The names/ocids of the users, groups or roles.
- `type` (string, required) — Grantee type. Allowed values: USER, ROLE, GROUP.

**Example:**
```json
{
  "targets": [],
  "type": "USER"
}
```

**Request Body (`RevokeWorkspacePermissionDetails`):**
- `assignees` (object, required) —
- `permissions` (array, required) — The permissions revoked from the assignees. Allowed values: USER, PRIVILEGED_USER, ADMINISTRATOR.

**Example:**
```json
{
  "assignees": {},
  "permissions": [
    "USER"
  ]
}
```
---
**Return:** [Back to Workspace](#workspace) • [Top](#top)

#### `aidp workspace update`
<a id="workspace-update"></a>
Updates the details of a workspace.

**Usage:**

`aidp workspace update <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`Scan`):**
- `fqdn` (string, optional) — A fully-qualified domain name (FQDN).
- `port` (string, optional) — Port number of the FQDN.

**Example:**
```json
{
  "fqdn": "<string>",
  "port": "<string>"
}
```

**Request Body (`UpdateWorkspaceDetails`):**
- `defaultCatalogKey` (string, optional) — The key of the catalog to be used as the default catalog for this workspace. A default catalog in the workspace will allow users to use that catalog without the need to refer it in the notebook. For example, if default catalog is iCat1, and it has schema1 and table1, you can refer to the table in a notebook using: schema1.table1.
- `description` (string, optional) — Description of the workspace.
- `displayName` (string, optional) — A user-friendly name that has to be unique in a AI Data Platform instance.
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
- `dnsZones` (array, optional) — An array of fully qualified domain names to whitelist for workspace network access. Example: `[ "app.examplecorp.com", "app.examplecorp2.com" ]`
- `nsgIds` (array, optional) — An array of network security group OCIDs.
- `scanDetails` (array, optional) — An array of fqdn/port pairs used to create private endpoint. Each object is a simple key-value pair with FQDN as key and port number as value. [ { fqdn: "scan1.oracle.com", port: "1521"}, { fqdn: "scan2.oracle.com", port: "1521" } ]
- `subnetId` (string, optional) — The OCID of a subnet.

**Example:**
```json
{
  "dnsZones": [],
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

`aidp workspace update-async-operation-status <WORKSPACE-KEY> <ASYNC-OPERATION-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `async-operation-key` (string, required) — The unique identifier of an async operation
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`UpdateWorkspaceAsyncOperationStatusDetails`):**
- `externalId` (string, optional) — The external work-request-id if applicable.
- `properties` (object, optional) — The properties of operation on workspace.
- `state` (string, required) — Common lifecycle states for resources in a Compute Cluster: NETWORK_CONFIGURATION_CREATED       - The network configuration has been created. NETWORK_CONFIGURATION_UPDATED       - The network configuration has been updated. NETWORK_CONFIGURATION_DELETED       - The network configuration has been deleted. NETWORK_CONFIGURATION_FAILED        - The network configuration has been failed. Allowed values: NETWORK_CONFIGURATION_CREATED, NETWORK_CONFIGURATION_UPDATED, NETWORK_CONFIGURATION_DELETED, NETWORK_CONFIGURATION_FAILED.
- `stateMessage` (string, optional) — A descriptive message of the current state.

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
Workspace objects, workspace files, workspace object permissions, and and extract workspace zips.
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
- [workspace-object upload-and-extract-workspace-zip](#workspace-object-upload-and-extract-workspace-zip)
- [workspace-object upload-with-par](#workspace-object-upload-with-par)
- [workspace-object zip-and-download-workspace-folder](#workspace-object-zip-and-download-workspace-folder)
### Commands

#### `aidp workspace-object copy`
<a id="workspace-object-copy"></a>
Copy a workspace object to different location.

**Usage:**

`aidp workspace-object copy <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`CopyWorkspaceObjectDetails`):**
- `bufferSize` (integer, optional) — Buffer capacity to be hold for copying file from one source to destination.
- `fromPath` (string, optional) — The fully qualified path of the Workspace object that should be copied.
- `isDeleteSource` (boolean, optional) — Flag to delete the source file.
- `isIncludeOutputs` (boolean, optional) — Flag to indicate whether to include cell outputs when copying a notebook file. If false, all cell outputs will be cleared. Defaults to true if not specified. Only applies to notebook files.
- `isOverWrite` (boolean, optional) — Flag to overwrite pre existing destination file.
- `metadataKeys` (string, optional) — Comma separated metadata keys, namespace wildcards, or * to copy from the source object to the destination object.
- `toPath` (string, optional) — The fully qualified destination path to which the Workspace object should be copied.

**Example:**
```json
{
  "bufferSize": 0,
  "fromPath": "<string>",
  "isDeleteSource": true,
  "isIncludeOutputs": true,
  "isOverWrite": true,
  "metadataKeys": "<string>",
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

`aidp workspace-object create <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --path <target-path> --body @<local-file>`

**Path Arguments:**
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

`aidp workspace-object delete <WORKSPACE-KEY> <OBJECT-PATH> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp workspace-object download-with-par <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --path <target-path>`

**Path Arguments:**
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

`aidp workspace-object get <WORKSPACE-KEY> <OBJECT-PATH> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `object-path` (string, required) — The fully qualified path of the workspace object.
**Options:**
- `should-include-metadata` (boolean, optional) — Whether to include custom file or folder metadata. For HEAD requests, metadata is returned as JSON in the file-metadata response header.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---
**Return:** [Back to Workspace-Object](#workspace-object) • [Top](#top)

#### `aidp workspace-object head`
<a id="workspace-object-head"></a>
Returns metadata about a workspace object.
Returns metadata about a workspace object. The contents of the file are not retrieved.

**Usage:**

`aidp workspace-object head <WORKSPACE-KEY> <OBJECT-PATH> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `object-path` (string, required) — The fully qualified path of the workspace object.
**Options:**
- `should-include-metadata` (boolean, optional) — Whether to include custom file or folder metadata. For HEAD requests, metadata is returned as JSON in the file-metadata response header.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---
**Return:** [Back to Workspace-Object](#workspace-object) • [Top](#top)

#### `aidp workspace-object list`
<a id="workspace-object-list"></a>
Returns a list of objects in the workspace.

**Usage:**

`aidp workspace-object list <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --path <target-path>`

**Path Arguments:**
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

`aidp workspace-object list-permissions <WORKSPACE-KEY> <OBJECT-KEY> --instance-id <AI-DATA-PLATFORM-ID>`

**Path Arguments:**
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

`aidp workspace-object manage-permission <WORKSPACE-KEY> <OBJECT-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `object-key` (string, required) — The key of the workspace object.
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`AssignWorkspaceObjectPermissionDetails`):**
- `assignees` (object, required) —
- `isPermissionsInheritable` (boolean, optional) — Property to determine if permission should be inheritable or not, its default value is true. This is applicable only on workspace folders not on files.
- `permissions` (array, required) — The permissions assigned to the assignees. Allowed values: READ, USE, MANAGE, ADMIN.

**Example:**
```json
{
  "assignees": {},
  "isPermissionsInheritable": true,
  "permissions": [
    "READ"
  ]
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
- `targets` (array, required) — The names/ocids of the users, groups or roles.
- `type` (string, required) — Grantee type. Allowed values: USER, ROLE, GROUP.

**Example:**
```json
{
  "targets": [],
  "type": "USER"
}
```

**Request Body (`RevokeWorkspaceObjectPermissionDetails`):**
- `assignees` (object, required) —
- `isPermissionsInheritable` (boolean, optional) — Property to determine that permission which should be removed is inheritable or not. This is applicable only on workspace folders not on files.
- `permissions` (array, required) — The permissions revoked from the assignees. Allowed values: READ, USE, MANAGE, ADMIN.

**Example:**
```json
{
  "assignees": {},
  "isPermissionsInheritable": true,
  "permissions": [
    "READ"
  ]
}
```
---
**Return:** [Back to Workspace-Object](#workspace-object) • [Top](#top)

#### `aidp workspace-object move`
<a id="workspace-object-move"></a>
Moves a workspace object to different location.

**Usage:**

`aidp workspace-object move <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.

**Request Body (`MoveWorkspaceObjectDetails`):**
- `fromPath` (string, optional) — The fully qualified path of the workspace object that should be moved.
- `toPath` (string, optional) — The fully qualified destination path to which the Workspace object should be moved.

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

`aidp workspace-object rename <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`RenameWorkspaceObjectDetails`):**
- `newName` (string, optional) — The new name of the workspace object.
- `path` (string, optional) — The fully qualified path of the Workspace object that should be renamed.

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

`aidp workspace-object update <WORKSPACE-KEY> <OBJECT-PATH> --instance-id <AI-DATA-PLATFORM-ID> --body @<local-file>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
- `object-path` (string, required) — The fully qualified path of the workspace object.
**Options:**
- `object-description` (string, optional) — The description of the workspace object
- `if-match` (string, optional) — For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
---
**Return:** [Back to Workspace-Object](#workspace-object) • [Top](#top)

#### `aidp workspace-object upload-and-extract-workspace-zip`
<a id="workspace-object-upload-and-extract-workspace-zip"></a>
Creates or updates an asynchronous workspace ZIP upload and extraction operation.
Creates or updates an asynchronous workspace ZIP upload and extraction operation. CREATE returns a PAR URL for uploading the ZIP bytes and an async operation key. UPDATE records the uploaded ZIP metadata so extraction can continue.

**Usage:**

`aidp workspace-object upload-and-extract-workspace-zip <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`UploadAndExtractZipDetails`):**
- `action` (string, required) — Action to perform for the upload and extract operation. CREATE starts the async operation and returns an upload PAR URL. UPDATE records final uploaded object metadata for an existing operation. Allowed values: CREATE, UPDATE.
- `destinationFolderPath` (string, optional) — Workspace folder where the zip root folder will be extracted. Required for CREATE.
- `eTag` (string, optional) — Final Object Storage ETag for the uploaded zip object. If multipart upload is used, the caller commits the multipart upload directly with Object Storage before calling UPDATE.
- `isOverwrite` (boolean, optional) — Flag to overwrite existing files during extraction. If false, existing files are skipped.
- `operationKey` (string, optional) — Async operation key returned by the CREATE action. Required for UPDATE.
- `sizeInBytes` (integer, optional) — Final uploaded zip object size in bytes. Required for UPDATE.
- `zipFileName` (string, optional) — Name of the zip file that will be uploaded through the returned PAR URL. Required for CREATE.

**Example:**
```json
{
  "action": "CREATE",
  "destinationFolderPath": "<string>",
  "eTag": "<string>",
  "isOverwrite": true,
  "operationKey": "<string>",
  "sizeInBytes": 0,
  "zipFileName": "<string>"
}
```
---
**Return:** [Back to Workspace-Object](#workspace-object) • [Top](#top)

#### `aidp workspace-object upload-with-par`
<a id="workspace-object-upload-with-par"></a>
Creates a workspace file by generating PAR or updates the metadata by close file.
Creates a workspace file by generating PAR or updates the metadata by close file. If file exists, then it will be updated.

**Usage:**

`aidp workspace-object upload-with-par <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --path <target-path> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `is-overwrite` (boolean, optional) — A boolean which decides if overwrite is allowed
- `should-generate-new-par` (boolean, optional) — Flag to toggle to generate short living par
- `should-create-recursively` (boolean, optional) — A boolean which decides if parent directories should be created recursively during upload.
- `object-description` (string, optional) — The description of the workspace object
- `should-update-recent` (boolean, optional) — A flag to identify if the recent list should be updated.
- `path` (string, required) — The absolute path of the file or folder
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.
- `type` (string, optional) — The type of workspace object.

**Request Body (`UploadFileWithParDetails`):**
- `action` (string, optional) — Action type on create or close. Allowed values: CREATE, REFRESH, UPDATE.
- `eTag` (string, optional) — Etag that needs to be updated.
- `size` (integer, optional) — Size of the file needed when closed.
- `systemTags` (object, optional) — System tags for this resource. Each key is predefined and scoped to a namespace. Example: `{"orcl-cloud": {"free-tier-retained": "true"}}`

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

#### `aidp workspace-object zip-and-download-workspace-folder`
<a id="workspace-object-zip-and-download-workspace-folder"></a>
Starts asynchronous creation of a ZIP archive for a workspace folder.
Starts asynchronous creation of a ZIP archive for a workspace folder. The response includes a PAR URL for downloading the archive after the operation succeeds.

**Usage:**

`aidp workspace-object zip-and-download-workspace-folder <WORKSPACE-KEY> --instance-id <AI-DATA-PLATFORM-ID> --body <JSON>`

**Path Arguments:**
- `workspace-key` (string, required) — The key of the Workspace
**Options:**
- `opc-retry-token` (string, optional) — A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of running that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and removed from the system, then a retry of the original creation request might be rejected.
- `opc-request-id` (string, optional) — Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID. The only valid characters for request IDs are letters, numbers, underscore, and dash.

**Request Body (`ZipAndDownloadFolderDetails`):**
- `sourceFolderPath` (string, required) — Workspace folder path to zip for download.

**Example:**
```json
{
  "sourceFolderPath": "<string>"
}
```
---
**Return:** [Back to Workspace-Object](#workspace-object) • [Top](#top)
