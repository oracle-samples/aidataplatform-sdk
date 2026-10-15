# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class SearchDeploymentLogsDetails(object):
    """
    Filters and pagination for searching deployment lifecycle logs.
    """

    #: A constant which can be used with the sort_by property of a SearchDeploymentLogsDetails.
    #: This constant has a value of "TIMESTAMP"
    SORT_BY_TIMESTAMP = "TIMESTAMP"

    #: A constant which can be used with the sort_order property of a SearchDeploymentLogsDetails.
    #: This constant has a value of "DESC"
    SORT_ORDER_DESC = "DESC"

    def __init__(self, **kwargs):
        """
        Initializes a new SearchDeploymentLogsDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param time_start:
            The value to assign to the time_start property of this SearchDeploymentLogsDetails.
        :type time_start: datetime

        :param time_end:
            The value to assign to the time_end property of this SearchDeploymentLogsDetails.
        :type time_end: datetime

        :param levels:
            The value to assign to the levels property of this SearchDeploymentLogsDetails.
        :type levels: list[str]

        :param opc_request_id:
            The value to assign to the opc_request_id property of this SearchDeploymentLogsDetails.
        :type opc_request_id: str

        :param replica_id:
            The value to assign to the replica_id property of this SearchDeploymentLogsDetails.
        :type replica_id: str

        :param sort_by:
            The value to assign to the sort_by property of this SearchDeploymentLogsDetails.
            Allowed values for this property are: "TIMESTAMP"
        :type sort_by: str

        :param sort_order:
            The value to assign to the sort_order property of this SearchDeploymentLogsDetails.
            Allowed values for this property are: "DESC"
        :type sort_order: str

        :param limit:
            The value to assign to the limit property of this SearchDeploymentLogsDetails.
        :type limit: int

        :param page_token:
            The value to assign to the page_token property of this SearchDeploymentLogsDetails.
        :type page_token: str

        """
        self.swagger_types = {
            'time_start': 'datetime',
            'time_end': 'datetime',
            'levels': 'list[str]',
            'opc_request_id': 'str',
            'replica_id': 'str',
            'sort_by': 'str',
            'sort_order': 'str',
            'limit': 'int',
            'page_token': 'str'
        }
        self.attribute_map = {
            'time_start': 'timeStart',
            'time_end': 'timeEnd',
            'levels': 'levels',
            'opc_request_id': 'opcRequestId',
            'replica_id': 'replicaId',
            'sort_by': 'sortBy',
            'sort_order': 'sortOrder',
            'limit': 'limit',
            'page_token': 'pageToken'
        }
        self._time_start = None
        self._time_end = None
        self._levels = None
        self._opc_request_id = None
        self._replica_id = None
        self._sort_by = None
        self._sort_order = None
        self._limit = None
        self._page_token = None

    @property
    def time_start(self):
        """
        **[Required]** Gets the time_start of this SearchDeploymentLogsDetails.
        Start of the requested publish-time window (RFC 3339, inclusive).


        :return: The time_start of this SearchDeploymentLogsDetails.
        :rtype: datetime
        """
        return self._time_start

    @time_start.setter
    def time_start(self, time_start):
        """
        Sets the time_start of this SearchDeploymentLogsDetails.
        Start of the requested publish-time window (RFC 3339, inclusive).


        :param time_start: The time_start of this SearchDeploymentLogsDetails.
        :type: datetime
        """
        self._time_start = time_start

    @property
    def time_end(self):
        """
        **[Required]** Gets the time_end of this SearchDeploymentLogsDetails.
        End of the requested publish-time window (RFC 3339, exclusive). Must not be in the future.


        :return: The time_end of this SearchDeploymentLogsDetails.
        :rtype: datetime
        """
        return self._time_end

    @time_end.setter
    def time_end(self, time_end):
        """
        Sets the time_end of this SearchDeploymentLogsDetails.
        End of the requested publish-time window (RFC 3339, exclusive). Must not be in the future.


        :param time_end: The time_end of this SearchDeploymentLogsDetails.
        :type: datetime
        """
        self._time_end = time_end

    @property
    def levels(self):
        """
        Gets the levels of this SearchDeploymentLogsDetails.
        Optional severity filter. Allowed values: DEBUG, INFO, WARNING, ERROR, CRITICAL, UNKNOWN; any other value is rejected with 400. An empty or absent array means all levels.


        :return: The levels of this SearchDeploymentLogsDetails.
        :rtype: list[str]
        """
        return self._levels

    @levels.setter
    def levels(self, levels):
        """
        Sets the levels of this SearchDeploymentLogsDetails.
        Optional severity filter. Allowed values: DEBUG, INFO, WARNING, ERROR, CRITICAL, UNKNOWN; any other value is rejected with 400. An empty or absent array means all levels.


        :param levels: The levels of this SearchDeploymentLogsDetails.
        :type: list[str]
        """
        self._levels = levels

    @property
    def opc_request_id(self):
        """
        Gets the opc_request_id of this SearchDeploymentLogsDetails.
        Optional exact match on the original request identifier of a log event. Only events that carry a request identifier can match. Model deployment lifecycle events are not emitted per request and carry none, so this filter excludes them.


        :return: The opc_request_id of this SearchDeploymentLogsDetails.
        :rtype: str
        """
        return self._opc_request_id

    @opc_request_id.setter
    def opc_request_id(self, opc_request_id):
        """
        Sets the opc_request_id of this SearchDeploymentLogsDetails.
        Optional exact match on the original request identifier of a log event. Only events that carry a request identifier can match. Model deployment lifecycle events are not emitted per request and carry none, so this filter excludes them.


        :param opc_request_id: The opc_request_id of this SearchDeploymentLogsDetails.
        :type: str
        """
        self._opc_request_id = opc_request_id

    @property
    def replica_id(self):
        """
        Gets the replica_id of this SearchDeploymentLogsDetails.
        Optional exact match on the emitting replica or source scope.


        :return: The replica_id of this SearchDeploymentLogsDetails.
        :rtype: str
        """
        return self._replica_id

    @replica_id.setter
    def replica_id(self, replica_id):
        """
        Sets the replica_id of this SearchDeploymentLogsDetails.
        Optional exact match on the emitting replica or source scope.


        :param replica_id: The replica_id of this SearchDeploymentLogsDetails.
        :type: str
        """
        self._replica_id = replica_id

    @property
    def sort_by(self):
        """
        Gets the sort_by of this SearchDeploymentLogsDetails.
        Sort column. Only TIMESTAMP is supported.

        Allowed values for this property are: "TIMESTAMP"


        :return: The sort_by of this SearchDeploymentLogsDetails.
        :rtype: str
        """
        return self._sort_by

    @sort_by.setter
    def sort_by(self, sort_by):
        """
        Sets the sort_by of this SearchDeploymentLogsDetails.
        Sort column. Only TIMESTAMP is supported.


        :param sort_by: The sort_by of this SearchDeploymentLogsDetails.
        :type: str
        """
        allowed_values = ["TIMESTAMP"]
        if not value_allowed_none_or_none_sentinel(sort_by, allowed_values):
            raise ValueError(
                f"Invalid value for `sort_by`, must be None or one of {allowed_values}"
            )
        self._sort_by = sort_by

    @property
    def sort_order(self):
        """
        Gets the sort_order of this SearchDeploymentLogsDetails.
        Sort order. Only DESC is supported.

        Allowed values for this property are: "DESC"


        :return: The sort_order of this SearchDeploymentLogsDetails.
        :rtype: str
        """
        return self._sort_order

    @sort_order.setter
    def sort_order(self, sort_order):
        """
        Sets the sort_order of this SearchDeploymentLogsDetails.
        Sort order. Only DESC is supported.


        :param sort_order: The sort_order of this SearchDeploymentLogsDetails.
        :type: str
        """
        allowed_values = ["DESC"]
        if not value_allowed_none_or_none_sentinel(sort_order, allowed_values):
            raise ValueError(
                f"Invalid value for `sort_order`, must be None or one of {allowed_values}"
            )
        self._sort_order = sort_order

    @property
    def limit(self):
        """
        Gets the limit of this SearchDeploymentLogsDetails.
        Maximum rows per page.


        :return: The limit of this SearchDeploymentLogsDetails.
        :rtype: int
        """
        return self._limit

    @limit.setter
    def limit(self, limit):
        """
        Sets the limit of this SearchDeploymentLogsDetails.
        Maximum rows per page.


        :param limit: The limit of this SearchDeploymentLogsDetails.
        :type: int
        """
        self._limit = limit

    @property
    def page_token(self):
        """
        Gets the page_token of this SearchDeploymentLogsDetails.
        Opaque continuation token from a previous page. Bound to the platform, deployment, and query; expires.


        :return: The page_token of this SearchDeploymentLogsDetails.
        :rtype: str
        """
        return self._page_token

    @page_token.setter
    def page_token(self, page_token):
        """
        Sets the page_token of this SearchDeploymentLogsDetails.
        Opaque continuation token from a previous page. Bound to the platform, deployment, and query; expires.


        :param page_token: The page_token of this SearchDeploymentLogsDetails.
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
