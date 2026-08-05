# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class Job(object):
    """
    A description of a Job.
    To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized, talk to
    an administrator. If you're an administrator who needs to write policies to give users access, see
    `Getting Started with Policies`__.

    __ https://docs.cloud.oracle.com/iaas/Content/Identity/policiesgs/get-started-with-policies.htm
    """

    def __init__(self, **kwargs):
        """
        Initializes a new Job object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this Job.
        :type key: str

        :param created_by:
            The value to assign to the created_by property of this Job.
        :type created_by: str

        :param created_by_name:
            The value to assign to the created_by_name property of this Job.
        :type created_by_name: str

        :param updated_by:
            The value to assign to the updated_by property of this Job.
        :type updated_by: str

        :param updated_by_name:
            The value to assign to the updated_by_name property of this Job.
        :type updated_by_name: str

        :param run_as:
            The value to assign to the run_as property of this Job.
        :type run_as: str

        :param name:
            The value to assign to the name property of this Job.
        :type name: str

        :param description:
            The value to assign to the description property of this Job.
        :type description: str

        :param schedule:
            The value to assign to the schedule property of this Job.
        :type schedule: oci.aidataplatform_dp.models.Schedule

        :param continuous:
            The value to assign to the continuous property of this Job.
        :type continuous: oci.aidataplatform_dp.models.Continuous

        :param max_concurrent_runs:
            The value to assign to the max_concurrent_runs property of this Job.
        :type max_concurrent_runs: int

        :param git_config:
            The value to assign to the git_config property of this Job.
        :type git_config: oci.aidataplatform_dp.models.GitConfig

        :param queue:
            The value to assign to the queue property of this Job.
        :type queue: oci.aidataplatform_dp.models.Queue

        :param path:
            The value to assign to the path property of this Job.
        :type path: str

        :param job_clusters:
            The value to assign to the job_clusters property of this Job.
        :type job_clusters: list[oci.aidataplatform_dp.models.JobCluster]

        :param tasks:
            The value to assign to the tasks property of this Job.
        :type tasks: list[oci.aidataplatform_dp.models.Task]

        :param time_created:
            The value to assign to the time_created property of this Job.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this Job.
        :type time_updated: datetime

        :param parameters:
            The value to assign to the parameters property of this Job.
        :type parameters: list[oci.aidataplatform_dp.models.Parameter]

        :param timeout_seconds:
            The value to assign to the timeout_seconds property of this Job.
        :type timeout_seconds: int

        """
        self.swagger_types = {
            'key': 'str',
            'created_by': 'str',
            'created_by_name': 'str',
            'updated_by': 'str',
            'updated_by_name': 'str',
            'run_as': 'str',
            'name': 'str',
            'description': 'str',
            'schedule': 'Schedule',
            'continuous': 'Continuous',
            'max_concurrent_runs': 'int',
            'git_config': 'GitConfig',
            'queue': 'Queue',
            'path': 'str',
            'job_clusters': 'list[JobCluster]',
            'tasks': 'list[Task]',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'parameters': 'list[Parameter]',
            'timeout_seconds': 'int'
        }

        self.attribute_map = {
            'key': 'key',
            'created_by': 'createdBy',
            'created_by_name': 'createdByName',
            'updated_by': 'updatedBy',
            'updated_by_name': 'updatedByName',
            'run_as': 'runAs',
            'name': 'name',
            'description': 'description',
            'schedule': 'schedule',
            'continuous': 'continuous',
            'max_concurrent_runs': 'maxConcurrentRuns',
            'git_config': 'gitConfig',
            'queue': 'queue',
            'path': 'path',
            'job_clusters': 'jobClusters',
            'tasks': 'tasks',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'parameters': 'parameters',
            'timeout_seconds': 'timeoutSeconds'
        }

        self._key = None
        self._created_by = None
        self._created_by_name = None
        self._updated_by = None
        self._updated_by_name = None
        self._run_as = None
        self._name = None
        self._description = None
        self._schedule = None
        self._continuous = None
        self._max_concurrent_runs = None
        self._git_config = None
        self._queue = None
        self._path = None
        self._job_clusters = None
        self._tasks = None
        self._time_created = None
        self._time_updated = None
        self._parameters = None
        self._timeout_seconds = None

    @property
    def key(self):
        """
        **[Required]** Gets the key of this Job.
        The OCID of the job.


        :return: The key of this Job.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this Job.
        The OCID of the job.


        :param key: The key of this Job.
        :type: str
        """
        self._key = key

    @property
    def created_by(self):
        """
        **[Required]** Gets the created_by of this Job.
        The OCID of the IAM user.


        :return: The created_by of this Job.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this Job.
        The OCID of the IAM user.


        :param created_by: The created_by of this Job.
        :type: str
        """
        self._created_by = created_by

    @property
    def created_by_name(self):
        """
        Gets the created_by_name of this Job.
        Name of the user who created this record


        :return: The created_by_name of this Job.
        :rtype: str
        """
        return self._created_by_name

    @created_by_name.setter
    def created_by_name(self, created_by_name):
        """
        Sets the created_by_name of this Job.
        Name of the user who created this record


        :param created_by_name: The created_by_name of this Job.
        :type: str
        """
        self._created_by_name = created_by_name

    @property
    def updated_by(self):
        """
        Gets the updated_by of this Job.
        The username of the latest updater. The OCID of the IAM user.


        :return: The updated_by of this Job.
        :rtype: str
        """
        return self._updated_by

    @updated_by.setter
    def updated_by(self, updated_by):
        """
        Sets the updated_by of this Job.
        The username of the latest updater. The OCID of the IAM user.


        :param updated_by: The updated_by of this Job.
        :type: str
        """
        self._updated_by = updated_by

    @property
    def updated_by_name(self):
        """
        Gets the updated_by_name of this Job.
        Name of the user who updated this record.


        :return: The updated_by_name of this Job.
        :rtype: str
        """
        return self._updated_by_name

    @updated_by_name.setter
    def updated_by_name(self, updated_by_name):
        """
        Sets the updated_by_name of this Job.
        Name of the user who updated this record.


        :param updated_by_name: The updated_by_name of this Job.
        :type: str
        """
        self._updated_by_name = updated_by_name

    @property
    def run_as(self):
        """
        Gets the run_as of this Job.
        This points to the user or service account executing the job.


        :return: The run_as of this Job.
        :rtype: str
        """
        return self._run_as

    @run_as.setter
    def run_as(self, run_as):
        """
        Sets the run_as of this Job.
        This points to the user or service account executing the job.


        :param run_as: The run_as of this Job.
        :type: str
        """
        self._run_as = run_as

    @property
    def name(self):
        """
        **[Required]** Gets the name of this Job.
        A user-friendly name. Does not have to be unique, and is changeable.


        :return: The name of this Job.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this Job.
        A user-friendly name. Does not have to be unique, and is changeable.


        :param name: The name of this Job.
        :type: str
        """
        self._name = name

    @property
    def description(self):
        """
        Gets the description of this Job.
        A description for the job.


        :return: The description of this Job.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this Job.
        A description for the job.


        :param description: The description of this Job.
        :type: str
        """
        self._description = description

    @property
    def schedule(self):
        """
        Gets the schedule of this Job.

        :return: The schedule of this Job.
        :rtype: oci.aidataplatform_dp.models.Schedule
        """
        return self._schedule

    @schedule.setter
    def schedule(self, schedule):
        """
        Sets the schedule of this Job.

        :param schedule: The schedule of this Job.
        :type: oci.aidataplatform_dp.models.Schedule
        """
        self._schedule = schedule

    @property
    def continuous(self):
        """
        Gets the continuous of this Job.

        :return: The continuous of this Job.
        :rtype: oci.aidataplatform_dp.models.Continuous
        """
        return self._continuous

    @continuous.setter
    def continuous(self, continuous):
        """
        Sets the continuous of this Job.

        :param continuous: The continuous of this Job.
        :type: oci.aidataplatform_dp.models.Continuous
        """
        self._continuous = continuous

    @property
    def max_concurrent_runs(self):
        """
        Gets the max_concurrent_runs of this Job.
        Indicates the number of executions for the same job that can be run concurrently. The maximum value cannot exceed 1000.


        :return: The max_concurrent_runs of this Job.
        :rtype: int
        """
        return self._max_concurrent_runs

    @max_concurrent_runs.setter
    def max_concurrent_runs(self, max_concurrent_runs):
        """
        Sets the max_concurrent_runs of this Job.
        Indicates the number of executions for the same job that can be run concurrently. The maximum value cannot exceed 1000.


        :param max_concurrent_runs: The max_concurrent_runs of this Job.
        :type: int
        """
        self._max_concurrent_runs = max_concurrent_runs

    @property
    def git_config(self):
        """
        Gets the git_config of this Job.

        :return: The git_config of this Job.
        :rtype: oci.aidataplatform_dp.models.GitConfig
        """
        return self._git_config

    @git_config.setter
    def git_config(self, git_config):
        """
        Sets the git_config of this Job.

        :param git_config: The git_config of this Job.
        :type: oci.aidataplatform_dp.models.GitConfig
        """
        self._git_config = git_config

    @property
    def queue(self):
        """
        Gets the queue of this Job.

        :return: The queue of this Job.
        :rtype: oci.aidataplatform_dp.models.Queue
        """
        return self._queue

    @queue.setter
    def queue(self, queue):
        """
        Sets the queue of this Job.

        :param queue: The queue of this Job.
        :type: oci.aidataplatform_dp.models.Queue
        """
        self._queue = queue

    @property
    def path(self):
        """
        Gets the path of this Job.
        The path to store the job definition in.


        :return: The path of this Job.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path):
        """
        Sets the path of this Job.
        The path to store the job definition in.


        :param path: The path of this Job.
        :type: str
        """
        self._path = path

    @property
    def job_clusters(self):
        """
        Gets the job_clusters of this Job.
        List of job cluster configurations.


        :return: The job_clusters of this Job.
        :rtype: list[oci.aidataplatform_dp.models.JobCluster]
        """
        return self._job_clusters

    @job_clusters.setter
    def job_clusters(self, job_clusters):
        """
        Sets the job_clusters of this Job.
        List of job cluster configurations.


        :param job_clusters: The job_clusters of this Job.
        :type: list[oci.aidataplatform_dp.models.JobCluster]
        """
        self._job_clusters = job_clusters

    @property
    def tasks(self):
        """
        Gets the tasks of this Job.
        List of tasks in a job.


        :return: The tasks of this Job.
        :rtype: list[oci.aidataplatform_dp.models.Task]
        """
        return self._tasks

    @tasks.setter
    def tasks(self, tasks):
        """
        Sets the tasks of this Job.
        List of tasks in a job.


        :param tasks: The tasks of this Job.
        :type: list[oci.aidataplatform_dp.models.Task]
        """
        self._tasks = tasks

    @property
    def time_created(self):
        """
        Gets the time_created of this Job.
        The date and time the DataLake was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2025-05-25T21:10:29.600Z`


        :return: The time_created of this Job.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this Job.
        The date and time the DataLake was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2025-05-25T21:10:29.600Z`


        :param time_created: The time_created of this Job.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this Job.
        The date and time the DataLake was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2025-05-25T21:10:29.600Z`


        :return: The time_updated of this Job.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this Job.
        The date and time the DataLake was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2025-05-25T21:10:29.600Z`


        :param time_updated: The time_updated of this Job.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def parameters(self):
        """
        Gets the parameters of this Job.
        An optional list of parameters.


        :return: The parameters of this Job.
        :rtype: list[oci.aidataplatform_dp.models.Parameter]
        """
        return self._parameters

    @parameters.setter
    def parameters(self, parameters):
        """
        Sets the parameters of this Job.
        An optional list of parameters.


        :param parameters: The parameters of this Job.
        :type: list[oci.aidataplatform_dp.models.Parameter]
        """
        self._parameters = parameters

    @property
    def timeout_seconds(self):
        """
        Gets the timeout_seconds of this Job.
        An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value.


        :return: The timeout_seconds of this Job.
        :rtype: int
        """
        return self._timeout_seconds

    @timeout_seconds.setter
    def timeout_seconds(self, timeout_seconds):
        """
        Sets the timeout_seconds of this Job.
        An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value.


        :param timeout_seconds: The timeout_seconds of this Job.
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
