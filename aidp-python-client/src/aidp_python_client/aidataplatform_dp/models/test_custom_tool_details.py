# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .test_tool_details import TestToolDetails
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class TestCustomToolDetails(TestToolDetails):
    """
    Request details when toolType = CUSTOM
    """

    def __init__(self, **kwargs):
        """
        Initializes a new TestCustomToolDetails object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.TestCustomToolDetails.tool_type` attribute
        of this class is ``CUSTOM`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param agent_flow_id:
            The value to assign to the agent_flow_id property of this TestCustomToolDetails.
        :type agent_flow_id: str

        :param tool_type:
            The value to assign to the tool_type property of this TestCustomToolDetails.
            Allowed values for this property are: "SQL", "PROMPT", "RAG", "MCP", "HTTP", "CUSTOM"
        :type tool_type: str

        :param tool_config:
            The value to assign to the tool_config property of this TestCustomToolDetails.
        :type tool_config: oci.aidataplatform_dp.models.CustomToolConfiguration

        :param param_values:
            The value to assign to the param_values property of this TestCustomToolDetails.
        :type param_values: oci.aidataplatform_dp.models.TestToolParamValues

        :param package_content:
            The value to assign to the package_content property of this TestCustomToolDetails.
        :type package_content: str

        """
        self.swagger_types = {
            'agent_flow_id': 'str',
            'tool_type': 'str',
            'tool_config': 'CustomToolConfiguration',
            'param_values': 'TestToolParamValues',
            'package_content': 'str'
        }

        self.attribute_map = {
            'agent_flow_id': 'agentFlowId',
            'tool_type': 'toolType',
            'tool_config': 'toolConfig',
            'param_values': 'paramValues',
            'package_content': 'packageContent'
        }

        self._agent_flow_id = None
        self._tool_type = None
        self._tool_config = None
        self._param_values = None
        self._package_content = None
        self._tool_type = 'CUSTOM'

    @property
    def tool_config(self):
        """
        **[Required]** Gets the tool_config of this TestCustomToolDetails.

        :return: The tool_config of this TestCustomToolDetails.
        :rtype: oci.aidataplatform_dp.models.CustomToolConfiguration
        """
        return self._tool_config

    @tool_config.setter
    def tool_config(self, tool_config):
        """
        Sets the tool_config of this TestCustomToolDetails.

        :param tool_config: The tool_config of this TestCustomToolDetails.
        :type: oci.aidataplatform_dp.models.CustomToolConfiguration
        """
        self._tool_config = tool_config

    @property
    def param_values(self):
        """
        Gets the param_values of this TestCustomToolDetails.

        :return: The param_values of this TestCustomToolDetails.
        :rtype: oci.aidataplatform_dp.models.TestToolParamValues
        """
        return self._param_values

    @param_values.setter
    def param_values(self, param_values):
        """
        Sets the param_values of this TestCustomToolDetails.

        :param param_values: The param_values of this TestCustomToolDetails.
        :type: oci.aidataplatform_dp.models.TestToolParamValues
        """
        self._param_values = param_values

    @property
    def package_content(self):
        """
        Gets the package_content of this TestCustomToolDetails.
        Base64-encoded ZIP file content for inline package upload during testing


        :return: The package_content of this TestCustomToolDetails.
        :rtype: str
        """
        return self._package_content

    @package_content.setter
    def package_content(self, package_content):
        """
        Sets the package_content of this TestCustomToolDetails.
        Base64-encoded ZIP file content for inline package upload during testing


        :param package_content: The package_content of this TestCustomToolDetails.
        :type: str
        """
        self._package_content = package_content

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
