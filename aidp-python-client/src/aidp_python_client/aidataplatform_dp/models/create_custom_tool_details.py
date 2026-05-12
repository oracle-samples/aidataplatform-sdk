# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.

from .create_tool_details import CreateToolDetails
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateCustomToolDetails(CreateToolDetails):
    """
    Details to create a Custom Tool
    """

    def __init__(self, **kwargs):
        """
        Initializes a new CreateCustomToolDetails object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.CreateCustomToolDetails.tool_type` attribute
        of this class is ``CUSTOM`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param display_name:
            The value to assign to the display_name property of this CreateCustomToolDetails.
        :type display_name: str

        :param description:
            The value to assign to the description property of this CreateCustomToolDetails.
        :type description: str

        :param tool_type:
            The value to assign to the tool_type property of this CreateCustomToolDetails.
            Allowed values for this property are: "RAG", "SQL", "PROMPT", "NL2SQL", "MCP", "CUSTOM", "HTTP", "REFERENCE"
        :type tool_type: str

        :param properties:
            The value to assign to the properties property of this CreateCustomToolDetails.
        :type properties: dict(str, object)

        :param tool_provider:
            The value to assign to the tool_provider property of this CreateCustomToolDetails.
        :type tool_provider: str

        :param tool_type_name:
            The value to assign to the tool_type_name property of this CreateCustomToolDetails.
        :type tool_type_name: str

        :param input_schema:
            The value to assign to the input_schema property of this CreateCustomToolDetails.
        :type input_schema: dict(str, object)

        :param tool_config:
            The value to assign to the tool_config property of this CreateCustomToolDetails.
        :type tool_config: oci.aidataplatform_dp.models.CustomToolConfiguration

        """
        self.swagger_types = {
            'display_name': 'str',
            'description': 'str',
            'tool_type': 'str',
            'properties': 'dict(str, object)',
            'tool_provider': 'str',
            'tool_type_name': 'str',
            'input_schema': 'dict(str, object)',
            'tool_config': 'CustomToolConfiguration'
        }

        self.attribute_map = {
            'display_name': 'displayName',
            'description': 'description',
            'tool_type': 'toolType',
            'properties': 'properties',
            'tool_provider': 'toolProvider',
            'tool_type_name': 'toolTypeName',
            'input_schema': 'inputSchema',
            'tool_config': 'toolConfig'
        }

        self._display_name = None
        self._description = None
        self._tool_type = None
        self._properties = None
        self._tool_provider = None
        self._tool_type_name = None
        self._input_schema = None
        self._tool_config = None
        self._tool_type = 'CUSTOM'

    @property
    def tool_provider(self):
        """
        Gets the tool_provider of this CreateCustomToolDetails.
        The provider of the tool, default is AIDP


        :return: The tool_provider of this CreateCustomToolDetails.
        :rtype: str
        """
        return self._tool_provider

    @tool_provider.setter
    def tool_provider(self, tool_provider):
        """
        Sets the tool_provider of this CreateCustomToolDetails.
        The provider of the tool, default is AIDP


        :param tool_provider: The tool_provider of this CreateCustomToolDetails.
        :type: str
        """
        self._tool_provider = tool_provider

    @property
    def tool_type_name(self):
        """
        Gets the tool_type_name of this CreateCustomToolDetails.
        The type name for this tool


        :return: The tool_type_name of this CreateCustomToolDetails.
        :rtype: str
        """
        return self._tool_type_name

    @tool_type_name.setter
    def tool_type_name(self, tool_type_name):
        """
        Sets the tool_type_name of this CreateCustomToolDetails.
        The type name for this tool


        :param tool_type_name: The tool_type_name of this CreateCustomToolDetails.
        :type: str
        """
        self._tool_type_name = tool_type_name

    @property
    def input_schema(self):
        """
        Gets the input_schema of this CreateCustomToolDetails.
        The list of named properties in the inputSchema, along with the default value and description of each property


        :return: The input_schema of this CreateCustomToolDetails.
        :rtype: dict(str, object)
        """
        return self._input_schema

    @input_schema.setter
    def input_schema(self, input_schema):
        """
        Sets the input_schema of this CreateCustomToolDetails.
        The list of named properties in the inputSchema, along with the default value and description of each property


        :param input_schema: The input_schema of this CreateCustomToolDetails.
        :type: dict(str, object)
        """
        self._input_schema = input_schema

    @property
    def tool_config(self):
        """
        Gets the tool_config of this CreateCustomToolDetails.

        :return: The tool_config of this CreateCustomToolDetails.
        :rtype: oci.aidataplatform_dp.models.CustomToolConfiguration
        """
        return self._tool_config

    @tool_config.setter
    def tool_config(self, tool_config):
        """
        Sets the tool_config of this CreateCustomToolDetails.

        :param tool_config: The tool_config of this CreateCustomToolDetails.
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
