# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ToolSummary(object):
    """
    Summary information of tool in the schema.
    """

    #: A constant which can be used with the tool_type property of a ToolSummary.
    #: This constant has a value of "RAG"
    TOOL_TYPE_RAG = "RAG"

    #: A constant which can be used with the tool_type property of a ToolSummary.
    #: This constant has a value of "SQL"
    TOOL_TYPE_SQL = "SQL"

    #: A constant which can be used with the tool_type property of a ToolSummary.
    #: This constant has a value of "PROMPT"
    TOOL_TYPE_PROMPT = "PROMPT"

    #: A constant which can be used with the tool_type property of a ToolSummary.
    #: This constant has a value of "NL2SQL"
    TOOL_TYPE_NL2_SQL = "NL2SQL"

    #: A constant which can be used with the tool_type property of a ToolSummary.
    #: This constant has a value of "MCP"
    TOOL_TYPE_MCP = "MCP"

    #: A constant which can be used with the tool_type property of a ToolSummary.
    #: This constant has a value of "CUSTOM"
    TOOL_TYPE_CUSTOM = "CUSTOM"

    #: A constant which can be used with the tool_type property of a ToolSummary.
    #: This constant has a value of "HTTP"
    TOOL_TYPE_HTTP = "HTTP"

    #: A constant which can be used with the tool_type property of a ToolSummary.
    #: This constant has a value of "REFERENCE"
    TOOL_TYPE_REFERENCE = "REFERENCE"

    def __init__(self, **kwargs):
        """
        Initializes a new ToolSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this ToolSummary.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this ToolSummary.
        :type display_name: str

        :param tool_type:
            The value to assign to the tool_type property of this ToolSummary.
            Allowed values for this property are: "RAG", "SQL", "PROMPT", "NL2SQL", "MCP", "CUSTOM", "HTTP", "REFERENCE"
        :type tool_type: str

        :param workspace_key:
            The value to assign to the workspace_key property of this ToolSummary.
        :type workspace_key: str

        :param description:
            The value to assign to the description property of this ToolSummary.
        :type description: str

        :param time_created:
            The value to assign to the time_created property of this ToolSummary.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this ToolSummary.
        :type time_updated: datetime

        :param created_by:
            The value to assign to the created_by property of this ToolSummary.
        :type created_by: str

        :param updated_by:
            The value to assign to the updated_by property of this ToolSummary.
        :type updated_by: str

        """
        self.swagger_types = {
            'key': 'str',
            'display_name': 'str',
            'tool_type': 'str',
            'workspace_key': 'str',
            'description': 'str',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'created_by': 'str',
            'updated_by': 'str'
        }

        self.attribute_map = {
            'key': 'key',
            'display_name': 'displayName',
            'tool_type': 'toolType',
            'workspace_key': 'workspaceKey',
            'description': 'description',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'created_by': 'createdBy',
            'updated_by': 'updatedBy'
        }

        self._key = None
        self._display_name = None
        self._tool_type = None
        self._workspace_key = None
        self._description = None
        self._time_created = None
        self._time_updated = None
        self._created_by = None
        self._updated_by = None

    @property
    def key(self):
        """
        **[Required]** Gets the key of this ToolSummary.
        The unique identifier of the tool


        :return: The key of this ToolSummary.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this ToolSummary.
        The unique identifier of the tool


        :param key: The key of this ToolSummary.
        :type: str
        """
        self._key = key

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this ToolSummary.
        Tool name.


        :return: The display_name of this ToolSummary.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this ToolSummary.
        Tool name.


        :param display_name: The display_name of this ToolSummary.
        :type: str
        """
        self._display_name = display_name

    @property
    def tool_type(self):
        """
        **[Required]** Gets the tool_type of this ToolSummary.
        Type of tool. Managed, external or mount tool.

        Allowed values for this property are: "RAG", "SQL", "PROMPT", "NL2SQL", "MCP", "CUSTOM", "HTTP", "REFERENCE"


        :return: The tool_type of this ToolSummary.
        :rtype: str
        """
        return self._tool_type

    @tool_type.setter
    def tool_type(self, tool_type):
        """
        Sets the tool_type of this ToolSummary.
        Type of tool. Managed, external or mount tool.


        :param tool_type: The tool_type of this ToolSummary.
        :type: str
        """
        allowed_values = ["RAG", "SQL", "PROMPT", "NL2SQL", "MCP", "CUSTOM", "HTTP", "REFERENCE"]
        if not value_allowed_none_or_none_sentinel(tool_type, allowed_values):
            raise ValueError(
                "Invalid value for `tool_type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._tool_type = tool_type

    @property
    def workspace_key(self):
        """
        Gets the workspace_key of this ToolSummary.
        The key of the Workspace to which this tool belongs.


        :return: The workspace_key of this ToolSummary.
        :rtype: str
        """
        return self._workspace_key

    @workspace_key.setter
    def workspace_key(self, workspace_key):
        """
        Sets the workspace_key of this ToolSummary.
        The key of the Workspace to which this tool belongs.


        :param workspace_key: The workspace_key of this ToolSummary.
        :type: str
        """
        self._workspace_key = workspace_key

    @property
    def description(self):
        """
        Gets the description of this ToolSummary.
        Tool description.


        :return: The description of this ToolSummary.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this ToolSummary.
        Tool description.


        :param description: The description of this ToolSummary.
        :type: str
        """
        self._description = description

    @property
    def time_created(self):
        """
        Gets the time_created of this ToolSummary.
        The date and time the tool was created.


        :return: The time_created of this ToolSummary.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this ToolSummary.
        The date and time the tool was created.


        :param time_created: The time_created of this ToolSummary.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this ToolSummary.
        The date and time the tool was updated.


        :return: The time_updated of this ToolSummary.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this ToolSummary.
        The date and time the tool was updated.


        :param time_updated: The time_updated of this ToolSummary.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def created_by(self):
        """
        Gets the created_by of this ToolSummary.
        The OCID of the user/principal who created the tool.


        :return: The created_by of this ToolSummary.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this ToolSummary.
        The OCID of the user/principal who created the tool.


        :param created_by: The created_by of this ToolSummary.
        :type: str
        """
        self._created_by = created_by

    @property
    def updated_by(self):
        """
        Gets the updated_by of this ToolSummary.
        The ID of the user who last updated the schema.


        :return: The updated_by of this ToolSummary.
        :rtype: str
        """
        return self._updated_by

    @updated_by.setter
    def updated_by(self, updated_by):
        """
        Sets the updated_by of this ToolSummary.
        The ID of the user who last updated the schema.


        :param updated_by: The updated_by of this ToolSummary.
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
