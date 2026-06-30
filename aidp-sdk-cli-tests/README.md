# AIDP SDK and CLI invocation tests

This module contains Java SDK public API validation tests and installed `aidp` CLI invocation tests.

The default Maven suite runs the SDK package-level validation suite:
`src/test/resources/test-suites/sdk-validation.xml`.

Non-mutating SDK tests use shared resources named `SDK_Test_WS` and `SDK_Cluster`. If they do not
exist, the tests create them and leave them for later runs. `WorkspaceSdkIT` and
`ClusterMutationSdkIT` are the create/delete mutation flows.

The CLI suite remains available at
`src/test/resources/test-suites/cli-validation.xml`.
The rel-validation suite mirrors public CLI command coverage from the service integration tests
where an installed `aidp` command exists.

## Run

Run the default SDK validation suite from the repository root:

```bash
mvn -f datahub-sdk/aidp-sdk-cli-tests/pom.xml verify
```

Run all CLI rel-validation tests by selecting the CLI suite:

```bash
mvn -f datahub-sdk/aidp-sdk-cli-tests/pom.xml verify \
  -DsuiteXmlFile=src/test/resources/test-suites/cli-validation.xml \
  -Dgroups=rel_validation
```

Run all CLI rel-validation tests from the `datahub-sdk` directory:

```bash
mvn -f aidp-sdk-cli-tests/pom.xml verify -Dgroups=rel_validation
```

Build a packaged executable test jar without running live tests:

```bash
mvn -f aidp-sdk-cli-tests/pom.xml clean package -DskipTests
```

Run the packaged jar for the default SDK validation suite:

```bash
java -jar aidp-sdk-cli-tests/target/aidp-sdk-cli-tests-0.1-SNAPSHOT-test-jar-with-dependencies.jar \
  --groups rel_validation
```

Run the packaged jar for the CLI rel-validation suite:

```bash
java \
  -DaidpCliPath=/path/to/aidp \
  -DdataHubId=<aidp_instance_ocid> \
  -DdpServiceEndpoint=<aidp_dp_endpoint> \
  -Dregion=<oci_region> \
  -DociConfigFilePath=~/.oci/config \
  -DociProfile=DEFAULT \
  -jar aidp-sdk-cli-tests/target/aidp-sdk-cli-tests-0.1-SNAPSHOT-test-jar-with-dependencies.jar \
  --suiteXmlFile test-suites/cli-validation.xml \
  --groups rel_validation
```

The packaged runner accepts either JVM `-Dkey=value` properties before `-jar`, or runner options
after the jar such as `--suiteXmlFile`, `--groups`, `--threadCount`, and `--aidpCliPath`.

Run only workspace CLI tests:

```bash
mvn -f aidp-sdk-cli-tests/pom.xml verify -Dgroups=cli_workspace
```

Run only workspace-object CLI tests:

```bash
mvn -f aidp-sdk-cli-tests/pom.xml verify -Dgroups=cli_workspace_object
```

Run only cluster CLI tests:

```bash
mvn -f aidp-sdk-cli-tests/pom.xml verify -Dgroups=cli_cluster
```

Run only user-setting CLI tests:

```bash
mvn -f aidp-sdk-cli-tests/pom.xml verify -Dgroups=cli_user_setting
```

Run only notebook CLI tests:

```bash
mvn -f aidp-sdk-cli-tests/pom.xml verify -Dgroups=cli_notebook
```

Run only audit CLI tests:

```bash
mvn -f aidp-sdk-cli-tests/pom.xml verify -Dgroups=cli_audit
```

When running from the repository root, include the `datahub-sdk/` prefix:

```bash
mvn -f datahub-sdk/aidp-sdk-cli-tests/pom.xml verify -Dgroups=cli_workspace
mvn -f datahub-sdk/aidp-sdk-cli-tests/pom.xml verify -Dgroups=cli_workspace_object
mvn -f datahub-sdk/aidp-sdk-cli-tests/pom.xml verify -Dgroups=cli_cluster
mvn -f datahub-sdk/aidp-sdk-cli-tests/pom.xml verify -Dgroups=cli_user_setting
mvn -f datahub-sdk/aidp-sdk-cli-tests/pom.xml verify -Dgroups=cli_notebook
mvn -f datahub-sdk/aidp-sdk-cli-tests/pom.xml verify -Dgroups=cli_audit
```

Or run from inside the test module:

```bash
cd aidp-sdk-cli-tests
mvn verify -Dgroups=rel_validation
mvn verify -Dgroups=cli_workspace
mvn verify -Dgroups=cli_workspace_object
mvn verify -Dgroups=cli_cluster
mvn verify -Dgroups=cli_user_setting
mvn verify -Dgroups=cli_notebook
mvn verify -Dgroups=cli_audit
```

Useful overrides:

```bash
-DsuiteXmlFile=src/test/resources/test-suites/sdk-validation.xml
-DsdkTestConfigFile=/path/to/local-sdk.test.properties
-DsdkSharedWorkspaceName=SDK_Test_WS
-DsdkSharedClusterName=SDK_Cluster
-DaidpCliPath=/Library/Frameworks/Python.framework/Versions/3.13/bin/aidp
-DcliWorkspacePermissionTarget=<user_ocid>
-DcliCreateWorkspacePermissionTarget=<user_ocid>
-DcliWorkspaceObjectPermissionTarget=<user_ocid>
-DsdkPermissionTarget=<user_ocid>
-DcliProcessTimeoutSeconds=240
-DcliLogResponses=false
```

The workspace `create-git-folder` test requires an existing Git credential fixture. When these
properties are omitted, only that test is skipped:

```bash
-DcliWorkspaceGitRepositoryUrl=<git_repo_url>
-DcliWorkspaceGitBranchName=<branch_name>
-DcliWorkspaceGitCredentialKey=<user_setting_or_credential_key>
-DcliWorkspaceGitProviderKey=<provider_key>
```

Example with an installed CLI that is not on `PATH`:

```bash
mvn -f datahub-sdk/aidp-sdk-cli-tests/pom.xml verify \
  -Dgroups=cli_cluster \
  -DaidpCliPath=/Library/Frameworks/Python.framework/Versions/3.13/bin/aidp
```

The SDK default property file is `src/test/resources/sdk.test.properties`. It should provide at
least `dataHubId` and a client target. Provide `dpServiceEndpoint`, or omit it and provide `region`:

```properties
dataHubId=<aidp_instance_ocid>
dpServiceEndpoint=<aidp_dp_endpoint>
region=<oci_region>
ociConfigFilePath=~/.oci/config
ociProfile=DEFAULT
```

The CLI default property file is `src/test/resources/cli-test.properties`. It should provide at
least:

```properties
dataHubId=<aidp_instance_ocid>
dpServiceEndpoint=<aidp_dp_endpoint>
region=<oci_region>
ociConfigFilePath=~/.oci/config
ociProfile=DEFAULT
```

`-DcliTestConfigFile` and `-Dtestpropfilename.override` are supported only when a run needs
to point at a different environment file.

## Logging

The framework prints each TestNG test start/result and each CLI request/response to the Maven
console. Request bodies are logged separately from the command line, with `--body` shown as
`<inline-json-body>`.

Logging can be adjusted in `cli-test.properties` or with matching `-D` overrides:

```properties
cliLogRequests=true
cliLogResponses=true
cliLogRequestBodies=true
cliLogMaxCharacters=20000
```

## Reports

Maven Failsafe/TestNG writes reports under `target/failsafe-reports/` after a run:

```text
target/failsafe-reports/index.html
target/failsafe-reports/testng-results.xml
target/failsafe-reports/failsafe-summary.xml
target/failsafe-reports/junitreports/TEST-*.xml
```
