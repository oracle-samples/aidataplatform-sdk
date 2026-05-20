# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ClusterSummary(object):
    """
    Summary information about a workspace cluster.
    """

    #: A constant which can be used with the type property of a ClusterSummary.
    #: This constant has a value of "USER"
    TYPE_USER = "USER"

    #: A constant which can be used with the type property of a ClusterSummary.
    #: This constant has a value of "AGENT_FLOW_COMPUTE"
    TYPE_AGENT_FLOW_COMPUTE = "AGENT_FLOW_COMPUTE"

    def __init__(self, **kwargs):
        """
        Initializes a new ClusterSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this ClusterSummary.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this ClusterSummary.
        :type display_name: str

        :param description:
            The value to assign to the description property of this ClusterSummary.
        :type description: str

        :param type:
            The value to assign to the type property of this ClusterSummary.
            Allowed values for this property are: "USER", "AGENT_FLOW_COMPUTE", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type type: str

        :param time_created:
            The value to assign to the time_created property of this ClusterSummary.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this ClusterSummary.
        :type time_updated: datetime

        :param state:
            The value to assign to the state property of this ClusterSummary.
        :type state: str

        :param state_details:
            The value to assign to the state_details property of this ClusterSummary.
        :type state_details: str

        :param created_by:
            The value to assign to the created_by property of this ClusterSummary.
        :type created_by: str

        :param created_by_name:
            The value to assign to the created_by_name property of this ClusterSummary.
        :type created_by_name: str

        :param updated_by:
            The value to assign to the updated_by property of this ClusterSummary.
        :type updated_by: str

        :param updated_by_name:
            The value to assign to the updated_by_name property of this ClusterSummary.
        :type updated_by_name: str

        :param stopped_by:
            The value to assign to the stopped_by property of this ClusterSummary.
        :type stopped_by: str

        :param stopped_by_name:
            The value to assign to the stopped_by_name property of this ClusterSummary.
        :type stopped_by_name: str

        :param cluster_runtime_config:
            The value to assign to the cluster_runtime_config property of this ClusterSummary.
        :type cluster_runtime_config: oci.aidataplatform_dp.models.ClusterRuntimeConfig

        :param active_cluster_resources:
            The value to assign to the active_cluster_resources property of this ClusterSummary.
        :type active_cluster_resources: oci.aidataplatform_dp.models.ActiveClusterResources

        :param driver_config:
            The value to assign to the driver_config property of this ClusterSummary.
        :type driver_config: oci.aidataplatform_dp.models.DriverConfig

        :param worker_config:
            The value to assign to the worker_config property of this ClusterSummary.
        :type worker_config: oci.aidataplatform_dp.models.WorkerConfig

        :param attached_notebooks:
            The value to assign to the attached_notebooks property of this ClusterSummary.
        :type attached_notebooks: list[str]

        :param attached_sessions:
            The value to assign to the attached_sessions property of this ClusterSummary.
        :type attached_sessions: list[oci.aidataplatform_dp.models.AttachedSession]

        :param attached_agent_flow_count:
            The value to assign to the attached_agent_flow_count property of this ClusterSummary.
        :type attached_agent_flow_count: int

        """
        self.swagger_types = {
            'key': 'str',
            'display_name': 'str',
            'description': 'str',
            'type': 'str',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'state': 'str',
            'state_details': 'str',
            'created_by': 'str',
            'created_by_name': 'str',
            'updated_by': 'str',
            'updated_by_name': 'str',
            'stopped_by': 'str',
            'stopped_by_name': 'str',
            'cluster_runtime_config': 'ClusterRuntimeConfig',
            'active_cluster_resources': 'ActiveClusterResources',
            'driver_config': 'DriverConfig',
            'worker_config': 'WorkerConfig',
            'attached_notebooks': 'list[str]',
            'attached_sessions': 'list[AttachedSession]',
            'attached_agent_flow_count': 'int'
        }

        self.attribute_map = {
            'key': 'key',
            'display_name': 'displayName',
            'description': 'description',
            'type': 'type',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'state': 'state',
            'state_details': 'stateDetails',
            'created_by': 'createdBy',
            'created_by_name': 'createdByName',
            'updated_by': 'updatedBy',
            'updated_by_name': 'updatedByName',
            'stopped_by': 'stoppedBy',
            'stopped_by_name': 'stoppedByName',
            'cluster_runtime_config': 'clusterRuntimeConfig',
            'active_cluster_resources': 'activeClusterResources',
            'driver_config': 'driverConfig',
            'worker_config': 'workerConfig',
            'attached_notebooks': 'attachedNotebooks',
            'attached_sessions': 'attachedSessions',
            'attached_agent_flow_count': 'attachedAgentFlowCount'
        }

        self._key = None
        self._display_name = None
        self._description = None
        self._type = None
        self._time_created = None
        self._time_updated = None
        self._state = None
        self._state_details = None
        self._created_by = None
        self._created_by_name = None
        self._updated_by = None
        self._updated_by_name = None
        self._stopped_by = None
        self._stopped_by_name = None
        self._cluster_runtime_config = None
        self._active_cluster_resources = None
        self._driver_config = None
        self._worker_config = None
        self._attached_notebooks = None
        self._attached_sessions = None
        self._attached_agent_flow_count = None

    @property
    def key(self):
        """
        **[Required]** Gets the key of this ClusterSummary.
        Cluster key.


        :return: The key of this ClusterSummary.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this ClusterSummary.
        Cluster key.


        :param key: The key of this ClusterSummary.
        :type: str
        """
        self._key = key

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this ClusterSummary.
        Cluster name.


        :return: The display_name of this ClusterSummary.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this ClusterSummary.
        Cluster name.


        :param display_name: The display_name of this ClusterSummary.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this ClusterSummary.
        Cluster description.


        :return: The description of this ClusterSummary.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this ClusterSummary.
        Cluster description.


        :param description: The description of this ClusterSummary.
        :type: str
        """
        self._description = description

    @property
    def type(self):
        """
        **[Required]** Gets the type of this ClusterSummary.
        ClusterType

        Allowed values for this property are: "USER", "AGENT_FLOW_COMPUTE", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The type of this ClusterSummary.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this ClusterSummary.
        ClusterType


        :param type: The type of this ClusterSummary.
        :type: str
        """
        allowed_values = ["USER", "AGENT_FLOW_COMPUTE"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            type = 'UNKNOWN_ENUM_VALUE'
        self._type = type

    @property
    def time_created(self):
        """
        **[Required]** Gets the time_created of this ClusterSummary.
        Date and time the cluster was created.


        :return: The time_created of this ClusterSummary.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this ClusterSummary.
        Date and time the cluster was created.


        :param time_created: The time_created of this ClusterSummary.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this ClusterSummary.
        Date and time the cluster was updated.


        :return: The time_updated of this ClusterSummary.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this ClusterSummary.
        Date and time the cluster was updated.


        :param time_updated: The time_updated of this ClusterSummary.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def state(self):
        """
        **[Required]** Gets the state of this ClusterSummary.
        The current state of the cluster.


        :return: The state of this ClusterSummary.
        :rtype: str
        """
        return self._state

    @state.setter
    def state(self, state):
        """
        Sets the state of this ClusterSummary.
        The current state of the cluster.


        :param state: The state of this ClusterSummary.
        :type: str
        """
        self._state = state

    @property
    def state_details(self):
        """
        Gets the state_details of this ClusterSummary.
        A message that describes the current state of the workspace cluster in more detail. For example, can be used to provide actionable information for a resource in the Failed state.


        :return: The state_details of this ClusterSummary.
        :rtype: str
        """
        return self._state_details

    @state_details.setter
    def state_details(self, state_details):
        """
        Sets the state_details of this ClusterSummary.
        A message that describes the current state of the workspace cluster in more detail. For example, can be used to provide actionable information for a resource in the Failed state.


        :param state_details: The state_details of this ClusterSummary.
        :type: str
        """
        self._state_details = state_details

    @property
    def created_by(self):
        """
        Gets the created_by of this ClusterSummary.
        OCID of the user who created this record.


        :return: The created_by of this ClusterSummary.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this ClusterSummary.
        OCID of the user who created this record.


        :param created_by: The created_by of this ClusterSummary.
        :type: str
        """
        self._created_by = created_by

    @property
    def created_by_name(self):
        """
        Gets the created_by_name of this ClusterSummary.
        Name of the user who created this record.


        :return: The created_by_name of this ClusterSummary.
        :rtype: str
        """
        return self._created_by_name

    @created_by_name.setter
    def created_by_name(self, created_by_name):
        """
        Sets the created_by_name of this ClusterSummary.
        Name of the user who created this record.


        :param created_by_name: The created_by_name of this ClusterSummary.
        :type: str
        """
        self._created_by_name = created_by_name

    @property
    def updated_by(self):
        """
        Gets the updated_by of this ClusterSummary.
        OCID of the user who updated this record.


        :return: The updated_by of this ClusterSummary.
        :rtype: str
        """
        return self._updated_by

    @updated_by.setter
    def updated_by(self, updated_by):
        """
        Sets the updated_by of this ClusterSummary.
        OCID of the user who updated this record.


        :param updated_by: The updated_by of this ClusterSummary.
        :type: str
        """
        self._updated_by = updated_by

    @property
    def updated_by_name(self):
        """
        Gets the updated_by_name of this ClusterSummary.
        Name of the user who updated this record.


        :return: The updated_by_name of this ClusterSummary.
        :rtype: str
        """
        return self._updated_by_name

    @updated_by_name.setter
    def updated_by_name(self, updated_by_name):
        """
        Sets the updated_by_name of this ClusterSummary.
        Name of the user who updated this record.


        :param updated_by_name: The updated_by_name of this ClusterSummary.
        :type: str
        """
        self._updated_by_name = updated_by_name

    @property
    def stopped_by(self):
        """
        Gets the stopped_by of this ClusterSummary.
        OCID of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped.


        :return: The stopped_by of this ClusterSummary.
        :rtype: str
        """
        return self._stopped_by

    @stopped_by.setter
    def stopped_by(self, stopped_by):
        """
        Sets the stopped_by of this ClusterSummary.
        OCID of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped.


        :param stopped_by: The stopped_by of this ClusterSummary.
        :type: str
        """
        self._stopped_by = stopped_by

    @property
    def stopped_by_name(self):
        """
        Gets the stopped_by_name of this ClusterSummary.
        Name of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped.


        :return: The stopped_by_name of this ClusterSummary.
        :rtype: str
        """
        return self._stopped_by_name

    @stopped_by_name.setter
    def stopped_by_name(self, stopped_by_name):
        """
        Sets the stopped_by_name of this ClusterSummary.
        Name of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped.


        :param stopped_by_name: The stopped_by_name of this ClusterSummary.
        :type: str
        """
        self._stopped_by_name = stopped_by_name

    @property
    def cluster_runtime_config(self):
        """
        Gets the cluster_runtime_config of this ClusterSummary.

        :return: The cluster_runtime_config of this ClusterSummary.
        :rtype: oci.aidataplatform_dp.models.ClusterRuntimeConfig
        """
        return self._cluster_runtime_config

    @cluster_runtime_config.setter
    def cluster_runtime_config(self, cluster_runtime_config):
        """
        Sets the cluster_runtime_config of this ClusterSummary.

        :param cluster_runtime_config: The cluster_runtime_config of this ClusterSummary.
        :type: oci.aidataplatform_dp.models.ClusterRuntimeConfig
        """
        self._cluster_runtime_config = cluster_runtime_config

    @property
    def active_cluster_resources(self):
        """
        Gets the active_cluster_resources of this ClusterSummary.

        :return: The active_cluster_resources of this ClusterSummary.
        :rtype: oci.aidataplatform_dp.models.ActiveClusterResources
        """
        return self._active_cluster_resources

    @active_cluster_resources.setter
    def active_cluster_resources(self, active_cluster_resources):
        """
        Sets the active_cluster_resources of this ClusterSummary.

        :param active_cluster_resources: The active_cluster_resources of this ClusterSummary.
        :type: oci.aidataplatform_dp.models.ActiveClusterResources
        """
        self._active_cluster_resources = active_cluster_resources

    @property
    def driver_config(self):
        """
        Gets the driver_config of this ClusterSummary.

        :return: The driver_config of this ClusterSummary.
        :rtype: oci.aidataplatform_dp.models.DriverConfig
        """
        return self._driver_config

    @driver_config.setter
    def driver_config(self, driver_config):
        """
        Sets the driver_config of this ClusterSummary.

        :param driver_config: The driver_config of this ClusterSummary.
        :type: oci.aidataplatform_dp.models.DriverConfig
        """
        self._driver_config = driver_config

    @property
    def worker_config(self):
        """
        Gets the worker_config of this ClusterSummary.

        :return: The worker_config of this ClusterSummary.
        :rtype: oci.aidataplatform_dp.models.WorkerConfig
        """
        return self._worker_config

    @worker_config.setter
    def worker_config(self, worker_config):
        """
        Sets the worker_config of this ClusterSummary.

        :param worker_config: The worker_config of this ClusterSummary.
        :type: oci.aidataplatform_dp.models.WorkerConfig
        """
        self._worker_config = worker_config

    @property
    def attached_notebooks(self):
        """
        Gets the attached_notebooks of this ClusterSummary.
        List of notebooks attached to a specific cluster.


        :return: The attached_notebooks of this ClusterSummary.
        :rtype: list[str]
        """
        return self._attached_notebooks

    @attached_notebooks.setter
    def attached_notebooks(self, attached_notebooks):
        """
        Sets the attached_notebooks of this ClusterSummary.
        List of notebooks attached to a specific cluster.


        :param attached_notebooks: The attached_notebooks of this ClusterSummary.
        :type: list[str]
        """
        self._attached_notebooks = attached_notebooks

    @property
    def attached_sessions(self):
        """
        Gets the attached_sessions of this ClusterSummary.
        List of sessions attached to a specific cluster.


        :return: The attached_sessions of this ClusterSummary.
        :rtype: list[oci.aidataplatform_dp.models.AttachedSession]
        """
        return self._attached_sessions

    @attached_sessions.setter
    def attached_sessions(self, attached_sessions):
        """
        Sets the attached_sessions of this ClusterSummary.
        List of sessions attached to a specific cluster.


        :param attached_sessions: The attached_sessions of this ClusterSummary.
        :type: list[oci.aidataplatform_dp.models.AttachedSession]
        """
        self._attached_sessions = attached_sessions

    @property
    def attached_agent_flow_count(self):
        """
        Gets the attached_agent_flow_count of this ClusterSummary.
        Count of agent flow attached to a specific cluster.


        :return: The attached_agent_flow_count of this ClusterSummary.
        :rtype: int
        """
        return self._attached_agent_flow_count

    @attached_agent_flow_count.setter
    def attached_agent_flow_count(self, attached_agent_flow_count):
        """
        Sets the attached_agent_flow_count of this ClusterSummary.
        Count of agent flow attached to a specific cluster.


        :param attached_agent_flow_count: The attached_agent_flow_count of this ClusterSummary.
        :type: int
        """
        self._attached_agent_flow_count = attached_agent_flow_count

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
