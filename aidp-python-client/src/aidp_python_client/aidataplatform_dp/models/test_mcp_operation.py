# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class TestMcpOperation(object):
    """
    Represents a type of testing on mcp.
    """

    #: A constant which can be used with the test_type property of a TestMcpOperation.
    #: This constant has a value of "CONNECTION"
    TEST_TYPE_CONNECTION = "CONNECTION"

    #: A constant which can be used with the test_type property of a TestMcpOperation.
    #: This constant has a value of "EXTERNAL_TOOL"
    TEST_TYPE_EXTERNAL_TOOL = "EXTERNAL_TOOL"

    def __init__(self, **kwargs):
        """
        Initializes a new TestMcpOperation object with values from keyword arguments. This class has the following subclasses and if you are using this class as input
        to a service operations then you should favor using a subclass over the base class:

        * :class:`~oci.aidataplatform_dp.models.TestMcpConnection`
        * :class:`~oci.aidataplatform_dp.models.TestMcpExternalTool`

        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param test_type:
            The value to assign to the test_type property of this TestMcpOperation.
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

    @staticmethod
    def get_subtype(object_dictionary):
        """
        Given the hash representation of a subtype of this class,
        use the info in the hash to return the class of the subtype.
        """
        type = object_dictionary['testType']

        if type == 'CONNECTION':
            return 'TestMcpConnection'

        if type == 'EXTERNAL_TOOL':
            return 'TestMcpExternalTool'
        else:
            return 'TestMcpOperation'

    @property
    def test_type(self):
        """
        **[Required]** Gets the test_type of this TestMcpOperation.
        Type of test supported by MCP.

        Allowed values for this property are: "CONNECTION", "EXTERNAL_TOOL"


        :return: The test_type of this TestMcpOperation.
        :rtype: str
        """
        return self._test_type

    @test_type.setter
    def test_type(self, test_type):
        """
        Sets the test_type of this TestMcpOperation.
        Type of test supported by MCP.


        :param test_type: The test_type of this TestMcpOperation.
        :type: str
        """
        allowed_values = ["CONNECTION", "EXTERNAL_TOOL"]
        if not value_allowed_none_or_none_sentinel(test_type, allowed_values):
            raise ValueError(
                "Invalid value for `test_type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._test_type = test_type

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
