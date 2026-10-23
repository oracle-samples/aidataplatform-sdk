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


class CatalogClient(object):
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
        self.base_client = BaseClient("catalog", config, signer, aidataplatform_dp_type_mapping, **base_client_init_kwargs)
        self.retry_strategy = kwargs.get('retry_strategy', retry.DEFAULT_RETRY_STRATEGY)
        self.circuit_breaker_callback = kwargs.get('circuit_breaker_callback')

    def catalog_test_connection(self, ai_data_platform_id, catalog_test_connection_details, **kwargs):
        """
        Tests the connection to an external catalog.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param oci.aidataplatform_dp.models.CatalogTestConnectionDetails catalog_test_connection_details: (required)
            Details for the AI Data Platform catalog to be tested for connection.

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

        :return: A :class:`~oci.response.Response` object with data of type None
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/actions/testConnection"
        method = "POST"
        operation_name = "catalog_test_connection"
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
                f"catalog_test_connection got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id
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
                body=catalog_test_connection_details,
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
                body=catalog_test_connection_details,
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def create_catalog(self, ai_data_platform_id, create_catalog_details, **kwargs):
        """
        Creates a catalog with the given ID.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param oci.aidataplatform_dp.models.CreateCatalogDetails create_catalog_details: (required)
            Details for the new AI Data Platform catalog.

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

        :return: A :class:`~oci.response.Response` object with data of type None
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/catalogs"
        method = "POST"
        operation_name = "create_catalog"
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
                f"create_catalog got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id
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
                body=create_catalog_details,
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
                body=create_catalog_details,
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def delete_catalog(self, ai_data_platform_id, catalog_key, **kwargs):
        """
        Deletes the specified catalog.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str catalog_key: (required)
            The key of the catalog.

        :param bool is_forced: (optional)
            A boolean which decides if an entity should be deleted with Cascade effect

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

        :return: A :class:`~oci.response.Response` object with data of type None
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'catalogKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/catalogs/{catalogKey}"
        method = "DELETE"
        operation_name = "delete_catalog"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "is_forced",
            "if_match",
            "opc_request_id",
            "should_update_recent"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"delete_catalog got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "catalogKey": catalog_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError(f'Parameter {k} cannot be None, whitespace or empty string')

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "is-forced": kwargs.get("is_forced", missing),
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

    def get_catalog(self, ai_data_platform_id, catalog_key, **kwargs):
        """
        Gets detailed information about a catalog with a given catalog key.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str catalog_key: (required)
            The key of the catalog.

        :param bool is_catalog_guid: (optional)
            A boolean which decides if catalogKey path parameter is catalog GUID (UUID) or name.

        :param bool should_skip_ocid_translation: (optional)
            When true, skip user OCID translation and return raw OCIDs.

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

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.Catalog`
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'catalogKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/catalogs/{catalogKey}"
        method = "GET"
        operation_name = "get_catalog"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "is_catalog_guid",
            "should_skip_ocid_translation",
            "opc_request_id",
            "should_update_recent"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"get_catalog got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "catalogKey": catalog_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError(f'Parameter {k} cannot be None, whitespace or empty string')

        query_params = {
            "isCatalogGuid": kwargs.get("is_catalog_guid", missing),
            "shouldSkipOcidTranslation": kwargs.get("should_skip_ocid_translation", missing)
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
                response_type="Catalog",
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
                response_type="Catalog",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def list_catalog_permissions(self, ai_data_platform_id, catalog_key, **kwargs):
        """
        Gets a list of all permissions in the specified catalog.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str catalog_key: (required)
            The key of the catalog.

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
            The field to sort by. You can provide only one sort order. Default order for timeCreated
            is descending. Default order for displayName is ascending.

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

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.CatalogPermissionCollection`
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'catalogKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/catalogs/{catalogKey}/permissions"
        method = "GET"
        operation_name = "list_catalog_permissions"
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
            "opc_request_id",
            "should_update_recent"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"list_catalog_permissions got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "catalogKey": catalog_key
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
                response_type="CatalogPermissionCollection",
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
                response_type="CatalogPermissionCollection",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def list_catalogs(self, ai_data_platform_id, **kwargs):
        """
        Gets a list of catalogs with a given ID.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str display_name: (optional)
            A filter to return only resources that match the given display name exactly.

        :param str catalog_state: (optional)
            The state of the catalog.

            Allowed values are: "ACTIVE", "CREATING", "DELETING"

        :param str catalog_type: (optional)
            The type of the catalog.

            Allowed values are: "INTERNAL", "EXTERNAL"

        :param bool should_skip_ocid_translation: (optional)
            When true, skip user OCID translation and return raw OCIDs.

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
            The field to sort by. You can provide only one sort order. Default order for timeCreated
            is descending. Default order for displayName is ascending.

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

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.CatalogCollection`
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/catalogs"
        method = "GET"
        operation_name = "list_catalogs"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "display_name",
            "catalog_state",
            "catalog_type",
            "should_skip_ocid_translation",
            "limit",
            "page",
            "sort_order",
            "sort_by",
            "opc_request_id"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"list_catalogs got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError(f'Parameter {k} cannot be None, whitespace or empty string')

        if 'catalog_state' in kwargs:
            catalog_state_allowed_values = ["ACTIVE", "CREATING", "DELETING"]
            if kwargs['catalog_state'] not in catalog_state_allowed_values:
                raise ValueError(
                    f"Invalid value for `catalog_state`, must be one of { catalog_state_allowed_values }"
                )

        if 'catalog_type' in kwargs:
            catalog_type_allowed_values = ["INTERNAL", "EXTERNAL"]
            if kwargs['catalog_type'] not in catalog_type_allowed_values:
                raise ValueError(
                    f"Invalid value for `catalog_type`, must be one of { catalog_type_allowed_values }"
                )

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
            "displayName": kwargs.get("display_name", missing),
            "catalogState": kwargs.get("catalog_state", missing),
            "catalogType": kwargs.get("catalog_type", missing),
            "shouldSkipOcidTranslation": kwargs.get("should_skip_ocid_translation", missing),
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
                response_type="CatalogCollection",
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
                response_type="CatalogCollection",
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def manage_catalog_permission(self, ai_data_platform_id, catalog_key, manage_catalog_permission_details, **kwargs):
        """
        Updates permission details for a catalog.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str catalog_key: (required)
            The key of the catalog.

        :param oci.aidataplatform_dp.models.ManageCatalogPermissionDetails manage_catalog_permission_details: (required)
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

        :return: A :class:`~oci.response.Response` object with data of type None
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'catalogKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/catalogs/{catalogKey}/actions/managePermission"
        method = "POST"
        operation_name = "manage_catalog_permission"
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
                f"manage_catalog_permission got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "catalogKey": catalog_key
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
                body=manage_catalog_permission_details,
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
                body=manage_catalog_permission_details,
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)

    def refresh_catalog(self, ai_data_platform_id, catalog_key, **kwargs):
        """
        Refreshes a catalog through a crawler.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str catalog_key: (required)
            The key of the catalog.

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
        required_arguments = ['aiDataPlatformId', 'catalogKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/catalogs/{catalogKey}/actions/refresh"
        method = "POST"
        operation_name = "refresh_catalog"
        api_reference_link = ""

        # Don't accept unknown kwargs
        expected_kwargs = [
            "allow_control_chars",
            "enable_strict_url_encoding",
            "retry_strategy",
            "if_match",
            "opc_request_id",
            "should_update_recent",
            "opc_retry_token"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                f"refresh_catalog got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "catalogKey": catalog_key
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
            "should-update-recent": kwargs.get("should_update_recent", missing),
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

    def update_catalog(self, ai_data_platform_id, catalog_key, update_catalog_details, **kwargs):
        """
        Updates the details of a catalog with the given information.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str catalog_key: (required)
            The key of the catalog.

        :param oci.aidataplatform_dp.models.UpdateCatalogDetails update_catalog_details: (required)
            The information to be updated.

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

        :return: A :class:`~oci.response.Response` object with data of type None
        :rtype: :class:`~oci.response.Response`
        """
        # Required path and query arguments. These are in camelCase to replace values in service endpoints.
        required_arguments = ['aiDataPlatformId', 'catalogKey']
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/catalogs/{catalogKey}"
        method = "PUT"
        operation_name = "update_catalog"
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
                f"update_catalog got unknown kwargs: {extra_kwargs!r}")

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "catalogKey": catalog_key
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
                body=update_catalog_details,
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
                body=update_catalog_details,
                allow_control_chars=kwargs.get('allow_control_chars'),
                enable_strict_url_encoding=kwargs.get('enable_strict_url_encoding'),
                operation_name=operation_name,
                api_reference_link=api_reference_link,
                required_arguments=required_arguments)
