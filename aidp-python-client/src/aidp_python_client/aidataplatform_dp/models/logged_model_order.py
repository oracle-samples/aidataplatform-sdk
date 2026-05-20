# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class LoggedModelOrder(object):
    """
    LoggedModelOrder.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new LoggedModelOrder object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param field_name:
            The value to assign to the field_name property of this LoggedModelOrder.
        :type field_name: str

        :param ascending:
            The value to assign to the ascending property of this LoggedModelOrder.
        :type ascending: bool

        """
        self.swagger_types = {
            'field_name': 'str',
            'ascending': 'bool'
        }

        self.attribute_map = {
            'field_name': 'field_name',
            'ascending': 'ascending'
        }

        self._field_name = None
        self._ascending = None

    @property
    def field_name(self):
        """
        **[Required]** Gets the field_name of this LoggedModelOrder.
        Field name. Allowed values are creation_time.


        :return: The field_name of this LoggedModelOrder.
        :rtype: str
        """
        return self._field_name

    @field_name.setter
    def field_name(self, field_name):
        """
        Sets the field_name of this LoggedModelOrder.
        Field name. Allowed values are creation_time.


        :param field_name: The field_name of this LoggedModelOrder.
        :type: str
        """
        self._field_name = field_name

    @property
    def ascending(self):
        """
        Gets the ascending of this LoggedModelOrder.
        Whether the order is ascending.


        :return: The ascending of this LoggedModelOrder.
        :rtype: bool
        """
        return self._ascending

    @ascending.setter
    def ascending(self, ascending):
        """
        Sets the ascending of this LoggedModelOrder.
        Whether the order is ascending.


        :param ascending: The ascending of this LoggedModelOrder.
        :type: bool
        """
        self._ascending = ascending

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
