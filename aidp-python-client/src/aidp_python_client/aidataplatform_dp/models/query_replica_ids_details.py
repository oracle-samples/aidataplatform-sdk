# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class QueryReplicaIdsDetails(object):
    """
    Request payload for querying compute replica identifiers from metric data.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new QueryReplicaIdsDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param metric_name:
            The value to assign to the metric_name property of this QueryReplicaIdsDetails.
        :type metric_name: str

        :param time_begin:
            The value to assign to the time_begin property of this QueryReplicaIdsDetails.
        :type time_begin: datetime

        :param time_end:
            The value to assign to the time_end property of this QueryReplicaIdsDetails.
        :type time_end: datetime

        """
        self.swagger_types = {
            'metric_name': 'str',
            'time_begin': 'datetime',
            'time_end': 'datetime'
        }

        self.attribute_map = {
            'metric_name': 'metricName',
            'time_begin': 'timeBegin',
            'time_end': 'timeEnd'
        }

        self._metric_name = None
        self._time_begin = None
        self._time_end = None

    @property
    def metric_name(self):
        """
        **[Required]** Gets the metric_name of this QueryReplicaIdsDetails.
        The metric to use when discovering replica identifiers for the selected compute cluster.


        :return: The metric_name of this QueryReplicaIdsDetails.
        :rtype: str
        """
        return self._metric_name

    @metric_name.setter
    def metric_name(self, metric_name):
        """
        Sets the metric_name of this QueryReplicaIdsDetails.
        The metric to use when discovering replica identifiers for the selected compute cluster.


        :param metric_name: The metric_name of this QueryReplicaIdsDetails.
        :type: str
        """
        self._metric_name = metric_name

    @property
    def time_begin(self):
        """
        **[Required]** Gets the time_begin of this QueryReplicaIdsDetails.
        The beginning of the time range to use when searching for replica metric data points. Format is RFC 3339.


        :return: The time_begin of this QueryReplicaIdsDetails.
        :rtype: datetime
        """
        return self._time_begin

    @time_begin.setter
    def time_begin(self, time_begin):
        """
        Sets the time_begin of this QueryReplicaIdsDetails.
        The beginning of the time range to use when searching for replica metric data points. Format is RFC 3339.


        :param time_begin: The time_begin of this QueryReplicaIdsDetails.
        :type: datetime
        """
        self._time_begin = time_begin

    @property
    def time_end(self):
        """
        **[Required]** Gets the time_end of this QueryReplicaIdsDetails.
        The end of the time range to use when searching for replica metric data points. Format is RFC 3339.


        :return: The time_end of this QueryReplicaIdsDetails.
        :rtype: datetime
        """
        return self._time_end

    @time_end.setter
    def time_end(self, time_end):
        """
        Sets the time_end of this QueryReplicaIdsDetails.
        The end of the time range to use when searching for replica metric data points. Format is RFC 3339.


        :param time_end: The time_end of this QueryReplicaIdsDetails.
        :type: datetime
        """
        self._time_end = time_end

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
