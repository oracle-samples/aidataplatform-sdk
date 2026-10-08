# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ListModelDeploymentActivitiesDetails(object):
    """
    Filters and pagination for a deployment activity search.
    """

    #: A constant which can be used with the status property of a ListModelDeploymentActivitiesDetails.
    #: This constant has a value of "SUCCESS"
    STATUS_SUCCESS = "SUCCESS"

    #: A constant which can be used with the status property of a ListModelDeploymentActivitiesDetails.
    #: This constant has a value of "FAILURE"
    STATUS_FAILURE = "FAILURE"

    def __init__(self, **kwargs):
        """
        Initializes a new ListModelDeploymentActivitiesDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param deployment_id:
            The value to assign to the deployment_id property of this ListModelDeploymentActivitiesDetails.
        :type deployment_id: str

        :param status:
            The value to assign to the status property of this ListModelDeploymentActivitiesDetails.
            Allowed values for this property are: "SUCCESS", "FAILURE"
        :type status: str

        :param max_results:
            The value to assign to the max_results property of this ListModelDeploymentActivitiesDetails.
        :type max_results: int

        :param order_by:
            The value to assign to the order_by property of this ListModelDeploymentActivitiesDetails.
        :type order_by: list[str]

        :param page_token:
            The value to assign to the page_token property of this ListModelDeploymentActivitiesDetails.
        :type page_token: str

        """
        self.swagger_types = {
            'deployment_id': 'str',
            'status': 'str',
            'max_results': 'int',
            'order_by': 'list[str]',
            'page_token': 'str'
        }

        self.attribute_map = {
            'deployment_id': 'deployment_id',
            'status': 'status',
            'max_results': 'max_results',
            'order_by': 'order_by',
            'page_token': 'page_token'
        }

        self._deployment_id = None
        self._status = None
        self._max_results = None
        self._order_by = None
        self._page_token = None

    @property
    def deployment_id(self):
        """
        **[Required]** Gets the deployment_id of this ListModelDeploymentActivitiesDetails.
        ID of the deployment whose activities to list.


        :return: The deployment_id of this ListModelDeploymentActivitiesDetails.
        :rtype: str
        """
        return self._deployment_id

    @deployment_id.setter
    def deployment_id(self, deployment_id):
        """
        Sets the deployment_id of this ListModelDeploymentActivitiesDetails.
        ID of the deployment whose activities to list.


        :param deployment_id: The deployment_id of this ListModelDeploymentActivitiesDetails.
        :type: str
        """
        self._deployment_id = deployment_id

    @property
    def status(self):
        """
        Gets the status of this ListModelDeploymentActivitiesDetails.
        A filter over activity status.

        Allowed values for this property are: "SUCCESS", "FAILURE"


        :return: The status of this ListModelDeploymentActivitiesDetails.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """
        Sets the status of this ListModelDeploymentActivitiesDetails.
        A filter over activity status.


        :param status: The status of this ListModelDeploymentActivitiesDetails.
        :type: str
        """
        allowed_values = ["SUCCESS", "FAILURE"]
        if not value_allowed_none_or_none_sentinel(status, allowed_values):
            raise ValueError(
                "Invalid value for `status`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._status = status

    @property
    def max_results(self):
        """
        Gets the max_results of this ListModelDeploymentActivitiesDetails.
        Maximum number of activities desired. Default is 100. Max threshold is 1000.


        :return: The max_results of this ListModelDeploymentActivitiesDetails.
        :rtype: int
        """
        return self._max_results

    @max_results.setter
    def max_results(self, max_results):
        """
        Sets the max_results of this ListModelDeploymentActivitiesDetails.
        Maximum number of activities desired. Default is 100. Max threshold is 1000.


        :param max_results: The max_results of this ListModelDeploymentActivitiesDetails.
        :type: int
        """
        self._max_results = max_results

    @property
    def order_by(self):
        """
        Gets the order_by of this ListModelDeploymentActivitiesDetails.
        List of columns for ordering search results, e.g. 'start_time DESC'.


        :return: The order_by of this ListModelDeploymentActivitiesDetails.
        :rtype: list[str]
        """
        return self._order_by

    @order_by.setter
    def order_by(self, order_by):
        """
        Sets the order_by of this ListModelDeploymentActivitiesDetails.
        List of columns for ordering search results, e.g. 'start_time DESC'.


        :param order_by: The order_by of this ListModelDeploymentActivitiesDetails.
        :type: list[str]
        """
        self._order_by = order_by

    @property
    def page_token(self):
        """
        Gets the page_token of this ListModelDeploymentActivitiesDetails.
        Token indicating the page of activities to fetch.


        :return: The page_token of this ListModelDeploymentActivitiesDetails.
        :rtype: str
        """
        return self._page_token

    @page_token.setter
    def page_token(self, page_token):
        """
        Sets the page_token of this ListModelDeploymentActivitiesDetails.
        Token indicating the page of activities to fetch.


        :param page_token: The page_token of this ListModelDeploymentActivitiesDetails.
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
