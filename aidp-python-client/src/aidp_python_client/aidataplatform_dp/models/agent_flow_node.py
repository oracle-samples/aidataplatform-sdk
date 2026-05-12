# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AgentFlowNode(object):
    """
    A node in a diagram, representing logic, data, or operation.
    """

    #: A constant which can be used with the type property of a AgentFlowNode.
    #: This constant has a value of "START_NODE"
    TYPE_START_NODE = "START_NODE"

    #: A constant which can be used with the type property of a AgentFlowNode.
    #: This constant has a value of "GUARDRAILS"
    TYPE_GUARDRAILS = "GUARDRAILS"

    #: A constant which can be used with the type property of a AgentFlowNode.
    #: This constant has a value of "AGENT"
    TYPE_AGENT = "AGENT"

    #: A constant which can be used with the type property of a AgentFlowNode.
    #: This constant has a value of "SUPERVISOR_AGENT"
    TYPE_SUPERVISOR_AGENT = "SUPERVISOR_AGENT"

    #: A constant which can be used with the type property of a AgentFlowNode.
    #: This constant has a value of "NESTED_AGENT_FLOW"
    TYPE_NESTED_AGENT_FLOW = "NESTED_AGENT_FLOW"

    #: A constant which can be used with the type property of a AgentFlowNode.
    #: This constant has a value of "EXTERNAL_AGENT"
    TYPE_EXTERNAL_AGENT = "EXTERNAL_AGENT"

    #: A constant which can be used with the type property of a AgentFlowNode.
    #: This constant has a value of "HUMAN_IN_THE_LOOP"
    TYPE_HUMAN_IN_THE_LOOP = "HUMAN_IN_THE_LOOP"

    #: A constant which can be used with the type property of a AgentFlowNode.
    #: This constant has a value of "SQL_TOOL"
    TYPE_SQL_TOOL = "SQL_TOOL"

    #: A constant which can be used with the type property of a AgentFlowNode.
    #: This constant has a value of "PROMPT_TOOL"
    TYPE_PROMPT_TOOL = "PROMPT_TOOL"

    #: A constant which can be used with the type property of a AgentFlowNode.
    #: This constant has a value of "RAG_TOOL"
    TYPE_RAG_TOOL = "RAG_TOOL"

    #: A constant which can be used with the type property of a AgentFlowNode.
    #: This constant has a value of "MCP_TOOL"
    TYPE_MCP_TOOL = "MCP_TOOL"

    #: A constant which can be used with the type property of a AgentFlowNode.
    #: This constant has a value of "HTTP_TOOL"
    TYPE_HTTP_TOOL = "HTTP_TOOL"

    #: A constant which can be used with the type property of a AgentFlowNode.
    #: This constant has a value of "CUSTOM_TOOL"
    TYPE_CUSTOM_TOOL = "CUSTOM_TOOL"

    def __init__(self, **kwargs):
        """
        Initializes a new AgentFlowNode object with values from keyword arguments. This class has the following subclasses and if you are using this class as input
        to a service operations then you should favor using a subclass over the base class:

        * :class:`~oci.aidataplatform_dp.models.StartNode`
        * :class:`~oci.aidataplatform_dp.models.HttpToolNode`
        * :class:`~oci.aidataplatform_dp.models.CustomToolNode`
        * :class:`~oci.aidataplatform_dp.models.RagToolNode`
        * :class:`~oci.aidataplatform_dp.models.HumanInTheLoopNode`
        * :class:`~oci.aidataplatform_dp.models.AgentNode`
        * :class:`~oci.aidataplatform_dp.models.McpToolNode`
        * :class:`~oci.aidataplatform_dp.models.ExternalAgentNode`
        * :class:`~oci.aidataplatform_dp.models.SqlToolNode`
        * :class:`~oci.aidataplatform_dp.models.SupervisorAgentNode`
        * :class:`~oci.aidataplatform_dp.models.NestedAgentFlowNode`
        * :class:`~oci.aidataplatform_dp.models.PromptToolNode`
        * :class:`~oci.aidataplatform_dp.models.GuardrailNode`

        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this AgentFlowNode.
            Allowed values for this property are: "START_NODE", "GUARDRAILS", "AGENT", "SUPERVISOR_AGENT", "NESTED_AGENT_FLOW", "EXTERNAL_AGENT", "HUMAN_IN_THE_LOOP", "SQL_TOOL", "PROMPT_TOOL", "RAG_TOOL", "MCP_TOOL", "HTTP_TOOL", "CUSTOM_TOOL"
        :type type: str

        :param node_type:
            The value to assign to the node_type property of this AgentFlowNode.
        :type node_type: str

        :param name:
            The value to assign to the name property of this AgentFlowNode.
        :type name: str

        :param description:
            The value to assign to the description property of this AgentFlowNode.
        :type description: str

        :param position_x:
            The value to assign to the position_x property of this AgentFlowNode.
        :type position_x: float

        :param position_y:
            The value to assign to the position_y property of this AgentFlowNode.
        :type position_y: float

        :param is_expanded:
            The value to assign to the is_expanded property of this AgentFlowNode.
        :type is_expanded: bool

        :param parent_node_id:
            The value to assign to the parent_node_id property of this AgentFlowNode.
        :type parent_node_id: str

        :param configuration:
            The value to assign to the configuration property of this AgentFlowNode.
        :type configuration: dict(str, object)

        :param node_type_id:
            The value to assign to the node_type_id property of this AgentFlowNode.
        :type node_type_id: str

        :param key:
            The value to assign to the key property of this AgentFlowNode.
        :type key: str

        :param time_created:
            The value to assign to the time_created property of this AgentFlowNode.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this AgentFlowNode.
        :type time_updated: datetime

        :param inputs:
            The value to assign to the inputs property of this AgentFlowNode.
        :type inputs: list[oci.aidataplatform_dp.models.NodeInput]

        :param outputs:
            The value to assign to the outputs property of this AgentFlowNode.
        :type outputs: list[oci.aidataplatform_dp.models.NodeOutput]

        :param validation_errors:
            The value to assign to the validation_errors property of this AgentFlowNode.
        :type validation_errors: list[oci.aidataplatform_dp.models.ValidationError]

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
            'validation_errors': 'list[ValidationError]'
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
            'validation_errors': 'validationErrors'
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

    @staticmethod
    def get_subtype(object_dictionary):
        """
        Given the hash representation of a subtype of this class,
        use the info in the hash to return the class of the subtype.
        """
        type = object_dictionary['type']

        if type == 'START_NODE':
            return 'StartNode'

        if type == 'HTTP_TOOL':
            return 'HttpToolNode'

        if type == 'CUSTOM_TOOL':
            return 'CustomToolNode'

        if type == 'RAG_TOOL':
            return 'RagToolNode'

        if type == 'HUMAN_IN_THE_LOOP':
            return 'HumanInTheLoopNode'

        if type == 'AGENT':
            return 'AgentNode'

        if type == 'MCP_TOOL':
            return 'McpToolNode'

        if type == 'EXTERNAL_AGENT':
            return 'ExternalAgentNode'

        if type == 'SQL_TOOL':
            return 'SqlToolNode'

        if type == 'SUPERVISOR_AGENT':
            return 'SupervisorAgentNode'

        if type == 'NESTED_AGENT_FLOW':
            return 'NestedAgentFlowNode'

        if type == 'PROMPT_TOOL':
            return 'PromptToolNode'

        if type == 'GUARDRAILS':
            return 'GuardrailNode'
        else:
            return 'AgentFlowNode'

    @property
    def type(self):
        """
        Gets the type of this AgentFlowNode.
        Node type discriminator

        Allowed values for this property are: "START_NODE", "GUARDRAILS", "AGENT", "SUPERVISOR_AGENT", "NESTED_AGENT_FLOW", "EXTERNAL_AGENT", "HUMAN_IN_THE_LOOP", "SQL_TOOL", "PROMPT_TOOL", "RAG_TOOL", "MCP_TOOL", "HTTP_TOOL", "CUSTOM_TOOL"


        :return: The type of this AgentFlowNode.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this AgentFlowNode.
        Node type discriminator


        :param type: The type of this AgentFlowNode.
        :type: str
        """
        allowed_values = ["START_NODE", "GUARDRAILS", "AGENT", "SUPERVISOR_AGENT", "NESTED_AGENT_FLOW", "EXTERNAL_AGENT", "HUMAN_IN_THE_LOOP", "SQL_TOOL", "PROMPT_TOOL", "RAG_TOOL", "MCP_TOOL", "HTTP_TOOL", "CUSTOM_TOOL"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            raise ValueError(
                "Invalid value for `type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._type = type

    @property
    def node_type(self):
        """
        Gets the node_type of this AgentFlowNode.
        Type of this node.


        :return: The node_type of this AgentFlowNode.
        :rtype: str
        """
        return self._node_type

    @node_type.setter
    def node_type(self, node_type):
        """
        Sets the node_type of this AgentFlowNode.
        Type of this node.


        :param node_type: The node_type of this AgentFlowNode.
        :type: str
        """
        self._node_type = node_type

    @property
    def name(self):
        """
        Gets the name of this AgentFlowNode.
        Name of this node.


        :return: The name of this AgentFlowNode.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this AgentFlowNode.
        Name of this node.


        :param name: The name of this AgentFlowNode.
        :type: str
        """
        self._name = name

    @property
    def description(self):
        """
        Gets the description of this AgentFlowNode.
        Description of this node.


        :return: The description of this AgentFlowNode.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this AgentFlowNode.
        Description of this node.


        :param description: The description of this AgentFlowNode.
        :type: str
        """
        self._description = description

    @property
    def position_x(self):
        """
        Gets the position_x of this AgentFlowNode.
        Canvas X coordinate.


        :return: The position_x of this AgentFlowNode.
        :rtype: float
        """
        return self._position_x

    @position_x.setter
    def position_x(self, position_x):
        """
        Sets the position_x of this AgentFlowNode.
        Canvas X coordinate.


        :param position_x: The position_x of this AgentFlowNode.
        :type: float
        """
        self._position_x = position_x

    @property
    def position_y(self):
        """
        Gets the position_y of this AgentFlowNode.
        Canvas Y coordinate.


        :return: The position_y of this AgentFlowNode.
        :rtype: float
        """
        return self._position_y

    @position_y.setter
    def position_y(self, position_y):
        """
        Sets the position_y of this AgentFlowNode.
        Canvas Y coordinate.


        :param position_y: The position_y of this AgentFlowNode.
        :type: float
        """
        self._position_y = position_y

    @property
    def is_expanded(self):
        """
        Gets the is_expanded of this AgentFlowNode.
        Is node expanded in UI.


        :return: The is_expanded of this AgentFlowNode.
        :rtype: bool
        """
        return self._is_expanded

    @is_expanded.setter
    def is_expanded(self, is_expanded):
        """
        Sets the is_expanded of this AgentFlowNode.
        Is node expanded in UI.


        :param is_expanded: The is_expanded of this AgentFlowNode.
        :type: bool
        """
        self._is_expanded = is_expanded

    @property
    def parent_node_id(self):
        """
        Gets the parent_node_id of this AgentFlowNode.
        Parent node ID, for subgraphs.


        :return: The parent_node_id of this AgentFlowNode.
        :rtype: str
        """
        return self._parent_node_id

    @parent_node_id.setter
    def parent_node_id(self, parent_node_id):
        """
        Sets the parent_node_id of this AgentFlowNode.
        Parent node ID, for subgraphs.


        :param parent_node_id: The parent_node_id of this AgentFlowNode.
        :type: str
        """
        self._parent_node_id = parent_node_id

    @property
    def configuration(self):
        """
        Gets the configuration of this AgentFlowNode.
        Configuration object for this node.


        :return: The configuration of this AgentFlowNode.
        :rtype: dict(str, object)
        """
        return self._configuration

    @configuration.setter
    def configuration(self, configuration):
        """
        Sets the configuration of this AgentFlowNode.
        Configuration object for this node.


        :param configuration: The configuration of this AgentFlowNode.
        :type: dict(str, object)
        """
        self._configuration = configuration

    @property
    def node_type_id(self):
        """
        Gets the node_type_id of this AgentFlowNode.
        Definition ID for this node type.


        :return: The node_type_id of this AgentFlowNode.
        :rtype: str
        """
        return self._node_type_id

    @node_type_id.setter
    def node_type_id(self, node_type_id):
        """
        Sets the node_type_id of this AgentFlowNode.
        Definition ID for this node type.


        :param node_type_id: The node_type_id of this AgentFlowNode.
        :type: str
        """
        self._node_type_id = node_type_id

    @property
    def key(self):
        """
        **[Required]** Gets the key of this AgentFlowNode.
        Unique identifier for the node.


        :return: The key of this AgentFlowNode.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this AgentFlowNode.
        Unique identifier for the node.


        :param key: The key of this AgentFlowNode.
        :type: str
        """
        self._key = key

    @property
    def time_created(self):
        """
        Gets the time_created of this AgentFlowNode.
        RFC3339 timestamp when node was created.


        :return: The time_created of this AgentFlowNode.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this AgentFlowNode.
        RFC3339 timestamp when node was created.


        :param time_created: The time_created of this AgentFlowNode.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this AgentFlowNode.
        RFC3339 timestamp when node was last updated.


        :return: The time_updated of this AgentFlowNode.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this AgentFlowNode.
        RFC3339 timestamp when node was last updated.


        :param time_updated: The time_updated of this AgentFlowNode.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def inputs(self):
        """
        Gets the inputs of this AgentFlowNode.
        Array of NodeInput objects.


        :return: The inputs of this AgentFlowNode.
        :rtype: list[oci.aidataplatform_dp.models.NodeInput]
        """
        return self._inputs

    @inputs.setter
    def inputs(self, inputs):
        """
        Sets the inputs of this AgentFlowNode.
        Array of NodeInput objects.


        :param inputs: The inputs of this AgentFlowNode.
        :type: list[oci.aidataplatform_dp.models.NodeInput]
        """
        self._inputs = inputs

    @property
    def outputs(self):
        """
        Gets the outputs of this AgentFlowNode.
        Array of NodeOutput objects.


        :return: The outputs of this AgentFlowNode.
        :rtype: list[oci.aidataplatform_dp.models.NodeOutput]
        """
        return self._outputs

    @outputs.setter
    def outputs(self, outputs):
        """
        Sets the outputs of this AgentFlowNode.
        Array of NodeOutput objects.


        :param outputs: The outputs of this AgentFlowNode.
        :type: list[oci.aidataplatform_dp.models.NodeOutput]
        """
        self._outputs = outputs

    @property
    def validation_errors(self):
        """
        Gets the validation_errors of this AgentFlowNode.
        List of validation errors encountered in the diagram.


        :return: The validation_errors of this AgentFlowNode.
        :rtype: list[oci.aidataplatform_dp.models.ValidationError]
        """
        return self._validation_errors

    @validation_errors.setter
    def validation_errors(self, validation_errors):
        """
        Sets the validation_errors of this AgentFlowNode.
        List of validation errors encountered in the diagram.


        :param validation_errors: The validation_errors of this AgentFlowNode.
        :type: list[oci.aidataplatform_dp.models.ValidationError]
        """
        self._validation_errors = validation_errors

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
