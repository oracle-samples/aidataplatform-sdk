# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AgentFlowSessionMetricsRange(object):
    """
    Time range and granularity used for Metrics time-series data
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AgentFlowSessionMetricsRange object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param time_begin:
            The value to assign to the time_begin property of this AgentFlowSessionMetricsRange.
        :type time_begin: datetime

        :param time_end:
            The value to assign to the time_end property of this AgentFlowSessionMetricsRange.
        :type time_end: datetime

        :param granularity:
            The value to assign to the granularity property of this AgentFlowSessionMetricsRange.
        :type granularity: str

        :param timezone:
            The value to assign to the timezone property of this AgentFlowSessionMetricsRange.
        :type timezone: str

        """
        self.swagger_types = {
            'time_begin': 'datetime',
            'time_end': 'datetime',
            'granularity': 'str',
            'timezone': 'str'
        }

        self.attribute_map = {
            'time_begin': 'timeBegin',
            'time_end': 'timeEnd',
            'granularity': 'granularity',
            'timezone': 'timezone'
        }

        self._time_begin = None
        self._time_end = None
        self._granularity = None
        self._timezone = None

    @property
    def time_begin(self):
        """
        **[Required]** Gets the time_begin of this AgentFlowSessionMetricsRange.
        Start time for Metrics data


        :return: The time_begin of this AgentFlowSessionMetricsRange.
        :rtype: datetime
        """
        return self._time_begin

    @time_begin.setter
    def time_begin(self, time_begin):
        """
        Sets the time_begin of this AgentFlowSessionMetricsRange.
        Start time for Metrics data


        :param time_begin: The time_begin of this AgentFlowSessionMetricsRange.
        :type: datetime
        """
        self._time_begin = time_begin

    @property
    def time_end(self):
        """
        **[Required]** Gets the time_end of this AgentFlowSessionMetricsRange.
        End time for Metrics data


        :return: The time_end of this AgentFlowSessionMetricsRange.
        :rtype: datetime
        """
        return self._time_end

    @time_end.setter
    def time_end(self, time_end):
        """
        Sets the time_end of this AgentFlowSessionMetricsRange.
        End time for Metrics data


        :param time_end: The time_end of this AgentFlowSessionMetricsRange.
        :type: datetime
        """
        self._time_end = time_end

    @property
    def granularity(self):
        """
        **[Required]** Gets the granularity of this AgentFlowSessionMetricsRange.
        Granularity within the selected time range


        :return: The granularity of this AgentFlowSessionMetricsRange.
        :rtype: str
        """
        return self._granularity

    @granularity.setter
    def granularity(self, granularity):
        """
        Sets the granularity of this AgentFlowSessionMetricsRange.
        Granularity within the selected time range


        :param granularity: The granularity of this AgentFlowSessionMetricsRange.
        :type: str
        """
        self._granularity = granularity

    @property
    def timezone(self):
        """
        **[Required]** Gets the timezone of this AgentFlowSessionMetricsRange.
        Time zone used for metrics data


        :return: The timezone of this AgentFlowSessionMetricsRange.
        :rtype: str
        """
        return self._timezone

    @timezone.setter
    def timezone(self, timezone):
        """
        Sets the timezone of this AgentFlowSessionMetricsRange.
        Time zone used for metrics data


        :param timezone: The timezone of this AgentFlowSessionMetricsRange.
        :type: str
        """
        self._timezone = timezone

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
