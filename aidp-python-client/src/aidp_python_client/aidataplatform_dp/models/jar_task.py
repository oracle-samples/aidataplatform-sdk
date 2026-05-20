# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .task import Task
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class JarTask(Task):
    """
    The information about the Jar task.
    """

    #: A constant which can be used with the source property of a JarTask.
    #: This constant has a value of "WORKSPACE"
    SOURCE_WORKSPACE = "WORKSPACE"

    #: A constant which can be used with the source property of a JarTask.
    #: This constant has a value of "GIT_PROVIDER"
    SOURCE_GIT_PROVIDER = "GIT_PROVIDER"

    def __init__(self, **kwargs):
        """
        Initializes a new JarTask object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.JarTask.type` attribute
        of this class is ``JAR_TASK`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this JarTask.
            Allowed values for this property are: "NOTEBOOK_TASK", "PYTHON_TASK", "SPARK_SUBMIT_TASK", "IF_ELSE_TASK", "JOB_TASK", "JAR_TASK", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type type: str

        :param task_key:
            The value to assign to the task_key property of this JarTask.
        :type task_key: str

        :param depends_on:
            The value to assign to the depends_on property of this JarTask.
        :type depends_on: list[oci.aidataplatform_dp.models.DependsOn]

        :param run_if:
            The value to assign to the run_if property of this JarTask.
            Allowed values for this property are: "ALL_SUCCESS", "ALL_DONE", "NONE_FAILED", "AT_LEAST_ONE_SUCCESS", "ALL_FAILED", "AT_LEAST_ONE_FAILED", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type run_if: str

        :param max_retries:
            The value to assign to the max_retries property of this JarTask.
        :type max_retries: int

        :param min_retry_interval_millis:
            The value to assign to the min_retry_interval_millis property of this JarTask.
        :type min_retry_interval_millis: int

        :param is_retry_on_timeout:
            The value to assign to the is_retry_on_timeout property of this JarTask.
        :type is_retry_on_timeout: bool

        :param main_class:
            The value to assign to the main_class property of this JarTask.
        :type main_class: str

        :param dependent_libraries:
            The value to assign to the dependent_libraries property of this JarTask.
        :type dependent_libraries: list[str]

        :param source:
            The value to assign to the source property of this JarTask.
            Allowed values for this property are: "WORKSPACE", "GIT_PROVIDER", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type source: str

        :param git_config:
            The value to assign to the git_config property of this JarTask.
        :type git_config: oci.aidataplatform_dp.models.GitConfig

        :param cluster:
            The value to assign to the cluster property of this JarTask.
        :type cluster: oci.aidataplatform_dp.models.JobCluster

        :param command_line_arguments:
            The value to assign to the command_line_arguments property of this JarTask.
        :type command_line_arguments: str

        :param parameters:
            The value to assign to the parameters property of this JarTask.
        :type parameters: list[oci.aidataplatform_dp.models.Parameter]

        :param timeout_seconds:
            The value to assign to the timeout_seconds property of this JarTask.
        :type timeout_seconds: int

        :param is_streaming:
            The value to assign to the is_streaming property of this JarTask.
        :type is_streaming: bool

        """
        self.swagger_types = {
            'type': 'str',
            'task_key': 'str',
            'depends_on': 'list[DependsOn]',
            'run_if': 'str',
            'max_retries': 'int',
            'min_retry_interval_millis': 'int',
            'is_retry_on_timeout': 'bool',
            'main_class': 'str',
            'dependent_libraries': 'list[str]',
            'source': 'str',
            'git_config': 'GitConfig',
            'cluster': 'JobCluster',
            'command_line_arguments': 'str',
            'parameters': 'list[Parameter]',
            'timeout_seconds': 'int',
            'is_streaming': 'bool'
        }

        self.attribute_map = {
            'type': 'type',
            'task_key': 'taskKey',
            'depends_on': 'dependsOn',
            'run_if': 'runIf',
            'max_retries': 'maxRetries',
            'min_retry_interval_millis': 'minRetryIntervalMillis',
            'is_retry_on_timeout': 'isRetryOnTimeout',
            'main_class': 'mainClass',
            'dependent_libraries': 'dependentLibraries',
            'source': 'source',
            'git_config': 'gitConfig',
            'cluster': 'cluster',
            'command_line_arguments': 'commandLineArguments',
            'parameters': 'parameters',
            'timeout_seconds': 'timeoutSeconds',
            'is_streaming': 'isStreaming'
        }

        self._type = None
        self._task_key = None
        self._depends_on = None
        self._run_if = None
        self._max_retries = None
        self._min_retry_interval_millis = None
        self._is_retry_on_timeout = None
        self._main_class = None
        self._dependent_libraries = None
        self._source = None
        self._git_config = None
        self._cluster = None
        self._command_line_arguments = None
        self._parameters = None
        self._timeout_seconds = None
        self._is_streaming = None
        self._type = 'JAR_TASK'

    @property
    def main_class(self):
        """
        **[Required]** Gets the main_class of this JarTask.
        Name of the main class.


        :return: The main_class of this JarTask.
        :rtype: str
        """
        return self._main_class

    @main_class.setter
    def main_class(self, main_class):
        """
        Sets the main_class of this JarTask.
        Name of the main class.


        :param main_class: The main_class of this JarTask.
        :type: str
        """
        self._main_class = main_class

    @property
    def dependent_libraries(self):
        """
        Gets the dependent_libraries of this JarTask.
        The list of dependent jars


        :return: The dependent_libraries of this JarTask.
        :rtype: list[str]
        """
        return self._dependent_libraries

    @dependent_libraries.setter
    def dependent_libraries(self, dependent_libraries):
        """
        Sets the dependent_libraries of this JarTask.
        The list of dependent jars


        :param dependent_libraries: The dependent_libraries of this JarTask.
        :type: list[str]
        """
        self._dependent_libraries = dependent_libraries

    @property
    def source(self):
        """
        Gets the source of this JarTask.
        Source selected for a task. Either workspace or Git provider.

        Allowed values for this property are: "WORKSPACE", "GIT_PROVIDER", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The source of this JarTask.
        :rtype: str
        """
        return self._source

    @source.setter
    def source(self, source):
        """
        Sets the source of this JarTask.
        Source selected for a task. Either workspace or Git provider.


        :param source: The source of this JarTask.
        :type: str
        """
        allowed_values = ["WORKSPACE", "GIT_PROVIDER"]
        if not value_allowed_none_or_none_sentinel(source, allowed_values):
            source = 'UNKNOWN_ENUM_VALUE'
        self._source = source

    @property
    def git_config(self):
        """
        Gets the git_config of this JarTask.

        :return: The git_config of this JarTask.
        :rtype: oci.aidataplatform_dp.models.GitConfig
        """
        return self._git_config

    @git_config.setter
    def git_config(self, git_config):
        """
        Sets the git_config of this JarTask.

        :param git_config: The git_config of this JarTask.
        :type: oci.aidataplatform_dp.models.GitConfig
        """
        self._git_config = git_config

    @property
    def cluster(self):
        """
        **[Required]** Gets the cluster of this JarTask.

        :return: The cluster of this JarTask.
        :rtype: oci.aidataplatform_dp.models.JobCluster
        """
        return self._cluster

    @cluster.setter
    def cluster(self, cluster):
        """
        Sets the cluster of this JarTask.

        :param cluster: The cluster of this JarTask.
        :type: oci.aidataplatform_dp.models.JobCluster
        """
        self._cluster = cluster

    @property
    def command_line_arguments(self):
        """
        Gets the command_line_arguments of this JarTask.
        The command line arguments to pass to Python task.


        :return: The command_line_arguments of this JarTask.
        :rtype: str
        """
        return self._command_line_arguments

    @command_line_arguments.setter
    def command_line_arguments(self, command_line_arguments):
        """
        Sets the command_line_arguments of this JarTask.
        The command line arguments to pass to Python task.


        :param command_line_arguments: The command_line_arguments of this JarTask.
        :type: str
        """
        self._command_line_arguments = command_line_arguments

    @property
    def parameters(self):
        """
        Gets the parameters of this JarTask.
        An optional list of parameters.


        :return: The parameters of this JarTask.
        :rtype: list[oci.aidataplatform_dp.models.Parameter]
        """
        return self._parameters

    @parameters.setter
    def parameters(self, parameters):
        """
        Sets the parameters of this JarTask.
        An optional list of parameters.


        :param parameters: The parameters of this JarTask.
        :type: list[oci.aidataplatform_dp.models.Parameter]
        """
        self._parameters = parameters

    @property
    def timeout_seconds(self):
        """
        Gets the timeout_seconds of this JarTask.
        An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value.


        :return: The timeout_seconds of this JarTask.
        :rtype: int
        """
        return self._timeout_seconds

    @timeout_seconds.setter
    def timeout_seconds(self, timeout_seconds):
        """
        Sets the timeout_seconds of this JarTask.
        An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value.


        :param timeout_seconds: The timeout_seconds of this JarTask.
        :type: int
        """
        self._timeout_seconds = timeout_seconds

    @property
    def is_streaming(self):
        """
        Gets the is_streaming of this JarTask.
        An optional property to enable or disable the streaming capability for a task.


        :return: The is_streaming of this JarTask.
        :rtype: bool
        """
        return self._is_streaming

    @is_streaming.setter
    def is_streaming(self, is_streaming):
        """
        Sets the is_streaming of this JarTask.
        An optional property to enable or disable the streaming capability for a task.


        :param is_streaming: The is_streaming of this JarTask.
        :type: bool
        """
        self._is_streaming = is_streaming

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
