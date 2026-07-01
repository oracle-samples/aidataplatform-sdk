# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .agent_diagram_node import AgentDiagramNode
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AgentDiagramStartNode(AgentDiagramNode):
    """
    A starting point in an agent.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AgentDiagramStartNode object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.AgentDiagramStartNode.type` attribute
        of this class is ``START_NODE`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this AgentDiagramStartNode.
            Allowed values for this property are: "START_NODE", "GUARDRAILS", "AGENT", "SUPERVISOR_AGENT", "SQL_TOOL", "PROMPT_TOOL", "RAG_TOOL", "MCP_TOOL", "HTTP_TOOL", "CUSTOM_TOOL"
        :type type: str

        :param node_type:
            The value to assign to the node_type property of this AgentDiagramStartNode.
        :type node_type: str

        :param name:
            The value to assign to the name property of this AgentDiagramStartNode.
        :type name: str

        :param description:
            The value to assign to the description property of this AgentDiagramStartNode.
        :type description: str

        :param position_x:
            The value to assign to the position_x property of this AgentDiagramStartNode.
        :type position_x: float

        :param position_y:
            The value to assign to the position_y property of this AgentDiagramStartNode.
        :type position_y: float

        :param is_expanded:
            The value to assign to the is_expanded property of this AgentDiagramStartNode.
        :type is_expanded: bool

        :param parent_node_id:
            The value to assign to the parent_node_id property of this AgentDiagramStartNode.
        :type parent_node_id: str

        :param configuration:
            The value to assign to the configuration property of this AgentDiagramStartNode.
        :type configuration: dict(str, object)

        :param node_type_id:
            The value to assign to the node_type_id property of this AgentDiagramStartNode.
        :type node_type_id: str

        :param key:
            The value to assign to the key property of this AgentDiagramStartNode.
        :type key: str

        :param time_created:
            The value to assign to the time_created property of this AgentDiagramStartNode.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this AgentDiagramStartNode.
        :type time_updated: datetime

        :param inputs:
            The value to assign to the inputs property of this AgentDiagramStartNode.
        :type inputs: list[oci.aidataplatform_dp.models.NodeInput]

        :param outputs:
            The value to assign to the outputs property of this AgentDiagramStartNode.
        :type outputs: list[oci.aidataplatform_dp.models.NodeOutput]

        :param validation_errors:
            The value to assign to the validation_errors property of this AgentDiagramStartNode.
        :type validation_errors: list[oci.aidataplatform_dp.models.ValidationError]

        :param start_node_config:
            The value to assign to the start_node_config property of this AgentDiagramStartNode.
        :type start_node_config: dict(str, str)

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
            'start_node_config': 'dict(str, str)'
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
            'start_node_config': 'startNodeConfig'
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
        self._start_node_config = None
        self._type = 'START_NODE'

    @property
    def start_node_config(self):
        """
        Gets the start_node_config of this AgentDiagramStartNode.
        Extra configuration for the start node.


        :return: The start_node_config of this AgentDiagramStartNode.
        :rtype: dict(str, str)
        """
        return self._start_node_config

    @start_node_config.setter
    def start_node_config(self, start_node_config):
        """
        Sets the start_node_config of this AgentDiagramStartNode.
        Extra configuration for the start node.


        :param start_node_config: The start_node_config of this AgentDiagramStartNode.
        :type: dict(str, str)
        """
        self._start_node_config = start_node_config

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
