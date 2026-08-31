# Change Log
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](http://keepachangelog.com/).

## [4.1.1] - 2026-08-31

### Changed

- **Breaking:** Semantic Catalog was renamed to Data Lineage.

## [4.1.0] - 2026-08-07

### Added

- Support for `ExportLineage` in the Semantic Catalog service. (Preview) Export lineage for an anchor node as CSV.
- Support for `FetchEntityLineage` in the Semantic Catalog service. (Preview) Returns lineage for a given entity object.

## [2.0.1] - 2026-07-14

### Added

- Support for `CopyAgent` in the Agent service. Copy an Agent.
- Support for `CreateAgent` in the Agent service. Create an Agent.
- Support for `CreateBundleAction` in the Bundle service. (Preview) Create a bundle.
- Support for `DeleteAgentDeployment` in the Agent service. Delete an Agent Deployment.
- Support for `DeleteAgentSession` in the Agent service. Delete an Agent Session.
- Support for `DeleteAgent` in the Agent service. Delete an Agent.
- Support for `DeployAgent` in the Agent service. Deploy an Agent.
- Support for `DeployBundleAction` in the Bundle service. (Preview) Deploy all bundle resources.
- Support for `FetchBundleDeploymentStatusAction` in the Bundle service. (Preview) Returns the latest known deployment summary for a bundle.
- Support for `GetAgentDeployment` in the Agent service. Get Agent deployment details.
- Support for `GetAgentSessionTrace` in the Agent service. Get Agent Session trace for a given message key.
- Support for `GetAgentSession` in the Agent service. Get Agent Session details.
- Support for `GetAgent` in the Agent service. Get Agent details.
- Support for `ListAgentDeployments` in the Agent service. List all deployments of an Agent.
- Support for `ListAgentPermissions` in the Agent service. Get Agent permissions.
- Support for `ListAgentSessionChatHistories` in the Agent service. Get Agent Session chat messages.
- Support for `ListAgentSessions` in the Agent service. List all test sessions of an agent.
- Support for `ListAgents` in the Agent service. Get Agents in schema.
- Support for `ManageAgentPermission` in the Agent service. Update Agent permissions.
- Support for `PreviewAgentAgentCard` in the Agent service. Preview agent card.
- Support for `PurgeBundleAction` in the Bundle service. (Preview) Destroy all deployed bundle resources.
- Support for `QueryReplicaIds` in the Cluster service. Query compute replica identifiers from metrics data.
- Support for `RedeployAgentByKey` in the Agent service. Redeploy an Agent.
- Support for `SyncBundleAction` in the Bundle service. (Preview) Sync bundle artifacts and descriptors.
- Support for `UpdateAgentDeploymentMetadata` in the Agent service. Update agent card details.
- Support for `UpdateAgent` in the Agent service. Update an Agent.
- Support for `ValidateAgent` in the Agent service. Validate Agent diagram.

### Changed

- The method `CheckoutBranch` in the Git service changed: (Preview) Check out a Git branch.
  - Added: response code: `200`
  - Removed: response code: `202`
- The method `CommitPushGitRepository` in the Git service changed: (Preview) Commit and push Git changes.
  - Added: response code: `204`
  - Removed: response code: `202`
- The method `CreateGitBranch` in the Git service changed: (Preview) Create a Git branch.
  - Added: response code: `200`
  - Removed: response code: `202`
- The method `CreateGitFolder` in the Workspace service changed: Creates a git folder in the workspace.
  - Added: response code: `200`
  - Removed: response code: `202`
- The method `MergeGitRepository` in the Git service changed: (Preview) Merge Git branch.
  - Added: response code: `204`
  - Removed: response code: `202`
- The method `PullGitRepository` in the Git service changed: (Preview) Pull Git changes.
  - Added: response code: `204`
  - Removed: response code: `202`
- The method `RebaseGitRepository` in the Git service changed: (Preview) Rebase Git branch.
  - Added: response code: `204`
  - Removed: response code: `202`
- The method `ResetGitFolderState` in the Git service changed: (Preview) Reset workspace Git state.
  - Added: response code: `204`
  - Removed: response code: `202`
- The method `ResetGitRepository` in the Git service changed: (Preview) Reset Git branch.
  - Added: response code: `204`
  - Removed: response code: `202`
- The method `UpdateGitRepository` in the Git service changed: (Preview) Update Git repository metadata.
  - Added: response code: `204`
  - Removed: response code: `202`

## [1.0.2] - 2026-06-24

### Added

- Initial Release
- Added AI Dataplatform SDK and CLI

## [1.0.1] - 2026-06-11

### Added

- Initial Release
- Added AI Dataplatform SDK and CLI

## [1.0.0] - 2026-06-05

### Added

- Initial Release
- Added AI Dataplatform SDK and CLI
