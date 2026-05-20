# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .agent_flow_node import AgentFlowNode
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class GuardrailNode(AgentFlowNode):
    """
    A node used to run guardrails on input in the agent flow.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new GuardrailNode object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.GuardrailNode.type` attribute
        of this class is ``GUARDRAILS`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this GuardrailNode.
            Allowed values for this property are: "START_NODE", "GUARDRAILS", "AGENT", "SUPERVISOR_AGENT", "NESTED_AGENT_FLOW", "EXTERNAL_AGENT", "HUMAN_IN_THE_LOOP", "SQL_TOOL", "PROMPT_TOOL", "RAG_TOOL", "MCP_TOOL", "HTTP_TOOL", "CUSTOM_TOOL"
        :type type: str

        :param node_type:
            The value to assign to the node_type property of this GuardrailNode.
        :type node_type: str

        :param name:
            The value to assign to the name property of this GuardrailNode.
        :type name: str

        :param description:
            The value to assign to the description property of this GuardrailNode.
        :type description: str

        :param position_x:
            The value to assign to the position_x property of this GuardrailNode.
        :type position_x: float

        :param position_y:
            The value to assign to the position_y property of this GuardrailNode.
        :type position_y: float

        :param is_expanded:
            The value to assign to the is_expanded property of this GuardrailNode.
        :type is_expanded: bool

        :param parent_node_id:
            The value to assign to the parent_node_id property of this GuardrailNode.
        :type parent_node_id: str

        :param configuration:
            The value to assign to the configuration property of this GuardrailNode.
        :type configuration: dict(str, object)

        :param node_type_id:
            The value to assign to the node_type_id property of this GuardrailNode.
        :type node_type_id: str

        :param key:
            The value to assign to the key property of this GuardrailNode.
        :type key: str

        :param time_created:
            The value to assign to the time_created property of this GuardrailNode.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this GuardrailNode.
        :type time_updated: datetime

        :param inputs:
            The value to assign to the inputs property of this GuardrailNode.
        :type inputs: list[oci.aidataplatform_dp.models.NodeInput]

        :param outputs:
            The value to assign to the outputs property of this GuardrailNode.
        :type outputs: list[oci.aidataplatform_dp.models.NodeOutput]

        :param validation_errors:
            The value to assign to the validation_errors property of this GuardrailNode.
        :type validation_errors: list[oci.aidataplatform_dp.models.ValidationError]

        :param guardrails_config_key:
            The value to assign to the guardrails_config_key property of this GuardrailNode.
        :type guardrails_config_key: str

        :param extra_guardrails_config:
            The value to assign to the extra_guardrails_config property of this GuardrailNode.
        :type extra_guardrails_config: dict(str, str)

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
            'guardrails_config_key': 'str',
            'extra_guardrails_config': 'dict(str, str)'
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
            'guardrails_config_key': 'guardrailsConfigKey',
            'extra_guardrails_config': 'extraGuardrailsConfig'
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
        self._guardrails_config_key = None
        self._extra_guardrails_config = None
        self._type = 'GUARDRAILS'

    @property
    def guardrails_config_key(self):
        """
        Gets the guardrails_config_key of this GuardrailNode.
        A reference by key value to a guardrails configuration stored in the guardrails map in the flow diagram.


        :return: The guardrails_config_key of this GuardrailNode.
        :rtype: str
        """
        return self._guardrails_config_key

    @guardrails_config_key.setter
    def guardrails_config_key(self, guardrails_config_key):
        """
        Sets the guardrails_config_key of this GuardrailNode.
        A reference by key value to a guardrails configuration stored in the guardrails map in the flow diagram.


        :param guardrails_config_key: The guardrails_config_key of this GuardrailNode.
        :type: str
        """
        self._guardrails_config_key = guardrails_config_key

    @property
    def extra_guardrails_config(self):
        """
        Gets the extra_guardrails_config of this GuardrailNode.
        Extra configuration for the guardrails node.


        :return: The extra_guardrails_config of this GuardrailNode.
        :rtype: dict(str, str)
        """
        return self._extra_guardrails_config

    @extra_guardrails_config.setter
    def extra_guardrails_config(self, extra_guardrails_config):
        """
        Sets the extra_guardrails_config of this GuardrailNode.
        Extra configuration for the guardrails node.


        :param extra_guardrails_config: The extra_guardrails_config of this GuardrailNode.
        :type: dict(str, str)
        """
        self._extra_guardrails_config = extra_guardrails_config

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
