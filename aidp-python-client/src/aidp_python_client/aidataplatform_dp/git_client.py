# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from __future__ import absolute_import

from oci._vendor import requests  # noqa: F401
from oci._vendor import six

from oci import retry, circuit_breaker  # noqa: F401
from oci.base_client import BaseClient
from oci.config import get_config_value_or_default, validate_config
from oci.signer import Signer
from oci.util import Sentinel, get_signer_from_authentication_type, AUTHENTICATION_TYPE_FIELD_NAME
from oci.exceptions import InvalidDeveloperToolConfiguration
from oci.developer_tool_configuration import OCI_SDK_ENABLED_SERVICES_SET
from .models import aidataplatform_dp_type_mapping
missing = Sentinel("Missing")


class GitClient(object):
    """
    Use the AI Data Platform Data Plane API to manage workspaces and objects in the workspace.
    """

    def __init__(self, config, **kwargs):
        """
        Creates a new service client

        :param dict config:
            Configuration keys and values as per `SDK and Tool Configuration <https://docs.oracle.com/iaas/Content/API/Concepts/sdkconfig.htm>`__.
            The :py:meth:`~oci.config.from_file` method can be used to load configuration from a file. Alternatively, a ``dict`` can be passed. You can validate_config
            the dict using :py:meth:`~oci.config.validate_config`

        :param str service_endpoint: (optional)
            The endpoint of the service to call using this client. For example ``https://iaas.us-ashburn-1.oraclecloud.com``. If this keyword argument is
            not provided then it will be derived using the region in the config parameter. You should only provide this keyword argument if you have an explicit
            need to specify a service endpoint.

        :param timeout: (optional)
            The connection and read timeouts for the client. The default values are connection timeout 10 seconds and read timeout 60 seconds. This keyword argument can be provided
            as a single float, in which case the value provided is used for both the read and connection timeouts, or as a tuple of two floats. If
            a tuple is provided then the first value is used as the connection timeout and the second value as the read timeout.
        :type timeout: float or tuple(float, float)

        :param signer: (optional)
            The signer to use when signing requests made by the service client. The default is to use a :py:class:`~oci.signer.Signer` based on the values
            provided in the config parameter.

            One use case for this parameter is for `Instance Principals authentication <https://docs.oracle.com/iaas/Content/Identity/Tasks/callingservicesfrominstances.htm>`__
            by passing an instance of :py:class:`~oci.auth.signers.InstancePrincipalsSecurityTokenSigner` as the value for this keyword argument
        :type signer: :py:class:`~oci.signer.AbstractBaseSigner`

        :param obj retry_strategy: (optional)
            A retry strategy to apply to all calls made by this service client (i.e. at the client level). There is no retry strategy applied by default.
            Retry strategies can also be applied at the operation level by passing a ``retry_strategy`` keyword argument as part of calling the operation.
            Any value provided at the operation level will override whatever is specified at the client level.

            This should be one of the strategies available in the :py:mod:`~oci.retry` module. A convenience :py:data:`~oci.retry.DEFAULT_RETRY_STRATEGY`
            is also available. The specifics of the default retry strategy are described `here <https://docs.oracle.com/en-us/iaas/tools/python/latest/sdk_behaviors/retries.html>`__.

        :param obj circuit_breaker_strategy: (optional)
            A circuit breaker strategy to apply to all calls made by this service client (i.e. at the client level). 
            This client uses :py:data:`~oci.circuit_breaker.DEFAULT_CIRCUIT_BREAKER_STRATEGY` as default if no circuit breaker strategy is provided.
            The specifics of circuit breaker strategy are described `here <https://docs.oracle.com/en-us/iaas/tools/python/latest/sdk_behaviors/circuit_breakers.html>`__.

        :param function circuit_breaker_callback: (optional)
            Callback function to receive any exceptions triggerred by the circuit breaker.

        :param bool client_level_realm_specific_endpoint_template_enabled: (optional)
            A boolean flag to indicate whether or not this client should be created with realm specific endpoint template enabled or disable. By default, this will be set as None.

        :param allow_control_chars: (optional)
            allow_control_chars is a boolean to indicate whether or not this client should allow control characters in the response object. By default, the client will not
            allow control characters to be in the response object.

        :param enable_strict_url_encoding: (optional)
            enable_strict_url_encoding is a boolean to indicate whether or not this client should enable strict url encoding in path params of a request.
            By default, the client will not enable strict url encoding
        """
        if not OCI_SDK_ENABLED_SERVICES_SET.is_service_enabled("aidataplatform_dp"):
            raise InvalidDeveloperToolConfiguration("The Developer Tool Configuration has disabled this service, this behavior is controlled by OCI_SDK_ENABLED_SERVICES_SET variable. Please check if your local developer-tool-configuration file configured the service you're targeting or contact the cloud provider on the availability of this service")

        validate_config(config, signer=kwargs.get('signer'))
        if 'signer' in kwargs:
            signer = kwargs['signer']

        elif AUTHENTICATION_TYPE_FIELD_NAME in config:
            signer = get_signer_from_authentication_type(config)

        else:
            signer = Signer(
                tenancy=config["tenancy"],
                user=config["user"],
                fingerprint=config["fingerprint"],
                private_key_file_location=config.get("key_file"),
                pass_phrase=get_config_value_or_default(config, "pass_phrase"),
                private_key_content=config.get("key_content")
            )

        base_client_init_kwargs = {
            'regional_client': True,
            'service_endpoint': kwargs.get('service_endpoint'),
            'base_path': '/20260430',
            'service_endpoint_template': 'https://datalake.{region}.oci.{secondLevelDomain}',
            'service_endpoint_template_per_realm': {  },  # noqa: E201 E202
            'service_uses_dualstack_endpoints_by_default': False,
            'skip_deserialization': kwargs.get('skip_deserialization', False),
            'circuit_breaker_strategy': kwargs.get('circuit_breaker_strategy', circuit_breaker.GLOBAL_CIRCUIT_BREAKER_STRATEGY),
            'client_level_realm_specific_endpoint_template_enabled': kwargs.get('client_level_realm_specific_endpoint_template_enabled'),
            'client_level_dualstack_endpoints_enabled': kwargs.get('client_level_dualstack_endpoints_enabled')
        }
        if 'timeout' in kwargs:
            base_client_init_kwargs['timeout'] = kwargs.get('timeout')
        if base_client_init_kwargs.get('circuit_breaker_strategy') is None:
            base_client_init_kwargs['circuit_breaker_strategy'] = circuit_breaker.DEFAULT_CIRCUIT_BREAKER_STRATEGY
        if 'allow_control_chars' in kwargs:
            base_client_init_kwargs['allow_control_chars'] = kwargs.get('allow_control_chars')
        if 'enable_strict_url_encoding' in kwargs:
            base_client_init_kwargs['enable_strict_url_encoding'] = kwargs.get('enable_strict_url_encoding')
        self.base_client = BaseClient("git", config, signer, aidataplatform_dp_type_mapping, **base_client_init_kwargs)
        self.retry_strategy = kwargs.get('retry_strategy', retry.DEFAULT_RETRY_STRATEGY)
        self.circuit_breaker_callback = kwargs.get('circuit_breaker_callback')

    def checkout_branch(self, ai_data_platform_id, workspace_key, git_repository_key, checkout_branch_details, **kwargs):
        """
        (Preview) Asynchronously checks out the requested branch in the workspace Git
        folder. Checkout normally resets the local branch to origin/{branchName}, with a
        local-branch fallback. The aidp-async-operation-key response header identifies
        the job; its SUCCEEDED status confirms completion.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str git_repository_key: (required)
            The opaque repository key, available as GitRepository.key or system:repoKey
            in the folder's JSON file-metadata HEAD response header when
            shouldIncludeMetadata=true. Distinct from the async operation resourceName.

        :param oci.aidataplatform_dp.models.CheckoutBranchDetails checkout_branch_details: (required)
            Details for the new branch.

        :param str opc_retry_token: (optional)
            A token that uniquely identifies a request so it can be retried in case of a timeout or
            server error without risk of running that same action again. Retry tokens expire after 24
            hours, but can be invalidated before then due to conflicting operations. For example, if a resource
            has been deleted and removed from the system, then a retry of the original creation request
            might be rejected.

        :param str opc_request_id: (optional)
            Unique Oracle-assigned identifier for the request. If you need to contact
            Oracle about a particular request, please provide the request ID.
            The only valid characters for request IDs are letters, numbers,
            underscore, and dash.

        :param bool should_update_recent: (optional)
            A flag to identify if the recent list should be updated.

        :param str if_match: (optional)
            For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
            `if-match` parameter to the value of the etag from a previous GET or POST response for
            that resource. The resource will be updated or deleted only if the etag you provide
            matches the resource's current etag value.

        :param obj retry_strategy: (optional)
            A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level.

            This should be one of the strategies available in the :py:mod:`~oci.retry` module. This operation uses :py:data:`~oci.retry.DEFAULT_RETRY_STRATEGY` as default if no retry strategy is provided.
            The specifics of the default retry strategy are described `here <https://docs.oracle.com/en-us/iaas/tools/python/latest/sdk_behaviors/retries.html>`__.

            To have this operation explicitly not perform any retries, pass an instance of :py:class:`~oci.retry.NoneRetryStrategy`.

        :param bool allow_control_chars: (optional)
            allow_control_chars is a boolean to indicate whether or not this request should allow control characters in the response object.
            By default, the response will not allow control characters in strings

        :param bool enable_strict_url_encoding: (optional)
            enable_strict_url_encoding is a boolean to indicate whether or not this request should enable strict url encoding for path params.
            By default, strict url encoding for path params is disabled

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.GitBranch`
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey', 'gitRepositoryKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/gitRepositories/{gitRepositoryKey}/actions/checkOutBranch"
        method = "POST"
        operation_name = "checkout_branch"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "opc_retry_token",
            "opc_request_id",
            "should_update_recent",
            "if_match"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"checkout_branch got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "gitRepositoryKey": git_repository_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError(f'Parameter {k} cannot be None, whitespace or empty string')

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "opc-retry-token": kwargs.get("opc_retry_token", missing),
            "opc-request-id": kwargs.get("opc_request_id", missing),
            "should-update-recent": kwargs.get("should_update_recent", missing),
            "if-match": kwargs.get("if_match", missing)
        }
        header_params = {k: v for (k, v) in six.iteritems(header_params) if v is not missing and v is not None}

        retry_strategy = self.base_client.get_preferred_retry_strategy(
            operation_retry_strategy=kwargs.get('retry_strategy'),
            client_retry_strategy=self.retry_strategy
        )
        if retry_strategy is None:
            retry_strategy = retry.DEFAULT_RETRY_STRATEGY

        if retry_strategy:
            if not isinstance(retry_strategy, retry.NoneRetryStrategy):
                self.base_client.add_opc_retry_token_if_needed(header_params)
                self.base_client.add_opc_client_retries_header(header_params)
                retry_strategy.add_circuit_breaker_callback(self.circuit_breaker_callback)
            return retry_strategy.make_retrying_call(
                self.base_client.call_api,
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=checkout_branch_details,
                response_type="GitBranch",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=checkout_branch_details,
                response_type="GitBranch",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def commit_push_git_repository(self, ai_data_platform_id, workspace_key, git_repository_key, commit_push_details, **kwargs):
        """
        (Preview) Asynchronously commits and pushes the stored repository branch. For
        normal commits, omitting files stages all local changes. After conflicts are
        resolved, completes a merge or continues a rebase; rebase continuation
        force-pushes. The aidp-async-operation-key response header identifies the job;
        its SUCCEEDED status confirms completion.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str git_repository_key: (required)
            The opaque repository key, available as GitRepository.key or system:repoKey
            in the folder's JSON file-metadata HEAD response header when
            shouldIncludeMetadata=true. Distinct from the async operation resourceName.

        :param oci.aidataplatform_dp.models.CommitPushDetails commit_push_details: (required)
            Commit details.

        :param str opc_retry_token: (optional)
            A token that uniquely identifies a request so it can be retried in case of a timeout or
            server error without risk of running that same action again. Retry tokens expire after 24
            hours, but can be invalidated before then due to conflicting operations. For example, if a resource
            has been deleted and removed from the system, then a retry of the original creation request
            might be rejected.

        :param str opc_request_id: (optional)
            Unique Oracle-assigned identifier for the request. If you need to contact
            Oracle about a particular request, please provide the request ID.
            The only valid characters for request IDs are letters, numbers,
            underscore, and dash.

        :param bool should_update_recent: (optional)
            A flag to identify if the recent list should be updated.

        :param str if_match: (optional)
            For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
            `if-match` parameter to the value of the etag from a previous GET or POST response for
            that resource. The resource will be updated or deleted only if the etag you provide
            matches the resource's current etag value.

        :param obj retry_strategy: (optional)
            A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level.

            This should be one of the strategies available in the :py:mod:`~oci.retry` module. This operation uses :py:data:`~oci.retry.DEFAULT_RETRY_STRATEGY` as default if no retry strategy is provided.
            The specifics of the default retry strategy are described `here <https://docs.oracle.com/en-us/iaas/tools/python/latest/sdk_behaviors/retries.html>`__.

            To have this operation explicitly not perform any retries, pass an instance of :py:class:`~oci.retry.NoneRetryStrategy`.

        :param bool allow_control_chars: (optional)
            allow_control_chars is a boolean to indicate whether or not this request should allow control characters in the response object.
            By default, the response will not allow control characters in strings

        :param bool enable_strict_url_encoding: (optional)
            enable_strict_url_encoding is a boolean to indicate whether or not this request should enable strict url encoding for path params.
            By default, strict url encoding for path params is disabled

        :return: A :class:`~oci.response.Response` object with data of type None
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey', 'gitRepositoryKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/gitRepositories/{gitRepositoryKey}/actions/commitPush"
        method = "POST"
        operation_name = "commit_push_git_repository"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "opc_retry_token",
            "opc_request_id",
            "should_update_recent",
            "if_match"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"commit_push_git_repository got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "gitRepositoryKey": git_repository_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError(f'Parameter {k} cannot be None, whitespace or empty string')

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "opc-retry-token": kwargs.get("opc_retry_token", missing),
            "opc-request-id": kwargs.get("opc_request_id", missing),
            "should-update-recent": kwargs.get("should_update_recent", missing),
            "if-match": kwargs.get("if_match", missing)
        }
        header_params = {k: v for (k, v) in six.iteritems(header_params) if v is not missing and v is not None}

        retry_strategy = self.base_client.get_preferred_retry_strategy(
            operation_retry_strategy=kwargs.get('retry_strategy'),
            client_retry_strategy=self.retry_strategy
        )
        if retry_strategy is None:
            retry_strategy = retry.DEFAULT_RETRY_STRATEGY

        if retry_strategy:
            if not isinstance(retry_strategy, retry.NoneRetryStrategy):
                self.base_client.add_opc_retry_token_if_needed(header_params)
                self.base_client.add_opc_client_retries_header(header_params)
                retry_strategy.add_circuit_breaker_callback(self.circuit_breaker_callback)
            return retry_strategy.make_retrying_call(
                self.base_client.call_api,
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=commit_push_details,
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=commit_push_details,
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def create_git_branch(self, ai_data_platform_id, workspace_key, git_repository_key, create_git_branch_details, **kwargs):
        """
        (Preview) Asynchronously creates a branch from the current HEAD, checks it out
        in the stored Git folder, and pushes it to origin. The aidp-async-operation-key
        response header identifies the job; its SUCCEEDED status confirms completion.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str git_repository_key: (required)
            The opaque repository key, available as GitRepository.key or system:repoKey
            in the folder's JSON file-metadata HEAD response header when
            shouldIncludeMetadata=true. Distinct from the async operation resourceName.

        :param oci.aidataplatform_dp.models.CreateGitBranchDetails create_git_branch_details: (required)
            Name of the branch to create in the stored Git folder.

        :param str opc_retry_token: (optional)
            A token that uniquely identifies a request so it can be retried in case of a timeout or
            server error without risk of running that same action again. Retry tokens expire after 24
            hours, but can be invalidated before then due to conflicting operations. For example, if a resource
            has been deleted and removed from the system, then a retry of the original creation request
            might be rejected.

        :param str opc_request_id: (optional)
            Unique Oracle-assigned identifier for the request. If you need to contact
            Oracle about a particular request, please provide the request ID.
            The only valid characters for request IDs are letters, numbers,
            underscore, and dash.

        :param bool should_update_recent: (optional)
            A flag to identify if the recent list should be updated.

        :param obj retry_strategy: (optional)
            A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level.

            This should be one of the strategies available in the :py:mod:`~oci.retry` module. This operation uses :py:data:`~oci.retry.DEFAULT_RETRY_STRATEGY` as default if no retry strategy is provided.
            The specifics of the default retry strategy are described `here <https://docs.oracle.com/en-us/iaas/tools/python/latest/sdk_behaviors/retries.html>`__.

            To have this operation explicitly not perform any retries, pass an instance of :py:class:`~oci.retry.NoneRetryStrategy`.

        :param bool allow_control_chars: (optional)
            allow_control_chars is a boolean to indicate whether or not this request should allow control characters in the response object.
            By default, the response will not allow control characters in strings

        :param bool enable_strict_url_encoding: (optional)
            enable_strict_url_encoding is a boolean to indicate whether or not this request should enable strict url encoding for path params.
            By default, strict url encoding for path params is disabled

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.CreateGitBranch`
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey', 'gitRepositoryKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/gitRepositories/{gitRepositoryKey}/gitBranches"
        method = "POST"
        operation_name = "create_git_branch"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "opc_retry_token",
            "opc_request_id",
            "should_update_recent"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"create_git_branch got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "gitRepositoryKey": git_repository_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError(f'Parameter {k} cannot be None, whitespace or empty string')

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "opc-retry-token": kwargs.get("opc_retry_token", missing),
            "opc-request-id": kwargs.get("opc_request_id", missing),
            "should-update-recent": kwargs.get("should_update_recent", missing)
        }
        header_params = {k: v for (k, v) in six.iteritems(header_params) if v is not missing and v is not None}

        retry_strategy = self.base_client.get_preferred_retry_strategy(
            operation_retry_strategy=kwargs.get('retry_strategy'),
            client_retry_strategy=self.retry_strategy
        )
        if retry_strategy is None:
            retry_strategy = retry.DEFAULT_RETRY_STRATEGY

        if retry_strategy:
            if not isinstance(retry_strategy, retry.NoneRetryStrategy):
                self.base_client.add_opc_retry_token_if_needed(header_params)
                self.base_client.add_opc_client_retries_header(header_params)
                retry_strategy.add_circuit_breaker_callback(self.circuit_breaker_callback)
            return retry_strategy.make_retrying_call(
                self.base_client.call_api,
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=create_git_branch_details,
                response_type="CreateGitBranch",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=create_git_branch_details,
                response_type="CreateGitBranch",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def get_git_diff_detail(self, ai_data_platform_id, workspace_key, git_repository_key, git_folder_path, branch_name, git_file_path, **kwargs):
        """
        (Preview) Returns a local unified diff for a repository-relative file.
        contextLines and maxPatchBytes are not currently applied by execution.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str git_repository_key: (required)
            The opaque repository key, available as GitRepository.key or system:repoKey
            in the folder's JSON file-metadata HEAD response header when
            shouldIncludeMetadata=true. Distinct from the async operation resourceName.

        :param str git_folder_path: (required)
            Workspace path of the Git folder, distinct from repository-relative file paths.

        :param str branch_name: (required)
            Expected branch name for the folder context.

        :param str git_file_path: (required)
            File path relative to repository root.

        :param int context_lines: (optional)
            Requested diff context lines. Current execution does not apply this value.

        :param int max_patch_bytes: (optional)
            Requested maximum patch bytes. Current execution does not enforce this
            value.

        :param str opc_request_id: (optional)
            Unique Oracle-assigned identifier for the request. If you need to contact
            Oracle about a particular request, please provide the request ID.
            The only valid characters for request IDs are letters, numbers,
            underscore, and dash.

        :param obj retry_strategy: (optional)
            A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level.

            This should be one of the strategies available in the :py:mod:`~oci.retry` module. This operation uses :py:data:`~oci.retry.DEFAULT_RETRY_STRATEGY` as default if no retry strategy is provided.
            The specifics of the default retry strategy are described `here <https://docs.oracle.com/en-us/iaas/tools/python/latest/sdk_behaviors/retries.html>`__.

            To have this operation explicitly not perform any retries, pass an instance of :py:class:`~oci.retry.NoneRetryStrategy`.

        :param bool allow_control_chars: (optional)
            allow_control_chars is a boolean to indicate whether or not this request should allow control characters in the response object.
            By default, the response will not allow control characters in strings

        :param bool enable_strict_url_encoding: (optional)
            enable_strict_url_encoding is a boolean to indicate whether or not this request should enable strict url encoding for path params.
            By default, strict url encoding for path params is disabled

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.GitDiffDetail`
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey', 'gitRepositoryKey', 'gitFolderPath', 'branchName', 'gitFilePath']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/gitRepositories/{gitRepositoryKey}/actions/gitDiffDetails"
        method = "GET"
        operation_name = "get_git_diff_detail"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "context_lines",
            "max_patch_bytes",
            "opc_request_id"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"get_git_diff_detail got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "gitRepositoryKey": git_repository_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError(f'Parameter {k} cannot be None, whitespace or empty string')

        query_params = {
            "gitFolderPath": git_folder_path,
            "branchName": branch_name,
            "gitFilePath": git_file_path,
            "contextLines": kwargs.get("context_lines", missing),
            "maxPatchBytes": kwargs.get("max_patch_bytes", missing)
        }
        query_params = {k: v for (k, v) in six.iteritems(query_params) if v is not missing and v is not None}

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "opc-request-id": kwargs.get("opc_request_id", missing)
        }
        header_params = {k: v for (k, v) in six.iteritems(header_params) if v is not missing and v is not None}

        retry_strategy = self.base_client.get_preferred_retry_strategy(
            operation_retry_strategy=kwargs.get('retry_strategy'),
            client_retry_strategy=self.retry_strategy
        )
        if retry_strategy is None:
            retry_strategy = retry.DEFAULT_RETRY_STRATEGY

        if retry_strategy:
            if not isinstance(retry_strategy, retry.NoneRetryStrategy):
                self.base_client.add_opc_client_retries_header(header_params)
                retry_strategy.add_circuit_breaker_callback(self.circuit_breaker_callback)
            return retry_strategy.make_retrying_call(
                self.base_client.call_api,
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                query_params=query_params,
                header_params=header_params,
                response_type="GitDiffDetail",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                query_params=query_params,
                header_params=header_params,
                response_type="GitDiffDetail",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def get_git_operation_state(self, ai_data_platform_id, workspace_key, git_repository_key, **kwargs):
        """
        (Preview) Returns a snapshot of Git worktree operation state and readiness for
        an optional operationName. CLEAN does not imply no local changes. This endpoint
        does not report asynchronous job progress.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str git_repository_key: (required)
            The opaque repository key, available as GitRepository.key or system:repoKey
            in the folder's JSON file-metadata HEAD response header when
            shouldIncludeMetadata=true. Distinct from the async operation resourceName.

        :param str operation_name: (optional)
            Operation intent, such as PULL, PUSH, or DIFF_LIST, used to compute
            isAllowed. Does not execute the operation.

        :param str branch_name: (optional)
            Expected branch name for the folder context.

        :param str opc_request_id: (optional)
            Unique Oracle-assigned identifier for the request. If you need to contact
            Oracle about a particular request, please provide the request ID.
            The only valid characters for request IDs are letters, numbers,
            underscore, and dash.

        :param obj retry_strategy: (optional)
            A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level.

            This should be one of the strategies available in the :py:mod:`~oci.retry` module. This operation uses :py:data:`~oci.retry.DEFAULT_RETRY_STRATEGY` as default if no retry strategy is provided.
            The specifics of the default retry strategy are described `here <https://docs.oracle.com/en-us/iaas/tools/python/latest/sdk_behaviors/retries.html>`__.

            To have this operation explicitly not perform any retries, pass an instance of :py:class:`~oci.retry.NoneRetryStrategy`.

        :param bool allow_control_chars: (optional)
            allow_control_chars is a boolean to indicate whether or not this request should allow control characters in the response object.
            By default, the response will not allow control characters in strings

        :param bool enable_strict_url_encoding: (optional)
            enable_strict_url_encoding is a boolean to indicate whether or not this request should enable strict url encoding for path params.
            By default, strict url encoding for path params is disabled

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.GitOperationState`
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey', 'gitRepositoryKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/gitRepositories/{gitRepositoryKey}/actions/gitOperationState"
        method = "GET"
        operation_name = "get_git_operation_state"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "operation_name",
            "branch_name",
            "opc_request_id"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"get_git_operation_state got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "gitRepositoryKey": git_repository_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError(f'Parameter {k} cannot be None, whitespace or empty string')

        query_params = {
            "operationName": kwargs.get("operation_name", missing),
            "branchName": kwargs.get("branch_name", missing)
        }
        query_params = {k: v for (k, v) in six.iteritems(query_params) if v is not missing and v is not None}

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "opc-request-id": kwargs.get("opc_request_id", missing)
        }
        header_params = {k: v for (k, v) in six.iteritems(header_params) if v is not missing and v is not None}

        retry_strategy = self.base_client.get_preferred_retry_strategy(
            operation_retry_strategy=kwargs.get('retry_strategy'),
            client_retry_strategy=self.retry_strategy
        )
        if retry_strategy is None:
            retry_strategy = retry.DEFAULT_RETRY_STRATEGY

        if retry_strategy:
            if not isinstance(retry_strategy, retry.NoneRetryStrategy):
                self.base_client.add_opc_client_retries_header(header_params)
                retry_strategy.add_circuit_breaker_callback(self.circuit_breaker_callback)
            return retry_strategy.make_retrying_call(
                self.base_client.call_api,
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                query_params=query_params,
                header_params=header_params,
                response_type="GitOperationState",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                query_params=query_params,
                header_params=header_params,
                response_type="GitOperationState",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def get_git_repository(self, ai_data_platform_id, workspace_key, git_repository_key, **kwargs):
        """
        (Preview) Returns stored repository URL, folder, branch, and connectivity
        references. The authentication setting key is included only when
        shouldIncludeCredentialKey=true.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str git_repository_key: (required)
            The opaque repository key, available as GitRepository.key or system:repoKey
            in the folder's JSON file-metadata HEAD response header when
            shouldIncludeMetadata=true. Distinct from the async operation resourceName.

        :param bool should_include_credential_key: (optional)
            A flag to include credential key in response. If 'true', credential key will be returned in response. Default 'false'.

        :param str opc_request_id: (optional)
            Unique Oracle-assigned identifier for the request. If you need to contact
            Oracle about a particular request, please provide the request ID.
            The only valid characters for request IDs are letters, numbers,
            underscore, and dash.

        :param obj retry_strategy: (optional)
            A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level.

            This should be one of the strategies available in the :py:mod:`~oci.retry` module. This operation uses :py:data:`~oci.retry.DEFAULT_RETRY_STRATEGY` as default if no retry strategy is provided.
            The specifics of the default retry strategy are described `here <https://docs.oracle.com/en-us/iaas/tools/python/latest/sdk_behaviors/retries.html>`__.

            To have this operation explicitly not perform any retries, pass an instance of :py:class:`~oci.retry.NoneRetryStrategy`.

        :param bool allow_control_chars: (optional)
            allow_control_chars is a boolean to indicate whether or not this request should allow control characters in the response object.
            By default, the response will not allow control characters in strings

        :param bool enable_strict_url_encoding: (optional)
            enable_strict_url_encoding is a boolean to indicate whether or not this request should enable strict url encoding for path params.
            By default, strict url encoding for path params is disabled

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.GitRepository`
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey', 'gitRepositoryKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/gitRepositories/{gitRepositoryKey}"
        method = "GET"
        operation_name = "get_git_repository"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "should_include_credential_key",
            "opc_request_id"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"get_git_repository got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "gitRepositoryKey": git_repository_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError(f'Parameter {k} cannot be None, whitespace or empty string')

        query_params = {
            "shouldIncludeCredentialKey": kwargs.get("should_include_credential_key", missing)
        }
        query_params = {k: v for (k, v) in six.iteritems(query_params) if v is not missing and v is not None}

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "opc-request-id": kwargs.get("opc_request_id", missing)
        }
        header_params = {k: v for (k, v) in six.iteritems(header_params) if v is not missing and v is not None}

        retry_strategy = self.base_client.get_preferred_retry_strategy(
            operation_retry_strategy=kwargs.get('retry_strategy'),
            client_retry_strategy=self.retry_strategy
        )
        if retry_strategy is None:
            retry_strategy = retry.DEFAULT_RETRY_STRATEGY

        if retry_strategy:
            if not isinstance(retry_strategy, retry.NoneRetryStrategy):
                self.base_client.add_opc_client_retries_header(header_params)
                retry_strategy.add_circuit_breaker_callback(self.circuit_breaker_callback)
            return retry_strategy.make_retrying_call(
                self.base_client.call_api,
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                query_params=query_params,
                header_params=header_params,
                response_type="GitRepository",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                query_params=query_params,
                header_params=header_params,
                response_type="GitRepository",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def list_git_branches(self, ai_data_platform_id, workspace_key, git_repository_key, **kwargs):
        """
        (Preview) Lists branches on origin with pagination. Name filters and sort
        controls are not currently applied. Page tokens become invalid if the branch
        listing changes.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str git_repository_key: (required)
            The opaque repository key, available as GitRepository.key or system:repoKey
            in the folder's JSON file-metadata HEAD response header when
            shouldIncludeMetadata=true. Distinct from the async operation resourceName.

        :param str display_name: (optional)
            A filter to return only resources that match the given display name exactly.

        :param str display_name_contains: (optional)
            A filter to return only resources that have a display name containing the text provided.

        :param int limit: (optional)
            For list pagination. The maximum number of results per page, or items to return in a
            paginated \"List\" call. For important details about how pagination works, see
            `List Pagination`__.

            __ https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine

        :param str page: (optional)
            For list pagination. The value of the opc-next-page response header from the previous
            \"List\" call. For important details about how pagination works, see
            `List Pagination`__.

            __ https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine

        :param str sort_order: (optional)
            The sort order to use, either ascending (`ASC`) or descending (`DESC`).

            Allowed values are: "ASC", "DESC"

        :param str sort_by: (optional)
            The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending.

            Allowed values are: "timeCreated", "displayName", "status"

        :param str opc_request_id: (optional)
            Unique Oracle-assigned identifier for the request. If you need to contact
            Oracle about a particular request, please provide the request ID.
            The only valid characters for request IDs are letters, numbers,
            underscore, and dash.

        :param obj retry_strategy: (optional)
            A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level.

            This should be one of the strategies available in the :py:mod:`~oci.retry` module. This operation uses :py:data:`~oci.retry.DEFAULT_RETRY_STRATEGY` as default if no retry strategy is provided.
            The specifics of the default retry strategy are described `here <https://docs.oracle.com/en-us/iaas/tools/python/latest/sdk_behaviors/retries.html>`__.

            To have this operation explicitly not perform any retries, pass an instance of :py:class:`~oci.retry.NoneRetryStrategy`.

        :param bool allow_control_chars: (optional)
            allow_control_chars is a boolean to indicate whether or not this request should allow control characters in the response object.
            By default, the response will not allow control characters in strings

        :param bool enable_strict_url_encoding: (optional)
            enable_strict_url_encoding is a boolean to indicate whether or not this request should enable strict url encoding for path params.
            By default, strict url encoding for path params is disabled

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.GitBranchCollection`
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey', 'gitRepositoryKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/gitRepositories/{gitRepositoryKey}/gitBranches"
        method = "GET"
        operation_name = "list_git_branches"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "display_name",
            "display_name_contains",
            "limit",
            "page",
            "sort_order",
            "sort_by",
            "opc_request_id"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"list_git_branches got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "gitRepositoryKey": git_repository_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError(f'Parameter {k} cannot be None, whitespace or empty string')

        if 'sort_order' in kwargs:
            sort_order_allowed_values = ["ASC", "DESC"]
            if kwargs['sort_order'] not in sort_order_allowed_values:
                raise ValueError(
                    f"Invalid value for `sort_order`, must be one of { sort_order_allowed_values }"
                )

        if 'sort_by' in kwargs:
            sort_by_allowed_values = ["timeCreated", "displayName", "status"]
            if kwargs['sort_by'] not in sort_by_allowed_values:
                raise ValueError(
                    f"Invalid value for `sort_by`, must be one of { sort_by_allowed_values }"
                )

        query_params = {
            "displayName": kwargs.get("display_name", missing),
            "displayNameContains": kwargs.get("display_name_contains", missing),
            "limit": kwargs.get("limit", missing),
            "page": kwargs.get("page", missing),
            "sortOrder": kwargs.get("sort_order", missing),
            "sortBy": kwargs.get("sort_by", missing)
        }
        query_params = {k: v for (k, v) in six.iteritems(query_params) if v is not missing and v is not None}

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "opc-request-id": kwargs.get("opc_request_id", missing)
        }
        header_params = {k: v for (k, v) in six.iteritems(header_params) if v is not missing and v is not None}

        retry_strategy = self.base_client.get_preferred_retry_strategy(
            operation_retry_strategy=kwargs.get('retry_strategy'),
            client_retry_strategy=self.retry_strategy
        )
        if retry_strategy is None:
            retry_strategy = retry.DEFAULT_RETRY_STRATEGY

        if retry_strategy:
            if not isinstance(retry_strategy, retry.NoneRetryStrategy):
                self.base_client.add_opc_client_retries_header(header_params)
                retry_strategy.add_circuit_breaker_callback(self.circuit_breaker_callback)
            return retry_strategy.make_retrying_call(
                self.base_client.call_api,
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                query_params=query_params,
                header_params=header_params,
                response_type="GitBranchCollection",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                query_params=query_params,
                header_params=header_params,
                response_type="GitBranchCollection",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def list_git_diffs(self, ai_data_platform_id, workspace_key, git_repository_key, git_folder_path, branch_name, **kwargs):
        """
        (Preview) Lists local file changes with snapshot pagination. compareTo, filter,
        displayName, and sort controls are not currently applied; this is not an
        upstream comparison.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str git_repository_key: (required)
            The opaque repository key, available as GitRepository.key or system:repoKey
            in the folder's JSON file-metadata HEAD response header when
            shouldIncludeMetadata=true. Distinct from the async operation resourceName.

        :param str git_folder_path: (required)
            Workspace path of the Git folder, distinct from repository-relative file paths.

        :param str branch_name: (required)
            Expected branch name for the folder context.

        :param str compare_to: (optional)
            Requested comparison reference. Results describe local file changes regardless
            of the supplied value.

            Allowed values are: "HEAD", "UPSTREAM", "INDEX", "WORKTREE", "MERGE_BASE"

        :param str filter: (optional)
            Requested file-change filter. Results include all detected local file changes
            regardless of the supplied value.

            Allowed values are: "ALL", "DIFF_ONLY", "CONFLICTS_ONLY"

        :param int limit: (optional)
            For list pagination. The maximum number of results per page, or items to return in a
            paginated \"List\" call. For important details about how pagination works, see
            `List Pagination`__.

            __ https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine

        :param str page: (optional)
            For list pagination. The value of the opc-next-page response header from the previous
            \"List\" call. For important details about how pagination works, see
            `List Pagination`__.

            __ https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine

        :param str opc_request_id: (optional)
            Unique Oracle-assigned identifier for the request. If you need to contact
            Oracle about a particular request, please provide the request ID.
            The only valid characters for request IDs are letters, numbers,
            underscore, and dash.

        :param str sort_order: (optional)
            The sort order to use, either ascending (`ASC`) or descending (`DESC`).

            Allowed values are: "ASC", "DESC"

        :param str sort_by: (optional)
            The field to sort by. You can provide only one sort order. The default order for
            `timeCreated` is descending.

            Allowed values are: "timeCreated"

        :param str display_name: (optional)
            A filter to return only resources that match the given display name exactly.

        :param obj retry_strategy: (optional)
            A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level.

            This should be one of the strategies available in the :py:mod:`~oci.retry` module. This operation uses :py:data:`~oci.retry.DEFAULT_RETRY_STRATEGY` as default if no retry strategy is provided.
            The specifics of the default retry strategy are described `here <https://docs.oracle.com/en-us/iaas/tools/python/latest/sdk_behaviors/retries.html>`__.

            To have this operation explicitly not perform any retries, pass an instance of :py:class:`~oci.retry.NoneRetryStrategy`.

        :param bool allow_control_chars: (optional)
            allow_control_chars is a boolean to indicate whether or not this request should allow control characters in the response object.
            By default, the response will not allow control characters in strings

        :param bool enable_strict_url_encoding: (optional)
            enable_strict_url_encoding is a boolean to indicate whether or not this request should enable strict url encoding for path params.
            By default, strict url encoding for path params is disabled

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.GitDiffSummaryCollection`
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey', 'gitRepositoryKey', 'gitFolderPath', 'branchName']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/gitRepositories/{gitRepositoryKey}/actions/gitDiff"
        method = "GET"
        operation_name = "list_git_diffs"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "compare_to",
            "filter",
            "limit",
            "page",
            "opc_request_id",
            "sort_order",
            "sort_by",
            "display_name"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"list_git_diffs got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "gitRepositoryKey": git_repository_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError(f'Parameter {k} cannot be None, whitespace or empty string')

        if 'compare_to' in kwargs:
            compare_to_allowed_values = ["HEAD", "UPSTREAM", "INDEX", "WORKTREE", "MERGE_BASE"]
            if kwargs['compare_to'] not in compare_to_allowed_values:
                raise ValueError(
                    f"Invalid value for `compare_to`, must be one of { compare_to_allowed_values }"
                )

        if 'filter' in kwargs:
            filter_allowed_values = ["ALL", "DIFF_ONLY", "CONFLICTS_ONLY"]
            if kwargs['filter'] not in filter_allowed_values:
                raise ValueError(
                    f"Invalid value for `filter`, must be one of { filter_allowed_values }"
                )

        if 'sort_order' in kwargs:
            sort_order_allowed_values = ["ASC", "DESC"]
            if kwargs['sort_order'] not in sort_order_allowed_values:
                raise ValueError(
                    f"Invalid value for `sort_order`, must be one of { sort_order_allowed_values }"
                )

        if 'sort_by' in kwargs:
            sort_by_allowed_values = ["timeCreated"]
            if kwargs['sort_by'] not in sort_by_allowed_values:
                raise ValueError(
                    f"Invalid value for `sort_by`, must be one of { sort_by_allowed_values }"
                )

        query_params = {
            "gitFolderPath": git_folder_path,
            "branchName": branch_name,
            "compareTo": kwargs.get("compare_to", missing),
            "filter": kwargs.get("filter", missing),
            "limit": kwargs.get("limit", missing),
            "page": kwargs.get("page", missing),
            "sortOrder": kwargs.get("sort_order", missing),
            "sortBy": kwargs.get("sort_by", missing),
            "displayName": kwargs.get("display_name", missing)
        }
        query_params = {k: v for (k, v) in six.iteritems(query_params) if v is not missing and v is not None}

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "opc-request-id": kwargs.get("opc_request_id", missing)
        }
        header_params = {k: v for (k, v) in six.iteritems(header_params) if v is not missing and v is not None}

        retry_strategy = self.base_client.get_preferred_retry_strategy(
            operation_retry_strategy=kwargs.get('retry_strategy'),
            client_retry_strategy=self.retry_strategy
        )
        if retry_strategy is None:
            retry_strategy = retry.DEFAULT_RETRY_STRATEGY

        if retry_strategy:
            if not isinstance(retry_strategy, retry.NoneRetryStrategy):
                self.base_client.add_opc_client_retries_header(header_params)
                retry_strategy.add_circuit_breaker_callback(self.circuit_breaker_callback)
            return retry_strategy.make_retrying_call(
                self.base_client.call_api,
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                query_params=query_params,
                header_params=header_params,
                response_type="GitDiffSummaryCollection",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                query_params=query_params,
                header_params=header_params,
                response_type="GitDiffSummaryCollection",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def merge_git_repository(self, ai_data_platform_id, workspace_key, git_repository_key, git_merge_details, **kwargs):
        """
        (Preview) Asynchronously merges origin/{remoteBranchName} into the stored
        repository branch and pushes it to origin on a conflict-free merge. commitId is
        not applied. The aidp-async-operation-key response header identifies the job;
        its SUCCEEDED status confirms completion.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str git_repository_key: (required)
            The opaque repository key, available as GitRepository.key or system:repoKey
            in the folder's JSON file-metadata HEAD response header when
            shouldIncludeMetadata=true. Distinct from the async operation resourceName.

        :param oci.aidataplatform_dp.models.GitMergeDetails git_merge_details: (required)
            Folder/branch details to merge.

        :param str opc_retry_token: (optional)
            A token that uniquely identifies a request so it can be retried in case of a timeout or
            server error without risk of running that same action again. Retry tokens expire after 24
            hours, but can be invalidated before then due to conflicting operations. For example, if a resource
            has been deleted and removed from the system, then a retry of the original creation request
            might be rejected.

        :param str opc_request_id: (optional)
            Unique Oracle-assigned identifier for the request. If you need to contact
            Oracle about a particular request, please provide the request ID.
            The only valid characters for request IDs are letters, numbers,
            underscore, and dash.

        :param str if_match: (optional)
            For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
            `if-match` parameter to the value of the etag from a previous GET or POST response for
            that resource. The resource will be updated or deleted only if the etag you provide
            matches the resource's current etag value.

        :param bool should_update_recent: (optional)
            A flag to identify if the recent list should be updated.

        :param obj retry_strategy: (optional)
            A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level.

            This should be one of the strategies available in the :py:mod:`~oci.retry` module. This operation uses :py:data:`~oci.retry.DEFAULT_RETRY_STRATEGY` as default if no retry strategy is provided.
            The specifics of the default retry strategy are described `here <https://docs.oracle.com/en-us/iaas/tools/python/latest/sdk_behaviors/retries.html>`__.

            To have this operation explicitly not perform any retries, pass an instance of :py:class:`~oci.retry.NoneRetryStrategy`.

        :param bool allow_control_chars: (optional)
            allow_control_chars is a boolean to indicate whether or not this request should allow control characters in the response object.
            By default, the response will not allow control characters in strings

        :param bool enable_strict_url_encoding: (optional)
            enable_strict_url_encoding is a boolean to indicate whether or not this request should enable strict url encoding for path params.
            By default, strict url encoding for path params is disabled

        :return: A :class:`~oci.response.Response` object with data of type None
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey', 'gitRepositoryKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/gitRepositories/{gitRepositoryKey}/actions/merge"
        method = "POST"
        operation_name = "merge_git_repository"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "opc_retry_token",
            "opc_request_id",
            "if_match",
            "should_update_recent"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"merge_git_repository got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "gitRepositoryKey": git_repository_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError(f'Parameter {k} cannot be None, whitespace or empty string')

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "opc-retry-token": kwargs.get("opc_retry_token", missing),
            "opc-request-id": kwargs.get("opc_request_id", missing),
            "if-match": kwargs.get("if_match", missing),
            "should-update-recent": kwargs.get("should_update_recent", missing)
        }
        header_params = {k: v for (k, v) in six.iteritems(header_params) if v is not missing and v is not None}

        retry_strategy = self.base_client.get_preferred_retry_strategy(
            operation_retry_strategy=kwargs.get('retry_strategy'),
            client_retry_strategy=self.retry_strategy
        )
        if retry_strategy is None:
            retry_strategy = retry.DEFAULT_RETRY_STRATEGY

        if retry_strategy:
            if not isinstance(retry_strategy, retry.NoneRetryStrategy):
                self.base_client.add_opc_retry_token_if_needed(header_params)
                self.base_client.add_opc_client_retries_header(header_params)
                retry_strategy.add_circuit_breaker_callback(self.circuit_breaker_callback)
            return retry_strategy.make_retrying_call(
                self.base_client.call_api,
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=git_merge_details,
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=git_merge_details,
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def pull_git_repository(self, ai_data_platform_id, workspace_key, git_repository_key, git_pull_details, **kwargs):
        """
        (Preview) Asynchronously pulls origin changes into the stored repository branch
        using autostash. Supplied branch, pullAction, and commitMessage overrides are
        not applied. The aidp-async-operation-key response header identifies the job;
        its SUCCEEDED status confirms completion.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str git_repository_key: (required)
            The opaque repository key, available as GitRepository.key or system:repoKey
            in the folder's JSON file-metadata HEAD response header when
            shouldIncludeMetadata=true. Distinct from the async operation resourceName.

        :param oci.aidataplatform_dp.models.GitPullDetails git_pull_details: (required)
            Folder/branch details to pull.

        :param str opc_retry_token: (optional)
            A token that uniquely identifies a request so it can be retried in case of a timeout or
            server error without risk of running that same action again. Retry tokens expire after 24
            hours, but can be invalidated before then due to conflicting operations. For example, if a resource
            has been deleted and removed from the system, then a retry of the original creation request
            might be rejected.

        :param str opc_request_id: (optional)
            Unique Oracle-assigned identifier for the request. If you need to contact
            Oracle about a particular request, please provide the request ID.
            The only valid characters for request IDs are letters, numbers,
            underscore, and dash.

        :param str if_match: (optional)
            For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
            `if-match` parameter to the value of the etag from a previous GET or POST response for
            that resource. The resource will be updated or deleted only if the etag you provide
            matches the resource's current etag value.

        :param bool should_update_recent: (optional)
            A flag to identify if the recent list should be updated.

        :param obj retry_strategy: (optional)
            A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level.

            This should be one of the strategies available in the :py:mod:`~oci.retry` module. This operation uses :py:data:`~oci.retry.DEFAULT_RETRY_STRATEGY` as default if no retry strategy is provided.
            The specifics of the default retry strategy are described `here <https://docs.oracle.com/en-us/iaas/tools/python/latest/sdk_behaviors/retries.html>`__.

            To have this operation explicitly not perform any retries, pass an instance of :py:class:`~oci.retry.NoneRetryStrategy`.

        :param bool allow_control_chars: (optional)
            allow_control_chars is a boolean to indicate whether or not this request should allow control characters in the response object.
            By default, the response will not allow control characters in strings

        :param bool enable_strict_url_encoding: (optional)
            enable_strict_url_encoding is a boolean to indicate whether or not this request should enable strict url encoding for path params.
            By default, strict url encoding for path params is disabled

        :return: A :class:`~oci.response.Response` object with data of type None
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey', 'gitRepositoryKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/gitRepositories/{gitRepositoryKey}/actions/pull"
        method = "POST"
        operation_name = "pull_git_repository"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "opc_retry_token",
            "opc_request_id",
            "if_match",
            "should_update_recent"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"pull_git_repository got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "gitRepositoryKey": git_repository_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError(f'Parameter {k} cannot be None, whitespace or empty string')

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "opc-retry-token": kwargs.get("opc_retry_token", missing),
            "opc-request-id": kwargs.get("opc_request_id", missing),
            "if-match": kwargs.get("if_match", missing),
            "should-update-recent": kwargs.get("should_update_recent", missing)
        }
        header_params = {k: v for (k, v) in six.iteritems(header_params) if v is not missing and v is not None}

        retry_strategy = self.base_client.get_preferred_retry_strategy(
            operation_retry_strategy=kwargs.get('retry_strategy'),
            client_retry_strategy=self.retry_strategy
        )
        if retry_strategy is None:
            retry_strategy = retry.DEFAULT_RETRY_STRATEGY

        if retry_strategy:
            if not isinstance(retry_strategy, retry.NoneRetryStrategy):
                self.base_client.add_opc_retry_token_if_needed(header_params)
                self.base_client.add_opc_client_retries_header(header_params)
                retry_strategy.add_circuit_breaker_callback(self.circuit_breaker_callback)
            return retry_strategy.make_retrying_call(
                self.base_client.call_api,
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=git_pull_details,
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=git_pull_details,
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def rebase_git_repository(self, ai_data_platform_id, workspace_key, git_repository_key, git_rebase_details, **kwargs):
        """
        (Preview) Asynchronously rebases the stored repository branch onto
        origin/{remoteBranchName} and force-pushes it on success. commitId is not
        applied. The aidp-async-operation-key response header identifies the job; its
        SUCCEEDED status confirms completion. The stored branch must pass its remote
        synchronization check before rebasing.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str git_repository_key: (required)
            The opaque repository key, available as GitRepository.key or system:repoKey
            in the folder's JSON file-metadata HEAD response header when
            shouldIncludeMetadata=true. Distinct from the async operation resourceName.

        :param oci.aidataplatform_dp.models.GitRebaseDetails git_rebase_details: (required)
            Details needed to perform rebase operation.

        :param str opc_retry_token: (optional)
            A token that uniquely identifies a request so it can be retried in case of a timeout or
            server error without risk of running that same action again. Retry tokens expire after 24
            hours, but can be invalidated before then due to conflicting operations. For example, if a resource
            has been deleted and removed from the system, then a retry of the original creation request
            might be rejected.

        :param str opc_request_id: (optional)
            Unique Oracle-assigned identifier for the request. If you need to contact
            Oracle about a particular request, please provide the request ID.
            The only valid characters for request IDs are letters, numbers,
            underscore, and dash.

        :param str if_match: (optional)
            For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
            `if-match` parameter to the value of the etag from a previous GET or POST response for
            that resource. The resource will be updated or deleted only if the etag you provide
            matches the resource's current etag value.

        :param bool should_update_recent: (optional)
            A flag to identify if the recent list should be updated.

        :param obj retry_strategy: (optional)
            A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level.

            This should be one of the strategies available in the :py:mod:`~oci.retry` module. This operation uses :py:data:`~oci.retry.DEFAULT_RETRY_STRATEGY` as default if no retry strategy is provided.
            The specifics of the default retry strategy are described `here <https://docs.oracle.com/en-us/iaas/tools/python/latest/sdk_behaviors/retries.html>`__.

            To have this operation explicitly not perform any retries, pass an instance of :py:class:`~oci.retry.NoneRetryStrategy`.

        :param bool allow_control_chars: (optional)
            allow_control_chars is a boolean to indicate whether or not this request should allow control characters in the response object.
            By default, the response will not allow control characters in strings

        :param bool enable_strict_url_encoding: (optional)
            enable_strict_url_encoding is a boolean to indicate whether or not this request should enable strict url encoding for path params.
            By default, strict url encoding for path params is disabled

        :return: A :class:`~oci.response.Response` object with data of type None
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey', 'gitRepositoryKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/gitRepositories/{gitRepositoryKey}/actions/rebase"
        method = "POST"
        operation_name = "rebase_git_repository"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "opc_retry_token",
            "opc_request_id",
            "if_match",
            "should_update_recent"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"rebase_git_repository got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "gitRepositoryKey": git_repository_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError(f'Parameter {k} cannot be None, whitespace or empty string')

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "opc-retry-token": kwargs.get("opc_retry_token", missing),
            "opc-request-id": kwargs.get("opc_request_id", missing),
            "if-match": kwargs.get("if_match", missing),
            "should-update-recent": kwargs.get("should_update_recent", missing)
        }
        header_params = {k: v for (k, v) in six.iteritems(header_params) if v is not missing and v is not None}

        retry_strategy = self.base_client.get_preferred_retry_strategy(
            operation_retry_strategy=kwargs.get('retry_strategy'),
            client_retry_strategy=self.retry_strategy
        )
        if retry_strategy is None:
            retry_strategy = retry.DEFAULT_RETRY_STRATEGY

        if retry_strategy:
            if not isinstance(retry_strategy, retry.NoneRetryStrategy):
                self.base_client.add_opc_retry_token_if_needed(header_params)
                self.base_client.add_opc_client_retries_header(header_params)
                retry_strategy.add_circuit_breaker_callback(self.circuit_breaker_callback)
            return retry_strategy.make_retrying_call(
                self.base_client.call_api,
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=git_rebase_details,
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=git_rebase_details,
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def reset_git_folder_state(self, ai_data_platform_id, workspace_key, git_repository_key, reset_git_folder_state_details, **kwargs):
        """
        (Preview) Aborts an in-progress Git operation or discards selected local changes
        according to action. Single-path DISCARD runs synchronously; other requests
        submit a job. When present, datalake-async-operation-key identifies that job.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str git_repository_key: (required)
            The opaque repository key, available as GitRepository.key or system:repoKey
            in the folder's JSON file-metadata HEAD response header when
            shouldIncludeMetadata=true. Distinct from the async operation resourceName.

        :param oci.aidataplatform_dp.models.ResetGitFolderStateDetails reset_git_folder_state_details: (required)
            Abort action or local file changes to discard.

        :param str opc_retry_token: (optional)
            A token that uniquely identifies a request so it can be retried in case of a timeout or
            server error without risk of running that same action again. Retry tokens expire after 24
            hours, but can be invalidated before then due to conflicting operations. For example, if a resource
            has been deleted and removed from the system, then a retry of the original creation request
            might be rejected.

        :param str opc_request_id: (optional)
            Unique Oracle-assigned identifier for the request. If you need to contact
            Oracle about a particular request, please provide the request ID.
            The only valid characters for request IDs are letters, numbers,
            underscore, and dash.

        :param str if_match: (optional)
            For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
            `if-match` parameter to the value of the etag from a previous GET or POST response for
            that resource. The resource will be updated or deleted only if the etag you provide
            matches the resource's current etag value.

        :param obj retry_strategy: (optional)
            A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level.

            This should be one of the strategies available in the :py:mod:`~oci.retry` module. This operation uses :py:data:`~oci.retry.DEFAULT_RETRY_STRATEGY` as default if no retry strategy is provided.
            The specifics of the default retry strategy are described `here <https://docs.oracle.com/en-us/iaas/tools/python/latest/sdk_behaviors/retries.html>`__.

            To have this operation explicitly not perform any retries, pass an instance of :py:class:`~oci.retry.NoneRetryStrategy`.

        :param bool allow_control_chars: (optional)
            allow_control_chars is a boolean to indicate whether or not this request should allow control characters in the response object.
            By default, the response will not allow control characters in strings

        :param bool enable_strict_url_encoding: (optional)
            enable_strict_url_encoding is a boolean to indicate whether or not this request should enable strict url encoding for path params.
            By default, strict url encoding for path params is disabled

        :return: A :class:`~oci.response.Response` object with data of type None
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey', 'gitRepositoryKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/gitRepositories/{gitRepositoryKey}/actions/resetState"
        method = "POST"
        operation_name = "reset_git_folder_state"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "opc_retry_token",
            "opc_request_id",
            "if_match"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"reset_git_folder_state got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "gitRepositoryKey": git_repository_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError(f'Parameter {k} cannot be None, whitespace or empty string')

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "opc-retry-token": kwargs.get("opc_retry_token", missing),
            "opc-request-id": kwargs.get("opc_request_id", missing),
            "if-match": kwargs.get("if_match", missing)
        }
        header_params = {k: v for (k, v) in six.iteritems(header_params) if v is not missing and v is not None}

        retry_strategy = self.base_client.get_preferred_retry_strategy(
            operation_retry_strategy=kwargs.get('retry_strategy'),
            client_retry_strategy=self.retry_strategy
        )
        if retry_strategy is None:
            retry_strategy = retry.DEFAULT_RETRY_STRATEGY

        if retry_strategy:
            if not isinstance(retry_strategy, retry.NoneRetryStrategy):
                self.base_client.add_opc_retry_token_if_needed(header_params)
                self.base_client.add_opc_client_retries_header(header_params)
                retry_strategy.add_circuit_breaker_callback(self.circuit_breaker_callback)
            return retry_strategy.make_retrying_call(
                self.base_client.call_api,
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=reset_git_folder_state_details,
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=reset_git_folder_state_details,
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def reset_git_repository(self, ai_data_platform_id, workspace_key, git_repository_key, git_reset_details, **kwargs):
        """
        (Preview) Asynchronously hard-resets the stored repository branch to
        origin/{branchName}, discards tracked local changes, and force-pushes the stored
        branch. resetMode and commitId are not applied. The aidp-async-operation-key
        response header identifies the job; its SUCCEEDED status confirms completion.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str git_repository_key: (required)
            The opaque repository key, available as GitRepository.key or system:repoKey
            in the folder's JSON file-metadata HEAD response header when
            shouldIncludeMetadata=true. Distinct from the async operation resourceName.

        :param oci.aidataplatform_dp.models.GitResetDetails git_reset_details: (required)
            Details needed to perform Git reset operation.

        :param str opc_retry_token: (optional)
            A token that uniquely identifies a request so it can be retried in case of a timeout or
            server error without risk of running that same action again. Retry tokens expire after 24
            hours, but can be invalidated before then due to conflicting operations. For example, if a resource
            has been deleted and removed from the system, then a retry of the original creation request
            might be rejected.

        :param str opc_request_id: (optional)
            Unique Oracle-assigned identifier for the request. If you need to contact
            Oracle about a particular request, please provide the request ID.
            The only valid characters for request IDs are letters, numbers,
            underscore, and dash.

        :param str if_match: (optional)
            For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
            `if-match` parameter to the value of the etag from a previous GET or POST response for
            that resource. The resource will be updated or deleted only if the etag you provide
            matches the resource's current etag value.

        :param bool should_update_recent: (optional)
            A flag to identify if the recent list should be updated.

        :param obj retry_strategy: (optional)
            A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level.

            This should be one of the strategies available in the :py:mod:`~oci.retry` module. This operation uses :py:data:`~oci.retry.DEFAULT_RETRY_STRATEGY` as default if no retry strategy is provided.
            The specifics of the default retry strategy are described `here <https://docs.oracle.com/en-us/iaas/tools/python/latest/sdk_behaviors/retries.html>`__.

            To have this operation explicitly not perform any retries, pass an instance of :py:class:`~oci.retry.NoneRetryStrategy`.

        :param bool allow_control_chars: (optional)
            allow_control_chars is a boolean to indicate whether or not this request should allow control characters in the response object.
            By default, the response will not allow control characters in strings

        :param bool enable_strict_url_encoding: (optional)
            enable_strict_url_encoding is a boolean to indicate whether or not this request should enable strict url encoding for path params.
            By default, strict url encoding for path params is disabled

        :return: A :class:`~oci.response.Response` object with data of type None
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey', 'gitRepositoryKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/gitRepositories/{gitRepositoryKey}/actions/reset"
        method = "POST"
        operation_name = "reset_git_repository"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "opc_retry_token",
            "opc_request_id",
            "if_match",
            "should_update_recent"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"reset_git_repository got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "gitRepositoryKey": git_repository_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError(f'Parameter {k} cannot be None, whitespace or empty string')

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "opc-retry-token": kwargs.get("opc_retry_token", missing),
            "opc-request-id": kwargs.get("opc_request_id", missing),
            "if-match": kwargs.get("if_match", missing),
            "should-update-recent": kwargs.get("should_update_recent", missing)
        }
        header_params = {k: v for (k, v) in six.iteritems(header_params) if v is not missing and v is not None}

        retry_strategy = self.base_client.get_preferred_retry_strategy(
            operation_retry_strategy=kwargs.get('retry_strategy'),
            client_retry_strategy=self.retry_strategy
        )
        if retry_strategy is None:
            retry_strategy = retry.DEFAULT_RETRY_STRATEGY

        if retry_strategy:
            if not isinstance(retry_strategy, retry.NoneRetryStrategy):
                self.base_client.add_opc_retry_token_if_needed(header_params)
                self.base_client.add_opc_client_retries_header(header_params)
                retry_strategy.add_circuit_breaker_callback(self.circuit_breaker_callback)
            return retry_strategy.make_retrying_call(
                self.base_client.call_api,
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=git_reset_details,
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=git_reset_details,
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def resolve_git_conflicts(self, ai_data_platform_id, workspace_key, git_repository_key, conflict_resolve_details, **kwargs):
        """
        (Preview) Synchronously selects LOCAL or REMOTE file versions, or stages
        manually resolved content with MARK_RESOLVED. Does not complete or push an
        in-progress merge or rebase.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str git_repository_key: (required)
            The opaque repository key, available as GitRepository.key or system:repoKey
            in the folder's JSON file-metadata HEAD response header when
            shouldIncludeMetadata=true. Distinct from the async operation resourceName.

        :param oci.aidataplatform_dp.models.ConflictResolveDetails conflict_resolve_details: (required)
            Conflict resolution details.

        :param str opc_retry_token: (optional)
            A token that uniquely identifies a request so it can be retried in case of a timeout or
            server error without risk of running that same action again. Retry tokens expire after 24
            hours, but can be invalidated before then due to conflicting operations. For example, if a resource
            has been deleted and removed from the system, then a retry of the original creation request
            might be rejected.

        :param str opc_request_id: (optional)
            Unique Oracle-assigned identifier for the request. If you need to contact
            Oracle about a particular request, please provide the request ID.
            The only valid characters for request IDs are letters, numbers,
            underscore, and dash.

        :param str if_match: (optional)
            For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
            `if-match` parameter to the value of the etag from a previous GET or POST response for
            that resource. The resource will be updated or deleted only if the etag you provide
            matches the resource's current etag value.

        :param obj retry_strategy: (optional)
            A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level.

            This should be one of the strategies available in the :py:mod:`~oci.retry` module. This operation uses :py:data:`~oci.retry.DEFAULT_RETRY_STRATEGY` as default if no retry strategy is provided.
            The specifics of the default retry strategy are described `here <https://docs.oracle.com/en-us/iaas/tools/python/latest/sdk_behaviors/retries.html>`__.

            To have this operation explicitly not perform any retries, pass an instance of :py:class:`~oci.retry.NoneRetryStrategy`.

        :param bool allow_control_chars: (optional)
            allow_control_chars is a boolean to indicate whether or not this request should allow control characters in the response object.
            By default, the response will not allow control characters in strings

        :param bool enable_strict_url_encoding: (optional)
            enable_strict_url_encoding is a boolean to indicate whether or not this request should enable strict url encoding for path params.
            By default, strict url encoding for path params is disabled

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.GitBranch`
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey', 'gitRepositoryKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/gitRepositories/{gitRepositoryKey}/actions/resolveConflicts"
        method = "POST"
        operation_name = "resolve_git_conflicts"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "opc_retry_token",
            "opc_request_id",
            "if_match"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"resolve_git_conflicts got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "gitRepositoryKey": git_repository_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError(f'Parameter {k} cannot be None, whitespace or empty string')

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "opc-retry-token": kwargs.get("opc_retry_token", missing),
            "opc-request-id": kwargs.get("opc_request_id", missing),
            "if-match": kwargs.get("if_match", missing)
        }
        header_params = {k: v for (k, v) in six.iteritems(header_params) if v is not missing and v is not None}

        retry_strategy = self.base_client.get_preferred_retry_strategy(
            operation_retry_strategy=kwargs.get('retry_strategy'),
            client_retry_strategy=self.retry_strategy
        )
        if retry_strategy is None:
            retry_strategy = retry.DEFAULT_RETRY_STRATEGY

        if retry_strategy:
            if not isinstance(retry_strategy, retry.NoneRetryStrategy):
                self.base_client.add_opc_retry_token_if_needed(header_params)
                self.base_client.add_opc_client_retries_header(header_params)
                retry_strategy.add_circuit_breaker_callback(self.circuit_breaker_callback)
            return retry_strategy.make_retrying_call(
                self.base_client.call_api,
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=conflict_resolve_details,
                response_type="GitBranch",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=conflict_resolve_details,
                response_type="GitBranch",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def update_git_repository(self, ai_data_platform_id, workspace_key, update_git_repository_details, git_repository_key, **kwargs):
        """
        (Preview) Updates repository settings. URL changes and changed sparse checkout
        patterns submit asynchronous operations; credential and private connectivity
        reference changes may complete without an operation key. This operation does
        not change the default branch or relocate the folder. Omitted fields retain
        their stored values.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param oci.aidataplatform_dp.models.UpdateGitRepositoryDetails update_git_repository_details: (required)
            The information to be updated.

        :param str git_repository_key: (required)
            The opaque repository key, available as GitRepository.key or system:repoKey
            in the folder's JSON file-metadata HEAD response header when
            shouldIncludeMetadata=true. Distinct from the async operation resourceName.

        :param str if_match: (optional)
            For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
            `if-match` parameter to the value of the etag from a previous GET or POST response for
            that resource. The resource will be updated or deleted only if the etag you provide
            matches the resource's current etag value.

        :param str opc_request_id: (optional)
            Unique Oracle-assigned identifier for the request. If you need to contact
            Oracle about a particular request, please provide the request ID.
            The only valid characters for request IDs are letters, numbers,
            underscore, and dash.

        :param obj retry_strategy: (optional)
            A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level.

            This should be one of the strategies available in the :py:mod:`~oci.retry` module. This operation uses :py:data:`~oci.retry.DEFAULT_RETRY_STRATEGY` as default if no retry strategy is provided.
            The specifics of the default retry strategy are described `here <https://docs.oracle.com/en-us/iaas/tools/python/latest/sdk_behaviors/retries.html>`__.

            To have this operation explicitly not perform any retries, pass an instance of :py:class:`~oci.retry.NoneRetryStrategy`.

        :param bool allow_control_chars: (optional)
            allow_control_chars is a boolean to indicate whether or not this request should allow control characters in the response object.
            By default, the response will not allow control characters in strings

        :param bool enable_strict_url_encoding: (optional)
            enable_strict_url_encoding is a boolean to indicate whether or not this request should enable strict url encoding for path params.
            By default, strict url encoding for path params is disabled

        :return: A :class:`~oci.response.Response` object with data of type None
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey', 'gitRepositoryKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/gitRepositories/{gitRepositoryKey}"
        method = "PUT"
        operation_name = "update_git_repository"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "if_match",
            "opc_request_id"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"update_git_repository got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "gitRepositoryKey": git_repository_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError(f'Parameter {k} cannot be None, whitespace or empty string')

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "if-match": kwargs.get("if_match", missing),
            "opc-request-id": kwargs.get("opc_request_id", missing)
        }
        header_params = {k: v for (k, v) in six.iteritems(header_params) if v is not missing and v is not None}

        retry_strategy = self.base_client.get_preferred_retry_strategy(
            operation_retry_strategy=kwargs.get('retry_strategy'),
            client_retry_strategy=self.retry_strategy
        )
        if retry_strategy is None:
            retry_strategy = retry.DEFAULT_RETRY_STRATEGY

        if retry_strategy:
            if not isinstance(retry_strategy, retry.NoneRetryStrategy):
                self.base_client.add_opc_client_retries_header(header_params)
                retry_strategy.add_circuit_breaker_callback(self.circuit_breaker_callback)
            return retry_strategy.make_retrying_call(
                self.base_client.call_api,
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=update_git_repository_details,
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=update_git_repository_details,
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)
