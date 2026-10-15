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
from oci.util import back_up_body_calculate_stream_content_length, is_content_length_calculable_by_req_util
from oci.exceptions import InvalidDeveloperToolConfiguration
from oci.developer_tool_configuration import OCI_SDK_ENABLED_SERVICES_SET
from .models import aidataplatform_dp_type_mapping
missing = Sentinel("Missing")


class WorkspaceObjectClient(object):
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
        self.base_client = BaseClient("workspace_object", config, signer, aidataplatform_dp_type_mapping, **base_client_init_kwargs)
        self.retry_strategy = kwargs.get('retry_strategy', retry.DEFAULT_RETRY_STRATEGY)
        self.circuit_breaker_callback = kwargs.get('circuit_breaker_callback')

    def copy_workspace_object(self, ai_data_platform_id, workspace_key, copy_workspace_object_details, **kwargs):
        """
        Copy a workspace object to different location.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param oci.aidataplatform_dp.models.CopyWorkspaceObjectDetails copy_workspace_object_details: (required)
            Details for copying the workspace object to a different path.

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

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.WorkspaceObjectDetails`
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/actions/copyObject"
        method = "POST"
        operation_name = "copy_workspace_object"
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
                f"copy_workspace_object got unknown kwargs: {extra_kwargs!r}")

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
                body=copy_workspace_object_details,
                response_type="WorkspaceObjectDetails",
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
                body=copy_workspace_object_details,
                response_type="WorkspaceObjectDetails",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def create_workspace_object(self, ai_data_platform_id, workspace_key, create_workspace_object_details, path, **kwargs):
        """
        Creates a workspace object. You can create a file or folder in the workspace.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param stream create_workspace_object_details: (required)
            Details for the new workspace object.

        :param str path: (required)
            The absolute path of the file or folder

        :param str type: (optional)
            The type of workspace object.

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

        :param bool is_upload_file_base64_encoded: (optional)
            A flag to identify if the upload file is base64 encoded

        :param bool is_overwrite: (optional)
            A boolean which decides if overwrite is allowed

        :param str object_description: (optional)
            The description of the workspace object

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

        :param int buffer_limit: (optional)
            A buffer limit for the stream to be buffered. buffer_limit is used to set the buffer size capacity. Streams will be read until the size of the buffer reaches the buffer_limit.
            If the stream size is greater than the buffer_limit, a BufferError exception will be thrown.

            The buffer_limit parameter is used when the stream object does not have a `seek`, `tell`, or `fileno` property for the Python Request library to calculate out the content length.
            If buffer_limit is not passed, then the buffer_limit will be defaulted to 100MB.
            Large streams can cause the process to freeze, consider passing in content-length for large streams instead.

        :return: A :class:`~oci.response.Response` object with data of type stream
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/objects"
        method = "POST"
        operation_name = "create_workspace_object"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "buffer_limit",
            "type",
            "opc_retry_token",
            "opc_request_id",
            "should_update_recent",
            "is_upload_file_base64_encoded",
            "is_overwrite",
            "object_description"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"create_workspace_object got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError(f'Parameter {k} cannot be None, whitespace or empty string')

        query_params = {
            "objectDescription": kwargs.get("object_description", missing)
        }
        query_params = {k: v for (k, v) in six.iteritems(query_params) if v is not missing and v is not None}

        header_params = {
            "accept": "application/x-yaml",
            "type": kwargs.get("type", missing),
            "path": path,
            "opc-retry-token": kwargs.get("opc_retry_token", missing),
            "opc-request-id": kwargs.get("opc_request_id", missing),
            "should-update-recent": kwargs.get("should_update_recent", missing),
            "is-upload-file-base64-encoded": kwargs.get("is_upload_file_base64_encoded", missing),
            "is-overwrite": kwargs.get("is_overwrite", missing)
        }
        header_params = {k: v for (k, v) in six.iteritems(header_params) if v is not missing and v is not None}

        # If the body parameter is optional we need to assign it to a variable so additional type checking can be performed.
        try:
            create_workspace_object_details
        except NameError:
            create_workspace_object_details = kwargs.get("create_workspace_object_details", missing)

        if create_workspace_object_details is not missing and create_workspace_object_details is not None:
            if (not isinstance(create_workspace_object_details, (six.binary_type, six.string_types)) and
                    not hasattr(create_workspace_object_details, "read")):
                raise TypeError('The body must be a string, bytes, or provide a read() method.')

            if hasattr(create_workspace_object_details, 'fileno') and hasattr(create_workspace_object_details, 'name') and create_workspace_object_details.name != '<stdin>':
                if requests.utils.super_len(create_workspace_object_details) == 0:
                    header_params['Content-Length'] = '0'

            # If content length is not given and stream object have no 'fileno' and is not a string or bytes, try to calculate content length
            elif 'Content-Length' not in header_params and not is_content_length_calculable_by_req_util(create_workspace_object_details):
                calculated_obj = back_up_body_calculate_stream_content_length(create_workspace_object_details, kwargs.get("buffer_limit"))
                header_params['Content-Length'] = calculated_obj["content_length"]
                create_workspace_object_details = calculated_obj["byte_content"]

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
                query_params=query_params,
                header_params=header_params,
                body=create_workspace_object_details,
                response_type="stream",
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
                body=create_workspace_object_details,
                response_type="stream",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def delete_workspace_object(self, ai_data_platform_id, workspace_key, object_path, **kwargs):
        """
        Deletes a workspace object.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str object_path: (required)
            The fully qualified path of the workspace object.

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
        required_arguments = ['aiDataPlatformId', 'workspaceKey', 'objectPath']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/objects/{objectPath}"
        method = "DELETE"
        operation_name = "delete_workspace_object"
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
                f"delete_workspace_object got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "objectPath": object_path
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

    def download_workspace_object_with_par(self, ai_data_platform_id, workspace_key, path, **kwargs):
        """
        Downloads a workspace file by providing the PAR info for downloading the file for given path.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str path: (required)
            The absolute path of the file or folder

        :param bool should_generate_new_par: (optional)
            Flag to toggle to generate short living par

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

        :param str type: (optional)
            The type of workspace object.

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

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.DownloadFileWithParResult`
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/actions/downloadFileMeta"
        method = "POST"
        operation_name = "download_workspace_object_with_par"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "should_generate_new_par",
            "opc_retry_token",
            "opc_request_id",
            "type",
            "should_update_recent"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"download_workspace_object_with_par got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError(f'Parameter {k} cannot be None, whitespace or empty string')

        query_params = {
            "shouldGenerateNewPar": kwargs.get("should_generate_new_par", missing)
        }
        query_params = {k: v for (k, v) in six.iteritems(query_params) if v is not missing and v is not None}

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "path": path,
            "opc-retry-token": kwargs.get("opc_retry_token", missing),
            "opc-request-id": kwargs.get("opc_request_id", missing),
            "type": kwargs.get("type", missing),
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
                query_params=query_params,
                header_params=header_params,
                response_type="DownloadFileWithParResult",
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
                response_type="DownloadFileWithParResult",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def get_workspace_object(self, ai_data_platform_id, workspace_key, object_path, **kwargs):
        """
        Returns detailed information about a workspace object.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str object_path: (required)
            The fully qualified path of the workspace object.

        :param bool should_include_metadata: (optional)
            Whether to include custom file or folder metadata. For HEAD requests,
            metadata is returned as JSON in the file-metadata response header.

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

        :return: A :class:`~oci.response.Response` object with data of type stream
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey', 'objectPath']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/objects/{objectPath}"
        method = "GET"
        operation_name = "get_workspace_object"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "should_include_metadata",
            "opc_request_id",
            "should_update_recent"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"get_workspace_object got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "objectPath": object_path
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError(f'Parameter {k} cannot be None, whitespace or empty string')

        query_params = {
            "shouldIncludeMetadata": kwargs.get("should_include_metadata", missing)
        }
        query_params = {k: v for (k, v) in six.iteritems(query_params) if v is not missing and v is not None}

        header_params = {
            "accept": "application/x-yaml",
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
                response_type="stream",
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
                response_type="stream",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def head_workspace_object(self, ai_data_platform_id, workspace_key, object_path, **kwargs):
        """
        Returns metadata about a workspace object. The contents of the file are not retrieved.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str object_path: (required)
            The fully qualified path of the workspace object.

        :param bool should_include_metadata: (optional)
            Whether to include custom file or folder metadata. For HEAD requests,
            metadata is returned as JSON in the file-metadata response header.

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

        :return: A :class:`~oci.response.Response` object with data of type None
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey', 'objectPath']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/objects/{objectPath}"
        method = "HEAD"
        operation_name = "head_workspace_object"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "should_include_metadata",
            "opc_request_id",
            "should_update_recent"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"head_workspace_object got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "objectPath": object_path
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError(f'Parameter {k} cannot be None, whitespace or empty string')

        query_params = {
            "shouldIncludeMetadata": kwargs.get("should_include_metadata", missing)
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
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def list_workspace_object_permissions(self, ai_data_platform_id, workspace_key, object_key, **kwargs):
        """
        Returns a list of workspace object permissions.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str object_key: (required)
            The key of the workspace object.

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
            The field to sort by. You can provide only one sort order. Default order for `timeCreated`
            is descending. Default order for `displayName` is ascending.

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

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.WorkspaceObjectPermissionCollection`
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey', 'objectKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/objects/{objectKey}/permissions"
        method = "GET"
        operation_name = "list_workspace_object_permissions"
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
                f"list_workspace_object_permissions got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "objectKey": object_key
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
                response_type="WorkspaceObjectPermissionCollection",
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
                response_type="WorkspaceObjectPermissionCollection",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def list_workspace_objects(self, ai_data_platform_id, workspace_key, path, **kwargs):
        """
        Returns a list of objects in the workspace.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str path: (required)
            The absolute path of the file or folder

        :param str type: (optional)
            Filter by object type. For example, NOTEBOOK, LIBRARY, or FILE.

        :param str display_name: (optional)
            A filter to return only resources that match the given display name exactly.

        :param int limit: (optional)
            For list pagination. The maximum number of results per page, or items to return in a
            paginated \"List\" call. For important details about how pagination works, see
            `List Pagination`__.

            __ https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine

        :param str metadata_keys: (optional)
            Comma separated keys to have in list response.

        :param str page: (optional)
            For list pagination. The value of the opc-next-page response header from the previous
            \"List\" call. For important details about how pagination works, see
            `List Pagination`__.

            __ https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine

        :param str sort_order: (optional)
            The sort order to use, either ascending (`ASC`) or descending (`DESC`).

            Allowed values are: "ASC", "DESC"

        :param str sort_by: (optional)
            The field to sort by. You can provide only one sort order. Default order for `timeCreated`
            is descending. Default order for `displayName` is ascending.

            Allowed values are: "timeCreated", "displayName"

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

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.WorkspaceObjectCollection`
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey', 'path']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/objects"
        method = "GET"
        operation_name = "list_workspace_objects"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "type",
            "display_name",
            "limit",
            "metadata_keys",
            "page",
            "sort_order",
            "sort_by",
            "opc_request_id",
            "should_update_recent"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"list_workspace_objects got unknown kwargs: {extra_kwargs!r}")

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
            sort_by_allowed_values = ["timeCreated", "displayName"]
            if kwargs['sort_by'] not in sort_by_allowed_values:
                raise ValueError(
                    f"Invalid value for `sort_by`, must be one of { sort_by_allowed_values }"
                )

        query_params = {
            "path": path,
            "type": kwargs.get("type", missing),
            "displayName": kwargs.get("display_name", missing),
            "limit": kwargs.get("limit", missing),
            "metadataKeys": kwargs.get("metadata_keys", missing),
            "page": kwargs.get("page", missing),
            "sortOrder": kwargs.get("sort_order", missing),
            "sortBy": kwargs.get("sort_by", missing)
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
                response_type="WorkspaceObjectCollection",
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
                response_type="WorkspaceObjectCollection",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def manage_workspace_object_permission(self, ai_data_platform_id, workspace_key, object_key, manage_workspace_object_permission_details, **kwargs):
        """
        Updates permissions on a workspace object.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str object_key: (required)
            The key of the workspace object.

        :param oci.aidataplatform_dp.models.ManageWorkspaceObjectPermissionDetails manage_workspace_object_permission_details: (required)
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
        required_arguments = ['aiDataPlatformId', 'workspaceKey', 'objectKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/objects/{objectKey}/actions/managePermission"
        method = "POST"
        operation_name = "manage_workspace_object_permission"
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
                f"manage_workspace_object_permission got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "objectKey": object_key
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
                body=manage_workspace_object_permission_details,
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
                body=manage_workspace_object_permission_details,
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def move_workspace_object(self, ai_data_platform_id, workspace_key, move_workspace_object_details, **kwargs):
        """
        Moves a workspace object to different location.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param oci.aidataplatform_dp.models.MoveWorkspaceObjectDetails move_workspace_object_details: (required)
            Details for moving the workspace object to a different path.

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

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.WorkspaceObjectDetails`
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/actions/moveObject"
        method = "POST"
        operation_name = "move_workspace_object"
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
                f"move_workspace_object got unknown kwargs: {extra_kwargs!r}")

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
                body=move_workspace_object_details,
                response_type="WorkspaceObjectDetails",
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
                body=move_workspace_object_details,
                response_type="WorkspaceObjectDetails",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def rename_workspace_object(self, ai_data_platform_id, workspace_key, rename_workspace_object_details, **kwargs):
        """
        Renames a workspace object.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param oci.aidataplatform_dp.models.RenameWorkspaceObjectDetails rename_workspace_object_details: (required)
            Details for renaming the workspace object.

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

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.WorkspaceObjectDetails`
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/actions/renameObject"
        method = "POST"
        operation_name = "rename_workspace_object"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "should_update_recent",
            "if_match",
            "opc_request_id"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"rename_workspace_object got unknown kwargs: {extra_kwargs!r}")

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
                self.base_client.add_opc_client_retries_header(header_params)
                retry_strategy.add_circuit_breaker_callback(self.circuit_breaker_callback)
            return retry_strategy.make_retrying_call(
                self.base_client.call_api,
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=rename_workspace_object_details,
                response_type="WorkspaceObjectDetails",
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
                body=rename_workspace_object_details,
                response_type="WorkspaceObjectDetails",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def update_workspace_object(self, ai_data_platform_id, workspace_key, object_path, update_workspace_object_details, **kwargs):
        """
        Updates a workspace object with the provided information.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str object_path: (required)
            The fully qualified path of the workspace object.

        :param stream update_workspace_object_details: (required)
            The information to be updated.

        :param str object_description: (optional)
            The description of the workspace object

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

        :param int buffer_limit: (optional)
            A buffer limit for the stream to be buffered. buffer_limit is used to set the buffer size capacity. Streams will be read until the size of the buffer reaches the buffer_limit.
            If the stream size is greater than the buffer_limit, a BufferError exception will be thrown.

            The buffer_limit parameter is used when the stream object does not have a `seek`, `tell`, or `fileno` property for the Python Request library to calculate out the content length.
            If buffer_limit is not passed, then the buffer_limit will be defaulted to 100MB.
            Large streams can cause the process to freeze, consider passing in content-length for large streams instead.

        :return: A :class:`~oci.response.Response` object with data of type stream
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey', 'objectPath']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/objects/{objectPath}"
        method = "PUT"
        operation_name = "update_workspace_object"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "buffer_limit",
            "object_description",
            "if_match",
            "opc_request_id",
            "should_update_recent"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"update_workspace_object got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "objectPath": object_path
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError(f'Parameter {k} cannot be None, whitespace or empty string')

        query_params = {
            "objectDescription": kwargs.get("object_description", missing)
        }
        query_params = {k: v for (k, v) in six.iteritems(query_params) if v is not missing and v is not None}

        header_params = {
            "accept": "application/x-yaml",
            "if-match": kwargs.get("if_match", missing),
            "opc-request-id": kwargs.get("opc_request_id", missing),
            "should-update-recent": kwargs.get("should_update_recent", missing)
        }
        header_params = {k: v for (k, v) in six.iteritems(header_params) if v is not missing and v is not None}

        # If the body parameter is optional we need to assign it to a variable so additional type checking can be performed.
        try:
            update_workspace_object_details
        except NameError:
            update_workspace_object_details = kwargs.get("update_workspace_object_details", missing)

        if update_workspace_object_details is not missing and update_workspace_object_details is not None:
            if (not isinstance(update_workspace_object_details, (six.binary_type, six.string_types)) and
                    not hasattr(update_workspace_object_details, "read")):
                raise TypeError('The body must be a string, bytes, or provide a read() method.')

            if hasattr(update_workspace_object_details, 'fileno') and hasattr(update_workspace_object_details, 'name') and update_workspace_object_details.name != '<stdin>':
                if requests.utils.super_len(update_workspace_object_details) == 0:
                    header_params['Content-Length'] = '0'

            # If content length is not given and stream object have no 'fileno' and is not a string or bytes, try to calculate content length
            elif 'Content-Length' not in header_params and not is_content_length_calculable_by_req_util(update_workspace_object_details):
                calculated_obj = back_up_body_calculate_stream_content_length(update_workspace_object_details, kwargs.get("buffer_limit"))
                header_params['Content-Length'] = calculated_obj["content_length"]
                update_workspace_object_details = calculated_obj["byte_content"]

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
                body=update_workspace_object_details,
                response_type="stream",
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
                body=update_workspace_object_details,
                response_type="stream",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def upload_and_extract_workspace_zip(self, ai_data_platform_id, workspace_key, upload_and_extract_zip_details, **kwargs):
        """
        Creates or updates an asynchronous workspace ZIP upload and extraction operation. CREATE returns a PAR URL for uploading the ZIP bytes and an async operation key. UPDATE records the uploaded ZIP metadata so extraction can continue.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param oci.aidataplatform_dp.models.UploadAndExtractZipDetails upload_and_extract_zip_details: (required)
            Details for uploading and extracting the workspace ZIP file.

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

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.UploadAndExtractZipResult`
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/actions/uploadAndExtractZip"
        method = "POST"
        operation_name = "upload_and_extract_workspace_zip"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "opc_retry_token",
            "opc_request_id"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"upload_and_extract_workspace_zip got unknown kwargs: {extra_kwargs!r}")

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
                body=upload_and_extract_zip_details,
                response_type="UploadAndExtractZipResult",
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
                body=upload_and_extract_zip_details,
                response_type="UploadAndExtractZipResult",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def upload_workspace_object_with_par(self, ai_data_platform_id, workspace_key, upload_file_with_par_details, path, **kwargs):
        """
        Creates a workspace file by generating PAR or updates the metadata by close file. If file exists, then it will be updated.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param oci.aidataplatform_dp.models.UploadFileWithParDetails upload_file_with_par_details: (required)
            Contents of the file to upload.

        :param str path: (required)
            The absolute path of the file or folder

        :param bool is_overwrite: (optional)
            A boolean which decides if overwrite is allowed

        :param bool should_generate_new_par: (optional)
            Flag to toggle to generate short living par

        :param bool should_create_recursively: (optional)
            A boolean which decides if parent directories should be created recursively during upload.

        :param bool should_update_recent: (optional)
            A flag to identify if the recent list should be updated.

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

        :param str type: (optional)
            The type of workspace object.

        :param str object_description: (optional)
            The description of the workspace object

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

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.UploadFileWithParResult`
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/actions/uploadFileMeta"
        method = "POST"
        operation_name = "upload_workspace_object_with_par"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "is_overwrite",
            "should_generate_new_par",
            "should_create_recursively",
            "should_update_recent",
            "opc_retry_token",
            "opc_request_id",
            "type",
            "object_description"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"upload_workspace_object_with_par got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError(f'Parameter {k} cannot be None, whitespace or empty string')

        query_params = {
            "isOverwrite": kwargs.get("is_overwrite", missing),
            "shouldGenerateNewPar": kwargs.get("should_generate_new_par", missing),
            "shouldCreateRecursively": kwargs.get("should_create_recursively", missing),
            "objectDescription": kwargs.get("object_description", missing)
        }
        query_params = {k: v for (k, v) in six.iteritems(query_params) if v is not missing and v is not None}

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "should-update-recent": kwargs.get("should_update_recent", missing),
            "path": path,
            "opc-retry-token": kwargs.get("opc_retry_token", missing),
            "opc-request-id": kwargs.get("opc_request_id", missing),
            "type": kwargs.get("type", missing)
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
                query_params=query_params,
                header_params=header_params,
                body=upload_file_with_par_details,
                response_type="UploadFileWithParResult",
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
                body=upload_file_with_par_details,
                response_type="UploadFileWithParResult",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def zip_and_download_workspace_folder(self, ai_data_platform_id, workspace_key, zip_and_download_folder_details, **kwargs):
        """
        Starts asynchronous creation of a ZIP archive for a workspace folder. The response includes a PAR URL for downloading the archive after the operation succeeds.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param oci.aidataplatform_dp.models.ZipAndDownloadFolderDetails zip_and_download_folder_details: (required)
            Details for zipping a workspace folder for download.

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

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.ZipAndDownloadFolderResult`
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'workspaceKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/actions/zipAndDownloadFolder"
        method = "POST"
        operation_name = "zip_and_download_workspace_folder"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "opc_retry_token",
            "opc_request_id"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"zip_and_download_workspace_folder got unknown kwargs: {extra_kwargs!r}")

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
                body=zip_and_download_folder_details,
                response_type="ZipAndDownloadFolderResult",
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
                body=zip_and_download_folder_details,
                response_type="ZipAndDownloadFolderResult",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)
