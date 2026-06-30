# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .agent_diagram_node import AgentDiagramNode
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AgentDiagramSupervisorAgentNode(AgentDiagramNode):
    """
    A Supervisor Agent node in an agent.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AgentDiagramSupervisorAgentNode object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.AgentDiagramSupervisorAgentNode.type` attribute
        of this class is ``SUPERVISOR_AGENT`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this AgentDiagramSupervisorAgentNode.
            Allowed values for this property are: "START_NODE", "GUARDRAILS", "AGENT", "SUPERVISOR_AGENT", "SQL_TOOL", "PROMPT_TOOL", "RAG_TOOL", "MCP_TOOL", "HTTP_TOOL", "CUSTOM_TOOL"
        :type type: str

        :param node_type:
            The value to assign to the node_type property of this AgentDiagramSupervisorAgentNode.
        :type node_type: str

        :param name:
            The value to assign to the name property of this AgentDiagramSupervisorAgentNode.
        :type name: str

        :param description:
            The value to assign to the description property of this AgentDiagramSupervisorAgentNode.
        :type description: str

        :param position_x:
            The value to assign to the position_x property of this AgentDiagramSupervisorAgentNode.
        :type position_x: float

        :param position_y:
            The value to assign to the position_y property of this AgentDiagramSupervisorAgentNode.
        :type position_y: float

        :param is_expanded:
            The value to assign to the is_expanded property of this AgentDiagramSupervisorAgentNode.
        :type is_expanded: bool

        :param parent_node_id:
            The value to assign to the parent_node_id property of this AgentDiagramSupervisorAgentNode.
        :type parent_node_id: str

        :param configuration:
            The value to assign to the configuration property of this AgentDiagramSupervisorAgentNode.
        :type configuration: dict(str, object)

        :param node_type_id:
            The value to assign to the node_type_id property of this AgentDiagramSupervisorAgentNode.
        :type node_type_id: str

        :param key:
            The value to assign to the key property of this AgentDiagramSupervisorAgentNode.
        :type key: str

        :param time_created:
            The value to assign to the time_created property of this AgentDiagramSupervisorAgentNode.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this AgentDiagramSupervisorAgentNode.
        :type time_updated: datetime

        :param inputs:
            The value to assign to the inputs property of this AgentDiagramSupervisorAgentNode.
        :type inputs: list[oci.aidataplatform_dp.models.NodeInput]

        :param outputs:
            The value to assign to the outputs property of this AgentDiagramSupervisorAgentNode.
        :type outputs: list[oci.aidataplatform_dp.models.NodeOutput]

        :param validation_errors:
            The value to assign to the validation_errors property of this AgentDiagramSupervisorAgentNode.
        :type validation_errors: list[oci.aidataplatform_dp.models.ValidationError]

        :param instructions:
            The value to assign to the instructions property of this AgentDiagramSupervisorAgentNode.
        :type instructions: str

        :param llm:
            The value to assign to the llm property of this AgentDiagramSupervisorAgentNode.
        :type llm: oci.aidataplatform_dp.models.LlmConfig

        :param model_settings:
            The value to assign to the model_settings property of this AgentDiagramSupervisorAgentNode.
        :type model_settings: dict(str, object)

        :param memory:
            The value to assign to the memory property of this AgentDiagramSupervisorAgentNode.
        :type memory: oci.aidataplatform_dp.models.MemoryConfiguration

        :param tools:
            The value to assign to the tools property of this AgentDiagramSupervisorAgentNode.
        :type tools: list[oci.aidataplatform_dp.models.Tool]

        :param tool_references:
            The value to assign to the tool_references property of this AgentDiagramSupervisorAgentNode.
        :type tool_references: list[str]

        :param supervisor_config:
            The value to assign to the supervisor_config property of this AgentDiagramSupervisorAgentNode.
        :type supervisor_config: dict(str, str)

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
            'tool_references': 'list[str]',
            'supervisor_config': 'dict(str, str)'
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
            'tool_references': 'toolReferences',
            'supervisor_config': 'supervisorConfig'
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
        self._supervisor_config = None
        self._type = 'SUPERVISOR_AGENT'

    @property
    def instructions(self):
        """
        Gets the instructions of this AgentDiagramSupervisorAgentNode.
        System prompt written by the Agent developer defining the agent goals and what tools the agent has access to.


        :return: The instructions of this AgentDiagramSupervisorAgentNode.
        :rtype: str
        """
        return self._instructions

    @instructions.setter
    def instructions(self, instructions):
        """
        Sets the instructions of this AgentDiagramSupervisorAgentNode.
        System prompt written by the Agent developer defining the agent goals and what tools the agent has access to.


        :param instructions: The instructions of this AgentDiagramSupervisorAgentNode.
        :type: str
        """
        self._instructions = instructions

    @property
    def llm(self):
        """
        Gets the llm of this AgentDiagramSupervisorAgentNode.

        :return: The llm of this AgentDiagramSupervisorAgentNode.
        :rtype: oci.aidataplatform_dp.models.LlmConfig
        """
        return self._llm

    @llm.setter
    def llm(self, llm):
        """
        Sets the llm of this AgentDiagramSupervisorAgentNode.

        :param llm: The llm of this AgentDiagramSupervisorAgentNode.
        :type: oci.aidataplatform_dp.models.LlmConfig
        """
        self._llm = llm

    @property
    def model_settings(self):
        """
        Gets the model_settings of this AgentDiagramSupervisorAgentNode.
        Model specific inference parameters such as temperature, top-k, max length, response format, etc.


        :return: The model_settings of this AgentDiagramSupervisorAgentNode.
        :rtype: dict(str, object)
        """
        return self._model_settings

    @model_settings.setter
    def model_settings(self, model_settings):
        """
        Sets the model_settings of this AgentDiagramSupervisorAgentNode.
        Model specific inference parameters such as temperature, top-k, max length, response format, etc.


        :param model_settings: The model_settings of this AgentDiagramSupervisorAgentNode.
        :type: dict(str, object)
        """
        self._model_settings = model_settings

    @property
    def memory(self):
        """
        Gets the memory of this AgentDiagramSupervisorAgentNode.

        :return: The memory of this AgentDiagramSupervisorAgentNode.
        :rtype: oci.aidataplatform_dp.models.MemoryConfiguration
        """
        return self._memory

    @memory.setter
    def memory(self, memory):
        """
        Sets the memory of this AgentDiagramSupervisorAgentNode.

        :param memory: The memory of this AgentDiagramSupervisorAgentNode.
        :type: oci.aidataplatform_dp.models.MemoryConfiguration
        """
        self._memory = memory

    @property
    def tools(self):
        """
        Gets the tools of this AgentDiagramSupervisorAgentNode.
        List of tools that are accessible to the agent. Provide the unique tool key.


        :return: The tools of this AgentDiagramSupervisorAgentNode.
        :rtype: list[oci.aidataplatform_dp.models.Tool]
        """
        return self._tools

    @tools.setter
    def tools(self, tools):
        """
        Sets the tools of this AgentDiagramSupervisorAgentNode.
        List of tools that are accessible to the agent. Provide the unique tool key.


        :param tools: The tools of this AgentDiagramSupervisorAgentNode.
        :type: list[oci.aidataplatform_dp.models.Tool]
        """
        self._tools = tools

    @property
    def tool_references(self):
        """
        Gets the tool_references of this AgentDiagramSupervisorAgentNode.
        A list of tool reference keys, the full tool definition can be found in the toolsMap.


        :return: The tool_references of this AgentDiagramSupervisorAgentNode.
        :rtype: list[str]
        """
        return self._tool_references

    @tool_references.setter
    def tool_references(self, tool_references):
        """
        Sets the tool_references of this AgentDiagramSupervisorAgentNode.
        A list of tool reference keys, the full tool definition can be found in the toolsMap.


        :param tool_references: The tool_references of this AgentDiagramSupervisorAgentNode.
        :type: list[str]
        """
        self._tool_references = tool_references

    @property
    def supervisor_config(self):
        """
        Gets the supervisor_config of this AgentDiagramSupervisorAgentNode.
        Extra configuration for the supervisor node. Captured as a generic dictionary.


        :return: The supervisor_config of this AgentDiagramSupervisorAgentNode.
        :rtype: dict(str, str)
        """
        return self._supervisor_config

    @supervisor_config.setter
    def supervisor_config(self, supervisor_config):
        """
        Sets the supervisor_config of this AgentDiagramSupervisorAgentNode.
        Extra configuration for the supervisor node. Captured as a generic dictionary.


        :param supervisor_config: The supervisor_config of this AgentDiagramSupervisorAgentNode.
        :type: dict(str, str)
        """
        self._supervisor_config = supervisor_config

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
