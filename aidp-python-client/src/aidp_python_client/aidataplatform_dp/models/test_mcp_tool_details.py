# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.

from .test_tool_details import TestToolDetails
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class TestMcpToolDetails(TestToolDetails):
    """
    Request details when toolType = MCP
    """

    def __init__(self, **kwargs):
        """
        Initializes a new TestMcpToolDetails object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.TestMcpToolDetails.tool_type` attribute
        of this class is ``MCP`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param agent_flow_id:
            The value to assign to the agent_flow_id property of this TestMcpToolDetails.
        :type agent_flow_id: str

        :param tool_type:
            The value to assign to the tool_type property of this TestMcpToolDetails.
            Allowed values for this property are: "SQL", "PROMPT", "RAG", "MCP", "HTTP", "CUSTOM"
        :type tool_type: str

        :param config:
            The value to assign to the config property of this TestMcpToolDetails.
        :type config: oci.aidataplatform_dp.models.McpToolConfiguration

        :param mcp_test:
            The value to assign to the mcp_test property of this TestMcpToolDetails.
        :type mcp_test: oci.aidataplatform_dp.models.TestMcpOperation

        :param param_values:
            The value to assign to the param_values property of this TestMcpToolDetails.
        :type param_values: oci.aidataplatform_dp.models.TestToolParamValues

        :param server_name:
            The value to assign to the server_name property of this TestMcpToolDetails.
        :type server_name: str

        """
        self.swagger_types = {
            'agent_flow_id': 'str',
            'tool_type': 'str',
            'config': 'McpToolConfiguration',
            'mcp_test': 'TestMcpOperation',
            'param_values': 'TestToolParamValues',
            'server_name': 'str'
        }

        self.attribute_map = {
            'agent_flow_id': 'agentFlowId',
            'tool_type': 'toolType',
            'config': 'config',
            'mcp_test': 'mcpTest',
            'param_values': 'paramValues',
            'server_name': 'serverName'
        }

        self._agent_flow_id = None
        self._tool_type = None
        self._config = None
        self._mcp_test = None
        self._param_values = None
        self._server_name = None
        self._tool_type = 'MCP'

    @property
    def config(self):
        """
        **[Required]** Gets the config of this TestMcpToolDetails.

        :return: The config of this TestMcpToolDetails.
        :rtype: oci.aidataplatform_dp.models.McpToolConfiguration
        """
        return self._config

    @config.setter
    def config(self, config):
        """
        Sets the config of this TestMcpToolDetails.

        :param config: The config of this TestMcpToolDetails.
        :type: oci.aidataplatform_dp.models.McpToolConfiguration
        """
        self._config = config

    @property
    def mcp_test(self):
        """
        **[Required]** Gets the mcp_test of this TestMcpToolDetails.

        :return: The mcp_test of this TestMcpToolDetails.
        :rtype: oci.aidataplatform_dp.models.TestMcpOperation
        """
        return self._mcp_test

    @mcp_test.setter
    def mcp_test(self, mcp_test):
        """
        Sets the mcp_test of this TestMcpToolDetails.

        :param mcp_test: The mcp_test of this TestMcpToolDetails.
        :type: oci.aidataplatform_dp.models.TestMcpOperation
        """
        self._mcp_test = mcp_test

    @property
    def param_values(self):
        """
        Gets the param_values of this TestMcpToolDetails.

        :return: The param_values of this TestMcpToolDetails.
        :rtype: oci.aidataplatform_dp.models.TestToolParamValues
        """
        return self._param_values

    @param_values.setter
    def param_values(self, param_values):
        """
        Sets the param_values of this TestMcpToolDetails.

        :param param_values: The param_values of this TestMcpToolDetails.
        :type: oci.aidataplatform_dp.models.TestToolParamValues
        """
        self._param_values = param_values

    @property
    def server_name(self):
        """
        **[Required]** Gets the server_name of this TestMcpToolDetails.
        name of mcp server


        :return: The server_name of this TestMcpToolDetails.
        :rtype: str
        """
        return self._server_name

    @server_name.setter
    def server_name(self, server_name):
        """
        Sets the server_name of this TestMcpToolDetails.
        name of mcp server


        :param server_name: The server_name of this TestMcpToolDetails.
        :type: str
        """
        self._server_name = server_name

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
