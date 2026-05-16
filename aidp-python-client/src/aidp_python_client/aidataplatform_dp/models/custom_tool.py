# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .tool import Tool
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CustomTool(Tool):
    """
    Derived model for Custom Tool
    """

    def __init__(self, **kwargs):
        """
        Initializes a new CustomTool object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.CustomTool.tool_type` attribute
        of this class is ``CUSTOM`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this CustomTool.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this CustomTool.
        :type display_name: str

        :param workspace_key:
            The value to assign to the workspace_key property of this CustomTool.
        :type workspace_key: str

        :param description:
            The value to assign to the description property of this CustomTool.
        :type description: str

        :param tool_type:
            The value to assign to the tool_type property of this CustomTool.
            Allowed values for this property are: "RAG", "SQL", "PROMPT", "NL2SQL", "MCP", "CUSTOM", "HTTP", "REFERENCE"
        :type tool_type: str

        :param is_reference:
            The value to assign to the is_reference property of this CustomTool.
        :type is_reference: bool

        :param position_x:
            The value to assign to the position_x property of this CustomTool.
        :type position_x: float

        :param position_y:
            The value to assign to the position_y property of this CustomTool.
        :type position_y: float

        :param properties:
            The value to assign to the properties property of this CustomTool.
        :type properties: dict(str, object)

        :param time_created:
            The value to assign to the time_created property of this CustomTool.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this CustomTool.
        :type time_updated: datetime

        :param created_by:
            The value to assign to the created_by property of this CustomTool.
        :type created_by: str

        :param updated_by:
            The value to assign to the updated_by property of this CustomTool.
        :type updated_by: str

        :param tool_provider:
            The value to assign to the tool_provider property of this CustomTool.
        :type tool_provider: str

        :param tool_type_name:
            The value to assign to the tool_type_name property of this CustomTool.
        :type tool_type_name: str

        :param input_schema:
            The value to assign to the input_schema property of this CustomTool.
        :type input_schema: dict(str, object)

        :param tool_config:
            The value to assign to the tool_config property of this CustomTool.
        :type tool_config: oci.aidataplatform_dp.models.CustomToolConfiguration

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
            'tool_provider': 'str',
            'tool_type_name': 'str',
            'input_schema': 'dict(str, object)',
            'tool_config': 'CustomToolConfiguration'
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
            'tool_provider': 'toolProvider',
            'tool_type_name': 'toolTypeName',
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
        self._tool_provider = None
        self._tool_type_name = None
        self._input_schema = None
        self._tool_config = None
        self._tool_type = 'CUSTOM'

    @property
    def tool_provider(self):
        """
        Gets the tool_provider of this CustomTool.
        The provider of the tool, default is AIDP


        :return: The tool_provider of this CustomTool.
        :rtype: str
        """
        return self._tool_provider

    @tool_provider.setter
    def tool_provider(self, tool_provider):
        """
        Sets the tool_provider of this CustomTool.
        The provider of the tool, default is AIDP


        :param tool_provider: The tool_provider of this CustomTool.
        :type: str
        """
        self._tool_provider = tool_provider

    @property
    def tool_type_name(self):
        """
        Gets the tool_type_name of this CustomTool.
        The type name for this tool


        :return: The tool_type_name of this CustomTool.
        :rtype: str
        """
        return self._tool_type_name

    @tool_type_name.setter
    def tool_type_name(self, tool_type_name):
        """
        Sets the tool_type_name of this CustomTool.
        The type name for this tool


        :param tool_type_name: The tool_type_name of this CustomTool.
        :type: str
        """
        self._tool_type_name = tool_type_name

    @property
    def input_schema(self):
        """
        Gets the input_schema of this CustomTool.
        The list of named properties in the inputSchema, along with the default value and description of each property


        :return: The input_schema of this CustomTool.
        :rtype: dict(str, object)
        """
        return self._input_schema

    @input_schema.setter
    def input_schema(self, input_schema):
        """
        Sets the input_schema of this CustomTool.
        The list of named properties in the inputSchema, along with the default value and description of each property


        :param input_schema: The input_schema of this CustomTool.
        :type: dict(str, object)
        """
        self._input_schema = input_schema

    @property
    def tool_config(self):
        """
        Gets the tool_config of this CustomTool.

        :return: The tool_config of this CustomTool.
        :rtype: oci.aidataplatform_dp.models.CustomToolConfiguration
        """
        return self._tool_config

    @tool_config.setter
    def tool_config(self, tool_config):
        """
        Sets the tool_config of this CustomTool.

        :param tool_config: The tool_config of this CustomTool.
        :type: oci.aidataplatform_dp.models.CustomToolConfiguration
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
