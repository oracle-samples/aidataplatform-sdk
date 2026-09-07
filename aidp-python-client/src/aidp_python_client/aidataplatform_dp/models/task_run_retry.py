# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class TaskRunRetry(object):
    """
    Representation of a task run retry. Maximum of 10 retries are allowed.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new TaskRunRetry object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this TaskRunRetry.
        :type key: str

        :param name:
            The value to assign to the name property of this TaskRunRetry.
        :type name: str

        :param task_run_key:
            The value to assign to the task_run_key property of this TaskRunRetry.
        :type task_run_key: str

        :param start_time:
            The value to assign to the start_time property of this TaskRunRetry.
        :type start_time: int

        :param end_time:
            The value to assign to the end_time property of this TaskRunRetry.
        :type end_time: int

        :param version:
            The value to assign to the version property of this TaskRunRetry.
        :type version: int

        :param cluster_validation_start_time:
            The value to assign to the cluster_validation_start_time property of this TaskRunRetry.
        :type cluster_validation_start_time: int

        :param state:
            The value to assign to the state property of this TaskRunRetry.
        :type state: oci.aidataplatform_dp.models.State

        :param setup_duration:
            The value to assign to the setup_duration property of this TaskRunRetry.
        :type setup_duration: int

        :param execution_duration:
            The value to assign to the execution_duration property of this TaskRunRetry.
        :type execution_duration: int

        :param cleanup_duration:
            The value to assign to the cleanup_duration property of this TaskRunRetry.
        :type cleanup_duration: int

        :param output_key:
            The value to assign to the output_key property of this TaskRunRetry.
        :type output_key: str

        :param external_id:
            The value to assign to the external_id property of this TaskRunRetry.
        :type external_id: str

        :param retry_number:
            The value to assign to the retry_number property of this TaskRunRetry.
        :type retry_number: int

        """
        self.swagger_types = {
            'key': 'str',
            'name': 'str',
            'task_run_key': 'str',
            'start_time': 'int',
            'end_time': 'int',
            'version': 'int',
            'cluster_validation_start_time': 'int',
            'state': 'State',
            'setup_duration': 'int',
            'execution_duration': 'int',
            'cleanup_duration': 'int',
            'output_key': 'str',
            'external_id': 'str',
            'retry_number': 'int'
        }

        self.attribute_map = {
            'key': 'key',
            'name': 'name',
            'task_run_key': 'taskRunKey',
            'start_time': 'startTime',
            'end_time': 'endTime',
            'version': 'version',
            'cluster_validation_start_time': 'clusterValidationStartTime',
            'state': 'state',
            'setup_duration': 'setupDuration',
            'execution_duration': 'executionDuration',
            'cleanup_duration': 'cleanupDuration',
            'output_key': 'outputKey',
            'external_id': 'externalId',
            'retry_number': 'retryNumber'
        }

        self._key = None
        self._name = None
        self._task_run_key = None
        self._start_time = None
        self._end_time = None
        self._version = None
        self._cluster_validation_start_time = None
        self._state = None
        self._setup_duration = None
        self._execution_duration = None
        self._cleanup_duration = None
        self._output_key = None
        self._external_id = None
        self._retry_number = None

    @property
    def key(self):
        """
        **[Required]** Gets the key of this TaskRunRetry.
        The OCID of the task run.


        :return: The key of this TaskRunRetry.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this TaskRunRetry.
        The OCID of the task run.


        :param key: The key of this TaskRunRetry.
        :type: str
        """
        self._key = key

    @property
    def name(self):
        """
        **[Required]** Gets the name of this TaskRunRetry.
        A user-friendly name. Does not have to be unique, and is changeable.


        :return: The name of this TaskRunRetry.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this TaskRunRetry.
        A user-friendly name. Does not have to be unique, and is changeable.


        :param name: The name of this TaskRunRetry.
        :type: str
        """
        self._name = name

    @property
    def task_run_key(self):
        """
        **[Required]** Gets the task_run_key of this TaskRunRetry.
        The OCID of the task run.


        :return: The task_run_key of this TaskRunRetry.
        :rtype: str
        """
        return self._task_run_key

    @task_run_key.setter
    def task_run_key(self, task_run_key):
        """
        Sets the task_run_key of this TaskRunRetry.
        The OCID of the task run.


        :param task_run_key: The task_run_key of this TaskRunRetry.
        :type: str
        """
        self._task_run_key = task_run_key

    @property
    def start_time(self):
        """
        Gets the start_time of this TaskRunRetry.
        The time at which the job execution started in epoch milliseconds.


        :return: The start_time of this TaskRunRetry.
        :rtype: int
        """
        return self._start_time

    @start_time.setter
    def start_time(self, start_time):
        """
        Sets the start_time of this TaskRunRetry.
        The time at which the job execution started in epoch milliseconds.


        :param start_time: The start_time of this TaskRunRetry.
        :type: int
        """
        self._start_time = start_time

    @property
    def end_time(self):
        """
        Gets the end_time of this TaskRunRetry.
        The time at which the job execution started in epoch milliseconds.


        :return: The end_time of this TaskRunRetry.
        :rtype: int
        """
        return self._end_time

    @end_time.setter
    def end_time(self, end_time):
        """
        Sets the end_time of this TaskRunRetry.
        The time at which the job execution started in epoch milliseconds.


        :param end_time: The end_time of this TaskRunRetry.
        :type: int
        """
        self._end_time = end_time

    @property
    def version(self):
        """
        Gets the version of this TaskRunRetry.
        Current version of job run object in repository.


        :return: The version of this TaskRunRetry.
        :rtype: int
        """
        return self._version

    @version.setter
    def version(self, version):
        """
        Sets the version of this TaskRunRetry.
        Current version of job run object in repository.


        :param version: The version of this TaskRunRetry.
        :type: int
        """
        self._version = version

    @property
    def cluster_validation_start_time(self):
        """
        Gets the cluster_validation_start_time of this TaskRunRetry.
        The time at which the cluster validation started in epoch milliseconds.


        :return: The cluster_validation_start_time of this TaskRunRetry.
        :rtype: int
        """
        return self._cluster_validation_start_time

    @cluster_validation_start_time.setter
    def cluster_validation_start_time(self, cluster_validation_start_time):
        """
        Sets the cluster_validation_start_time of this TaskRunRetry.
        The time at which the cluster validation started in epoch milliseconds.


        :param cluster_validation_start_time: The cluster_validation_start_time of this TaskRunRetry.
        :type: int
        """
        self._cluster_validation_start_time = cluster_validation_start_time

    @property
    def state(self):
        """
        Gets the state of this TaskRunRetry.

        :return: The state of this TaskRunRetry.
        :rtype: oci.aidataplatform_dp.models.State
        """
        return self._state

    @state.setter
    def state(self, state):
        """
        Sets the state of this TaskRunRetry.

        :param state: The state of this TaskRunRetry.
        :type: oci.aidataplatform_dp.models.State
        """
        self._state = state

    @property
    def setup_duration(self):
        """
        Gets the setup_duration of this TaskRunRetry.
        The time (in milliseconds) taken to setup the cluster.


        :return: The setup_duration of this TaskRunRetry.
        :rtype: int
        """
        return self._setup_duration

    @setup_duration.setter
    def setup_duration(self, setup_duration):
        """
        Sets the setup_duration of this TaskRunRetry.
        The time (in milliseconds) taken to setup the cluster.


        :param setup_duration: The setup_duration of this TaskRunRetry.
        :type: int
        """
        self._setup_duration = setup_duration

    @property
    def execution_duration(self):
        """
        Gets the execution_duration of this TaskRunRetry.
        The time (in milliseconds) taken to complete the job execution.


        :return: The execution_duration of this TaskRunRetry.
        :rtype: int
        """
        return self._execution_duration

    @execution_duration.setter
    def execution_duration(self, execution_duration):
        """
        Sets the execution_duration of this TaskRunRetry.
        The time (in milliseconds) taken to complete the job execution.


        :param execution_duration: The execution_duration of this TaskRunRetry.
        :type: int
        """
        self._execution_duration = execution_duration

    @property
    def cleanup_duration(self):
        """
        Gets the cleanup_duration of this TaskRunRetry.
        The time (in milliseconds) taken to terminate the cluster and to clean up any associated artifacts.


        :return: The cleanup_duration of this TaskRunRetry.
        :rtype: int
        """
        return self._cleanup_duration

    @cleanup_duration.setter
    def cleanup_duration(self, cleanup_duration):
        """
        Sets the cleanup_duration of this TaskRunRetry.
        The time (in milliseconds) taken to terminate the cluster and to clean up any associated artifacts.


        :param cleanup_duration: The cleanup_duration of this TaskRunRetry.
        :type: int
        """
        self._cleanup_duration = cleanup_duration

    @property
    def output_key(self):
        """
        Gets the output_key of this TaskRunRetry.
        A unique identifier for the output.


        :return: The output_key of this TaskRunRetry.
        :rtype: str
        """
        return self._output_key

    @output_key.setter
    def output_key(self, output_key):
        """
        Sets the output_key of this TaskRunRetry.
        A unique identifier for the output.


        :param output_key: The output_key of this TaskRunRetry.
        :type: str
        """
        self._output_key = output_key

    @property
    def external_id(self):
        """
        Gets the external_id of this TaskRunRetry.
        The external ID of the task execution.


        :return: The external_id of this TaskRunRetry.
        :rtype: str
        """
        return self._external_id

    @external_id.setter
    def external_id(self, external_id):
        """
        Sets the external_id of this TaskRunRetry.
        The external ID of the task execution.


        :param external_id: The external_id of this TaskRunRetry.
        :type: str
        """
        self._external_id = external_id

    @property
    def retry_number(self):
        """
        **[Required]** Gets the retry_number of this TaskRunRetry.
        Sequence number of the retry attempt. 0 for the original. 1, 2, 3, ... for subsequent retry attempts.


        :return: The retry_number of this TaskRunRetry.
        :rtype: int
        """
        return self._retry_number

    @retry_number.setter
    def retry_number(self, retry_number):
        """
        Sets the retry_number of this TaskRunRetry.
        Sequence number of the retry attempt. 0 for the original. 1, 2, 3, ... for subsequent retry attempts.


        :param retry_number: The retry_number of this TaskRunRetry.
        :type: int
        """
        self._retry_number = retry_number

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
