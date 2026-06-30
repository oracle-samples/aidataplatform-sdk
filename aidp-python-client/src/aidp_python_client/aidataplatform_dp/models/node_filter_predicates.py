# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class NodeFilterPredicates(object):
    """
    List of conditions
    """

    def __init__(self, **kwargs):
        """
        Initializes a new NodeFilterPredicates object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param display_name_contains:
            The value to assign to the display_name_contains property of this NodeFilterPredicates.
        :type display_name_contains: str

        :param type_equals:
            The value to assign to the type_equals property of this NodeFilterPredicates.
        :type type_equals: str

        """
        self.swagger_types = {
            'display_name_contains': 'str',
            'type_equals': 'str'
        }

        self.attribute_map = {
            'display_name_contains': 'displayNameContains',
            'type_equals': 'typeEquals'
        }

        self._display_name_contains = None
        self._type_equals = None

    @property
    def display_name_contains(self):
        """
        Gets the display_name_contains of this NodeFilterPredicates.
        Filters nodes whose display name contains the specified value.


        :return: The display_name_contains of this NodeFilterPredicates.
        :rtype: str
        """
        return self._display_name_contains

    @display_name_contains.setter
    def display_name_contains(self, display_name_contains):
        """
        Sets the display_name_contains of this NodeFilterPredicates.
        Filters nodes whose display name contains the specified value.


        :param display_name_contains: The display_name_contains of this NodeFilterPredicates.
        :type: str
        """
        self._display_name_contains = display_name_contains

    @property
    def type_equals(self):
        """
        Gets the type_equals of this NodeFilterPredicates.
        Filters nodes whose type exactly matches the specified value.


        :return: The type_equals of this NodeFilterPredicates.
        :rtype: str
        """
        return self._type_equals

    @type_equals.setter
    def type_equals(self, type_equals):
        """
        Sets the type_equals of this NodeFilterPredicates.
        Filters nodes whose type exactly matches the specified value.


        :param type_equals: The type_equals of this NodeFilterPredicates.
        :type: str
        """
        self._type_equals = type_equals

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
