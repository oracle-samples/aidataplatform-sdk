# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .test_tool_result import TestToolResult
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class SqlTestToolResult(TestToolResult):
    """
    Response when toolType = SQL.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new SqlTestToolResult object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.SqlTestToolResult.tool_type` attribute
        of this class is ``SQL`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param tool_type:
            The value to assign to the tool_type property of this SqlTestToolResult.
            Allowed values for this property are: "SQL", "PROMPT", "RAG", "MCP", "HTTP", "CUSTOM"
        :type tool_type: str

        :param result:
            The value to assign to the result property of this SqlTestToolResult.
        :type result: oci.aidataplatform_dp.models.SqlResult

        """
        self.swagger_types = {
            'tool_type': 'str',
            'result': 'SqlResult'
        }

        self.attribute_map = {
            'tool_type': 'toolType',
            'result': 'result'
        }

        self._tool_type = None
        self._result = None
        self._tool_type = 'SQL'

    @property
    def result(self):
        """
        **[Required]** Gets the result of this SqlTestToolResult.

        :return: The result of this SqlTestToolResult.
        :rtype: oci.aidataplatform_dp.models.SqlResult
        """
        return self._result

    @result.setter
    def result(self, result):
        """
        Sets the result of this SqlTestToolResult.

        :param result: The result of this SqlTestToolResult.
        :type: oci.aidataplatform_dp.models.SqlResult
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
