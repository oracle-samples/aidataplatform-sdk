# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AggregatedDataPoint(object):
    """
    A single aggregated data point.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AggregatedDataPoint object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param timestamp:
            The value to assign to the timestamp property of this AggregatedDataPoint.
        :type timestamp: datetime

        :param value:
            The value to assign to the value property of this AggregatedDataPoint.
        :type value: float

        """
        self.swagger_types = {
            'timestamp': 'datetime',
            'value': 'float'
        }

        self.attribute_map = {
            'timestamp': 'timestamp',
            'value': 'value'
        }

        self._timestamp = None
        self._value = None

    @property
    def timestamp(self):
        """
        **[Required]** Gets the timestamp of this AggregatedDataPoint.
        The timestamp of the aggregated data point.


        :return: The timestamp of this AggregatedDataPoint.
        :rtype: datetime
        """
        return self._timestamp

    @timestamp.setter
    def timestamp(self, timestamp):
        """
        Sets the timestamp of this AggregatedDataPoint.
        The timestamp of the aggregated data point.


        :param timestamp: The timestamp of this AggregatedDataPoint.
        :type: datetime
        """
        self._timestamp = timestamp

    @property
    def value(self):
        """
        **[Required]** Gets the value of this AggregatedDataPoint.
        The computed metric value at the given timestamp.


        :return: The value of this AggregatedDataPoint.
        :rtype: float
        """
        return self._value

    @value.setter
    def value(self, value):
        """
        Sets the value of this AggregatedDataPoint.
        The computed metric value at the given timestamp.


        :param value: The value of this AggregatedDataPoint.
        :type: float
        """
        self._value = value

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
