# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.

from .tool import Tool
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class HttpTool(Tool):
    """
    Derived model for HTTP Tool
    """

    def __init__(self, **kwargs):
        """
        Initializes a new HttpTool object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.HttpTool.tool_type` attribute
        of this class is ``HTTP`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this HttpTool.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this HttpTool.
        :type display_name: str

        :param workspace_key:
            The value to assign to the workspace_key property of this HttpTool.
        :type workspace_key: str

        :param description:
            The value to assign to the description property of this HttpTool.
        :type description: str

        :param tool_type:
            The value to assign to the tool_type property of this HttpTool.
            Allowed values for this property are: "RAG", "SQL", "PROMPT", "NL2SQL", "MCP", "CUSTOM", "HTTP", "REFERENCE"
        :type tool_type: str

        :param is_reference:
            The value to assign to the is_reference property of this HttpTool.
        :type is_reference: bool

        :param position_x:
            The value to assign to the position_x property of this HttpTool.
        :type position_x: float

        :param position_y:
            The value to assign to the position_y property of this HttpTool.
        :type position_y: float

        :param properties:
            The value to assign to the properties property of this HttpTool.
        :type properties: dict(str, object)

        :param time_created:
            The value to assign to the time_created property of this HttpTool.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this HttpTool.
        :type time_updated: datetime

        :param created_by:
            The value to assign to the created_by property of this HttpTool.
        :type created_by: str

        :param updated_by:
            The value to assign to the updated_by property of this HttpTool.
        :type updated_by: str

        :param input_schema:
            The value to assign to the input_schema property of this HttpTool.
        :type input_schema: dict(str, object)

        :param tool_config:
            The value to assign to the tool_config property of this HttpTool.
        :type tool_config: oci.aidataplatform_dp.models.HttpToolConfiguration

        """
        self.swagger_types = {
            'key': 'str',
            'display_name': 'str',
            'workspace_key': 'str',
            'description': 'str',
            'tool_type': 'str',
            'is_reference': 'bool',
            'position_x': 'float',
            'position_y': 'float',
            'properties': 'dict(str, object)',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'created_by': 'str',
            'updated_by': 'str',
            'input_schema': 'dict(str, object)',
            'tool_config': 'HttpToolConfiguration'
        }

        self.attribute_map = {
            'key': 'key',
            'display_name': 'displayName',
            'workspace_key': 'workspaceKey',
            'description': 'description',
            'tool_type': 'toolType',
            'is_reference': 'isReference',
            'position_x': 'positionX',
            'position_y': 'positionY',
            'properties': 'properties',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'created_by': 'createdBy',
            'updated_by': 'updatedBy',
            'input_schema': 'inputSchema',
            'tool_config': 'toolConfig'
        }

        self._key = None
        self._display_name = None
        self._workspace_key = None
        self._description = None
        self._tool_type = None
        self._is_reference = None
        self._position_x = None
        self._position_y = None
        self._properties = None
        self._time_created = None
        self._time_updated = None
        self._created_by = None
        self._updated_by = None
        self._input_schema = None
        self._tool_config = None
        self._tool_type = 'HTTP'

    @property
    def input_schema(self):
        """
        Gets the input_schema of this HttpTool.
        The list of template variable properties in the inputSchema


        :return: The input_schema of this HttpTool.
        :rtype: dict(str, object)
        """
        return self._input_schema

    @input_schema.setter
    def input_schema(self, input_schema):
        """
        Sets the input_schema of this HttpTool.
        The list of template variable properties in the inputSchema


        :param input_schema: The input_schema of this HttpTool.
        :type: dict(str, object)
        """
        self._input_schema = input_schema

    @property
    def tool_config(self):
        """
        Gets the tool_config of this HttpTool.

        :return: The tool_config of this HttpTool.
        :rtype: oci.aidataplatform_dp.models.HttpToolConfiguration
        """
        return self._tool_config

    @tool_config.setter
    def tool_config(self, tool_config):
        """
        Sets the tool_config of this HttpTool.

        :param tool_config: The tool_config of this HttpTool.
        :type: oci.aidataplatform_dp.models.HttpToolConfiguration
        """
        self._tool_config = tool_config

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
