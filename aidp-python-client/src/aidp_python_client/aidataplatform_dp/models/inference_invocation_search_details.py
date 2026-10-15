# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class InferenceInvocationSearchDetails(object):
    """
    Filters and OCI-backed pagination for correlated inference invocation rows. Each response contains at most 20 rows; only the first 10,000 matching rows are available.
    """

    #: A constant which can be used with the status property of a InferenceInvocationSearchDetails.
    #: This constant has a value of "SUCCESS"
    STATUS_SUCCESS = "SUCCESS"

    #: A constant which can be used with the status property of a InferenceInvocationSearchDetails.
    #: This constant has a value of "MALFORMED"
    STATUS_MALFORMED = "MALFORMED"

    #: A constant which can be used with the status property of a InferenceInvocationSearchDetails.
    #: This constant has a value of "FAILED"
    STATUS_FAILED = "FAILED"

    #: A constant which can be used with the status property of a InferenceInvocationSearchDetails.
    #: This constant has a value of "UNKNOWN"
    STATUS_UNKNOWN = "UNKNOWN"

    def __init__(self, **kwargs):
        """
        Initializes a new InferenceInvocationSearchDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param time_start:
            The value to assign to the time_start property of this InferenceInvocationSearchDetails.
        :type time_start: datetime

        :param time_end:
            The value to assign to the time_end property of this InferenceInvocationSearchDetails.
        :type time_end: datetime

        :param status:
            The value to assign to the status property of this InferenceInvocationSearchDetails.
            Allowed values for this property are: "SUCCESS", "MALFORMED", "FAILED", "UNKNOWN"
        :type status: str

        :param model_version:
            The value to assign to the model_version property of this InferenceInvocationSearchDetails.
        :type model_version: str

        :param request_uri:
            The value to assign to the request_uri property of this InferenceInvocationSearchDetails.
        :type request_uri: str

        :param page_token:
            The value to assign to the page_token property of this InferenceInvocationSearchDetails.
        :type page_token: str

        """
        self.swagger_types = {
            'time_start': 'datetime',
            'time_end': 'datetime',
            'status': 'str',
            'model_version': 'str',
            'request_uri': 'str',
            'page_token': 'str'
        }
        self.attribute_map = {
            'time_start': 'timeStart',
            'time_end': 'timeEnd',
            'status': 'status',
            'model_version': 'modelVersion',
            'request_uri': 'requestUri',
            'page_token': 'pageToken'
        }
        self._time_start = None
        self._time_end = None
        self._status = None
        self._model_version = None
        self._request_uri = None
        self._page_token = None

    @property
    def time_start(self):
        """
        Gets the time_start of this InferenceInvocationSearchDetails.
        Inclusive request timestamp start. Defaults to current time minus 24 hours when omitted. The range must be within the most recent 14 days. Body timestamps require millisecond precision. Example: 2026-09-01T00:00:00.000Z.


        :return: The time_start of this InferenceInvocationSearchDetails.
        :rtype: datetime
        """
        return self._time_start

    @time_start.setter
    def time_start(self, time_start):
        """
        Sets the time_start of this InferenceInvocationSearchDetails.
        Inclusive request timestamp start. Defaults to current time minus 24 hours when omitted. The range must be within the most recent 14 days. Body timestamps require millisecond precision. Example: 2026-09-01T00:00:00.000Z.


        :param time_start: The time_start of this InferenceInvocationSearchDetails.
        :type: datetime
        """
        self._time_start = time_start

    @property
    def time_end(self):
        """
        Gets the time_end of this InferenceInvocationSearchDetails.
        Inclusive request timestamp end. Defaults to current time when omitted. The range must be within the most recent 14 days. Body timestamps require millisecond precision. Example: 2026-09-15T00:00:00.000Z.


        :return: The time_end of this InferenceInvocationSearchDetails.
        :rtype: datetime
        """
        return self._time_end

    @time_end.setter
    def time_end(self, time_end):
        """
        Sets the time_end of this InferenceInvocationSearchDetails.
        Inclusive request timestamp end. Defaults to current time when omitted. The range must be within the most recent 14 days. Body timestamps require millisecond precision. Example: 2026-09-15T00:00:00.000Z.


        :param time_end: The time_end of this InferenceInvocationSearchDetails.
        :type: datetime
        """
        self._time_end = time_end

    @property
    def status(self):
        """
        Gets the status of this InferenceInvocationSearchDetails.
        Restricts results to correlated invocations with this status.

        Allowed values for this property are: "SUCCESS", "MALFORMED", "FAILED", "UNKNOWN"


        :return: The status of this InferenceInvocationSearchDetails.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """
        Sets the status of this InferenceInvocationSearchDetails.
        Restricts results to correlated invocations with this status.


        :param status: The status of this InferenceInvocationSearchDetails.
        :type: str
        """
        allowed_values = ["SUCCESS", "MALFORMED", "FAILED", "UNKNOWN"]
        if not value_allowed_none_or_none_sentinel(status, allowed_values):
            raise ValueError(
                f"Invalid value for `status`, must be None or one of {allowed_values}"
            )
        self._status = status

    @property
    def model_version(self):
        """
        Gets the model_version of this InferenceInvocationSearchDetails.
        Restricts results to invocations served by this model version.


        :return: The model_version of this InferenceInvocationSearchDetails.
        :rtype: str
        """
        return self._model_version

    @model_version.setter
    def model_version(self, model_version):
        """
        Sets the model_version of this InferenceInvocationSearchDetails.
        Restricts results to invocations served by this model version.


        :param model_version: The model_version of this InferenceInvocationSearchDetails.
        :type: str
        """
        self._model_version = model_version

    @property
    def request_uri(self):
        """
        Gets the request_uri of this InferenceInvocationSearchDetails.
        Restricts results to invocations against this inference endpoint URI.


        :return: The request_uri of this InferenceInvocationSearchDetails.
        :rtype: str
        """
        return self._request_uri

    @request_uri.setter
    def request_uri(self, request_uri):
        """
        Sets the request_uri of this InferenceInvocationSearchDetails.
        Restricts results to invocations against this inference endpoint URI.


        :param request_uri: The request_uri of this InferenceInvocationSearchDetails.
        :type: str
        """
        self._request_uri = request_uri

    @property
    def page_token(self):
        """
        Gets the page_token of this InferenceInvocationSearchDetails.
        Opaque token from a previous response. It continues pagination of the filtered, correlated invocation rows.


        :return: The page_token of this InferenceInvocationSearchDetails.
        :rtype: str
        """
        return self._page_token

    @page_token.setter
    def page_token(self, page_token):
        """
        Sets the page_token of this InferenceInvocationSearchDetails.
        Opaque token from a previous response. It continues pagination of the filtered, correlated invocation rows.


        :param page_token: The page_token of this InferenceInvocationSearchDetails.
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
