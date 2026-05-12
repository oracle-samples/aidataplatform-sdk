# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdateJobDetails(object):
    """
    The data to update a job.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new UpdateJobDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param run_as:
            The value to assign to the run_as property of this UpdateJobDetails.
        :type run_as: str

        :param name:
            The value to assign to the name property of this UpdateJobDetails.
        :type name: str

        :param description:
            The value to assign to the description property of this UpdateJobDetails.
        :type description: str

        :param schedule:
            The value to assign to the schedule property of this UpdateJobDetails.
        :type schedule: oci.aidataplatform_dp.models.Schedule

        :param continuous:
            The value to assign to the continuous property of this UpdateJobDetails.
        :type continuous: oci.aidataplatform_dp.models.Continuous

        :param max_concurrent_runs:
            The value to assign to the max_concurrent_runs property of this UpdateJobDetails.
        :type max_concurrent_runs: int

        :param git_config:
            The value to assign to the git_config property of this UpdateJobDetails.
        :type git_config: oci.aidataplatform_dp.models.GitConfig

        :param queue:
            The value to assign to the queue property of this UpdateJobDetails.
        :type queue: oci.aidataplatform_dp.models.Queue

        :param job_clusters:
            The value to assign to the job_clusters property of this UpdateJobDetails.
        :type job_clusters: list[oci.aidataplatform_dp.models.JobCluster]

        :param path:
            The value to assign to the path property of this UpdateJobDetails.
        :type path: str

        :param tasks:
            The value to assign to the tasks property of this UpdateJobDetails.
        :type tasks: list[oci.aidataplatform_dp.models.Task]

        :param parameters:
            The value to assign to the parameters property of this UpdateJobDetails.
        :type parameters: list[oci.aidataplatform_dp.models.Parameter]

        :param timeout_seconds:
            The value to assign to the timeout_seconds property of this UpdateJobDetails.
        :type timeout_seconds: int

        """
        self.swagger_types = {
            'run_as': 'str',
            'name': 'str',
            'description': 'str',
            'schedule': 'Schedule',
            'continuous': 'Continuous',
            'max_concurrent_runs': 'int',
            'git_config': 'GitConfig',
            'queue': 'Queue',
            'job_clusters': 'list[JobCluster]',
            'path': 'str',
            'tasks': 'list[Task]',
            'parameters': 'list[Parameter]',
            'timeout_seconds': 'int'
        }

        self.attribute_map = {
            'run_as': 'runAs',
            'name': 'name',
            'description': 'description',
            'schedule': 'schedule',
            'continuous': 'continuous',
            'max_concurrent_runs': 'maxConcurrentRuns',
            'git_config': 'gitConfig',
            'queue': 'queue',
            'job_clusters': 'jobClusters',
            'path': 'path',
            'tasks': 'tasks',
            'parameters': 'parameters',
            'timeout_seconds': 'timeoutSeconds'
        }

        self._run_as = None
        self._name = None
        self._description = None
        self._schedule = None
        self._continuous = None
        self._max_concurrent_runs = None
        self._git_config = None
        self._queue = None
        self._job_clusters = None
        self._path = None
        self._tasks = None
        self._parameters = None
        self._timeout_seconds = None

    @property
    def run_as(self):
        """
        Gets the run_as of this UpdateJobDetails.
        The id with which the job run as.


        :return: The run_as of this UpdateJobDetails.
        :rtype: str
        """
        return self._run_as

    @run_as.setter
    def run_as(self, run_as):
        """
        Sets the run_as of this UpdateJobDetails.
        The id with which the job run as.


        :param run_as: The run_as of this UpdateJobDetails.
        :type: str
        """
        self._run_as = run_as

    @property
    def name(self):
        """
        **[Required]** Gets the name of this UpdateJobDetails.
        A user-friendly name. Does not have to be unique, and is changeable.


        :return: The name of this UpdateJobDetails.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this UpdateJobDetails.
        A user-friendly name. Does not have to be unique, and is changeable.


        :param name: The name of this UpdateJobDetails.
        :type: str
        """
        self._name = name

    @property
    def description(self):
        """
        Gets the description of this UpdateJobDetails.
        A description for the job.


        :return: The description of this UpdateJobDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this UpdateJobDetails.
        A description for the job.


        :param description: The description of this UpdateJobDetails.
        :type: str
        """
        self._description = description

    @property
    def schedule(self):
        """
        Gets the schedule of this UpdateJobDetails.

        :return: The schedule of this UpdateJobDetails.
        :rtype: oci.aidataplatform_dp.models.Schedule
        """
        return self._schedule

    @schedule.setter
    def schedule(self, schedule):
        """
        Sets the schedule of this UpdateJobDetails.

        :param schedule: The schedule of this UpdateJobDetails.
        :type: oci.aidataplatform_dp.models.Schedule
        """
        self._schedule = schedule

    @property
    def continuous(self):
        """
        Gets the continuous of this UpdateJobDetails.

        :return: The continuous of this UpdateJobDetails.
        :rtype: oci.aidataplatform_dp.models.Continuous
        """
        return self._continuous

    @continuous.setter
    def continuous(self, continuous):
        """
        Sets the continuous of this UpdateJobDetails.

        :param continuous: The continuous of this UpdateJobDetails.
        :type: oci.aidataplatform_dp.models.Continuous
        """
        self._continuous = continuous

    @property
    def max_concurrent_runs(self):
        """
        Gets the max_concurrent_runs of this UpdateJobDetails.
        Indicates the number of executions for the same job that can be run concurrently. The maximum value cannot exceed 1000.


        :return: The max_concurrent_runs of this UpdateJobDetails.
        :rtype: int
        """
        return self._max_concurrent_runs

    @max_concurrent_runs.setter
    def max_concurrent_runs(self, max_concurrent_runs):
        """
        Sets the max_concurrent_runs of this UpdateJobDetails.
        Indicates the number of executions for the same job that can be run concurrently. The maximum value cannot exceed 1000.


        :param max_concurrent_runs: The max_concurrent_runs of this UpdateJobDetails.
        :type: int
        """
        self._max_concurrent_runs = max_concurrent_runs

    @property
    def git_config(self):
        """
        Gets the git_config of this UpdateJobDetails.

        :return: The git_config of this UpdateJobDetails.
        :rtype: oci.aidataplatform_dp.models.GitConfig
        """
        return self._git_config

    @git_config.setter
    def git_config(self, git_config):
        """
        Sets the git_config of this UpdateJobDetails.

        :param git_config: The git_config of this UpdateJobDetails.
        :type: oci.aidataplatform_dp.models.GitConfig
        """
        self._git_config = git_config

    @property
    def queue(self):
        """
        Gets the queue of this UpdateJobDetails.

        :return: The queue of this UpdateJobDetails.
        :rtype: oci.aidataplatform_dp.models.Queue
        """
        return self._queue

    @queue.setter
    def queue(self, queue):
        """
        Sets the queue of this UpdateJobDetails.

        :param queue: The queue of this UpdateJobDetails.
        :type: oci.aidataplatform_dp.models.Queue
        """
        self._queue = queue

    @property
    def job_clusters(self):
        """
        Gets the job_clusters of this UpdateJobDetails.
        List of job cluster configurations.


        :return: The job_clusters of this UpdateJobDetails.
        :rtype: list[oci.aidataplatform_dp.models.JobCluster]
        """
        return self._job_clusters

    @job_clusters.setter
    def job_clusters(self, job_clusters):
        """
        Sets the job_clusters of this UpdateJobDetails.
        List of job cluster configurations.


        :param job_clusters: The job_clusters of this UpdateJobDetails.
        :type: list[oci.aidataplatform_dp.models.JobCluster]
        """
        self._job_clusters = job_clusters

    @property
    def path(self):
        """
        Gets the path of this UpdateJobDetails.
        The path to store the job definition in.


        :return: The path of this UpdateJobDetails.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path):
        """
        Sets the path of this UpdateJobDetails.
        The path to store the job definition in.


        :param path: The path of this UpdateJobDetails.
        :type: str
        """
        self._path = path

    @property
    def tasks(self):
        """
        Gets the tasks of this UpdateJobDetails.
        List of tasks in a job.


        :return: The tasks of this UpdateJobDetails.
        :rtype: list[oci.aidataplatform_dp.models.Task]
        """
        return self._tasks

    @tasks.setter
    def tasks(self, tasks):
        """
        Sets the tasks of this UpdateJobDetails.
        List of tasks in a job.


        :param tasks: The tasks of this UpdateJobDetails.
        :type: list[oci.aidataplatform_dp.models.Task]
        """
        self._tasks = tasks

    @property
    def parameters(self):
        """
        Gets the parameters of this UpdateJobDetails.
        An optional list of parameters.


        :return: The parameters of this UpdateJobDetails.
        :rtype: list[oci.aidataplatform_dp.models.Parameter]
        """
        return self._parameters

    @parameters.setter
    def parameters(self, parameters):
        """
        Sets the parameters of this UpdateJobDetails.
        An optional list of parameters.


        :param parameters: The parameters of this UpdateJobDetails.
        :type: list[oci.aidataplatform_dp.models.Parameter]
        """
        self._parameters = parameters

    @property
    def timeout_seconds(self):
        """
        Gets the timeout_seconds of this UpdateJobDetails.
        An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value.


        :return: The timeout_seconds of this UpdateJobDetails.
        :rtype: int
        """
        return self._timeout_seconds

    @timeout_seconds.setter
    def timeout_seconds(self, timeout_seconds):
        """
        Sets the timeout_seconds of this UpdateJobDetails.
        An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value.


        :param timeout_seconds: The timeout_seconds of this UpdateJobDetails.
        :type: int
        """
        self._timeout_seconds = timeout_seconds

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
