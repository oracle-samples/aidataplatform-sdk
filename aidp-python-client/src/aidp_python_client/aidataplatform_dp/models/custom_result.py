# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CustomResult(object):
    """
    Result from custom tool execution in MCP format.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new CustomResult object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param content:
            The value to assign to the content property of this CustomResult.
        :type content: list[dict(str, object)]

        :param structured_content:
            The value to assign to the structured_content property of this CustomResult.
        :type structured_content: dict(str, object)

        :param is_error:
            The value to assign to the is_error property of this CustomResult.
        :type is_error: bool

        :param tool_name:
            The value to assign to the tool_name property of this CustomResult.
        :type tool_name: str

        """
        self.swagger_types = {
            'content': 'list[dict(str, object)]',
            'structured_content': 'dict(str, object)',
            'is_error': 'bool',
            'tool_name': 'str'
        }

        self.attribute_map = {
            'content': 'content',
            'structured_content': 'structuredContent',
            'is_error': 'isError',
            'tool_name': 'toolName'
        }

        self._content = None
        self._structured_content = None
        self._is_error = None
        self._tool_name = None

    @property
    def content(self):
        """
        Gets the content of this CustomResult.
        MCP-formatted content blocks


        :return: The content of this CustomResult.
        :rtype: list[dict(str, object)]
        """
        return self._content

    @content.setter
    def content(self, content):
        """
        Sets the content of this CustomResult.
        MCP-formatted content blocks


        :param content: The content of this CustomResult.
        :type: list[dict(str, object)]
        """
        self._content = content

    @property
    def structured_content(self):
        """
        Gets the structured_content of this CustomResult.
        Structured result data


        :return: The structured_content of this CustomResult.
        :rtype: dict(str, object)
        """
        return self._structured_content

    @structured_content.setter
    def structured_content(self, structured_content):
        """
        Sets the structured_content of this CustomResult.
        Structured result data


        :param structured_content: The structured_content of this CustomResult.
        :type: dict(str, object)
        """
        self._structured_content = structured_content

    @property
    def is_error(self):
        """
        Gets the is_error of this CustomResult.
        Whether the result represents an error


        :return: The is_error of this CustomResult.
        :rtype: bool
        """
        return self._is_error

    @is_error.setter
    def is_error(self, is_error):
        """
        Sets the is_error of this CustomResult.
        Whether the result represents an error


        :param is_error: The is_error of this CustomResult.
        :type: bool
        """
        self._is_error = is_error

    @property
    def tool_name(self):
        """
        Gets the tool_name of this CustomResult.
        Name of the executed tool


        :return: The tool_name of this CustomResult.
        :rtype: str
        """
        return self._tool_name

    @tool_name.setter
    def tool_name(self, tool_name):
        """
        Sets the tool_name of this CustomResult.
        Name of the executed tool


        :param tool_name: The tool_name of this CustomResult.
        :type: str
        """
        self._tool_name = tool_name

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
