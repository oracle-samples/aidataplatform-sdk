# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class LogExperimentRunMetricDetails(object):
    """
    Details of an Experiment Run Metric
    """

    def __init__(self, **kwargs):
        """
        Initializes a new LogExperimentRunMetricDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param run_id:
            The value to assign to the run_id property of this LogExperimentRunMetricDetails.
        :type run_id: str

        :param key:
            The value to assign to the key property of this LogExperimentRunMetricDetails.
        :type key: str

        :param value:
            The value to assign to the value property of this LogExperimentRunMetricDetails.
        :type value: float

        :param timestamp:
            The value to assign to the timestamp property of this LogExperimentRunMetricDetails.
        :type timestamp: int

        :param step:
            The value to assign to the step property of this LogExperimentRunMetricDetails.
        :type step: int

        """
        self.swagger_types = {
            'run_id': 'str',
            'key': 'str',
            'value': 'float',
            'timestamp': 'int',
            'step': 'int'
        }

        self.attribute_map = {
            'run_id': 'run_id',
            'key': 'key',
            'value': 'value',
            'timestamp': 'timestamp',
            'step': 'step'
        }

        self._run_id = None
        self._key = None
        self._value = None
        self._timestamp = None
        self._step = None

    @property
    def run_id(self):
        """
        **[Required]** Gets the run_id of this LogExperimentRunMetricDetails.
        Unique identifier for the run.


        :return: The run_id of this LogExperimentRunMetricDetails.
        :rtype: str
        """
        return self._run_id

    @run_id.setter
    def run_id(self, run_id):
        """
        Sets the run_id of this LogExperimentRunMetricDetails.
        Unique identifier for the run.


        :param run_id: The run_id of this LogExperimentRunMetricDetails.
        :type: str
        """
        self._run_id = run_id

    @property
    def key(self):
        """
        **[Required]** Gets the key of this LogExperimentRunMetricDetails.
        Name of the metric


        :return: The key of this LogExperimentRunMetricDetails.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this LogExperimentRunMetricDetails.
        Name of the metric


        :param key: The key of this LogExperimentRunMetricDetails.
        :type: str
        """
        self._key = key

    @property
    def value(self):
        """
        **[Required]** Gets the value of this LogExperimentRunMetricDetails.
        Value of the metric


        :return: The value of this LogExperimentRunMetricDetails.
        :rtype: float
        """
        return self._value

    @value.setter
    def value(self, value):
        """
        Sets the value of this LogExperimentRunMetricDetails.
        Value of the metric


        :param value: The value of this LogExperimentRunMetricDetails.
        :type: float
        """
        self._value = value

    @property
    def timestamp(self):
        """
        **[Required]** Gets the timestamp of this LogExperimentRunMetricDetails.
        Unix timestamp in milliseconds when this metric being recorded.


        :return: The timestamp of this LogExperimentRunMetricDetails.
        :rtype: int
        """
        return self._timestamp

    @timestamp.setter
    def timestamp(self, timestamp):
        """
        Sets the timestamp of this LogExperimentRunMetricDetails.
        Unix timestamp in milliseconds when this metric being recorded.


        :param timestamp: The timestamp of this LogExperimentRunMetricDetails.
        :type: int
        """
        self._timestamp = timestamp

    @property
    def step(self):
        """
        Gets the step of this LogExperimentRunMetricDetails.
        Step at which to log the metric.


        :return: The step of this LogExperimentRunMetricDetails.
        :rtype: int
        """
        return self._step

    @step.setter
    def step(self, step):
        """
        Sets the step of this LogExperimentRunMetricDetails.
        Step at which to log the metric.


        :param step: The step of this LogExperimentRunMetricDetails.
        :type: int
        """
        self._step = step

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
