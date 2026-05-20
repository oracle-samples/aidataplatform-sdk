# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class TaskRunOutput(object):
    """
    Output of a task run.
    """

    #: A constant which can be used with the task_type property of a TaskRunOutput.
    #: This constant has a value of "NOTEBOOK_TASK"
    TASK_TYPE_NOTEBOOK_TASK = "NOTEBOOK_TASK"

    #: A constant which can be used with the task_type property of a TaskRunOutput.
    #: This constant has a value of "PYTHON_TASK"
    TASK_TYPE_PYTHON_TASK = "PYTHON_TASK"

    #: A constant which can be used with the task_type property of a TaskRunOutput.
    #: This constant has a value of "SPARK_SUBMIT_TASK"
    TASK_TYPE_SPARK_SUBMIT_TASK = "SPARK_SUBMIT_TASK"

    #: A constant which can be used with the task_type property of a TaskRunOutput.
    #: This constant has a value of "IF_ELSE_TASK"
    TASK_TYPE_IF_ELSE_TASK = "IF_ELSE_TASK"

    #: A constant which can be used with the task_type property of a TaskRunOutput.
    #: This constant has a value of "JOB_TASK"
    TASK_TYPE_JOB_TASK = "JOB_TASK"

    #: A constant which can be used with the task_type property of a TaskRunOutput.
    #: This constant has a value of "JAR_TASK"
    TASK_TYPE_JAR_TASK = "JAR_TASK"

    def __init__(self, **kwargs):
        """
        Initializes a new TaskRunOutput object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this TaskRunOutput.
        :type key: str

        :param task_type:
            The value to assign to the task_type property of this TaskRunOutput.
            Allowed values for this property are: "NOTEBOOK_TASK", "PYTHON_TASK", "SPARK_SUBMIT_TASK", "IF_ELSE_TASK", "JOB_TASK", "JAR_TASK", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type task_type: str

        :param is_truncated:
            The value to assign to the is_truncated property of this TaskRunOutput.
        :type is_truncated: bool

        :param error_trace:
            The value to assign to the error_trace property of this TaskRunOutput.
        :type error_trace: str

        :param data:
            The value to assign to the data property of this TaskRunOutput.
        :type data: list[oci.aidataplatform_dp.models.RunOutputData]

        :param output_parameters:
            The value to assign to the output_parameters property of this TaskRunOutput.
        :type output_parameters: list[oci.aidataplatform_dp.models.OutputParameter]

        :param version:
            The value to assign to the version property of this TaskRunOutput.
        :type version: int

        """
        self.swagger_types = {
            'key': 'str',
            'task_type': 'str',
            'is_truncated': 'bool',
            'error_trace': 'str',
            'data': 'list[RunOutputData]',
            'output_parameters': 'list[OutputParameter]',
            'version': 'int'
        }

        self.attribute_map = {
            'key': 'key',
            'task_type': 'taskType',
            'is_truncated': 'isTruncated',
            'error_trace': 'errorTrace',
            'data': 'data',
            'output_parameters': 'outputParameters',
            'version': 'version'
        }

        self._key = None
        self._task_type = None
        self._is_truncated = None
        self._error_trace = None
        self._data = None
        self._output_parameters = None
        self._version = None

    @property
    def key(self):
        """
        Gets the key of this TaskRunOutput.
        A unique identifier for the output.


        :return: The key of this TaskRunOutput.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this TaskRunOutput.
        A unique identifier for the output.


        :param key: The key of this TaskRunOutput.
        :type: str
        """
        self._key = key

    @property
    def task_type(self):
        """
        Gets the task_type of this TaskRunOutput.
        The type of the task.

        Allowed values for this property are: "NOTEBOOK_TASK", "PYTHON_TASK", "SPARK_SUBMIT_TASK", "IF_ELSE_TASK", "JOB_TASK", "JAR_TASK", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The task_type of this TaskRunOutput.
        :rtype: str
        """
        return self._task_type

    @task_type.setter
    def task_type(self, task_type):
        """
        Sets the task_type of this TaskRunOutput.
        The type of the task.


        :param task_type: The task_type of this TaskRunOutput.
        :type: str
        """
        allowed_values = ["NOTEBOOK_TASK", "PYTHON_TASK", "SPARK_SUBMIT_TASK", "IF_ELSE_TASK", "JOB_TASK", "JAR_TASK"]
        if not value_allowed_none_or_none_sentinel(task_type, allowed_values):
            task_type = 'UNKNOWN_ENUM_VALUE'
        self._task_type = task_type

    @property
    def is_truncated(self):
        """
        Gets the is_truncated of this TaskRunOutput.
        True if logs are truncated.


        :return: The is_truncated of this TaskRunOutput.
        :rtype: bool
        """
        return self._is_truncated

    @is_truncated.setter
    def is_truncated(self, is_truncated):
        """
        Sets the is_truncated of this TaskRunOutput.
        True if logs are truncated.


        :param is_truncated: The is_truncated of this TaskRunOutput.
        :type: bool
        """
        self._is_truncated = is_truncated

    @property
    def error_trace(self):
        """
        Gets the error_trace of this TaskRunOutput.
        If there was an error executing the run, this field contains any available stack traces.


        :return: The error_trace of this TaskRunOutput.
        :rtype: str
        """
        return self._error_trace

    @error_trace.setter
    def error_trace(self, error_trace):
        """
        Sets the error_trace of this TaskRunOutput.
        If there was an error executing the run, this field contains any available stack traces.


        :param error_trace: The error_trace of this TaskRunOutput.
        :type: str
        """
        self._error_trace = error_trace

    @property
    def data(self):
        """
        **[Required]** Gets the data of this TaskRunOutput.
        Array of output objects.


        :return: The data of this TaskRunOutput.
        :rtype: list[oci.aidataplatform_dp.models.RunOutputData]
        """
        return self._data

    @data.setter
    def data(self, data):
        """
        Sets the data of this TaskRunOutput.
        Array of output objects.


        :param data: The data of this TaskRunOutput.
        :type: list[oci.aidataplatform_dp.models.RunOutputData]
        """
        self._data = data

    @property
    def output_parameters(self):
        """
        Gets the output_parameters of this TaskRunOutput.
        List of output parameters with name and values.


        :return: The output_parameters of this TaskRunOutput.
        :rtype: list[oci.aidataplatform_dp.models.OutputParameter]
        """
        return self._output_parameters

    @output_parameters.setter
    def output_parameters(self, output_parameters):
        """
        Sets the output_parameters of this TaskRunOutput.
        List of output parameters with name and values.


        :param output_parameters: The output_parameters of this TaskRunOutput.
        :type: list[oci.aidataplatform_dp.models.OutputParameter]
        """
        self._output_parameters = output_parameters

    @property
    def version(self):
        """
        Gets the version of this TaskRunOutput.
        Current version of job run object in repository.


        :return: The version of this TaskRunOutput.
        :rtype: int
        """
        return self._version

    @version.setter
    def version(self, version):
        """
        Sets the version of this TaskRunOutput.
        Current version of job run object in repository.


        :param version: The version of this TaskRunOutput.
        :type: int
        """
        self._version = version

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
