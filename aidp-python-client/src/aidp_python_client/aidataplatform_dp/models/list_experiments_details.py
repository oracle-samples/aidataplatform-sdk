# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ListExperimentsDetails(object):
    """
    Details of experiments to fetch.
    """

    #: A constant which can be used with the view_type property of a ListExperimentsDetails.
    #: This constant has a value of "ACTIVE_ONLY"
    VIEW_TYPE_ACTIVE_ONLY = "ACTIVE_ONLY"

    #: A constant which can be used with the view_type property of a ListExperimentsDetails.
    #: This constant has a value of "DELETED_ONLY"
    VIEW_TYPE_DELETED_ONLY = "DELETED_ONLY"

    #: A constant which can be used with the view_type property of a ListExperimentsDetails.
    #: This constant has a value of "ALL"
    VIEW_TYPE_ALL = "ALL"

    def __init__(self, **kwargs):
        """
        Initializes a new ListExperimentsDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param max_results:
            The value to assign to the max_results property of this ListExperimentsDetails.
        :type max_results: int

        :param page_token:
            The value to assign to the page_token property of this ListExperimentsDetails.
        :type page_token: str

        :param filter:
            The value to assign to the filter property of this ListExperimentsDetails.
        :type filter: str

        :param order_by:
            The value to assign to the order_by property of this ListExperimentsDetails.
        :type order_by: list[str]

        :param view_type:
            The value to assign to the view_type property of this ListExperimentsDetails.
            Allowed values for this property are: "ACTIVE_ONLY", "DELETED_ONLY", "ALL"
        :type view_type: str

        """
        self.swagger_types = {
            'max_results': 'int',
            'page_token': 'str',
            'filter': 'str',
            'order_by': 'list[str]',
            'view_type': 'str'
        }

        self.attribute_map = {
            'max_results': 'max_results',
            'page_token': 'page_token',
            'filter': 'filter',
            'order_by': 'order_by',
            'view_type': 'view_type'
        }

        self._max_results = None
        self._page_token = None
        self._filter = None
        self._order_by = None
        self._view_type = None

    @property
    def max_results(self):
        """
        Gets the max_results of this ListExperimentsDetails.
        Maximum number of experiments desired. Servers may select a default. All servers are guaranteed to
        support a max_results threshold of at least 1,000 but may support more. Callers are encouraged to
        pass max_results explicitly and leverage page_token to iterate.


        :return: The max_results of this ListExperimentsDetails.
        :rtype: int
        """
        return self._max_results

    @max_results.setter
    def max_results(self, max_results):
        """
        Sets the max_results of this ListExperimentsDetails.
        Maximum number of experiments desired. Servers may select a default. All servers are guaranteed to
        support a max_results threshold of at least 1,000 but may support more. Callers are encouraged to
        pass max_results explicitly and leverage page_token to iterate.


        :param max_results: The max_results of this ListExperimentsDetails.
        :type: int
        """
        self._max_results = max_results

    @property
    def page_token(self):
        """
        Gets the page_token of this ListExperimentsDetails.
        Token indicating the page of experiments to fetch.


        :return: The page_token of this ListExperimentsDetails.
        :rtype: str
        """
        return self._page_token

    @page_token.setter
    def page_token(self, page_token):
        """
        Sets the page_token of this ListExperimentsDetails.
        Token indicating the page of experiments to fetch.


        :param page_token: The page_token of this ListExperimentsDetails.
        :type: str
        """
        self._page_token = page_token

    @property
    def filter(self):
        """
        Gets the filter of this ListExperimentsDetails.
        A filter expression over experiment attributes and tags that allows returning a subset of experiments.
        The syntax is a subset of SQL that supports ANDing together binary operations between an attribute or tag and a constant.
        Example: name LIKE 'test-%' AND tags.key = 'value'
        Columns with special characters (hyphen, space, period, etc.) can be selected using double quotes or backticks.
        Example: tags.\"extra-key\" = 'value' or tags.`extra-key` = 'value'
        Supported operators are =, !=, LIKE, and ILIKE.


        :return: The filter of this ListExperimentsDetails.
        :rtype: str
        """
        return self._filter

    @filter.setter
    def filter(self, filter):
        """
        Sets the filter of this ListExperimentsDetails.
        A filter expression over experiment attributes and tags that allows returning a subset of experiments.
        The syntax is a subset of SQL that supports ANDing together binary operations between an attribute or tag and a constant.
        Example: name LIKE 'test-%' AND tags.key = 'value'
        Columns with special characters (hyphen, space, period, etc.) can be selected using double quotes or backticks.
        Example: tags.\"extra-key\" = 'value' or tags.`extra-key` = 'value'
        Supported operators are =, !=, LIKE, and ILIKE.


        :param filter: The filter of this ListExperimentsDetails.
        :type: str
        """
        self._filter = filter

    @property
    def order_by(self):
        """
        Gets the order_by of this ListExperimentsDetails.
        List of columns for ordering search results, which can include experiment name and ID with
        an optional \"DESC\" or \"ASC\" annotation, where \"ASC\" is the default. Tiebreaks are done by experiment ID DESC.


        :return: The order_by of this ListExperimentsDetails.
        :rtype: list[str]
        """
        return self._order_by

    @order_by.setter
    def order_by(self, order_by):
        """
        Sets the order_by of this ListExperimentsDetails.
        List of columns for ordering search results, which can include experiment name and ID with
        an optional \"DESC\" or \"ASC\" annotation, where \"ASC\" is the default. Tiebreaks are done by experiment ID DESC.


        :param order_by: The order_by of this ListExperimentsDetails.
        :type: list[str]
        """
        self._order_by = order_by

    @property
    def view_type(self):
        """
        Gets the view_type of this ListExperimentsDetails.
        Qualifier for type of experiments to be returned. If unspecified, returns only active experiments.

        Allowed values for this property are: "ACTIVE_ONLY", "DELETED_ONLY", "ALL"


        :return: The view_type of this ListExperimentsDetails.
        :rtype: str
        """
        return self._view_type

    @view_type.setter
    def view_type(self, view_type):
        """
        Sets the view_type of this ListExperimentsDetails.
        Qualifier for type of experiments to be returned. If unspecified, returns only active experiments.


        :param view_type: The view_type of this ListExperimentsDetails.
        :type: str
        """
        allowed_values = ["ACTIVE_ONLY", "DELETED_ONLY", "ALL"]
        if not value_allowed_none_or_none_sentinel(view_type, allowed_values):
            raise ValueError(
                "Invalid value for `view_type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._view_type = view_type

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
