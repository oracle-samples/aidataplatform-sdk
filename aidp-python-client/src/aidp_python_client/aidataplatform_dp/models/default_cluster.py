# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .cluster import Cluster
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DefaultCluster(Cluster):
    """
    The default cluster created by AI Data Platform Workbench.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new DefaultCluster object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.DefaultCluster.source_api` attribute
        of this class is ``DEFAULT_CLUSTER_API`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this DefaultCluster.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this DefaultCluster.
        :type display_name: str

        :param description:
            The value to assign to the description property of this DefaultCluster.
        :type description: str

        :param source_api:
            The value to assign to the source_api property of this DefaultCluster.
            Allowed values for this property are: "CLUSTER_API", "DEFAULT_CLUSTER_API", "AI_COMPUTE", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type source_api: str

        :param type:
            The value to assign to the type property of this DefaultCluster.
            Allowed values for this property are: "USER", "AI_COMPUTE", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type type: str

        :param time_created:
            The value to assign to the time_created property of this DefaultCluster.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this DefaultCluster.
        :type time_updated: datetime

        :param state:
            The value to assign to the state property of this DefaultCluster.
            Allowed values for this property are: "ACCEPTED", "CREATING", "ACTIVE", "DELETING", "DELETED", "FAILED", "STOPPING", "STOPPED", "UPDATING", "RESTARTING", "STARTING", "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS", "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL", "NETWORK_CONFIGURATION_ATTACH_FAILED", "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS", "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL", "NETWORK_CONFIGURATION_DETACH_FAILED", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type state: str

        :param state_details:
            The value to assign to the state_details property of this DefaultCluster.
        :type state_details: str

        :param node_type:
            The value to assign to the node_type property of this DefaultCluster.
        :type node_type: str

        :param driver_config:
            The value to assign to the driver_config property of this DefaultCluster.
        :type driver_config: oci.aidataplatform_dp.models.DriverConfig

        :param active_cluster_resources:
            The value to assign to the active_cluster_resources property of this DefaultCluster.
        :type active_cluster_resources: oci.aidataplatform_dp.models.ActiveClusterResources

        :param created_by:
            The value to assign to the created_by property of this DefaultCluster.
        :type created_by: str

        :param created_by_name:
            The value to assign to the created_by_name property of this DefaultCluster.
        :type created_by_name: str

        :param updated_by:
            The value to assign to the updated_by property of this DefaultCluster.
        :type updated_by: str

        :param updated_by_name:
            The value to assign to the updated_by_name property of this DefaultCluster.
        :type updated_by_name: str

        :param stopped_by:
            The value to assign to the stopped_by property of this DefaultCluster.
        :type stopped_by: str

        :param stopped_by_name:
            The value to assign to the stopped_by_name property of this DefaultCluster.
        :type stopped_by_name: str

        :param workspace_key:
            The value to assign to the workspace_key property of this DefaultCluster.
        :type workspace_key: str

        :param worker_config:
            The value to assign to the worker_config property of this DefaultCluster.
        :type worker_config: oci.aidataplatform_dp.models.WorkerConfig

        :param cluster_runtime_config:
            The value to assign to the cluster_runtime_config property of this DefaultCluster.
        :type cluster_runtime_config: oci.aidataplatform_dp.models.ClusterRuntimeConfig

        :param logging_config:
            The value to assign to the logging_config property of this DefaultCluster.
        :type logging_config: oci.aidataplatform_dp.models.LoggingConfig

        :param auto_termination_minutes:
            The value to assign to the auto_termination_minutes property of this DefaultCluster.
        :type auto_termination_minutes: int

        :param jdbc_endpoint_url:
            The value to assign to the jdbc_endpoint_url property of this DefaultCluster.
        :type jdbc_endpoint_url: str

        :param log_id:
            The value to assign to the log_id property of this DefaultCluster.
        :type log_id: str

        :param log_group_id:
            The value to assign to the log_group_id property of this DefaultCluster.
        :type log_group_id: str

        :param subscription:
            The value to assign to the subscription property of this DefaultCluster.
        :type subscription: oci.aidataplatform_dp.models.SubscriptionDetails

        """
        self.swagger_types = {
            'key': 'str',
            'display_name': 'str',
            'description': 'str',
            'source_api': 'str',
            'type': 'str',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'state': 'str',
            'state_details': 'str',
            'node_type': 'str',
            'driver_config': 'DriverConfig',
            'active_cluster_resources': 'ActiveClusterResources',
            'created_by': 'str',
            'created_by_name': 'str',
            'updated_by': 'str',
            'updated_by_name': 'str',
            'stopped_by': 'str',
            'stopped_by_name': 'str',
            'workspace_key': 'str',
            'worker_config': 'WorkerConfig',
            'cluster_runtime_config': 'ClusterRuntimeConfig',
            'logging_config': 'LoggingConfig',
            'auto_termination_minutes': 'int',
            'jdbc_endpoint_url': 'str',
            'log_id': 'str',
            'log_group_id': 'str',
            'subscription': 'SubscriptionDetails'
        }

        self.attribute_map = {
            'key': 'key',
            'display_name': 'displayName',
            'description': 'description',
            'source_api': 'sourceApi',
            'type': 'type',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'state': 'state',
            'state_details': 'stateDetails',
            'node_type': 'nodeType',
            'driver_config': 'driverConfig',
            'active_cluster_resources': 'activeClusterResources',
            'created_by': 'createdBy',
            'created_by_name': 'createdByName',
            'updated_by': 'updatedBy',
            'updated_by_name': 'updatedByName',
            'stopped_by': 'stoppedBy',
            'stopped_by_name': 'stoppedByName',
            'workspace_key': 'workspaceKey',
            'worker_config': 'workerConfig',
            'cluster_runtime_config': 'clusterRuntimeConfig',
            'logging_config': 'loggingConfig',
            'auto_termination_minutes': 'autoTerminationMinutes',
            'jdbc_endpoint_url': 'jdbcEndpointUrl',
            'log_id': 'logId',
            'log_group_id': 'logGroupId',
            'subscription': 'subscription'
        }

        self._key = None
        self._display_name = None
        self._description = None
        self._source_api = None
        self._type = None
        self._time_created = None
        self._time_updated = None
        self._state = None
        self._state_details = None
        self._node_type = None
        self._driver_config = None
        self._active_cluster_resources = None
        self._created_by = None
        self._created_by_name = None
        self._updated_by = None
        self._updated_by_name = None
        self._stopped_by = None
        self._stopped_by_name = None
        self._workspace_key = None
        self._worker_config = None
        self._cluster_runtime_config = None
        self._logging_config = None
        self._auto_termination_minutes = None
        self._jdbc_endpoint_url = None
        self._log_id = None
        self._log_group_id = None
        self._subscription = None
        self._source_api = 'DEFAULT_CLUSTER_API'

    @property
    def workspace_key(self):
        """
        Gets the workspace_key of this DefaultCluster.
        The key of the AI Data Platform Workbench workspace where the default cluster is.


        :return: The workspace_key of this DefaultCluster.
        :rtype: str
        """
        return self._workspace_key

    @workspace_key.setter
    def workspace_key(self, workspace_key):
        """
        Sets the workspace_key of this DefaultCluster.
        The key of the AI Data Platform Workbench workspace where the default cluster is.


        :param workspace_key: The workspace_key of this DefaultCluster.
        :type: str
        """
        self._workspace_key = workspace_key

    @property
    def worker_config(self):
        """
        Gets the worker_config of this DefaultCluster.

        :return: The worker_config of this DefaultCluster.
        :rtype: oci.aidataplatform_dp.models.WorkerConfig
        """
        return self._worker_config

    @worker_config.setter
    def worker_config(self, worker_config):
        """
        Sets the worker_config of this DefaultCluster.

        :param worker_config: The worker_config of this DefaultCluster.
        :type: oci.aidataplatform_dp.models.WorkerConfig
        """
        self._worker_config = worker_config

    @property
    def cluster_runtime_config(self):
        """
        Gets the cluster_runtime_config of this DefaultCluster.

        :return: The cluster_runtime_config of this DefaultCluster.
        :rtype: oci.aidataplatform_dp.models.ClusterRuntimeConfig
        """
        return self._cluster_runtime_config

    @cluster_runtime_config.setter
    def cluster_runtime_config(self, cluster_runtime_config):
        """
        Sets the cluster_runtime_config of this DefaultCluster.

        :param cluster_runtime_config: The cluster_runtime_config of this DefaultCluster.
        :type: oci.aidataplatform_dp.models.ClusterRuntimeConfig
        """
        self._cluster_runtime_config = cluster_runtime_config

    @property
    def logging_config(self):
        """
        Gets the logging_config of this DefaultCluster.

        :return: The logging_config of this DefaultCluster.
        :rtype: oci.aidataplatform_dp.models.LoggingConfig
        """
        return self._logging_config

    @logging_config.setter
    def logging_config(self, logging_config):
        """
        Sets the logging_config of this DefaultCluster.

        :param logging_config: The logging_config of this DefaultCluster.
        :type: oci.aidataplatform_dp.models.LoggingConfig
        """
        self._logging_config = logging_config

    @property
    def auto_termination_minutes(self):
        """
        Gets the auto_termination_minutes of this DefaultCluster.
        Optional timeout value in minutes used to automatically stop idle compute clusters.


        :return: The auto_termination_minutes of this DefaultCluster.
        :rtype: int
        """
        return self._auto_termination_minutes

    @auto_termination_minutes.setter
    def auto_termination_minutes(self, auto_termination_minutes):
        """
        Sets the auto_termination_minutes of this DefaultCluster.
        Optional timeout value in minutes used to automatically stop idle compute clusters.


        :param auto_termination_minutes: The auto_termination_minutes of this DefaultCluster.
        :type: int
        """
        self._auto_termination_minutes = auto_termination_minutes

    @property
    def jdbc_endpoint_url(self):
        """
        Gets the jdbc_endpoint_url of this DefaultCluster.
        Spark JDBC URL.


        :return: The jdbc_endpoint_url of this DefaultCluster.
        :rtype: str
        """
        return self._jdbc_endpoint_url

    @jdbc_endpoint_url.setter
    def jdbc_endpoint_url(self, jdbc_endpoint_url):
        """
        Sets the jdbc_endpoint_url of this DefaultCluster.
        Spark JDBC URL.


        :param jdbc_endpoint_url: The jdbc_endpoint_url of this DefaultCluster.
        :type: str
        """
        self._jdbc_endpoint_url = jdbc_endpoint_url

    @property
    def log_id(self):
        """
        Gets the log_id of this DefaultCluster.
        The OCID of the log where cluster logs are published and retrieved. This logId is always created within the logGroupId returned in the response payload.


        :return: The log_id of this DefaultCluster.
        :rtype: str
        """
        return self._log_id

    @log_id.setter
    def log_id(self, log_id):
        """
        Sets the log_id of this DefaultCluster.
        The OCID of the log where cluster logs are published and retrieved. This logId is always created within the logGroupId returned in the response payload.


        :param log_id: The log_id of this DefaultCluster.
        :type: str
        """
        self._log_id = log_id

    @property
    def log_group_id(self):
        """
        Gets the log_group_id of this DefaultCluster.
        The unique OCID that identifies a specific log group within OCI Logging.
        This log group is exclusively associated with the AI Data Platform Workbench instance and is created in the same compartment within the customer\u2019s tenancy as the AI Data Platform Workbench instance.


        :return: The log_group_id of this DefaultCluster.
        :rtype: str
        """
        return self._log_group_id

    @log_group_id.setter
    def log_group_id(self, log_group_id):
        """
        Sets the log_group_id of this DefaultCluster.
        The unique OCID that identifies a specific log group within OCI Logging.
        This log group is exclusively associated with the AI Data Platform Workbench instance and is created in the same compartment within the customer\u2019s tenancy as the AI Data Platform Workbench instance.


        :param log_group_id: The log_group_id of this DefaultCluster.
        :type: str
        """
        self._log_group_id = log_group_id

    @property
    def subscription(self):
        """
        Gets the subscription of this DefaultCluster.

        :return: The subscription of this DefaultCluster.
        :rtype: oci.aidataplatform_dp.models.SubscriptionDetails
        """
        return self._subscription

    @subscription.setter
    def subscription(self, subscription):
        """
        Sets the subscription of this DefaultCluster.

        :param subscription: The subscription of this DefaultCluster.
        :type: oci.aidataplatform_dp.models.SubscriptionDetails
        """
        self._subscription = subscription

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
