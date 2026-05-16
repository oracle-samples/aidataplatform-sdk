# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class RecentSearchesCriteria(object):
    """
    Details about recent searches criteria
    """

    def __init__(self, **kwargs):
        """
        Initializes a new RecentSearchesCriteria object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param limit:
            The value to assign to the limit property of this RecentSearchesCriteria.
        :type limit: int

        """
        self.swagger_types = {
            'limit': 'int'
        }

        self.attribute_map = {
            'limit': 'limit'
        }

        self._limit = None

    @property
    def limit(self):
        """
        Gets the limit of this RecentSearchesCriteria.
        The maximum number of items to return.


        :return: The limit of this RecentSearchesCriteria.
        :rtype: int
        """
        return self._limit

    @limit.setter
    def limit(self, limit):
        """
        Sets the limit of this RecentSearchesCriteria.
        The maximum number of items to return.


        :param limit: The limit of this RecentSearchesCriteria.
        :type: int
        """
        self._limit = limit

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
