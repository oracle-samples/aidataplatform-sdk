# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class Agent(object):
    """
    An agent is a sequence of nodes and edges defining an end-to-end agentic application. | A diagram can be composed of multiple nodes, each node being a single agent or a multi-agent system, working independently | or collaboratively to accomplish an overall objective.
    """

    #: A constant which can be used with the type property of a Agent.
    #: This constant has a value of "CANVAS"
    TYPE_CANVAS = "CANVAS"

    #: A constant which can be used with the type property of a Agent.
    #: This constant has a value of "CODE"
    TYPE_CODE = "CODE"

    #: A constant which can be used with the lifecycle_state property of a Agent.
    #: This constant has a value of "DRAFT"
    LIFECYCLE_STATE_DRAFT = "DRAFT"

    #: A constant which can be used with the lifecycle_state property of a Agent.
    #: This constant has a value of "DEPLOYED"
    LIFECYCLE_STATE_DEPLOYED = "DEPLOYED"

    def __init__(self, **kwargs):
        """
        Initializes a new Agent object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this Agent.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this Agent.
        :type display_name: str

        :param workspace_key:
            The value to assign to the workspace_key property of this Agent.
        :type workspace_key: str

        :param description:
            The value to assign to the description property of this Agent.
        :type description: str

        :param path_info:
            The value to assign to the path_info property of this Agent.
        :type path_info: str

        :param type:
            The value to assign to the type property of this Agent.
            Allowed values for this property are: "CANVAS", "CODE", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type type: str

        :param entry_file_path:
            The value to assign to the entry_file_path property of this Agent.
        :type entry_file_path: str

        :param dependencies_file_path:
            The value to assign to the dependencies_file_path property of this Agent.
        :type dependencies_file_path: str

        :param deployment_compute_key:
            The value to assign to the deployment_compute_key property of this Agent.
        :type deployment_compute_key: str

        :param deployment_mode:
            The value to assign to the deployment_mode property of this Agent.
        :type deployment_mode: str

        :param uri:
            The value to assign to the uri property of this Agent.
        :type uri: str

        :param uri_state:
            The value to assign to the uri_state property of this Agent.
        :type uri_state: str

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this Agent.
            Allowed values for this property are: "DRAFT", "DEPLOYED", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type lifecycle_state: str

        :param lifecycle_details:
            The value to assign to the lifecycle_details property of this Agent.
        :type lifecycle_details: str

        :param time_created:
            The value to assign to the time_created property of this Agent.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this Agent.
        :type time_updated: datetime

        :param created_by:
            The value to assign to the created_by property of this Agent.
        :type created_by: str

        :param updated_by:
            The value to assign to the updated_by property of this Agent.
        :type updated_by: str

        :param compute_key:
            The value to assign to the compute_key property of this Agent.
        :type compute_key: str

        :param diagram:
            The value to assign to the diagram property of this Agent.
        :type diagram: oci.aidataplatform_dp.models.AgentDiagram

        :param guardrails:
            The value to assign to the guardrails property of this Agent.
        :type guardrails: oci.aidataplatform_dp.models.GuardrailsConfiguration

        :param session_config:
            The value to assign to the session_config property of this Agent.
        :type session_config: oci.aidataplatform_dp.models.SessionConfiguration

        :param agent_card_config:
            The value to assign to the agent_card_config property of this Agent.
        :type agent_card_config: oci.aidataplatform_dp.models.AgentCardConfigDetail

        :param version:
            The value to assign to the version property of this Agent.
        :type version: int

        """
        self.swagger_types = {
            'key': 'str',
            'display_name': 'str',
            'workspace_key': 'str',
            'description': 'str',
            'path_info': 'str',
            'type': 'str',
            'entry_file_path': 'str',
            'dependencies_file_path': 'str',
            'deployment_compute_key': 'str',
            'deployment_mode': 'str',
            'uri': 'str',
            'uri_state': 'str',
            'lifecycle_state': 'str',
            'lifecycle_details': 'str',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'created_by': 'str',
            'updated_by': 'str',
            'compute_key': 'str',
            'diagram': 'AgentDiagram',
            'guardrails': 'GuardrailsConfiguration',
            'session_config': 'SessionConfiguration',
            'agent_card_config': 'AgentCardConfigDetail',
            'version': 'int'
        }

        self.attribute_map = {
            'key': 'key',
            'display_name': 'displayName',
            'workspace_key': 'workspaceKey',
            'description': 'description',
            'path_info': 'pathInfo',
            'type': 'type',
            'entry_file_path': 'entryFilePath',
            'dependencies_file_path': 'dependenciesFilePath',
            'deployment_compute_key': 'deploymentComputeKey',
            'deployment_mode': 'deploymentMode',
            'uri': 'uri',
            'uri_state': 'uriState',
            'lifecycle_state': 'lifecycleState',
            'lifecycle_details': 'lifecycleDetails',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'created_by': 'createdBy',
            'updated_by': 'updatedBy',
            'compute_key': 'computeKey',
            'diagram': 'diagram',
            'guardrails': 'guardrails',
            'session_config': 'sessionConfig',
            'agent_card_config': 'agentCardConfig',
            'version': 'version'
        }

        self._key = None
        self._display_name = None
        self._workspace_key = None
        self._description = None
        self._path_info = None
        self._type = None
        self._entry_file_path = None
        self._dependencies_file_path = None
        self._deployment_compute_key = None
        self._deployment_mode = None
        self._uri = None
        self._uri_state = None
        self._lifecycle_state = None
        self._lifecycle_details = None
        self._time_created = None
        self._time_updated = None
        self._created_by = None
        self._updated_by = None
        self._compute_key = None
        self._diagram = None
        self._guardrails = None
        self._session_config = None
        self._agent_card_config = None
        self._version = None

    @property
    def key(self):
        """
        **[Required]** Gets the key of this Agent.
        The unique identifier (UUID) of the agent.


        :return: The key of this Agent.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this Agent.
        The unique identifier (UUID) of the agent.


        :param key: The key of this Agent.
        :type: str
        """
        self._key = key

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this Agent.
        Agent name.


        :return: The display_name of this Agent.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this Agent.
        Agent name.


        :param display_name: The display_name of this Agent.
        :type: str
        """
        self._display_name = display_name

    @property
    def workspace_key(self):
        """
        Gets the workspace_key of this Agent.
        The key of the workspace to which this agent belongs.


        :return: The workspace_key of this Agent.
        :rtype: str
        """
        return self._workspace_key

    @workspace_key.setter
    def workspace_key(self, workspace_key):
        """
        Sets the workspace_key of this Agent.
        The key of the workspace to which this agent belongs.


        :param workspace_key: The workspace_key of this Agent.
        :type: str
        """
        self._workspace_key = workspace_key

    @property
    def description(self):
        """
        **[Required]** Gets the description of this Agent.
        Agent description.


        :return: The description of this Agent.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this Agent.
        Agent description.


        :param description: The description of this Agent.
        :type: str
        """
        self._description = description

    @property
    def path_info(self):
        """
        **[Required]** Gets the path_info of this Agent.
        Path inside volume where the agent JSON is written.


        :return: The path_info of this Agent.
        :rtype: str
        """
        return self._path_info

    @path_info.setter
    def path_info(self, path_info):
        """
        Sets the path_info of this Agent.
        Path inside volume where the agent JSON is written.


        :param path_info: The path_info of this Agent.
        :type: str
        """
        self._path_info = path_info

    @property
    def type(self):
        """
        Gets the type of this Agent.
        The type of agent (Canvas or Code).

        Allowed values for this property are: "CANVAS", "CODE", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The type of this Agent.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this Agent.
        The type of agent (Canvas or Code).


        :param type: The type of this Agent.
        :type: str
        """
        allowed_values = ["CANVAS", "CODE"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            type = 'UNKNOWN_ENUM_VALUE'
        self._type = type

    @property
    def entry_file_path(self):
        """
        Gets the entry_file_path of this Agent.
        The path to project entry file.


        :return: The entry_file_path of this Agent.
        :rtype: str
        """
        return self._entry_file_path

    @entry_file_path.setter
    def entry_file_path(self, entry_file_path):
        """
        Sets the entry_file_path of this Agent.
        The path to project entry file.


        :param entry_file_path: The entry_file_path of this Agent.
        :type: str
        """
        self._entry_file_path = entry_file_path

    @property
    def dependencies_file_path(self):
        """
        Gets the dependencies_file_path of this Agent.
        The path to dependencies file.


        :return: The dependencies_file_path of this Agent.
        :rtype: str
        """
        return self._dependencies_file_path

    @dependencies_file_path.setter
    def dependencies_file_path(self, dependencies_file_path):
        """
        Sets the dependencies_file_path of this Agent.
        The path to dependencies file.


        :param dependencies_file_path: The dependencies_file_path of this Agent.
        :type: str
        """
        self._dependencies_file_path = dependencies_file_path

    @property
    def deployment_compute_key(self):
        """
        Gets the deployment_compute_key of this Agent.
        The key of the compute where agent is deployed.


        :return: The deployment_compute_key of this Agent.
        :rtype: str
        """
        return self._deployment_compute_key

    @deployment_compute_key.setter
    def deployment_compute_key(self, deployment_compute_key):
        """
        Sets the deployment_compute_key of this Agent.
        The key of the compute where agent is deployed.


        :param deployment_compute_key: The deployment_compute_key of this Agent.
        :type: str
        """
        self._deployment_compute_key = deployment_compute_key

    @property
    def deployment_mode(self):
        """
        Gets the deployment_mode of this Agent.
        Agent deployment mode.


        :return: The deployment_mode of this Agent.
        :rtype: str
        """
        return self._deployment_mode

    @deployment_mode.setter
    def deployment_mode(self, deployment_mode):
        """
        Sets the deployment_mode of this Agent.
        Agent deployment mode.


        :param deployment_mode: The deployment_mode of this Agent.
        :type: str
        """
        self._deployment_mode = deployment_mode

    @property
    def uri(self):
        """
        Gets the uri of this Agent.
        Agent URI.


        :return: The uri of this Agent.
        :rtype: str
        """
        return self._uri

    @uri.setter
    def uri(self, uri):
        """
        Sets the uri of this Agent.
        Agent URI.


        :param uri: The uri of this Agent.
        :type: str
        """
        self._uri = uri

    @property
    def uri_state(self):
        """
        Gets the uri_state of this Agent.
        Agent URI state.


        :return: The uri_state of this Agent.
        :rtype: str
        """
        return self._uri_state

    @uri_state.setter
    def uri_state(self, uri_state):
        """
        Sets the uri_state of this Agent.
        Agent URI state.


        :param uri_state: The uri_state of this Agent.
        :type: str
        """
        self._uri_state = uri_state

    @property
    def lifecycle_state(self):
        """
        **[Required]** Gets the lifecycle_state of this Agent.
        The current state of the agent.

        Allowed values for this property are: "DRAFT", "DEPLOYED", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The lifecycle_state of this Agent.
        :rtype: str
        """
        return self._lifecycle_state

    @lifecycle_state.setter
    def lifecycle_state(self, lifecycle_state):
        """
        Sets the lifecycle_state of this Agent.
        The current state of the agent.


        :param lifecycle_state: The lifecycle_state of this Agent.
        :type: str
        """
        allowed_values = ["DRAFT", "DEPLOYED"]
        if not value_allowed_none_or_none_sentinel(lifecycle_state, allowed_values):
            lifecycle_state = 'UNKNOWN_ENUM_VALUE'
        self._lifecycle_state = lifecycle_state

    @property
    def lifecycle_details(self):
        """
        Gets the lifecycle_details of this Agent.
        A message that describes the current state of the agent in more detail. For example,
        can be used to provide actionable information for a resource in the Failed state.


        :return: The lifecycle_details of this Agent.
        :rtype: str
        """
        return self._lifecycle_details

    @lifecycle_details.setter
    def lifecycle_details(self, lifecycle_details):
        """
        Sets the lifecycle_details of this Agent.
        A message that describes the current state of the agent in more detail. For example,
        can be used to provide actionable information for a resource in the Failed state.


        :param lifecycle_details: The lifecycle_details of this Agent.
        :type: str
        """
        self._lifecycle_details = lifecycle_details

    @property
    def time_created(self):
        """
        Gets the time_created of this Agent.
        The date and time the agent was created.


        :return: The time_created of this Agent.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this Agent.
        The date and time the agent was created.


        :param time_created: The time_created of this Agent.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this Agent.
        The date and time the agent was updated.


        :return: The time_updated of this Agent.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this Agent.
        The date and time the agent was updated.


        :param time_updated: The time_updated of this Agent.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def created_by(self):
        """
        Gets the created_by of this Agent.
        The OCID of the user/principal who created the agent.


        :return: The created_by of this Agent.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this Agent.
        The OCID of the user/principal who created the agent.


        :param created_by: The created_by of this Agent.
        :type: str
        """
        self._created_by = created_by

    @property
    def updated_by(self):
        """
        Gets the updated_by of this Agent.
        The ID of the user who last updated the schema.


        :return: The updated_by of this Agent.
        :rtype: str
        """
        return self._updated_by

    @updated_by.setter
    def updated_by(self, updated_by):
        """
        Sets the updated_by of this Agent.
        The ID of the user who last updated the schema.


        :param updated_by: The updated_by of this Agent.
        :type: str
        """
        self._updated_by = updated_by

    @property
    def compute_key(self):
        """
        Gets the compute_key of this Agent.
        The key of the agent compute associated with this agent.


        :return: The compute_key of this Agent.
        :rtype: str
        """
        return self._compute_key

    @compute_key.setter
    def compute_key(self, compute_key):
        """
        Sets the compute_key of this Agent.
        The key of the agent compute associated with this agent.


        :param compute_key: The compute_key of this Agent.
        :type: str
        """
        self._compute_key = compute_key

    @property
    def diagram(self):
        """
        Gets the diagram of this Agent.

        :return: The diagram of this Agent.
        :rtype: oci.aidataplatform_dp.models.AgentDiagram
        """
        return self._diagram

    @diagram.setter
    def diagram(self, diagram):
        """
        Sets the diagram of this Agent.

        :param diagram: The diagram of this Agent.
        :type: oci.aidataplatform_dp.models.AgentDiagram
        """
        self._diagram = diagram

    @property
    def guardrails(self):
        """
        Gets the guardrails of this Agent.

        :return: The guardrails of this Agent.
        :rtype: oci.aidataplatform_dp.models.GuardrailsConfiguration
        """
        return self._guardrails

    @guardrails.setter
    def guardrails(self, guardrails):
        """
        Sets the guardrails of this Agent.

        :param guardrails: The guardrails of this Agent.
        :type: oci.aidataplatform_dp.models.GuardrailsConfiguration
        """
        self._guardrails = guardrails

    @property
    def session_config(self):
        """
        Gets the session_config of this Agent.

        :return: The session_config of this Agent.
        :rtype: oci.aidataplatform_dp.models.SessionConfiguration
        """
        return self._session_config

    @session_config.setter
    def session_config(self, session_config):
        """
        Sets the session_config of this Agent.

        :param session_config: The session_config of this Agent.
        :type: oci.aidataplatform_dp.models.SessionConfiguration
        """
        self._session_config = session_config

    @property
    def agent_card_config(self):
        """
        Gets the agent_card_config of this Agent.

        :return: The agent_card_config of this Agent.
        :rtype: oci.aidataplatform_dp.models.AgentCardConfigDetail
        """
        return self._agent_card_config

    @agent_card_config.setter
    def agent_card_config(self, agent_card_config):
        """
        Sets the agent_card_config of this Agent.

        :param agent_card_config: The agent_card_config of this Agent.
        :type: oci.aidataplatform_dp.models.AgentCardConfigDetail
        """
        self._agent_card_config = agent_card_config

    @property
    def version(self):
        """
        Gets the version of this Agent.
        A number indicating the version of the record. Each time the record is updated, this version will be incremented. This will be used for optimistic locking.


        :return: The version of this Agent.
        :rtype: int
        """
        return self._version

    @version.setter
    def version(self, version):
        """
        Sets the version of this Agent.
        A number indicating the version of the record. Each time the record is updated, this version will be incremented. This will be used for optimistic locking.


        :param version: The version of this Agent.
        :type: int
        """
        self._version = version

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
