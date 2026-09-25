# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class SearchModelDeploymentsDetails(object):
    """
    Filters and pagination for a model deployment search.
    """

    #: A constant which can be used with the status property of a SearchModelDeploymentsDetails.
    #: This constant has a value of "INACTIVE"
    STATUS_INACTIVE = "INACTIVE"

    #: A constant which can be used with the status property of a SearchModelDeploymentsDetails.
    #: This constant has a value of "ACTIVATING"
    STATUS_ACTIVATING = "ACTIVATING"

    #: A constant which can be used with the status property of a SearchModelDeploymentsDetails.
    #: This constant has a value of "ACTIVE"
    STATUS_ACTIVE = "ACTIVE"

    #: A constant which can be used with the status property of a SearchModelDeploymentsDetails.
    #: This constant has a value of "DEACTIVATING"
    STATUS_DEACTIVATING = "DEACTIVATING"

    #: A constant which can be used with the status property of a SearchModelDeploymentsDetails.
    #: This constant has a value of "UPDATING"
    STATUS_UPDATING = "UPDATING"

    def __init__(self, **kwargs):
        """
        Initializes a new SearchModelDeploymentsDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param model_name:
            The value to assign to the model_name property of this SearchModelDeploymentsDetails.
        :type model_name: str

        :param status:
            The value to assign to the status property of this SearchModelDeploymentsDetails.
            Allowed values for this property are: "INACTIVE", "ACTIVATING", "ACTIVE", "DEACTIVATING", "UPDATING"
        :type status: str

        :param max_results:
            The value to assign to the max_results property of this SearchModelDeploymentsDetails.
        :type max_results: int

        :param order_by:
            The value to assign to the order_by property of this SearchModelDeploymentsDetails.
        :type order_by: list[str]

        :param page_token:
            The value to assign to the page_token property of this SearchModelDeploymentsDetails.
        :type page_token: str

        """
        self.swagger_types = {
            'model_name': 'str',
            'status': 'str',
            'max_results': 'int',
            'order_by': 'list[str]',
            'page_token': 'str'
        }

        self.attribute_map = {
            'model_name': 'model_name',
            'status': 'status',
            'max_results': 'max_results',
            'order_by': 'order_by',
            'page_token': 'page_token'
        }

        self._model_name = None
        self._status = None
        self._max_results = None
        self._order_by = None
        self._page_token = None

    @property
    def model_name(self):
        """
        **[Required]** Gets the model_name of this SearchModelDeploymentsDetails.
        A filter over the registered model name.


        :return: The model_name of this SearchModelDeploymentsDetails.
        :rtype: str
        """
        return self._model_name

    @model_name.setter
    def model_name(self, model_name):
        """
        Sets the model_name of this SearchModelDeploymentsDetails.
        A filter over the registered model name.


        :param model_name: The model_name of this SearchModelDeploymentsDetails.
        :type: str
        """
        self._model_name = model_name

    @property
    def status(self):
        """
        Gets the status of this SearchModelDeploymentsDetails.
        A filter over deployment status.

        Allowed values for this property are: "INACTIVE", "ACTIVATING", "ACTIVE", "DEACTIVATING", "UPDATING"


        :return: The status of this SearchModelDeploymentsDetails.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """
        Sets the status of this SearchModelDeploymentsDetails.
        A filter over deployment status.


        :param status: The status of this SearchModelDeploymentsDetails.
        :type: str
        """
        allowed_values = ["INACTIVE", "ACTIVATING", "ACTIVE", "DEACTIVATING", "UPDATING"]
        if not value_allowed_none_or_none_sentinel(status, allowed_values):
            raise ValueError(
                "Invalid value for `status`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._status = status

    @property
    def max_results(self):
        """
        Gets the max_results of this SearchModelDeploymentsDetails.
        Maximum number of deployments desired. Default is 100. Max threshold is 1000.


        :return: The max_results of this SearchModelDeploymentsDetails.
        :rtype: int
        """
        return self._max_results

    @max_results.setter
    def max_results(self, max_results):
        """
        Sets the max_results of this SearchModelDeploymentsDetails.
        Maximum number of deployments desired. Default is 100. Max threshold is 1000.


        :param max_results: The max_results of this SearchModelDeploymentsDetails.
        :type: int
        """
        self._max_results = max_results

    @property
    def order_by(self):
        """
        Gets the order_by of this SearchModelDeploymentsDetails.
        List of columns for ordering search results, e.g. 'created_time DESC'.


        :return: The order_by of this SearchModelDeploymentsDetails.
        :rtype: list[str]
        """
        return self._order_by

    @order_by.setter
    def order_by(self, order_by):
        """
        Sets the order_by of this SearchModelDeploymentsDetails.
        List of columns for ordering search results, e.g. 'created_time DESC'.


        :param order_by: The order_by of this SearchModelDeploymentsDetails.
        :type: list[str]
        """
        self._order_by = order_by

    @property
    def page_token(self):
        """
        Gets the page_token of this SearchModelDeploymentsDetails.
        Token indicating the page of deployments to fetch.


        :return: The page_token of this SearchModelDeploymentsDetails.
        :rtype: str
        """
        return self._page_token

    @page_token.setter
    def page_token(self, page_token):
        """
        Sets the page_token of this SearchModelDeploymentsDetails.
        Token indicating the page of deployments to fetch.


        :param page_token: The page_token of this SearchModelDeploymentsDetails.
        :type: str
        """
        self._page_token = page_token

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
