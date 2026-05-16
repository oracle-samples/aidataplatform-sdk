# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CustomToolEntry(object):
    """
    A single tool class entry within a custom tool package
    """

    def __init__(self, **kwargs):
        """
        Initializes a new CustomToolEntry object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param tool_class_name:
            The value to assign to the tool_class_name property of this CustomToolEntry.
        :type tool_class_name: str

        :param display_name:
            The value to assign to the display_name property of this CustomToolEntry.
        :type display_name: str

        :param description:
            The value to assign to the description property of this CustomToolEntry.
        :type description: str

        :param version:
            The value to assign to the version property of this CustomToolEntry.
        :type version: str

        :param config:
            The value to assign to the config property of this CustomToolEntry.
        :type config: dict(str, object)

        :param input_schema:
            The value to assign to the input_schema property of this CustomToolEntry.
        :type input_schema: dict(str, object)

        """
        self.swagger_types = {
            'tool_class_name': 'str',
            'display_name': 'str',
            'description': 'str',
            'version': 'str',
            'config': 'dict(str, object)',
            'input_schema': 'dict(str, object)'
        }

        self.attribute_map = {
            'tool_class_name': 'toolClassName',
            'display_name': 'displayName',
            'description': 'description',
            'version': 'version',
            'config': 'config',
            'input_schema': 'inputSchema'
        }

        self._tool_class_name = None
        self._display_name = None
        self._description = None
        self._version = None
        self._config = None
        self._input_schema = None

    @property
    def tool_class_name(self):
        """
        **[Required]** Gets the tool_class_name of this CustomToolEntry.
        Python class name (e.g., WeatherTool, BashTool)


        :return: The tool_class_name of this CustomToolEntry.
        :rtype: str
        """
        return self._tool_class_name

    @tool_class_name.setter
    def tool_class_name(self, tool_class_name):
        """
        Sets the tool_class_name of this CustomToolEntry.
        Python class name (e.g., WeatherTool, BashTool)


        :param tool_class_name: The tool_class_name of this CustomToolEntry.
        :type: str
        """
        self._tool_class_name = tool_class_name

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this CustomToolEntry.
        Human-readable tool name shown to LLM


        :return: The display_name of this CustomToolEntry.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this CustomToolEntry.
        Human-readable tool name shown to LLM


        :param display_name: The display_name of this CustomToolEntry.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this CustomToolEntry.
        Tool description for LLM tool selection


        :return: The description of this CustomToolEntry.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this CustomToolEntry.
        Tool description for LLM tool selection


        :param description: The description of this CustomToolEntry.
        :type: str
        """
        self._description = description

    @property
    def version(self):
        """
        Gets the version of this CustomToolEntry.
        Tool version


        :return: The version of this CustomToolEntry.
        :rtype: str
        """
        return self._version

    @version.setter
    def version(self, version):
        """
        Sets the version of this CustomToolEntry.
        Tool version


        :param version: The version of this CustomToolEntry.
        :type: str
        """
        self._version = version

    @property
    def config(self):
        """
        Gets the config of this CustomToolEntry.
        Tool-specific configuration values (supports template variables)


        :return: The config of this CustomToolEntry.
        :rtype: dict(str, object)
        """
        return self._config

    @config.setter
    def config(self, config):
        """
        Sets the config of this CustomToolEntry.
        Tool-specific configuration values (supports template variables)


        :param config: The config of this CustomToolEntry.
        :type: dict(str, object)
        """
        self._config = config

    @property
    def input_schema(self):
        """
        Gets the input_schema of this CustomToolEntry.
        JSON schema for tool input parameters


        :return: The input_schema of this CustomToolEntry.
        :rtype: dict(str, object)
        """
        return self._input_schema

    @input_schema.setter
    def input_schema(self, input_schema):
        """
        Sets the input_schema of this CustomToolEntry.
        JSON schema for tool input parameters


        :param input_schema: The input_schema of this CustomToolEntry.
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
