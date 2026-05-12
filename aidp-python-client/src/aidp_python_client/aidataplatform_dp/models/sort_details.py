# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class SortDetails(object):
    """
    Object with sort criteria details
    """

    #: A constant which can be used with the sort_by property of a SortDetails.
    #: This constant has a value of "TIME_UPDATED"
    SORT_BY_TIME_UPDATED = "TIME_UPDATED"

    #: A constant which can be used with the sort_by property of a SortDetails.
    #: This constant has a value of "TIME_CREATED"
    SORT_BY_TIME_CREATED = "TIME_CREATED"

    #: A constant which can be used with the sort_by property of a SortDetails.
    #: This constant has a value of "RELEVANCY"
    SORT_BY_RELEVANCY = "RELEVANCY"

    #: A constant which can be used with the sort_by property of a SortDetails.
    #: This constant has a value of "TYPE"
    SORT_BY_TYPE = "TYPE"

    #: A constant which can be used with the sort_order property of a SortDetails.
    #: This constant has a value of "ASC"
    SORT_ORDER_ASC = "ASC"

    #: A constant which can be used with the sort_order property of a SortDetails.
    #: This constant has a value of "DESC"
    SORT_ORDER_DESC = "DESC"

    def __init__(self, **kwargs):
        """
        Initializes a new SortDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param sort_by:
            The value to assign to the sort_by property of this SortDetails.
            Allowed values for this property are: "TIME_UPDATED", "TIME_CREATED", "RELEVANCY", "TYPE"
        :type sort_by: str

        :param sort_order:
            The value to assign to the sort_order property of this SortDetails.
            Allowed values for this property are: "ASC", "DESC"
        :type sort_order: str

        """
        self.swagger_types = {
            'sort_by': 'str',
            'sort_order': 'str'
        }

        self.attribute_map = {
            'sort_by': 'sortBy',
            'sort_order': 'sortOrder'
        }

        self._sort_by = None
        self._sort_order = None

    @property
    def sort_by(self):
        """
        Gets the sort_by of this SortDetails.
        Field name that needs to be sorted by.

        Allowed values for this property are: "TIME_UPDATED", "TIME_CREATED", "RELEVANCY", "TYPE"


        :return: The sort_by of this SortDetails.
        :rtype: str
        """
        return self._sort_by

    @sort_by.setter
    def sort_by(self, sort_by):
        """
        Sets the sort_by of this SortDetails.
        Field name that needs to be sorted by.


        :param sort_by: The sort_by of this SortDetails.
        :type: str
        """
        allowed_values = ["TIME_UPDATED", "TIME_CREATED", "RELEVANCY", "TYPE"]
        if not value_allowed_none_or_none_sentinel(sort_by, allowed_values):
            raise ValueError(
                "Invalid value for `sort_by`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._sort_by = sort_by

    @property
    def sort_order(self):
        """
        Gets the sort_order of this SortDetails.
        Sort order for search results.

        Allowed values for this property are: "ASC", "DESC"


        :return: The sort_order of this SortDetails.
        :rtype: str
        """
        return self._sort_order

    @sort_order.setter
    def sort_order(self, sort_order):
        """
        Sets the sort_order of this SortDetails.
        Sort order for search results.


        :param sort_order: The sort_order of this SortDetails.
        :type: str
        """
        allowed_values = ["ASC", "DESC"]
        if not value_allowed_none_or_none_sentinel(sort_order, allowed_values):
            raise ValueError(
                "Invalid value for `sort_order`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._sort_order = sort_order

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
