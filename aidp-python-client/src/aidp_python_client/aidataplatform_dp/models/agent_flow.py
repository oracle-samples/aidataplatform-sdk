# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AgentFlow(object):
    """
    An agent flow is a sequence of nodes and edges defining an end-to-end agentic application. | A flow can be composed of multiple nodes, each node being a single agent or a multi-agent system, working independently | or collaboratively to accomplish an overall objective
    """

    #: A constant which can be used with the type property of a AgentFlow.
    #: This constant has a value of "CANVAS"
    TYPE_CANVAS = "CANVAS"

    #: A constant which can be used with the type property of a AgentFlow.
    #: This constant has a value of "CODE"
    TYPE_CODE = "CODE"

    #: A constant which can be used with the lifecycle_state property of a AgentFlow.
    #: This constant has a value of "DRAFT"
    LIFECYCLE_STATE_DRAFT = "DRAFT"

    #: A constant which can be used with the lifecycle_state property of a AgentFlow.
    #: This constant has a value of "DEPLOYED"
    LIFECYCLE_STATE_DEPLOYED = "DEPLOYED"

    def __init__(self, **kwargs):
        """
        Initializes a new AgentFlow object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this AgentFlow.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this AgentFlow.
        :type display_name: str

        :param workspace_key:
            The value to assign to the workspace_key property of this AgentFlow.
        :type workspace_key: str

        :param description:
            The value to assign to the description property of this AgentFlow.
        :type description: str

        :param path_info:
            The value to assign to the path_info property of this AgentFlow.
        :type path_info: str

        :param type:
            The value to assign to the type property of this AgentFlow.
            Allowed values for this property are: "CANVAS", "CODE"
        :type type: str

        :param entry_file_path:
            The value to assign to the entry_file_path property of this AgentFlow.
        :type entry_file_path: str

        :param dependencies_file_path:
            The value to assign to the dependencies_file_path property of this AgentFlow.
        :type dependencies_file_path: str

        :param deployment_compute_key:
            The value to assign to the deployment_compute_key property of this AgentFlow.
        :type deployment_compute_key: str

        :param deployment_mode:
            The value to assign to the deployment_mode property of this AgentFlow.
        :type deployment_mode: str

        :param uri:
            The value to assign to the uri property of this AgentFlow.
        :type uri: str

        :param uri_state:
            The value to assign to the uri_state property of this AgentFlow.
        :type uri_state: str

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this AgentFlow.
            Allowed values for this property are: "DRAFT", "DEPLOYED"
        :type lifecycle_state: str

        :param lifecycle_details:
            The value to assign to the lifecycle_details property of this AgentFlow.
        :type lifecycle_details: str

        :param time_created:
            The value to assign to the time_created property of this AgentFlow.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this AgentFlow.
        :type time_updated: datetime

        :param created_by:
            The value to assign to the created_by property of this AgentFlow.
        :type created_by: str

        :param updated_by:
            The value to assign to the updated_by property of this AgentFlow.
        :type updated_by: str

        :param compute_key:
            The value to assign to the compute_key property of this AgentFlow.
        :type compute_key: str

        :param diagram:
            The value to assign to the diagram property of this AgentFlow.
        :type diagram: oci.aidataplatform_dp.models.AgentFlowDiagram

        :param guardrails:
            The value to assign to the guardrails property of this AgentFlow.
        :type guardrails: oci.aidataplatform_dp.models.GuardrailsConfiguration

        :param session_config:
            The value to assign to the session_config property of this AgentFlow.
        :type session_config: oci.aidataplatform_dp.models.SessionConfiguration

        :param agent_card_config:
            The value to assign to the agent_card_config property of this AgentFlow.
        :type agent_card_config: oci.aidataplatform_dp.models.AgentCardConfigDetail

        :param version:
            The value to assign to the version property of this AgentFlow.
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
            'diagram': 'AgentFlowDiagram',
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
        **[Required]** Gets the key of this AgentFlow.
        The unique identifier (UUID) of the Agent flow


        :return: The key of this AgentFlow.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this AgentFlow.
        The unique identifier (UUID) of the Agent flow


        :param key: The key of this AgentFlow.
        :type: str
        """
        self._key = key

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this AgentFlow.
        AgentFlow name.


        :return: The display_name of this AgentFlow.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this AgentFlow.
        AgentFlow name.


        :param display_name: The display_name of this AgentFlow.
        :type: str
        """
        self._display_name = display_name

    @property
    def workspace_key(self):
        """
        Gets the workspace_key of this AgentFlow.
        The key of the workspace to which this Agent flow belongs.


        :return: The workspace_key of this AgentFlow.
        :rtype: str
        """
        return self._workspace_key

    @workspace_key.setter
    def workspace_key(self, workspace_key):
        """
        Sets the workspace_key of this AgentFlow.
        The key of the workspace to which this Agent flow belongs.


        :param workspace_key: The workspace_key of this AgentFlow.
        :type: str
        """
        self._workspace_key = workspace_key

    @property
    def description(self):
        """
        **[Required]** Gets the description of this AgentFlow.
        AgentFlow description.


        :return: The description of this AgentFlow.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this AgentFlow.
        AgentFlow description.


        :param description: The description of this AgentFlow.
        :type: str
        """
        self._description = description

    @property
    def path_info(self):
        """
        **[Required]** Gets the path_info of this AgentFlow.
        Path inside volume where the agentFlow json is written


        :return: The path_info of this AgentFlow.
        :rtype: str
        """
        return self._path_info

    @path_info.setter
    def path_info(self, path_info):
        """
        Sets the path_info of this AgentFlow.
        Path inside volume where the agentFlow json is written


        :param path_info: The path_info of this AgentFlow.
        :type: str
        """
        self._path_info = path_info

    @property
    def type(self):
        """
        Gets the type of this AgentFlow.
        The type of Agent Flow (Canvas or Code)

        Allowed values for this property are: "CANVAS", "CODE"


        :return: The type of this AgentFlow.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this AgentFlow.
        The type of Agent Flow (Canvas or Code)


        :param type: The type of this AgentFlow.
        :type: str
        """
        allowed_values = ["CANVAS", "CODE"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            raise ValueError(
                "Invalid value for `type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._type = type

    @property
    def entry_file_path(self):
        """
        Gets the entry_file_path of this AgentFlow.
        The path to project entry file


        :return: The entry_file_path of this AgentFlow.
        :rtype: str
        """
        return self._entry_file_path

    @entry_file_path.setter
    def entry_file_path(self, entry_file_path):
        """
        Sets the entry_file_path of this AgentFlow.
        The path to project entry file


        :param entry_file_path: The entry_file_path of this AgentFlow.
        :type: str
        """
        self._entry_file_path = entry_file_path

    @property
    def dependencies_file_path(self):
        """
        Gets the dependencies_file_path of this AgentFlow.
        The path to dependencies file


        :return: The dependencies_file_path of this AgentFlow.
        :rtype: str
        """
        return self._dependencies_file_path

    @dependencies_file_path.setter
    def dependencies_file_path(self, dependencies_file_path):
        """
        Sets the dependencies_file_path of this AgentFlow.
        The path to dependencies file


        :param dependencies_file_path: The dependencies_file_path of this AgentFlow.
        :type: str
        """
        self._dependencies_file_path = dependencies_file_path

    @property
    def deployment_compute_key(self):
        """
        Gets the deployment_compute_key of this AgentFlow.
        The key of the Compute where Agent Flow is deployed


        :return: The deployment_compute_key of this AgentFlow.
        :rtype: str
        """
        return self._deployment_compute_key

    @deployment_compute_key.setter
    def deployment_compute_key(self, deployment_compute_key):
        """
        Sets the deployment_compute_key of this AgentFlow.
        The key of the Compute where Agent Flow is deployed


        :param deployment_compute_key: The deployment_compute_key of this AgentFlow.
        :type: str
        """
        self._deployment_compute_key = deployment_compute_key

    @property
    def deployment_mode(self):
        """
        Gets the deployment_mode of this AgentFlow.
        Agent flow deployment mode.


        :return: The deployment_mode of this AgentFlow.
        :rtype: str
        """
        return self._deployment_mode

    @deployment_mode.setter
    def deployment_mode(self, deployment_mode):
        """
        Sets the deployment_mode of this AgentFlow.
        Agent flow deployment mode.


        :param deployment_mode: The deployment_mode of this AgentFlow.
        :type: str
        """
        self._deployment_mode = deployment_mode

    @property
    def uri(self):
        """
        Gets the uri of this AgentFlow.
        Agent flow uri.


        :return: The uri of this AgentFlow.
        :rtype: str
        """
        return self._uri

    @uri.setter
    def uri(self, uri):
        """
        Sets the uri of this AgentFlow.
        Agent flow uri.


        :param uri: The uri of this AgentFlow.
        :type: str
        """
        self._uri = uri

    @property
    def uri_state(self):
        """
        Gets the uri_state of this AgentFlow.
        Agent flow uri state.


        :return: The uri_state of this AgentFlow.
        :rtype: str
        """
        return self._uri_state

    @uri_state.setter
    def uri_state(self, uri_state):
        """
        Sets the uri_state of this AgentFlow.
        Agent flow uri state.


        :param uri_state: The uri_state of this AgentFlow.
        :type: str
        """
        self._uri_state = uri_state

    @property
    def lifecycle_state(self):
        """
        **[Required]** Gets the lifecycle_state of this AgentFlow.
        The current state of the Agent Flow.

        Allowed values for this property are: "DRAFT", "DEPLOYED"


        :return: The lifecycle_state of this AgentFlow.
        :rtype: str
        """
        return self._lifecycle_state

    @lifecycle_state.setter
    def lifecycle_state(self, lifecycle_state):
        """
        Sets the lifecycle_state of this AgentFlow.
        The current state of the Agent Flow.


        :param lifecycle_state: The lifecycle_state of this AgentFlow.
        :type: str
        """
        allowed_values = ["DRAFT", "DEPLOYED"]
        if not value_allowed_none_or_none_sentinel(lifecycle_state, allowed_values):
            raise ValueError(
                "Invalid value for `lifecycle_state`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._lifecycle_state = lifecycle_state

    @property
    def lifecycle_details(self):
        """
        Gets the lifecycle_details of this AgentFlow.
        A message that describes the current state of the Agent Flow in more detail. For example,
        can be used to provide actionable information for a resource in the Failed state.


        :return: The lifecycle_details of this AgentFlow.
        :rtype: str
        """
        return self._lifecycle_details

    @lifecycle_details.setter
    def lifecycle_details(self, lifecycle_details):
        """
        Sets the lifecycle_details of this AgentFlow.
        A message that describes the current state of the Agent Flow in more detail. For example,
        can be used to provide actionable information for a resource in the Failed state.


        :param lifecycle_details: The lifecycle_details of this AgentFlow.
        :type: str
        """
        self._lifecycle_details = lifecycle_details

    @property
    def time_created(self):
        """
        Gets the time_created of this AgentFlow.
        The date and time the Agent flow was created.


        :return: The time_created of this AgentFlow.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this AgentFlow.
        The date and time the Agent flow was created.


        :param time_created: The time_created of this AgentFlow.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this AgentFlow.
        The date and time the Agent flow was updated.


        :return: The time_updated of this AgentFlow.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this AgentFlow.
        The date and time the Agent flow was updated.


        :param time_updated: The time_updated of this AgentFlow.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def created_by(self):
        """
        Gets the created_by of this AgentFlow.
        The OCID of the user/principal who created the Agent flow.


        :return: The created_by of this AgentFlow.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this AgentFlow.
        The OCID of the user/principal who created the Agent flow.


        :param created_by: The created_by of this AgentFlow.
        :type: str
        """
        self._created_by = created_by

    @property
    def updated_by(self):
        """
        Gets the updated_by of this AgentFlow.
        The ID of the user who last updated the schema.


        :return: The updated_by of this AgentFlow.
        :rtype: str
        """
        return self._updated_by

    @updated_by.setter
    def updated_by(self, updated_by):
        """
        Sets the updated_by of this AgentFlow.
        The ID of the user who last updated the schema.


        :param updated_by: The updated_by of this AgentFlow.
        :type: str
        """
        self._updated_by = updated_by

    @property
    def compute_key(self):
        """
        Gets the compute_key of this AgentFlow.
        The key of the Agent Flow Compute associated with this Agent Flow


        :return: The compute_key of this AgentFlow.
        :rtype: str
        """
        return self._compute_key

    @compute_key.setter
    def compute_key(self, compute_key):
        """
        Sets the compute_key of this AgentFlow.
        The key of the Agent Flow Compute associated with this Agent Flow


        :param compute_key: The compute_key of this AgentFlow.
        :type: str
        """
        self._compute_key = compute_key

    @property
    def diagram(self):
        """
        Gets the diagram of this AgentFlow.

        :return: The diagram of this AgentFlow.
        :rtype: oci.aidataplatform_dp.models.AgentFlowDiagram
        """
        return self._diagram

    @diagram.setter
    def diagram(self, diagram):
        """
        Sets the diagram of this AgentFlow.

        :param diagram: The diagram of this AgentFlow.
        :type: oci.aidataplatform_dp.models.AgentFlowDiagram
        """
        self._diagram = diagram

    @property
    def guardrails(self):
        """
        Gets the guardrails of this AgentFlow.

        :return: The guardrails of this AgentFlow.
        :rtype: oci.aidataplatform_dp.models.GuardrailsConfiguration
        """
        return self._guardrails

    @guardrails.setter
    def guardrails(self, guardrails):
        """
        Sets the guardrails of this AgentFlow.

        :param guardrails: The guardrails of this AgentFlow.
        :type: oci.aidataplatform_dp.models.GuardrailsConfiguration
        """
        self._guardrails = guardrails

    @property
    def session_config(self):
        """
        Gets the session_config of this AgentFlow.

        :return: The session_config of this AgentFlow.
        :rtype: oci.aidataplatform_dp.models.SessionConfiguration
        """
        return self._session_config

    @session_config.setter
    def session_config(self, session_config):
        """
        Sets the session_config of this AgentFlow.

        :param session_config: The session_config of this AgentFlow.
        :type: oci.aidataplatform_dp.models.SessionConfiguration
        """
        self._session_config = session_config

    @property
    def agent_card_config(self):
        """
        Gets the agent_card_config of this AgentFlow.

        :return: The agent_card_config of this AgentFlow.
        :rtype: oci.aidataplatform_dp.models.AgentCardConfigDetail
        """
        return self._agent_card_config

    @agent_card_config.setter
    def agent_card_config(self, agent_card_config):
        """
        Sets the agent_card_config of this AgentFlow.

        :param agent_card_config: The agent_card_config of this AgentFlow.
        :type: oci.aidataplatform_dp.models.AgentCardConfigDetail
        """
        self._agent_card_config = agent_card_config

    @property
    def version(self):
        """
        Gets the version of this AgentFlow.
        A number indicating the version of the record. Each time the record is updated, this version will be incremented. This will be used for optimistic locking


        :return: The version of this AgentFlow.
        :rtype: int
        """
        return self._version

    @version.setter
    def version(self, version):
        """
        Sets the version of this AgentFlow.
        A number indicating the version of the record. Each time the record is updated, this version will be incremented. This will be used for optimistic locking


        :param version: The version of this AgentFlow.
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
