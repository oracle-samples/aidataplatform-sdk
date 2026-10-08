# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AutoScaleMetricConfiguration(object):
    """
    Autoscaling metric target for AI Compute.
    """

    #: A constant which can be used with the name property of a AutoScaleMetricConfiguration.
    #: This constant has a value of "API_REQUESTS_PER_SECOND"
    NAME_API_REQUESTS_PER_SECOND = "API_REQUESTS_PER_SECOND"

    #: A constant which can be used with the name property of a AutoScaleMetricConfiguration.
    #: This constant has a value of "CPU_UTILIZATION"
    NAME_CPU_UTILIZATION = "CPU_UTILIZATION"

    #: A constant which can be used with the name property of a AutoScaleMetricConfiguration.
    #: This constant has a value of "MEMORY_UTILIZATION"
    NAME_MEMORY_UTILIZATION = "MEMORY_UTILIZATION"

    def __init__(self, **kwargs):
        """
        Initializes a new AutoScaleMetricConfiguration object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param name:
            The value to assign to the name property of this AutoScaleMetricConfiguration.
            Allowed values for this property are: "API_REQUESTS_PER_SECOND", "CPU_UTILIZATION", "MEMORY_UTILIZATION", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type name: str

        :param target_average_value:
            The value to assign to the target_average_value property of this AutoScaleMetricConfiguration.
        :type target_average_value: str

        """
        self.swagger_types = {
            'name': 'str',
            'target_average_value': 'str'
        }

        self.attribute_map = {
            'name': 'name',
            'target_average_value': 'targetAverageValue'
        }

        self._name = None
        self._target_average_value = None

    @property
    def name(self):
        """
        **[Required]** Gets the name of this AutoScaleMetricConfiguration.
        Metric used to determine whether AI Compute should scale. API_REQUESTS_PER_SECOND measures average request traffic per runtime pod; CPU_UTILIZATION measures mean CPU utilization across the replica set; MEMORY_UTILIZATION measures mean memory utilization across the replica set.

        Allowed values for this property are: "API_REQUESTS_PER_SECOND", "CPU_UTILIZATION", "MEMORY_UTILIZATION", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The name of this AutoScaleMetricConfiguration.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this AutoScaleMetricConfiguration.
        Metric used to determine whether AI Compute should scale. API_REQUESTS_PER_SECOND measures average request traffic per runtime pod; CPU_UTILIZATION measures mean CPU utilization across the replica set; MEMORY_UTILIZATION measures mean memory utilization across the replica set.


        :param name: The name of this AutoScaleMetricConfiguration.
        :type: str
        """
        allowed_values = ["API_REQUESTS_PER_SECOND", "CPU_UTILIZATION", "MEMORY_UTILIZATION"]
        if not value_allowed_none_or_none_sentinel(name, allowed_values):
            name = 'UNKNOWN_ENUM_VALUE'
        self._name = name

    @property
    def target_average_value(self):
        """
        **[Required]** Gets the target_average_value of this AutoScaleMetricConfiguration.
        Target average value for the selected metric. Use requests per second for API_REQUESTS_PER_SECOND (supported range 1-15; default 10 when omitted), and percent for CPU_UTILIZATION and MEMORY_UTILIZATION (supported range 0-100; default 75 when omitted).


        :return: The target_average_value of this AutoScaleMetricConfiguration.
        :rtype: str
        """
        return self._target_average_value

    @target_average_value.setter
    def target_average_value(self, target_average_value):
        """
        Sets the target_average_value of this AutoScaleMetricConfiguration.
        Target average value for the selected metric. Use requests per second for API_REQUESTS_PER_SECOND (supported range 1-15; default 10 when omitted), and percent for CPU_UTILIZATION and MEMORY_UTILIZATION (supported range 0-100; default 75 when omitted).


        :param target_average_value: The target_average_value of this AutoScaleMetricConfiguration.
        :type: str
        """
        self._target_average_value = target_average_value

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
