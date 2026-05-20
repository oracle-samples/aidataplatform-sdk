# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class Tool(object):
    """
    A tool is a function that an agent can call. Tools can retrieve data, call external APIs, HTTP endpoints, execute a snippet of code, entire Python scripts, etc. | A tool is stateless, doesn't reason  (it just executes), and can be reused across agents.
    """

    #: A constant which can be used with the tool_type property of a Tool.
    #: This constant has a value of "RAG"
    TOOL_TYPE_RAG = "RAG"

    #: A constant which can be used with the tool_type property of a Tool.
    #: This constant has a value of "SQL"
    TOOL_TYPE_SQL = "SQL"

    #: A constant which can be used with the tool_type property of a Tool.
    #: This constant has a value of "PROMPT"
    TOOL_TYPE_PROMPT = "PROMPT"

    #: A constant which can be used with the tool_type property of a Tool.
    #: This constant has a value of "NL2SQL"
    TOOL_TYPE_NL2_SQL = "NL2SQL"

    #: A constant which can be used with the tool_type property of a Tool.
    #: This constant has a value of "MCP"
    TOOL_TYPE_MCP = "MCP"

    #: A constant which can be used with the tool_type property of a Tool.
    #: This constant has a value of "CUSTOM"
    TOOL_TYPE_CUSTOM = "CUSTOM"

    #: A constant which can be used with the tool_type property of a Tool.
    #: This constant has a value of "HTTP"
    TOOL_TYPE_HTTP = "HTTP"

    def __init__(self, **kwargs):
        """
        Initializes a new Tool object with values from keyword arguments. This class has the following subclasses and if you are using this class as input
        to a service operations then you should favor using a subclass over the base class:

        * :class:`~oci.aidataplatform_dp.models.CustomTool`
        * :class:`~oci.aidataplatform_dp.models.PromptTool`
        * :class:`~oci.aidataplatform_dp.models.McpTool`
        * :class:`~oci.aidataplatform_dp.models.SqlTool`
        * :class:`~oci.aidataplatform_dp.models.RagTool`
        * :class:`~oci.aidataplatform_dp.models.HttpTool`
        * :class:`~oci.aidataplatform_dp.models.NlToSqlTool`

        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this Tool.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this Tool.
        :type display_name: str

        :param workspace_key:
            The value to assign to the workspace_key property of this Tool.
        :type workspace_key: str

        :param description:
            The value to assign to the description property of this Tool.
        :type description: str

        :param tool_type:
            The value to assign to the tool_type property of this Tool.
            Allowed values for this property are: "RAG", "SQL", "PROMPT", "NL2SQL", "MCP", "CUSTOM", "HTTP"
        :type tool_type: str

        :param position_x:
            The value to assign to the position_x property of this Tool.
        :type position_x: float

        :param position_y:
            The value to assign to the position_y property of this Tool.
        :type position_y: float

        :param properties:
            The value to assign to the properties property of this Tool.
        :type properties: dict(str, object)

        :param time_created:
            The value to assign to the time_created property of this Tool.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this Tool.
        :type time_updated: datetime

        :param created_by:
            The value to assign to the created_by property of this Tool.
        :type created_by: str

        :param updated_by:
            The value to assign to the updated_by property of this Tool.
        :type updated_by: str

        """
        self.swagger_types = {
            'key': 'str',
            'display_name': 'str',
            'workspace_key': 'str',
            'description': 'str',
            'tool_type': 'str',
            'position_x': 'float',
            'position_y': 'float',
            'properties': 'dict(str, object)',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'created_by': 'str',
            'updated_by': 'str'
        }

        self.attribute_map = {
            'key': 'key',
            'display_name': 'displayName',
            'workspace_key': 'workspaceKey',
            'description': 'description',
            'tool_type': 'toolType',
            'position_x': 'positionX',
            'position_y': 'positionY',
            'properties': 'properties',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'created_by': 'createdBy',
            'updated_by': 'updatedBy'
        }

        self._key = None
        self._display_name = None
        self._workspace_key = None
        self._description = None
        self._tool_type = None
        self._position_x = None
        self._position_y = None
        self._properties = None
        self._time_created = None
        self._time_updated = None
        self._created_by = None
        self._updated_by = None

    @staticmethod
    def get_subtype(object_dictionary):
        """
        Given the hash representation of a subtype of this class,
        use the info in the hash to return the class of the subtype.
        """
        type = object_dictionary['toolType']

        if type == 'CUSTOM':
            return 'CustomTool'

        if type == 'PROMPT':
            return 'PromptTool'

        if type == 'MCP':
            return 'McpTool'

        if type == 'SQL':
            return 'SqlTool'

        if type == 'RAG':
            return 'RagTool'

        if type == 'HTTP':
            return 'HttpTool'

        if type == 'NL2SQL':
            return 'NlToSqlTool'
        else:
            return 'Tool'

    @property
    def key(self):
        """
        Gets the key of this Tool.
        The unique identifier of the tool


        :return: The key of this Tool.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this Tool.
        The unique identifier of the tool


        :param key: The key of this Tool.
        :type: str
        """
        self._key = key

    @property
    def display_name(self):
        """
        Gets the display_name of this Tool.
        Tool name.


        :return: The display_name of this Tool.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this Tool.
        Tool name.


        :param display_name: The display_name of this Tool.
        :type: str
        """
        self._display_name = display_name

    @property
    def workspace_key(self):
        """
        Gets the workspace_key of this Tool.
        The key of the Workspace to which this tool belongs.


        :return: The workspace_key of this Tool.
        :rtype: str
        """
        return self._workspace_key

    @workspace_key.setter
    def workspace_key(self, workspace_key):
        """
        Sets the workspace_key of this Tool.
        The key of the Workspace to which this tool belongs.


        :param workspace_key: The workspace_key of this Tool.
        :type: str
        """
        self._workspace_key = workspace_key

    @property
    def description(self):
        """
        Gets the description of this Tool.
        Tool description.


        :return: The description of this Tool.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this Tool.
        Tool description.


        :param description: The description of this Tool.
        :type: str
        """
        self._description = description

    @property
    def tool_type(self):
        """
        Gets the tool_type of this Tool.
        Type of tool. Managed, external or mount tool.

        Allowed values for this property are: "RAG", "SQL", "PROMPT", "NL2SQL", "MCP", "CUSTOM", "HTTP"


        :return: The tool_type of this Tool.
        :rtype: str
        """
        return self._tool_type

    @tool_type.setter
    def tool_type(self, tool_type):
        """
        Sets the tool_type of this Tool.
        Type of tool. Managed, external or mount tool.


        :param tool_type: The tool_type of this Tool.
        :type: str
        """
        allowed_values = ["RAG", "SQL", "PROMPT", "NL2SQL", "MCP", "CUSTOM", "HTTP"]
        if not value_allowed_none_or_none_sentinel(tool_type, allowed_values):
            raise ValueError(
                "Invalid value for `tool_type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._tool_type = tool_type

    @property
    def position_x(self):
        """
        Gets the position_x of this Tool.
        Canvas X coordinate of the Tool node


        :return: The position_x of this Tool.
        :rtype: float
        """
        return self._position_x

    @position_x.setter
    def position_x(self, position_x):
        """
        Sets the position_x of this Tool.
        Canvas X coordinate of the Tool node


        :param position_x: The position_x of this Tool.
        :type: float
        """
        self._position_x = position_x

    @property
    def position_y(self):
        """
        Gets the position_y of this Tool.
        Canvas Y coordinate of the Tool node


        :return: The position_y of this Tool.
        :rtype: float
        """
        return self._position_y

    @position_y.setter
    def position_y(self, position_y):
        """
        Sets the position_y of this Tool.
        Canvas Y coordinate of the Tool node


        :param position_y: The position_y of this Tool.
        :type: float
        """
        self._position_y = position_y

    @property
    def properties(self):
        """
        Gets the properties of this Tool.
        A list of key-value pairs to use for configuring the tool


        :return: The properties of this Tool.
        :rtype: dict(str, object)
        """
        return self._properties

    @properties.setter
    def properties(self, properties):
        """
        Sets the properties of this Tool.
        A list of key-value pairs to use for configuring the tool


        :param properties: The properties of this Tool.
        :type: dict(str, object)
        """
        self._properties = properties

    @property
    def time_created(self):
        """
        Gets the time_created of this Tool.
        The date and time the tool was created.


        :return: The time_created of this Tool.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this Tool.
        The date and time the tool was created.


        :param time_created: The time_created of this Tool.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this Tool.
        The date and time the tool was updated.


        :return: The time_updated of this Tool.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this Tool.
        The date and time the tool was updated.


        :param time_updated: The time_updated of this Tool.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def created_by(self):
        """
        Gets the created_by of this Tool.
        The OCID of the user/principal who created the tool.


        :return: The created_by of this Tool.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this Tool.
        The OCID of the user/principal who created the tool.


        :param created_by: The created_by of this Tool.
        :type: str
        """
        self._created_by = created_by

    @property
    def updated_by(self):
        """
        Gets the updated_by of this Tool.
        The ID of the user who last updated the schema.


        :return: The updated_by of this Tool.
        :rtype: str
        """
        return self._updated_by

    @updated_by.setter
    def updated_by(self, updated_by):
        """
        Sets the updated_by of this Tool.
        The ID of the user who last updated the schema.


        :param updated_by: The updated_by of this Tool.
        :type: str
        """
        self._updated_by = updated_by

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
