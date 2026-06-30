# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class JobRun(object):
    """
    Description of a job run.
    """

    #: A constant which can be used with the launched property of a JobRun.
    #: This constant has a value of "SCHEDULED"
    LAUNCHED_SCHEDULED = "SCHEDULED"

    #: A constant which can be used with the launched property of a JobRun.
    #: This constant has a value of "MANUAL"
    LAUNCHED_MANUAL = "MANUAL"

    #: A constant which can be used with the repair_mode property of a JobRun.
    #: This constant has a value of "RESUME"
    REPAIR_MODE_RESUME = "RESUME"

    #: A constant which can be used with the repair_mode property of a JobRun.
    #: This constant has a value of "RERUN"
    REPAIR_MODE_RERUN = "RERUN"

    def __init__(self, **kwargs):
        """
        Initializes a new JobRun object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this JobRun.
        :type key: str

        :param name:
            The value to assign to the name property of this JobRun.
        :type name: str

        :param job_key:
            The value to assign to the job_key property of this JobRun.
        :type job_key: str

        :param job_name:
            The value to assign to the job_name property of this JobRun.
        :type job_name: str

        :param parent_job_run_key:
            The value to assign to the parent_job_run_key property of this JobRun.
        :type parent_job_run_key: str

        :param root_job_run_key:
            The value to assign to the root_job_run_key property of this JobRun.
        :type root_job_run_key: str

        :param parent_task_run_key:
            The value to assign to the parent_task_run_key property of this JobRun.
        :type parent_task_run_key: str

        :param tasks:
            The value to assign to the tasks property of this JobRun.
        :type tasks: list[oci.aidataplatform_dp.models.Task]

        :param created_by:
            The value to assign to the created_by property of this JobRun.
        :type created_by: str

        :param created_by_name:
            The value to assign to the created_by_name property of this JobRun.
        :type created_by_name: str

        :param max_concurrent_runs:
            The value to assign to the max_concurrent_runs property of this JobRun.
        :type max_concurrent_runs: int

        :param git_config:
            The value to assign to the git_config property of this JobRun.
        :type git_config: oci.aidataplatform_dp.models.GitConfig

        :param queue:
            The value to assign to the queue property of this JobRun.
        :type queue: oci.aidataplatform_dp.models.Queue

        :param original_attempt_run_id:
            The value to assign to the original_attempt_run_id property of this JobRun.
        :type original_attempt_run_id: str

        :param state:
            The value to assign to the state property of this JobRun.
        :type state: oci.aidataplatform_dp.models.State

        :param schedule:
            The value to assign to the schedule property of this JobRun.
        :type schedule: oci.aidataplatform_dp.models.Schedule

        :param cluster_spec:
            The value to assign to the cluster_spec property of this JobRun.
        :type cluster_spec: oci.aidataplatform_dp.models.ClusterSpec

        :param cluster_instance:
            The value to assign to the cluster_instance property of this JobRun.
        :type cluster_instance: oci.aidataplatform_dp.models.ClusterInstance

        :param parameters:
            The value to assign to the parameters property of this JobRun.
        :type parameters: list[oci.aidataplatform_dp.models.Parameter]

        :param unified_job_and_job_run_parameters:
            The value to assign to the unified_job_and_job_run_parameters property of this JobRun.
        :type unified_job_and_job_run_parameters: list[oci.aidataplatform_dp.models.Parameter]

        :param repair_history:
            The value to assign to the repair_history property of this JobRun.
        :type repair_history: list[oci.aidataplatform_dp.models.RepairHistory]

        :param system_parameters:
            The value to assign to the system_parameters property of this JobRun.
        :type system_parameters: dict(str, str)

        :param start_time:
            The value to assign to the start_time property of this JobRun.
        :type start_time: int

        :param end_time:
            The value to assign to the end_time property of this JobRun.
        :type end_time: int

        :param setup_duration:
            The value to assign to the setup_duration property of this JobRun.
        :type setup_duration: int

        :param execution_duration:
            The value to assign to the execution_duration property of this JobRun.
        :type execution_duration: int

        :param cleanup_duration:
            The value to assign to the cleanup_duration property of this JobRun.
        :type cleanup_duration: int

        :param run_duration:
            The value to assign to the run_duration property of this JobRun.
        :type run_duration: int

        :param time_created:
            The value to assign to the time_created property of this JobRun.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this JobRun.
        :type time_updated: datetime

        :param launched:
            The value to assign to the launched property of this JobRun.
            Allowed values for this property are: "SCHEDULED", "MANUAL", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type launched: str

        :param version:
            The value to assign to the version property of this JobRun.
        :type version: int

        :param task_to_task_run_map:
            The value to assign to the task_to_task_run_map property of this JobRun.
        :type task_to_task_run_map: dict(str, str)

        :param task_run_summary_map:
            The value to assign to the task_run_summary_map property of this JobRun.
        :type task_run_summary_map: dict(str, object)

        :param timeout_seconds:
            The value to assign to the timeout_seconds property of this JobRun.
        :type timeout_seconds: int

        :param repaired_tasks:
            The value to assign to the repaired_tasks property of this JobRun.
        :type repaired_tasks: list[str]

        :param repair_mode:
            The value to assign to the repair_mode property of this JobRun.
            Allowed values for this property are: "RESUME", "RERUN", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type repair_mode: str

        :param lifecycle_states:
            The value to assign to the lifecycle_states property of this JobRun.
        :type lifecycle_states: list[oci.aidataplatform_dp.models.LifecycleState]

        """
        self.swagger_types = {
            'key': 'str',
            'name': 'str',
            'job_key': 'str',
            'job_name': 'str',
            'parent_job_run_key': 'str',
            'root_job_run_key': 'str',
            'parent_task_run_key': 'str',
            'tasks': 'list[Task]',
            'created_by': 'str',
            'created_by_name': 'str',
            'max_concurrent_runs': 'int',
            'git_config': 'GitConfig',
            'queue': 'Queue',
            'original_attempt_run_id': 'str',
            'state': 'State',
            'schedule': 'Schedule',
            'cluster_spec': 'ClusterSpec',
            'cluster_instance': 'ClusterInstance',
            'parameters': 'list[Parameter]',
            'unified_job_and_job_run_parameters': 'list[Parameter]',
            'repair_history': 'list[RepairHistory]',
            'system_parameters': 'dict(str, str)',
            'start_time': 'int',
            'end_time': 'int',
            'setup_duration': 'int',
            'execution_duration': 'int',
            'cleanup_duration': 'int',
            'run_duration': 'int',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'launched': 'str',
            'version': 'int',
            'task_to_task_run_map': 'dict(str, str)',
            'task_run_summary_map': 'dict(str, object)',
            'timeout_seconds': 'int',
            'repaired_tasks': 'list[str]',
            'repair_mode': 'str',
            'lifecycle_states': 'list[LifecycleState]'
        }

        self.attribute_map = {
            'key': 'key',
            'name': 'name',
            'job_key': 'jobKey',
            'job_name': 'jobName',
            'parent_job_run_key': 'parentJobRunKey',
            'root_job_run_key': 'rootJobRunKey',
            'parent_task_run_key': 'parentTaskRunKey',
            'tasks': 'tasks',
            'created_by': 'createdBy',
            'created_by_name': 'createdByName',
            'max_concurrent_runs': 'maxConcurrentRuns',
            'git_config': 'gitConfig',
            'queue': 'queue',
            'original_attempt_run_id': 'originalAttemptRunId',
            'state': 'state',
            'schedule': 'schedule',
            'cluster_spec': 'clusterSpec',
            'cluster_instance': 'clusterInstance',
            'parameters': 'parameters',
            'unified_job_and_job_run_parameters': 'unifiedJobAndJobRunParameters',
            'repair_history': 'repairHistory',
            'system_parameters': 'systemParameters',
            'start_time': 'startTime',
            'end_time': 'endTime',
            'setup_duration': 'setupDuration',
            'execution_duration': 'executionDuration',
            'cleanup_duration': 'cleanupDuration',
            'run_duration': 'runDuration',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'launched': 'launched',
            'version': 'version',
            'task_to_task_run_map': 'taskToTaskRunMap',
            'task_run_summary_map': 'taskRunSummaryMap',
            'timeout_seconds': 'timeoutSeconds',
            'repaired_tasks': 'repairedTasks',
            'repair_mode': 'repairMode',
            'lifecycle_states': 'lifecycleStates'
        }

        self._key = None
        self._name = None
        self._job_key = None
        self._job_name = None
        self._parent_job_run_key = None
        self._root_job_run_key = None
        self._parent_task_run_key = None
        self._tasks = None
        self._created_by = None
        self._created_by_name = None
        self._max_concurrent_runs = None
        self._git_config = None
        self._queue = None
        self._original_attempt_run_id = None
        self._state = None
        self._schedule = None
        self._cluster_spec = None
        self._cluster_instance = None
        self._parameters = None
        self._unified_job_and_job_run_parameters = None
        self._repair_history = None
        self._system_parameters = None
        self._start_time = None
        self._end_time = None
        self._setup_duration = None
        self._execution_duration = None
        self._cleanup_duration = None
        self._run_duration = None
        self._time_created = None
        self._time_updated = None
        self._launched = None
        self._version = None
        self._task_to_task_run_map = None
        self._task_run_summary_map = None
        self._timeout_seconds = None
        self._repaired_tasks = None
        self._repair_mode = None
        self._lifecycle_states = None

    @property
    def key(self):
        """
        **[Required]** Gets the key of this JobRun.
        The OCID of the job.


        :return: The key of this JobRun.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this JobRun.
        The OCID of the job.


        :param key: The key of this JobRun.
        :type: str
        """
        self._key = key

    @property
    def name(self):
        """
        **[Required]** Gets the name of this JobRun.
        A user-friendly name. Does not have to be unique, and is changeable.


        :return: The name of this JobRun.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this JobRun.
        A user-friendly name. Does not have to be unique, and is changeable.


        :param name: The name of this JobRun.
        :type: str
        """
        self._name = name

    @property
    def job_key(self):
        """
        **[Required]** Gets the job_key of this JobRun.
        The OCID of the job.


        :return: The job_key of this JobRun.
        :rtype: str
        """
        return self._job_key

    @job_key.setter
    def job_key(self, job_key):
        """
        Sets the job_key of this JobRun.
        The OCID of the job.


        :param job_key: The job_key of this JobRun.
        :type: str
        """
        self._job_key = job_key

    @property
    def job_name(self):
        """
        Gets the job_name of this JobRun.
        A user-friendly name. Does not have to be unique, and is changeable.


        :return: The job_name of this JobRun.
        :rtype: str
        """
        return self._job_name

    @job_name.setter
    def job_name(self, job_name):
        """
        Sets the job_name of this JobRun.
        A user-friendly name. Does not have to be unique, and is changeable.


        :param job_name: The job_name of this JobRun.
        :type: str
        """
        self._job_name = job_name

    @property
    def parent_job_run_key(self):
        """
        Gets the parent_job_run_key of this JobRun.
        The OCID of the job.


        :return: The parent_job_run_key of this JobRun.
        :rtype: str
        """
        return self._parent_job_run_key

    @parent_job_run_key.setter
    def parent_job_run_key(self, parent_job_run_key):
        """
        Sets the parent_job_run_key of this JobRun.
        The OCID of the job.


        :param parent_job_run_key: The parent_job_run_key of this JobRun.
        :type: str
        """
        self._parent_job_run_key = parent_job_run_key

    @property
    def root_job_run_key(self):
        """
        Gets the root_job_run_key of this JobRun.
        The OCID of the job.


        :return: The root_job_run_key of this JobRun.
        :rtype: str
        """
        return self._root_job_run_key

    @root_job_run_key.setter
    def root_job_run_key(self, root_job_run_key):
        """
        Sets the root_job_run_key of this JobRun.
        The OCID of the job.


        :param root_job_run_key: The root_job_run_key of this JobRun.
        :type: str
        """
        self._root_job_run_key = root_job_run_key

    @property
    def parent_task_run_key(self):
        """
        Gets the parent_task_run_key of this JobRun.
        The OCID of the task run.


        :return: The parent_task_run_key of this JobRun.
        :rtype: str
        """
        return self._parent_task_run_key

    @parent_task_run_key.setter
    def parent_task_run_key(self, parent_task_run_key):
        """
        Sets the parent_task_run_key of this JobRun.
        The OCID of the task run.


        :param parent_task_run_key: The parent_task_run_key of this JobRun.
        :type: str
        """
        self._parent_task_run_key = parent_task_run_key

    @property
    def tasks(self):
        """
        Gets the tasks of this JobRun.
        List of tasks in a job.


        :return: The tasks of this JobRun.
        :rtype: list[oci.aidataplatform_dp.models.Task]
        """
        return self._tasks

    @tasks.setter
    def tasks(self, tasks):
        """
        Sets the tasks of this JobRun.
        List of tasks in a job.


        :param tasks: The tasks of this JobRun.
        :type: list[oci.aidataplatform_dp.models.Task]
        """
        self._tasks = tasks

    @property
    def created_by(self):
        """
        Gets the created_by of this JobRun.
        The OCID of the IAM user.


        :return: The created_by of this JobRun.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this JobRun.
        The OCID of the IAM user.


        :param created_by: The created_by of this JobRun.
        :type: str
        """
        self._created_by = created_by

    @property
    def created_by_name(self):
        """
        Gets the created_by_name of this JobRun.
        Name of the user who created this record


        :return: The created_by_name of this JobRun.
        :rtype: str
        """
        return self._created_by_name

    @created_by_name.setter
    def created_by_name(self, created_by_name):
        """
        Sets the created_by_name of this JobRun.
        Name of the user who created this record


        :param created_by_name: The created_by_name of this JobRun.
        :type: str
        """
        self._created_by_name = created_by_name

    @property
    def max_concurrent_runs(self):
        """
        Gets the max_concurrent_runs of this JobRun.
        Indicates the number of executions for the same job that can be run concurrently. The maximum value cannot exceed 1000.


        :return: The max_concurrent_runs of this JobRun.
        :rtype: int
        """
        return self._max_concurrent_runs

    @max_concurrent_runs.setter
    def max_concurrent_runs(self, max_concurrent_runs):
        """
        Sets the max_concurrent_runs of this JobRun.
        Indicates the number of executions for the same job that can be run concurrently. The maximum value cannot exceed 1000.


        :param max_concurrent_runs: The max_concurrent_runs of this JobRun.
        :type: int
        """
        self._max_concurrent_runs = max_concurrent_runs

    @property
    def git_config(self):
        """
        Gets the git_config of this JobRun.

        :return: The git_config of this JobRun.
        :rtype: oci.aidataplatform_dp.models.GitConfig
        """
        return self._git_config

    @git_config.setter
    def git_config(self, git_config):
        """
        Sets the git_config of this JobRun.

        :param git_config: The git_config of this JobRun.
        :type: oci.aidataplatform_dp.models.GitConfig
        """
        self._git_config = git_config

    @property
    def queue(self):
        """
        Gets the queue of this JobRun.

        :return: The queue of this JobRun.
        :rtype: oci.aidataplatform_dp.models.Queue
        """
        return self._queue

    @queue.setter
    def queue(self, queue):
        """
        Sets the queue of this JobRun.

        :param queue: The queue of this JobRun.
        :type: oci.aidataplatform_dp.models.Queue
        """
        self._queue = queue

    @property
    def original_attempt_run_id(self):
        """
        Gets the original_attempt_run_id of this JobRun.
        The OCID of the job.


        :return: The original_attempt_run_id of this JobRun.
        :rtype: str
        """
        return self._original_attempt_run_id

    @original_attempt_run_id.setter
    def original_attempt_run_id(self, original_attempt_run_id):
        """
        Sets the original_attempt_run_id of this JobRun.
        The OCID of the job.


        :param original_attempt_run_id: The original_attempt_run_id of this JobRun.
        :type: str
        """
        self._original_attempt_run_id = original_attempt_run_id

    @property
    def state(self):
        """
        Gets the state of this JobRun.

        :return: The state of this JobRun.
        :rtype: oci.aidataplatform_dp.models.State
        """
        return self._state

    @state.setter
    def state(self, state):
        """
        Sets the state of this JobRun.

        :param state: The state of this JobRun.
        :type: oci.aidataplatform_dp.models.State
        """
        self._state = state

    @property
    def schedule(self):
        """
        Gets the schedule of this JobRun.

        :return: The schedule of this JobRun.
        :rtype: oci.aidataplatform_dp.models.Schedule
        """
        return self._schedule

    @schedule.setter
    def schedule(self, schedule):
        """
        Sets the schedule of this JobRun.

        :param schedule: The schedule of this JobRun.
        :type: oci.aidataplatform_dp.models.Schedule
        """
        self._schedule = schedule

    @property
    def cluster_spec(self):
        """
        Gets the cluster_spec of this JobRun.

        :return: The cluster_spec of this JobRun.
        :rtype: oci.aidataplatform_dp.models.ClusterSpec
        """
        return self._cluster_spec

    @cluster_spec.setter
    def cluster_spec(self, cluster_spec):
        """
        Sets the cluster_spec of this JobRun.

        :param cluster_spec: The cluster_spec of this JobRun.
        :type: oci.aidataplatform_dp.models.ClusterSpec
        """
        self._cluster_spec = cluster_spec

    @property
    def cluster_instance(self):
        """
        Gets the cluster_instance of this JobRun.

        :return: The cluster_instance of this JobRun.
        :rtype: oci.aidataplatform_dp.models.ClusterInstance
        """
        return self._cluster_instance

    @cluster_instance.setter
    def cluster_instance(self, cluster_instance):
        """
        Sets the cluster_instance of this JobRun.

        :param cluster_instance: The cluster_instance of this JobRun.
        :type: oci.aidataplatform_dp.models.ClusterInstance
        """
        self._cluster_instance = cluster_instance

    @property
    def parameters(self):
        """
        Gets the parameters of this JobRun.
        An optional list of parameters.


        :return: The parameters of this JobRun.
        :rtype: list[oci.aidataplatform_dp.models.Parameter]
        """
        return self._parameters

    @parameters.setter
    def parameters(self, parameters):
        """
        Sets the parameters of this JobRun.
        An optional list of parameters.


        :param parameters: The parameters of this JobRun.
        :type: list[oci.aidataplatform_dp.models.Parameter]
        """
        self._parameters = parameters

    @property
    def unified_job_and_job_run_parameters(self):
        """
        Gets the unified_job_and_job_run_parameters of this JobRun.
        Unified List of job and job run parameters after resolving dynamic value references and parameter resolution as per precedence.


        :return: The unified_job_and_job_run_parameters of this JobRun.
        :rtype: list[oci.aidataplatform_dp.models.Parameter]
        """
        return self._unified_job_and_job_run_parameters

    @unified_job_and_job_run_parameters.setter
    def unified_job_and_job_run_parameters(self, unified_job_and_job_run_parameters):
        """
        Sets the unified_job_and_job_run_parameters of this JobRun.
        Unified List of job and job run parameters after resolving dynamic value references and parameter resolution as per precedence.


        :param unified_job_and_job_run_parameters: The unified_job_and_job_run_parameters of this JobRun.
        :type: list[oci.aidataplatform_dp.models.Parameter]
        """
        self._unified_job_and_job_run_parameters = unified_job_and_job_run_parameters

    @property
    def repair_history(self):
        """
        Gets the repair_history of this JobRun.
        Array of repaired runs.


        :return: The repair_history of this JobRun.
        :rtype: list[oci.aidataplatform_dp.models.RepairHistory]
        """
        return self._repair_history

    @repair_history.setter
    def repair_history(self, repair_history):
        """
        Sets the repair_history of this JobRun.
        Array of repaired runs.


        :param repair_history: The repair_history of this JobRun.
        :type: list[oci.aidataplatform_dp.models.RepairHistory]
        """
        self._repair_history = repair_history

    @property
    def system_parameters(self):
        """
        Gets the system_parameters of this JobRun.
        Map of system parameters with their values for this job run.


        :return: The system_parameters of this JobRun.
        :rtype: dict(str, str)
        """
        return self._system_parameters

    @system_parameters.setter
    def system_parameters(self, system_parameters):
        """
        Sets the system_parameters of this JobRun.
        Map of system parameters with their values for this job run.


        :param system_parameters: The system_parameters of this JobRun.
        :type: dict(str, str)
        """
        self._system_parameters = system_parameters

    @property
    def start_time(self):
        """
        Gets the start_time of this JobRun.
        The time at which the job execution started in epoch milliseconds.


        :return: The start_time of this JobRun.
        :rtype: int
        """
        return self._start_time

    @start_time.setter
    def start_time(self, start_time):
        """
        Sets the start_time of this JobRun.
        The time at which the job execution started in epoch milliseconds.


        :param start_time: The start_time of this JobRun.
        :type: int
        """
        self._start_time = start_time

    @property
    def end_time(self):
        """
        Gets the end_time of this JobRun.
        The time at which the job execution started in epoch milliseconds.


        :return: The end_time of this JobRun.
        :rtype: int
        """
        return self._end_time

    @end_time.setter
    def end_time(self, end_time):
        """
        Sets the end_time of this JobRun.
        The time at which the job execution started in epoch milliseconds.


        :param end_time: The end_time of this JobRun.
        :type: int
        """
        self._end_time = end_time

    @property
    def setup_duration(self):
        """
        Gets the setup_duration of this JobRun.
        The time (in milliseconds) taken to setup the cluster.


        :return: The setup_duration of this JobRun.
        :rtype: int
        """
        return self._setup_duration

    @setup_duration.setter
    def setup_duration(self, setup_duration):
        """
        Sets the setup_duration of this JobRun.
        The time (in milliseconds) taken to setup the cluster.


        :param setup_duration: The setup_duration of this JobRun.
        :type: int
        """
        self._setup_duration = setup_duration

    @property
    def execution_duration(self):
        """
        Gets the execution_duration of this JobRun.
        The time (in milliseconds) taken to complete the job execution.


        :return: The execution_duration of this JobRun.
        :rtype: int
        """
        return self._execution_duration

    @execution_duration.setter
    def execution_duration(self, execution_duration):
        """
        Sets the execution_duration of this JobRun.
        The time (in milliseconds) taken to complete the job execution.


        :param execution_duration: The execution_duration of this JobRun.
        :type: int
        """
        self._execution_duration = execution_duration

    @property
    def cleanup_duration(self):
        """
        Gets the cleanup_duration of this JobRun.
        The time (in milliseconds) taken to terminate the cluster and to clean up any associated artifacts.


        :return: The cleanup_duration of this JobRun.
        :rtype: int
        """
        return self._cleanup_duration

    @cleanup_duration.setter
    def cleanup_duration(self, cleanup_duration):
        """
        Sets the cleanup_duration of this JobRun.
        The time (in milliseconds) taken to terminate the cluster and to clean up any associated artifacts.


        :param cleanup_duration: The cleanup_duration of this JobRun.
        :type: int
        """
        self._cleanup_duration = cleanup_duration

    @property
    def run_duration(self):
        """
        Gets the run_duration of this JobRun.
        The time (in milliseconds) taken to complete the job execution and all its repairs to finish.


        :return: The run_duration of this JobRun.
        :rtype: int
        """
        return self._run_duration

    @run_duration.setter
    def run_duration(self, run_duration):
        """
        Sets the run_duration of this JobRun.
        The time (in milliseconds) taken to complete the job execution and all its repairs to finish.


        :param run_duration: The run_duration of this JobRun.
        :type: int
        """
        self._run_duration = run_duration

    @property
    def time_created(self):
        """
        Gets the time_created of this JobRun.
        The time at which the job execution started.


        :return: The time_created of this JobRun.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this JobRun.
        The time at which the job execution started.


        :param time_created: The time_created of this JobRun.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this JobRun.
        The time at which the job execution was updated.


        :return: The time_updated of this JobRun.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this JobRun.
        The time at which the job execution was updated.


        :param time_updated: The time_updated of this JobRun.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def launched(self):
        """
        Gets the launched of this JobRun.
        Identify job run launched by schedule or manually.

        Allowed values for this property are: "SCHEDULED", "MANUAL", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The launched of this JobRun.
        :rtype: str
        """
        return self._launched

    @launched.setter
    def launched(self, launched):
        """
        Sets the launched of this JobRun.
        Identify job run launched by schedule or manually.


        :param launched: The launched of this JobRun.
        :type: str
        """
        allowed_values = ["SCHEDULED", "MANUAL"]
        if not value_allowed_none_or_none_sentinel(launched, allowed_values):
            launched = 'UNKNOWN_ENUM_VALUE'
        self._launched = launched

    @property
    def version(self):
        """
        Gets the version of this JobRun.
        Current version of job run object in repository.


        :return: The version of this JobRun.
        :rtype: int
        """
        return self._version

    @version.setter
    def version(self, version):
        """
        Sets the version of this JobRun.
        Current version of job run object in repository.


        :param version: The version of this JobRun.
        :type: int
        """
        self._version = version

    @property
    def task_to_task_run_map(self):
        """
        Gets the task_to_task_run_map of this JobRun.
        Task to TaskRun map for given job run.


        :return: The task_to_task_run_map of this JobRun.
        :rtype: dict(str, str)
        """
        return self._task_to_task_run_map

    @task_to_task_run_map.setter
    def task_to_task_run_map(self, task_to_task_run_map):
        """
        Sets the task_to_task_run_map of this JobRun.
        Task to TaskRun map for given job run.


        :param task_to_task_run_map: The task_to_task_run_map of this JobRun.
        :type: dict(str, str)
        """
        self._task_to_task_run_map = task_to_task_run_map

    @property
    def task_run_summary_map(self):
        """
        Gets the task_run_summary_map of this JobRun.
        TaskRun to TaskRunSummary map for given job run.


        :return: The task_run_summary_map of this JobRun.
        :rtype: dict(str, object)
        """
        return self._task_run_summary_map

    @task_run_summary_map.setter
    def task_run_summary_map(self, task_run_summary_map):
        """
        Sets the task_run_summary_map of this JobRun.
        TaskRun to TaskRunSummary map for given job run.


        :param task_run_summary_map: The task_run_summary_map of this JobRun.
        :type: dict(str, object)
        """
        self._task_run_summary_map = task_run_summary_map

    @property
    def timeout_seconds(self):
        """
        Gets the timeout_seconds of this JobRun.
        An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value.


        :return: The timeout_seconds of this JobRun.
        :rtype: int
        """
        return self._timeout_seconds

    @timeout_seconds.setter
    def timeout_seconds(self, timeout_seconds):
        """
        Sets the timeout_seconds of this JobRun.
        An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value.


        :param timeout_seconds: The timeout_seconds of this JobRun.
        :type: int
        """
        self._timeout_seconds = timeout_seconds

    @property
    def repaired_tasks(self):
        """
        Gets the repaired_tasks of this JobRun.
        A list of repaired tasks.


        :return: The repaired_tasks of this JobRun.
        :rtype: list[str]
        """
        return self._repaired_tasks

    @repaired_tasks.setter
    def repaired_tasks(self, repaired_tasks):
        """
        Sets the repaired_tasks of this JobRun.
        A list of repaired tasks.


        :param repaired_tasks: The repaired_tasks of this JobRun.
        :type: list[str]
        """
        self._repaired_tasks = repaired_tasks

    @property
    def repair_mode(self):
        """
        Gets the repair_mode of this JobRun.
        Repair mode to be used for this repair scope.

        Allowed values for this property are: "RESUME", "RERUN", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The repair_mode of this JobRun.
        :rtype: str
        """
        return self._repair_mode

    @repair_mode.setter
    def repair_mode(self, repair_mode):
        """
        Sets the repair_mode of this JobRun.
        Repair mode to be used for this repair scope.


        :param repair_mode: The repair_mode of this JobRun.
        :type: str
        """
        allowed_values = ["RESUME", "RERUN"]
        if not value_allowed_none_or_none_sentinel(repair_mode, allowed_values):
            repair_mode = 'UNKNOWN_ENUM_VALUE'
        self._repair_mode = repair_mode

    @property
    def lifecycle_states(self):
        """
        Gets the lifecycle_states of this JobRun.
        The collection of lifecycle states.


        :return: The lifecycle_states of this JobRun.
        :rtype: list[oci.aidataplatform_dp.models.LifecycleState]
        """
        return self._lifecycle_states

    @lifecycle_states.setter
    def lifecycle_states(self, lifecycle_states):
        """
        Sets the lifecycle_states of this JobRun.
        The collection of lifecycle states.


        :param lifecycle_states: The lifecycle_states of this JobRun.
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
