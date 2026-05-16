# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ViewProperty(object):
    """
    The property of the view.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ViewProperty object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param property_name:
            The value to assign to the property_name property of this ViewProperty.
        :type property_name: str

        :param property_value:
            The value to assign to the property_value property of this ViewProperty.
        :type property_value: str

        """
        self.swagger_types = {
            'property_name': 'str',
            'property_value': 'str'
        }

        self.attribute_map = {
            'property_name': 'propertyName',
            'property_value': 'propertyValue'
        }

        self._property_name = None
        self._property_value = None

    @property
    def property_name(self):
        """
        **[Required]** Gets the property_name of this ViewProperty.
        Property name.


        :return: The property_name of this ViewProperty.
        :rtype: str
        """
        return self._property_name

    @property_name.setter
    def property_name(self, property_name):
        """
        Sets the property_name of this ViewProperty.
        Property name.


        :param property_name: The property_name of this ViewProperty.
        :type: str
        """
        self._property_name = property_name

    @property
    def property_value(self):
        """
        Gets the property_value of this ViewProperty.
        Property value.


        :return: The property_value of this ViewProperty.
        :rtype: str
        """
        return self._property_value

    @property_value.setter
    def property_value(self, property_value):
        """
        Sets the property_value of this ViewProperty.
        Property value.


        :param property_value: The property_value of this ViewProperty.
        :type: str
        """
        self._property_value = property_value

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
