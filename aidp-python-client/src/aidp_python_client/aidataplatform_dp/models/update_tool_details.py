# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdateToolDetails(object):
    """
    The data to update a tool.
    """

    #: A constant which can be used with the tool_type property of a UpdateToolDetails.
    #: This constant has a value of "RAG"
    TOOL_TYPE_RAG = "RAG"

    #: A constant which can be used with the tool_type property of a UpdateToolDetails.
    #: This constant has a value of "SQL"
    TOOL_TYPE_SQL = "SQL"

    #: A constant which can be used with the tool_type property of a UpdateToolDetails.
    #: This constant has a value of "PROMPT"
    TOOL_TYPE_PROMPT = "PROMPT"

    #: A constant which can be used with the tool_type property of a UpdateToolDetails.
    #: This constant has a value of "NL2SQL"
    TOOL_TYPE_NL2_SQL = "NL2SQL"

    #: A constant which can be used with the tool_type property of a UpdateToolDetails.
    #: This constant has a value of "MCP"
    TOOL_TYPE_MCP = "MCP"

    #: A constant which can be used with the tool_type property of a UpdateToolDetails.
    #: This constant has a value of "CUSTOM"
    TOOL_TYPE_CUSTOM = "CUSTOM"

    #: A constant which can be used with the tool_type property of a UpdateToolDetails.
    #: This constant has a value of "HTTP"
    TOOL_TYPE_HTTP = "HTTP"

    #: A constant which can be used with the tool_type property of a UpdateToolDetails.
    #: This constant has a value of "REFERENCE"
    TOOL_TYPE_REFERENCE = "REFERENCE"

    def __init__(self, **kwargs):
        """
        Initializes a new UpdateToolDetails object with values from keyword arguments. This class has the following subclasses and if you are using this class as input
        to a service operations then you should favor using a subclass over the base class:

        * :class:`~oci.aidataplatform_dp.models.UpdateCustomToolDetails`
        * :class:`~oci.aidataplatform_dp.models.UpdateHttpToolDetails`
        * :class:`~oci.aidataplatform_dp.models.UpdatePromptToolDetails`
        * :class:`~oci.aidataplatform_dp.models.UpdateRagToolDetails`
        * :class:`~oci.aidataplatform_dp.models.UpdateSqlToolDetails`
        * :class:`~oci.aidataplatform_dp.models.UpdateNlToSqlToolDetails`

        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param display_name:
            The value to assign to the display_name property of this UpdateToolDetails.
        :type display_name: str

        :param description:
            The value to assign to the description property of this UpdateToolDetails.
        :type description: str

        :param tool_type:
            The value to assign to the tool_type property of this UpdateToolDetails.
            Allowed values for this property are: "RAG", "SQL", "PROMPT", "NL2SQL", "MCP", "CUSTOM", "HTTP", "REFERENCE"
        :type tool_type: str

        :param properties:
            The value to assign to the properties property of this UpdateToolDetails.
        :type properties: dict(str, object)

        """
        self.swagger_types = {
            'display_name': 'str',
            'description': 'str',
            'tool_type': 'str',
            'properties': 'dict(str, object)'
        }

        self.attribute_map = {
            'display_name': 'displayName',
            'description': 'description',
            'tool_type': 'toolType',
            'properties': 'properties'
        }

        self._display_name = None
        self._description = None
        self._tool_type = None
        self._properties = None

    @staticmethod
    def get_subtype(object_dictionary):
        """
        Given the hash representation of a subtype of this class,
        use the info in the hash to return the class of the subtype.
        """
        type = object_dictionary['toolType']

        if type == 'CUSTOM':
            return 'UpdateCustomToolDetails'

        if type == 'HTTP':
            return 'UpdateHttpToolDetails'

        if type == 'PROMPT':
            return 'UpdatePromptToolDetails'

        if type == 'RAG':
            return 'UpdateRagToolDetails'

        if type == 'SQL':
            return 'UpdateSqlToolDetails'

        if type == 'NL2SQL':
            return 'UpdateNlToSqlToolDetails'
        else:
            return 'UpdateToolDetails'

    @property
    def display_name(self):
        """
        Gets the display_name of this UpdateToolDetails.
        Tool name.


        :return: The display_name of this UpdateToolDetails.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this UpdateToolDetails.
        Tool name.


        :param display_name: The display_name of this UpdateToolDetails.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this UpdateToolDetails.
        Tool description.


        :return: The description of this UpdateToolDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this UpdateToolDetails.
        Tool description.


        :param description: The description of this UpdateToolDetails.
        :type: str
        """
        self._description = description

    @property
    def tool_type(self):
        """
        Gets the tool_type of this UpdateToolDetails.
        Type of tool. Managed, external or mount tool.

        Allowed values for this property are: "RAG", "SQL", "PROMPT", "NL2SQL", "MCP", "CUSTOM", "HTTP", "REFERENCE"


        :return: The tool_type of this UpdateToolDetails.
        :rtype: str
        """
        return self._tool_type

    @tool_type.setter
    def tool_type(self, tool_type):
        """
        Sets the tool_type of this UpdateToolDetails.
        Type of tool. Managed, external or mount tool.


        :param tool_type: The tool_type of this UpdateToolDetails.
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
    def properties(self):
        """
        Gets the properties of this UpdateToolDetails.
        A list of key-value pairs to use for configuring the tool


        :return: The properties of this UpdateToolDetails.
        :rtype: dict(str, object)
        """
        return self._properties

    @properties.setter
    def properties(self, properties):
        """
        Sets the properties of this UpdateToolDetails.
        A list of key-value pairs to use for configuring the tool


        :param properties: The properties of this UpdateToolDetails.
        :type: dict(str, object)
        """
        self._properties = properties

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
