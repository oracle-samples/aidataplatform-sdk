# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class TestToolParamValues(object):
    """
    Named parameters and their values for the test action.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new TestToolParamValues object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param values:
            The value to assign to the values property of this TestToolParamValues.
        :type values: dict(str, str)

        """
        self.swagger_types = {
            'values': 'dict(str, str)'
        }

        self.attribute_map = {
            'values': 'values'
        }

        self._values = None

    @property
    def values(self):
        """
        Gets the values of this TestToolParamValues.
        Map of parameter names to their string values.


        :return: The values of this TestToolParamValues.
        :rtype: dict(str, str)
        """
        return self._values

    @values.setter
    def values(self, values):
        """
        Sets the values of this TestToolParamValues.
        Map of parameter names to their string values.


        :param values: The values of this TestToolParamValues.
        :type: dict(str, str)
        """
        self._values = values

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
