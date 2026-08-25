# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from __future__ import absolute_import

from oci._vendor import requests  # noqa: F401
from oci._vendor import six

from oci import retry  # noqa: F401
from oci.base_client import BaseClient
from oci.config import get_config_value_or_default, validate_config
from oci.signer import Signer
from oci.util import Sentinel, get_signer_from_authentication_type, AUTHENTICATION_TYPE_FIELD_NAME
from .models import aidataplatform_dp_type_mapping
missing = Sentinel("Missing")


class AgentClient(object):
    """
    Use the AI Data Platform Data Plane API to manage workspaces and objects in the workspace.
    """

    def __init__(self, config, **kwargs):
        """
        Creates a new service client

        :param dict config:
            Configuration keys and values as per `SDK and Tool Configuration <https://docs.cloud.oracle.com/Content/API/Concepts/sdkconfig.htm>`__.
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

            One use case for this parameter is for `Instance Principals authentication <https://docs.cloud.oracle.com/Content/Identity/Tasks/callingservicesfrominstances.htm>`__
            by passing an instance of :py:class:`~oci.auth.signers.InstancePrincipalsSecurityTokenSigner` as the value for this keyword argument
        :type signer: :py:class:`~oci.signer.AbstractBaseSigner`

        :param obj retry_strategy: (optional)
            A retry strategy to apply to all calls made by this service client (i.e. at the client level). There is no retry strategy applied by default.
            Retry strategies can also be applied at the operation level by passing a ``retry_strategy`` keyword argument as part of calling the operation.
            Any value provided at the operation level will override whatever is specified at the client level.

            This should be one of the strategies available in the :py:mod:`~oci.retry` module. A convenience :py:data:`~oci.retry.DEFAULT_RETRY_STRATEGY`
            is also available. The specifics of the default retry strategy are described `here <https://oracle-cloud-infrastructure-python-sdk.readthedocs.io/en/latest/sdk_behaviors/retries.html>`__.
        """
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
            'timeout': kwargs.get('timeout'),
            'base_path': '/20260430',
            'service_endpoint_template': 'https://datalake.{region}.oci.{secondLevelDomain}',
            'skip_deserialization': kwargs.get('skip_deserialization', False)
        }
        self.base_client = BaseClient("agent", config, signer, aidataplatform_dp_type_mapping, **base_client_init_kwargs)
        self.retry_strategy = kwargs.get('retry_strategy', retry.DEFAULT_RETRY_STRATEGY)

    def copy_agent(self, ai_data_platform_id, workspace_key, agent_key, copy_agent_details, **kwargs):
        """
        Copies an agent.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str agent_key: (required)
            The UUID of the agent.

        :param oci.aidataplatform_dp.models.CopyAgentDetails copy_agent_details: (required)
            Details for copying the agent.

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

        :param str if_match: (optional)
            For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
            `if-match` parameter to the value of the etag from a previous GET or POST response for
            that resource. The resource will be updated or deleted only if the etag you provide
            matches the resource's current etag value.

        :param obj retry_strategy: (optional)
            A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level.

            This should be one of the strategies available in the :py:mod:`~oci.retry` module. A convenience :py:data:`~oci.retry.DEFAULT_RETRY_STRATEGY`
            is also available. The specifics of the default retry strategy are described `here <https://oracle-cloud-infrastructure-python-sdk.readthedocs.io/en/latest/sdk_behaviors/retries.html>`__.

            To have this operation explicitly not perform any retries, pass an instance of :py:class:`~oci.retry.NoneRetryStrategy`.

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.Agent`
        :rtype: :class:`~oci.response.Response`
        """
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/agents/{agentKey}/actions/copy"
        method = "POST"

        # Don't accept unknown kwargs
        expected_kwargs = [
            "retry_strategy",
            "should_update_recent",
            "opc_retry_token",
            "opc_request_id",
            "if_match"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                "copy_agent got unknown kwargs: {!r}".format(extra_kwargs))

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "agentKey": agent_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError('Parameter {} cannot be None, whitespace or empty string'.format(k))

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "should-update-recent": kwargs.get("should_update_recent", missing),
            "opc-retry-token": kwargs.get("opc_retry_token", missing),
            "opc-request-id": kwargs.get("opc_request_id", missing),
            "if-match": kwargs.get("if_match", missing)
        }
        header_params = {k: v for (k, v) in six.iteritems(header_params) if v is not missing and v is not None}

        retry_strategy = self.retry_strategy
        if kwargs.get('retry_strategy'):
            retry_strategy = kwargs.get('retry_strategy')

        if retry_strategy:
            if not isinstance(retry_strategy, retry.NoneRetryStrategy):
                self.base_client.add_opc_retry_token_if_needed(header_params)
            return retry_strategy.make_retrying_call(
                self.base_client.call_api,
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=copy_agent_details,
                response_type="Agent")
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=copy_agent_details,
                response_type="Agent")

    def create_agent(self, ai_data_platform_id, workspace_key, create_agent_details, **kwargs):
        """
        Creates an agent.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param oci.aidataplatform_dp.models.CreateAgentDetails create_agent_details: (required)
            Details for the new agent.

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

        :param obj retry_strategy: (optional)
            A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level.

            This should be one of the strategies available in the :py:mod:`~oci.retry` module. A convenience :py:data:`~oci.retry.DEFAULT_RETRY_STRATEGY`
            is also available. The specifics of the default retry strategy are described `here <https://oracle-cloud-infrastructure-python-sdk.readthedocs.io/en/latest/sdk_behaviors/retries.html>`__.

            To have this operation explicitly not perform any retries, pass an instance of :py:class:`~oci.retry.NoneRetryStrategy`.

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.Agent`
        :rtype: :class:`~oci.response.Response`
        """
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/agents"
        method = "POST"

        # Don't accept unknown kwargs
        expected_kwargs = [
            "retry_strategy",
            "should_update_recent",
            "opc_retry_token",
            "opc_request_id"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                "create_agent got unknown kwargs: {!r}".format(extra_kwargs))

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError('Parameter {} cannot be None, whitespace or empty string'.format(k))

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "should-update-recent": kwargs.get("should_update_recent", missing),
            "opc-retry-token": kwargs.get("opc_retry_token", missing),
            "opc-request-id": kwargs.get("opc_request_id", missing)
        }
        header_params = {k: v for (k, v) in six.iteritems(header_params) if v is not missing and v is not None}

        retry_strategy = self.retry_strategy
        if kwargs.get('retry_strategy'):
            retry_strategy = kwargs.get('retry_strategy')

        if retry_strategy:
            if not isinstance(retry_strategy, retry.NoneRetryStrategy):
                self.base_client.add_opc_retry_token_if_needed(header_params)
            return retry_strategy.make_retrying_call(
                self.base_client.call_api,
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=create_agent_details,
                response_type="Agent")
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=create_agent_details,
                response_type="Agent")

    def delete_agent(self, ai_data_platform_id, workspace_key, agent_key, **kwargs):
        """
        Delete an agent from the schema.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str agent_key: (required)
            The UUID of the agent.

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

            This should be one of the strategies available in the :py:mod:`~oci.retry` module. A convenience :py:data:`~oci.retry.DEFAULT_RETRY_STRATEGY`
            is also available. The specifics of the default retry strategy are described `here <https://oracle-cloud-infrastructure-python-sdk.readthedocs.io/en/latest/sdk_behaviors/retries.html>`__.

            To have this operation explicitly not perform any retries, pass an instance of :py:class:`~oci.retry.NoneRetryStrategy`.

        :return: A :class:`~oci.response.Response` object with data of type None
        :rtype: :class:`~oci.response.Response`
        """
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/agents/{agentKey}"
        method = "DELETE"

        # Don't accept unknown kwargs
        expected_kwargs = [
            "retry_strategy",
            "if_match",
            "opc_request_id",
            "should_update_recent"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                "delete_agent got unknown kwargs: {!r}".format(extra_kwargs))

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "agentKey": agent_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError('Parameter {} cannot be None, whitespace or empty string'.format(k))

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "if-match": kwargs.get("if_match", missing),
            "opc-request-id": kwargs.get("opc_request_id", missing),
            "should-update-recent": kwargs.get("should_update_recent", missing)
        }
        header_params = {k: v for (k, v) in six.iteritems(header_params) if v is not missing and v is not None}

        retry_strategy = self.retry_strategy
        if kwargs.get('retry_strategy'):
            retry_strategy = kwargs.get('retry_strategy')

        if retry_strategy:
            return retry_strategy.make_retrying_call(
                self.base_client.call_api,
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params)
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params)

    def delete_agent_deployment(self, ai_data_platform_id, workspace_key, agent_key, agent_deployment_key, **kwargs):
        """
        Deletes an agent deployment.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str agent_key: (required)
            The UUID of the agent.

        :param str agent_deployment_key: (required)
            The UUID of the agent deployment.

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

            This should be one of the strategies available in the :py:mod:`~oci.retry` module. A convenience :py:data:`~oci.retry.DEFAULT_RETRY_STRATEGY`
            is also available. The specifics of the default retry strategy are described `here <https://oracle-cloud-infrastructure-python-sdk.readthedocs.io/en/latest/sdk_behaviors/retries.html>`__.

            To have this operation explicitly not perform any retries, pass an instance of :py:class:`~oci.retry.NoneRetryStrategy`.

        :return: A :class:`~oci.response.Response` object with data of type None
        :rtype: :class:`~oci.response.Response`
        """
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/agents/{agentKey}/deployments/{agentDeploymentKey}"
        method = "DELETE"

        # Don't accept unknown kwargs
        expected_kwargs = [
            "retry_strategy",
            "if_match",
            "opc_request_id"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                "delete_agent_deployment got unknown kwargs: {!r}".format(extra_kwargs))

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "agentKey": agent_key,
            "agentDeploymentKey": agent_deployment_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError('Parameter {} cannot be None, whitespace or empty string'.format(k))

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "if-match": kwargs.get("if_match", missing),
            "opc-request-id": kwargs.get("opc_request_id", missing)
        }
        header_params = {k: v for (k, v) in six.iteritems(header_params) if v is not missing and v is not None}

        retry_strategy = self.retry_strategy
        if kwargs.get('retry_strategy'):
            retry_strategy = kwargs.get('retry_strategy')

        if retry_strategy:
            return retry_strategy.make_retrying_call(
                self.base_client.call_api,
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params)
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params)

    def delete_agent_session(self, ai_data_platform_id, workspace_key, agent_key, session_id, **kwargs):
        """
        Deletes an agent Session.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str agent_key: (required)
            The UUID of the agent.

        :param str session_id: (required)
            The UUID of the agent session.

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

            This should be one of the strategies available in the :py:mod:`~oci.retry` module. A convenience :py:data:`~oci.retry.DEFAULT_RETRY_STRATEGY`
            is also available. The specifics of the default retry strategy are described `here <https://oracle-cloud-infrastructure-python-sdk.readthedocs.io/en/latest/sdk_behaviors/retries.html>`__.

            To have this operation explicitly not perform any retries, pass an instance of :py:class:`~oci.retry.NoneRetryStrategy`.

        :return: A :class:`~oci.response.Response` object with data of type None
        :rtype: :class:`~oci.response.Response`
        """
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/agents/{agentKey}/sessions/{sessionId}"
        method = "DELETE"

        # Don't accept unknown kwargs
        expected_kwargs = [
            "retry_strategy",
            "opc_request_id",
            "if_match"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                "delete_agent_session got unknown kwargs: {!r}".format(extra_kwargs))

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "agentKey": agent_key,
            "sessionId": session_id
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError('Parameter {} cannot be None, whitespace or empty string'.format(k))

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "opc-request-id": kwargs.get("opc_request_id", missing),
            "if-match": kwargs.get("if_match", missing)
        }
        header_params = {k: v for (k, v) in six.iteritems(header_params) if v is not missing and v is not None}

        retry_strategy = self.retry_strategy
        if kwargs.get('retry_strategy'):
            retry_strategy = kwargs.get('retry_strategy')

        if retry_strategy:
            return retry_strategy.make_retrying_call(
                self.base_client.call_api,
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params)
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params)

    def deploy_agent(self, ai_data_platform_id, workspace_key, agent_key, deploy_agent_details, **kwargs):
        """
        Deploys a specified agent.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str agent_key: (required)
            The UUID of the agent.

        :param oci.aidataplatform_dp.models.DeployAgentDetails deploy_agent_details: (required)
            Details of a deployable agent.

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

            This should be one of the strategies available in the :py:mod:`~oci.retry` module. A convenience :py:data:`~oci.retry.DEFAULT_RETRY_STRATEGY`
            is also available. The specifics of the default retry strategy are described `here <https://oracle-cloud-infrastructure-python-sdk.readthedocs.io/en/latest/sdk_behaviors/retries.html>`__.

            To have this operation explicitly not perform any retries, pass an instance of :py:class:`~oci.retry.NoneRetryStrategy`.

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.AgentDeployment`
        :rtype: :class:`~oci.response.Response`
        """
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/agents/{agentKey}/deployments/actions/deploy"
        method = "POST"

        # Don't accept unknown kwargs
        expected_kwargs = [
            "retry_strategy",
            "opc_retry_token",
            "opc_request_id"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                "deploy_agent got unknown kwargs: {!r}".format(extra_kwargs))

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "agentKey": agent_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError('Parameter {} cannot be None, whitespace or empty string'.format(k))

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "opc-retry-token": kwargs.get("opc_retry_token", missing),
            "opc-request-id": kwargs.get("opc_request_id", missing)
        }
        header_params = {k: v for (k, v) in six.iteritems(header_params) if v is not missing and v is not None}

        retry_strategy = self.retry_strategy
        if kwargs.get('retry_strategy'):
            retry_strategy = kwargs.get('retry_strategy')

        if retry_strategy:
            if not isinstance(retry_strategy, retry.NoneRetryStrategy):
                self.base_client.add_opc_retry_token_if_needed(header_params)
            return retry_strategy.make_retrying_call(
                self.base_client.call_api,
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=deploy_agent_details,
                response_type="AgentDeployment")
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=deploy_agent_details,
                response_type="AgentDeployment")

    def get_agent(self, ai_data_platform_id, workspace_key, agent_key, **kwargs):
        """
        Returns detailed information about an agent.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str agent_key: (required)
            The UUID of the agent.

        :param str opc_request_id: (optional)
            Unique Oracle-assigned identifier for the request. If you need to contact
            Oracle about a particular request, please provide the request ID.
            The only valid characters for request IDs are letters, numbers,
            underscore, and dash.

        :param bool should_update_recent: (optional)
            A flag to identify if the recent list should be updated.

        :param obj retry_strategy: (optional)
            A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level.

            This should be one of the strategies available in the :py:mod:`~oci.retry` module. A convenience :py:data:`~oci.retry.DEFAULT_RETRY_STRATEGY`
            is also available. The specifics of the default retry strategy are described `here <https://oracle-cloud-infrastructure-python-sdk.readthedocs.io/en/latest/sdk_behaviors/retries.html>`__.

            To have this operation explicitly not perform any retries, pass an instance of :py:class:`~oci.retry.NoneRetryStrategy`.

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.Agent`
        :rtype: :class:`~oci.response.Response`
        """
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/agents/{agentKey}"
        method = "GET"

        # Don't accept unknown kwargs
        expected_kwargs = [
            "retry_strategy",
            "opc_request_id",
            "should_update_recent"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                "get_agent got unknown kwargs: {!r}".format(extra_kwargs))

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "agentKey": agent_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError('Parameter {} cannot be None, whitespace or empty string'.format(k))

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "opc-request-id": kwargs.get("opc_request_id", missing),
            "should-update-recent": kwargs.get("should_update_recent", missing)
        }
        header_params = {k: v for (k, v) in six.iteritems(header_params) if v is not missing and v is not None}

        retry_strategy = self.retry_strategy
        if kwargs.get('retry_strategy'):
            retry_strategy = kwargs.get('retry_strategy')

        if retry_strategy:
            return retry_strategy.make_retrying_call(
                self.base_client.call_api,
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                response_type="Agent")
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                response_type="Agent")

    def get_agent_deployment(self, ai_data_platform_id, workspace_key, agent_key, agent_deployment_key, **kwargs):
        """
        Returns detailed information about an agent deployment.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str agent_key: (required)
            The UUID of the agent.

        :param str agent_deployment_key: (required)
            The UUID of the agent deployment.

        :param str opc_request_id: (optional)
            Unique Oracle-assigned identifier for the request. If you need to contact
            Oracle about a particular request, please provide the request ID.
            The only valid characters for request IDs are letters, numbers,
            underscore, and dash.

        :param obj retry_strategy: (optional)
            A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level.

            This should be one of the strategies available in the :py:mod:`~oci.retry` module. A convenience :py:data:`~oci.retry.DEFAULT_RETRY_STRATEGY`
            is also available. The specifics of the default retry strategy are described `here <https://oracle-cloud-infrastructure-python-sdk.readthedocs.io/en/latest/sdk_behaviors/retries.html>`__.

            To have this operation explicitly not perform any retries, pass an instance of :py:class:`~oci.retry.NoneRetryStrategy`.

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.AgentDeployment`
        :rtype: :class:`~oci.response.Response`
        """
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/agents/{agentKey}/deployments/{agentDeploymentKey}"
        method = "GET"

        # Don't accept unknown kwargs
        expected_kwargs = [
            "retry_strategy",
            "opc_request_id"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                "get_agent_deployment got unknown kwargs: {!r}".format(extra_kwargs))

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "agentKey": agent_key,
            "agentDeploymentKey": agent_deployment_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError('Parameter {} cannot be None, whitespace or empty string'.format(k))

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "opc-request-id": kwargs.get("opc_request_id", missing)
        }
        header_params = {k: v for (k, v) in six.iteritems(header_params) if v is not missing and v is not None}

        retry_strategy = self.retry_strategy
        if kwargs.get('retry_strategy'):
            retry_strategy = kwargs.get('retry_strategy')

        if retry_strategy:
            return retry_strategy.make_retrying_call(
                self.base_client.call_api,
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                response_type="AgentDeployment")
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                response_type="AgentDeployment")

    def get_agent_session(self, ai_data_platform_id, workspace_key, agent_key, session_id, **kwargs):
        """
        Returns detailed information about an agent session.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str agent_key: (required)
            The UUID of the agent.

        :param str session_id: (required)
            The UUID of the agent session.

        :param str opc_request_id: (optional)
            Unique Oracle-assigned identifier for the request. If you need to contact
            Oracle about a particular request, please provide the request ID.
            The only valid characters for request IDs are letters, numbers,
            underscore, and dash.

        :param obj retry_strategy: (optional)
            A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level.

            This should be one of the strategies available in the :py:mod:`~oci.retry` module. A convenience :py:data:`~oci.retry.DEFAULT_RETRY_STRATEGY`
            is also available. The specifics of the default retry strategy are described `here <https://oracle-cloud-infrastructure-python-sdk.readthedocs.io/en/latest/sdk_behaviors/retries.html>`__.

            To have this operation explicitly not perform any retries, pass an instance of :py:class:`~oci.retry.NoneRetryStrategy`.

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.AgentSession`
        :rtype: :class:`~oci.response.Response`
        """
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/agents/{agentKey}/sessions/{sessionId}"
        method = "GET"

        # Don't accept unknown kwargs
        expected_kwargs = [
            "retry_strategy",
            "opc_request_id"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                "get_agent_session got unknown kwargs: {!r}".format(extra_kwargs))

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "agentKey": agent_key,
            "sessionId": session_id
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError('Parameter {} cannot be None, whitespace or empty string'.format(k))

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "opc-request-id": kwargs.get("opc_request_id", missing)
        }
        header_params = {k: v for (k, v) in six.iteritems(header_params) if v is not missing and v is not None}

        retry_strategy = self.retry_strategy
        if kwargs.get('retry_strategy'):
            retry_strategy = kwargs.get('retry_strategy')

        if retry_strategy:
            return retry_strategy.make_retrying_call(
                self.base_client.call_api,
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                response_type="AgentSession")
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                response_type="AgentSession")

    def get_agent_session_trace(self, ai_data_platform_id, workspace_key, agent_key, session_id, trace_key, **kwargs):
        """
        Returns trace details for a given message key.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str agent_key: (required)
            The UUID of the agent.

        :param str session_id: (required)
            The UUID of the agent session.

        :param str trace_key: (required)
            A filter to return only resources that match the given display trace key exactly.

        :param str opc_request_id: (optional)
            Unique Oracle-assigned identifier for the request. If you need to contact
            Oracle about a particular request, please provide the request ID.
            The only valid characters for request IDs are letters, numbers,
            underscore, and dash.

        :param obj retry_strategy: (optional)
            A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level.

            This should be one of the strategies available in the :py:mod:`~oci.retry` module. A convenience :py:data:`~oci.retry.DEFAULT_RETRY_STRATEGY`
            is also available. The specifics of the default retry strategy are described `here <https://oracle-cloud-infrastructure-python-sdk.readthedocs.io/en/latest/sdk_behaviors/retries.html>`__.

            To have this operation explicitly not perform any retries, pass an instance of :py:class:`~oci.retry.NoneRetryStrategy`.

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.TraceDetails`
        :rtype: :class:`~oci.response.Response`
        """
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/agents/{agentKey}/sessions/{sessionId}/traces/{traceKey}"
        method = "GET"

        # Don't accept unknown kwargs
        expected_kwargs = [
            "retry_strategy",
            "opc_request_id"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                "get_agent_session_trace got unknown kwargs: {!r}".format(extra_kwargs))

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "agentKey": agent_key,
            "sessionId": session_id,
            "traceKey": trace_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError('Parameter {} cannot be None, whitespace or empty string'.format(k))

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "opc-request-id": kwargs.get("opc_request_id", missing)
        }
        header_params = {k: v for (k, v) in six.iteritems(header_params) if v is not missing and v is not None}

        retry_strategy = self.retry_strategy
        if kwargs.get('retry_strategy'):
            retry_strategy = kwargs.get('retry_strategy')

        if retry_strategy:
            return retry_strategy.make_retrying_call(
                self.base_client.call_api,
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                response_type="TraceDetails")
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                response_type="TraceDetails")

    def list_agent_deployments(self, ai_data_platform_id, workspace_key, agent_key, **kwargs):
        """
        Returns a list of all deployments of an agent.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str agent_key: (required)
            The UUID of the agent.

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

        :param str display_name: (optional)
            A filter to return only resources that match the given display name exactly.

        :param str display_name_contains: (optional)
            A filter to return only resources that have a display name containing the text provided.

        :param list[str] lifecycle_state: (optional)
            A filter to return only resources whose value matches the given lifecycleState.

            Allowed values are: "CREATING", "ACTIVE", "INACTIVE", "FAILED", "DELETED"

        :param datetime time_created_greater_than_or_equal_to: (optional)
            Fetch objects from repository that were created after or at the exact timestamp provided in parameter

        :param datetime time_created_less_than_or_equal_to: (optional)
            Fetch objects from repository that were created before or at the exact timestamp provided in parameter.

        :param str sort_by: (optional)
            The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending.

            Allowed values are: "timeCreated", "displayName"

        :param list[str] compute_key: (optional)
            Compute key.

        :param str opc_request_id: (optional)
            Unique Oracle-assigned identifier for the request. If you need to contact
            Oracle about a particular request, please provide the request ID.
            The only valid characters for request IDs are letters, numbers,
            underscore, and dash.

        :param obj retry_strategy: (optional)
            A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level.

            This should be one of the strategies available in the :py:mod:`~oci.retry` module. A convenience :py:data:`~oci.retry.DEFAULT_RETRY_STRATEGY`
            is also available. The specifics of the default retry strategy are described `here <https://oracle-cloud-infrastructure-python-sdk.readthedocs.io/en/latest/sdk_behaviors/retries.html>`__.

            To have this operation explicitly not perform any retries, pass an instance of :py:class:`~oci.retry.NoneRetryStrategy`.

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.AgentDeploymentCollection`
        :rtype: :class:`~oci.response.Response`
        """
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/agents/{agentKey}/deployments"
        method = "GET"

        # Don't accept unknown kwargs
        expected_kwargs = [
            "retry_strategy",
            "limit",
            "page",
            "sort_order",
            "display_name",
            "display_name_contains",
            "lifecycle_state",
            "time_created_greater_than_or_equal_to",
            "time_created_less_than_or_equal_to",
            "sort_by",
            "compute_key",
            "opc_request_id"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                "list_agent_deployments got unknown kwargs: {!r}".format(extra_kwargs))

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "agentKey": agent_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError('Parameter {} cannot be None, whitespace or empty string'.format(k))

        if 'sort_order' in kwargs:
            sort_order_allowed_values = ["ASC", "DESC"]
            if kwargs['sort_order'] not in sort_order_allowed_values:
                raise ValueError(
                    "Invalid value for `sort_order`, must be one of {0}".format(sort_order_allowed_values)
                )

        if 'lifecycle_state' in kwargs:
            lifecycle_state_allowed_values = ["CREATING", "ACTIVE", "INACTIVE", "FAILED", "DELETED"]
            for lifecycle_state_item in kwargs['lifecycle_state']:
                if lifecycle_state_item not in lifecycle_state_allowed_values:
                    raise ValueError(
                        "Invalid value for `lifecycle_state`, must be one of {0}".format(lifecycle_state_allowed_values)
                    )

        if 'sort_by' in kwargs:
            sort_by_allowed_values = ["timeCreated", "displayName"]
            if kwargs['sort_by'] not in sort_by_allowed_values:
                raise ValueError(
                    "Invalid value for `sort_by`, must be one of {0}".format(sort_by_allowed_values)
                )

        query_params = {
            "limit": kwargs.get("limit", missing),
            "page": kwargs.get("page", missing),
            "sortOrder": kwargs.get("sort_order", missing),
            "displayName": kwargs.get("display_name", missing),
            "displayNameContains": kwargs.get("display_name_contains", missing),
            "lifecycleState": self.base_client.generate_collection_format_param(kwargs.get("lifecycle_state", missing), 'multi'),
            "timeCreatedGreaterThanOrEqualTo": kwargs.get("time_created_greater_than_or_equal_to", missing),
            "timeCreatedLessThanOrEqualTo": kwargs.get("time_created_less_than_or_equal_to", missing),
            "sortBy": kwargs.get("sort_by", missing),
            "computeKey": self.base_client.generate_collection_format_param(kwargs.get("compute_key", missing), 'multi')
        }
        query_params = {k: v for (k, v) in six.iteritems(query_params) if v is not missing and v is not None}

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "opc-request-id": kwargs.get("opc_request_id", missing)
        }
        header_params = {k: v for (k, v) in six.iteritems(header_params) if v is not missing and v is not None}

        retry_strategy = self.retry_strategy
        if kwargs.get('retry_strategy'):
            retry_strategy = kwargs.get('retry_strategy')

        if retry_strategy:
            return retry_strategy.make_retrying_call(
                self.base_client.call_api,
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                query_params=query_params,
                header_params=header_params,
                response_type="AgentDeploymentCollection")
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                query_params=query_params,
                header_params=header_params,
                response_type="AgentDeploymentCollection")

    def list_agent_permissions(self, ai_data_platform_id, workspace_key, agent_key, **kwargs):
        """
        Returns a list of permissions for a given agent.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str agent_key: (required)
            The UUID of the agent.

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

            This should be one of the strategies available in the :py:mod:`~oci.retry` module. A convenience :py:data:`~oci.retry.DEFAULT_RETRY_STRATEGY`
            is also available. The specifics of the default retry strategy are described `here <https://oracle-cloud-infrastructure-python-sdk.readthedocs.io/en/latest/sdk_behaviors/retries.html>`__.

            To have this operation explicitly not perform any retries, pass an instance of :py:class:`~oci.retry.NoneRetryStrategy`.

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.AgentPermissionCollection`
        :rtype: :class:`~oci.response.Response`
        """
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/agents/{agentKey}/permissions"
        method = "GET"

        # Don't accept unknown kwargs
        expected_kwargs = [
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
                "list_agent_permissions got unknown kwargs: {!r}".format(extra_kwargs))

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "agentKey": agent_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError('Parameter {} cannot be None, whitespace or empty string'.format(k))

        if 'sort_order' in kwargs:
            sort_order_allowed_values = ["ASC", "DESC"]
            if kwargs['sort_order'] not in sort_order_allowed_values:
                raise ValueError(
                    "Invalid value for `sort_order`, must be one of {0}".format(sort_order_allowed_values)
                )

        if 'sort_by' in kwargs:
            sort_by_allowed_values = ["timeCreated", "displayName"]
            if kwargs['sort_by'] not in sort_by_allowed_values:
                raise ValueError(
                    "Invalid value for `sort_by`, must be one of {0}".format(sort_by_allowed_values)
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

        retry_strategy = self.retry_strategy
        if kwargs.get('retry_strategy'):
            retry_strategy = kwargs.get('retry_strategy')

        if retry_strategy:
            return retry_strategy.make_retrying_call(
                self.base_client.call_api,
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                query_params=query_params,
                header_params=header_params,
                response_type="AgentPermissionCollection")
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                query_params=query_params,
                header_params=header_params,
                response_type="AgentPermissionCollection")

    def list_agent_session_chat_histories(self, ai_data_platform_id, workspace_key, agent_key, session_id, **kwargs):
        """
        Returns list of agent session chat messages.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str agent_key: (required)
            The UUID of the agent.

        :param str session_id: (required)
            The UUID of the agent session.

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

        :param obj retry_strategy: (optional)
            A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level.

            This should be one of the strategies available in the :py:mod:`~oci.retry` module. A convenience :py:data:`~oci.retry.DEFAULT_RETRY_STRATEGY`
            is also available. The specifics of the default retry strategy are described `here <https://oracle-cloud-infrastructure-python-sdk.readthedocs.io/en/latest/sdk_behaviors/retries.html>`__.

            To have this operation explicitly not perform any retries, pass an instance of :py:class:`~oci.retry.NoneRetryStrategy`.

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.SessionChatHistoryCollection`
        :rtype: :class:`~oci.response.Response`
        """
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/agents/{agentKey}/sessions/{sessionId}/chatHistory"
        method = "GET"

        # Don't accept unknown kwargs
        expected_kwargs = [
            "retry_strategy",
            "limit",
            "page",
            "opc_request_id"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                "list_agent_session_chat_histories got unknown kwargs: {!r}".format(extra_kwargs))

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "agentKey": agent_key,
            "sessionId": session_id
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError('Parameter {} cannot be None, whitespace or empty string'.format(k))

        query_params = {
            "limit": kwargs.get("limit", missing),
            "page": kwargs.get("page", missing)
        }
        query_params = {k: v for (k, v) in six.iteritems(query_params) if v is not missing and v is not None}

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "opc-request-id": kwargs.get("opc_request_id", missing)
        }
        header_params = {k: v for (k, v) in six.iteritems(header_params) if v is not missing and v is not None}

        retry_strategy = self.retry_strategy
        if kwargs.get('retry_strategy'):
            retry_strategy = kwargs.get('retry_strategy')

        if retry_strategy:
            return retry_strategy.make_retrying_call(
                self.base_client.call_api,
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                query_params=query_params,
                header_params=header_params,
                response_type="SessionChatHistoryCollection")
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                query_params=query_params,
                header_params=header_params,
                response_type="SessionChatHistoryCollection")

    def list_agent_sessions(self, ai_data_platform_id, workspace_key, agent_key, **kwargs):
        """
        Returns a list of testing sessions of an agent.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str agent_key: (required)
            The UUID of the agent.

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

        :param str display_name_contains: (optional)
            A filter to return only resources that have a display name containing the text provided.

        :param datetime time_created_greater_than_or_equal_to: (optional)
            Fetch objects from repository that were created after or at the exact timestamp provided in parameter

        :param datetime time_created_less_than_or_equal_to: (optional)
            Fetch objects from repository that were created before or at the exact timestamp provided in parameter.

        :param str sort_by: (optional)
            The field to sort by. You can provide only one sort order. Default order for `timeCreated` is descending. Default order for `displayName` is ascending.

            Allowed values are: "timeCreated", "displayName"

        :param str opc_request_id: (optional)
            Unique Oracle-assigned identifier for the request. If you need to contact
            Oracle about a particular request, please provide the request ID.
            The only valid characters for request IDs are letters, numbers,
            underscore, and dash.

        :param obj retry_strategy: (optional)
            A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level.

            This should be one of the strategies available in the :py:mod:`~oci.retry` module. A convenience :py:data:`~oci.retry.DEFAULT_RETRY_STRATEGY`
            is also available. The specifics of the default retry strategy are described `here <https://oracle-cloud-infrastructure-python-sdk.readthedocs.io/en/latest/sdk_behaviors/retries.html>`__.

            To have this operation explicitly not perform any retries, pass an instance of :py:class:`~oci.retry.NoneRetryStrategy`.

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.AgentSessionCollection`
        :rtype: :class:`~oci.response.Response`
        """
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/agents/{agentKey}/sessions"
        method = "GET"

        # Don't accept unknown kwargs
        expected_kwargs = [
            "retry_strategy",
            "limit",
            "page",
            "sort_order",
            "display_name_contains",
            "time_created_greater_than_or_equal_to",
            "time_created_less_than_or_equal_to",
            "sort_by",
            "opc_request_id"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                "list_agent_sessions got unknown kwargs: {!r}".format(extra_kwargs))

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "agentKey": agent_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError('Parameter {} cannot be None, whitespace or empty string'.format(k))

        if 'sort_order' in kwargs:
            sort_order_allowed_values = ["ASC", "DESC"]
            if kwargs['sort_order'] not in sort_order_allowed_values:
                raise ValueError(
                    "Invalid value for `sort_order`, must be one of {0}".format(sort_order_allowed_values)
                )

        if 'sort_by' in kwargs:
            sort_by_allowed_values = ["timeCreated", "displayName"]
            if kwargs['sort_by'] not in sort_by_allowed_values:
                raise ValueError(
                    "Invalid value for `sort_by`, must be one of {0}".format(sort_by_allowed_values)
                )

        query_params = {
            "limit": kwargs.get("limit", missing),
            "page": kwargs.get("page", missing),
            "sortOrder": kwargs.get("sort_order", missing),
            "displayNameContains": kwargs.get("display_name_contains", missing),
            "timeCreatedGreaterThanOrEqualTo": kwargs.get("time_created_greater_than_or_equal_to", missing),
            "timeCreatedLessThanOrEqualTo": kwargs.get("time_created_less_than_or_equal_to", missing),
            "sortBy": kwargs.get("sort_by", missing)
        }
        query_params = {k: v for (k, v) in six.iteritems(query_params) if v is not missing and v is not None}

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "opc-request-id": kwargs.get("opc_request_id", missing)
        }
        header_params = {k: v for (k, v) in six.iteritems(header_params) if v is not missing and v is not None}

        retry_strategy = self.retry_strategy
        if kwargs.get('retry_strategy'):
            retry_strategy = kwargs.get('retry_strategy')

        if retry_strategy:
            return retry_strategy.make_retrying_call(
                self.base_client.call_api,
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                query_params=query_params,
                header_params=header_params,
                response_type="AgentSessionCollection")
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                query_params=query_params,
                header_params=header_params,
                response_type="AgentSessionCollection")

    def list_agents(self, ai_data_platform_id, workspace_key, **kwargs):
        """
        Returns a list of agents in a schema.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str compute_key: (optional)
            Compute key.

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

            Allowed values are: "timeCreated", "displayName"

        :param str opc_request_id: (optional)
            Unique Oracle-assigned identifier for the request. If you need to contact
            Oracle about a particular request, please provide the request ID.
            The only valid characters for request IDs are letters, numbers,
            underscore, and dash.

        :param obj retry_strategy: (optional)
            A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level.

            This should be one of the strategies available in the :py:mod:`~oci.retry` module. A convenience :py:data:`~oci.retry.DEFAULT_RETRY_STRATEGY`
            is also available. The specifics of the default retry strategy are described `here <https://oracle-cloud-infrastructure-python-sdk.readthedocs.io/en/latest/sdk_behaviors/retries.html>`__.

            To have this operation explicitly not perform any retries, pass an instance of :py:class:`~oci.retry.NoneRetryStrategy`.

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.AgentCollection`
        :rtype: :class:`~oci.response.Response`
        """
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/agents"
        method = "GET"

        # Don't accept unknown kwargs
        expected_kwargs = [
            "retry_strategy",
            "compute_key",
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
                "list_agents got unknown kwargs: {!r}".format(extra_kwargs))

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError('Parameter {} cannot be None, whitespace or empty string'.format(k))

        if 'sort_order' in kwargs:
            sort_order_allowed_values = ["ASC", "DESC"]
            if kwargs['sort_order'] not in sort_order_allowed_values:
                raise ValueError(
                    "Invalid value for `sort_order`, must be one of {0}".format(sort_order_allowed_values)
                )

        if 'sort_by' in kwargs:
            sort_by_allowed_values = ["timeCreated", "displayName"]
            if kwargs['sort_by'] not in sort_by_allowed_values:
                raise ValueError(
                    "Invalid value for `sort_by`, must be one of {0}".format(sort_by_allowed_values)
                )

        query_params = {
            "computeKey": kwargs.get("compute_key", missing),
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

        retry_strategy = self.retry_strategy
        if kwargs.get('retry_strategy'):
            retry_strategy = kwargs.get('retry_strategy')

        if retry_strategy:
            return retry_strategy.make_retrying_call(
                self.base_client.call_api,
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                query_params=query_params,
                header_params=header_params,
                response_type="AgentCollection")
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                query_params=query_params,
                header_params=header_params,
                response_type="AgentCollection")

    def manage_agent_permission(self, ai_data_platform_id, workspace_key, agent_key, manage_agent_permission_details, **kwargs):
        """
        Update the permissions for a given agent.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str agent_key: (required)
            The UUID of the agent.

        :param oci.aidataplatform_dp.models.ManageAgentPermissionDetails manage_agent_permission_details: (required)
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

            This should be one of the strategies available in the :py:mod:`~oci.retry` module. A convenience :py:data:`~oci.retry.DEFAULT_RETRY_STRATEGY`
            is also available. The specifics of the default retry strategy are described `here <https://oracle-cloud-infrastructure-python-sdk.readthedocs.io/en/latest/sdk_behaviors/retries.html>`__.

            To have this operation explicitly not perform any retries, pass an instance of :py:class:`~oci.retry.NoneRetryStrategy`.

        :return: A :class:`~oci.response.Response` object with data of type None
        :rtype: :class:`~oci.response.Response`
        """
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/agents/{agentKey}/actions/managePermission"
        method = "POST"

        # Don't accept unknown kwargs
        expected_kwargs = [
            "retry_strategy",
            "if_match",
            "opc_request_id",
            "should_update_recent"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                "manage_agent_permission got unknown kwargs: {!r}".format(extra_kwargs))

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "agentKey": agent_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError('Parameter {} cannot be None, whitespace or empty string'.format(k))

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "if-match": kwargs.get("if_match", missing),
            "opc-request-id": kwargs.get("opc_request_id", missing),
            "should-update-recent": kwargs.get("should_update_recent", missing)
        }
        header_params = {k: v for (k, v) in six.iteritems(header_params) if v is not missing and v is not None}

        retry_strategy = self.retry_strategy
        if kwargs.get('retry_strategy'):
            retry_strategy = kwargs.get('retry_strategy')

        if retry_strategy:
            return retry_strategy.make_retrying_call(
                self.base_client.call_api,
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=manage_agent_permission_details)
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=manage_agent_permission_details)

    def preview_agent_agent_card(self, ai_data_platform_id, workspace_key, preview_agent_card_details, **kwargs):
        """
        Returns the agent card based on the given agent card configuration.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param oci.aidataplatform_dp.models.PreviewAgentCardDetails preview_agent_card_details: (required)
            Request details for previewing an agent card.

        :param str opc_retry_token: (optional)
            A token that uniquely identifies a request so it can be retried in case of a timeout or
            server error without risk of running that same action again. Retry tokens expire after 24
            hours, but can be invalidated before then due to conflicting operations. For example, if a resource
            has been deleted and removed from the system, then a retry of the original creation request
            might be rejected.

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

            This should be one of the strategies available in the :py:mod:`~oci.retry` module. A convenience :py:data:`~oci.retry.DEFAULT_RETRY_STRATEGY`
            is also available. The specifics of the default retry strategy are described `here <https://oracle-cloud-infrastructure-python-sdk.readthedocs.io/en/latest/sdk_behaviors/retries.html>`__.

            To have this operation explicitly not perform any retries, pass an instance of :py:class:`~oci.retry.NoneRetryStrategy`.

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.AgentCardPreviewResponse`
        :rtype: :class:`~oci.response.Response`
        """
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/agents/actions/previewAgentCard"
        method = "POST"

        # Don't accept unknown kwargs
        expected_kwargs = [
            "retry_strategy",
            "opc_retry_token",
            "if_match",
            "opc_request_id",
            "should_update_recent"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                "preview_agent_agent_card got unknown kwargs: {!r}".format(extra_kwargs))

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError('Parameter {} cannot be None, whitespace or empty string'.format(k))

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "opc-retry-token": kwargs.get("opc_retry_token", missing),
            "if-match": kwargs.get("if_match", missing),
            "opc-request-id": kwargs.get("opc_request_id", missing),
            "should-update-recent": kwargs.get("should_update_recent", missing)
        }
        header_params = {k: v for (k, v) in six.iteritems(header_params) if v is not missing and v is not None}

        retry_strategy = self.retry_strategy
        if kwargs.get('retry_strategy'):
            retry_strategy = kwargs.get('retry_strategy')

        if retry_strategy:
            if not isinstance(retry_strategy, retry.NoneRetryStrategy):
                self.base_client.add_opc_retry_token_if_needed(header_params)
            return retry_strategy.make_retrying_call(
                self.base_client.call_api,
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=preview_agent_card_details,
                response_type="AgentCardPreviewResponse")
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=preview_agent_card_details,
                response_type="AgentCardPreviewResponse")

    def redeploy_agent_by_key(self, ai_data_platform_id, workspace_key, agent_key, update_agent_deployment_details, **kwargs):
        """
        Redeploys an agent.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str agent_key: (required)
            The UUID of the agent.

        :param oci.aidataplatform_dp.models.UpdateAgentDeploymentDetails update_agent_deployment_details: (required)
            Details for updating an agent deployment asynchronously.

        :param str if_match: (optional)
            For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
            `if-match` parameter to the value of the etag from a previous GET or POST response for
            that resource. The resource will be updated or deleted only if the etag you provide
            matches the resource's current etag value.

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

            This should be one of the strategies available in the :py:mod:`~oci.retry` module. A convenience :py:data:`~oci.retry.DEFAULT_RETRY_STRATEGY`
            is also available. The specifics of the default retry strategy are described `here <https://oracle-cloud-infrastructure-python-sdk.readthedocs.io/en/latest/sdk_behaviors/retries.html>`__.

            To have this operation explicitly not perform any retries, pass an instance of :py:class:`~oci.retry.NoneRetryStrategy`.

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.AgentDeployment`
        :rtype: :class:`~oci.response.Response`
        """
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/agents/{agentKey}/deployments/actions/redeploy"
        method = "POST"

        # Don't accept unknown kwargs
        expected_kwargs = [
            "retry_strategy",
            "if_match",
            "opc_retry_token",
            "opc_request_id"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                "redeploy_agent_by_key got unknown kwargs: {!r}".format(extra_kwargs))

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "agentKey": agent_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError('Parameter {} cannot be None, whitespace or empty string'.format(k))

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "if-match": kwargs.get("if_match", missing),
            "opc-retry-token": kwargs.get("opc_retry_token", missing),
            "opc-request-id": kwargs.get("opc_request_id", missing)
        }
        header_params = {k: v for (k, v) in six.iteritems(header_params) if v is not missing and v is not None}

        retry_strategy = self.retry_strategy
        if kwargs.get('retry_strategy'):
            retry_strategy = kwargs.get('retry_strategy')

        if retry_strategy:
            if not isinstance(retry_strategy, retry.NoneRetryStrategy):
                self.base_client.add_opc_retry_token_if_needed(header_params)
            return retry_strategy.make_retrying_call(
                self.base_client.call_api,
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=update_agent_deployment_details,
                response_type="AgentDeployment")
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=update_agent_deployment_details,
                response_type="AgentDeployment")

    def update_agent(self, ai_data_platform_id, workspace_key, agent_key, update_agent_details, **kwargs):
        """
        Updates an agent with provided details.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str agent_key: (required)
            The UUID of the agent.

        :param oci.aidataplatform_dp.models.UpdateAgentDetails update_agent_details: (required)
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

            This should be one of the strategies available in the :py:mod:`~oci.retry` module. A convenience :py:data:`~oci.retry.DEFAULT_RETRY_STRATEGY`
            is also available. The specifics of the default retry strategy are described `here <https://oracle-cloud-infrastructure-python-sdk.readthedocs.io/en/latest/sdk_behaviors/retries.html>`__.

            To have this operation explicitly not perform any retries, pass an instance of :py:class:`~oci.retry.NoneRetryStrategy`.

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.Agent`
        :rtype: :class:`~oci.response.Response`
        """
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/agents/{agentKey}"
        method = "PUT"

        # Don't accept unknown kwargs
        expected_kwargs = [
            "retry_strategy",
            "should_update_recent",
            "if_match",
            "opc_request_id"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                "update_agent got unknown kwargs: {!r}".format(extra_kwargs))

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "agentKey": agent_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError('Parameter {} cannot be None, whitespace or empty string'.format(k))

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "should-update-recent": kwargs.get("should_update_recent", missing),
            "if-match": kwargs.get("if_match", missing),
            "opc-request-id": kwargs.get("opc_request_id", missing)
        }
        header_params = {k: v for (k, v) in six.iteritems(header_params) if v is not missing and v is not None}

        retry_strategy = self.retry_strategy
        if kwargs.get('retry_strategy'):
            retry_strategy = kwargs.get('retry_strategy')

        if retry_strategy:
            return retry_strategy.make_retrying_call(
                self.base_client.call_api,
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=update_agent_details,
                response_type="Agent")
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=update_agent_details,
                response_type="Agent")

    def update_agent_deployment_metadata(self, ai_data_platform_id, workspace_key, agent_key, update_agent_deployment_metadata_details, **kwargs):
        """
        Updates the deployment metadata for an agent.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str agent_key: (required)
            The UUID of the agent.

        :param oci.aidataplatform_dp.models.UpdateAgentDeploymentMetadataDetails update_agent_deployment_metadata_details: (required)
            Agent card details to update.

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

        :param str if_match: (optional)
            For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
            `if-match` parameter to the value of the etag from a previous GET or POST response for
            that resource. The resource will be updated or deleted only if the etag you provide
            matches the resource's current etag value.

        :param obj retry_strategy: (optional)
            A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level.

            This should be one of the strategies available in the :py:mod:`~oci.retry` module. A convenience :py:data:`~oci.retry.DEFAULT_RETRY_STRATEGY`
            is also available. The specifics of the default retry strategy are described `here <https://oracle-cloud-infrastructure-python-sdk.readthedocs.io/en/latest/sdk_behaviors/retries.html>`__.

            To have this operation explicitly not perform any retries, pass an instance of :py:class:`~oci.retry.NoneRetryStrategy`.

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.AgentDeployment`
        :rtype: :class:`~oci.response.Response`
        """
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/agents/{agentKey}/actions/updateDeploymentMetadata"
        method = "PUT"

        # Don't accept unknown kwargs
        expected_kwargs = [
            "retry_strategy",
            "should_update_recent",
            "opc_retry_token",
            "opc_request_id",
            "if_match"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                "update_agent_deployment_metadata got unknown kwargs: {!r}".format(extra_kwargs))

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "agentKey": agent_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError('Parameter {} cannot be None, whitespace or empty string'.format(k))

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "should-update-recent": kwargs.get("should_update_recent", missing),
            "opc-retry-token": kwargs.get("opc_retry_token", missing),
            "opc-request-id": kwargs.get("opc_request_id", missing),
            "if-match": kwargs.get("if_match", missing)
        }
        header_params = {k: v for (k, v) in six.iteritems(header_params) if v is not missing and v is not None}

        retry_strategy = self.retry_strategy
        if kwargs.get('retry_strategy'):
            retry_strategy = kwargs.get('retry_strategy')

        if retry_strategy:
            if not isinstance(retry_strategy, retry.NoneRetryStrategy):
                self.base_client.add_opc_retry_token_if_needed(header_params)
            return retry_strategy.make_retrying_call(
                self.base_client.call_api,
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=update_agent_deployment_metadata_details,
                response_type="AgentDeployment")
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=update_agent_deployment_metadata_details,
                response_type="AgentDeployment")

    def validate_agent(self, ai_data_platform_id, workspace_key, agent_key, **kwargs):
        """
        Validates the agent JSON diagram generated by UI.


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param str agent_key: (required)
            The UUID of the agent.

        :param str opc_request_id: (optional)
            Unique Oracle-assigned identifier for the request. If you need to contact
            Oracle about a particular request, please provide the request ID.
            The only valid characters for request IDs are letters, numbers,
            underscore, and dash.

        :param bool should_update_recent: (optional)
            A flag to identify if the recent list should be updated.

        :param obj retry_strategy: (optional)
            A retry strategy to apply to this specific operation/call. This will override any retry strategy set at the client-level.

            This should be one of the strategies available in the :py:mod:`~oci.retry` module. A convenience :py:data:`~oci.retry.DEFAULT_RETRY_STRATEGY`
            is also available. The specifics of the default retry strategy are described `here <https://oracle-cloud-infrastructure-python-sdk.readthedocs.io/en/latest/sdk_behaviors/retries.html>`__.

            To have this operation explicitly not perform any retries, pass an instance of :py:class:`~oci.retry.NoneRetryStrategy`.

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.ValidateAgentResponse`
        :rtype: :class:`~oci.response.Response`
        """
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/agents/{agentKey}/actions/validate"
        method = "POST"

        # Don't accept unknown kwargs
        expected_kwargs = [
            "retry_strategy",
            "opc_request_id",
            "should_update_recent"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                "validate_agent got unknown kwargs: {!r}".format(extra_kwargs))

        path_params = {
            "aiDataPlatformId": ai_data_platform_id,
            "workspaceKey": workspace_key,
            "agentKey": agent_key
        }

        path_params = {k: v for (k, v) in six.iteritems(path_params) if v is not missing}

        for (k, v) in six.iteritems(path_params):
            if v is None or (isinstance(v, six.string_types) and len(v.strip()) == 0):
                raise ValueError('Parameter {} cannot be None, whitespace or empty string'.format(k))

        header_params = {
            "accept": "application/json",
            "content-type": "application/json",
            "opc-request-id": kwargs.get("opc_request_id", missing),
            "should-update-recent": kwargs.get("should_update_recent", missing)
        }
        header_params = {k: v for (k, v) in six.iteritems(header_params) if v is not missing and v is not None}

        retry_strategy = self.retry_strategy
        if kwargs.get('retry_strategy'):
            retry_strategy = kwargs.get('retry_strategy')

        if retry_strategy:
            return retry_strategy.make_retrying_call(
                self.base_client.call_api,
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                response_type="ValidateAgentResponse")
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                response_type="ValidateAgentResponse")
