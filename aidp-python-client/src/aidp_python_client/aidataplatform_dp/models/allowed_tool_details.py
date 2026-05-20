# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AllowedToolDetails(object):
    """
    The list of allowed tool names allowed on an MCP server.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AllowedToolDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param instruction:
            The value to assign to the instruction property of this AllowedToolDetails.
        :type instruction: str

        :param arg_overrides:
            The value to assign to the arg_overrides property of this AllowedToolDetails.
        :type arg_overrides: dict(str, str)

        :param tool:
            The value to assign to the tool property of this AllowedToolDetails.
        :type tool: oci.aidataplatform_dp.models.McpToolObject

        """
        self.swagger_types = {
            'instruction': 'str',
            'arg_overrides': 'dict(str, str)',
            'tool': 'McpToolObject'
        }

        self.attribute_map = {
            'instruction': 'instruction',
            'arg_overrides': 'argOverrides',
            'tool': 'tool'
        }

        self._instruction = None
        self._arg_overrides = None
        self._tool = None

    @property
    def instruction(self):
        """
        Gets the instruction of this AllowedToolDetails.
        custom instruction for tool


        :return: The instruction of this AllowedToolDetails.
        :rtype: str
        """
        return self._instruction

    @instruction.setter
    def instruction(self, instruction):
        """
        Sets the instruction of this AllowedToolDetails.
        custom instruction for tool


        :param instruction: The instruction of this AllowedToolDetails.
        :type: str
        """
        self._instruction = instruction

    @property
    def arg_overrides(self):
        """
        Gets the arg_overrides of this AllowedToolDetails.
        Map of parameter names to their default string values.


        :return: The arg_overrides of this AllowedToolDetails.
        :rtype: dict(str, str)
        """
        return self._arg_overrides

    @arg_overrides.setter
    def arg_overrides(self, arg_overrides):
        """
        Sets the arg_overrides of this AllowedToolDetails.
        Map of parameter names to their default string values.


        :param arg_overrides: The arg_overrides of this AllowedToolDetails.
        :type: dict(str, str)
        """
        self._arg_overrides = arg_overrides

    @property
    def tool(self):
        """
        **[Required]** Gets the tool of this AllowedToolDetails.

        :return: The tool of this AllowedToolDetails.
        :rtype: oci.aidataplatform_dp.models.McpToolObject
        """
        return self._tool

    @tool.setter
    def tool(self, tool):
        """
        Sets the tool of this AllowedToolDetails.

        :param tool: The tool of this AllowedToolDetails.
        :type: oci.aidataplatform_dp.models.McpToolObject
        """
        self._tool = tool

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
