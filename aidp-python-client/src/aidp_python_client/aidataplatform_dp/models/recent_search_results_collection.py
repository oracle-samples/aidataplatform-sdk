# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class RecentSearchResultsCollection(object):
    """
    List of recent searches objects
    """

    def __init__(self, **kwargs):
        """
        Initializes a new RecentSearchResultsCollection object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param count:
            The value to assign to the count property of this RecentSearchResultsCollection.
        :type count: int

        :param items:
            The value to assign to the items property of this RecentSearchResultsCollection.
        :type items: list[oci.aidataplatform_dp.models.ObjectRecentSearchSummary]

        """
        self.swagger_types = {
            'count': 'int',
            'items': 'list[ObjectRecentSearchSummary]'
        }

        self.attribute_map = {
            'count': 'count',
            'items': 'items'
        }

        self._count = None
        self._items = None

    @property
    def count(self):
        """
        **[Required]** Gets the count of this RecentSearchResultsCollection.
        Total number of items


        :return: The count of this RecentSearchResultsCollection.
        :rtype: int
        """
        return self._count

    @count.setter
    def count(self, count):
        """
        Sets the count of this RecentSearchResultsCollection.
        Total number of items


        :param count: The count of this RecentSearchResultsCollection.
        :type: int
        """
        self._count = count

    @property
    def items(self):
        """
        **[Required]** Gets the items of this RecentSearchResultsCollection.
        List of objects.


        :return: The items of this RecentSearchResultsCollection.
        :rtype: list[oci.aidataplatform_dp.models.ObjectRecentSearchSummary]
        """
        return self._items

    @items.setter
    def items(self, items):
        """
        Sets the items of this RecentSearchResultsCollection.
        List of objects.


        :param items: The items of this RecentSearchResultsCollection.
        :type: list[oci.aidataplatform_dp.models.ObjectRecentSearchSummary]
        """
        self._items = items

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
