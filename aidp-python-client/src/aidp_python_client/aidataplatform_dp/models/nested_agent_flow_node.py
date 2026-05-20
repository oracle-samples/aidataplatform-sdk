# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .agent_flow_node import AgentFlowNode
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class NestedAgentFlowNode(AgentFlowNode):
    """
    An agent node representing a nested Agent Flow
    """

    def __init__(self, **kwargs):
        """
        Initializes a new NestedAgentFlowNode object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.NestedAgentFlowNode.type` attribute
        of this class is ``NESTED_AGENT_FLOW`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this NestedAgentFlowNode.
            Allowed values for this property are: "START_NODE", "GUARDRAILS", "AGENT", "SUPERVISOR_AGENT", "NESTED_AGENT_FLOW", "EXTERNAL_AGENT", "HUMAN_IN_THE_LOOP", "SQL_TOOL", "PROMPT_TOOL", "RAG_TOOL", "MCP_TOOL", "HTTP_TOOL", "CUSTOM_TOOL"
        :type type: str

        :param node_type:
            The value to assign to the node_type property of this NestedAgentFlowNode.
        :type node_type: str

        :param name:
            The value to assign to the name property of this NestedAgentFlowNode.
        :type name: str

        :param description:
            The value to assign to the description property of this NestedAgentFlowNode.
        :type description: str

        :param position_x:
            The value to assign to the position_x property of this NestedAgentFlowNode.
        :type position_x: float

        :param position_y:
            The value to assign to the position_y property of this NestedAgentFlowNode.
        :type position_y: float

        :param is_expanded:
            The value to assign to the is_expanded property of this NestedAgentFlowNode.
        :type is_expanded: bool

        :param parent_node_id:
            The value to assign to the parent_node_id property of this NestedAgentFlowNode.
        :type parent_node_id: str

        :param configuration:
            The value to assign to the configuration property of this NestedAgentFlowNode.
        :type configuration: dict(str, object)

        :param node_type_id:
            The value to assign to the node_type_id property of this NestedAgentFlowNode.
        :type node_type_id: str

        :param key:
            The value to assign to the key property of this NestedAgentFlowNode.
        :type key: str

        :param time_created:
            The value to assign to the time_created property of this NestedAgentFlowNode.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this NestedAgentFlowNode.
        :type time_updated: datetime

        :param inputs:
            The value to assign to the inputs property of this NestedAgentFlowNode.
        :type inputs: list[oci.aidataplatform_dp.models.NodeInput]

        :param outputs:
            The value to assign to the outputs property of this NestedAgentFlowNode.
        :type outputs: list[oci.aidataplatform_dp.models.NodeOutput]

        :param validation_errors:
            The value to assign to the validation_errors property of this NestedAgentFlowNode.
        :type validation_errors: list[oci.aidataplatform_dp.models.ValidationError]

        :param instructions:
            The value to assign to the instructions property of this NestedAgentFlowNode.
        :type instructions: str

        :param memory:
            The value to assign to the memory property of this NestedAgentFlowNode.
        :type memory: oci.aidataplatform_dp.models.MemoryConfiguration

        :param nested_agent_flow_config:
            The value to assign to the nested_agent_flow_config property of this NestedAgentFlowNode.
        :type nested_agent_flow_config: dict(str, str)

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
            'memory': 'MemoryConfiguration',
            'nested_agent_flow_config': 'dict(str, str)'
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
            'memory': 'memory',
            'nested_agent_flow_config': 'nestedAgentFlowConfig'
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
        self._memory = None
        self._nested_agent_flow_config = None
        self._type = 'NESTED_AGENT_FLOW'

    @property
    def instructions(self):
        """
        Gets the instructions of this NestedAgentFlowNode.
        System prompt written by the flow developer defining the agent\u2019s goal(s) and what tools the agent has access to.


        :return: The instructions of this NestedAgentFlowNode.
        :rtype: str
        """
        return self._instructions

    @instructions.setter
    def instructions(self, instructions):
        """
        Sets the instructions of this NestedAgentFlowNode.
        System prompt written by the flow developer defining the agent\u2019s goal(s) and what tools the agent has access to.


        :param instructions: The instructions of this NestedAgentFlowNode.
        :type: str
        """
        self._instructions = instructions

    @property
    def memory(self):
        """
        Gets the memory of this NestedAgentFlowNode.

        :return: The memory of this NestedAgentFlowNode.
        :rtype: oci.aidataplatform_dp.models.MemoryConfiguration
        """
        return self._memory

    @memory.setter
    def memory(self, memory):
        """
        Sets the memory of this NestedAgentFlowNode.

        :param memory: The memory of this NestedAgentFlowNode.
        :type: oci.aidataplatform_dp.models.MemoryConfiguration
        """
        self._memory = memory

    @property
    def nested_agent_flow_config(self):
        """
        Gets the nested_agent_flow_config of this NestedAgentFlowNode.
        Extra configuration for the nested agent flow node.


        :return: The nested_agent_flow_config of this NestedAgentFlowNode.
        :rtype: dict(str, str)
        """
        return self._nested_agent_flow_config

    @nested_agent_flow_config.setter
    def nested_agent_flow_config(self, nested_agent_flow_config):
        """
        Sets the nested_agent_flow_config of this NestedAgentFlowNode.
        Extra configuration for the nested agent flow node.


        :param nested_agent_flow_config: The nested_agent_flow_config of this NestedAgentFlowNode.
        :type: dict(str, str)
        """
        self._nested_agent_flow_config = nested_agent_flow_config

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
