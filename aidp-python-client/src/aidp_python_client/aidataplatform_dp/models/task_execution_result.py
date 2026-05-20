# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class TaskExecutionResult(object):
    """
    Task run execution result.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new TaskExecutionResult object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param state:
            The value to assign to the state property of this TaskExecutionResult.
        :type state: oci.aidataplatform_dp.models.State

        :param start_time_millis:
            The value to assign to the start_time_millis property of this TaskExecutionResult.
        :type start_time_millis: int

        :param end_time_millis:
            The value to assign to the end_time_millis property of this TaskExecutionResult.
        :type end_time_millis: int

        :param external_id:
            The value to assign to the external_id property of this TaskExecutionResult.
        :type external_id: str

        :param metrics:
            The value to assign to the metrics property of this TaskExecutionResult.
        :type metrics: dict(str, str)

        :param properties:
            The value to assign to the properties property of this TaskExecutionResult.
        :type properties: dict(str, object)

        """
        self.swagger_types = {
            'state': 'State',
            'start_time_millis': 'int',
            'end_time_millis': 'int',
            'external_id': 'str',
            'metrics': 'dict(str, str)',
            'properties': 'dict(str, object)'
        }

        self.attribute_map = {
            'state': 'state',
            'start_time_millis': 'startTimeMillis',
            'end_time_millis': 'endTimeMillis',
            'external_id': 'externalId',
            'metrics': 'metrics',
            'properties': 'properties'
        }

        self._state = None
        self._start_time_millis = None
        self._end_time_millis = None
        self._external_id = None
        self._metrics = None
        self._properties = None

    @property
    def state(self):
        """
        **[Required]** Gets the state of this TaskExecutionResult.

        :return: The state of this TaskExecutionResult.
        :rtype: oci.aidataplatform_dp.models.State
        """
        return self._state

    @state.setter
    def state(self, state):
        """
        Sets the state of this TaskExecutionResult.

        :param state: The state of this TaskExecutionResult.
        :type: oci.aidataplatform_dp.models.State
        """
        self._state = state

    @property
    def start_time_millis(self):
        """
        Gets the start_time_millis of this TaskExecutionResult.
        The time at which the job execution started in epoch milliseconds.


        :return: The start_time_millis of this TaskExecutionResult.
        :rtype: int
        """
        return self._start_time_millis

    @start_time_millis.setter
    def start_time_millis(self, start_time_millis):
        """
        Sets the start_time_millis of this TaskExecutionResult.
        The time at which the job execution started in epoch milliseconds.


        :param start_time_millis: The start_time_millis of this TaskExecutionResult.
        :type: int
        """
        self._start_time_millis = start_time_millis

    @property
    def end_time_millis(self):
        """
        Gets the end_time_millis of this TaskExecutionResult.
        The time at which the job execution started in epoch milliseconds.


        :return: The end_time_millis of this TaskExecutionResult.
        :rtype: int
        """
        return self._end_time_millis

    @end_time_millis.setter
    def end_time_millis(self, end_time_millis):
        """
        Sets the end_time_millis of this TaskExecutionResult.
        The time at which the job execution started in epoch milliseconds.


        :param end_time_millis: The end_time_millis of this TaskExecutionResult.
        :type: int
        """
        self._end_time_millis = end_time_millis

    @property
    def external_id(self):
        """
        Gets the external_id of this TaskExecutionResult.
        The external ID of the task execution.


        :return: The external_id of this TaskExecutionResult.
        :rtype: str
        """
        return self._external_id

    @external_id.setter
    def external_id(self, external_id):
        """
        Sets the external_id of this TaskExecutionResult.
        The external ID of the task execution.


        :param external_id: The external_id of this TaskExecutionResult.
        :type: str
        """
        self._external_id = external_id

    @property
    def metrics(self):
        """
        Gets the metrics of this TaskExecutionResult.
        The metrics of the task execution.


        :return: The metrics of this TaskExecutionResult.
        :rtype: dict(str, str)
        """
        return self._metrics

    @metrics.setter
    def metrics(self, metrics):
        """
        Sets the metrics of this TaskExecutionResult.
        The metrics of the task execution.


        :param metrics: The metrics of this TaskExecutionResult.
        :type: dict(str, str)
        """
        self._metrics = metrics

    @property
    def properties(self):
        """
        Gets the properties of this TaskExecutionResult.
        The properties of the task execution.


        :return: The properties of this TaskExecutionResult.
        :rtype: dict(str, object)
        """
        return self._properties

    @properties.setter
    def properties(self, properties):
        """
        Sets the properties of this TaskExecutionResult.
        The properties of the task execution.


        :param properties: The properties of this TaskExecutionResult.
        :type: dict(str, object)
        """
        self._properties = properties

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
