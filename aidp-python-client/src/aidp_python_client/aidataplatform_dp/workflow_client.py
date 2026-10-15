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


class WorkflowClient(object):
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
        self.base_client = BaseClient("workflow", config, signer, aidataplatform_dp_type_mapping, **base_client_init_kwargs)
        self.retry_strategy = kwargs.get('retry_strategy', retry.DEFAULT_RETRY_STRATEGY)
        self.circuit_breaker_callback = kwargs.get('circuit_breaker_callback')

    def cancel_job_run(self, ai_data_platform_id, workspace_key, job_run_key, **kwargs):
        """
        Cancels a job run.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str job_run_key: (required)
            Job run key.

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

        :param str opc_retry_token: (optional)
            A token that uniquely identifies a request so it can be retried in case of a timeout or
            server error without risk of running that same action again. Retry tokens expire after 24
            hours, but can be invalidated before then due to conflicting operations. For example, if a resource
            has been deleted and removed from the system, then a retry of the original creation request
            might be rejected.

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

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.JobRun`
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey', 'jobRunKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/jobRuns/{jobRunKey}/actions/cancel"
        method = "POST"
        operation_name = "cancel_job_run"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "if_match",
            "opc_request_id",
            "opc_retry_token",
            "should_update_recent"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"cancel_job_run got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "jobRunKey": job_run_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError(f'Parameter {k} cannot be None, whitespace or empty string')

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "if-match": kwargs.get("if_match", missing),
            "opc-request-id": kwargs.get("opc_request_id", missing),
            "opc-retry-token": kwargs.get("opc_retry_token", missing),
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
                response_type="JobRun",
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
                response_type="JobRun",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def cancel_job_runs(self, ai_data_platform_id, workspace_key, job_key, **kwargs):
        """
        Cancels all job runs for a given job.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str job_key: (required)
            Job key.

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

        :param str opc_retry_token: (optional)
            A token that uniquely identifies a request so it can be retried in case of a timeout or
            server error without risk of running that same action again. Retry tokens expire after 24
            hours, but can be invalidated before then due to conflicting operations. For example, if a resource
            has been deleted and removed from the system, then a retry of the original creation request
            might be rejected.

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
        required_arguments = ['aiDataPlatformId', 'workspaceKey', 'jobKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/jobs/{jobKey}/actions/cancelJobRuns"
        method = "POST"
        operation_name = "cancel_job_runs"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "if_match",
            "opc_request_id",
            "opc_retry_token"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"cancel_job_runs got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "jobKey": job_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError(f'Parameter {k} cannot be None, whitespace or empty string')

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "if-match": kwargs.get("if_match", missing),
            "opc-request-id": kwargs.get("opc_request_id", missing),
            "opc-retry-token": kwargs.get("opc_retry_token", missing)
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
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def create_job(self, ai_data_platform_id, workspace_key, create_job_details, **kwargs):
        """
        Creates a job.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param oci.aidataplatform_dp.models.CreateJobDetails create_job_details: (required)
            Details for the new job.

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

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.Job`
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/jobs"
        method = "POST"
        operation_name = "create_job"
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
                f"create_job got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key
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
                body=create_job_details,
                response_type="Job",
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
                body=create_job_details,
                response_type="Job",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def create_job_run(self, ai_data_platform_id, workspace_key, create_job_run_details, **kwargs):
        """
        Creates a job run.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param oci.aidataplatform_dp.models.CreateJobRunDetails create_job_run_details: (required)
            Details for the new job run.

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

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.JobRun`
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/jobRuns"
        method = "POST"
        operation_name = "create_job_run"
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
                f"create_job_run got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key
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
                body=create_job_run_details,
                response_type="JobRun",
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
                body=create_job_run_details,
                response_type="JobRun",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def delete_job(self, ai_data_platform_id, workspace_key, job_key, **kwargs):
        """
        Deletes a job.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str job_key: (required)
            Job key.

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
        required_arguments = ['aiDataPlatformId', 'workspaceKey', 'jobKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/jobs/{jobKey}"
        method = "DELETE"
        operation_name = "delete_job"
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
                f"delete_job got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "jobKey": job_key
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
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def delete_job_run(self, ai_data_platform_id, workspace_key, job_run_key, **kwargs):
        """
        Deletes a job run.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str job_run_key: (required)
            Job run key.

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
        required_arguments = ['aiDataPlatformId', 'workspaceKey', 'jobRunKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/jobRuns/{jobRunKey}"
        method = "DELETE"
        operation_name = "delete_job_run"
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
                f"delete_job_run got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "jobRunKey": job_run_key
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
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def export_task_run_output(self, ai_data_platform_id, workspace_key, task_run_key, task_run_output_key, export_task_run_output_details, **kwargs):
        """
        Exports task run output in HTML or ipynb format.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str task_run_key: (required)
            Task run key.

        :param str task_run_output_key: (required)
            Task run output key.

        :param oci.aidataplatform_dp.models.ExportTaskRunOutputDetails export_task_run_output_details: (required)
            Payload to export task run output to a file.

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

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.ExportedTaskRunOutputContents`
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey', 'taskRunKey', 'taskRunOutputKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/taskRuns/{taskRunKey}/outputs/{taskRunOutputKey}/actions/export"
        method = "POST"
        operation_name = "export_task_run_output"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "opc_request_id"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"export_task_run_output got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "taskRunKey": task_run_key,
            "taskRunOutputKey": task_run_output_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError(f'Parameter {k} cannot be None, whitespace or empty string')

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
                header_params=header_params,
                body=export_task_run_output_details,
                response_type="ExportedTaskRunOutputContents",
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
                body=export_task_run_output_details,
                response_type="ExportedTaskRunOutputContents",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def fetch_output(self, ai_data_platform_id, workspace_key, task_run_key, fetch_output_details, **kwargs):
        """
        Fetches the task run output from the runtime engine.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str task_run_key: (required)
            Task run key.

        :param oci.aidataplatform_dp.models.FetchOutputDetails fetch_output_details: (required)
            Details for task run output retrieval.

        :param str opc_request_id: (optional)
            Unique Oracle-assigned identifier for the request. If you need to contact
            Oracle about a particular request, please provide the request ID.
            The only valid characters for request IDs are letters, numbers,
            underscore, and dash.

        :param str opc_retry_token: (optional)
            A token that uniquely identifies a request so it can be retried in case of a timeout or
            server error without risk of running that same action again. Retry tokens expire after 24
            hours, but can be invalidated before then due to conflicting operations. For example, if a resource
            has been deleted and removed from the system, then a retry of the original creation request
            might be rejected.

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

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.TaskRunOutput`
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey', 'taskRunKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/taskRuns/{taskRunKey}/actions/fetchOutput"
        method = "POST"
        operation_name = "fetch_output"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "opc_request_id",
            "opc_retry_token"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"fetch_output got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "taskRunKey": task_run_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError(f'Parameter {k} cannot be None, whitespace or empty string')

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "opc-request-id": kwargs.get("opc_request_id", missing),
            "opc-retry-token": kwargs.get("opc_retry_token", missing)
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
                body=fetch_output_details,
                response_type="TaskRunOutput",
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
                body=fetch_output_details,
                response_type="TaskRunOutput",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def get_job(self, ai_data_platform_id, workspace_key, job_key, **kwargs):
        """
        Returns detailed information about a given job.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str job_key: (required)
            Job key.

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

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.Job`
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey', 'jobKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/jobs/{jobKey}"
        method = "GET"
        operation_name = "get_job"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "opc_request_id",
            "should_update_recent"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"get_job got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "jobKey": job_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError(f'Parameter {k} cannot be None, whitespace or empty string')

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
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
                self.base_client.add_opc_client_retries_header(header_params)
                retry_strategy.add_circuit_breaker_callback(self.circuit_breaker_callback)
            return retry_strategy.make_retrying_call(
                self.base_client.call_api,
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                response_type="Job",
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
                response_type="Job",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def get_job_run(self, ai_data_platform_id, workspace_key, job_run_key, **kwargs):
        """
        Returns detailed information about a given job run.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str job_run_key: (required)
            Job run key.

        :param str opc_request_id: (optional)
            Unique Oracle-assigned identifier for the request. If you need to contact
            Oracle about a particular request, please provide the request ID.
            The only valid characters for request IDs are letters, numbers,
            underscore, and dash.

        :param bool should_include_task_run_summaries: (optional)
            A flag to identify if task run summaries should be included in the job run response. If omitted, the service applies its configured default behavior.

        :param int repair_key: (optional)
            The root repair version whose corresponding local history should be returned. The response repairHistory contains only the latest retained local entry at or before this key. It is empty when the current JobRun is the applicable version or a child JobRun had not participated in a repair by this key. JobRun fields and TaskRun summaries remain current and complete.

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

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.JobRun`
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey', 'jobRunKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/jobRuns/{jobRunKey}"
        method = "GET"
        operation_name = "get_job_run"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "opc_request_id",
            "should_include_task_run_summaries",
            "repair_key",
            "should_update_recent"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"get_job_run got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "jobRunKey": job_run_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError(f'Parameter {k} cannot be None, whitespace or empty string')

        query_params = {
            "shouldIncludeTaskRunSummaries": kwargs.get("should_include_task_run_summaries", missing),
            "repairKey": kwargs.get("repair_key", missing)
        }
        query_params = {k: v for (k, v) in six.iteritems(query_params) if v is not missing and v is not None}

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
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
                self.base_client.add_opc_client_retries_header(header_params)
                retry_strategy.add_circuit_breaker_callback(self.circuit_breaker_callback)
            return retry_strategy.make_retrying_call(
                self.base_client.call_api,
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                query_params=query_params,
                header_params=header_params,
                response_type="JobRun",
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
                response_type="JobRun",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def get_task_run(self, ai_data_platform_id, workspace_key, task_run_key, **kwargs):
        """
        Returns detailed information about a task run with a given task run key.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str task_run_key: (required)
            Task run key.

        :param str opc_request_id: (optional)
            Unique Oracle-assigned identifier for the request. If you need to contact
            Oracle about a particular request, please provide the request ID.
            The only valid characters for request IDs are letters, numbers,
            underscore, and dash.

        :param bool should_include_task_run_retries: (optional)
            Indicates whether a get task run response should include task run retries.

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

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.TaskRun`
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey', 'taskRunKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/taskRuns/{taskRunKey}"
        method = "GET"
        operation_name = "get_task_run"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "opc_request_id",
            "should_include_task_run_retries"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"get_task_run got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "taskRunKey": task_run_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError(f'Parameter {k} cannot be None, whitespace or empty string')

        query_params = {
            "shouldIncludeTaskRunRetries": kwargs.get("should_include_task_run_retries", missing)
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
                response_type="TaskRun",
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
                response_type="TaskRun",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def list_job_permissions(self, ai_data_platform_id, workspace_key, job_key, **kwargs):
        """
        Returns a list of job permissions.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str job_key: (required)
            Job key.

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
            The field to sort by. You can provide only one sort order.

            Allowed values are: "timeCreated", "displayName"

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

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.JobPermissionCollection`
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey', 'jobKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/jobs/{jobKey}/permissions"
        method = "GET"
        operation_name = "list_job_permissions"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "limit",
            "page",
            "sort_order",
            "sort_by",
            "opc_request_id"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"list_job_permissions got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "jobKey": job_key
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
            sort_by_allowed_values = ["timeCreated", "displayName"]
            if kwargs['sort_by'] not in sort_by_allowed_values:
                raise ValueError(
                    f"Invalid value for `sort_by`, must be one of { sort_by_allowed_values }"
                )

        query_params = {
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
                response_type="JobPermissionCollection",
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
                response_type="JobPermissionCollection",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def list_job_runs(self, ai_data_platform_id, workspace_key, **kwargs):
        """
        Returns a detailed list of job runs.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str display_name: (optional)
            A filter to return only resources that match the given display name exactly.

        :param list[str] job_key: (optional)
            The field to filter based on job key.

        :param list[str] status: (optional)
            The field to filter based on state.

            Allowed values are: "PENDING", "QUEUED", "RUNNING", "SKIPPED", "INTERNAL_ERROR", "BLOCKED", "SUCCESS", "FAILED", "CANCELED", "UPSTREAM_CANCELED", "UPSTREAM_FAILED", "EXCLUDED"

        :param datetime time_created_greater_than_or_equal_to: (optional)
            Fetch objects from repository that were created after or at the exact timestamp provided in parameter

        :param datetime time_created_less_than_or_equal_to: (optional)
            Fetch objects from repository that were created before or at the exact timestamp provided in parameter.

        :param int limit: (optional)
            For list pagination. The maximum number of results per page, or items to return in a paginated List call.

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

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.JobRunCollection`
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/jobRuns"
        method = "GET"
        operation_name = "list_job_runs"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "display_name",
            "job_key",
            "status",
            "time_created_greater_than_or_equal_to",
            "time_created_less_than_or_equal_to",
            "limit",
            "page",
            "sort_order",
            "sort_by",
            "opc_request_id"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"list_job_runs got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError(f'Parameter {k} cannot be None, whitespace or empty string')

        if 'status' in kwargs:
            status_allowed_values = ["PENDING", "QUEUED", "RUNNING", "SKIPPED", "INTERNAL_ERROR", "BLOCKED", "SUCCESS", "FAILED", "CANCELED", "UPSTREAM_CANCELED", "UPSTREAM_FAILED", "EXCLUDED"]
            for status_item in kwargs['status']:
                if status_item not in status_allowed_values:
                    raise ValueError(
                        f"Invalid value for `status`, must be one of { status_allowed_values }"
                    )

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
            "jobKey": self.base_client.generate_collection_format_param(kwargs.get("job_key", missing), 'multi'),
            "status": self.base_client.generate_collection_format_param(kwargs.get("status", missing), 'multi'),
            "timeCreatedGreaterThanOrEqualTo": kwargs.get("time_created_greater_than_or_equal_to", missing),
            "timeCreatedLessThanOrEqualTo": kwargs.get("time_created_less_than_or_equal_to", missing),
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
                response_type="JobRunCollection",
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
                response_type="JobRunCollection",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def list_jobs(self, ai_data_platform_id, workspace_key, **kwargs):
        """
        Returns a list of jobs.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str display_name: (optional)
            A filter to return only resources that match the given display name exactly.

        :param list[str] job_key: (optional)
            The field to filter based on job key.

        :param str display_name_contains: (optional)
            A filter to return only resources that have a display name containing the text provided.

        :param str path: (optional)
            The fully qualified path where the job is stored.

        :param str created_by: (optional)
            A filter to return only resources that are created by given user with username that matches exactly.

        :param str updated_by: (optional)
            A filter to return only resources that was last updated by given user with username that matches exactly.

        :param int limit: (optional)
            For list pagination. The maximum number of results per page, or items to return in a paginated List call.

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

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.JobCollection`
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/jobs"
        method = "GET"
        operation_name = "list_jobs"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "display_name",
            "job_key",
            "display_name_contains",
            "path",
            "created_by",
            "updated_by",
            "limit",
            "page",
            "sort_order",
            "sort_by",
            "opc_request_id"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"list_jobs got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key
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
            "jobKey": self.base_client.generate_collection_format_param(kwargs.get("job_key", missing), 'multi'),
            "displayNameContains": kwargs.get("display_name_contains", missing),
            "path": kwargs.get("path", missing),
            "createdBy": kwargs.get("created_by", missing),
            "updatedBy": kwargs.get("updated_by", missing),
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
                response_type="JobCollection",
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
                response_type="JobCollection",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def list_recent_job_runs(self, ai_data_platform_id, workspace_key, job_key, **kwargs):
        """
        Returns a list of the latest job runs for a given job key.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param oci.aidataplatform_dp.models.list[str] job_key: (required)
            The field to filter based on job key.

        :param int record_count: (optional)
            The number of records to fetch.

        :param int limit: (optional)
            For list pagination. The maximum number of results per page, or items to return in a paginated List call.

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

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.JobRunCollection`
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey', 'jobKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/recentJobRuns"
        method = "GET"
        operation_name = "list_recent_job_runs"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "record_count",
            "limit",
            "page",
            "sort_order",
            "sort_by",
            "opc_request_id"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"list_recent_job_runs got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key
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
            "jobKey": self.base_client.generate_collection_format_param(job_key, 'multi'),
            "recordCount": kwargs.get("record_count", missing),
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
                response_type="JobRunCollection",
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
                response_type="JobRunCollection",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def list_task_run_retries(self, ai_data_platform_id, workspace_key, task_run_key, **kwargs):
        """
        Returns detailed information about retries of a task run with a given task run key.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str task_run_key: (required)
            Task run key.

        :param str display_name: (optional)
            A filter to return only resources that match the given display name exactly.

        :param list[str] status: (optional)
            The field to filter based on state.

            Allowed values are: "PENDING", "QUEUED", "RUNNING", "SKIPPED", "INTERNAL_ERROR", "BLOCKED", "SUCCESS", "FAILED", "CANCELED", "UPSTREAM_CANCELED", "UPSTREAM_FAILED", "EXCLUDED"

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

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.TaskRunRetryCollection`
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey', 'taskRunKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/taskRuns/{taskRunKey}/retries"
        method = "GET"
        operation_name = "list_task_run_retries"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "display_name",
            "status",
            "limit",
            "page",
            "sort_order",
            "sort_by",
            "opc_request_id"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"list_task_run_retries got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "taskRunKey": task_run_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError(f'Parameter {k} cannot be None, whitespace or empty string')

        if 'status' in kwargs:
            status_allowed_values = ["PENDING", "QUEUED", "RUNNING", "SKIPPED", "INTERNAL_ERROR", "BLOCKED", "SUCCESS", "FAILED", "CANCELED", "UPSTREAM_CANCELED", "UPSTREAM_FAILED", "EXCLUDED"]
            for status_item in kwargs['status']:
                if status_item not in status_allowed_values:
                    raise ValueError(
                        f"Invalid value for `status`, must be one of { status_allowed_values }"
                    )

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
            "status": self.base_client.generate_collection_format_param(kwargs.get("status", missing), 'multi'),
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
                response_type="TaskRunRetryCollection",
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
                response_type="TaskRunRetryCollection",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def list_task_runs(self, ai_data_platform_id, workspace_key, job_run_key, **kwargs):
        """
        Returns a list of task runs.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str job_run_key: (required)
            The field to filter based on job run key.

        :param str display_name: (optional)
            A filter to return only resources that match the given display name exactly.

        :param list[str] status: (optional)
            The field to filter based on state.

            Allowed values are: "PENDING", "QUEUED", "RUNNING", "SKIPPED", "INTERNAL_ERROR", "BLOCKED", "SUCCESS", "FAILED", "CANCELED", "UPSTREAM_CANCELED", "UPSTREAM_FAILED", "EXCLUDED"

        :param str parent_job_run_key: (optional)
            The field to filter based on parent job run key.

        :param str root_job_run_key: (optional)
            The field to filter based on root job run key.

        :param int limit: (optional)
            For list pagination. The maximum number of results per page, or items to return in a paginated List call.

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

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.TaskRunCollection`
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey', 'jobRunKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/taskRuns"
        method = "GET"
        operation_name = "list_task_runs"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "display_name",
            "status",
            "parent_job_run_key",
            "root_job_run_key",
            "limit",
            "page",
            "sort_order",
            "sort_by",
            "opc_request_id"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"list_task_runs got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError(f'Parameter {k} cannot be None, whitespace or empty string')

        if 'status' in kwargs:
            status_allowed_values = ["PENDING", "QUEUED", "RUNNING", "SKIPPED", "INTERNAL_ERROR", "BLOCKED", "SUCCESS", "FAILED", "CANCELED", "UPSTREAM_CANCELED", "UPSTREAM_FAILED", "EXCLUDED"]
            for status_item in kwargs['status']:
                if status_item not in status_allowed_values:
                    raise ValueError(
                        f"Invalid value for `status`, must be one of { status_allowed_values }"
                    )

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
            "jobRunKey": job_run_key,
            "displayName": kwargs.get("display_name", missing),
            "status": self.base_client.generate_collection_format_param(kwargs.get("status", missing), 'multi'),
            "parentJobRunKey": kwargs.get("parent_job_run_key", missing),
            "rootJobRunKey": kwargs.get("root_job_run_key", missing),
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
                response_type="TaskRunCollection",
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
                response_type="TaskRunCollection",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def manage_job_permission(self, ai_data_platform_id, workspace_key, job_key, manage_job_permission_details, **kwargs):
        """
        Update job permissions with the provided details.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str job_key: (required)
            Job key.

        :param oci.aidataplatform_dp.models.ManageJobPermissionDetails manage_job_permission_details: (required)
            The information to be updated.

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
        required_arguments = ['aiDataPlatformId', 'workspaceKey', 'jobKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/jobs/{jobKey}/actions/managePermission"
        method = "POST"
        operation_name = "manage_job_permission"
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
                f"manage_job_permission got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "jobKey": job_key
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
                body=manage_job_permission_details,
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
                body=manage_job_permission_details,
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def repair_job_run(self, ai_data_platform_id, workspace_key, job_run_key, repair_job_run_details, **kwargs):
        """
        Repairs and reruns a root job run. Nested job runs can be repaired only through their root job run repair plan.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str job_run_key: (required)
            Job run key.

        :param oci.aidataplatform_dp.models.RepairJobRunDetails repair_job_run_details: (required)
            Details of the job run to be repaired.

        :param str opc_retry_token: (optional)
            A token that uniquely identifies a request so it can be retried in case of a timeout or
            server error without risk of running that same action again. Retry tokens expire after 24
            hours, but can be invalidated before then due to conflicting operations. For example, if a resource
            has been deleted and removed from the system, then a retry of the original creation request
            might be rejected.

        :param bool should_update_recent: (optional)
            A flag to identify if the recent list should be updated.

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

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.JobRun`
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey', 'jobRunKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/jobRuns/{jobRunKey}/actions/repair"
        method = "POST"
        operation_name = "repair_job_run"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "opc_retry_token",
            "should_update_recent",
            "if_match",
            "opc_request_id"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"repair_job_run got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "jobRunKey": job_run_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError(f'Parameter {k} cannot be None, whitespace or empty string')

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "opc-retry-token": kwargs.get("opc_retry_token", missing),
            "should-update-recent": kwargs.get("should_update_recent", missing),
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
                self.base_client.add_opc_retry_token_if_needed(header_params)
                self.base_client.add_opc_client_retries_header(header_params)
                retry_strategy.add_circuit_breaker_callback(self.circuit_breaker_callback)
            return retry_strategy.make_retrying_call(
                self.base_client.call_api,
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=repair_job_run_details,
                response_type="JobRun",
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
                body=repair_job_run_details,
                response_type="JobRun",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def update_job(self, ai_data_platform_id, workspace_key, job_key, update_job_details, **kwargs):
        """
        Updates details for a job.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str job_key: (required)
            Job key.

        :param oci.aidataplatform_dp.models.UpdateJobDetails update_job_details: (required)
            The information to be updated.

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

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.Job`
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey', 'jobKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/jobs/{jobKey}"
        method = "PUT"
        operation_name = "update_job"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "if_match",
            "opc_request_id",
            "should_update_recent"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"update_job got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "jobKey": job_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError(f'Parameter {k} cannot be None, whitespace or empty string')

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "if-match": kwargs.get("if_match", missing),
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
                self.base_client.add_opc_client_retries_header(header_params)
                retry_strategy.add_circuit_breaker_callback(self.circuit_breaker_callback)
            return retry_strategy.make_retrying_call(
                self.base_client.call_api,
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=update_job_details,
                response_type="Job",
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
                body=update_job_details,
                response_type="Job",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)
