# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.

from .update_agent_flow_node_details import UpdateAgentFlowNodeDetails
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdateAgentNodeDetails(UpdateAgentFlowNodeDetails):
    """
    Details to update an Agent Node in an Agent Flow
    """

    def __init__(self, **kwargs):
        """
        Initializes a new UpdateAgentNodeDetails object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.UpdateAgentNodeDetails.type` attribute
        of this class is ``AGENT`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this UpdateAgentNodeDetails.
            Allowed values for this property are: "START_NODE", "GUARDRAILS", "AGENT", "SUPERVISOR_AGENT", "NESTED_AGENT_FLOW", "EXTERNAL_AGENT", "HUMAN_IN_THE_LOOP", "SQL_TOOL", "PROMPT_TOOL", "RAG_TOOL", "MCP_TOOL", "HTTP_TOOL", "CUSTOM_TOOL"
        :type type: str

        :param node_type:
            The value to assign to the node_type property of this UpdateAgentNodeDetails.
        :type node_type: str

        :param name:
            The value to assign to the name property of this UpdateAgentNodeDetails.
        :type name: str

        :param description:
            The value to assign to the description property of this UpdateAgentNodeDetails.
        :type description: str

        :param position_x:
            The value to assign to the position_x property of this UpdateAgentNodeDetails.
        :type position_x: float

        :param position_y:
            The value to assign to the position_y property of this UpdateAgentNodeDetails.
        :type position_y: float

        :param is_expanded:
            The value to assign to the is_expanded property of this UpdateAgentNodeDetails.
        :type is_expanded: bool

        :param parent_node_id:
            The value to assign to the parent_node_id property of this UpdateAgentNodeDetails.
        :type parent_node_id: str

        :param configuration:
            The value to assign to the configuration property of this UpdateAgentNodeDetails.
        :type configuration: dict(str, object)

        :param node_type_id:
            The value to assign to the node_type_id property of this UpdateAgentNodeDetails.
        :type node_type_id: str

        :param instructions:
            The value to assign to the instructions property of this UpdateAgentNodeDetails.
        :type instructions: str

        :param llm:
            The value to assign to the llm property of this UpdateAgentNodeDetails.
        :type llm: oci.aidataplatform_dp.models.LlmConfig

        :param model_settings:
            The value to assign to the model_settings property of this UpdateAgentNodeDetails.
        :type model_settings: dict(str, object)

        :param memory:
            The value to assign to the memory property of this UpdateAgentNodeDetails.
        :type memory: oci.aidataplatform_dp.models.MemoryConfiguration

        :param tools:
            The value to assign to the tools property of this UpdateAgentNodeDetails.
        :type tools: list[oci.aidataplatform_dp.models.Tool]

        """
        self.swagger_types = {
            'type': 'str',
            'node_type': 'str',
            'name': 'str',
            'description': 'str',
            'position_x': 'float',
            'position_y': 'float',
            'is_expanded': 'bool',
            'parent_node_id': 'str',
            'configuration': 'dict(str, object)',
            'node_type_id': 'str',
            'instructions': 'str',
            'llm': 'LlmConfig',
            'model_settings': 'dict(str, object)',
            'memory': 'MemoryConfiguration',
            'tools': 'list[Tool]'
        }

        self.attribute_map = {
            'type': 'type',
            'node_type': 'nodeType',
            'name': 'name',
            'description': 'description',
            'position_x': 'positionX',
            'position_y': 'positionY',
            'is_expanded': 'isExpanded',
            'parent_node_id': 'parentNodeId',
            'configuration': 'configuration',
            'node_type_id': 'nodeTypeId',
            'instructions': 'instructions',
            'llm': 'llm',
            'model_settings': 'modelSettings',
            'memory': 'memory',
            'tools': 'tools'
        }

        self._type = None
        self._node_type = None
        self._name = None
        self._description = None
        self._position_x = None
        self._position_y = None
        self._is_expanded = None
        self._parent_node_id = None
        self._configuration = None
        self._node_type_id = None
        self._instructions = None
        self._llm = None
        self._model_settings = None
        self._memory = None
        self._tools = None
        self._type = 'AGENT'

    @property
    def instructions(self):
        """
        Gets the instructions of this UpdateAgentNodeDetails.
        Custom prompt written by the user defining the agent\u2019s goal(s) and what tools the agent has access to


        :return: The instructions of this UpdateAgentNodeDetails.
        :rtype: str
        """
        return self._instructions

    @instructions.setter
    def instructions(self, instructions):
        """
        Sets the instructions of this UpdateAgentNodeDetails.
        Custom prompt written by the user defining the agent\u2019s goal(s) and what tools the agent has access to


        :param instructions: The instructions of this UpdateAgentNodeDetails.
        :type: str
        """
        self._instructions = instructions

    @property
    def llm(self):
        """
        Gets the llm of this UpdateAgentNodeDetails.

        :return: The llm of this UpdateAgentNodeDetails.
        :rtype: oci.aidataplatform_dp.models.LlmConfig
        """
        return self._llm

    @llm.setter
    def llm(self, llm):
        """
        Sets the llm of this UpdateAgentNodeDetails.

        :param llm: The llm of this UpdateAgentNodeDetails.
        :type: oci.aidataplatform_dp.models.LlmConfig
        """
        self._llm = llm

    @property
    def model_settings(self):
        """
        Gets the model_settings of this UpdateAgentNodeDetails.
        Model specific inference parameters such as temperature, top-k, max length, response format, etc.


        :return: The model_settings of this UpdateAgentNodeDetails.
        :rtype: dict(str, object)
        """
        return self._model_settings

    @model_settings.setter
    def model_settings(self, model_settings):
        """
        Sets the model_settings of this UpdateAgentNodeDetails.
        Model specific inference parameters such as temperature, top-k, max length, response format, etc.


        :param model_settings: The model_settings of this UpdateAgentNodeDetails.
        :type: dict(str, object)
        """
        self._model_settings = model_settings

    @property
    def memory(self):
        """
        Gets the memory of this UpdateAgentNodeDetails.

        :return: The memory of this UpdateAgentNodeDetails.
        :rtype: oci.aidataplatform_dp.models.MemoryConfiguration
        """
        return self._memory

    @memory.setter
    def memory(self, memory):
        """
        Sets the memory of this UpdateAgentNodeDetails.

        :param memory: The memory of this UpdateAgentNodeDetails.
        :type: oci.aidataplatform_dp.models.MemoryConfiguration
        """
        self._memory = memory

    @property
    def tools(self):
        """
        Gets the tools of this UpdateAgentNodeDetails.
        List of tools that are accessible to the agent. Provide the unique tool key.


        :return: The tools of this UpdateAgentNodeDetails.
        :rtype: list[oci.aidataplatform_dp.models.Tool]
        """
        return self._tools

    @tools.setter
    def tools(self, tools):
        """
        Sets the tools of this UpdateAgentNodeDetails.
        List of tools that are accessible to the agent. Provide the unique tool key.


        :param tools: The tools of this UpdateAgentNodeDetails.
        :type: list[oci.aidataplatform_dp.models.Tool]
        """
        self._tools = tools

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
