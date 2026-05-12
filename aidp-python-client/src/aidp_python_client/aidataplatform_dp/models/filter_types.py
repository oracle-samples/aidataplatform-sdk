# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class FilterTypes(object):
    """
    Different types of filters
    """

    def __init__(self, **kwargs):
        """
        Initializes a new FilterTypes object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param list_filters:
            The value to assign to the list_filters property of this FilterTypes.
        :type list_filters: list[oci.aidataplatform_dp.models.ListFilter]

        :param range_filters:
            The value to assign to the range_filters property of this FilterTypes.
        :type range_filters: list[oci.aidataplatform_dp.models.RangeFilter]

        """
        self.swagger_types = {
            'list_filters': 'list[ListFilter]',
            'range_filters': 'list[RangeFilter]'
        }

        self.attribute_map = {
            'list_filters': 'listFilters',
            'range_filters': 'rangeFilters'
        }

        self._list_filters = None
        self._range_filters = None

    @property
    def list_filters(self):
        """
        Gets the list_filters of this FilterTypes.
        Provide the list of term filters


        :return: The list_filters of this FilterTypes.
        :rtype: list[oci.aidataplatform_dp.models.ListFilter]
        """
        return self._list_filters

    @list_filters.setter
    def list_filters(self, list_filters):
        """
        Sets the list_filters of this FilterTypes.
        Provide the list of term filters


        :param list_filters: The list_filters of this FilterTypes.
        :type: list[oci.aidataplatform_dp.models.ListFilter]
        """
        self._list_filters = list_filters

    @property
    def range_filters(self):
        """
        Gets the range_filters of this FilterTypes.
        Provide the list of range filters


        :return: The range_filters of this FilterTypes.
        :rtype: list[oci.aidataplatform_dp.models.RangeFilter]
        """
        return self._range_filters

    @range_filters.setter
    def range_filters(self, range_filters):
        """
        Sets the range_filters of this FilterTypes.
        Provide the list of range filters


        :param range_filters: The range_filters of this FilterTypes.
        :type: list[oci.aidataplatform_dp.models.RangeFilter]
        """
        self._range_filters = range_filters

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
