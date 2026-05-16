# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .test_mcp_operation import TestMcpOperation
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class TestMcpConnection(TestMcpOperation):
    """
    Test mcp tool connection
    """

    def __init__(self, **kwargs):
        """
        Initializes a new TestMcpConnection object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.TestMcpConnection.test_type` attribute
        of this class is ``CONNECTION`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param test_type:
            The value to assign to the test_type property of this TestMcpConnection.
            Allowed values for this property are: "CONNECTION", "EXTERNAL_TOOL"
        :type test_type: str

        """
        self.swagger_types = {
            'test_type': 'str'
        }

        self.attribute_map = {
            'test_type': 'testType'
        }

        self._test_type = None
        self._test_type = 'CONNECTION'

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
