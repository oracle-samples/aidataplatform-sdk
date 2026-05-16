# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .test_tool_details import TestToolDetails
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class TestSqlToolDetails(TestToolDetails):
    """
    Request details when toolType = SQL.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new TestSqlToolDetails object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.TestSqlToolDetails.tool_type` attribute
        of this class is ``SQL`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param agent_flow_id:
            The value to assign to the agent_flow_id property of this TestSqlToolDetails.
        :type agent_flow_id: str

        :param tool_type:
            The value to assign to the tool_type property of this TestSqlToolDetails.
            Allowed values for this property are: "SQL", "PROMPT", "RAG", "MCP", "HTTP", "CUSTOM"
        :type tool_type: str

        :param config:
            The value to assign to the config property of this TestSqlToolDetails.
        :type config: oci.aidataplatform_dp.models.SqlToolConfiguration

        :param param_values:
            The value to assign to the param_values property of this TestSqlToolDetails.
        :type param_values: oci.aidataplatform_dp.models.TestToolParamValues

        """
        self.swagger_types = {
            'agent_flow_id': 'str',
            'tool_type': 'str',
            'config': 'SqlToolConfiguration',
            'param_values': 'TestToolParamValues'
        }

        self.attribute_map = {
            'agent_flow_id': 'agentFlowId',
            'tool_type': 'toolType',
            'config': 'config',
            'param_values': 'paramValues'
        }

        self._agent_flow_id = None
        self._tool_type = None
        self._config = None
        self._param_values = None
        self._tool_type = 'SQL'

    @property
    def config(self):
        """
        **[Required]** Gets the config of this TestSqlToolDetails.

        :return: The config of this TestSqlToolDetails.
        :rtype: oci.aidataplatform_dp.models.SqlToolConfiguration
        """
        return self._config

    @config.setter
    def config(self, config):
        """
        Sets the config of this TestSqlToolDetails.

        :param config: The config of this TestSqlToolDetails.
        :type: oci.aidataplatform_dp.models.SqlToolConfiguration
        """
        self._config = config

    @property
    def param_values(self):
        """
        **[Required]** Gets the param_values of this TestSqlToolDetails.

        :return: The param_values of this TestSqlToolDetails.
        :rtype: oci.aidataplatform_dp.models.TestToolParamValues
        """
        return self._param_values

    @param_values.setter
    def param_values(self, param_values):
        """
        Sets the param_values of this TestSqlToolDetails.

        :param param_values: The param_values of this TestSqlToolDetails.
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
