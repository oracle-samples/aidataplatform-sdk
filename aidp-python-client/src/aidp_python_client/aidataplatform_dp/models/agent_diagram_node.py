# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AgentDiagramNode(object):
    """
    A node in a diagram, representing logic, data, or operation.
    """

    #: A constant which can be used with the type property of a AgentDiagramNode.
    #: This constant has a value of "START_NODE"
    TYPE_START_NODE = "START_NODE"

    #: A constant which can be used with the type property of a AgentDiagramNode.
    #: This constant has a value of "GUARDRAILS"
    TYPE_GUARDRAILS = "GUARDRAILS"

    #: A constant which can be used with the type property of a AgentDiagramNode.
    #: This constant has a value of "AGENT"
    TYPE_AGENT = "AGENT"

    #: A constant which can be used with the type property of a AgentDiagramNode.
    #: This constant has a value of "SUPERVISOR_AGENT"
    TYPE_SUPERVISOR_AGENT = "SUPERVISOR_AGENT"

    #: A constant which can be used with the type property of a AgentDiagramNode.
    #: This constant has a value of "SQL_TOOL"
    TYPE_SQL_TOOL = "SQL_TOOL"

    #: A constant which can be used with the type property of a AgentDiagramNode.
    #: This constant has a value of "PROMPT_TOOL"
    TYPE_PROMPT_TOOL = "PROMPT_TOOL"

    #: A constant which can be used with the type property of a AgentDiagramNode.
    #: This constant has a value of "RAG_TOOL"
    TYPE_RAG_TOOL = "RAG_TOOL"

    #: A constant which can be used with the type property of a AgentDiagramNode.
    #: This constant has a value of "MCP_TOOL"
    TYPE_MCP_TOOL = "MCP_TOOL"

    #: A constant which can be used with the type property of a AgentDiagramNode.
    #: This constant has a value of "HTTP_TOOL"
    TYPE_HTTP_TOOL = "HTTP_TOOL"

    #: A constant which can be used with the type property of a AgentDiagramNode.
    #: This constant has a value of "CUSTOM_TOOL"
    TYPE_CUSTOM_TOOL = "CUSTOM_TOOL"

    def __init__(self, **kwargs):
        """
        Initializes a new AgentDiagramNode object with values from keyword arguments. This class has the following subclasses and if you are using this class as input
        to a service operations then you should favor using a subclass over the base class:

        * :class:`~oci.aidataplatform_dp.models.AgentDiagramSupervisorAgentNode`
        * :class:`~oci.aidataplatform_dp.models.AgentDiagramSqlToolNode`
        * :class:`~oci.aidataplatform_dp.models.AgentDiagramCustomToolNode`
        * :class:`~oci.aidataplatform_dp.models.AgentDiagramStartNode`
        * :class:`~oci.aidataplatform_dp.models.AgentDiagramPromptToolNode`
        * :class:`~oci.aidataplatform_dp.models.AgentDiagramRagToolNode`
        * :class:`~oci.aidataplatform_dp.models.AgentDiagramMcpToolNode`
        * :class:`~oci.aidataplatform_dp.models.AgentDiagramGuardrailNode`
        * :class:`~oci.aidataplatform_dp.models.AgentDiagramAgentNode`
        * :class:`~oci.aidataplatform_dp.models.AgentDiagramHttpToolNode`

        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this AgentDiagramNode.
            Allowed values for this property are: "START_NODE", "GUARDRAILS", "AGENT", "SUPERVISOR_AGENT", "SQL_TOOL", "PROMPT_TOOL", "RAG_TOOL", "MCP_TOOL", "HTTP_TOOL", "CUSTOM_TOOL", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type type: str

        :param node_type:
            The value to assign to the node_type property of this AgentDiagramNode.
        :type node_type: str

        :param name:
            The value to assign to the name property of this AgentDiagramNode.
        :type name: str

        :param description:
            The value to assign to the description property of this AgentDiagramNode.
        :type description: str

        :param position_x:
            The value to assign to the position_x property of this AgentDiagramNode.
        :type position_x: float

        :param position_y:
            The value to assign to the position_y property of this AgentDiagramNode.
        :type position_y: float

        :param is_expanded:
            The value to assign to the is_expanded property of this AgentDiagramNode.
        :type is_expanded: bool

        :param parent_node_id:
            The value to assign to the parent_node_id property of this AgentDiagramNode.
        :type parent_node_id: str

        :param configuration:
            The value to assign to the configuration property of this AgentDiagramNode.
        :type configuration: dict(str, object)

        :param node_type_id:
            The value to assign to the node_type_id property of this AgentDiagramNode.
        :type node_type_id: str

        :param key:
            The value to assign to the key property of this AgentDiagramNode.
        :type key: str

        :param time_created:
            The value to assign to the time_created property of this AgentDiagramNode.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this AgentDiagramNode.
        :type time_updated: datetime

        :param inputs:
            The value to assign to the inputs property of this AgentDiagramNode.
        :type inputs: list[oci.aidataplatform_dp.models.NodeInput]

        :param outputs:
            The value to assign to the outputs property of this AgentDiagramNode.
        :type outputs: list[oci.aidataplatform_dp.models.NodeOutput]

        :param validation_errors:
            The value to assign to the validation_errors property of this AgentDiagramNode.
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

        if type == 'SUPERVISOR_AGENT':
            return 'AgentDiagramSupervisorAgentNode'

        if type == 'SQL_TOOL':
            return 'AgentDiagramSqlToolNode'

        if type == 'CUSTOM_TOOL':
            return 'AgentDiagramCustomToolNode'

        if type == 'START_NODE':
            return 'AgentDiagramStartNode'

        if type == 'PROMPT_TOOL':
            return 'AgentDiagramPromptToolNode'

        if type == 'RAG_TOOL':
            return 'AgentDiagramRagToolNode'

        if type == 'MCP_TOOL':
            return 'AgentDiagramMcpToolNode'

        if type == 'GUARDRAILS':
            return 'AgentDiagramGuardrailNode'

        if type == 'AGENT':
            return 'AgentDiagramAgentNode'

        if type == 'HTTP_TOOL':
            return 'AgentDiagramHttpToolNode'
        else:
            return 'AgentDiagramNode'

    @property
    def type(self):
        """
        Gets the type of this AgentDiagramNode.
        Node type discriminator.

        Allowed values for this property are: "START_NODE", "GUARDRAILS", "AGENT", "SUPERVISOR_AGENT", "SQL_TOOL", "PROMPT_TOOL", "RAG_TOOL", "MCP_TOOL", "HTTP_TOOL", "CUSTOM_TOOL", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The type of this AgentDiagramNode.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this AgentDiagramNode.
        Node type discriminator.


        :param type: The type of this AgentDiagramNode.
        :type: str
        """
        allowed_values = ["START_NODE", "GUARDRAILS", "AGENT", "SUPERVISOR_AGENT", "SQL_TOOL", "PROMPT_TOOL", "RAG_TOOL", "MCP_TOOL", "HTTP_TOOL", "CUSTOM_TOOL"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            type = 'UNKNOWN_ENUM_VALUE'
        self._type = type

    @property
    def node_type(self):
        """
        Gets the node_type of this AgentDiagramNode.
        This field is deprecated. | It does not need to be set to any value for API calls.


        :return: The node_type of this AgentDiagramNode.
        :rtype: str
        """
        return self._node_type

    @node_type.setter
    def node_type(self, node_type):
        """
        Sets the node_type of this AgentDiagramNode.
        This field is deprecated. | It does not need to be set to any value for API calls.


        :param node_type: The node_type of this AgentDiagramNode.
        :type: str
        """
        self._node_type = node_type

    @property
    def name(self):
        """
        Gets the name of this AgentDiagramNode.
        Name of this node.


        :return: The name of this AgentDiagramNode.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this AgentDiagramNode.
        Name of this node.


        :param name: The name of this AgentDiagramNode.
        :type: str
        """
        self._name = name

    @property
    def description(self):
        """
        Gets the description of this AgentDiagramNode.
        Description of this node.


        :return: The description of this AgentDiagramNode.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this AgentDiagramNode.
        Description of this node.


        :param description: The description of this AgentDiagramNode.
        :type: str
        """
        self._description = description

    @property
    def position_x(self):
        """
        Gets the position_x of this AgentDiagramNode.
        Canvas X coordinate.


        :return: The position_x of this AgentDiagramNode.
        :rtype: float
        """
        return self._position_x

    @position_x.setter
    def position_x(self, position_x):
        """
        Sets the position_x of this AgentDiagramNode.
        Canvas X coordinate.


        :param position_x: The position_x of this AgentDiagramNode.
        :type: float
        """
        self._position_x = position_x

    @property
    def position_y(self):
        """
        Gets the position_y of this AgentDiagramNode.
        Canvas Y coordinate.


        :return: The position_y of this AgentDiagramNode.
        :rtype: float
        """
        return self._position_y

    @position_y.setter
    def position_y(self, position_y):
        """
        Sets the position_y of this AgentDiagramNode.
        Canvas Y coordinate.


        :param position_y: The position_y of this AgentDiagramNode.
        :type: float
        """
        self._position_y = position_y

    @property
    def is_expanded(self):
        """
        Gets the is_expanded of this AgentDiagramNode.
        Is node expanded in UI.


        :return: The is_expanded of this AgentDiagramNode.
        :rtype: bool
        """
        return self._is_expanded

    @is_expanded.setter
    def is_expanded(self, is_expanded):
        """
        Sets the is_expanded of this AgentDiagramNode.
        Is node expanded in UI.


        :param is_expanded: The is_expanded of this AgentDiagramNode.
        :type: bool
        """
        self._is_expanded = is_expanded

    @property
    def parent_node_id(self):
        """
        Gets the parent_node_id of this AgentDiagramNode.
        Parent node ID, for subgraphs.


        :return: The parent_node_id of this AgentDiagramNode.
        :rtype: str
        """
        return self._parent_node_id

    @parent_node_id.setter
    def parent_node_id(self, parent_node_id):
        """
        Sets the parent_node_id of this AgentDiagramNode.
        Parent node ID, for subgraphs.


        :param parent_node_id: The parent_node_id of this AgentDiagramNode.
        :type: str
        """
        self._parent_node_id = parent_node_id

    @property
    def configuration(self):
        """
        Gets the configuration of this AgentDiagramNode.
        Configuration object for this node.


        :return: The configuration of this AgentDiagramNode.
        :rtype: dict(str, object)
        """
        return self._configuration

    @configuration.setter
    def configuration(self, configuration):
        """
        Sets the configuration of this AgentDiagramNode.
        Configuration object for this node.


        :param configuration: The configuration of this AgentDiagramNode.
        :type: dict(str, object)
        """
        self._configuration = configuration

    @property
    def node_type_id(self):
        """
        Gets the node_type_id of this AgentDiagramNode.
        Definition ID for this node type.


        :return: The node_type_id of this AgentDiagramNode.
        :rtype: str
        """
        return self._node_type_id

    @node_type_id.setter
    def node_type_id(self, node_type_id):
        """
        Sets the node_type_id of this AgentDiagramNode.
        Definition ID for this node type.


        :param node_type_id: The node_type_id of this AgentDiagramNode.
        :type: str
        """
        self._node_type_id = node_type_id

    @property
    def key(self):
        """
        **[Required]** Gets the key of this AgentDiagramNode.
        Unique identifier for the node.


        :return: The key of this AgentDiagramNode.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this AgentDiagramNode.
        Unique identifier for the node.


        :param key: The key of this AgentDiagramNode.
        :type: str
        """
        self._key = key

    @property
    def time_created(self):
        """
        Gets the time_created of this AgentDiagramNode.
        RFC3339 timestamp when node was created.


        :return: The time_created of this AgentDiagramNode.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this AgentDiagramNode.
        RFC3339 timestamp when node was created.


        :param time_created: The time_created of this AgentDiagramNode.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this AgentDiagramNode.
        RFC3339 timestamp when node was last updated.


        :return: The time_updated of this AgentDiagramNode.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this AgentDiagramNode.
        RFC3339 timestamp when node was last updated.


        :param time_updated: The time_updated of this AgentDiagramNode.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def inputs(self):
        """
        Gets the inputs of this AgentDiagramNode.
        Array of NodeInput objects.


        :return: The inputs of this AgentDiagramNode.
        :rtype: list[oci.aidataplatform_dp.models.NodeInput]
        """
        return self._inputs

    @inputs.setter
    def inputs(self, inputs):
        """
        Sets the inputs of this AgentDiagramNode.
        Array of NodeInput objects.


        :param inputs: The inputs of this AgentDiagramNode.
        :type: list[oci.aidataplatform_dp.models.NodeInput]
        """
        self._inputs = inputs

    @property
    def outputs(self):
        """
        Gets the outputs of this AgentDiagramNode.
        Array of NodeOutput objects.


        :return: The outputs of this AgentDiagramNode.
        :rtype: list[oci.aidataplatform_dp.models.NodeOutput]
        """
        return self._outputs

    @outputs.setter
    def outputs(self, outputs):
        """
        Sets the outputs of this AgentDiagramNode.
        Array of NodeOutput objects.


        :param outputs: The outputs of this AgentDiagramNode.
        :type: list[oci.aidataplatform_dp.models.NodeOutput]
        """
        self._outputs = outputs

    @property
    def validation_errors(self):
        """
        Gets the validation_errors of this AgentDiagramNode.
        List of validation errors encountered in the diagram.


        :return: The validation_errors of this AgentDiagramNode.
        :rtype: list[oci.aidataplatform_dp.models.ValidationError]
        """
        return self._validation_errors

    @validation_errors.setter
    def validation_errors(self, validation_errors):
        """
        Sets the validation_errors of this AgentDiagramNode.
        List of validation errors encountered in the diagram.


        :param validation_errors: The validation_errors of this AgentDiagramNode.
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
