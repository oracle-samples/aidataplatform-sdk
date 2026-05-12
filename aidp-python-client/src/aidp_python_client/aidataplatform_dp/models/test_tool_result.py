# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class TestToolResult(object):
    """
    Base response for a test tool action.
    """

    #: A constant which can be used with the tool_type property of a TestToolResult.
    #: This constant has a value of "SQL"
    TOOL_TYPE_SQL = "SQL"

    #: A constant which can be used with the tool_type property of a TestToolResult.
    #: This constant has a value of "PROMPT"
    TOOL_TYPE_PROMPT = "PROMPT"

    #: A constant which can be used with the tool_type property of a TestToolResult.
    #: This constant has a value of "RAG"
    TOOL_TYPE_RAG = "RAG"

    #: A constant which can be used with the tool_type property of a TestToolResult.
    #: This constant has a value of "MCP"
    TOOL_TYPE_MCP = "MCP"

    #: A constant which can be used with the tool_type property of a TestToolResult.
    #: This constant has a value of "HTTP"
    TOOL_TYPE_HTTP = "HTTP"

    #: A constant which can be used with the tool_type property of a TestToolResult.
    #: This constant has a value of "CUSTOM"
    TOOL_TYPE_CUSTOM = "CUSTOM"

    def __init__(self, **kwargs):
        """
        Initializes a new TestToolResult object with values from keyword arguments. This class has the following subclasses and if you are using this class as input
        to a service operations then you should favor using a subclass over the base class:

        * :class:`~oci.aidataplatform_dp.models.McpTestToolResult`
        * :class:`~oci.aidataplatform_dp.models.HttpTestToolResult`
        * :class:`~oci.aidataplatform_dp.models.RagTestToolResult`
        * :class:`~oci.aidataplatform_dp.models.SqlTestToolResult`
        * :class:`~oci.aidataplatform_dp.models.PromptTestToolResult`
        * :class:`~oci.aidataplatform_dp.models.CustomTestToolResult`

        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param tool_type:
            The value to assign to the tool_type property of this TestToolResult.
            Allowed values for this property are: "SQL", "PROMPT", "RAG", "MCP", "HTTP", "CUSTOM"
        :type tool_type: str

        """
        self.swagger_types = {
            'tool_type': 'str'
        }

        self.attribute_map = {
            'tool_type': 'toolType'
        }

        self._tool_type = None

    @staticmethod
    def get_subtype(object_dictionary):
        """
        Given the hash representation of a subtype of this class,
        use the info in the hash to return the class of the subtype.
        """
        type = object_dictionary['toolType']

        if type == 'MCP':
            return 'McpTestToolResult'

        if type == 'HTTP':
            return 'HttpTestToolResult'

        if type == 'RAG':
            return 'RagTestToolResult'

        if type == 'SQL':
            return 'SqlTestToolResult'

        if type == 'PROMPT':
            return 'PromptTestToolResult'

        if type == 'CUSTOM':
            return 'CustomTestToolResult'
        else:
            return 'TestToolResult'

    @property
    def tool_type(self):
        """
        **[Required]** Gets the tool_type of this TestToolResult.
        Selects which result schema applies.

        Allowed values for this property are: "SQL", "PROMPT", "RAG", "MCP", "HTTP", "CUSTOM"


        :return: The tool_type of this TestToolResult.
        :rtype: str
        """
        return self._tool_type

    @tool_type.setter
    def tool_type(self, tool_type):
        """
        Sets the tool_type of this TestToolResult.
        Selects which result schema applies.


        :param tool_type: The tool_type of this TestToolResult.
        :type: str
        """
        allowed_values = ["SQL", "PROMPT", "RAG", "MCP", "HTTP", "CUSTOM"]
        if not value_allowed_none_or_none_sentinel(tool_type, allowed_values):
            raise ValueError(
                "Invalid value for `tool_type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._tool_type = tool_type

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
