# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class KeyedTimeSeries(object):
    """
    keyed time series
    """

    def __init__(self, **kwargs):
        """
        Initializes a new KeyedTimeSeries object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this KeyedTimeSeries.
        :type key: str

        :param aggregated_time_series_data_points:
            The value to assign to the aggregated_time_series_data_points property of this KeyedTimeSeries.
        :type aggregated_time_series_data_points: list[oci.aidataplatform_dp.models.AggregatedTimeSeriesDataPoint]

        """
        self.swagger_types = {
            'key': 'str',
            'aggregated_time_series_data_points': 'list[AggregatedTimeSeriesDataPoint]'
        }

        self.attribute_map = {
            'key': 'key',
            'aggregated_time_series_data_points': 'aggregatedTimeSeriesDataPoints'
        }

        self._key = None
        self._aggregated_time_series_data_points = None

    @property
    def key(self):
        """
        **[Required]** Gets the key of this KeyedTimeSeries.
        KPI field name (e.g., totalSessions, totalInputTokenCount)


        :return: The key of this KeyedTimeSeries.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this KeyedTimeSeries.
        KPI field name (e.g., totalSessions, totalInputTokenCount)


        :param key: The key of this KeyedTimeSeries.
        :type: str
        """
        self._key = key

    @property
    def aggregated_time_series_data_points(self):
        """
        **[Required]** Gets the aggregated_time_series_data_points of this KeyedTimeSeries.
        aggregated time series data points


        :return: The aggregated_time_series_data_points of this KeyedTimeSeries.
        :rtype: list[oci.aidataplatform_dp.models.AggregatedTimeSeriesDataPoint]
        """
        return self._aggregated_time_series_data_points

    @aggregated_time_series_data_points.setter
    def aggregated_time_series_data_points(self, aggregated_time_series_data_points):
        """
        Sets the aggregated_time_series_data_points of this KeyedTimeSeries.
        aggregated time series data points


        :param aggregated_time_series_data_points: The aggregated_time_series_data_points of this KeyedTimeSeries.
        :type: list[oci.aidataplatform_dp.models.AggregatedTimeSeriesDataPoint]
        """
        self._aggregated_time_series_data_points = aggregated_time_series_data_points

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
