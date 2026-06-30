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


class BundleClient(object):
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
        self.base_client = BaseClient("bundle", config, signer, aidataplatform_dp_type_mapping, **base_client_init_kwargs)
        self.retry_strategy = kwargs.get('retry_strategy', retry.DEFAULT_RETRY_STRATEGY)

    def create_bundle(self, ai_data_platform_id, workspace_key, create_bundle_details, **kwargs):
        """
        (Preview) Creates a new bundle.

        A bundle is a self-contained, portable representation of selected workspace assets, such as jobs
        and agent flows, along with their dependencies and associated code artifacts. It captures both
        the resource configurations and the supporting assets required to recreate those resources in
        another workspace or environment.

        The bundle manifest is named `aidp_workbench.yaml`. The bundle preserves the workspace folder
        structure for code artifacts from the location where it was created, so the generated bundle
        mirrors the source layout.

        Dependencies are tracked inside the bundle under each asset type:
          - job and agent flow dependencies are added under the `dependencies` folder inside the
        `jobs` and `agentflows` folders
        - code dependencies are added under the `artifacts` directory in the bundle

        Dependency references use template variables, for example:
          - compute: `$${jobs.dependencies.training_compute.compute.key}`
          - nested jobs: `$${jobs.dependencies.training_job.job.key}`
          - aicompute: `$${jobs.dependencies.training_aicompute.aicompute.key}`

        Bundles also support the special variable `$${bundle.root}`, which points to the root of the
        bundle folder and is used for referencing artifacts.

        Variables and overrides:
          - bundles support parameterization using variables defined in the bundle manifest
            (`aidp_workbench.yaml`)

          Example manifest defaults:
            defaults:
              variables:
                job_compute_key: \"$${jobs.dependencies.small.compute.key}\"

            - variables can be referenced in resource descriptors using the `$${var.<name>}` syntax

          Example usage in a job descriptor:
            \"clusterKey\": \"$${var.job_compute_key}\"

            - workspace-specific overrides can be provided via `.aidp/overrides.yaml` inside the bundle
            - this file is intended for environment-specific configuration and should not be committed to Git,
              allowing the bundle to remain portable and environment-agnostic

          Example overrides file:
            variables:
              job_compute_key: f6e7f5d8-d965-4009-95d9-02e993d9a16b

            - when an override is provided, the referenced dependency (for example, compute) is not created,
              and the provided value is used instead
            - when no override is provided, the system falls back to the default variable value, which may
              reference a dependency included in the bundle (resulting in that dependency being created)
            - this mechanism enables environment-specific customization (for example, reusing existing
              infrastructure in production while creating new resources in development)
            - the same pattern can be used for other environment-specific parameters such as compute shape,
              number of OCPUs, or other configuration values

        Git integration and promotion:
          - bundles can only be created inside Git-backed workspace folders
          - bundles are self-contained packages that include resource definitions, dependency references,
            and associated code artifacts required to recreate the bundled resources
          - the entire bundle folder can be committed and pushed to a Git repository
          - bundles can be pulled into another workspace via Git and deployed there
          - bundles can be promoted across environments (for example, dev \u2192 test \u2192 prod) using Git workflows
          - because the bundle includes both resource configuration and code dependencies, it can be used
            to reliably replicate assets across workspaces

        This operation is asynchronous. The service validates the request, starts bundle
        creation, and returns an async operation key in the response headers. Use the async
        operation APIs to track completion.

        Typical use cases:
        - capture selected workspace resources into a version-controlled bundle
        - prepare a bundle for later deployment or promotion
        - establish a bundle root that can later be inspected, updated, or deployed

        Request notes:
        - `path` identifies the parent folder in the workspace volume where the bundle should be created
        - `name` identifies the bundle folder name
        - `bundledResources` identifies which workspace resources should be included


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param oci.aidataplatform_dp.models.CreateBundleDetails create_bundle_details: (required)
            Request payload for bundle creation.

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

        :return: A :class:`~oci.response.Response` object with data of type None
        :rtype: :class:`~oci.response.Response`
        """
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/bundles"
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
                "create_bundle got unknown kwargs: {!r}".format(extra_kwargs))

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
                body=create_bundle_details)
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=create_bundle_details)

    def create_bundle_action(self, ai_data_platform_id, workspace_key, create_bundle_details, **kwargs):
        """
        (Preview) Creates a new bundle.

        A bundle is a self-contained, portable representation of selected workspace assets, such as jobs
        and agent flows, along with their dependencies and associated code artifacts. It captures both
        the resource configurations and the supporting assets required to recreate those resources in
        another workspace or environment.

        The bundle manifest is named `aidp_workbench.yaml`. The bundle preserves the workspace folder
        structure for code artifacts from the location where it was created, so the generated bundle
        mirrors the source layout.

        Dependencies are tracked inside the bundle under each asset type:
          - job and agent flow dependencies are added under the `dependencies` folder inside the
        `jobs` and `agentflows` folders
        - code dependencies are added under the `artifacts` directory in the bundle

        Dependency references use template variables, for example:
          - compute: `$${jobs.dependencies.training_compute.compute.key}`
          - nested jobs: `$${jobs.dependencies.training_job.job.key}`
          - aicompute: `$${jobs.dependencies.training_aicompute.aicompute.key}`

        Bundles also support the special variable `$${bundle.root}`, which points to the root of the
        bundle folder and is used for referencing artifacts.

        Variables and overrides:
          - bundles support parameterization using variables defined in the bundle manifest
            (`aidp_workbench.yaml`)

          Example manifest defaults:
            defaults:
              variables:
                job_compute_key: \"$${jobs.dependencies.small.compute.key}\"

            - variables can be referenced in resource descriptors using the `$${var.<name>}` syntax

          Example usage in a job descriptor:
            \"clusterKey\": \"$${var.job_compute_key}\"

            - workspace-specific overrides can be provided via `.aidp/overrides.yaml` inside the bundle
            - this file is intended for environment-specific configuration and should not be committed to Git,
              allowing the bundle to remain portable and environment-agnostic

          Example overrides file:
            variables:
              job_compute_key: f6e7f5d8-d965-4009-95d9-02e993d9a16b

            - when an override is provided, the referenced dependency (for example, compute) is not created,
              and the provided value is used instead
            - when no override is provided, the system falls back to the default variable value, which may
              reference a dependency included in the bundle (resulting in that dependency being created)
            - this mechanism enables environment-specific customization (for example, reusing existing
              infrastructure in production while creating new resources in development)
            - the same pattern can be used for other environment-specific parameters such as compute shape,
              number of OCPUs, or other configuration values

        Git integration and promotion:
          - bundles can only be created inside Git-backed workspace folders
          - bundles are self-contained packages that include resource definitions, dependency references,
            and associated code artifacts required to recreate the bundled resources
          - the entire bundle folder can be committed and pushed to a Git repository
          - bundles can be pulled into another workspace via Git and deployed there
          - bundles can be promoted across environments (for example, dev \u2192 test \u2192 prod) using Git workflows
          - because the bundle includes both resource configuration and code dependencies, it can be used
            to reliably replicate assets across workspaces

        This operation is asynchronous. The service validates the request, starts bundle
        creation, and returns an async operation key in the response headers. Use the async
        operation APIs to track completion.

        Typical use cases:
        - capture selected workspace resources into a version-controlled bundle
        - prepare a bundle for later deployment or promotion
        - establish a bundle root that can later be inspected, updated, or deployed

        Request notes:
        - `path` identifies the parent folder in the workspace volume where the bundle should be created
        - `name` identifies the bundle folder name
        - `bundledResources` identifies which workspace resources should be included


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param oci.aidataplatform_dp.models.CreateBundleDetails create_bundle_details: (required)
            Request payload for bundle creation.

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

        :return: A :class:`~oci.response.Response` object with data of type None
        :rtype: :class:`~oci.response.Response`
        """
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/actions/createBundle"
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
                "create_bundle_action got unknown kwargs: {!r}".format(extra_kwargs))

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
                body=create_bundle_details)
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=create_bundle_details)

    def deploy_bundle(self, ai_data_platform_id, workspace_key, deploy_bundle_details, **kwargs):
        """
        (Preview) Deploys the specified bundle, creating or updating jobs and agent flows according to the bundle manifest.
        Returns an async job key for tracking deployment progress.

        This operation is asynchronous. The request is accepted for background execution and
        returns an async operation key in the response headers.

        Deployment typically uses:
        - the bundle manifest at the bundle root
        - top-level resource descriptors in the bundle
        - dependency descriptors referenced by those top-level resources
        - default or override variable values when present

        Use this operation when you want to apply the bundle contents into the target
        workspace state.

        Request notes:
        - `path` identifies the bundle root folder in the workspace volume


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param oci.aidataplatform_dp.models.DeployBundleDetails deploy_bundle_details: (required)
            Request payload for bundle deploy.

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

        :return: A :class:`~oci.response.Response` object with data of type None
        :rtype: :class:`~oci.response.Response`
        """
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/bundles/actions/deploy"
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
                "deploy_bundle got unknown kwargs: {!r}".format(extra_kwargs))

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
                body=deploy_bundle_details)
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=deploy_bundle_details)

    def deploy_bundle_action(self, ai_data_platform_id, workspace_key, deploy_bundle_details, **kwargs):
        """
        (Preview) Deploys the specified bundle, creating or updating jobs and agent flows according to the bundle manifest.
        Returns an async job key for tracking deployment progress.

        This operation is asynchronous. The request is accepted for background execution and
        returns an async operation key in the response headers.

        Deployment typically uses:
        - the bundle manifest at the bundle root
        - top-level resource descriptors in the bundle
        - dependency descriptors referenced by those top-level resources
        - default or override variable values when present

        Use this operation when you want to apply the bundle contents into the target
        workspace state.

        Request notes:
        - `path` identifies the bundle root folder in the workspace volume


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param oci.aidataplatform_dp.models.DeployBundleDetails deploy_bundle_details: (required)
            Request payload for bundle deploy.

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

        :return: A :class:`~oci.response.Response` object with data of type None
        :rtype: :class:`~oci.response.Response`
        """
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/actions/deployBundle"
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
                "deploy_bundle_action got unknown kwargs: {!r}".format(extra_kwargs))

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
                body=deploy_bundle_details)
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=deploy_bundle_details)

    def fetch_bundle_deployment_status(self, ai_data_platform_id, workspace_key, fetch_bundle_deployment_status_details, **kwargs):
        """
        (Preview) Returns a high-level summary of the most recent deployment activity recorded for the
        specified bundle.

        This operation is useful after deploy or purge requests when you want the latest
        bundle-level deployment outcome rather than raw async operation details.

        The response can include:
        - overall deployment status
        - start and completion timestamps
        - summary message
        - resources associated with the last recorded deployment result

        Typical status values include:
        - `IN_PROGRESS`
        - `SUCCEEDED`
        - `FAILED`
        - `NOT_DEPLOYED`

        Request notes:
        - `path` identifies the bundle root folder in the workspace volume


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param oci.aidataplatform_dp.models.FetchBundleDeploymentStatusDetails fetch_bundle_deployment_status_details: (required)
            Request payload for FetchBundleDeploymentStatusDetails.

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

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.BundleDeploymentStatus`
        :rtype: :class:`~oci.response.Response`
        """
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/bundles/actions/getDeploymentStatus"
        method = "POST"

        # Don't accept unknown kwargs
        expected_kwargs = [
            "retry_strategy",
            "opc_request_id"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                "fetch_bundle_deployment_status got unknown kwargs: {!r}".format(extra_kwargs))

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
                body=fetch_bundle_deployment_status_details,
                response_type="BundleDeploymentStatus")
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=fetch_bundle_deployment_status_details,
                response_type="BundleDeploymentStatus")

    def fetch_bundle_deployment_status_action(self, ai_data_platform_id, workspace_key, fetch_bundle_deployment_status_details, **kwargs):
        """
        (Preview) Returns a high-level summary of the most recent deployment activity recorded for the
        specified bundle.

        This operation is useful after deploy or purge requests when you want the latest
        bundle-level deployment outcome rather than raw async operation details.

        The response can include:
        - overall deployment status
        - start and completion timestamps
        - summary message
        - resources associated with the last recorded deployment result

        Typical status values include:
        - `IN_PROGRESS`
        - `SUCCEEDED`
        - `FAILED`
        - `NOT_DEPLOYED`

        Request notes:
        - `path` identifies the bundle root folder in the workspace volume


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param oci.aidataplatform_dp.models.FetchBundleDeploymentStatusDetails fetch_bundle_deployment_status_details: (required)
            Request payload for FetchBundleDeploymentStatusDetails.

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

        :return: A :class:`~oci.response.Response` object with data of type :class:`~oci.aidataplatform_dp.models.BundleDeploymentStatus`
        :rtype: :class:`~oci.response.Response`
        """
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/actions/getBundleDeploymentStatus"
        method = "POST"

        # Don't accept unknown kwargs
        expected_kwargs = [
            "retry_strategy",
            "opc_request_id"
        ]
        extra_kwargs = [_key for _key in six.iterkeys(kwargs) if _key not in expected_kwargs]
        if extra_kwargs:
            raise ValueError(
                "fetch_bundle_deployment_status_action got unknown kwargs: {!r}".format(extra_kwargs))

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
                body=fetch_bundle_deployment_status_details,
                response_type="BundleDeploymentStatus")
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=fetch_bundle_deployment_status_details,
                response_type="BundleDeploymentStatus")

    def purge_bundle(self, ai_data_platform_id, workspace_key, purge_bundle_details, **kwargs):
        """
        (Preview) Tears down all resources deployed by the specified bundle in the workspace.

        This operation is intended to tear down resources that were created or managed through
        bundle deployment. It does not delete the bundle files themselves from the workspace
        volume.

        This operation is asynchronous. The service accepts the purge request, starts the
        background teardown workflow, and returns async operation headers.

        Typical use cases:
        - remove resources that were previously deployed from a bundle
        - clean up a workspace before re-deploying or retiring a bundle

        Request notes:
        - `path` identifies the bundle root folder in the workspace volume


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param oci.aidataplatform_dp.models.PurgeBundleDetails purge_bundle_details: (required)
            Request payload for bundle purge.

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

        :return: A :class:`~oci.response.Response` object with data of type None
        :rtype: :class:`~oci.response.Response`
        """
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/bundles/actions/purge"
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
                "purge_bundle got unknown kwargs: {!r}".format(extra_kwargs))

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
                body=purge_bundle_details)
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=purge_bundle_details)

    def purge_bundle_action(self, ai_data_platform_id, workspace_key, purge_bundle_details, **kwargs):
        """
        (Preview) Tears down all resources deployed by the specified bundle in the workspace.

        This operation is intended to tear down resources that were created or managed through
        bundle deployment. It does not delete the bundle files themselves from the workspace
        volume.

        This operation is asynchronous. The service accepts the purge request, starts the
        background teardown workflow, and returns async operation headers.

        Typical use cases:
        - remove resources that were previously deployed from a bundle
        - clean up a workspace before re-deploying or retiring a bundle

        Request notes:
        - `path` identifies the bundle root folder in the workspace volume


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param oci.aidataplatform_dp.models.PurgeBundleDetails purge_bundle_details: (required)
            Request payload for bundle purge.

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

        :return: A :class:`~oci.response.Response` object with data of type None
        :rtype: :class:`~oci.response.Response`
        """
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/actions/purgeBundle"
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
                "purge_bundle_action got unknown kwargs: {!r}".format(extra_kwargs))

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
                body=purge_bundle_details)
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=purge_bundle_details)

    def sync_bundle(self, ai_data_platform_id, workspace_key, sync_bundle_details, **kwargs):
        """
        (Preview) Synchronizes the code, descriptors, and mapping in the bundle by reconciling the contents with the resource origins.
        Returns an async job key for tracking sync progress.

        This operation is intended for cases where the bundle should be refreshed to reflect
        newer source changes while preserving the bundle structure and identity.

        Sync uses the bundle's recorded origin metadata to rebuild the bundle from the source
        jobs and agent flows that were captured when the bundle was created. The source metadata
        is stored in `.aidp/resource_origins.yaml` and must match the requested AIDP/Data Lake and
        workspace. The operation refreshes source-controlled bundle content while preserving the
        bundle identity and runtime metadata.

        During sync, the service stages a refreshed bundle snapshot under the bundle `.aidp`
        directory, compares existing and staged descriptors, preserves existing variable aliases
        and override references where possible, merges existing manifest default variables, and
        then promotes the refreshed source-controlled files back into the bundle root.

        Sync preserves environment-specific and deployment runtime files such as
        `.aidp/overrides.yaml` and `.aidp/aidp.state.json`. These files are not replaced by the
        refreshed source snapshot.

        This operation is asynchronous and returns async operation headers when accepted.

        Typical use cases:
        - refresh bundle contents after upstream workspace resources have changed
        - reconcile descriptor or artifact content with current resource origins
        - preserve local bundle overrides while pulling in source resource updates
        - keep a Git-backed bundle current before committing or promoting it

        Request notes:
        - `path` identifies the bundle root folder in the workspace volume
        - the bundle must contain a valid `aidp_workbench.yaml`
        - the bundle must contain `.aidp/resource_origins.yaml`
        - origin metadata must refer to the same AIDP/Data Lake and workspace as the request


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param oci.aidataplatform_dp.models.SyncBundleDetails sync_bundle_details: (required)
            Request payload for bundle sync.

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

        :return: A :class:`~oci.response.Response` object with data of type None
        :rtype: :class:`~oci.response.Response`
        """
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/bundles/actions/sync"
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
                "sync_bundle got unknown kwargs: {!r}".format(extra_kwargs))

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
                body=sync_bundle_details)
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=sync_bundle_details)

    def sync_bundle_action(self, ai_data_platform_id, workspace_key, sync_bundle_details, **kwargs):
        """
        (Preview) Synchronizes the code, descriptors, and mapping in the bundle by reconciling the contents with the resource origins.
        Returns an async job key for tracking sync progress.

        This operation is intended for cases where the bundle should be refreshed to reflect
        newer source changes while preserving the bundle structure and identity.

        Sync uses the bundle's recorded origin metadata to rebuild the bundle from the source
        jobs and agent flows that were captured when the bundle was created. The source metadata
        is stored in `.aidp/resource_origins.yaml` and must match the requested AIDP/Data Lake and
        workspace. The operation refreshes source-controlled bundle content while preserving the
        bundle identity and runtime metadata.

        During sync, the service stages a refreshed bundle snapshot under the bundle `.aidp`
        directory, compares existing and staged descriptors, preserves existing variable aliases
        and override references where possible, merges existing manifest default variables, and
        then promotes the refreshed source-controlled files back into the bundle root.

        Sync preserves environment-specific and deployment runtime files such as
        `.aidp/overrides.yaml` and `.aidp/aidp.state.json`. These files are not replaced by the
        refreshed source snapshot.

        This operation is asynchronous and returns async operation headers when accepted.

        Typical use cases:
        - refresh bundle contents after upstream workspace resources have changed
        - reconcile descriptor or artifact content with current resource origins
        - preserve local bundle overrides while pulling in source resource updates
        - keep a Git-backed bundle current before committing or promoting it

        Request notes:
        - `path` identifies the bundle root folder in the workspace volume
        - the bundle must contain a valid `aidp_workbench.yaml`
        - the bundle must contain `.aidp/resource_origins.yaml`
        - origin metadata must refer to the same AIDP/Data Lake and workspace as the request


        :param str ai_data_platform_id: (required)
            The `OCID`__ of the AI Data Platform (Data Lake) instance.

            __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm

        :param str workspace_key: (required)
            The key of the Workspace

        :param oci.aidataplatform_dp.models.SyncBundleDetails sync_bundle_details: (required)
            Request payload for bundle sync.

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

        :return: A :class:`~oci.response.Response` object with data of type None
        :rtype: :class:`~oci.response.Response`
        """
        resource_path = "/aiDataPlatforms/{aiDataPlatformId}/workspaces/{workspaceKey}/actions/syncBundle"
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
                "sync_bundle_action got unknown kwargs: {!r}".format(extra_kwargs))

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
                body=sync_bundle_details)
        else:
            return self.base_client.call_api(
                resource_path=resource_path,
                method=method,
                path_params=path_params,
                header_params=header_params,
                body=sync_bundle_details)
