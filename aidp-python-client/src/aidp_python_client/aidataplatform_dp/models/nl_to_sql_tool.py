# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .tool import Tool
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class NlToSqlTool(Tool):
    """
    Derived model for Natural Language (NL) to SQL Tool
    """

    def __init__(self, **kwargs):
        """
        Initializes a new NlToSqlTool object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.NlToSqlTool.tool_type` attribute
        of this class is ``NL2SQL`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this NlToSqlTool.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this NlToSqlTool.
        :type display_name: str

        :param workspace_key:
            The value to assign to the workspace_key property of this NlToSqlTool.
        :type workspace_key: str

        :param description:
            The value to assign to the description property of this NlToSqlTool.
        :type description: str

        :param tool_type:
            The value to assign to the tool_type property of this NlToSqlTool.
            Allowed values for this property are: "RAG", "SQL", "PROMPT", "NL2SQL", "MCP", "CUSTOM", "HTTP", "REFERENCE"
        :type tool_type: str

        :param is_reference:
            The value to assign to the is_reference property of this NlToSqlTool.
        :type is_reference: bool

        :param position_x:
            The value to assign to the position_x property of this NlToSqlTool.
        :type position_x: float

        :param position_y:
            The value to assign to the position_y property of this NlToSqlTool.
        :type position_y: float

        :param properties:
            The value to assign to the properties property of this NlToSqlTool.
        :type properties: dict(str, object)

        :param time_created:
            The value to assign to the time_created property of this NlToSqlTool.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this NlToSqlTool.
        :type time_updated: datetime

        :param created_by:
            The value to assign to the created_by property of this NlToSqlTool.
        :type created_by: str

        :param updated_by:
            The value to assign to the updated_by property of this NlToSqlTool.
        :type updated_by: str

        :param input_schema:
            The value to assign to the input_schema property of this NlToSqlTool.
        :type input_schema: oci.aidataplatform_dp.models.NlToSqlToolInputSchema

        :param tool_config:
            The value to assign to the tool_config property of this NlToSqlTool.
        :type tool_config: oci.aidataplatform_dp.models.NlToSqlToolConfiguration

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
            'input_schema': 'NlToSqlToolInputSchema',
            'tool_config': 'NlToSqlToolConfiguration'
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
        self._tool_type = 'NL2SQL'

    @property
    def input_schema(self):
        """
        **[Required]** Gets the input_schema of this NlToSqlTool.

        :return: The input_schema of this NlToSqlTool.
        :rtype: oci.aidataplatform_dp.models.NlToSqlToolInputSchema
        """
        return self._input_schema

    @input_schema.setter
    def input_schema(self, input_schema):
        """
        Sets the input_schema of this NlToSqlTool.

        :param input_schema: The input_schema of this NlToSqlTool.
        :type: oci.aidataplatform_dp.models.NlToSqlToolInputSchema
        """
        self._input_schema = input_schema

    @property
    def tool_config(self):
        """
        **[Required]** Gets the tool_config of this NlToSqlTool.

        :return: The tool_config of this NlToSqlTool.
        :rtype: oci.aidataplatform_dp.models.NlToSqlToolConfiguration
        """
        return self._tool_config

    @tool_config.setter
    def tool_config(self, tool_config):
        """
        Sets the tool_config of this NlToSqlTool.

        :param tool_config: The tool_config of this NlToSqlTool.
        :type: oci.aidataplatform_dp.models.NlToSqlToolConfiguration
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
