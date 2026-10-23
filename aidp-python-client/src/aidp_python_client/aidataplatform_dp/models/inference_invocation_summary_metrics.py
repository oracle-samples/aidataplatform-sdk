# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class InferenceInvocationSummaryMetrics(object):
    """
    Aggregate metrics for the correlated invocation rows matching the request filters.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new InferenceInvocationSummaryMetrics object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param total_requests:
            The value to assign to the total_requests property of this InferenceInvocationSummaryMetrics.
        :type total_requests: int

        :param successful_requests:
            The value to assign to the successful_requests property of this InferenceInvocationSummaryMetrics.
        :type successful_requests: int

        :param failed_requests:
            The value to assign to the failed_requests property of this InferenceInvocationSummaryMetrics.
        :type failed_requests: int

        :param success_rate_percent:
            The value to assign to the success_rate_percent property of this InferenceInvocationSummaryMetrics.
        :type success_rate_percent: float

        :param malformed_requests:
            The value to assign to the malformed_requests property of this InferenceInvocationSummaryMetrics.
        :type malformed_requests: int

        :param average_response_time_ms:
            The value to assign to the average_response_time_ms property of this InferenceInvocationSummaryMetrics.
        :type average_response_time_ms: float

        """
        self.swagger_types = {
            'total_requests': 'int',
            'successful_requests': 'int',
            'failed_requests': 'int',
            'success_rate_percent': 'float',
            'malformed_requests': 'int',
            'average_response_time_ms': 'float'
        }
        self.attribute_map = {
            'total_requests': 'totalRequests',
            'successful_requests': 'successfulRequests',
            'failed_requests': 'failedRequests',
            'success_rate_percent': 'successRatePercent',
            'malformed_requests': 'malformedRequests',
            'average_response_time_ms': 'averageResponseTimeMs'
        }
        self._total_requests = None
        self._successful_requests = None
        self._failed_requests = None
        self._success_rate_percent = None
        self._malformed_requests = None
        self._average_response_time_ms = None

    @property
    def total_requests(self):
        """
        **[Required]** Gets the total_requests of this InferenceInvocationSummaryMetrics.
        Total number of correlated inference invocations in the resolved time range.


        :return: The total_requests of this InferenceInvocationSummaryMetrics.
        :rtype: int
        """
        return self._total_requests

    @total_requests.setter
    def total_requests(self, total_requests):
        """
        Sets the total_requests of this InferenceInvocationSummaryMetrics.
        Total number of correlated inference invocations in the resolved time range.


        :param total_requests: The total_requests of this InferenceInvocationSummaryMetrics.
        :type: int
        """
        self._total_requests = total_requests

    @property
    def successful_requests(self):
        """
        **[Required]** Gets the successful_requests of this InferenceInvocationSummaryMetrics.
        Number of correlated invocations whose inference response status is 2xx.


        :return: The successful_requests of this InferenceInvocationSummaryMetrics.
        :rtype: int
        """
        return self._successful_requests

    @successful_requests.setter
    def successful_requests(self, successful_requests):
        """
        Sets the successful_requests of this InferenceInvocationSummaryMetrics.
        Number of correlated invocations whose inference response status is 2xx.


        :param successful_requests: The successful_requests of this InferenceInvocationSummaryMetrics.
        :type: int
        """
        self._successful_requests = successful_requests

    @property
    def failed_requests(self):
        """
        **[Required]** Gets the failed_requests of this InferenceInvocationSummaryMetrics.
        Number of correlated invocations whose inference response status is 5xx.


        :return: The failed_requests of this InferenceInvocationSummaryMetrics.
        :rtype: int
        """
        return self._failed_requests

    @failed_requests.setter
    def failed_requests(self, failed_requests):
        """
        Sets the failed_requests of this InferenceInvocationSummaryMetrics.
        Number of correlated invocations whose inference response status is 5xx.


        :param failed_requests: The failed_requests of this InferenceInvocationSummaryMetrics.
        :type: int
        """
        self._failed_requests = failed_requests

    @property
    def success_rate_percent(self):
        """
        **[Required]** Gets the success_rate_percent of this InferenceInvocationSummaryMetrics.
        Percentage of correlated invocations that succeeded, between 0 and 100.


        :return: The success_rate_percent of this InferenceInvocationSummaryMetrics.
        :rtype: float
        """
        return self._success_rate_percent

    @success_rate_percent.setter
    def success_rate_percent(self, success_rate_percent):
        """
        Sets the success_rate_percent of this InferenceInvocationSummaryMetrics.
        Percentage of correlated invocations that succeeded, between 0 and 100.


        :param success_rate_percent: The success_rate_percent of this InferenceInvocationSummaryMetrics.
        :type: float
        """
        self._success_rate_percent = success_rate_percent

    @property
    def malformed_requests(self):
        """
        **[Required]** Gets the malformed_requests of this InferenceInvocationSummaryMetrics.
        Number of correlated requests whose inference response status is 4xx.


        :return: The malformed_requests of this InferenceInvocationSummaryMetrics.
        :rtype: int
        """
        return self._malformed_requests

    @malformed_requests.setter
    def malformed_requests(self, malformed_requests):
        """
        Sets the malformed_requests of this InferenceInvocationSummaryMetrics.
        Number of correlated requests whose inference response status is 4xx.


        :param malformed_requests: The malformed_requests of this InferenceInvocationSummaryMetrics.
        :type: int
        """
        self._malformed_requests = malformed_requests

    @property
    def average_response_time_ms(self):
        """
        **[Required]** Gets the average_response_time_ms of this InferenceInvocationSummaryMetrics.
        Mean response latency in milliseconds across the correlated invocations.


        :return: The average_response_time_ms of this InferenceInvocationSummaryMetrics.
        :rtype: float
        """
        return self._average_response_time_ms

    @average_response_time_ms.setter
    def average_response_time_ms(self, average_response_time_ms):
        """
        Sets the average_response_time_ms of this InferenceInvocationSummaryMetrics.
        Mean response latency in milliseconds across the correlated invocations.


        :param average_response_time_ms: The average_response_time_ms of this InferenceInvocationSummaryMetrics.
        :type: float
        """
        self._average_response_time_ms = average_response_time_ms

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
