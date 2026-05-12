# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class TaskRunSummary(object):
    """
    Summary information about a TaskRun.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new TaskRunSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this TaskRunSummary.
        :type key: str

        :param name:
            The value to assign to the name property of this TaskRunSummary.
        :type name: str

        :param task_key:
            The value to assign to the task_key property of this TaskRunSummary.
        :type task_key: str

        :param job_run_key:
            The value to assign to the job_run_key property of this TaskRunSummary.
        :type job_run_key: str

        :param parent_job_run_key:
            The value to assign to the parent_job_run_key property of this TaskRunSummary.
        :type parent_job_run_key: str

        :param root_job_run_key:
            The value to assign to the root_job_run_key property of this TaskRunSummary.
        :type root_job_run_key: str

        :param cluster_validation_start_time:
            The value to assign to the cluster_validation_start_time property of this TaskRunSummary.
        :type cluster_validation_start_time: int

        :param start_time:
            The value to assign to the start_time property of this TaskRunSummary.
        :type start_time: int

        :param end_time:
            The value to assign to the end_time property of this TaskRunSummary.
        :type end_time: int

        :param state:
            The value to assign to the state property of this TaskRunSummary.
        :type state: oci.aidataplatform_dp.models.State

        :param external_id:
            The value to assign to the external_id property of this TaskRunSummary.
        :type external_id: str

        :param retry_attempt:
            The value to assign to the retry_attempt property of this TaskRunSummary.
        :type retry_attempt: int

        """
        self.swagger_types = {
            'key': 'str',
            'name': 'str',
            'task_key': 'str',
            'job_run_key': 'str',
            'parent_job_run_key': 'str',
            'root_job_run_key': 'str',
            'cluster_validation_start_time': 'int',
            'start_time': 'int',
            'end_time': 'int',
            'state': 'State',
            'external_id': 'str',
            'retry_attempt': 'int'
        }

        self.attribute_map = {
            'key': 'key',
            'name': 'name',
            'task_key': 'taskKey',
            'job_run_key': 'jobRunKey',
            'parent_job_run_key': 'parentJobRunKey',
            'root_job_run_key': 'rootJobRunKey',
            'cluster_validation_start_time': 'clusterValidationStartTime',
            'start_time': 'startTime',
            'end_time': 'endTime',
            'state': 'state',
            'external_id': 'externalId',
            'retry_attempt': 'retryAttempt'
        }

        self._key = None
        self._name = None
        self._task_key = None
        self._job_run_key = None
        self._parent_job_run_key = None
        self._root_job_run_key = None
        self._cluster_validation_start_time = None
        self._start_time = None
        self._end_time = None
        self._state = None
        self._external_id = None
        self._retry_attempt = None

    @property
    def key(self):
        """
        Gets the key of this TaskRunSummary.
        The OCID of the TaskRun.


        :return: The key of this TaskRunSummary.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this TaskRunSummary.
        The OCID of the TaskRun.


        :param key: The key of this TaskRunSummary.
        :type: str
        """
        self._key = key

    @property
    def name(self):
        """
        Gets the name of this TaskRunSummary.
        A user-friendly name. Does not have to be unique, and is changeable.


        :return: The name of this TaskRunSummary.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this TaskRunSummary.
        A user-friendly name. Does not have to be unique, and is changeable.


        :param name: The name of this TaskRunSummary.
        :type: str
        """
        self._name = name

    @property
    def task_key(self):
        """
        Gets the task_key of this TaskRunSummary.
        The display name of the task. User can specify a value for this.


        :return: The task_key of this TaskRunSummary.
        :rtype: str
        """
        return self._task_key

    @task_key.setter
    def task_key(self, task_key):
        """
        Sets the task_key of this TaskRunSummary.
        The display name of the task. User can specify a value for this.


        :param task_key: The task_key of this TaskRunSummary.
        :type: str
        """
        self._task_key = task_key

    @property
    def job_run_key(self):
        """
        Gets the job_run_key of this TaskRunSummary.
        The OCID of the job.


        :return: The job_run_key of this TaskRunSummary.
        :rtype: str
        """
        return self._job_run_key

    @job_run_key.setter
    def job_run_key(self, job_run_key):
        """
        Sets the job_run_key of this TaskRunSummary.
        The OCID of the job.


        :param job_run_key: The job_run_key of this TaskRunSummary.
        :type: str
        """
        self._job_run_key = job_run_key

    @property
    def parent_job_run_key(self):
        """
        Gets the parent_job_run_key of this TaskRunSummary.
        The OCID of the job.


        :return: The parent_job_run_key of this TaskRunSummary.
        :rtype: str
        """
        return self._parent_job_run_key

    @parent_job_run_key.setter
    def parent_job_run_key(self, parent_job_run_key):
        """
        Sets the parent_job_run_key of this TaskRunSummary.
        The OCID of the job.


        :param parent_job_run_key: The parent_job_run_key of this TaskRunSummary.
        :type: str
        """
        self._parent_job_run_key = parent_job_run_key

    @property
    def root_job_run_key(self):
        """
        Gets the root_job_run_key of this TaskRunSummary.
        The OCID of the job.


        :return: The root_job_run_key of this TaskRunSummary.
        :rtype: str
        """
        return self._root_job_run_key

    @root_job_run_key.setter
    def root_job_run_key(self, root_job_run_key):
        """
        Sets the root_job_run_key of this TaskRunSummary.
        The OCID of the job.


        :param root_job_run_key: The root_job_run_key of this TaskRunSummary.
        :type: str
        """
        self._root_job_run_key = root_job_run_key

    @property
    def cluster_validation_start_time(self):
        """
        Gets the cluster_validation_start_time of this TaskRunSummary.
        The time at which the cluster validation started in epoch milliseconds.


        :return: The cluster_validation_start_time of this TaskRunSummary.
        :rtype: int
        """
        return self._cluster_validation_start_time

    @cluster_validation_start_time.setter
    def cluster_validation_start_time(self, cluster_validation_start_time):
        """
        Sets the cluster_validation_start_time of this TaskRunSummary.
        The time at which the cluster validation started in epoch milliseconds.


        :param cluster_validation_start_time: The cluster_validation_start_time of this TaskRunSummary.
        :type: int
        """
        self._cluster_validation_start_time = cluster_validation_start_time

    @property
    def start_time(self):
        """
        Gets the start_time of this TaskRunSummary.
        The time at which the job execution started in epoch milliseconds.


        :return: The start_time of this TaskRunSummary.
        :rtype: int
        """
        return self._start_time

    @start_time.setter
    def start_time(self, start_time):
        """
        Sets the start_time of this TaskRunSummary.
        The time at which the job execution started in epoch milliseconds.


        :param start_time: The start_time of this TaskRunSummary.
        :type: int
        """
        self._start_time = start_time

    @property
    def end_time(self):
        """
        Gets the end_time of this TaskRunSummary.
        The time at which the job execution started in epoch milliseconds.


        :return: The end_time of this TaskRunSummary.
        :rtype: int
        """
        return self._end_time

    @end_time.setter
    def end_time(self, end_time):
        """
        Sets the end_time of this TaskRunSummary.
        The time at which the job execution started in epoch milliseconds.


        :param end_time: The end_time of this TaskRunSummary.
        :type: int
        """
        self._end_time = end_time

    @property
    def state(self):
        """
        Gets the state of this TaskRunSummary.

        :return: The state of this TaskRunSummary.
        :rtype: oci.aidataplatform_dp.models.State
        """
        return self._state

    @state.setter
    def state(self, state):
        """
        Sets the state of this TaskRunSummary.

        :param state: The state of this TaskRunSummary.
        :type: oci.aidataplatform_dp.models.State
        """
        self._state = state

    @property
    def external_id(self):
        """
        Gets the external_id of this TaskRunSummary.
        The external ID of the task execution.


        :return: The external_id of this TaskRunSummary.
        :rtype: str
        """
        return self._external_id

    @external_id.setter
    def external_id(self, external_id):
        """
        Sets the external_id of this TaskRunSummary.
        The external ID of the task execution.


        :param external_id: The external_id of this TaskRunSummary.
        :type: str
        """
        self._external_id = external_id

    @property
    def retry_attempt(self):
        """
        Gets the retry_attempt of this TaskRunSummary.
        Sequence number of the current retry attempt. 0 for the original. 1, 2, 3, ... for subsequent retry attempts.


        :return: The retry_attempt of this TaskRunSummary.
        :rtype: int
        """
        return self._retry_attempt

    @retry_attempt.setter
    def retry_attempt(self, retry_attempt):
        """
        Sets the retry_attempt of this TaskRunSummary.
        Sequence number of the current retry attempt. 0 for the original. 1, 2, 3, ... for subsequent retry attempts.


        :param retry_attempt: The retry_attempt of this TaskRunSummary.
        :type: int
        """
        self._retry_attempt = retry_attempt

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
