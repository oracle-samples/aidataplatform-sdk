# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class GroupedSearchCriteria(object):
    """
    Details about group search criteria
    """

    def __init__(self, **kwargs):
        """
        Initializes a new GroupedSearchCriteria object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param group_limit:
            The value to assign to the group_limit property of this GroupedSearchCriteria.
        :type group_limit: int

        :param query:
            The value to assign to the query property of this GroupedSearchCriteria.
        :type query: str

        :param limit:
            The value to assign to the limit property of this GroupedSearchCriteria.
        :type limit: int

        :param offset:
            The value to assign to the offset property of this GroupedSearchCriteria.
        :type offset: int

        :param aggregations:
            The value to assign to the aggregations property of this GroupedSearchCriteria.
        :type aggregations: list[oci.aidataplatform_dp.models.AggregationEnum]

        :param filter:
            The value to assign to the filter property of this GroupedSearchCriteria.
        :type filter: oci.aidataplatform_dp.models.FilterTypes

        :param sort:
            The value to assign to the sort property of this GroupedSearchCriteria.
        :type sort: list[oci.aidataplatform_dp.models.SortDetails]

        """
        self.swagger_types = {
            'group_limit': 'int',
            'query': 'str',
            'limit': 'int',
            'offset': 'int',
            'aggregations': 'list[AggregationEnum]',
            'filter': 'FilterTypes',
            'sort': 'list[SortDetails]'
        }

        self.attribute_map = {
            'group_limit': 'groupLimit',
            'query': 'query',
            'limit': 'limit',
            'offset': 'offset',
            'aggregations': 'aggregations',
            'filter': 'filter',
            'sort': 'sort'
        }

        self._group_limit = None
        self._query = None
        self._limit = None
        self._offset = None
        self._aggregations = None
        self._filter = None
        self._sort = None

    @property
    def group_limit(self):
        """
        Gets the group_limit of this GroupedSearchCriteria.
        The maximum number of items to return in group


        :return: The group_limit of this GroupedSearchCriteria.
        :rtype: int
        """
        return self._group_limit

    @group_limit.setter
    def group_limit(self, group_limit):
        """
        Sets the group_limit of this GroupedSearchCriteria.
        The maximum number of items to return in group


        :param group_limit: The group_limit of this GroupedSearchCriteria.
        :type: int
        """
        self._group_limit = group_limit

    @property
    def query(self):
        """
        Gets the query of this GroupedSearchCriteria.
        Search query string


        :return: The query of this GroupedSearchCriteria.
        :rtype: str
        """
        return self._query

    @query.setter
    def query(self, query):
        """
        Sets the query of this GroupedSearchCriteria.
        Search query string


        :param query: The query of this GroupedSearchCriteria.
        :type: str
        """
        self._query = query

    @property
    def limit(self):
        """
        Gets the limit of this GroupedSearchCriteria.
        The maximum number of items to return.


        :return: The limit of this GroupedSearchCriteria.
        :rtype: int
        """
        return self._limit

    @limit.setter
    def limit(self, limit):
        """
        Sets the limit of this GroupedSearchCriteria.
        The maximum number of items to return.


        :param limit: The limit of this GroupedSearchCriteria.
        :type: int
        """
        self._limit = limit

    @property
    def offset(self):
        """
        Gets the offset of this GroupedSearchCriteria.
        The doc number from which it needs to be return.


        :return: The offset of this GroupedSearchCriteria.
        :rtype: int
        """
        return self._offset

    @offset.setter
    def offset(self, offset):
        """
        Sets the offset of this GroupedSearchCriteria.
        The doc number from which it needs to be return.


        :param offset: The offset of this GroupedSearchCriteria.
        :type: int
        """
        self._offset = offset

    @property
    def aggregations(self):
        """
        Gets the aggregations of this GroupedSearchCriteria.
        The provide the field name on which we need aggregation.


        :return: The aggregations of this GroupedSearchCriteria.
        :rtype: list[oci.aidataplatform_dp.models.AggregationEnum]
        """
        return self._aggregations

    @aggregations.setter
    def aggregations(self, aggregations):
        """
        Sets the aggregations of this GroupedSearchCriteria.
        The provide the field name on which we need aggregation.


        :param aggregations: The aggregations of this GroupedSearchCriteria.
        :type: list[oci.aidataplatform_dp.models.AggregationEnum]
        """
        self._aggregations = aggregations

    @property
    def filter(self):
        """
        Gets the filter of this GroupedSearchCriteria.

        :return: The filter of this GroupedSearchCriteria.
        :rtype: oci.aidataplatform_dp.models.FilterTypes
        """
        return self._filter

    @filter.setter
    def filter(self, filter):
        """
        Sets the filter of this GroupedSearchCriteria.

        :param filter: The filter of this GroupedSearchCriteria.
        :type: oci.aidataplatform_dp.models.FilterTypes
        """
        self._filter = filter

    @property
    def sort(self):
        """
        Gets the sort of this GroupedSearchCriteria.
        Array of objects having details about sort field and order.


        :return: The sort of this GroupedSearchCriteria.
        :rtype: list[oci.aidataplatform_dp.models.SortDetails]
        """
        return self._sort

    @sort.setter
    def sort(self, sort):
        """
        Sets the sort of this GroupedSearchCriteria.
        Array of objects having details about sort field and order.


        :param sort: The sort of this GroupedSearchCriteria.
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
