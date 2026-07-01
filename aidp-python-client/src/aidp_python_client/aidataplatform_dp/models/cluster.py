# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class Cluster(object):
    """
    A Cluster is a compute subresource within AI Data Platform Workbench. Compute/Runtime Clusters are Spark execution environments.
    Spark clusters are used for Notebook execution and for Spark SQL query execution over JDBC/ODBC.
    These clusters seamlessly process the data in the AI Data Platform Workbench.  Users can also use JDBC/ODBC endpoints for highly
    performant SQL execution for integration with analytics tools such as Oracle Analytic Cloud and Excel.
    A DEFAULT cluster is a subresource within AI Data Platform Workbench associated with master catalog and it can not be
    attached to a notebook. A USER cluster is a subresource within workspace and can be attached to a notebook.
    """

    #: A constant which can be used with the source_api property of a Cluster.
    #: This constant has a value of "CLUSTER_API"
    SOURCE_API_CLUSTER_API = "CLUSTER_API"

    #: A constant which can be used with the source_api property of a Cluster.
    #: This constant has a value of "DEFAULT_CLUSTER_API"
    SOURCE_API_DEFAULT_CLUSTER_API = "DEFAULT_CLUSTER_API"

    #: A constant which can be used with the source_api property of a Cluster.
    #: This constant has a value of "AI_COMPUTE"
    SOURCE_API_AI_COMPUTE = "AI_COMPUTE"

    #: A constant which can be used with the type property of a Cluster.
    #: This constant has a value of "USER"
    TYPE_USER = "USER"

    #: A constant which can be used with the type property of a Cluster.
    #: This constant has a value of "AI_COMPUTE"
    TYPE_AI_COMPUTE = "AI_COMPUTE"

    #: A constant which can be used with the state property of a Cluster.
    #: This constant has a value of "ACCEPTED"
    STATE_ACCEPTED = "ACCEPTED"

    #: A constant which can be used with the state property of a Cluster.
    #: This constant has a value of "CREATING"
    STATE_CREATING = "CREATING"

    #: A constant which can be used with the state property of a Cluster.
    #: This constant has a value of "ACTIVE"
    STATE_ACTIVE = "ACTIVE"

    #: A constant which can be used with the state property of a Cluster.
    #: This constant has a value of "DELETING"
    STATE_DELETING = "DELETING"

    #: A constant which can be used with the state property of a Cluster.
    #: This constant has a value of "DELETED"
    STATE_DELETED = "DELETED"

    #: A constant which can be used with the state property of a Cluster.
    #: This constant has a value of "FAILED"
    STATE_FAILED = "FAILED"

    #: A constant which can be used with the state property of a Cluster.
    #: This constant has a value of "STOPPING"
    STATE_STOPPING = "STOPPING"

    #: A constant which can be used with the state property of a Cluster.
    #: This constant has a value of "STOPPED"
    STATE_STOPPED = "STOPPED"

    #: A constant which can be used with the state property of a Cluster.
    #: This constant has a value of "UPDATING"
    STATE_UPDATING = "UPDATING"

    #: A constant which can be used with the state property of a Cluster.
    #: This constant has a value of "RESTARTING"
    STATE_RESTARTING = "RESTARTING"

    #: A constant which can be used with the state property of a Cluster.
    #: This constant has a value of "STARTING"
    STATE_STARTING = "STARTING"

    #: A constant which can be used with the state property of a Cluster.
    #: This constant has a value of "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS"
    STATE_NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS = "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS"

    #: A constant which can be used with the state property of a Cluster.
    #: This constant has a value of "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL"
    STATE_NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL = "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL"

    #: A constant which can be used with the state property of a Cluster.
    #: This constant has a value of "NETWORK_CONFIGURATION_ATTACH_FAILED"
    STATE_NETWORK_CONFIGURATION_ATTACH_FAILED = "NETWORK_CONFIGURATION_ATTACH_FAILED"

    #: A constant which can be used with the state property of a Cluster.
    #: This constant has a value of "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS"
    STATE_NETWORK_CONFIGURATION_DETACH_IN_PROGRESS = "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS"

    #: A constant which can be used with the state property of a Cluster.
    #: This constant has a value of "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL"
    STATE_NETWORK_CONFIGURATION_DETACH_SUCCESSFUL = "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL"

    #: A constant which can be used with the state property of a Cluster.
    #: This constant has a value of "NETWORK_CONFIGURATION_DETACH_FAILED"
    STATE_NETWORK_CONFIGURATION_DETACH_FAILED = "NETWORK_CONFIGURATION_DETACH_FAILED"

    def __init__(self, **kwargs):
        """
        Initializes a new Cluster object with values from keyword arguments. This class has the following subclasses and if you are using this class as input
        to a service operations then you should favor using a subclass over the base class:

        * :class:`~oci.aidataplatform_dp.models.AiCompute`
        * :class:`~oci.aidataplatform_dp.models.SparkCluster`
        * :class:`~oci.aidataplatform_dp.models.DefaultCluster`

        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this Cluster.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this Cluster.
        :type display_name: str

        :param description:
            The value to assign to the description property of this Cluster.
        :type description: str

        :param source_api:
            The value to assign to the source_api property of this Cluster.
            Allowed values for this property are: "CLUSTER_API", "DEFAULT_CLUSTER_API", "AI_COMPUTE", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type source_api: str

        :param type:
            The value to assign to the type property of this Cluster.
            Allowed values for this property are: "USER", "AI_COMPUTE", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type type: str

        :param time_created:
            The value to assign to the time_created property of this Cluster.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this Cluster.
        :type time_updated: datetime

        :param state:
            The value to assign to the state property of this Cluster.
            Allowed values for this property are: "ACCEPTED", "CREATING", "ACTIVE", "DELETING", "DELETED", "FAILED", "STOPPING", "STOPPED", "UPDATING", "RESTARTING", "STARTING", "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS", "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL", "NETWORK_CONFIGURATION_ATTACH_FAILED", "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS", "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL", "NETWORK_CONFIGURATION_DETACH_FAILED", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type state: str

        :param state_details:
            The value to assign to the state_details property of this Cluster.
        :type state_details: str

        :param node_type:
            The value to assign to the node_type property of this Cluster.
        :type node_type: str

        :param driver_config:
            The value to assign to the driver_config property of this Cluster.
        :type driver_config: oci.aidataplatform_dp.models.DriverConfig

        :param active_cluster_resources:
            The value to assign to the active_cluster_resources property of this Cluster.
        :type active_cluster_resources: oci.aidataplatform_dp.models.ActiveClusterResources

        :param created_by:
            The value to assign to the created_by property of this Cluster.
        :type created_by: str

        :param created_by_name:
            The value to assign to the created_by_name property of this Cluster.
        :type created_by_name: str

        :param updated_by:
            The value to assign to the updated_by property of this Cluster.
        :type updated_by: str

        :param updated_by_name:
            The value to assign to the updated_by_name property of this Cluster.
        :type updated_by_name: str

        :param stopped_by:
            The value to assign to the stopped_by property of this Cluster.
        :type stopped_by: str

        :param stopped_by_name:
            The value to assign to the stopped_by_name property of this Cluster.
        :type stopped_by_name: str

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
            'stopped_by_name': 'str'
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
            'stopped_by_name': 'stoppedByName'
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

    @staticmethod
    def get_subtype(object_dictionary):
        """
        Given the hash representation of a subtype of this class,
        use the info in the hash to return the class of the subtype.
        """
        type = object_dictionary['sourceApi']

        if type == 'AI_COMPUTE':
            return 'AiCompute'

        if type == 'CLUSTER_API':
            return 'SparkCluster'

        if type == 'DEFAULT_CLUSTER_API':
            return 'DefaultCluster'
        else:
            return 'Cluster'

    @property
    def key(self):
        """
        **[Required]** Gets the key of this Cluster.
        Cluster key.


        :return: The key of this Cluster.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this Cluster.
        Cluster key.


        :param key: The key of this Cluster.
        :type: str
        """
        self._key = key

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this Cluster.
        Cluster name.


        :return: The display_name of this Cluster.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this Cluster.
        Cluster name.


        :param display_name: The display_name of this Cluster.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this Cluster.
        Cluster description.


        :return: The description of this Cluster.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this Cluster.
        Cluster description.


        :param description: The description of this Cluster.
        :type: str
        """
        self._description = description

    @property
    def source_api(self):
        """
        Gets the source_api of this Cluster.
        User created clusters are associated with a particular workspace. AI compute is used to execute Agents.

        Allowed values for this property are: "CLUSTER_API", "DEFAULT_CLUSTER_API", "AI_COMPUTE", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The source_api of this Cluster.
        :rtype: str
        """
        return self._source_api

    @source_api.setter
    def source_api(self, source_api):
        """
        Sets the source_api of this Cluster.
        User created clusters are associated with a particular workspace. AI compute is used to execute Agents.


        :param source_api: The source_api of this Cluster.
        :type: str
        """
        allowed_values = ["CLUSTER_API", "DEFAULT_CLUSTER_API", "AI_COMPUTE"]
        if not value_allowed_none_or_none_sentinel(source_api, allowed_values):
            source_api = 'UNKNOWN_ENUM_VALUE'
        self._source_api = source_api

    @property
    def type(self):
        """
        Gets the type of this Cluster.
        ClusterType

        Allowed values for this property are: "USER", "AI_COMPUTE", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The type of this Cluster.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this Cluster.
        ClusterType


        :param type: The type of this Cluster.
        :type: str
        """
        allowed_values = ["USER", "AI_COMPUTE"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            type = 'UNKNOWN_ENUM_VALUE'
        self._type = type

    @property
    def time_created(self):
        """
        **[Required]** Gets the time_created of this Cluster.
        Date and time the cluster was created.


        :return: The time_created of this Cluster.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this Cluster.
        Date and time the cluster was created.


        :param time_created: The time_created of this Cluster.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this Cluster.
        Date and time the cluster was updated.


        :return: The time_updated of this Cluster.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this Cluster.
        Date and time the cluster was updated.


        :param time_updated: The time_updated of this Cluster.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def state(self):
        """
        **[Required]** Gets the state of this Cluster.
        Common lifecycle states for resources in a compute cluster.
        ACCEPTED        - The resource create request has been accepted.
        CREATING        - The resource is being created and might not be usable until the entire metadata is defined.
        ACTIVE          - The resource is valid and available for access.
        DELETING        - The resource is being deleted, and might require a deep clean of any children.
        DELETED         - The resource has been deleted, and isn't available.
        FAILED          - The resource is in a failed state due to validation or other errors.
        STOPPING        - The resource is being stopped.
        STOPPED         - The resource has been stopped.
        UPDATING        - The resource is being updated and might not be usable until all changes are commited.
        STARTING        - The resource is being started.
        RESTARTING      - The resource is being restarted.

        Allowed values for this property are: "ACCEPTED", "CREATING", "ACTIVE", "DELETING", "DELETED", "FAILED", "STOPPING", "STOPPED", "UPDATING", "RESTARTING", "STARTING", "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS", "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL", "NETWORK_CONFIGURATION_ATTACH_FAILED", "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS", "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL", "NETWORK_CONFIGURATION_DETACH_FAILED", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The state of this Cluster.
        :rtype: str
        """
        return self._state

    @state.setter
    def state(self, state):
        """
        Sets the state of this Cluster.
        Common lifecycle states for resources in a compute cluster.
        ACCEPTED        - The resource create request has been accepted.
        CREATING        - The resource is being created and might not be usable until the entire metadata is defined.
        ACTIVE          - The resource is valid and available for access.
        DELETING        - The resource is being deleted, and might require a deep clean of any children.
        DELETED         - The resource has been deleted, and isn't available.
        FAILED          - The resource is in a failed state due to validation or other errors.
        STOPPING        - The resource is being stopped.
        STOPPED         - The resource has been stopped.
        UPDATING        - The resource is being updated and might not be usable until all changes are commited.
        STARTING        - The resource is being started.
        RESTARTING      - The resource is being restarted.


        :param state: The state of this Cluster.
        :type: str
        """
        allowed_values = ["ACCEPTED", "CREATING", "ACTIVE", "DELETING", "DELETED", "FAILED", "STOPPING", "STOPPED", "UPDATING", "RESTARTING", "STARTING", "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS", "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL", "NETWORK_CONFIGURATION_ATTACH_FAILED", "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS", "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL", "NETWORK_CONFIGURATION_DETACH_FAILED"]
        if not value_allowed_none_or_none_sentinel(state, allowed_values):
            state = 'UNKNOWN_ENUM_VALUE'
        self._state = state

    @property
    def state_details(self):
        """
        Gets the state_details of this Cluster.
        A message that describes the current state of the workspace cluster in more detail. For example, can be used to provide actionable information for a resource in the Failed state.


        :return: The state_details of this Cluster.
        :rtype: str
        """
        return self._state_details

    @state_details.setter
    def state_details(self, state_details):
        """
        Sets the state_details of this Cluster.
        A message that describes the current state of the workspace cluster in more detail. For example, can be used to provide actionable information for a resource in the Failed state.


        :param state_details: The state_details of this Cluster.
        :type: str
        """
        self._state_details = state_details

    @property
    def node_type(self):
        """
        Gets the node_type of this Cluster.
        Cluster node type encodes the node shape and associated resources.


        :return: The node_type of this Cluster.
        :rtype: str
        """
        return self._node_type

    @node_type.setter
    def node_type(self, node_type):
        """
        Sets the node_type of this Cluster.
        Cluster node type encodes the node shape and associated resources.


        :param node_type: The node_type of this Cluster.
        :type: str
        """
        self._node_type = node_type

    @property
    def driver_config(self):
        """
        Gets the driver_config of this Cluster.

        :return: The driver_config of this Cluster.
        :rtype: oci.aidataplatform_dp.models.DriverConfig
        """
        return self._driver_config

    @driver_config.setter
    def driver_config(self, driver_config):
        """
        Sets the driver_config of this Cluster.

        :param driver_config: The driver_config of this Cluster.
        :type: oci.aidataplatform_dp.models.DriverConfig
        """
        self._driver_config = driver_config

    @property
    def active_cluster_resources(self):
        """
        Gets the active_cluster_resources of this Cluster.

        :return: The active_cluster_resources of this Cluster.
        :rtype: oci.aidataplatform_dp.models.ActiveClusterResources
        """
        return self._active_cluster_resources

    @active_cluster_resources.setter
    def active_cluster_resources(self, active_cluster_resources):
        """
        Sets the active_cluster_resources of this Cluster.

        :param active_cluster_resources: The active_cluster_resources of this Cluster.
        :type: oci.aidataplatform_dp.models.ActiveClusterResources
        """
        self._active_cluster_resources = active_cluster_resources

    @property
    def created_by(self):
        """
        Gets the created_by of this Cluster.
        OCID of the user who created this record.


        :return: The created_by of this Cluster.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this Cluster.
        OCID of the user who created this record.


        :param created_by: The created_by of this Cluster.
        :type: str
        """
        self._created_by = created_by

    @property
    def created_by_name(self):
        """
        Gets the created_by_name of this Cluster.
        Name of the user who created this record.


        :return: The created_by_name of this Cluster.
        :rtype: str
        """
        return self._created_by_name

    @created_by_name.setter
    def created_by_name(self, created_by_name):
        """
        Sets the created_by_name of this Cluster.
        Name of the user who created this record.


        :param created_by_name: The created_by_name of this Cluster.
        :type: str
        """
        self._created_by_name = created_by_name

    @property
    def updated_by(self):
        """
        Gets the updated_by of this Cluster.
        OCID of the user who updated this record.


        :return: The updated_by of this Cluster.
        :rtype: str
        """
        return self._updated_by

    @updated_by.setter
    def updated_by(self, updated_by):
        """
        Sets the updated_by of this Cluster.
        OCID of the user who updated this record.


        :param updated_by: The updated_by of this Cluster.
        :type: str
        """
        self._updated_by = updated_by

    @property
    def updated_by_name(self):
        """
        Gets the updated_by_name of this Cluster.
        Name of the user who updated this record.


        :return: The updated_by_name of this Cluster.
        :rtype: str
        """
        return self._updated_by_name

    @updated_by_name.setter
    def updated_by_name(self, updated_by_name):
        """
        Sets the updated_by_name of this Cluster.
        Name of the user who updated this record.


        :param updated_by_name: The updated_by_name of this Cluster.
        :type: str
        """
        self._updated_by_name = updated_by_name

    @property
    def stopped_by(self):
        """
        Gets the stopped_by of this Cluster.
        OCID of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped.


        :return: The stopped_by of this Cluster.
        :rtype: str
        """
        return self._stopped_by

    @stopped_by.setter
    def stopped_by(self, stopped_by):
        """
        Sets the stopped_by of this Cluster.
        OCID of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped.


        :param stopped_by: The stopped_by of this Cluster.
        :type: str
        """
        self._stopped_by = stopped_by

    @property
    def stopped_by_name(self):
        """
        Gets the stopped_by_name of this Cluster.
        Name of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped.


        :return: The stopped_by_name of this Cluster.
        :rtype: str
        """
        return self._stopped_by_name

    @stopped_by_name.setter
    def stopped_by_name(self, stopped_by_name):
        """
        Sets the stopped_by_name of this Cluster.
        Name of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped.


        :param stopped_by_name: The stopped_by_name of this Cluster.
        :type: str
        """
        self._stopped_by_name = stopped_by_name

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
