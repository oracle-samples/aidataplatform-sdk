# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.

from .test_tool_result import TestToolResult
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class McpTestToolResult(TestToolResult):
    """
    Response when toolType = MCP.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new McpTestToolResult object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.McpTestToolResult.tool_type` attribute
        of this class is ``MCP`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param tool_type:
            The value to assign to the tool_type property of this McpTestToolResult.
            Allowed values for this property are: "SQL", "PROMPT", "RAG", "MCP", "HTTP", "CUSTOM"
        :type tool_type: str

        :param result:
            The value to assign to the result property of this McpTestToolResult.
        :type result: oci.aidataplatform_dp.models.McpResult

        """
        self.swagger_types = {
            'tool_type': 'str',
            'result': 'McpResult'
        }

        self.attribute_map = {
            'tool_type': 'toolType',
            'result': 'result'
        }

        self._tool_type = None
        self._result = None
        self._tool_type = 'MCP'

    @property
    def result(self):
        """
        **[Required]** Gets the result of this McpTestToolResult.

        :return: The result of this McpTestToolResult.
        :rtype: oci.aidataplatform_dp.models.McpResult
        """
        return self._result

    @result.setter
    def result(self, result):
        """
        Sets the result of this McpTestToolResult.

        :param result: The result of this McpTestToolResult.
        :type: oci.aidataplatform_dp.models.McpResult
        """
        self._result = result

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
