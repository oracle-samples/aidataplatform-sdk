# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class SearchResultsGroupByCollection(object):
    """
    Grouped list of objects by type.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new SearchResultsGroupByCollection object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param count:
            The value to assign to the count property of this SearchResultsGroupByCollection.
        :type count: int

        :param query:
            The value to assign to the query property of this SearchResultsGroupByCollection.
        :type query: str

        :param items:
            The value to assign to the items property of this SearchResultsGroupByCollection.
        :type items: dict(str, list[ObjectSearchSummary])

        :param aggregations:
            The value to assign to the aggregations property of this SearchResultsGroupByCollection.
        :type aggregations: dict(str, list[SearchObjectType])

        """
        self.swagger_types = {
            'count': 'int',
            'query': 'str',
            'items': 'dict(str, list[ObjectSearchSummary])',
            'aggregations': 'dict(str, list[SearchObjectType])'
        }

        self.attribute_map = {
            'count': 'count',
            'query': 'query',
            'items': 'items',
            'aggregations': 'aggregations'
        }

        self._count = None
        self._query = None
        self._items = None
        self._aggregations = None

    @property
    def count(self):
        """
        **[Required]** Gets the count of this SearchResultsGroupByCollection.
        Total number of hits


        :return: The count of this SearchResultsGroupByCollection.
        :rtype: int
        """
        return self._count

    @count.setter
    def count(self, count):
        """
        Sets the count of this SearchResultsGroupByCollection.
        Total number of hits


        :param count: The count of this SearchResultsGroupByCollection.
        :type: int
        """
        self._count = count

    @property
    def query(self):
        """
        **[Required]** Gets the query of this SearchResultsGroupByCollection.
        User search query


        :return: The query of this SearchResultsGroupByCollection.
        :rtype: str
        """
        return self._query

    @query.setter
    def query(self, query):
        """
        Sets the query of this SearchResultsGroupByCollection.
        User search query


        :param query: The query of this SearchResultsGroupByCollection.
        :type: str
        """
        self._query = query

    @property
    def items(self):
        """
        **[Required]** Gets the items of this SearchResultsGroupByCollection.
        Objects grouped by their type. Each key is a type (e.g., \"database\", \"catalog\").


        :return: The items of this SearchResultsGroupByCollection.
        :rtype: dict(str, list[ObjectSearchSummary])
        """
        return self._items

    @items.setter
    def items(self, items):
        """
        Sets the items of this SearchResultsGroupByCollection.
        Objects grouped by their type. Each key is a type (e.g., \"database\", \"catalog\").


        :param items: The items of this SearchResultsGroupByCollection.
        :type: dict(str, list[ObjectSearchSummary])
        """
        self._items = items

    @property
    def aggregations(self):
        """
        **[Required]** Gets the aggregations of this SearchResultsGroupByCollection.
        Grouped doc name with count.


        :return: The aggregations of this SearchResultsGroupByCollection.
        :rtype: dict(str, list[SearchObjectType])
        """
        return self._aggregations

    @aggregations.setter
    def aggregations(self, aggregations):
        """
        Sets the aggregations of this SearchResultsGroupByCollection.
        Grouped doc name with count.


        :param aggregations: The aggregations of this SearchResultsGroupByCollection.
        :type: dict(str, list[SearchObjectType])
        """
        self._aggregations = aggregations

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
