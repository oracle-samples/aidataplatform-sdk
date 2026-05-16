# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ModelMetric(object):
    """
    Model metric.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ModelMetric object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this ModelMetric.
        :type key: str

        :param value:
            The value to assign to the value property of this ModelMetric.
        :type value: float

        :param timestamp:
            The value to assign to the timestamp property of this ModelMetric.
        :type timestamp: int

        :param step:
            The value to assign to the step property of this ModelMetric.
        :type step: int

        """
        self.swagger_types = {
            'key': 'str',
            'value': 'float',
            'timestamp': 'int',
            'step': 'int'
        }

        self.attribute_map = {
            'key': 'key',
            'value': 'value',
            'timestamp': 'timestamp',
            'step': 'step'
        }

        self._key = None
        self._value = None
        self._timestamp = None
        self._step = None

    @property
    def key(self):
        """
        Gets the key of this ModelMetric.
        Name of the metric


        :return: The key of this ModelMetric.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this ModelMetric.
        Name of the metric


        :param key: The key of this ModelMetric.
        :type: str
        """
        self._key = key

    @property
    def value(self):
        """
        Gets the value of this ModelMetric.
        Value of the metric


        :return: The value of this ModelMetric.
        :rtype: float
        """
        return self._value

    @value.setter
    def value(self, value):
        """
        Sets the value of this ModelMetric.
        Value of the metric


        :param value: The value of this ModelMetric.
        :type: float
        """
        self._value = value

    @property
    def timestamp(self):
        """
        Gets the timestamp of this ModelMetric.
        Unix timestamp in milliseconds when this metric was recorded.


        :return: The timestamp of this ModelMetric.
        :rtype: int
        """
        return self._timestamp

    @timestamp.setter
    def timestamp(self, timestamp):
        """
        Sets the timestamp of this ModelMetric.
        Unix timestamp in milliseconds when this metric was recorded.


        :param timestamp: The timestamp of this ModelMetric.
        :type: int
        """
        self._timestamp = timestamp

    @property
    def step(self):
        """
        Gets the step of this ModelMetric.
        Step at which to log the metric.


        :return: The step of this ModelMetric.
        :rtype: int
        """
        return self._step

    @step.setter
    def step(self, step):
        """
        Sets the step of this ModelMetric.
        Step at which to log the metric.


        :param step: The step of this ModelMetric.
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
