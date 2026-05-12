# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class SummarizeMetricsDataDetails(object):
    """
    Request payload for summarizing compute metrics data.
    """

    #: A constant which can be used with the aggregation_type property of a SummarizeMetricsDataDetails.
    #: This constant has a value of "MAX"
    AGGREGATION_TYPE_MAX = "MAX"

    #: A constant which can be used with the aggregation_type property of a SummarizeMetricsDataDetails.
    #: This constant has a value of "MEAN"
    AGGREGATION_TYPE_MEAN = "MEAN"

    #: A constant which can be used with the aggregation_type property of a SummarizeMetricsDataDetails.
    #: This constant has a value of "MIN"
    AGGREGATION_TYPE_MIN = "MIN"

    #: A constant which can be used with the aggregation_type property of a SummarizeMetricsDataDetails.
    #: This constant has a value of "SUM"
    AGGREGATION_TYPE_SUM = "SUM"

    #: A constant which can be used with the aggregation_type property of a SummarizeMetricsDataDetails.
    #: This constant has a value of "RATE"
    AGGREGATION_TYPE_RATE = "RATE"

    #: A constant which can be used with the aggregation_type property of a SummarizeMetricsDataDetails.
    #: This constant has a value of "P50"
    AGGREGATION_TYPE_P50 = "P50"

    #: A constant which can be used with the aggregation_type property of a SummarizeMetricsDataDetails.
    #: This constant has a value of "P80"
    AGGREGATION_TYPE_P80 = "P80"

    #: A constant which can be used with the aggregation_type property of a SummarizeMetricsDataDetails.
    #: This constant has a value of "P90"
    AGGREGATION_TYPE_P90 = "P90"

    #: A constant which can be used with the aggregation_type property of a SummarizeMetricsDataDetails.
    #: This constant has a value of "P95"
    AGGREGATION_TYPE_P95 = "P95"

    #: A constant which can be used with the aggregation_type property of a SummarizeMetricsDataDetails.
    #: This constant has a value of "P99"
    AGGREGATION_TYPE_P99 = "P99"

    #: A constant which can be used with the aggregation_type property of a SummarizeMetricsDataDetails.
    #: This constant has a value of "P99_9"
    AGGREGATION_TYPE_P99_9 = "P99_9"

    def __init__(self, **kwargs):
        """
        Initializes a new SummarizeMetricsDataDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param aggregation_type:
            The value to assign to the aggregation_type property of this SummarizeMetricsDataDetails.
            Allowed values for this property are: "MAX", "MEAN", "MIN", "SUM", "RATE", "P50", "P80", "P90", "P95", "P99", "P99_9"
        :type aggregation_type: str

        :param metric_name:
            The value to assign to the metric_name property of this SummarizeMetricsDataDetails.
        :type metric_name: str

        :param time_begin:
            The value to assign to the time_begin property of this SummarizeMetricsDataDetails.
        :type time_begin: datetime

        :param time_end:
            The value to assign to the time_end property of this SummarizeMetricsDataDetails.
        :type time_end: datetime

        :param interval:
            The value to assign to the interval property of this SummarizeMetricsDataDetails.
        :type interval: str

        :param resolution:
            The value to assign to the resolution property of this SummarizeMetricsDataDetails.
        :type resolution: str

        """
        self.swagger_types = {
            'aggregation_type': 'str',
            'metric_name': 'str',
            'time_begin': 'datetime',
            'time_end': 'datetime',
            'interval': 'str',
            'resolution': 'str'
        }

        self.attribute_map = {
            'aggregation_type': 'aggregationType',
            'metric_name': 'metricName',
            'time_begin': 'timeBegin',
            'time_end': 'timeEnd',
            'interval': 'interval',
            'resolution': 'resolution'
        }

        self._aggregation_type = None
        self._metric_name = None
        self._time_begin = None
        self._time_end = None
        self._interval = None
        self._resolution = None

    @property
    def aggregation_type(self):
        """
        **[Required]** Gets the aggregation_type of this SummarizeMetricsDataDetails.
        The type of aggregation to apply.
        - Standard Aggregations: `MAX`, `MEAN`, `MIN`, `SUM`, `RATE`.
        - Percentile Aggregation: Use `Pxx`, where `xx` is the percentile value (e.g., `P80` for the 80th percentile).

        Allowed values for this property are: "MAX", "MEAN", "MIN", "SUM", "RATE", "P50", "P80", "P90", "P95", "P99", "P99_9"


        :return: The aggregation_type of this SummarizeMetricsDataDetails.
        :rtype: str
        """
        return self._aggregation_type

    @aggregation_type.setter
    def aggregation_type(self, aggregation_type):
        """
        Sets the aggregation_type of this SummarizeMetricsDataDetails.
        The type of aggregation to apply.
        - Standard Aggregations: `MAX`, `MEAN`, `MIN`, `SUM`, `RATE`.
        - Percentile Aggregation: Use `Pxx`, where `xx` is the percentile value (e.g., `P80` for the 80th percentile).


        :param aggregation_type: The aggregation_type of this SummarizeMetricsDataDetails.
        :type: str
        """
        allowed_values = ["MAX", "MEAN", "MIN", "SUM", "RATE", "P50", "P80", "P90", "P95", "P99", "P99_9"]
        if not value_allowed_none_or_none_sentinel(aggregation_type, allowed_values):
            raise ValueError(
                "Invalid value for `aggregation_type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._aggregation_type = aggregation_type

    @property
    def metric_name(self):
        """
        **[Required]** Gets the metric_name of this SummarizeMetricsDataDetails.
        The metric to summarize.
        - Supported values include but are not limited to:
          - `CPU_UTILIZATION`, `MEMORY_UTILIZATION`, `FILE_SYSTEM_UTILIZATION`, `GC_CPU_UTILIZATION`
          - `DISK_READ_BYTES`, `DISK_WRITE_BYTES`, `NETWORK_RECEIVE_BYTES`, `NETWORK_TRANSMIT_BYTES`
          - `APP_STATUS`, `EXECUTOR_METRICS`, `SYSTEM_CPU`, `SYSTEM_MEMORY`
          - `SYSTEM_NETWORK_IN`, `SYSTEM_NETWORK_OUT`, `SYSTEM_DISK_READ`, `SYSTEM_DISK_WRITE`
          - Additional metrics such as task-related and shuffle metrics may be introduced in the future.
        - Refer to API documentation or contact support for the latest supported metric list.


        :return: The metric_name of this SummarizeMetricsDataDetails.
        :rtype: str
        """
        return self._metric_name

    @metric_name.setter
    def metric_name(self, metric_name):
        """
        Sets the metric_name of this SummarizeMetricsDataDetails.
        The metric to summarize.
        - Supported values include but are not limited to:
          - `CPU_UTILIZATION`, `MEMORY_UTILIZATION`, `FILE_SYSTEM_UTILIZATION`, `GC_CPU_UTILIZATION`
          - `DISK_READ_BYTES`, `DISK_WRITE_BYTES`, `NETWORK_RECEIVE_BYTES`, `NETWORK_TRANSMIT_BYTES`
          - `APP_STATUS`, `EXECUTOR_METRICS`, `SYSTEM_CPU`, `SYSTEM_MEMORY`
          - `SYSTEM_NETWORK_IN`, `SYSTEM_NETWORK_OUT`, `SYSTEM_DISK_READ`, `SYSTEM_DISK_WRITE`
          - Additional metrics such as task-related and shuffle metrics may be introduced in the future.
        - Refer to API documentation or contact support for the latest supported metric list.


        :param metric_name: The metric_name of this SummarizeMetricsDataDetails.
        :type: str
        """
        self._metric_name = metric_name

    @property
    def time_begin(self):
        """
        **[Required]** Gets the time_begin of this SummarizeMetricsDataDetails.
        The beginning of the time range to use when searching for metric data points. Format is RFC 3339.


        :return: The time_begin of this SummarizeMetricsDataDetails.
        :rtype: datetime
        """
        return self._time_begin

    @time_begin.setter
    def time_begin(self, time_begin):
        """
        Sets the time_begin of this SummarizeMetricsDataDetails.
        The beginning of the time range to use when searching for metric data points. Format is RFC 3339.


        :param time_begin: The time_begin of this SummarizeMetricsDataDetails.
        :type: datetime
        """
        self._time_begin = time_begin

    @property
    def time_end(self):
        """
        **[Required]** Gets the time_end of this SummarizeMetricsDataDetails.
        The end of the time range to use when searching for metric data points. Format is RFC 3339.


        :return: The time_end of this SummarizeMetricsDataDetails.
        :rtype: datetime
        """
        return self._time_end

    @time_end.setter
    def time_end(self, time_end):
        """
        Sets the time_end of this SummarizeMetricsDataDetails.
        The end of the time range to use when searching for metric data points. Format is RFC 3339.


        :param time_end: The time_end of this SummarizeMetricsDataDetails.
        :type: datetime
        """
        self._time_end = time_end

    @property
    def interval(self):
        """
        **[Required]** Gets the interval of this SummarizeMetricsDataDetails.
        The time window used to convert the set of raw data points.
        The timestamp of the aggregated data point corresponds to the end of the time window during which raw data points are assessed.
        For example, for a five-minute interval, the timestamp \"2:05\" corresponds to the five-minute time window from 2:00:00 to 2:05:00.


        :return: The interval of this SummarizeMetricsDataDetails.
        :rtype: str
        """
        return self._interval

    @interval.setter
    def interval(self, interval):
        """
        Sets the interval of this SummarizeMetricsDataDetails.
        The time window used to convert the set of raw data points.
        The timestamp of the aggregated data point corresponds to the end of the time window during which raw data points are assessed.
        For example, for a five-minute interval, the timestamp \"2:05\" corresponds to the five-minute time window from 2:00:00 to 2:05:00.


        :param interval: The interval of this SummarizeMetricsDataDetails.
        :type: str
        """
        self._interval = interval

    @property
    def resolution(self):
        """
        Gets the resolution of this SummarizeMetricsDataDetails.
        The time between calculated aggregation windows. Use with the query interval to vary the frequency for returning aggregated data points.
        For example, use a query interval of 5 minutes with a resolution of 1 minute to retrieve five-minute aggregations at a one-minute frequency.
        The resolution must be equal to or less than the interval in the query.
        The default resolution is 1m (one minute).
        Supported values: 1m-60m, 1h-24h, 1d.


        :return: The resolution of this SummarizeMetricsDataDetails.
        :rtype: str
        """
        return self._resolution

    @resolution.setter
    def resolution(self, resolution):
        """
        Sets the resolution of this SummarizeMetricsDataDetails.
        The time between calculated aggregation windows. Use with the query interval to vary the frequency for returning aggregated data points.
        For example, use a query interval of 5 minutes with a resolution of 1 minute to retrieve five-minute aggregations at a one-minute frequency.
        The resolution must be equal to or less than the interval in the query.
        The default resolution is 1m (one minute).
        Supported values: 1m-60m, 1h-24h, 1d.


        :param resolution: The resolution of this SummarizeMetricsDataDetails.
        :type: str
        """
        self._resolution = resolution

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
