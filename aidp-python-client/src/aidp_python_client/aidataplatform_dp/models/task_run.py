# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class TaskRun(object):
    """
    A description of a task run.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new TaskRun object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this TaskRun.
        :type key: str

        :param name:
            The value to assign to the name property of this TaskRun.
        :type name: str

        :param task_key:
            The value to assign to the task_key property of this TaskRun.
        :type task_key: str

        :param job_key:
            The value to assign to the job_key property of this TaskRun.
        :type job_key: str

        :param job_run_key:
            The value to assign to the job_run_key property of this TaskRun.
        :type job_run_key: str

        :param parent_job_run_key:
            The value to assign to the parent_job_run_key property of this TaskRun.
        :type parent_job_run_key: str

        :param root_job_run_key:
            The value to assign to the root_job_run_key property of this TaskRun.
        :type root_job_run_key: str

        :param cluster_validation_start_time:
            The value to assign to the cluster_validation_start_time property of this TaskRun.
        :type cluster_validation_start_time: int

        :param start_time:
            The value to assign to the start_time property of this TaskRun.
        :type start_time: int

        :param end_time:
            The value to assign to the end_time property of this TaskRun.
        :type end_time: int

        :param state:
            The value to assign to the state property of this TaskRun.
        :type state: oci.aidataplatform_dp.models.State

        :param setup_duration:
            The value to assign to the setup_duration property of this TaskRun.
        :type setup_duration: int

        :param execution_duration:
            The value to assign to the execution_duration property of this TaskRun.
        :type execution_duration: int

        :param cleanup_duration:
            The value to assign to the cleanup_duration property of this TaskRun.
        :type cleanup_duration: int

        :param cluster_spec:
            The value to assign to the cluster_spec property of this TaskRun.
        :type cluster_spec: oci.aidataplatform_dp.models.ClusterSpec

        :param task:
            The value to assign to the task property of this TaskRun.
        :type task: oci.aidataplatform_dp.models.Task

        :param version:
            The value to assign to the version property of this TaskRun.
        :type version: int

        :param retry_attempt:
            The value to assign to the retry_attempt property of this TaskRun.
        :type retry_attempt: int

        :param retries:
            The value to assign to the retries property of this TaskRun.
        :type retries: list[oci.aidataplatform_dp.models.TaskRunRetry]

        :param output_key:
            The value to assign to the output_key property of this TaskRun.
        :type output_key: str

        :param external_id:
            The value to assign to the external_id property of this TaskRun.
        :type external_id: str

        :param system_parameters:
            The value to assign to the system_parameters property of this TaskRun.
        :type system_parameters: dict(str, str)

        :param parameters:
            The value to assign to the parameters property of this TaskRun.
        :type parameters: list[oci.aidataplatform_dp.models.Parameter]

        :param lifecycle_states:
            The value to assign to the lifecycle_states property of this TaskRun.
        :type lifecycle_states: list[oci.aidataplatform_dp.models.LifecycleState]

        """
        self.swagger_types = {
            'key': 'str',
            'name': 'str',
            'task_key': 'str',
            'job_key': 'str',
            'job_run_key': 'str',
            'parent_job_run_key': 'str',
            'root_job_run_key': 'str',
            'cluster_validation_start_time': 'int',
            'start_time': 'int',
            'end_time': 'int',
            'state': 'State',
            'setup_duration': 'int',
            'execution_duration': 'int',
            'cleanup_duration': 'int',
            'cluster_spec': 'ClusterSpec',
            'task': 'Task',
            'version': 'int',
            'retry_attempt': 'int',
            'retries': 'list[TaskRunRetry]',
            'output_key': 'str',
            'external_id': 'str',
            'system_parameters': 'dict(str, str)',
            'parameters': 'list[Parameter]',
            'lifecycle_states': 'list[LifecycleState]'
        }

        self.attribute_map = {
            'key': 'key',
            'name': 'name',
            'task_key': 'taskKey',
            'job_key': 'jobKey',
            'job_run_key': 'jobRunKey',
            'parent_job_run_key': 'parentJobRunKey',
            'root_job_run_key': 'rootJobRunKey',
            'cluster_validation_start_time': 'clusterValidationStartTime',
            'start_time': 'startTime',
            'end_time': 'endTime',
            'state': 'state',
            'setup_duration': 'setupDuration',
            'execution_duration': 'executionDuration',
            'cleanup_duration': 'cleanupDuration',
            'cluster_spec': 'clusterSpec',
            'task': 'task',
            'version': 'version',
            'retry_attempt': 'retryAttempt',
            'retries': 'retries',
            'output_key': 'outputKey',
            'external_id': 'externalId',
            'system_parameters': 'systemParameters',
            'parameters': 'parameters',
            'lifecycle_states': 'lifecycleStates'
        }

        self._key = None
        self._name = None
        self._task_key = None
        self._job_key = None
        self._job_run_key = None
        self._parent_job_run_key = None
        self._root_job_run_key = None
        self._cluster_validation_start_time = None
        self._start_time = None
        self._end_time = None
        self._state = None
        self._setup_duration = None
        self._execution_duration = None
        self._cleanup_duration = None
        self._cluster_spec = None
        self._task = None
        self._version = None
        self._retry_attempt = None
        self._retries = None
        self._output_key = None
        self._external_id = None
        self._system_parameters = None
        self._parameters = None
        self._lifecycle_states = None

    @property
    def key(self):
        """
        **[Required]** Gets the key of this TaskRun.
        The OCID of the task run.


        :return: The key of this TaskRun.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this TaskRun.
        The OCID of the task run.


        :param key: The key of this TaskRun.
        :type: str
        """
        self._key = key

    @property
    def name(self):
        """
        **[Required]** Gets the name of this TaskRun.
        A user-friendly name. Does not have to be unique, and is changeable.


        :return: The name of this TaskRun.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this TaskRun.
        A user-friendly name. Does not have to be unique, and is changeable.


        :param name: The name of this TaskRun.
        :type: str
        """
        self._name = name

    @property
    def task_key(self):
        """
        Gets the task_key of this TaskRun.
        The display name of the task. User can specify a value for this.


        :return: The task_key of this TaskRun.
        :rtype: str
        """
        return self._task_key

    @task_key.setter
    def task_key(self, task_key):
        """
        Sets the task_key of this TaskRun.
        The display name of the task. User can specify a value for this.


        :param task_key: The task_key of this TaskRun.
        :type: str
        """
        self._task_key = task_key

    @property
    def job_key(self):
        """
        Gets the job_key of this TaskRun.
        The OCID of the job.


        :return: The job_key of this TaskRun.
        :rtype: str
        """
        return self._job_key

    @job_key.setter
    def job_key(self, job_key):
        """
        Sets the job_key of this TaskRun.
        The OCID of the job.


        :param job_key: The job_key of this TaskRun.
        :type: str
        """
        self._job_key = job_key

    @property
    def job_run_key(self):
        """
        Gets the job_run_key of this TaskRun.
        The OCID of the job.


        :return: The job_run_key of this TaskRun.
        :rtype: str
        """
        return self._job_run_key

    @job_run_key.setter
    def job_run_key(self, job_run_key):
        """
        Sets the job_run_key of this TaskRun.
        The OCID of the job.


        :param job_run_key: The job_run_key of this TaskRun.
        :type: str
        """
        self._job_run_key = job_run_key

    @property
    def parent_job_run_key(self):
        """
        Gets the parent_job_run_key of this TaskRun.
        The OCID of the job.


        :return: The parent_job_run_key of this TaskRun.
        :rtype: str
        """
        return self._parent_job_run_key

    @parent_job_run_key.setter
    def parent_job_run_key(self, parent_job_run_key):
        """
        Sets the parent_job_run_key of this TaskRun.
        The OCID of the job.


        :param parent_job_run_key: The parent_job_run_key of this TaskRun.
        :type: str
        """
        self._parent_job_run_key = parent_job_run_key

    @property
    def root_job_run_key(self):
        """
        Gets the root_job_run_key of this TaskRun.
        The OCID of the job.


        :return: The root_job_run_key of this TaskRun.
        :rtype: str
        """
        return self._root_job_run_key

    @root_job_run_key.setter
    def root_job_run_key(self, root_job_run_key):
        """
        Sets the root_job_run_key of this TaskRun.
        The OCID of the job.


        :param root_job_run_key: The root_job_run_key of this TaskRun.
        :type: str
        """
        self._root_job_run_key = root_job_run_key

    @property
    def cluster_validation_start_time(self):
        """
        Gets the cluster_validation_start_time of this TaskRun.
        The time at which the cluster validation started in epoch milliseconds.


        :return: The cluster_validation_start_time of this TaskRun.
        :rtype: int
        """
        return self._cluster_validation_start_time

    @cluster_validation_start_time.setter
    def cluster_validation_start_time(self, cluster_validation_start_time):
        """
        Sets the cluster_validation_start_time of this TaskRun.
        The time at which the cluster validation started in epoch milliseconds.


        :param cluster_validation_start_time: The cluster_validation_start_time of this TaskRun.
        :type: int
        """
        self._cluster_validation_start_time = cluster_validation_start_time

    @property
    def start_time(self):
        """
        Gets the start_time of this TaskRun.
        The time at which the job execution started in epoch milliseconds.


        :return: The start_time of this TaskRun.
        :rtype: int
        """
        return self._start_time

    @start_time.setter
    def start_time(self, start_time):
        """
        Sets the start_time of this TaskRun.
        The time at which the job execution started in epoch milliseconds.


        :param start_time: The start_time of this TaskRun.
        :type: int
        """
        self._start_time = start_time

    @property
    def end_time(self):
        """
        Gets the end_time of this TaskRun.
        The time at which the job execution started in epoch milliseconds.


        :return: The end_time of this TaskRun.
        :rtype: int
        """
        return self._end_time

    @end_time.setter
    def end_time(self, end_time):
        """
        Sets the end_time of this TaskRun.
        The time at which the job execution started in epoch milliseconds.


        :param end_time: The end_time of this TaskRun.
        :type: int
        """
        self._end_time = end_time

    @property
    def state(self):
        """
        Gets the state of this TaskRun.

        :return: The state of this TaskRun.
        :rtype: oci.aidataplatform_dp.models.State
        """
        return self._state

    @state.setter
    def state(self, state):
        """
        Sets the state of this TaskRun.

        :param state: The state of this TaskRun.
        :type: oci.aidataplatform_dp.models.State
        """
        self._state = state

    @property
    def setup_duration(self):
        """
        Gets the setup_duration of this TaskRun.
        The time (in milliseconds) taken to setup the cluster.


        :return: The setup_duration of this TaskRun.
        :rtype: int
        """
        return self._setup_duration

    @setup_duration.setter
    def setup_duration(self, setup_duration):
        """
        Sets the setup_duration of this TaskRun.
        The time (in milliseconds) taken to setup the cluster.


        :param setup_duration: The setup_duration of this TaskRun.
        :type: int
        """
        self._setup_duration = setup_duration

    @property
    def execution_duration(self):
        """
        Gets the execution_duration of this TaskRun.
        The time (in milliseconds) taken to complete the job execution.


        :return: The execution_duration of this TaskRun.
        :rtype: int
        """
        return self._execution_duration

    @execution_duration.setter
    def execution_duration(self, execution_duration):
        """
        Sets the execution_duration of this TaskRun.
        The time (in milliseconds) taken to complete the job execution.


        :param execution_duration: The execution_duration of this TaskRun.
        :type: int
        """
        self._execution_duration = execution_duration

    @property
    def cleanup_duration(self):
        """
        Gets the cleanup_duration of this TaskRun.
        The time (in milliseconds) taken to terminate the cluster and to clean up any associated artifacts.


        :return: The cleanup_duration of this TaskRun.
        :rtype: int
        """
        return self._cleanup_duration

    @cleanup_duration.setter
    def cleanup_duration(self, cleanup_duration):
        """
        Sets the cleanup_duration of this TaskRun.
        The time (in milliseconds) taken to terminate the cluster and to clean up any associated artifacts.


        :param cleanup_duration: The cleanup_duration of this TaskRun.
        :type: int
        """
        self._cleanup_duration = cleanup_duration

    @property
    def cluster_spec(self):
        """
        Gets the cluster_spec of this TaskRun.

        :return: The cluster_spec of this TaskRun.
        :rtype: oci.aidataplatform_dp.models.ClusterSpec
        """
        return self._cluster_spec

    @cluster_spec.setter
    def cluster_spec(self, cluster_spec):
        """
        Sets the cluster_spec of this TaskRun.

        :param cluster_spec: The cluster_spec of this TaskRun.
        :type: oci.aidataplatform_dp.models.ClusterSpec
        """
        self._cluster_spec = cluster_spec

    @property
    def task(self):
        """
        Gets the task of this TaskRun.

        :return: The task of this TaskRun.
        :rtype: oci.aidataplatform_dp.models.Task
        """
        return self._task

    @task.setter
    def task(self, task):
        """
        Sets the task of this TaskRun.

        :param task: The task of this TaskRun.
        :type: oci.aidataplatform_dp.models.Task
        """
        self._task = task

    @property
    def version(self):
        """
        Gets the version of this TaskRun.
        Current version of job run object in repository.


        :return: The version of this TaskRun.
        :rtype: int
        """
        return self._version

    @version.setter
    def version(self, version):
        """
        Sets the version of this TaskRun.
        Current version of job run object in repository.


        :param version: The version of this TaskRun.
        :type: int
        """
        self._version = version

    @property
    def retry_attempt(self):
        """
        Gets the retry_attempt of this TaskRun.
        Sequence number of the current retry attempt. 0 for the original. 1, 2, 3, ... for subsequent retry attempts.


        :return: The retry_attempt of this TaskRun.
        :rtype: int
        """
        return self._retry_attempt

    @retry_attempt.setter
    def retry_attempt(self, retry_attempt):
        """
        Sets the retry_attempt of this TaskRun.
        Sequence number of the current retry attempt. 0 for the original. 1, 2, 3, ... for subsequent retry attempts.


        :param retry_attempt: The retry_attempt of this TaskRun.
        :type: int
        """
        self._retry_attempt = retry_attempt

    @property
    def retries(self):
        """
        Gets the retries of this TaskRun.
        List of task retries.


        :return: The retries of this TaskRun.
        :rtype: list[oci.aidataplatform_dp.models.TaskRunRetry]
        """
        return self._retries

    @retries.setter
    def retries(self, retries):
        """
        Sets the retries of this TaskRun.
        List of task retries.


        :param retries: The retries of this TaskRun.
        :type: list[oci.aidataplatform_dp.models.TaskRunRetry]
        """
        self._retries = retries

    @property
    def output_key(self):
        """
        Gets the output_key of this TaskRun.
        A unique identifier for the output.


        :return: The output_key of this TaskRun.
        :rtype: str
        """
        return self._output_key

    @output_key.setter
    def output_key(self, output_key):
        """
        Sets the output_key of this TaskRun.
        A unique identifier for the output.


        :param output_key: The output_key of this TaskRun.
        :type: str
        """
        self._output_key = output_key

    @property
    def external_id(self):
        """
        Gets the external_id of this TaskRun.
        The external ID of the task execution.


        :return: The external_id of this TaskRun.
        :rtype: str
        """
        return self._external_id

    @external_id.setter
    def external_id(self, external_id):
        """
        Sets the external_id of this TaskRun.
        The external ID of the task execution.


        :param external_id: The external_id of this TaskRun.
        :type: str
        """
        self._external_id = external_id

    @property
    def system_parameters(self):
        """
        Gets the system_parameters of this TaskRun.
        Map of system parameters with their values for this job run.


        :return: The system_parameters of this TaskRun.
        :rtype: dict(str, str)
        """
        return self._system_parameters

    @system_parameters.setter
    def system_parameters(self, system_parameters):
        """
        Sets the system_parameters of this TaskRun.
        Map of system parameters with their values for this job run.


        :param system_parameters: The system_parameters of this TaskRun.
        :type: dict(str, str)
        """
        self._system_parameters = system_parameters

    @property
    def parameters(self):
        """
        Gets the parameters of this TaskRun.
        An optional list of parameters.


        :return: The parameters of this TaskRun.
        :rtype: list[oci.aidataplatform_dp.models.Parameter]
        """
        return self._parameters

    @parameters.setter
    def parameters(self, parameters):
        """
        Sets the parameters of this TaskRun.
        An optional list of parameters.


        :param parameters: The parameters of this TaskRun.
        :type: list[oci.aidataplatform_dp.models.Parameter]
        """
        self._parameters = parameters

    @property
    def lifecycle_states(self):
        """
        Gets the lifecycle_states of this TaskRun.
        The collection of lifecycle states.


        :return: The lifecycle_states of this TaskRun.
        :rtype: list[oci.aidataplatform_dp.models.LifecycleState]
        """
        return self._lifecycle_states

    @lifecycle_states.setter
    def lifecycle_states(self, lifecycle_states):
        """
        Sets the lifecycle_states of this TaskRun.
        The collection of lifecycle states.


        :param lifecycle_states: The lifecycle_states of this TaskRun.
        :type: list[oci.aidataplatform_dp.models.LifecycleState]
        """
        self._lifecycle_states = lifecycle_states

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
