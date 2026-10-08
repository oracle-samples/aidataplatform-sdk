# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AutoScaleConfiguration(object):
    """
    Autoscaling configuration for AI Compute. When the minimum and maximum replica counts differ, at least one metric is required; omitted metric targets are defaulted before the request is sent to Data Flow. The default targets are 10 requests per second for API_REQUESTS_PER_SECOND, 75 percent for CPU_UTILIZATION, and 75 percent for MEMORY_UTILIZATION. An empty object represents fixed compute when the replica counts match.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AutoScaleConfiguration object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param metrics:
            The value to assign to the metrics property of this AutoScaleConfiguration.
        :type metrics: list[oci.aidataplatform_dp.models.AutoScaleMetricConfiguration]

        :param cooldown_period_in_minutes:
            The value to assign to the cooldown_period_in_minutes property of this AutoScaleConfiguration.
        :type cooldown_period_in_minutes: int

        """
        self.swagger_types = {
            'metrics': 'list[AutoScaleMetricConfiguration]',
            'cooldown_period_in_minutes': 'int'
        }

        self.attribute_map = {
            'metrics': 'metrics',
            'cooldown_period_in_minutes': 'cooldownPeriodInMinutes'
        }

        self._metrics = None
        self._cooldown_period_in_minutes = None

    @property
    def metrics(self):
        """
        Gets the metrics of this AutoScaleConfiguration.
        Autoscaling metric targets. At least one request-rate, CPU, or memory metric is required when autoscaling is enabled. API_REQUESTS_PER_SECOND accepts 1-15 requests per second per runtime pod. CPU_UTILIZATION accepts 0-100 percent mean CPU utilization across the replica set. Missing metrics use the defaults documented on AutoScaleConfiguration.


        :return: The metrics of this AutoScaleConfiguration.
        :rtype: list[oci.aidataplatform_dp.models.AutoScaleMetricConfiguration]
        """
        return self._metrics

    @metrics.setter
    def metrics(self, metrics):
        """
        Sets the metrics of this AutoScaleConfiguration.
        Autoscaling metric targets. At least one request-rate, CPU, or memory metric is required when autoscaling is enabled. API_REQUESTS_PER_SECOND accepts 1-15 requests per second per runtime pod. CPU_UTILIZATION accepts 0-100 percent mean CPU utilization across the replica set. Missing metrics use the defaults documented on AutoScaleConfiguration.


        :param metrics: The metrics of this AutoScaleConfiguration.
        :type: list[oci.aidataplatform_dp.models.AutoScaleMetricConfiguration]
        """
        self._metrics = metrics

    @property
    def cooldown_period_in_minutes(self):
        """
        Gets the cooldown_period_in_minutes of this AutoScaleConfiguration.
        Minimum time in minutes between autoscaling actions. API-handler applies this value to both Data Flow stabilization windows.


        :return: The cooldown_period_in_minutes of this AutoScaleConfiguration.
        :rtype: int
        """
        return self._cooldown_period_in_minutes

    @cooldown_period_in_minutes.setter
    def cooldown_period_in_minutes(self, cooldown_period_in_minutes):
        """
        Sets the cooldown_period_in_minutes of this AutoScaleConfiguration.
        Minimum time in minutes between autoscaling actions. API-handler applies this value to both Data Flow stabilization windows.


        :param cooldown_period_in_minutes: The cooldown_period_in_minutes of this AutoScaleConfiguration.
        :type: int
        """
        self._cooldown_period_in_minutes = cooldown_period_in_minutes

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
