# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class SearchResultsCollection(object):
    """
    List of objects
    """

    def __init__(self, **kwargs):
        """
        Initializes a new SearchResultsCollection object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param count:
            The value to assign to the count property of this SearchResultsCollection.
        :type count: int

        :param query:
            The value to assign to the query property of this SearchResultsCollection.
        :type query: str

        :param items:
            The value to assign to the items property of this SearchResultsCollection.
        :type items: list[oci.aidataplatform_dp.models.ObjectSearchSummary]

        :param aggregations:
            The value to assign to the aggregations property of this SearchResultsCollection.
        :type aggregations: dict(str, list[SearchObjectType])

        """
        self.swagger_types = {
            'count': 'int',
            'query': 'str',
            'items': 'list[ObjectSearchSummary]',
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
        **[Required]** Gets the count of this SearchResultsCollection.
        Total number of hits


        :return: The count of this SearchResultsCollection.
        :rtype: int
        """
        return self._count

    @count.setter
    def count(self, count):
        """
        Sets the count of this SearchResultsCollection.
        Total number of hits


        :param count: The count of this SearchResultsCollection.
        :type: int
        """
        self._count = count

    @property
    def query(self):
        """
        **[Required]** Gets the query of this SearchResultsCollection.
        User search query


        :return: The query of this SearchResultsCollection.
        :rtype: str
        """
        return self._query

    @query.setter
    def query(self, query):
        """
        Sets the query of this SearchResultsCollection.
        User search query


        :param query: The query of this SearchResultsCollection.
        :type: str
        """
        self._query = query

    @property
    def items(self):
        """
        **[Required]** Gets the items of this SearchResultsCollection.
        List of objects.


        :return: The items of this SearchResultsCollection.
        :rtype: list[oci.aidataplatform_dp.models.ObjectSearchSummary]
        """
        return self._items

    @items.setter
    def items(self, items):
        """
        Sets the items of this SearchResultsCollection.
        List of objects.


        :param items: The items of this SearchResultsCollection.
        :type: list[oci.aidataplatform_dp.models.ObjectSearchSummary]
        """
        self._items = items

    @property
    def aggregations(self):
        """
        **[Required]** Gets the aggregations of this SearchResultsCollection.
        Grouped doc name with count.


        :return: The aggregations of this SearchResultsCollection.
        :rtype: dict(str, list[SearchObjectType])
        """
        return self._aggregations

    @aggregations.setter
    def aggregations(self, aggregations):
        """
        Sets the aggregations of this SearchResultsCollection.
        Grouped doc name with count.


        :param aggregations: The aggregations of this SearchResultsCollection.
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
