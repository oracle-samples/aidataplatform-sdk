# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class InferenceInvocationSummary(object):
    """
    One correlated inference request and response record.
    """

    #: A constant which can be used with the status property of a InferenceInvocationSummary.
    #: This constant has a value of "SUCCESS"
    STATUS_SUCCESS = "SUCCESS"

    #: A constant which can be used with the status property of a InferenceInvocationSummary.
    #: This constant has a value of "MALFORMED"
    STATUS_MALFORMED = "MALFORMED"

    #: A constant which can be used with the status property of a InferenceInvocationSummary.
    #: This constant has a value of "FAILED"
    STATUS_FAILED = "FAILED"

    #: A constant which can be used with the status property of a InferenceInvocationSummary.
    #: This constant has a value of "UNKNOWN"
    STATUS_UNKNOWN = "UNKNOWN"

    def __init__(self, **kwargs):
        """
        Initializes a new InferenceInvocationSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param request_timestamp:
            The value to assign to the request_timestamp property of this InferenceInvocationSummary.
        :type request_timestamp: datetime

        :param request_uri:
            The value to assign to the request_uri property of this InferenceInvocationSummary.
        :type request_uri: str

        :param model_version:
            The value to assign to the model_version property of this InferenceInvocationSummary.
        :type model_version: str

        :param status:
            The value to assign to the status property of this InferenceInvocationSummary.
            Allowed values for this property are: "SUCCESS", "MALFORMED", "FAILED", "UNKNOWN", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type status: str

        :param latency_ms:
            The value to assign to the latency_ms property of this InferenceInvocationSummary.
        :type latency_ms: int

        :param request_id:
            The value to assign to the request_id property of this InferenceInvocationSummary.
        :type request_id: str

        """
        self.swagger_types = {
            'request_timestamp': 'datetime',
            'request_uri': 'str',
            'model_version': 'str',
            'status': 'str',
            'latency_ms': 'int',
            'request_id': 'str'
        }
        self.attribute_map = {
            'request_timestamp': 'requestTimestamp',
            'request_uri': 'requestUri',
            'model_version': 'modelVersion',
            'status': 'status',
            'latency_ms': 'latencyMs',
            'request_id': 'requestId'
        }
        self._request_timestamp = None
        self._request_uri = None
        self._model_version = None
        self._status = None
        self._latency_ms = None
        self._request_id = None

    @property
    def request_timestamp(self):
        """
        **[Required]** Gets the request_timestamp of this InferenceInvocationSummary.
        Timestamp recorded for the inference request event.


        :return: The request_timestamp of this InferenceInvocationSummary.
        :rtype: datetime
        """
        return self._request_timestamp

    @request_timestamp.setter
    def request_timestamp(self, request_timestamp):
        """
        Sets the request_timestamp of this InferenceInvocationSummary.
        Timestamp recorded for the inference request event.


        :param request_timestamp: The request_timestamp of this InferenceInvocationSummary.
        :type: datetime
        """
        self._request_timestamp = request_timestamp

    @property
    def request_uri(self):
        """
        **[Required]** Gets the request_uri of this InferenceInvocationSummary.
        Inference endpoint URI.


        :return: The request_uri of this InferenceInvocationSummary.
        :rtype: str
        """
        return self._request_uri

    @request_uri.setter
    def request_uri(self, request_uri):
        """
        Sets the request_uri of this InferenceInvocationSummary.
        Inference endpoint URI.


        :param request_uri: The request_uri of this InferenceInvocationSummary.
        :type: str
        """
        self._request_uri = request_uri

    @property
    def model_version(self):
        """
        Gets the model_version of this InferenceInvocationSummary.
        Model version associated with the invocation.


        :return: The model_version of this InferenceInvocationSummary.
        :rtype: str
        """
        return self._model_version

    @model_version.setter
    def model_version(self, model_version):
        """
        Sets the model_version of this InferenceInvocationSummary.
        Model version associated with the invocation.


        :param model_version: The model_version of this InferenceInvocationSummary.
        :type: str
        """
        self._model_version = model_version

    @property
    def status(self):
        """
        **[Required]** Gets the status of this InferenceInvocationSummary.
        Status derived from the correlated inference response event.

        Allowed values for this property are: "SUCCESS", "MALFORMED", "FAILED", "UNKNOWN", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The status of this InferenceInvocationSummary.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """
        Sets the status of this InferenceInvocationSummary.
        Status derived from the correlated inference response event.


        :param status: The status of this InferenceInvocationSummary.
        :type: str
        """
        allowed_values = ["SUCCESS", "MALFORMED", "FAILED", "UNKNOWN"]
        if not value_allowed_none_or_none_sentinel(status, allowed_values):
            status = 'UNKNOWN_ENUM_VALUE'
        self._status = status

    @property
    def latency_ms(self):
        """
        Gets the latency_ms of this InferenceInvocationSummary.
        Response latency in milliseconds.


        :return: The latency_ms of this InferenceInvocationSummary.
        :rtype: int
        """
        return self._latency_ms

    @latency_ms.setter
    def latency_ms(self, latency_ms):
        """
        Sets the latency_ms of this InferenceInvocationSummary.
        Response latency in milliseconds.


        :param latency_ms: The latency_ms of this InferenceInvocationSummary.
        :type: int
        """
        self._latency_ms = latency_ms

    @property
    def request_id(self):
        """
        **[Required]** Gets the request_id of this InferenceInvocationSummary.
        Request ID of the inference invocation, used to correlate the request and response events. Pass this value to the get inference details operation.


        :return: The request_id of this InferenceInvocationSummary.
        :rtype: str
        """
        return self._request_id

    @request_id.setter
    def request_id(self, request_id):
        """
        Sets the request_id of this InferenceInvocationSummary.
        Request ID of the inference invocation, used to correlate the request and response events. Pass this value to the get inference details operation.


        :param request_id: The request_id of this InferenceInvocationSummary.
        :type: str
        """
        self._request_id = request_id

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
