# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class SearchCriteria(object):
    """
    Details about search criteria
    """

    def __init__(self, **kwargs):
        """
        Initializes a new SearchCriteria object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param query:
            The value to assign to the query property of this SearchCriteria.
        :type query: str

        :param limit:
            The value to assign to the limit property of this SearchCriteria.
        :type limit: int

        :param offset:
            The value to assign to the offset property of this SearchCriteria.
        :type offset: int

        :param aggregations:
            The value to assign to the aggregations property of this SearchCriteria.
        :type aggregations: list[oci.aidataplatform_dp.models.AggregationEnum]

        :param filter:
            The value to assign to the filter property of this SearchCriteria.
        :type filter: oci.aidataplatform_dp.models.FilterTypes

        :param sort:
            The value to assign to the sort property of this SearchCriteria.
        :type sort: list[oci.aidataplatform_dp.models.SortDetails]

        """
        self.swagger_types = {
            'query': 'str',
            'limit': 'int',
            'offset': 'int',
            'aggregations': 'list[AggregationEnum]',
            'filter': 'FilterTypes',
            'sort': 'list[SortDetails]'
        }

        self.attribute_map = {
            'query': 'query',
            'limit': 'limit',
            'offset': 'offset',
            'aggregations': 'aggregations',
            'filter': 'filter',
            'sort': 'sort'
        }

        self._query = None
        self._limit = None
        self._offset = None
        self._aggregations = None
        self._filter = None
        self._sort = None

    @property
    def query(self):
        """
        Gets the query of this SearchCriteria.
        Search query string


        :return: The query of this SearchCriteria.
        :rtype: str
        """
        return self._query

    @query.setter
    def query(self, query):
        """
        Sets the query of this SearchCriteria.
        Search query string


        :param query: The query of this SearchCriteria.
        :type: str
        """
        self._query = query

    @property
    def limit(self):
        """
        Gets the limit of this SearchCriteria.
        The maximum number of items to return.


        :return: The limit of this SearchCriteria.
        :rtype: int
        """
        return self._limit

    @limit.setter
    def limit(self, limit):
        """
        Sets the limit of this SearchCriteria.
        The maximum number of items to return.


        :param limit: The limit of this SearchCriteria.
        :type: int
        """
        self._limit = limit

    @property
    def offset(self):
        """
        Gets the offset of this SearchCriteria.
        The doc number from which it needs to be return.


        :return: The offset of this SearchCriteria.
        :rtype: int
        """
        return self._offset

    @offset.setter
    def offset(self, offset):
        """
        Sets the offset of this SearchCriteria.
        The doc number from which it needs to be return.


        :param offset: The offset of this SearchCriteria.
        :type: int
        """
        self._offset = offset

    @property
    def aggregations(self):
        """
        Gets the aggregations of this SearchCriteria.
        The provide the field name on which we need aggregation.


        :return: The aggregations of this SearchCriteria.
        :rtype: list[oci.aidataplatform_dp.models.AggregationEnum]
        """
        return self._aggregations

    @aggregations.setter
    def aggregations(self, aggregations):
        """
        Sets the aggregations of this SearchCriteria.
        The provide the field name on which we need aggregation.


        :param aggregations: The aggregations of this SearchCriteria.
        :type: list[oci.aidataplatform_dp.models.AggregationEnum]
        """
        self._aggregations = aggregations

    @property
    def filter(self):
        """
        Gets the filter of this SearchCriteria.

        :return: The filter of this SearchCriteria.
        :rtype: oci.aidataplatform_dp.models.FilterTypes
        """
        return self._filter

    @filter.setter
    def filter(self, filter):
        """
        Sets the filter of this SearchCriteria.

        :param filter: The filter of this SearchCriteria.
        :type: oci.aidataplatform_dp.models.FilterTypes
        """
        self._filter = filter

    @property
    def sort(self):
        """
        Gets the sort of this SearchCriteria.
        Array of objects having details about sort field and order.


        :return: The sort of this SearchCriteria.
        :rtype: list[oci.aidataplatform_dp.models.SortDetails]
        """
        return self._sort

    @sort.setter
    def sort(self, sort):
        """
        Sets the sort of this SearchCriteria.
        Array of objects having details about sort field and order.


        :param sort: The sort of this SearchCriteria.
        :type: list[oci.aidataplatform_dp.models.SortDetails]
        """
        self._sort = sort

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
