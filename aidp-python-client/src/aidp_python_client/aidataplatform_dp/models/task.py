# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class Task(object):
    """
    Properties of a task provided by the user.
    """

    #: A constant which can be used with the type property of a Task.
    #: This constant has a value of "NOTEBOOK_TASK"
    TYPE_NOTEBOOK_TASK = "NOTEBOOK_TASK"

    #: A constant which can be used with the type property of a Task.
    #: This constant has a value of "PYTHON_TASK"
    TYPE_PYTHON_TASK = "PYTHON_TASK"

    #: A constant which can be used with the type property of a Task.
    #: This constant has a value of "SPARK_SUBMIT_TASK"
    TYPE_SPARK_SUBMIT_TASK = "SPARK_SUBMIT_TASK"

    #: A constant which can be used with the type property of a Task.
    #: This constant has a value of "IF_ELSE_TASK"
    TYPE_IF_ELSE_TASK = "IF_ELSE_TASK"

    #: A constant which can be used with the type property of a Task.
    #: This constant has a value of "JOB_TASK"
    TYPE_JOB_TASK = "JOB_TASK"

    #: A constant which can be used with the type property of a Task.
    #: This constant has a value of "JAR_TASK"
    TYPE_JAR_TASK = "JAR_TASK"

    #: A constant which can be used with the run_if property of a Task.
    #: This constant has a value of "ALL_SUCCESS"
    RUN_IF_ALL_SUCCESS = "ALL_SUCCESS"

    #: A constant which can be used with the run_if property of a Task.
    #: This constant has a value of "ALL_DONE"
    RUN_IF_ALL_DONE = "ALL_DONE"

    #: A constant which can be used with the run_if property of a Task.
    #: This constant has a value of "NONE_FAILED"
    RUN_IF_NONE_FAILED = "NONE_FAILED"

    #: A constant which can be used with the run_if property of a Task.
    #: This constant has a value of "AT_LEAST_ONE_SUCCESS"
    RUN_IF_AT_LEAST_ONE_SUCCESS = "AT_LEAST_ONE_SUCCESS"

    #: A constant which can be used with the run_if property of a Task.
    #: This constant has a value of "ALL_FAILED"
    RUN_IF_ALL_FAILED = "ALL_FAILED"

    #: A constant which can be used with the run_if property of a Task.
    #: This constant has a value of "AT_LEAST_ONE_FAILED"
    RUN_IF_AT_LEAST_ONE_FAILED = "AT_LEAST_ONE_FAILED"

    def __init__(self, **kwargs):
        """
        Initializes a new Task object with values from keyword arguments. This class has the following subclasses and if you are using this class as input
        to a service operations then you should favor using a subclass over the base class:

        * :class:`~oci.aidataplatform_dp.models.IfElseTask`
        * :class:`~oci.aidataplatform_dp.models.JobTask`
        * :class:`~oci.aidataplatform_dp.models.JarTask`
        * :class:`~oci.aidataplatform_dp.models.PythonTask`
        * :class:`~oci.aidataplatform_dp.models.NotebookTask`

        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this Task.
            Allowed values for this property are: "NOTEBOOK_TASK", "PYTHON_TASK", "SPARK_SUBMIT_TASK", "IF_ELSE_TASK", "JOB_TASK", "JAR_TASK", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type type: str

        :param task_key:
            The value to assign to the task_key property of this Task.
        :type task_key: str

        :param depends_on:
            The value to assign to the depends_on property of this Task.
        :type depends_on: list[oci.aidataplatform_dp.models.DependsOn]

        :param run_if:
            The value to assign to the run_if property of this Task.
            Allowed values for this property are: "ALL_SUCCESS", "ALL_DONE", "NONE_FAILED", "AT_LEAST_ONE_SUCCESS", "ALL_FAILED", "AT_LEAST_ONE_FAILED", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type run_if: str

        :param max_retries:
            The value to assign to the max_retries property of this Task.
        :type max_retries: int

        :param min_retry_interval_millis:
            The value to assign to the min_retry_interval_millis property of this Task.
        :type min_retry_interval_millis: int

        :param is_retry_on_timeout:
            The value to assign to the is_retry_on_timeout property of this Task.
        :type is_retry_on_timeout: bool

        """
        self.swagger_types = {
            'type': 'str',
            'task_key': 'str',
            'depends_on': 'list[DependsOn]',
            'run_if': 'str',
            'max_retries': 'int',
            'min_retry_interval_millis': 'int',
            'is_retry_on_timeout': 'bool'
        }

        self.attribute_map = {
            'type': 'type',
            'task_key': 'taskKey',
            'depends_on': 'dependsOn',
            'run_if': 'runIf',
            'max_retries': 'maxRetries',
            'min_retry_interval_millis': 'minRetryIntervalMillis',
            'is_retry_on_timeout': 'isRetryOnTimeout'
        }

        self._type = None
        self._task_key = None
        self._depends_on = None
        self._run_if = None
        self._max_retries = None
        self._min_retry_interval_millis = None
        self._is_retry_on_timeout = None

    @staticmethod
    def get_subtype(object_dictionary):
        """
        Given the hash representation of a subtype of this class,
        use the info in the hash to return the class of the subtype.
        """
        type = object_dictionary['type']

        if type == 'IF_ELSE_TASK':
            return 'IfElseTask'

        if type == 'JOB_TASK':
            return 'JobTask'

        if type == 'JAR_TASK':
            return 'JarTask'

        if type == 'PYTHON_TASK':
            return 'PythonTask'

        if type == 'NOTEBOOK_TASK':
            return 'NotebookTask'
        else:
            return 'Task'

    @property
    def type(self):
        """
        **[Required]** Gets the type of this Task.
        The type of the task.

        Allowed values for this property are: "NOTEBOOK_TASK", "PYTHON_TASK", "SPARK_SUBMIT_TASK", "IF_ELSE_TASK", "JOB_TASK", "JAR_TASK", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The type of this Task.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this Task.
        The type of the task.


        :param type: The type of this Task.
        :type: str
        """
        allowed_values = ["NOTEBOOK_TASK", "PYTHON_TASK", "SPARK_SUBMIT_TASK", "IF_ELSE_TASK", "JOB_TASK", "JAR_TASK"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            type = 'UNKNOWN_ENUM_VALUE'
        self._type = type

    @property
    def task_key(self):
        """
        **[Required]** Gets the task_key of this Task.
        The display name of the task. User can specify a value for this.


        :return: The task_key of this Task.
        :rtype: str
        """
        return self._task_key

    @task_key.setter
    def task_key(self, task_key):
        """
        Sets the task_key of this Task.
        The display name of the task. User can specify a value for this.


        :param task_key: The task_key of this Task.
        :type: str
        """
        self._task_key = task_key

    @property
    def depends_on(self):
        """
        Gets the depends_on of this Task.
        Specifies the dependency graph of the task. All the tasks mentioned in this field need to be completed before executing this task.


        :return: The depends_on of this Task.
        :rtype: list[oci.aidataplatform_dp.models.DependsOn]
        """
        return self._depends_on

    @depends_on.setter
    def depends_on(self, depends_on):
        """
        Sets the depends_on of this Task.
        Specifies the dependency graph of the task. All the tasks mentioned in this field need to be completed before executing this task.


        :param depends_on: The depends_on of this Task.
        :type: list[oci.aidataplatform_dp.models.DependsOn]
        """
        self._depends_on = depends_on

    @property
    def run_if(self):
        """
        **[Required]** Gets the run_if of this Task.
        The trigger rule based on which the current task execution is determined.

        Allowed values for this property are: "ALL_SUCCESS", "ALL_DONE", "NONE_FAILED", "AT_LEAST_ONE_SUCCESS", "ALL_FAILED", "AT_LEAST_ONE_FAILED", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The run_if of this Task.
        :rtype: str
        """
        return self._run_if

    @run_if.setter
    def run_if(self, run_if):
        """
        Sets the run_if of this Task.
        The trigger rule based on which the current task execution is determined.


        :param run_if: The run_if of this Task.
        :type: str
        """
        allowed_values = ["ALL_SUCCESS", "ALL_DONE", "NONE_FAILED", "AT_LEAST_ONE_SUCCESS", "ALL_FAILED", "AT_LEAST_ONE_FAILED"]
        if not value_allowed_none_or_none_sentinel(run_if, allowed_values):
            run_if = 'UNKNOWN_ENUM_VALUE'
        self._run_if = run_if

    @property
    def max_retries(self):
        """
        Gets the max_retries of this Task.
        The maximum number of times to retry an unsuccessful run.
        A run is considered to be unsuccessful if it fails with status FAILED or INTERNAL_ERROR. Maximum value is 300.


        :return: The max_retries of this Task.
        :rtype: int
        """
        return self._max_retries

    @max_retries.setter
    def max_retries(self, max_retries):
        """
        Sets the max_retries of this Task.
        The maximum number of times to retry an unsuccessful run.
        A run is considered to be unsuccessful if it fails with status FAILED or INTERNAL_ERROR. Maximum value is 300.


        :param max_retries: The max_retries of this Task.
        :type: int
        """
        self._max_retries = max_retries

    @property
    def min_retry_interval_millis(self):
        """
        Gets the min_retry_interval_millis of this Task.
        An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run.
        If value is not provided, the run would be immediately retried. Maximum value is 10 mins (600000)


        :return: The min_retry_interval_millis of this Task.
        :rtype: int
        """
        return self._min_retry_interval_millis

    @min_retry_interval_millis.setter
    def min_retry_interval_millis(self, min_retry_interval_millis):
        """
        Sets the min_retry_interval_millis of this Task.
        An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run.
        If value is not provided, the run would be immediately retried. Maximum value is 10 mins (600000)


        :param min_retry_interval_millis: The min_retry_interval_millis of this Task.
        :type: int
        """
        self._min_retry_interval_millis = min_retry_interval_millis

    @property
    def is_retry_on_timeout(self):
        """
        Gets the is_retry_on_timeout of this Task.
        An optional policy to specify whether to retry a task when it times out. The default behavior is to not retry on timeout.


        :return: The is_retry_on_timeout of this Task.
        :rtype: bool
        """
        return self._is_retry_on_timeout

    @is_retry_on_timeout.setter
    def is_retry_on_timeout(self, is_retry_on_timeout):
        """
        Sets the is_retry_on_timeout of this Task.
        An optional policy to specify whether to retry a task when it times out. The default behavior is to not retry on timeout.


        :param is_retry_on_timeout: The is_retry_on_timeout of this Task.
        :type: bool
        """
        self._is_retry_on_timeout = is_retry_on_timeout

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
