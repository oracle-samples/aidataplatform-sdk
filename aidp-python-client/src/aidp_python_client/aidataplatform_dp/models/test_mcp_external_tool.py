# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .test_mcp_operation import TestMcpOperation
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class TestMcpExternalTool(TestMcpOperation):
    """
    Test mcp tool connection
    """

    def __init__(self, **kwargs):
        """
        Initializes a new TestMcpExternalTool object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.TestMcpExternalTool.test_type` attribute
        of this class is ``EXTERNAL_TOOL`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param test_type:
            The value to assign to the test_type property of this TestMcpExternalTool.
            Allowed values for this property are: "CONNECTION", "EXTERNAL_TOOL"
        :type test_type: str

        :param external_tool_name:
            The value to assign to the external_tool_name property of this TestMcpExternalTool.
        :type external_tool_name: str

        :param param_values:
            The value to assign to the param_values property of this TestMcpExternalTool.
        :type param_values: oci.aidataplatform_dp.models.TestToolParamValues

        """
        self.swagger_types = {
            'test_type': 'str',
            'external_tool_name': 'str',
            'param_values': 'TestToolParamValues'
        }

        self.attribute_map = {
            'test_type': 'testType',
            'external_tool_name': 'externalToolName',
            'param_values': 'paramValues'
        }

        self._test_type = None
        self._external_tool_name = None
        self._param_values = None
        self._test_type = 'EXTERNAL_TOOL'

    @property
    def external_tool_name(self):
        """
        **[Required]** Gets the external_tool_name of this TestMcpExternalTool.
        name of external tool to test


        :return: The external_tool_name of this TestMcpExternalTool.
        :rtype: str
        """
        return self._external_tool_name

    @external_tool_name.setter
    def external_tool_name(self, external_tool_name):
        """
        Sets the external_tool_name of this TestMcpExternalTool.
        name of external tool to test


        :param external_tool_name: The external_tool_name of this TestMcpExternalTool.
        :type: str
        """
        self._external_tool_name = external_tool_name

    @property
    def param_values(self):
        """
        Gets the param_values of this TestMcpExternalTool.

        :return: The param_values of this TestMcpExternalTool.
        :rtype: oci.aidataplatform_dp.models.TestToolParamValues
        """
        return self._param_values

    @param_values.setter
    def param_values(self, param_values):
        """
        Sets the param_values of this TestMcpExternalTool.

        :param param_values: The param_values of this TestMcpExternalTool.
        :type: oci.aidataplatform_dp.models.TestToolParamValues
        """
        self._param_values = param_values

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
