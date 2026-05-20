# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .agent_flow_node import AgentFlowNode
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AgentNode(AgentFlowNode):
    """
    An Agent Node in an Agent Flow
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AgentNode object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.AgentNode.type` attribute
        of this class is ``AGENT`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this AgentNode.
            Allowed values for this property are: "START_NODE", "GUARDRAILS", "AGENT", "SUPERVISOR_AGENT", "NESTED_AGENT_FLOW", "EXTERNAL_AGENT", "HUMAN_IN_THE_LOOP", "SQL_TOOL", "PROMPT_TOOL", "RAG_TOOL", "MCP_TOOL", "HTTP_TOOL", "CUSTOM_TOOL"
        :type type: str

        :param node_type:
            The value to assign to the node_type property of this AgentNode.
        :type node_type: str

        :param name:
            The value to assign to the name property of this AgentNode.
        :type name: str

        :param description:
            The value to assign to the description property of this AgentNode.
        :type description: str

        :param position_x:
            The value to assign to the position_x property of this AgentNode.
        :type position_x: float

        :param position_y:
            The value to assign to the position_y property of this AgentNode.
        :type position_y: float

        :param is_expanded:
            The value to assign to the is_expanded property of this AgentNode.
        :type is_expanded: bool

        :param parent_node_id:
            The value to assign to the parent_node_id property of this AgentNode.
        :type parent_node_id: str

        :param configuration:
            The value to assign to the configuration property of this AgentNode.
        :type configuration: dict(str, object)

        :param node_type_id:
            The value to assign to the node_type_id property of this AgentNode.
        :type node_type_id: str

        :param key:
            The value to assign to the key property of this AgentNode.
        :type key: str

        :param time_created:
            The value to assign to the time_created property of this AgentNode.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this AgentNode.
        :type time_updated: datetime

        :param inputs:
            The value to assign to the inputs property of this AgentNode.
        :type inputs: list[oci.aidataplatform_dp.models.NodeInput]

        :param outputs:
            The value to assign to the outputs property of this AgentNode.
        :type outputs: list[oci.aidataplatform_dp.models.NodeOutput]

        :param validation_errors:
            The value to assign to the validation_errors property of this AgentNode.
        :type validation_errors: list[oci.aidataplatform_dp.models.ValidationError]

        :param instructions:
            The value to assign to the instructions property of this AgentNode.
        :type instructions: str

        :param llm:
            The value to assign to the llm property of this AgentNode.
        :type llm: oci.aidataplatform_dp.models.LlmConfig

        :param model_settings:
            The value to assign to the model_settings property of this AgentNode.
        :type model_settings: dict(str, object)

        :param memory:
            The value to assign to the memory property of this AgentNode.
        :type memory: oci.aidataplatform_dp.models.MemoryConfiguration

        :param tools:
            The value to assign to the tools property of this AgentNode.
        :type tools: list[oci.aidataplatform_dp.models.Tool]

        :param tool_references:
            The value to assign to the tool_references property of this AgentNode.
        :type tool_references: list[str]

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
            'key': 'str',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'inputs': 'list[NodeInput]',
            'outputs': 'list[NodeOutput]',
            'validation_errors': 'list[ValidationError]',
            'instructions': 'str',
            'llm': 'LlmConfig',
            'model_settings': 'dict(str, object)',
            'memory': 'MemoryConfiguration',
            'tools': 'list[Tool]',
            'tool_references': 'list[str]'
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
            'key': 'key',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'inputs': 'inputs',
            'outputs': 'outputs',
            'validation_errors': 'validationErrors',
            'instructions': 'instructions',
            'llm': 'llm',
            'model_settings': 'modelSettings',
            'memory': 'memory',
            'tools': 'tools',
            'tool_references': 'toolReferences'
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
        self._key = None
        self._time_created = None
        self._time_updated = None
        self._inputs = None
        self._outputs = None
        self._validation_errors = None
        self._instructions = None
        self._llm = None
        self._model_settings = None
        self._memory = None
        self._tools = None
        self._tool_references = None
        self._type = 'AGENT'

    @property
    def instructions(self):
        """
        Gets the instructions of this AgentNode.
        System prompt written by the flow developer defining the agent\u2019s goal(s) and what tools the agent has access to.


        :return: The instructions of this AgentNode.
        :rtype: str
        """
        return self._instructions

    @instructions.setter
    def instructions(self, instructions):
        """
        Sets the instructions of this AgentNode.
        System prompt written by the flow developer defining the agent\u2019s goal(s) and what tools the agent has access to.


        :param instructions: The instructions of this AgentNode.
        :type: str
        """
        self._instructions = instructions

    @property
    def llm(self):
        """
        Gets the llm of this AgentNode.

        :return: The llm of this AgentNode.
        :rtype: oci.aidataplatform_dp.models.LlmConfig
        """
        return self._llm

    @llm.setter
    def llm(self, llm):
        """
        Sets the llm of this AgentNode.

        :param llm: The llm of this AgentNode.
        :type: oci.aidataplatform_dp.models.LlmConfig
        """
        self._llm = llm

    @property
    def model_settings(self):
        """
        Gets the model_settings of this AgentNode.
        Model specific inference parameters such as temperature, top-k, max length, response format, etc.


        :return: The model_settings of this AgentNode.
        :rtype: dict(str, object)
        """
        return self._model_settings

    @model_settings.setter
    def model_settings(self, model_settings):
        """
        Sets the model_settings of this AgentNode.
        Model specific inference parameters such as temperature, top-k, max length, response format, etc.


        :param model_settings: The model_settings of this AgentNode.
        :type: dict(str, object)
        """
        self._model_settings = model_settings

    @property
    def memory(self):
        """
        Gets the memory of this AgentNode.

        :return: The memory of this AgentNode.
        :rtype: oci.aidataplatform_dp.models.MemoryConfiguration
        """
        return self._memory

    @memory.setter
    def memory(self, memory):
        """
        Sets the memory of this AgentNode.

        :param memory: The memory of this AgentNode.
        :type: oci.aidataplatform_dp.models.MemoryConfiguration
        """
        self._memory = memory

    @property
    def tools(self):
        """
        Gets the tools of this AgentNode.
        List of tools that are accessible to the agent. Provide the unique tool key


        :return: The tools of this AgentNode.
        :rtype: list[oci.aidataplatform_dp.models.Tool]
        """
        return self._tools

    @tools.setter
    def tools(self, tools):
        """
        Sets the tools of this AgentNode.
        List of tools that are accessible to the agent. Provide the unique tool key


        :param tools: The tools of this AgentNode.
        :type: list[oci.aidataplatform_dp.models.Tool]
        """
        self._tools = tools

    @property
    def tool_references(self):
        """
        Gets the tool_references of this AgentNode.
        A list of tool reference keys, the full tool definition can be found in the toolsMap.


        :return: The tool_references of this AgentNode.
        :rtype: list[str]
        """
        return self._tool_references

    @tool_references.setter
    def tool_references(self, tool_references):
        """
        Sets the tool_references of this AgentNode.
        A list of tool reference keys, the full tool definition can be found in the toolsMap.


        :param tool_references: The tool_references of this AgentNode.
        :type: list[str]
        """
        self._tool_references = tool_references

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
