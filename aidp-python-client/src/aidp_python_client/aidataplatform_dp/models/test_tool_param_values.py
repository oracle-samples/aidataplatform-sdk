# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



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
        :type values: object

        """
        self.swagger_types = {
            'values': 'object'
        }

        self.attribute_map = {
            'values': 'values'
        }

        self._values = None

    @property
    def values(self):
        """
        Gets the values of this TestToolParamValues.
        Map of parameter names to their JSON values. Value types such as string, number, boolean, array, object, and null are preserved


        :return: The values of this TestToolParamValues.
        :rtype: object
        """
        return self._values

    @values.setter
    def values(self, values):
        """
        Sets the values of this TestToolParamValues.
        Map of parameter names to their JSON values. Value types such as string, number, boolean, array, object, and null are preserved


        :param values: The values of this TestToolParamValues.
        :type: object
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
