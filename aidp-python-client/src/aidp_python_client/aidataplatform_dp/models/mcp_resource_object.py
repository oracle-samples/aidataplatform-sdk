# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.

from .mcp_object import McpObject
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class McpResourceObject(McpObject):
    """
    Resource exposed by an MCP server.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new McpResourceObject object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.McpResourceObject.object_type` attribute
        of this class is ``RESOURCE`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param object_type:
            The value to assign to the object_type property of this McpResourceObject.
            Allowed values for this property are: "TOOL", "PROMPT", "RESOURCE"
        :type object_type: str

        :param name:
            The value to assign to the name property of this McpResourceObject.
        :type name: str

        :param description:
            The value to assign to the description property of this McpResourceObject.
        :type description: str

        :param resource_schema:
            The value to assign to the resource_schema property of this McpResourceObject.
        :type resource_schema: str

        """
        self.swagger_types = {
            'object_type': 'str',
            'name': 'str',
            'description': 'str',
            'resource_schema': 'str'
        }

        self.attribute_map = {
            'object_type': 'objectType',
            'name': 'name',
            'description': 'description',
            'resource_schema': 'resourceSchema'
        }

        self._object_type = None
        self._name = None
        self._description = None
        self._resource_schema = None
        self._object_type = 'RESOURCE'

    @property
    def resource_schema(self):
        """
        Gets the resource_schema of this McpResourceObject.
        serialized schema of resource persisted within an MCP server.


        :return: The resource_schema of this McpResourceObject.
        :rtype: str
        """
        return self._resource_schema

    @resource_schema.setter
    def resource_schema(self, resource_schema):
        """
        Sets the resource_schema of this McpResourceObject.
        serialized schema of resource persisted within an MCP server.


        :param resource_schema: The resource_schema of this McpResourceObject.
        :type: str
        """
        self._resource_schema = resource_schema

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
