# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class Parameter(object):
    """
    Specifies the name and value of the defined parameter.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new Parameter object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param name:
            The value to assign to the name property of this Parameter.
        :type name: str

        :param value:
            The value to assign to the value property of this Parameter.
        :type value: str

        """
        self.swagger_types = {
            'name': 'str',
            'value': 'str'
        }

        self.attribute_map = {
            'name': 'name',
            'value': 'value'
        }

        self._name = None
        self._value = None

    @property
    def name(self):
        """
        **[Required]** Gets the name of this Parameter.
        The name of the defined parameter. May only contain alphanumeric characters, '_', '-', and '.'


        :return: The name of this Parameter.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this Parameter.
        The name of the defined parameter. May only contain alphanumeric characters, '_', '-', and '.'


        :param name: The name of this Parameter.
        :type: str
        """
        self._name = name

    @property
    def value(self):
        """
        Gets the value of this Parameter.
        Value of the defined parameter.


        :return: The value of this Parameter.
        :rtype: str
        """
        return self._value

    @value.setter
    def value(self, value):
        """
        Sets the value of this Parameter.
        Value of the defined parameter.


        :param value: The value of this Parameter.
        :type: str
        """
        self._value = value

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
