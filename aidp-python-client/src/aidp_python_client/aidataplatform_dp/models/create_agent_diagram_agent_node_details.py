# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .create_agent_diagram_node_details import CreateAgentDiagramNodeDetails
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateAgentDiagramAgentNodeDetails(CreateAgentDiagramNodeDetails):
    """
    Details to create an agent Node in an agent.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new CreateAgentDiagramAgentNodeDetails object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.CreateAgentDiagramAgentNodeDetails.type` attribute
        of this class is ``AGENT`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this CreateAgentDiagramAgentNodeDetails.
            Allowed values for this property are: "START_NODE", "GUARDRAILS", "AGENT", "SUPERVISOR_AGENT", "SQL_TOOL", "PROMPT_TOOL", "RAG_TOOL", "MCP_TOOL", "HTTP_TOOL", "CUSTOM_TOOL"
        :type type: str

        :param node_type:
            The value to assign to the node_type property of this CreateAgentDiagramAgentNodeDetails.
        :type node_type: str

        :param name:
            The value to assign to the name property of this CreateAgentDiagramAgentNodeDetails.
        :type name: str

        :param description:
            The value to assign to the description property of this CreateAgentDiagramAgentNodeDetails.
        :type description: str

        :param position_x:
            The value to assign to the position_x property of this CreateAgentDiagramAgentNodeDetails.
        :type position_x: float

        :param position_y:
            The value to assign to the position_y property of this CreateAgentDiagramAgentNodeDetails.
        :type position_y: float

        :param is_expanded:
            The value to assign to the is_expanded property of this CreateAgentDiagramAgentNodeDetails.
        :type is_expanded: bool

        :param parent_node_id:
            The value to assign to the parent_node_id property of this CreateAgentDiagramAgentNodeDetails.
        :type parent_node_id: str

        :param src_node_id:
            The value to assign to the src_node_id property of this CreateAgentDiagramAgentNodeDetails.
        :type src_node_id: str

        :param configuration:
            The value to assign to the configuration property of this CreateAgentDiagramAgentNodeDetails.
        :type configuration: dict(str, object)

        :param node_type_id:
            The value to assign to the node_type_id property of this CreateAgentDiagramAgentNodeDetails.
        :type node_type_id: str

        :param instructions:
            The value to assign to the instructions property of this CreateAgentDiagramAgentNodeDetails.
        :type instructions: str

        :param llm:
            The value to assign to the llm property of this CreateAgentDiagramAgentNodeDetails.
        :type llm: oci.aidataplatform_dp.models.LlmConfig

        :param model_settings:
            The value to assign to the model_settings property of this CreateAgentDiagramAgentNodeDetails.
        :type model_settings: dict(str, object)

        :param memory:
            The value to assign to the memory property of this CreateAgentDiagramAgentNodeDetails.
        :type memory: oci.aidataplatform_dp.models.MemoryConfiguration

        :param tools:
            The value to assign to the tools property of this CreateAgentDiagramAgentNodeDetails.
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
            'src_node_id': 'str',
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
            'src_node_id': 'srcNodeId',
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
        self._src_node_id = None
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
        Gets the instructions of this CreateAgentDiagramAgentNodeDetails.
        System prompt written by the Agent developer defining the agent goals and what tools the agent has access to.


        :return: The instructions of this CreateAgentDiagramAgentNodeDetails.
        :rtype: str
        """
        return self._instructions

    @instructions.setter
    def instructions(self, instructions):
        """
        Sets the instructions of this CreateAgentDiagramAgentNodeDetails.
        System prompt written by the Agent developer defining the agent goals and what tools the agent has access to.


        :param instructions: The instructions of this CreateAgentDiagramAgentNodeDetails.
        :type: str
        """
        self._instructions = instructions

    @property
    def llm(self):
        """
        Gets the llm of this CreateAgentDiagramAgentNodeDetails.

        :return: The llm of this CreateAgentDiagramAgentNodeDetails.
        :rtype: oci.aidataplatform_dp.models.LlmConfig
        """
        return self._llm

    @llm.setter
    def llm(self, llm):
        """
        Sets the llm of this CreateAgentDiagramAgentNodeDetails.

        :param llm: The llm of this CreateAgentDiagramAgentNodeDetails.
        :type: oci.aidataplatform_dp.models.LlmConfig
        """
        self._llm = llm

    @property
    def model_settings(self):
        """
        Gets the model_settings of this CreateAgentDiagramAgentNodeDetails.
        Model specific inference parameters such as temperature, top-k, max length, response format, etc.


        :return: The model_settings of this CreateAgentDiagramAgentNodeDetails.
        :rtype: dict(str, object)
        """
        return self._model_settings

    @model_settings.setter
    def model_settings(self, model_settings):
        """
        Sets the model_settings of this CreateAgentDiagramAgentNodeDetails.
        Model specific inference parameters such as temperature, top-k, max length, response format, etc.


        :param model_settings: The model_settings of this CreateAgentDiagramAgentNodeDetails.
        :type: dict(str, object)
        """
        self._model_settings = model_settings

    @property
    def memory(self):
        """
        Gets the memory of this CreateAgentDiagramAgentNodeDetails.

        :return: The memory of this CreateAgentDiagramAgentNodeDetails.
        :rtype: oci.aidataplatform_dp.models.MemoryConfiguration
        """
        return self._memory

    @memory.setter
    def memory(self, memory):
        """
        Sets the memory of this CreateAgentDiagramAgentNodeDetails.

        :param memory: The memory of this CreateAgentDiagramAgentNodeDetails.
        :type: oci.aidataplatform_dp.models.MemoryConfiguration
        """
        self._memory = memory

    @property
    def tools(self):
        """
        Gets the tools of this CreateAgentDiagramAgentNodeDetails.
        List of tools that are accessible to the agent. Provide the unique tool key.


        :return: The tools of this CreateAgentDiagramAgentNodeDetails.
        :rtype: list[oci.aidataplatform_dp.models.Tool]
        """
        return self._tools

    @tools.setter
    def tools(self, tools):
        """
        Sets the tools of this CreateAgentDiagramAgentNodeDetails.
        List of tools that are accessible to the agent. Provide the unique tool key.


        :param tools: The tools of this CreateAgentDiagramAgentNodeDetails.
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
