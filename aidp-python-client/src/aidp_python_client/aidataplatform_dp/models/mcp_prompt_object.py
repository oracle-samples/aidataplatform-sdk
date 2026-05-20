# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .mcp_object import McpObject
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class McpPromptObject(McpObject):
    """
    Prompt exposed by an MCP server.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new McpPromptObject object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.McpPromptObject.object_type` attribute
        of this class is ``PROMPT`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param object_type:
            The value to assign to the object_type property of this McpPromptObject.
            Allowed values for this property are: "TOOL", "PROMPT", "RESOURCE"
        :type object_type: str

        :param name:
            The value to assign to the name property of this McpPromptObject.
        :type name: str

        :param description:
            The value to assign to the description property of this McpPromptObject.
        :type description: str

        :param prompt:
            The value to assign to the prompt property of this McpPromptObject.
        :type prompt: str

        """
        self.swagger_types = {
            'object_type': 'str',
            'name': 'str',
            'description': 'str',
            'prompt': 'str'
        }

        self.attribute_map = {
            'object_type': 'objectType',
            'name': 'name',
            'description': 'description',
            'prompt': 'prompt'
        }

        self._object_type = None
        self._name = None
        self._description = None
        self._prompt = None
        self._object_type = 'PROMPT'

    @property
    def prompt(self):
        """
        Gets the prompt of this McpPromptObject.
        prompt persisted within an MCP server.


        :return: The prompt of this McpPromptObject.
        :rtype: str
        """
        return self._prompt

    @prompt.setter
    def prompt(self, prompt):
        """
        Sets the prompt of this McpPromptObject.
        prompt persisted within an MCP server.


        :param prompt: The prompt of this McpPromptObject.
        :type: str
        """
        self._prompt = prompt

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
