# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class SuggestCriteria(object):
    """
    Details about suggest criteria
    """

    def __init__(self, **kwargs):
        """
        Initializes a new SuggestCriteria object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param query:
            The value to assign to the query property of this SuggestCriteria.
        :type query: str

        :param limit:
            The value to assign to the limit property of this SuggestCriteria.
        :type limit: int

        """
        self.swagger_types = {
            'query': 'str',
            'limit': 'int'
        }

        self.attribute_map = {
            'query': 'query',
            'limit': 'limit'
        }

        self._query = None
        self._limit = None

    @property
    def query(self):
        """
        Gets the query of this SuggestCriteria.
        Suggest query string


        :return: The query of this SuggestCriteria.
        :rtype: str
        """
        return self._query

    @query.setter
    def query(self, query):
        """
        Sets the query of this SuggestCriteria.
        Suggest query string


        :param query: The query of this SuggestCriteria.
        :type: str
        """
        self._query = query

    @property
    def limit(self):
        """
        Gets the limit of this SuggestCriteria.
        The maximum number of items to return.


        :return: The limit of this SuggestCriteria.
        :rtype: int
        """
        return self._limit

    @limit.setter
    def limit(self, limit):
        """
        Sets the limit of this SuggestCriteria.
        The maximum number of items to return.


        :param limit: The limit of this SuggestCriteria.
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
