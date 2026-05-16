# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class RepairHistory(object):
    """
    A description of a repaired job run.
    """

    #: A constant which can be used with the type property of a RepairHistory.
    #: This constant has a value of "ORIGINAL"
    TYPE_ORIGINAL = "ORIGINAL"

    #: A constant which can be used with the type property of a RepairHistory.
    #: This constant has a value of "REPAIR"
    TYPE_REPAIR = "REPAIR"

    def __init__(self, **kwargs):
        """
        Initializes a new RepairHistory object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this RepairHistory.
            Allowed values for this property are: "ORIGINAL", "REPAIR", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type type: str

        :param key:
            The value to assign to the key property of this RepairHistory.
        :type key: int

        :param state:
            The value to assign to the state property of this RepairHistory.
        :type state: oci.aidataplatform_dp.models.State

        :param start_time:
            The value to assign to the start_time property of this RepairHistory.
        :type start_time: int

        :param end_time:
            The value to assign to the end_time property of this RepairHistory.
        :type end_time: int

        :param task_to_task_run_map:
            The value to assign to the task_to_task_run_map property of this RepairHistory.
        :type task_to_task_run_map: dict(str, str)

        :param parameters:
            The value to assign to the parameters property of this RepairHistory.
        :type parameters: list[oci.aidataplatform_dp.models.Parameter]

        :param repaired_tasks:
            The value to assign to the repaired_tasks property of this RepairHistory.
        :type repaired_tasks: list[str]

        :param lifecycle_states:
            The value to assign to the lifecycle_states property of this RepairHistory.
        :type lifecycle_states: list[oci.aidataplatform_dp.models.LifecycleState]

        :param execution_duration:
            The value to assign to the execution_duration property of this RepairHistory.
        :type execution_duration: int

        """
        self.swagger_types = {
            'type': 'str',
            'key': 'int',
            'state': 'State',
            'start_time': 'int',
            'end_time': 'int',
            'task_to_task_run_map': 'dict(str, str)',
            'parameters': 'list[Parameter]',
            'repaired_tasks': 'list[str]',
            'lifecycle_states': 'list[LifecycleState]',
            'execution_duration': 'int'
        }

        self.attribute_map = {
            'type': 'type',
            'key': 'key',
            'state': 'state',
            'start_time': 'startTime',
            'end_time': 'endTime',
            'task_to_task_run_map': 'taskToTaskRunMap',
            'parameters': 'parameters',
            'repaired_tasks': 'repairedTasks',
            'lifecycle_states': 'lifecycleStates',
            'execution_duration': 'executionDuration'
        }

        self._type = None
        self._key = None
        self._state = None
        self._start_time = None
        self._end_time = None
        self._task_to_task_run_map = None
        self._parameters = None
        self._repaired_tasks = None
        self._lifecycle_states = None
        self._execution_duration = None

    @property
    def type(self):
        """
        Gets the type of this RepairHistory.
        Indicates whether the job run is Original or Repaired.

        Allowed values for this property are: "ORIGINAL", "REPAIR", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The type of this RepairHistory.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this RepairHistory.
        Indicates whether the job run is Original or Repaired.


        :param type: The type of this RepairHistory.
        :type: str
        """
        allowed_values = ["ORIGINAL", "REPAIR"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            type = 'UNKNOWN_ENUM_VALUE'
        self._type = type

    @property
    def key(self):
        """
        Gets the key of this RepairHistory.
        The unique ID of the Repair run.


        :return: The key of this RepairHistory.
        :rtype: int
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this RepairHistory.
        The unique ID of the Repair run.


        :param key: The key of this RepairHistory.
        :type: int
        """
        self._key = key

    @property
    def state(self):
        """
        Gets the state of this RepairHistory.

        :return: The state of this RepairHistory.
        :rtype: oci.aidataplatform_dp.models.State
        """
        return self._state

    @state.setter
    def state(self, state):
        """
        Sets the state of this RepairHistory.

        :param state: The state of this RepairHistory.
        :type: oci.aidataplatform_dp.models.State
        """
        self._state = state

    @property
    def start_time(self):
        """
        Gets the start_time of this RepairHistory.
        The time at which the job execution started in epoch milliseconds.


        :return: The start_time of this RepairHistory.
        :rtype: int
        """
        return self._start_time

    @start_time.setter
    def start_time(self, start_time):
        """
        Sets the start_time of this RepairHistory.
        The time at which the job execution started in epoch milliseconds.


        :param start_time: The start_time of this RepairHistory.
        :type: int
        """
        self._start_time = start_time

    @property
    def end_time(self):
        """
        Gets the end_time of this RepairHistory.
        The time at which the job execution started in epoch milliseconds.


        :return: The end_time of this RepairHistory.
        :rtype: int
        """
        return self._end_time

    @end_time.setter
    def end_time(self, end_time):
        """
        Sets the end_time of this RepairHistory.
        The time at which the job execution started in epoch milliseconds.


        :param end_time: The end_time of this RepairHistory.
        :type: int
        """
        self._end_time = end_time

    @property
    def task_to_task_run_map(self):
        """
        Gets the task_to_task_run_map of this RepairHistory.
        Task to TaskRun map for given job run.


        :return: The task_to_task_run_map of this RepairHistory.
        :rtype: dict(str, str)
        """
        return self._task_to_task_run_map

    @task_to_task_run_map.setter
    def task_to_task_run_map(self, task_to_task_run_map):
        """
        Sets the task_to_task_run_map of this RepairHistory.
        Task to TaskRun map for given job run.


        :param task_to_task_run_map: The task_to_task_run_map of this RepairHistory.
        :type: dict(str, str)
        """
        self._task_to_task_run_map = task_to_task_run_map

    @property
    def parameters(self):
        """
        Gets the parameters of this RepairHistory.
        An optional list of parameters.


        :return: The parameters of this RepairHistory.
        :rtype: list[oci.aidataplatform_dp.models.Parameter]
        """
        return self._parameters

    @parameters.setter
    def parameters(self, parameters):
        """
        Sets the parameters of this RepairHistory.
        An optional list of parameters.


        :param parameters: The parameters of this RepairHistory.
        :type: list[oci.aidataplatform_dp.models.Parameter]
        """
        self._parameters = parameters

    @property
    def repaired_tasks(self):
        """
        Gets the repaired_tasks of this RepairHistory.
        A list of repaired tasks.


        :return: The repaired_tasks of this RepairHistory.
        :rtype: list[str]
        """
        return self._repaired_tasks

    @repaired_tasks.setter
    def repaired_tasks(self, repaired_tasks):
        """
        Sets the repaired_tasks of this RepairHistory.
        A list of repaired tasks.


        :param repaired_tasks: The repaired_tasks of this RepairHistory.
        :type: list[str]
        """
        self._repaired_tasks = repaired_tasks

    @property
    def lifecycle_states(self):
        """
        Gets the lifecycle_states of this RepairHistory.
        The collection of lifecycle states.


        :return: The lifecycle_states of this RepairHistory.
        :rtype: list[oci.aidataplatform_dp.models.LifecycleState]
        """
        return self._lifecycle_states

    @lifecycle_states.setter
    def lifecycle_states(self, lifecycle_states):
        """
        Sets the lifecycle_states of this RepairHistory.
        The collection of lifecycle states.


        :param lifecycle_states: The lifecycle_states of this RepairHistory.
        :type: list[oci.aidataplatform_dp.models.LifecycleState]
        """
        self._lifecycle_states = lifecycle_states

    @property
    def execution_duration(self):
        """
        Gets the execution_duration of this RepairHistory.
        The time (in milliseconds) taken to complete the job execution.


        :return: The execution_duration of this RepairHistory.
        :rtype: int
        """
        return self._execution_duration

    @execution_duration.setter
    def execution_duration(self, execution_duration):
        """
        Sets the execution_duration of this RepairHistory.
        The time (in milliseconds) taken to complete the job execution.


        :param execution_duration: The execution_duration of this RepairHistory.
        :type: int
        """
        self._execution_duration = execution_duration

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
