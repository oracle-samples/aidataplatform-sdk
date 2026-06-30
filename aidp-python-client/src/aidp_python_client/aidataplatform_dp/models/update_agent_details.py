# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdateAgentDetails(object):
    """
    The data to update a Agent.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new UpdateAgentDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param display_name:
            The value to assign to the display_name property of this UpdateAgentDetails.
        :type display_name: str

        :param description:
            The value to assign to the description property of this UpdateAgentDetails.
        :type description: str

        :param compute_key:
            The value to assign to the compute_key property of this UpdateAgentDetails.
        :type compute_key: str

        :param diagram:
            The value to assign to the diagram property of this UpdateAgentDetails.
        :type diagram: oci.aidataplatform_dp.models.AgentDiagram

        :param entry_file_path:
            The value to assign to the entry_file_path property of this UpdateAgentDetails.
        :type entry_file_path: str

        :param dependencies_file_path:
            The value to assign to the dependencies_file_path property of this UpdateAgentDetails.
        :type dependencies_file_path: str

        :param deleted_nodes:
            The value to assign to the deleted_nodes property of this UpdateAgentDetails.
        :type deleted_nodes: list[str]

        :param updated_nodes:
            The value to assign to the updated_nodes property of this UpdateAgentDetails.
        :type updated_nodes: list[str]

        :param added_nodes:
            The value to assign to the added_nodes property of this UpdateAgentDetails.
        :type added_nodes: list[str]

        :param guardrails:
            The value to assign to the guardrails property of this UpdateAgentDetails.
        :type guardrails: oci.aidataplatform_dp.models.GuardrailsConfiguration

        :param session_config:
            The value to assign to the session_config property of this UpdateAgentDetails.
        :type session_config: oci.aidataplatform_dp.models.SessionConfiguration

        :param agent_card_config:
            The value to assign to the agent_card_config property of this UpdateAgentDetails.
        :type agent_card_config: oci.aidataplatform_dp.models.AgentCardConfigDetail

        """
        self.swagger_types = {
            'display_name': 'str',
            'description': 'str',
            'compute_key': 'str',
            'diagram': 'AgentDiagram',
            'entry_file_path': 'str',
            'dependencies_file_path': 'str',
            'deleted_nodes': 'list[str]',
            'updated_nodes': 'list[str]',
            'added_nodes': 'list[str]',
            'guardrails': 'GuardrailsConfiguration',
            'session_config': 'SessionConfiguration',
            'agent_card_config': 'AgentCardConfigDetail'
        }

        self.attribute_map = {
            'display_name': 'displayName',
            'description': 'description',
            'compute_key': 'computeKey',
            'diagram': 'diagram',
            'entry_file_path': 'entryFilePath',
            'dependencies_file_path': 'dependenciesFilePath',
            'deleted_nodes': 'deletedNodes',
            'updated_nodes': 'updatedNodes',
            'added_nodes': 'addedNodes',
            'guardrails': 'guardrails',
            'session_config': 'sessionConfig',
            'agent_card_config': 'agentCardConfig'
        }

        self._display_name = None
        self._description = None
        self._compute_key = None
        self._diagram = None
        self._entry_file_path = None
        self._dependencies_file_path = None
        self._deleted_nodes = None
        self._updated_nodes = None
        self._added_nodes = None
        self._guardrails = None
        self._session_config = None
        self._agent_card_config = None

    @property
    def display_name(self):
        """
        Gets the display_name of this UpdateAgentDetails.
        Agent name.


        :return: The display_name of this UpdateAgentDetails.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this UpdateAgentDetails.
        Agent name.


        :param display_name: The display_name of this UpdateAgentDetails.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this UpdateAgentDetails.
        Agent description.


        :return: The description of this UpdateAgentDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this UpdateAgentDetails.
        Agent description.


        :param description: The description of this UpdateAgentDetails.
        :type: str
        """
        self._description = description

    @property
    def compute_key(self):
        """
        Gets the compute_key of this UpdateAgentDetails.
        The key of the agent compute associated with this agent.


        :return: The compute_key of this UpdateAgentDetails.
        :rtype: str
        """
        return self._compute_key

    @compute_key.setter
    def compute_key(self, compute_key):
        """
        Sets the compute_key of this UpdateAgentDetails.
        The key of the agent compute associated with this agent.


        :param compute_key: The compute_key of this UpdateAgentDetails.
        :type: str
        """
        self._compute_key = compute_key

    @property
    def diagram(self):
        """
        Gets the diagram of this UpdateAgentDetails.

        :return: The diagram of this UpdateAgentDetails.
        :rtype: oci.aidataplatform_dp.models.AgentDiagram
        """
        return self._diagram

    @diagram.setter
    def diagram(self, diagram):
        """
        Sets the diagram of this UpdateAgentDetails.

        :param diagram: The diagram of this UpdateAgentDetails.
        :type: oci.aidataplatform_dp.models.AgentDiagram
        """
        self._diagram = diagram

    @property
    def entry_file_path(self):
        """
        Gets the entry_file_path of this UpdateAgentDetails.
        The path to project entry file.


        :return: The entry_file_path of this UpdateAgentDetails.
        :rtype: str
        """
        return self._entry_file_path

    @entry_file_path.setter
    def entry_file_path(self, entry_file_path):
        """
        Sets the entry_file_path of this UpdateAgentDetails.
        The path to project entry file.


        :param entry_file_path: The entry_file_path of this UpdateAgentDetails.
        :type: str
        """
        self._entry_file_path = entry_file_path

    @property
    def dependencies_file_path(self):
        """
        Gets the dependencies_file_path of this UpdateAgentDetails.
        The path to dependencies file.


        :return: The dependencies_file_path of this UpdateAgentDetails.
        :rtype: str
        """
        return self._dependencies_file_path

    @dependencies_file_path.setter
    def dependencies_file_path(self, dependencies_file_path):
        """
        Sets the dependencies_file_path of this UpdateAgentDetails.
        The path to dependencies file.


        :param dependencies_file_path: The dependencies_file_path of this UpdateAgentDetails.
        :type: str
        """
        self._dependencies_file_path = dependencies_file_path

    @property
    def deleted_nodes(self):
        """
        Gets the deleted_nodes of this UpdateAgentDetails.
        List of node keys that were removed from the agent diagram.


        :return: The deleted_nodes of this UpdateAgentDetails.
        :rtype: list[str]
        """
        return self._deleted_nodes

    @deleted_nodes.setter
    def deleted_nodes(self, deleted_nodes):
        """
        Sets the deleted_nodes of this UpdateAgentDetails.
        List of node keys that were removed from the agent diagram.


        :param deleted_nodes: The deleted_nodes of this UpdateAgentDetails.
        :type: list[str]
        """
        self._deleted_nodes = deleted_nodes

    @property
    def updated_nodes(self):
        """
        Gets the updated_nodes of this UpdateAgentDetails.
        List of node keys that were updated in the agent diagram.


        :return: The updated_nodes of this UpdateAgentDetails.
        :rtype: list[str]
        """
        return self._updated_nodes

    @updated_nodes.setter
    def updated_nodes(self, updated_nodes):
        """
        Sets the updated_nodes of this UpdateAgentDetails.
        List of node keys that were updated in the agent diagram.


        :param updated_nodes: The updated_nodes of this UpdateAgentDetails.
        :type: list[str]
        """
        self._updated_nodes = updated_nodes

    @property
    def added_nodes(self):
        """
        Gets the added_nodes of this UpdateAgentDetails.
        List of node keys that were newly added to the agent diagram.


        :return: The added_nodes of this UpdateAgentDetails.
        :rtype: list[str]
        """
        return self._added_nodes

    @added_nodes.setter
    def added_nodes(self, added_nodes):
        """
        Sets the added_nodes of this UpdateAgentDetails.
        List of node keys that were newly added to the agent diagram.


        :param added_nodes: The added_nodes of this UpdateAgentDetails.
        :type: list[str]
        """
        self._added_nodes = added_nodes

    @property
    def guardrails(self):
        """
        Gets the guardrails of this UpdateAgentDetails.

        :return: The guardrails of this UpdateAgentDetails.
        :rtype: oci.aidataplatform_dp.models.GuardrailsConfiguration
        """
        return self._guardrails

    @guardrails.setter
    def guardrails(self, guardrails):
        """
        Sets the guardrails of this UpdateAgentDetails.

        :param guardrails: The guardrails of this UpdateAgentDetails.
        :type: oci.aidataplatform_dp.models.GuardrailsConfiguration
        """
        self._guardrails = guardrails

    @property
    def session_config(self):
        """
        Gets the session_config of this UpdateAgentDetails.

        :return: The session_config of this UpdateAgentDetails.
        :rtype: oci.aidataplatform_dp.models.SessionConfiguration
        """
        return self._session_config

    @session_config.setter
    def session_config(self, session_config):
        """
        Sets the session_config of this UpdateAgentDetails.

        :param session_config: The session_config of this UpdateAgentDetails.
        :type: oci.aidataplatform_dp.models.SessionConfiguration
        """
        self._session_config = session_config

    @property
    def agent_card_config(self):
        """
        Gets the agent_card_config of this UpdateAgentDetails.

        :return: The agent_card_config of this UpdateAgentDetails.
        :rtype: oci.aidataplatform_dp.models.AgentCardConfigDetail
        """
        return self._agent_card_config

    @agent_card_config.setter
    def agent_card_config(self, agent_card_config):
        """
        Sets the agent_card_config of this UpdateAgentDetails.

        :param agent_card_config: The agent_card_config of this UpdateAgentDetails.
        :type: oci.aidataplatform_dp.models.AgentCardConfigDetail
        """
        self._agent_card_config = agent_card_config

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
