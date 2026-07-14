# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateAgentDiagramNodeDetails(object):
    """
    Details required to create a new node in a diagram.
    """

    #: A constant which can be used with the type property of a CreateAgentDiagramNodeDetails.
    #: This constant has a value of "START_NODE"
    TYPE_START_NODE = "START_NODE"

    #: A constant which can be used with the type property of a CreateAgentDiagramNodeDetails.
    #: This constant has a value of "GUARDRAILS"
    TYPE_GUARDRAILS = "GUARDRAILS"

    #: A constant which can be used with the type property of a CreateAgentDiagramNodeDetails.
    #: This constant has a value of "AGENT"
    TYPE_AGENT = "AGENT"

    #: A constant which can be used with the type property of a CreateAgentDiagramNodeDetails.
    #: This constant has a value of "SUPERVISOR_AGENT"
    TYPE_SUPERVISOR_AGENT = "SUPERVISOR_AGENT"

    #: A constant which can be used with the type property of a CreateAgentDiagramNodeDetails.
    #: This constant has a value of "SQL_TOOL"
    TYPE_SQL_TOOL = "SQL_TOOL"

    #: A constant which can be used with the type property of a CreateAgentDiagramNodeDetails.
    #: This constant has a value of "PROMPT_TOOL"
    TYPE_PROMPT_TOOL = "PROMPT_TOOL"

    #: A constant which can be used with the type property of a CreateAgentDiagramNodeDetails.
    #: This constant has a value of "RAG_TOOL"
    TYPE_RAG_TOOL = "RAG_TOOL"

    #: A constant which can be used with the type property of a CreateAgentDiagramNodeDetails.
    #: This constant has a value of "MCP_TOOL"
    TYPE_MCP_TOOL = "MCP_TOOL"

    #: A constant which can be used with the type property of a CreateAgentDiagramNodeDetails.
    #: This constant has a value of "HTTP_TOOL"
    TYPE_HTTP_TOOL = "HTTP_TOOL"

    #: A constant which can be used with the type property of a CreateAgentDiagramNodeDetails.
    #: This constant has a value of "CUSTOM_TOOL"
    TYPE_CUSTOM_TOOL = "CUSTOM_TOOL"

    def __init__(self, **kwargs):
        """
        Initializes a new CreateAgentDiagramNodeDetails object with values from keyword arguments. This class has the following subclasses and if you are using this class as input
        to a service operations then you should favor using a subclass over the base class:

        * :class:`~oci.aidataplatform_dp.models.CreateAgentDiagramRagToolNodeDetails`
        * :class:`~oci.aidataplatform_dp.models.CreateAgentDiagramHttpToolNodeDetails`
        * :class:`~oci.aidataplatform_dp.models.CreateAgentDiagramAgentNodeDetails`
        * :class:`~oci.aidataplatform_dp.models.CreateAgentDiagramSqlToolNodeDetails`
        * :class:`~oci.aidataplatform_dp.models.CreateAgentDiagramCustomToolNodeDetails`
        * :class:`~oci.aidataplatform_dp.models.CreateAgentDiagramMcpToolNodeDetails`
        * :class:`~oci.aidataplatform_dp.models.CreateAgentDiagramPromptToolNodeDetails`

        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this CreateAgentDiagramNodeDetails.
            Allowed values for this property are: "START_NODE", "GUARDRAILS", "AGENT", "SUPERVISOR_AGENT", "SQL_TOOL", "PROMPT_TOOL", "RAG_TOOL", "MCP_TOOL", "HTTP_TOOL", "CUSTOM_TOOL"
        :type type: str

        :param node_type:
            The value to assign to the node_type property of this CreateAgentDiagramNodeDetails.
        :type node_type: str

        :param name:
            The value to assign to the name property of this CreateAgentDiagramNodeDetails.
        :type name: str

        :param description:
            The value to assign to the description property of this CreateAgentDiagramNodeDetails.
        :type description: str

        :param position_x:
            The value to assign to the position_x property of this CreateAgentDiagramNodeDetails.
        :type position_x: float

        :param position_y:
            The value to assign to the position_y property of this CreateAgentDiagramNodeDetails.
        :type position_y: float

        :param is_expanded:
            The value to assign to the is_expanded property of this CreateAgentDiagramNodeDetails.
        :type is_expanded: bool

        :param parent_node_id:
            The value to assign to the parent_node_id property of this CreateAgentDiagramNodeDetails.
        :type parent_node_id: str

        :param src_node_id:
            The value to assign to the src_node_id property of this CreateAgentDiagramNodeDetails.
        :type src_node_id: str

        :param configuration:
            The value to assign to the configuration property of this CreateAgentDiagramNodeDetails.
        :type configuration: dict(str, object)

        :param node_type_id:
            The value to assign to the node_type_id property of this CreateAgentDiagramNodeDetails.
        :type node_type_id: str

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
            'node_type_id': 'str'
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
            'node_type_id': 'nodeTypeId'
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

    @staticmethod
    def get_subtype(object_dictionary):
        """
        Given the hash representation of a subtype of this class,
        use the info in the hash to return the class of the subtype.
        """
        type = object_dictionary['type']

        if type == 'RAG_TOOL':
            return 'CreateAgentDiagramRagToolNodeDetails'

        if type == 'HTTP_TOOL':
            return 'CreateAgentDiagramHttpToolNodeDetails'

        if type == 'AGENT':
            return 'CreateAgentDiagramAgentNodeDetails'

        if type == 'SQL_TOOL':
            return 'CreateAgentDiagramSqlToolNodeDetails'

        if type == 'CUSTOM_TOOL':
            return 'CreateAgentDiagramCustomToolNodeDetails'

        if type == 'MCP_TOOL':
            return 'CreateAgentDiagramMcpToolNodeDetails'

        if type == 'PROMPT_TOOL':
            return 'CreateAgentDiagramPromptToolNodeDetails'
        else:
            return 'CreateAgentDiagramNodeDetails'

    @property
    def type(self):
        """
        Gets the type of this CreateAgentDiagramNodeDetails.
        Node type discriminator.

        Allowed values for this property are: "START_NODE", "GUARDRAILS", "AGENT", "SUPERVISOR_AGENT", "SQL_TOOL", "PROMPT_TOOL", "RAG_TOOL", "MCP_TOOL", "HTTP_TOOL", "CUSTOM_TOOL"


        :return: The type of this CreateAgentDiagramNodeDetails.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this CreateAgentDiagramNodeDetails.
        Node type discriminator.


        :param type: The type of this CreateAgentDiagramNodeDetails.
        :type: str
        """
        allowed_values = ["START_NODE", "GUARDRAILS", "AGENT", "SUPERVISOR_AGENT", "SQL_TOOL", "PROMPT_TOOL", "RAG_TOOL", "MCP_TOOL", "HTTP_TOOL", "CUSTOM_TOOL"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            raise ValueError(
                "Invalid value for `type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._type = type

    @property
    def node_type(self):
        """
        Gets the node_type of this CreateAgentDiagramNodeDetails.
        This field is deprecated. | It does not need to be set to any value for API calls.


        :return: The node_type of this CreateAgentDiagramNodeDetails.
        :rtype: str
        """
        return self._node_type

    @node_type.setter
    def node_type(self, node_type):
        """
        Sets the node_type of this CreateAgentDiagramNodeDetails.
        This field is deprecated. | It does not need to be set to any value for API calls.


        :param node_type: The node_type of this CreateAgentDiagramNodeDetails.
        :type: str
        """
        self._node_type = node_type

    @property
    def name(self):
        """
        Gets the name of this CreateAgentDiagramNodeDetails.
        Name of this node.


        :return: The name of this CreateAgentDiagramNodeDetails.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this CreateAgentDiagramNodeDetails.
        Name of this node.


        :param name: The name of this CreateAgentDiagramNodeDetails.
        :type: str
        """
        self._name = name

    @property
    def description(self):
        """
        Gets the description of this CreateAgentDiagramNodeDetails.
        Description of this node.


        :return: The description of this CreateAgentDiagramNodeDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this CreateAgentDiagramNodeDetails.
        Description of this node.


        :param description: The description of this CreateAgentDiagramNodeDetails.
        :type: str
        """
        self._description = description

    @property
    def position_x(self):
        """
        Gets the position_x of this CreateAgentDiagramNodeDetails.
        Canvas X coordinate.


        :return: The position_x of this CreateAgentDiagramNodeDetails.
        :rtype: float
        """
        return self._position_x

    @position_x.setter
    def position_x(self, position_x):
        """
        Sets the position_x of this CreateAgentDiagramNodeDetails.
        Canvas X coordinate.


        :param position_x: The position_x of this CreateAgentDiagramNodeDetails.
        :type: float
        """
        self._position_x = position_x

    @property
    def position_y(self):
        """
        Gets the position_y of this CreateAgentDiagramNodeDetails.
        Canvas Y coordinate.


        :return: The position_y of this CreateAgentDiagramNodeDetails.
        :rtype: float
        """
        return self._position_y

    @position_y.setter
    def position_y(self, position_y):
        """
        Sets the position_y of this CreateAgentDiagramNodeDetails.
        Canvas Y coordinate.


        :param position_y: The position_y of this CreateAgentDiagramNodeDetails.
        :type: float
        """
        self._position_y = position_y

    @property
    def is_expanded(self):
        """
        Gets the is_expanded of this CreateAgentDiagramNodeDetails.
        Is node expanded in UI.


        :return: The is_expanded of this CreateAgentDiagramNodeDetails.
        :rtype: bool
        """
        return self._is_expanded

    @is_expanded.setter
    def is_expanded(self, is_expanded):
        """
        Sets the is_expanded of this CreateAgentDiagramNodeDetails.
        Is node expanded in UI.


        :param is_expanded: The is_expanded of this CreateAgentDiagramNodeDetails.
        :type: bool
        """
        self._is_expanded = is_expanded

    @property
    def parent_node_id(self):
        """
        Gets the parent_node_id of this CreateAgentDiagramNodeDetails.
        Parent node ID, for subgraphs.


        :return: The parent_node_id of this CreateAgentDiagramNodeDetails.
        :rtype: str
        """
        return self._parent_node_id

    @parent_node_id.setter
    def parent_node_id(self, parent_node_id):
        """
        Sets the parent_node_id of this CreateAgentDiagramNodeDetails.
        Parent node ID, for subgraphs.


        :param parent_node_id: The parent_node_id of this CreateAgentDiagramNodeDetails.
        :type: str
        """
        self._parent_node_id = parent_node_id

    @property
    def src_node_id(self):
        """
        Gets the src_node_id of this CreateAgentDiagramNodeDetails.
        Source node to which this node is connected.


        :return: The src_node_id of this CreateAgentDiagramNodeDetails.
        :rtype: str
        """
        return self._src_node_id

    @src_node_id.setter
    def src_node_id(self, src_node_id):
        """
        Sets the src_node_id of this CreateAgentDiagramNodeDetails.
        Source node to which this node is connected.


        :param src_node_id: The src_node_id of this CreateAgentDiagramNodeDetails.
        :type: str
        """
        self._src_node_id = src_node_id

    @property
    def configuration(self):
        """
        Gets the configuration of this CreateAgentDiagramNodeDetails.
        Configuration object for this node.


        :return: The configuration of this CreateAgentDiagramNodeDetails.
        :rtype: dict(str, object)
        """
        return self._configuration

    @configuration.setter
    def configuration(self, configuration):
        """
        Sets the configuration of this CreateAgentDiagramNodeDetails.
        Configuration object for this node.


        :param configuration: The configuration of this CreateAgentDiagramNodeDetails.
        :type: dict(str, object)
        """
        self._configuration = configuration

    @property
    def node_type_id(self):
        """
        Gets the node_type_id of this CreateAgentDiagramNodeDetails.
        Definition ID for this node type.


        :return: The node_type_id of this CreateAgentDiagramNodeDetails.
        :rtype: str
        """
        return self._node_type_id

    @node_type_id.setter
    def node_type_id(self, node_type_id):
        """
        Sets the node_type_id of this CreateAgentDiagramNodeDetails.
        Definition ID for this node type.


        :param node_type_id: The node_type_id of this CreateAgentDiagramNodeDetails.
        :type: str
        """
        self._node_type_id = node_type_id

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
