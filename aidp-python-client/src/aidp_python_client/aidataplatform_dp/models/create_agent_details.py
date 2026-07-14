# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateAgentDetails(object):
    """
    The data to create a agent.
    """

    #: A constant which can be used with the type property of a CreateAgentDetails.
    #: This constant has a value of "CANVAS"
    TYPE_CANVAS = "CANVAS"

    #: A constant which can be used with the type property of a CreateAgentDetails.
    #: This constant has a value of "CODE"
    TYPE_CODE = "CODE"

    def __init__(self, **kwargs):
        """
        Initializes a new CreateAgentDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param display_name:
            The value to assign to the display_name property of this CreateAgentDetails.
        :type display_name: str

        :param description:
            The value to assign to the description property of this CreateAgentDetails.
        :type description: str

        :param path_info:
            The value to assign to the path_info property of this CreateAgentDetails.
        :type path_info: str

        :param type:
            The value to assign to the type property of this CreateAgentDetails.
            Allowed values for this property are: "CANVAS", "CODE"
        :type type: str

        :param entry_file_path:
            The value to assign to the entry_file_path property of this CreateAgentDetails.
        :type entry_file_path: str

        :param dependencies_file_path:
            The value to assign to the dependencies_file_path property of this CreateAgentDetails.
        :type dependencies_file_path: str

        :param compute_key:
            The value to assign to the compute_key property of this CreateAgentDetails.
        :type compute_key: str

        :param guardrails:
            The value to assign to the guardrails property of this CreateAgentDetails.
        :type guardrails: oci.aidataplatform_dp.models.GuardrailsConfiguration

        :param session_config:
            The value to assign to the session_config property of this CreateAgentDetails.
        :type session_config: oci.aidataplatform_dp.models.SessionConfiguration

        :param agent_card_config:
            The value to assign to the agent_card_config property of this CreateAgentDetails.
        :type agent_card_config: oci.aidataplatform_dp.models.AgentCardConfigDetail

        :param diagram:
            The value to assign to the diagram property of this CreateAgentDetails.
        :type diagram: oci.aidataplatform_dp.models.AgentDiagram

        """
        self.swagger_types = {
            'display_name': 'str',
            'description': 'str',
            'path_info': 'str',
            'type': 'str',
            'entry_file_path': 'str',
            'dependencies_file_path': 'str',
            'compute_key': 'str',
            'guardrails': 'GuardrailsConfiguration',
            'session_config': 'SessionConfiguration',
            'agent_card_config': 'AgentCardConfigDetail',
            'diagram': 'AgentDiagram'
        }

        self.attribute_map = {
            'display_name': 'displayName',
            'description': 'description',
            'path_info': 'pathInfo',
            'type': 'type',
            'entry_file_path': 'entryFilePath',
            'dependencies_file_path': 'dependenciesFilePath',
            'compute_key': 'computeKey',
            'guardrails': 'guardrails',
            'session_config': 'sessionConfig',
            'agent_card_config': 'agentCardConfig',
            'diagram': 'diagram'
        }

        self._display_name = None
        self._description = None
        self._path_info = None
        self._type = None
        self._entry_file_path = None
        self._dependencies_file_path = None
        self._compute_key = None
        self._guardrails = None
        self._session_config = None
        self._agent_card_config = None
        self._diagram = None

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this CreateAgentDetails.
        Agent name.


        :return: The display_name of this CreateAgentDetails.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this CreateAgentDetails.
        Agent name.


        :param display_name: The display_name of this CreateAgentDetails.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this CreateAgentDetails.
        Agent description.


        :return: The description of this CreateAgentDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this CreateAgentDetails.
        Agent description.


        :param description: The description of this CreateAgentDetails.
        :type: str
        """
        self._description = description

    @property
    def path_info(self):
        """
        **[Required]** Gets the path_info of this CreateAgentDetails.
        Path inside volume where the agent JSON is written.


        :return: The path_info of this CreateAgentDetails.
        :rtype: str
        """
        return self._path_info

    @path_info.setter
    def path_info(self, path_info):
        """
        Sets the path_info of this CreateAgentDetails.
        Path inside volume where the agent JSON is written.


        :param path_info: The path_info of this CreateAgentDetails.
        :type: str
        """
        self._path_info = path_info

    @property
    def type(self):
        """
        Gets the type of this CreateAgentDetails.
        The type of agent (Canvas or Code).

        Allowed values for this property are: "CANVAS", "CODE"


        :return: The type of this CreateAgentDetails.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this CreateAgentDetails.
        The type of agent (Canvas or Code).


        :param type: The type of this CreateAgentDetails.
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
        Gets the entry_file_path of this CreateAgentDetails.
        The path to project entry file.


        :return: The entry_file_path of this CreateAgentDetails.
        :rtype: str
        """
        return self._entry_file_path

    @entry_file_path.setter
    def entry_file_path(self, entry_file_path):
        """
        Sets the entry_file_path of this CreateAgentDetails.
        The path to project entry file.


        :param entry_file_path: The entry_file_path of this CreateAgentDetails.
        :type: str
        """
        self._entry_file_path = entry_file_path

    @property
    def dependencies_file_path(self):
        """
        Gets the dependencies_file_path of this CreateAgentDetails.
        The path to dependencies file.


        :return: The dependencies_file_path of this CreateAgentDetails.
        :rtype: str
        """
        return self._dependencies_file_path

    @dependencies_file_path.setter
    def dependencies_file_path(self, dependencies_file_path):
        """
        Sets the dependencies_file_path of this CreateAgentDetails.
        The path to dependencies file.


        :param dependencies_file_path: The dependencies_file_path of this CreateAgentDetails.
        :type: str
        """
        self._dependencies_file_path = dependencies_file_path

    @property
    def compute_key(self):
        """
        Gets the compute_key of this CreateAgentDetails.
        The key of the agent compute associated with this agent.


        :return: The compute_key of this CreateAgentDetails.
        :rtype: str
        """
        return self._compute_key

    @compute_key.setter
    def compute_key(self, compute_key):
        """
        Sets the compute_key of this CreateAgentDetails.
        The key of the agent compute associated with this agent.


        :param compute_key: The compute_key of this CreateAgentDetails.
        :type: str
        """
        self._compute_key = compute_key

    @property
    def guardrails(self):
        """
        Gets the guardrails of this CreateAgentDetails.

        :return: The guardrails of this CreateAgentDetails.
        :rtype: oci.aidataplatform_dp.models.GuardrailsConfiguration
        """
        return self._guardrails

    @guardrails.setter
    def guardrails(self, guardrails):
        """
        Sets the guardrails of this CreateAgentDetails.

        :param guardrails: The guardrails of this CreateAgentDetails.
        :type: oci.aidataplatform_dp.models.GuardrailsConfiguration
        """
        self._guardrails = guardrails

    @property
    def session_config(self):
        """
        Gets the session_config of this CreateAgentDetails.

        :return: The session_config of this CreateAgentDetails.
        :rtype: oci.aidataplatform_dp.models.SessionConfiguration
        """
        return self._session_config

    @session_config.setter
    def session_config(self, session_config):
        """
        Sets the session_config of this CreateAgentDetails.

        :param session_config: The session_config of this CreateAgentDetails.
        :type: oci.aidataplatform_dp.models.SessionConfiguration
        """
        self._session_config = session_config

    @property
    def agent_card_config(self):
        """
        Gets the agent_card_config of this CreateAgentDetails.

        :return: The agent_card_config of this CreateAgentDetails.
        :rtype: oci.aidataplatform_dp.models.AgentCardConfigDetail
        """
        return self._agent_card_config

    @agent_card_config.setter
    def agent_card_config(self, agent_card_config):
        """
        Sets the agent_card_config of this CreateAgentDetails.

        :param agent_card_config: The agent_card_config of this CreateAgentDetails.
        :type: oci.aidataplatform_dp.models.AgentCardConfigDetail
        """
        self._agent_card_config = agent_card_config

    @property
    def diagram(self):
        """
        Gets the diagram of this CreateAgentDetails.

        :return: The diagram of this CreateAgentDetails.
        :rtype: oci.aidataplatform_dp.models.AgentDiagram
        """
        return self._diagram

    @diagram.setter
    def diagram(self, diagram):
        """
        Sets the diagram of this CreateAgentDetails.

        :param diagram: The diagram of this CreateAgentDetails.
        :type: oci.aidataplatform_dp.models.AgentDiagram
        """
        self._diagram = diagram

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
