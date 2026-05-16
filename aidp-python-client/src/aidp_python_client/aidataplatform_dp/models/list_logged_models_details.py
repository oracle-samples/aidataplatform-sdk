# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ListLoggedModelsDetails(object):
    """
    Details of LoggedModels to fetch.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ListLoggedModelsDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param experiment_ids:
            The value to assign to the experiment_ids property of this ListLoggedModelsDetails.
        :type experiment_ids: list[str]

        :param max_results:
            The value to assign to the max_results property of this ListLoggedModelsDetails.
        :type max_results: int

        :param page_token:
            The value to assign to the page_token property of this ListLoggedModelsDetails.
        :type page_token: str

        :param filter:
            The value to assign to the filter property of this ListLoggedModelsDetails.
        :type filter: str

        :param order_by:
            The value to assign to the order_by property of this ListLoggedModelsDetails.
        :type order_by: list[oci.aidataplatform_dp.models.LoggedModelOrder]

        """
        self.swagger_types = {
            'experiment_ids': 'list[str]',
            'max_results': 'int',
            'page_token': 'str',
            'filter': 'str',
            'order_by': 'list[LoggedModelOrder]'
        }

        self.attribute_map = {
            'experiment_ids': 'experiment_ids',
            'max_results': 'max_results',
            'page_token': 'page_token',
            'filter': 'filter',
            'order_by': 'order_by'
        }

        self._experiment_ids = None
        self._max_results = None
        self._page_token = None
        self._filter = None
        self._order_by = None

    @property
    def experiment_ids(self):
        """
        Gets the experiment_ids of this ListLoggedModelsDetails.
        Fetch logged-models under list of experiments.


        :return: The experiment_ids of this ListLoggedModelsDetails.
        :rtype: list[str]
        """
        return self._experiment_ids

    @experiment_ids.setter
    def experiment_ids(self, experiment_ids):
        """
        Sets the experiment_ids of this ListLoggedModelsDetails.
        Fetch logged-models under list of experiments.


        :param experiment_ids: The experiment_ids of this ListLoggedModelsDetails.
        :type: list[str]
        """
        self._experiment_ids = experiment_ids

    @property
    def max_results(self):
        """
        Gets the max_results of this ListLoggedModelsDetails.
        Maximum number of logged-models desired. Servers may select a default. Callers are encouraged to
        pass max_results explicitly and leverage page_token to iterate.


        :return: The max_results of this ListLoggedModelsDetails.
        :rtype: int
        """
        return self._max_results

    @max_results.setter
    def max_results(self, max_results):
        """
        Sets the max_results of this ListLoggedModelsDetails.
        Maximum number of logged-models desired. Servers may select a default. Callers are encouraged to
        pass max_results explicitly and leverage page_token to iterate.


        :param max_results: The max_results of this ListLoggedModelsDetails.
        :type: int
        """
        self._max_results = max_results

    @property
    def page_token(self):
        """
        Gets the page_token of this ListLoggedModelsDetails.
        Token indicating the page of logged-models to fetch


        :return: The page_token of this ListLoggedModelsDetails.
        :rtype: str
        """
        return self._page_token

    @page_token.setter
    def page_token(self, page_token):
        """
        Sets the page_token of this ListLoggedModelsDetails.
        Token indicating the page of logged-models to fetch


        :param page_token: The page_token of this ListLoggedModelsDetails.
        :type: str
        """
        self._page_token = page_token

    @property
    def filter(self):
        """
        Gets the filter of this ListLoggedModelsDetails.
        A filter expression over logged-models attributes.


        :return: The filter of this ListLoggedModelsDetails.
        :rtype: str
        """
        return self._filter

    @filter.setter
    def filter(self, filter):
        """
        Sets the filter of this ListLoggedModelsDetails.
        A filter expression over logged-models attributes.


        :param filter: The filter of this ListLoggedModelsDetails.
        :type: str
        """
        self._filter = filter

    @property
    def order_by(self):
        """
        Gets the order_by of this ListLoggedModelsDetails.
        List of attributes for ordering search results.


        :return: The order_by of this ListLoggedModelsDetails.
        :rtype: list[oci.aidataplatform_dp.models.LoggedModelOrder]
        """
        return self._order_by

    @order_by.setter
    def order_by(self, order_by):
        """
        Sets the order_by of this ListLoggedModelsDetails.
        List of attributes for ordering search results.


        :param order_by: The order_by of this ListLoggedModelsDetails.
        :type: list[oci.aidataplatform_dp.models.LoggedModelOrder]
        """
        self._order_by = order_by

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
