# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .mcp_object import McpObject
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class McpToolObject(McpObject):
    """
    Tool exposed by an MCP server.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new McpToolObject object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.McpToolObject.object_type` attribute
        of this class is ``TOOL`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param object_type:
            The value to assign to the object_type property of this McpToolObject.
            Allowed values for this property are: "TOOL", "PROMPT", "RESOURCE"
        :type object_type: str

        :param name:
            The value to assign to the name property of this McpToolObject.
        :type name: str

        :param description:
            The value to assign to the description property of this McpToolObject.
        :type description: str

        :param input_schema:
            The value to assign to the input_schema property of this McpToolObject.
        :type input_schema: dict(str, object)

        """
        self.swagger_types = {
            'object_type': 'str',
            'name': 'str',
            'description': 'str',
            'input_schema': 'dict(str, object)'
        }

        self.attribute_map = {
            'object_type': 'objectType',
            'name': 'name',
            'description': 'description',
            'input_schema': 'inputSchema'
        }

        self._object_type = None
        self._name = None
        self._description = None
        self._input_schema = None
        self._object_type = 'TOOL'

    @property
    def input_schema(self):
        """
        Gets the input_schema of this McpToolObject.
        representation of the input schema for a tool.


        :return: The input_schema of this McpToolObject.
        :rtype: dict(str, object)
        """
        return self._input_schema

    @input_schema.setter
    def input_schema(self, input_schema):
        """
        Sets the input_schema of this McpToolObject.
        representation of the input schema for a tool.


        :param input_schema: The input_schema of this McpToolObject.
        :type: dict(str, object)
        """
        self._input_schema = input_schema

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
