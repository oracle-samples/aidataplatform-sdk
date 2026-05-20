# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class SuggestResultsCollection(object):
    """
    List of suggested objects
    """

    def __init__(self, **kwargs):
        """
        Initializes a new SuggestResultsCollection object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param count:
            The value to assign to the count property of this SuggestResultsCollection.
        :type count: int

        :param query:
            The value to assign to the query property of this SuggestResultsCollection.
        :type query: str

        :param items:
            The value to assign to the items property of this SuggestResultsCollection.
        :type items: list[oci.aidataplatform_dp.models.ObjectSuggestSummary]

        """
        self.swagger_types = {
            'count': 'int',
            'query': 'str',
            'items': 'list[ObjectSuggestSummary]'
        }

        self.attribute_map = {
            'count': 'count',
            'query': 'query',
            'items': 'items'
        }

        self._count = None
        self._query = None
        self._items = None

    @property
    def count(self):
        """
        **[Required]** Gets the count of this SuggestResultsCollection.
        Total number of hits


        :return: The count of this SuggestResultsCollection.
        :rtype: int
        """
        return self._count

    @count.setter
    def count(self, count):
        """
        Sets the count of this SuggestResultsCollection.
        Total number of hits


        :param count: The count of this SuggestResultsCollection.
        :type: int
        """
        self._count = count

    @property
    def query(self):
        """
        **[Required]** Gets the query of this SuggestResultsCollection.
        User suggest query


        :return: The query of this SuggestResultsCollection.
        :rtype: str
        """
        return self._query

    @query.setter
    def query(self, query):
        """
        Sets the query of this SuggestResultsCollection.
        User suggest query


        :param query: The query of this SuggestResultsCollection.
        :type: str
        """
        self._query = query

    @property
    def items(self):
        """
        **[Required]** Gets the items of this SuggestResultsCollection.
        List of objects.


        :return: The items of this SuggestResultsCollection.
        :rtype: list[oci.aidataplatform_dp.models.ObjectSuggestSummary]
        """
        return self._items

    @items.setter
    def items(self, items):
        """
        Sets the items of this SuggestResultsCollection.
        List of objects.


        :param items: The items of this SuggestResultsCollection.
        :type: list[oci.aidataplatform_dp.models.ObjectSuggestSummary]
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
