# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AgentInfo(object):
    """
    Summary information of agent in the schema.
    """

    #: A constant which can be used with the type property of a AgentInfo.
    #: This constant has a value of "CANVAS"
    TYPE_CANVAS = "CANVAS"

    #: A constant which can be used with the type property of a AgentInfo.
    #: This constant has a value of "CODE"
    TYPE_CODE = "CODE"

    def __init__(self, **kwargs):
        """
        Initializes a new AgentInfo object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this AgentInfo.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this AgentInfo.
        :type display_name: str

        :param description:
            The value to assign to the description property of this AgentInfo.
        :type description: str

        :param workspace_key:
            The value to assign to the workspace_key property of this AgentInfo.
        :type workspace_key: str

        :param path_info:
            The value to assign to the path_info property of this AgentInfo.
        :type path_info: str

        :param type:
            The value to assign to the type property of this AgentInfo.
            Allowed values for this property are: "CANVAS", "CODE", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type type: str

        :param deployment_compute_key:
            The value to assign to the deployment_compute_key property of this AgentInfo.
        :type deployment_compute_key: str

        :param deployment_mode:
            The value to assign to the deployment_mode property of this AgentInfo.
        :type deployment_mode: str

        :param uri:
            The value to assign to the uri property of this AgentInfo.
        :type uri: str

        :param uri_state:
            The value to assign to the uri_state property of this AgentInfo.
        :type uri_state: str

        :param entry_file_path:
            The value to assign to the entry_file_path property of this AgentInfo.
        :type entry_file_path: str

        :param dependencies_file_path:
            The value to assign to the dependencies_file_path property of this AgentInfo.
        :type dependencies_file_path: str

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this AgentInfo.
        :type lifecycle_state: str

        :param lifecycle_details:
            The value to assign to the lifecycle_details property of this AgentInfo.
        :type lifecycle_details: str

        :param compute_key:
            The value to assign to the compute_key property of this AgentInfo.
        :type compute_key: str

        :param time_created:
            The value to assign to the time_created property of this AgentInfo.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this AgentInfo.
        :type time_updated: datetime

        :param created_by:
            The value to assign to the created_by property of this AgentInfo.
        :type created_by: str

        :param updated_by:
            The value to assign to the updated_by property of this AgentInfo.
        :type updated_by: str

        """
        self.swagger_types = {
            'key': 'str',
            'display_name': 'str',
            'description': 'str',
            'workspace_key': 'str',
            'path_info': 'str',
            'type': 'str',
            'deployment_compute_key': 'str',
            'deployment_mode': 'str',
            'uri': 'str',
            'uri_state': 'str',
            'entry_file_path': 'str',
            'dependencies_file_path': 'str',
            'lifecycle_state': 'str',
            'lifecycle_details': 'str',
            'compute_key': 'str',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'created_by': 'str',
            'updated_by': 'str'
        }

        self.attribute_map = {
            'key': 'key',
            'display_name': 'displayName',
            'description': 'description',
            'workspace_key': 'workspaceKey',
            'path_info': 'pathInfo',
            'type': 'type',
            'deployment_compute_key': 'deploymentComputeKey',
            'deployment_mode': 'deploymentMode',
            'uri': 'uri',
            'uri_state': 'uriState',
            'entry_file_path': 'entryFilePath',
            'dependencies_file_path': 'dependenciesFilePath',
            'lifecycle_state': 'lifecycleState',
            'lifecycle_details': 'lifecycleDetails',
            'compute_key': 'computeKey',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'created_by': 'createdBy',
            'updated_by': 'updatedBy'
        }

        self._key = None
        self._display_name = None
        self._description = None
        self._workspace_key = None
        self._path_info = None
        self._type = None
        self._deployment_compute_key = None
        self._deployment_mode = None
        self._uri = None
        self._uri_state = None
        self._entry_file_path = None
        self._dependencies_file_path = None
        self._lifecycle_state = None
        self._lifecycle_details = None
        self._compute_key = None
        self._time_created = None
        self._time_updated = None
        self._created_by = None
        self._updated_by = None

    @property
    def key(self):
        """
        **[Required]** Gets the key of this AgentInfo.
        The unique identifier (UUID) of the agent.


        :return: The key of this AgentInfo.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this AgentInfo.
        The unique identifier (UUID) of the agent.


        :param key: The key of this AgentInfo.
        :type: str
        """
        self._key = key

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this AgentInfo.
        Agent name.


        :return: The display_name of this AgentInfo.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this AgentInfo.
        Agent name.


        :param display_name: The display_name of this AgentInfo.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this AgentInfo.
        Agent description.


        :return: The description of this AgentInfo.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this AgentInfo.
        Agent description.


        :param description: The description of this AgentInfo.
        :type: str
        """
        self._description = description

    @property
    def workspace_key(self):
        """
        Gets the workspace_key of this AgentInfo.
        The key of the workspace to which this agent belongs.


        :return: The workspace_key of this AgentInfo.
        :rtype: str
        """
        return self._workspace_key

    @workspace_key.setter
    def workspace_key(self, workspace_key):
        """
        Sets the workspace_key of this AgentInfo.
        The key of the workspace to which this agent belongs.


        :param workspace_key: The workspace_key of this AgentInfo.
        :type: str
        """
        self._workspace_key = workspace_key

    @property
    def path_info(self):
        """
        Gets the path_info of this AgentInfo.
        Path inside volume where the agent JSON is written.


        :return: The path_info of this AgentInfo.
        :rtype: str
        """
        return self._path_info

    @path_info.setter
    def path_info(self, path_info):
        """
        Sets the path_info of this AgentInfo.
        Path inside volume where the agent JSON is written.


        :param path_info: The path_info of this AgentInfo.
        :type: str
        """
        self._path_info = path_info

    @property
    def type(self):
        """
        Gets the type of this AgentInfo.
        The type of agent (Canvas or Code).

        Allowed values for this property are: "CANVAS", "CODE", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The type of this AgentInfo.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this AgentInfo.
        The type of agent (Canvas or Code).


        :param type: The type of this AgentInfo.
        :type: str
        """
        allowed_values = ["CANVAS", "CODE"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            type = 'UNKNOWN_ENUM_VALUE'
        self._type = type

    @property
    def deployment_compute_key(self):
        """
        Gets the deployment_compute_key of this AgentInfo.
        The key of the compute where agent is deployed.


        :return: The deployment_compute_key of this AgentInfo.
        :rtype: str
        """
        return self._deployment_compute_key

    @deployment_compute_key.setter
    def deployment_compute_key(self, deployment_compute_key):
        """
        Sets the deployment_compute_key of this AgentInfo.
        The key of the compute where agent is deployed.


        :param deployment_compute_key: The deployment_compute_key of this AgentInfo.
        :type: str
        """
        self._deployment_compute_key = deployment_compute_key

    @property
    def deployment_mode(self):
        """
        Gets the deployment_mode of this AgentInfo.
        Agent deployment mode.


        :return: The deployment_mode of this AgentInfo.
        :rtype: str
        """
        return self._deployment_mode

    @deployment_mode.setter
    def deployment_mode(self, deployment_mode):
        """
        Sets the deployment_mode of this AgentInfo.
        Agent deployment mode.


        :param deployment_mode: The deployment_mode of this AgentInfo.
        :type: str
        """
        self._deployment_mode = deployment_mode

    @property
    def uri(self):
        """
        Gets the uri of this AgentInfo.
        Agent URI.


        :return: The uri of this AgentInfo.
        :rtype: str
        """
        return self._uri

    @uri.setter
    def uri(self, uri):
        """
        Sets the uri of this AgentInfo.
        Agent URI.


        :param uri: The uri of this AgentInfo.
        :type: str
        """
        self._uri = uri

    @property
    def uri_state(self):
        """
        Gets the uri_state of this AgentInfo.
        Agent URI state.


        :return: The uri_state of this AgentInfo.
        :rtype: str
        """
        return self._uri_state

    @uri_state.setter
    def uri_state(self, uri_state):
        """
        Sets the uri_state of this AgentInfo.
        Agent URI state.


        :param uri_state: The uri_state of this AgentInfo.
        :type: str
        """
        self._uri_state = uri_state

    @property
    def entry_file_path(self):
        """
        Gets the entry_file_path of this AgentInfo.
        The path to project entry file.


        :return: The entry_file_path of this AgentInfo.
        :rtype: str
        """
        return self._entry_file_path

    @entry_file_path.setter
    def entry_file_path(self, entry_file_path):
        """
        Sets the entry_file_path of this AgentInfo.
        The path to project entry file.


        :param entry_file_path: The entry_file_path of this AgentInfo.
        :type: str
        """
        self._entry_file_path = entry_file_path

    @property
    def dependencies_file_path(self):
        """
        Gets the dependencies_file_path of this AgentInfo.
        The path to dependencies file.


        :return: The dependencies_file_path of this AgentInfo.
        :rtype: str
        """
        return self._dependencies_file_path

    @dependencies_file_path.setter
    def dependencies_file_path(self, dependencies_file_path):
        """
        Sets the dependencies_file_path of this AgentInfo.
        The path to dependencies file.


        :param dependencies_file_path: The dependencies_file_path of this AgentInfo.
        :type: str
        """
        self._dependencies_file_path = dependencies_file_path

    @property
    def lifecycle_state(self):
        """
        Gets the lifecycle_state of this AgentInfo.
        The current state of the agent.


        :return: The lifecycle_state of this AgentInfo.
        :rtype: str
        """
        return self._lifecycle_state

    @lifecycle_state.setter
    def lifecycle_state(self, lifecycle_state):
        """
        Sets the lifecycle_state of this AgentInfo.
        The current state of the agent.


        :param lifecycle_state: The lifecycle_state of this AgentInfo.
        :type: str
        """
        self._lifecycle_state = lifecycle_state

    @property
    def lifecycle_details(self):
        """
        Gets the lifecycle_details of this AgentInfo.
        A message that describes the current state of the agent in more detail. For example,
        can be used to provide actionable information for a resource in the Failed state.


        :return: The lifecycle_details of this AgentInfo.
        :rtype: str
        """
        return self._lifecycle_details

    @lifecycle_details.setter
    def lifecycle_details(self, lifecycle_details):
        """
        Sets the lifecycle_details of this AgentInfo.
        A message that describes the current state of the agent in more detail. For example,
        can be used to provide actionable information for a resource in the Failed state.


        :param lifecycle_details: The lifecycle_details of this AgentInfo.
        :type: str
        """
        self._lifecycle_details = lifecycle_details

    @property
    def compute_key(self):
        """
        Gets the compute_key of this AgentInfo.
        The key of the agent compute associated with this agent.


        :return: The compute_key of this AgentInfo.
        :rtype: str
        """
        return self._compute_key

    @compute_key.setter
    def compute_key(self, compute_key):
        """
        Sets the compute_key of this AgentInfo.
        The key of the agent compute associated with this agent.


        :param compute_key: The compute_key of this AgentInfo.
        :type: str
        """
        self._compute_key = compute_key

    @property
    def time_created(self):
        """
        Gets the time_created of this AgentInfo.
        The date and time the agent was created.


        :return: The time_created of this AgentInfo.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this AgentInfo.
        The date and time the agent was created.


        :param time_created: The time_created of this AgentInfo.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this AgentInfo.
        The date and time the agent was updated.


        :return: The time_updated of this AgentInfo.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this AgentInfo.
        The date and time the agent was updated.


        :param time_updated: The time_updated of this AgentInfo.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def created_by(self):
        """
        Gets the created_by of this AgentInfo.
        The OCID of the user/principal who created the agent.


        :return: The created_by of this AgentInfo.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this AgentInfo.
        The OCID of the user/principal who created the agent.


        :param created_by: The created_by of this AgentInfo.
        :type: str
        """
        self._created_by = created_by

    @property
    def updated_by(self):
        """
        Gets the updated_by of this AgentInfo.
        The ID of the user who last updated the schema.


        :return: The updated_by of this AgentInfo.
        :rtype: str
        """
        return self._updated_by

    @updated_by.setter
    def updated_by(self, updated_by):
        """
        Sets the updated_by of this AgentInfo.
        The ID of the user who last updated the schema.


        :param updated_by: The updated_by of this AgentInfo.
        :type: str
        """
        self._updated_by = updated_by

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
