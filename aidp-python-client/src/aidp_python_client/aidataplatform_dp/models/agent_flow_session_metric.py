# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AgentFlowSessionMetric(object):
    """
    Session Metrics data for a agentFlow.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AgentFlowSessionMetric object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param total_sessions:
            The value to assign to the total_sessions property of this AgentFlowSessionMetric.
        :type total_sessions: int

        :param successful_sessions:
            The value to assign to the successful_sessions property of this AgentFlowSessionMetric.
        :type successful_sessions: int

        :param failed_sessions:
            The value to assign to the failed_sessions property of this AgentFlowSessionMetric.
        :type failed_sessions: int

        :param total_token_usage:
            The value to assign to the total_token_usage property of this AgentFlowSessionMetric.
        :type total_token_usage: int

        :param total_input_token_count:
            The value to assign to the total_input_token_count property of this AgentFlowSessionMetric.
        :type total_input_token_count: int

        :param total_output_token_count:
            The value to assign to the total_output_token_count property of this AgentFlowSessionMetric.
        :type total_output_token_count: int

        :param avg_total_token:
            The value to assign to the avg_total_token property of this AgentFlowSessionMetric.
        :type avg_total_token: float

        :param avg_input_token:
            The value to assign to the avg_input_token property of this AgentFlowSessionMetric.
        :type avg_input_token: float

        :param avg_output_token:
            The value to assign to the avg_output_token property of this AgentFlowSessionMetric.
        :type avg_output_token: float

        :param avg_session_duration:
            The value to assign to the avg_session_duration property of this AgentFlowSessionMetric.
        :type avg_session_duration: float

        :param min_session_duration:
            The value to assign to the min_session_duration property of this AgentFlowSessionMetric.
        :type min_session_duration: float

        :param max_session_duration:
            The value to assign to the max_session_duration property of this AgentFlowSessionMetric.
        :type max_session_duration: float

        :param session_duration_p50:
            The value to assign to the session_duration_p50 property of this AgentFlowSessionMetric.
        :type session_duration_p50: float

        :param session_duration_p95:
            The value to assign to the session_duration_p95 property of this AgentFlowSessionMetric.
        :type session_duration_p95: float

        :param avg_session_latency:
            The value to assign to the avg_session_latency property of this AgentFlowSessionMetric.
        :type avg_session_latency: float

        :param min_session_latency:
            The value to assign to the min_session_latency property of this AgentFlowSessionMetric.
        :type min_session_latency: float

        :param max_session_latency:
            The value to assign to the max_session_latency property of this AgentFlowSessionMetric.
        :type max_session_latency: float

        :param session_latency_p50:
            The value to assign to the session_latency_p50 property of this AgentFlowSessionMetric.
        :type session_latency_p50: float

        :param session_latency_p95:
            The value to assign to the session_latency_p95 property of this AgentFlowSessionMetric.
        :type session_latency_p95: float

        :param total_session_requests:
            The value to assign to the total_session_requests property of this AgentFlowSessionMetric.
        :type total_session_requests: int

        :param successful_session_requests:
            The value to assign to the successful_session_requests property of this AgentFlowSessionMetric.
        :type successful_session_requests: int

        :param failed_session_requests:
            The value to assign to the failed_session_requests property of this AgentFlowSessionMetric.
        :type failed_session_requests: int

        :param total_error_count:
            The value to assign to the total_error_count property of this AgentFlowSessionMetric.
        :type total_error_count: int

        :param user_error_count:
            The value to assign to the user_error_count property of this AgentFlowSessionMetric.
        :type user_error_count: int

        :param system_error_count:
            The value to assign to the system_error_count property of this AgentFlowSessionMetric.
        :type system_error_count: int

        :param range:
            The value to assign to the range property of this AgentFlowSessionMetric.
        :type range: oci.aidataplatform_dp.models.AgentFlowSessionMetricsRange

        :param data_points:
            The value to assign to the data_points property of this AgentFlowSessionMetric.
        :type data_points: list[oci.aidataplatform_dp.models.KeyedTimeSeries]

        """
        self.swagger_types = {
            'total_sessions': 'int',
            'successful_sessions': 'int',
            'failed_sessions': 'int',
            'total_token_usage': 'int',
            'total_input_token_count': 'int',
            'total_output_token_count': 'int',
            'avg_total_token': 'float',
            'avg_input_token': 'float',
            'avg_output_token': 'float',
            'avg_session_duration': 'float',
            'min_session_duration': 'float',
            'max_session_duration': 'float',
            'session_duration_p50': 'float',
            'session_duration_p95': 'float',
            'avg_session_latency': 'float',
            'min_session_latency': 'float',
            'max_session_latency': 'float',
            'session_latency_p50': 'float',
            'session_latency_p95': 'float',
            'total_session_requests': 'int',
            'successful_session_requests': 'int',
            'failed_session_requests': 'int',
            'total_error_count': 'int',
            'user_error_count': 'int',
            'system_error_count': 'int',
            'range': 'AgentFlowSessionMetricsRange',
            'data_points': 'list[KeyedTimeSeries]'
        }

        self.attribute_map = {
            'total_sessions': 'totalSessions',
            'successful_sessions': 'successfulSessions',
            'failed_sessions': 'failedSessions',
            'total_token_usage': 'totalTokenUsage',
            'total_input_token_count': 'totalInputTokenCount',
            'total_output_token_count': 'totalOutputTokenCount',
            'avg_total_token': 'avgTotalToken',
            'avg_input_token': 'avgInputToken',
            'avg_output_token': 'avgOutputToken',
            'avg_session_duration': 'avgSessionDuration',
            'min_session_duration': 'minSessionDuration',
            'max_session_duration': 'maxSessionDuration',
            'session_duration_p50': 'sessionDurationP50',
            'session_duration_p95': 'sessionDurationP95',
            'avg_session_latency': 'avgSessionLatency',
            'min_session_latency': 'minSessionLatency',
            'max_session_latency': 'maxSessionLatency',
            'session_latency_p50': 'sessionLatencyP50',
            'session_latency_p95': 'sessionLatencyP95',
            'total_session_requests': 'totalSessionRequests',
            'successful_session_requests': 'successfulSessionRequests',
            'failed_session_requests': 'failedSessionRequests',
            'total_error_count': 'totalErrorCount',
            'user_error_count': 'userErrorCount',
            'system_error_count': 'systemErrorCount',
            'range': 'range',
            'data_points': 'dataPoints'
        }

        self._total_sessions = None
        self._successful_sessions = None
        self._failed_sessions = None
        self._total_token_usage = None
        self._total_input_token_count = None
        self._total_output_token_count = None
        self._avg_total_token = None
        self._avg_input_token = None
        self._avg_output_token = None
        self._avg_session_duration = None
        self._min_session_duration = None
        self._max_session_duration = None
        self._session_duration_p50 = None
        self._session_duration_p95 = None
        self._avg_session_latency = None
        self._min_session_latency = None
        self._max_session_latency = None
        self._session_latency_p50 = None
        self._session_latency_p95 = None
        self._total_session_requests = None
        self._successful_session_requests = None
        self._failed_session_requests = None
        self._total_error_count = None
        self._user_error_count = None
        self._system_error_count = None
        self._range = None
        self._data_points = None

    @property
    def total_sessions(self):
        """
        **[Required]** Gets the total_sessions of this AgentFlowSessionMetric.
        The total number of sessions for the agent flow


        :return: The total_sessions of this AgentFlowSessionMetric.
        :rtype: int
        """
        return self._total_sessions

    @total_sessions.setter
    def total_sessions(self, total_sessions):
        """
        Sets the total_sessions of this AgentFlowSessionMetric.
        The total number of sessions for the agent flow


        :param total_sessions: The total_sessions of this AgentFlowSessionMetric.
        :type: int
        """
        self._total_sessions = total_sessions

    @property
    def successful_sessions(self):
        """
        **[Required]** Gets the successful_sessions of this AgentFlowSessionMetric.
        The number of successful sessions for the agent flow


        :return: The successful_sessions of this AgentFlowSessionMetric.
        :rtype: int
        """
        return self._successful_sessions

    @successful_sessions.setter
    def successful_sessions(self, successful_sessions):
        """
        Sets the successful_sessions of this AgentFlowSessionMetric.
        The number of successful sessions for the agent flow


        :param successful_sessions: The successful_sessions of this AgentFlowSessionMetric.
        :type: int
        """
        self._successful_sessions = successful_sessions

    @property
    def failed_sessions(self):
        """
        **[Required]** Gets the failed_sessions of this AgentFlowSessionMetric.
        The number of failed sessions for the agent flow


        :return: The failed_sessions of this AgentFlowSessionMetric.
        :rtype: int
        """
        return self._failed_sessions

    @failed_sessions.setter
    def failed_sessions(self, failed_sessions):
        """
        Sets the failed_sessions of this AgentFlowSessionMetric.
        The number of failed sessions for the agent flow


        :param failed_sessions: The failed_sessions of this AgentFlowSessionMetric.
        :type: int
        """
        self._failed_sessions = failed_sessions

    @property
    def total_token_usage(self):
        """
        Gets the total_token_usage of this AgentFlowSessionMetric.
        The total token usage for all sessions


        :return: The total_token_usage of this AgentFlowSessionMetric.
        :rtype: int
        """
        return self._total_token_usage

    @total_token_usage.setter
    def total_token_usage(self, total_token_usage):
        """
        Sets the total_token_usage of this AgentFlowSessionMetric.
        The total token usage for all sessions


        :param total_token_usage: The total_token_usage of this AgentFlowSessionMetric.
        :type: int
        """
        self._total_token_usage = total_token_usage

    @property
    def total_input_token_count(self):
        """
        Gets the total_input_token_count of this AgentFlowSessionMetric.
        The total input token usage count


        :return: The total_input_token_count of this AgentFlowSessionMetric.
        :rtype: int
        """
        return self._total_input_token_count

    @total_input_token_count.setter
    def total_input_token_count(self, total_input_token_count):
        """
        Sets the total_input_token_count of this AgentFlowSessionMetric.
        The total input token usage count


        :param total_input_token_count: The total_input_token_count of this AgentFlowSessionMetric.
        :type: int
        """
        self._total_input_token_count = total_input_token_count

    @property
    def total_output_token_count(self):
        """
        Gets the total_output_token_count of this AgentFlowSessionMetric.
        The total input token usage count


        :return: The total_output_token_count of this AgentFlowSessionMetric.
        :rtype: int
        """
        return self._total_output_token_count

    @total_output_token_count.setter
    def total_output_token_count(self, total_output_token_count):
        """
        Sets the total_output_token_count of this AgentFlowSessionMetric.
        The total input token usage count


        :param total_output_token_count: The total_output_token_count of this AgentFlowSessionMetric.
        :type: int
        """
        self._total_output_token_count = total_output_token_count

    @property
    def avg_total_token(self):
        """
        Gets the avg_total_token of this AgentFlowSessionMetric.
        The average total token usage by session


        :return: The avg_total_token of this AgentFlowSessionMetric.
        :rtype: float
        """
        return self._avg_total_token

    @avg_total_token.setter
    def avg_total_token(self, avg_total_token):
        """
        Sets the avg_total_token of this AgentFlowSessionMetric.
        The average total token usage by session


        :param avg_total_token: The avg_total_token of this AgentFlowSessionMetric.
        :type: float
        """
        self._avg_total_token = avg_total_token

    @property
    def avg_input_token(self):
        """
        Gets the avg_input_token of this AgentFlowSessionMetric.
        The average input token usage by session


        :return: The avg_input_token of this AgentFlowSessionMetric.
        :rtype: float
        """
        return self._avg_input_token

    @avg_input_token.setter
    def avg_input_token(self, avg_input_token):
        """
        Sets the avg_input_token of this AgentFlowSessionMetric.
        The average input token usage by session


        :param avg_input_token: The avg_input_token of this AgentFlowSessionMetric.
        :type: float
        """
        self._avg_input_token = avg_input_token

    @property
    def avg_output_token(self):
        """
        Gets the avg_output_token of this AgentFlowSessionMetric.
        The average output token usage by session


        :return: The avg_output_token of this AgentFlowSessionMetric.
        :rtype: float
        """
        return self._avg_output_token

    @avg_output_token.setter
    def avg_output_token(self, avg_output_token):
        """
        Sets the avg_output_token of this AgentFlowSessionMetric.
        The average output token usage by session


        :param avg_output_token: The avg_output_token of this AgentFlowSessionMetric.
        :type: float
        """
        self._avg_output_token = avg_output_token

    @property
    def avg_session_duration(self):
        """
        Gets the avg_session_duration of this AgentFlowSessionMetric.
        The average duration of sessions


        :return: The avg_session_duration of this AgentFlowSessionMetric.
        :rtype: float
        """
        return self._avg_session_duration

    @avg_session_duration.setter
    def avg_session_duration(self, avg_session_duration):
        """
        Sets the avg_session_duration of this AgentFlowSessionMetric.
        The average duration of sessions


        :param avg_session_duration: The avg_session_duration of this AgentFlowSessionMetric.
        :type: float
        """
        self._avg_session_duration = avg_session_duration

    @property
    def min_session_duration(self):
        """
        Gets the min_session_duration of this AgentFlowSessionMetric.
        The min duration of sessions


        :return: The min_session_duration of this AgentFlowSessionMetric.
        :rtype: float
        """
        return self._min_session_duration

    @min_session_duration.setter
    def min_session_duration(self, min_session_duration):
        """
        Sets the min_session_duration of this AgentFlowSessionMetric.
        The min duration of sessions


        :param min_session_duration: The min_session_duration of this AgentFlowSessionMetric.
        :type: float
        """
        self._min_session_duration = min_session_duration

    @property
    def max_session_duration(self):
        """
        Gets the max_session_duration of this AgentFlowSessionMetric.
        The max duration of sessions


        :return: The max_session_duration of this AgentFlowSessionMetric.
        :rtype: float
        """
        return self._max_session_duration

    @max_session_duration.setter
    def max_session_duration(self, max_session_duration):
        """
        Sets the max_session_duration of this AgentFlowSessionMetric.
        The max duration of sessions


        :param max_session_duration: The max_session_duration of this AgentFlowSessionMetric.
        :type: float
        """
        self._max_session_duration = max_session_duration

    @property
    def session_duration_p50(self):
        """
        Gets the session_duration_p50 of this AgentFlowSessionMetric.
        The 50th percentile duration of sessions


        :return: The session_duration_p50 of this AgentFlowSessionMetric.
        :rtype: float
        """
        return self._session_duration_p50

    @session_duration_p50.setter
    def session_duration_p50(self, session_duration_p50):
        """
        Sets the session_duration_p50 of this AgentFlowSessionMetric.
        The 50th percentile duration of sessions


        :param session_duration_p50: The session_duration_p50 of this AgentFlowSessionMetric.
        :type: float
        """
        self._session_duration_p50 = session_duration_p50

    @property
    def session_duration_p95(self):
        """
        Gets the session_duration_p95 of this AgentFlowSessionMetric.
        The 95th percentile duration of sessions


        :return: The session_duration_p95 of this AgentFlowSessionMetric.
        :rtype: float
        """
        return self._session_duration_p95

    @session_duration_p95.setter
    def session_duration_p95(self, session_duration_p95):
        """
        Sets the session_duration_p95 of this AgentFlowSessionMetric.
        The 95th percentile duration of sessions


        :param session_duration_p95: The session_duration_p95 of this AgentFlowSessionMetric.
        :type: float
        """
        self._session_duration_p95 = session_duration_p95

    @property
    def avg_session_latency(self):
        """
        Gets the avg_session_latency of this AgentFlowSessionMetric.
        The average Latency of sessions


        :return: The avg_session_latency of this AgentFlowSessionMetric.
        :rtype: float
        """
        return self._avg_session_latency

    @avg_session_latency.setter
    def avg_session_latency(self, avg_session_latency):
        """
        Sets the avg_session_latency of this AgentFlowSessionMetric.
        The average Latency of sessions


        :param avg_session_latency: The avg_session_latency of this AgentFlowSessionMetric.
        :type: float
        """
        self._avg_session_latency = avg_session_latency

    @property
    def min_session_latency(self):
        """
        Gets the min_session_latency of this AgentFlowSessionMetric.
        The min Latency of sessions


        :return: The min_session_latency of this AgentFlowSessionMetric.
        :rtype: float
        """
        return self._min_session_latency

    @min_session_latency.setter
    def min_session_latency(self, min_session_latency):
        """
        Sets the min_session_latency of this AgentFlowSessionMetric.
        The min Latency of sessions


        :param min_session_latency: The min_session_latency of this AgentFlowSessionMetric.
        :type: float
        """
        self._min_session_latency = min_session_latency

    @property
    def max_session_latency(self):
        """
        Gets the max_session_latency of this AgentFlowSessionMetric.
        The max Latency of sessions


        :return: The max_session_latency of this AgentFlowSessionMetric.
        :rtype: float
        """
        return self._max_session_latency

    @max_session_latency.setter
    def max_session_latency(self, max_session_latency):
        """
        Sets the max_session_latency of this AgentFlowSessionMetric.
        The max Latency of sessions


        :param max_session_latency: The max_session_latency of this AgentFlowSessionMetric.
        :type: float
        """
        self._max_session_latency = max_session_latency

    @property
    def session_latency_p50(self):
        """
        Gets the session_latency_p50 of this AgentFlowSessionMetric.
        The 50th percentile Latency of sessions


        :return: The session_latency_p50 of this AgentFlowSessionMetric.
        :rtype: float
        """
        return self._session_latency_p50

    @session_latency_p50.setter
    def session_latency_p50(self, session_latency_p50):
        """
        Sets the session_latency_p50 of this AgentFlowSessionMetric.
        The 50th percentile Latency of sessions


        :param session_latency_p50: The session_latency_p50 of this AgentFlowSessionMetric.
        :type: float
        """
        self._session_latency_p50 = session_latency_p50

    @property
    def session_latency_p95(self):
        """
        Gets the session_latency_p95 of this AgentFlowSessionMetric.
        The 95th percentile Latency of sessions


        :return: The session_latency_p95 of this AgentFlowSessionMetric.
        :rtype: float
        """
        return self._session_latency_p95

    @session_latency_p95.setter
    def session_latency_p95(self, session_latency_p95):
        """
        Sets the session_latency_p95 of this AgentFlowSessionMetric.
        The 95th percentile Latency of sessions


        :param session_latency_p95: The session_latency_p95 of this AgentFlowSessionMetric.
        :type: float
        """
        self._session_latency_p95 = session_latency_p95

    @property
    def total_session_requests(self):
        """
        Gets the total_session_requests of this AgentFlowSessionMetric.
        The total requests for all sessions


        :return: The total_session_requests of this AgentFlowSessionMetric.
        :rtype: int
        """
        return self._total_session_requests

    @total_session_requests.setter
    def total_session_requests(self, total_session_requests):
        """
        Sets the total_session_requests of this AgentFlowSessionMetric.
        The total requests for all sessions


        :param total_session_requests: The total_session_requests of this AgentFlowSessionMetric.
        :type: int
        """
        self._total_session_requests = total_session_requests

    @property
    def successful_session_requests(self):
        """
        Gets the successful_session_requests of this AgentFlowSessionMetric.
        The successful requests for all sessions


        :return: The successful_session_requests of this AgentFlowSessionMetric.
        :rtype: int
        """
        return self._successful_session_requests

    @successful_session_requests.setter
    def successful_session_requests(self, successful_session_requests):
        """
        Sets the successful_session_requests of this AgentFlowSessionMetric.
        The successful requests for all sessions


        :param successful_session_requests: The successful_session_requests of this AgentFlowSessionMetric.
        :type: int
        """
        self._successful_session_requests = successful_session_requests

    @property
    def failed_session_requests(self):
        """
        Gets the failed_session_requests of this AgentFlowSessionMetric.
        The failed requests for all sessions


        :return: The failed_session_requests of this AgentFlowSessionMetric.
        :rtype: int
        """
        return self._failed_session_requests

    @failed_session_requests.setter
    def failed_session_requests(self, failed_session_requests):
        """
        Sets the failed_session_requests of this AgentFlowSessionMetric.
        The failed requests for all sessions


        :param failed_session_requests: The failed_session_requests of this AgentFlowSessionMetric.
        :type: int
        """
        self._failed_session_requests = failed_session_requests

    @property
    def total_error_count(self):
        """
        Gets the total_error_count of this AgentFlowSessionMetric.
        The total error count for all sessions


        :return: The total_error_count of this AgentFlowSessionMetric.
        :rtype: int
        """
        return self._total_error_count

    @total_error_count.setter
    def total_error_count(self, total_error_count):
        """
        Sets the total_error_count of this AgentFlowSessionMetric.
        The total error count for all sessions


        :param total_error_count: The total_error_count of this AgentFlowSessionMetric.
        :type: int
        """
        self._total_error_count = total_error_count

    @property
    def user_error_count(self):
        """
        Gets the user_error_count of this AgentFlowSessionMetric.
        The user error count


        :return: The user_error_count of this AgentFlowSessionMetric.
        :rtype: int
        """
        return self._user_error_count

    @user_error_count.setter
    def user_error_count(self, user_error_count):
        """
        Sets the user_error_count of this AgentFlowSessionMetric.
        The user error count


        :param user_error_count: The user_error_count of this AgentFlowSessionMetric.
        :type: int
        """
        self._user_error_count = user_error_count

    @property
    def system_error_count(self):
        """
        Gets the system_error_count of this AgentFlowSessionMetric.
        The system error count


        :return: The system_error_count of this AgentFlowSessionMetric.
        :rtype: int
        """
        return self._system_error_count

    @system_error_count.setter
    def system_error_count(self, system_error_count):
        """
        Sets the system_error_count of this AgentFlowSessionMetric.
        The system error count


        :param system_error_count: The system_error_count of this AgentFlowSessionMetric.
        :type: int
        """
        self._system_error_count = system_error_count

    @property
    def range(self):
        """
        Gets the range of this AgentFlowSessionMetric.

        :return: The range of this AgentFlowSessionMetric.
        :rtype: oci.aidataplatform_dp.models.AgentFlowSessionMetricsRange
        """
        return self._range

    @range.setter
    def range(self, range):
        """
        Sets the range of this AgentFlowSessionMetric.

        :param range: The range of this AgentFlowSessionMetric.
        :type: oci.aidataplatform_dp.models.AgentFlowSessionMetricsRange
        """
        self._range = range

    @property
    def data_points(self):
        """
        Gets the data_points of this AgentFlowSessionMetric.
        Ordered list of time-series. Each entry is keyed by the same name as the KPI it represents.


        :return: The data_points of this AgentFlowSessionMetric.
        :rtype: list[oci.aidataplatform_dp.models.KeyedTimeSeries]
        """
        return self._data_points

    @data_points.setter
    def data_points(self, data_points):
        """
        Sets the data_points of this AgentFlowSessionMetric.
        Ordered list of time-series. Each entry is keyed by the same name as the KPI it represents.


        :param data_points: The data_points of this AgentFlowSessionMetric.
        :type: list[oci.aidataplatform_dp.models.KeyedTimeSeries]
        """
        self._data_points = data_points

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
