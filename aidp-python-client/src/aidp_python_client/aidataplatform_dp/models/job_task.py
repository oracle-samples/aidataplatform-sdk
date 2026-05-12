# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.

from .task import Task
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class JobTask(Task):
    """
    The information about the job task.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new JobTask object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.JobTask.type` attribute
        of this class is ``JOB_TASK`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this JobTask.
            Allowed values for this property are: "NOTEBOOK_TASK", "PYTHON_TASK", "SPARK_SUBMIT_TASK", "IF_ELSE_TASK", "JOB_TASK", "JAR_TASK"
        :type type: str

        :param task_key:
            The value to assign to the task_key property of this JobTask.
        :type task_key: str

        :param depends_on:
            The value to assign to the depends_on property of this JobTask.
        :type depends_on: list[oci.aidataplatform_dp.models.DependsOn]

        :param run_if:
            The value to assign to the run_if property of this JobTask.
            Allowed values for this property are: "ALL_SUCCESS", "ALL_DONE", "NONE_FAILED", "AT_LEAST_ONE_SUCCESS", "ALL_FAILED", "AT_LEAST_ONE_FAILED"
        :type run_if: str

        :param max_retries:
            The value to assign to the max_retries property of this JobTask.
        :type max_retries: int

        :param min_retry_interval_millis:
            The value to assign to the min_retry_interval_millis property of this JobTask.
        :type min_retry_interval_millis: int

        :param is_retry_on_timeout:
            The value to assign to the is_retry_on_timeout property of this JobTask.
        :type is_retry_on_timeout: bool

        :param job_key:
            The value to assign to the job_key property of this JobTask.
        :type job_key: str

        :param parameters:
            The value to assign to the parameters property of this JobTask.
        :type parameters: list[oci.aidataplatform_dp.models.Parameter]

        :param timeout_seconds:
            The value to assign to the timeout_seconds property of this JobTask.
        :type timeout_seconds: int

        """
        self.swagger_types = {
            'type': 'str',
            'task_key': 'str',
            'depends_on': 'list[DependsOn]',
            'run_if': 'str',
            'max_retries': 'int',
            'min_retry_interval_millis': 'int',
            'is_retry_on_timeout': 'bool',
            'job_key': 'str',
            'parameters': 'list[Parameter]',
            'timeout_seconds': 'int'
        }

        self.attribute_map = {
            'type': 'type',
            'task_key': 'taskKey',
            'depends_on': 'dependsOn',
            'run_if': 'runIf',
            'max_retries': 'maxRetries',
            'min_retry_interval_millis': 'minRetryIntervalMillis',
            'is_retry_on_timeout': 'isRetryOnTimeout',
            'job_key': 'jobKey',
            'parameters': 'parameters',
            'timeout_seconds': 'timeoutSeconds'
        }

        self._type = None
        self._task_key = None
        self._depends_on = None
        self._run_if = None
        self._max_retries = None
        self._min_retry_interval_millis = None
        self._is_retry_on_timeout = None
        self._job_key = None
        self._parameters = None
        self._timeout_seconds = None
        self._type = 'JOB_TASK'

    @property
    def job_key(self):
        """
        **[Required]** Gets the job_key of this JobTask.
        The OCID of the job.


        :return: The job_key of this JobTask.
        :rtype: str
        """
        return self._job_key

    @job_key.setter
    def job_key(self, job_key):
        """
        Sets the job_key of this JobTask.
        The OCID of the job.


        :param job_key: The job_key of this JobTask.
        :type: str
        """
        self._job_key = job_key

    @property
    def parameters(self):
        """
        Gets the parameters of this JobTask.
        An optional list of parameters.


        :return: The parameters of this JobTask.
        :rtype: list[oci.aidataplatform_dp.models.Parameter]
        """
        return self._parameters

    @parameters.setter
    def parameters(self, parameters):
        """
        Sets the parameters of this JobTask.
        An optional list of parameters.


        :param parameters: The parameters of this JobTask.
        :type: list[oci.aidataplatform_dp.models.Parameter]
        """
        self._parameters = parameters

    @property
    def timeout_seconds(self):
        """
        Gets the timeout_seconds of this JobTask.
        An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value.


        :return: The timeout_seconds of this JobTask.
        :rtype: int
        """
        return self._timeout_seconds

    @timeout_seconds.setter
    def timeout_seconds(self, timeout_seconds):
        """
        Sets the timeout_seconds of this JobTask.
        An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value.


        :param timeout_seconds: The timeout_seconds of this JobTask.
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
