# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .update_tool_details import UpdateToolDetails
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdatePromptToolDetails(UpdateToolDetails):
    """
    Details to update a Prompt Tool
    """

    def __init__(self, **kwargs):
        """
        Initializes a new UpdatePromptToolDetails object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.UpdatePromptToolDetails.tool_type` attribute
        of this class is ``PROMPT`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param display_name:
            The value to assign to the display_name property of this UpdatePromptToolDetails.
        :type display_name: str

        :param description:
            The value to assign to the description property of this UpdatePromptToolDetails.
        :type description: str

        :param tool_type:
            The value to assign to the tool_type property of this UpdatePromptToolDetails.
            Allowed values for this property are: "RAG", "SQL", "PROMPT", "NL2SQL", "MCP", "CUSTOM", "HTTP", "REFERENCE"
        :type tool_type: str

        :param properties:
            The value to assign to the properties property of this UpdatePromptToolDetails.
        :type properties: dict(str, object)

        :param input_schema:
            The value to assign to the input_schema property of this UpdatePromptToolDetails.
        :type input_schema: dict(str, object)

        :param tool_config:
            The value to assign to the tool_config property of this UpdatePromptToolDetails.
        :type tool_config: oci.aidataplatform_dp.models.PromptToolConfiguration

        """
        self.swagger_types = {
            'display_name': 'str',
            'description': 'str',
            'tool_type': 'str',
            'properties': 'dict(str, object)',
            'input_schema': 'dict(str, object)',
            'tool_config': 'PromptToolConfiguration'
        }

        self.attribute_map = {
            'display_name': 'displayName',
            'description': 'description',
            'tool_type': 'toolType',
            'properties': 'properties',
            'input_schema': 'inputSchema',
            'tool_config': 'toolConfig'
        }

        self._display_name = None
        self._description = None
        self._tool_type = None
        self._properties = None
        self._input_schema = None
        self._tool_config = None
        self._tool_type = 'PROMPT'

    @property
    def input_schema(self):
        """
        Gets the input_schema of this UpdatePromptToolDetails.
        The list of properties in the inputSchema, along with the default value and description of each property


        :return: The input_schema of this UpdatePromptToolDetails.
        :rtype: dict(str, object)
        """
        return self._input_schema

    @input_schema.setter
    def input_schema(self, input_schema):
        """
        Sets the input_schema of this UpdatePromptToolDetails.
        The list of properties in the inputSchema, along with the default value and description of each property


        :param input_schema: The input_schema of this UpdatePromptToolDetails.
        :type: dict(str, object)
        """
        self._input_schema = input_schema

    @property
    def tool_config(self):
        """
        Gets the tool_config of this UpdatePromptToolDetails.

        :return: The tool_config of this UpdatePromptToolDetails.
        :rtype: oci.aidataplatform_dp.models.PromptToolConfiguration
        """
        return self._tool_config

    @tool_config.setter
    def tool_config(self, tool_config):
        """
        Sets the tool_config of this UpdatePromptToolDetails.

        :param tool_config: The tool_config of this UpdatePromptToolDetails.
        :type: oci.aidataplatform_dp.models.PromptToolConfiguration
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
