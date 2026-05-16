# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .task import Task
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class NotebookTask(Task):
    """
    The information about the notebook task.
    """

    #: A constant which can be used with the source property of a NotebookTask.
    #: This constant has a value of "WORKSPACE"
    SOURCE_WORKSPACE = "WORKSPACE"

    #: A constant which can be used with the source property of a NotebookTask.
    #: This constant has a value of "GIT_PROVIDER"
    SOURCE_GIT_PROVIDER = "GIT_PROVIDER"

    def __init__(self, **kwargs):
        """
        Initializes a new NotebookTask object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.NotebookTask.type` attribute
        of this class is ``NOTEBOOK_TASK`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this NotebookTask.
            Allowed values for this property are: "NOTEBOOK_TASK", "PYTHON_TASK", "SPARK_SUBMIT_TASK", "IF_ELSE_TASK", "JOB_TASK", "JAR_TASK", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type type: str

        :param task_key:
            The value to assign to the task_key property of this NotebookTask.
        :type task_key: str

        :param depends_on:
            The value to assign to the depends_on property of this NotebookTask.
        :type depends_on: list[oci.aidataplatform_dp.models.DependsOn]

        :param run_if:
            The value to assign to the run_if property of this NotebookTask.
            Allowed values for this property are: "ALL_SUCCESS", "ALL_DONE", "NONE_FAILED", "AT_LEAST_ONE_SUCCESS", "ALL_FAILED", "AT_LEAST_ONE_FAILED", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type run_if: str

        :param max_retries:
            The value to assign to the max_retries property of this NotebookTask.
        :type max_retries: int

        :param min_retry_interval_millis:
            The value to assign to the min_retry_interval_millis property of this NotebookTask.
        :type min_retry_interval_millis: int

        :param is_retry_on_timeout:
            The value to assign to the is_retry_on_timeout property of this NotebookTask.
        :type is_retry_on_timeout: bool

        :param notebook_path:
            The value to assign to the notebook_path property of this NotebookTask.
        :type notebook_path: str

        :param source:
            The value to assign to the source property of this NotebookTask.
            Allowed values for this property are: "WORKSPACE", "GIT_PROVIDER", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type source: str

        :param git_config:
            The value to assign to the git_config property of this NotebookTask.
        :type git_config: oci.aidataplatform_dp.models.GitConfig

        :param cluster:
            The value to assign to the cluster property of this NotebookTask.
        :type cluster: oci.aidataplatform_dp.models.JobCluster

        :param parameters:
            The value to assign to the parameters property of this NotebookTask.
        :type parameters: list[oci.aidataplatform_dp.models.Parameter]

        :param timeout_seconds:
            The value to assign to the timeout_seconds property of this NotebookTask.
        :type timeout_seconds: int

        :param is_streaming:
            The value to assign to the is_streaming property of this NotebookTask.
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
            'notebook_path': 'str',
            'source': 'str',
            'git_config': 'GitConfig',
            'cluster': 'JobCluster',
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
            'notebook_path': 'notebookPath',
            'source': 'source',
            'git_config': 'gitConfig',
            'cluster': 'cluster',
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
        self._notebook_path = None
        self._source = None
        self._git_config = None
        self._cluster = None
        self._parameters = None
        self._timeout_seconds = None
        self._is_streaming = None
        self._type = 'NOTEBOOK_TASK'

    @property
    def notebook_path(self):
        """
        **[Required]** Gets the notebook_path of this NotebookTask.
        The path where the notebook exists.


        :return: The notebook_path of this NotebookTask.
        :rtype: str
        """
        return self._notebook_path

    @notebook_path.setter
    def notebook_path(self, notebook_path):
        """
        Sets the notebook_path of this NotebookTask.
        The path where the notebook exists.


        :param notebook_path: The notebook_path of this NotebookTask.
        :type: str
        """
        self._notebook_path = notebook_path

    @property
    def source(self):
        """
        Gets the source of this NotebookTask.
        Source selected for a task. Either workspace or Git provider.

        Allowed values for this property are: "WORKSPACE", "GIT_PROVIDER", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The source of this NotebookTask.
        :rtype: str
        """
        return self._source

    @source.setter
    def source(self, source):
        """
        Sets the source of this NotebookTask.
        Source selected for a task. Either workspace or Git provider.


        :param source: The source of this NotebookTask.
        :type: str
        """
        allowed_values = ["WORKSPACE", "GIT_PROVIDER"]
        if not value_allowed_none_or_none_sentinel(source, allowed_values):
            source = 'UNKNOWN_ENUM_VALUE'
        self._source = source

    @property
    def git_config(self):
        """
        Gets the git_config of this NotebookTask.

        :return: The git_config of this NotebookTask.
        :rtype: oci.aidataplatform_dp.models.GitConfig
        """
        return self._git_config

    @git_config.setter
    def git_config(self, git_config):
        """
        Sets the git_config of this NotebookTask.

        :param git_config: The git_config of this NotebookTask.
        :type: oci.aidataplatform_dp.models.GitConfig
        """
        self._git_config = git_config

    @property
    def cluster(self):
        """
        **[Required]** Gets the cluster of this NotebookTask.

        :return: The cluster of this NotebookTask.
        :rtype: oci.aidataplatform_dp.models.JobCluster
        """
        return self._cluster

    @cluster.setter
    def cluster(self, cluster):
        """
        Sets the cluster of this NotebookTask.

        :param cluster: The cluster of this NotebookTask.
        :type: oci.aidataplatform_dp.models.JobCluster
        """
        self._cluster = cluster

    @property
    def parameters(self):
        """
        Gets the parameters of this NotebookTask.
        An optional list of parameters.


        :return: The parameters of this NotebookTask.
        :rtype: list[oci.aidataplatform_dp.models.Parameter]
        """
        return self._parameters

    @parameters.setter
    def parameters(self, parameters):
        """
        Sets the parameters of this NotebookTask.
        An optional list of parameters.


        :param parameters: The parameters of this NotebookTask.
        :type: list[oci.aidataplatform_dp.models.Parameter]
        """
        self._parameters = parameters

    @property
    def timeout_seconds(self):
        """
        Gets the timeout_seconds of this NotebookTask.
        An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value.


        :return: The timeout_seconds of this NotebookTask.
        :rtype: int
        """
        return self._timeout_seconds

    @timeout_seconds.setter
    def timeout_seconds(self, timeout_seconds):
        """
        Sets the timeout_seconds of this NotebookTask.
        An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value.


        :param timeout_seconds: The timeout_seconds of this NotebookTask.
        :type: int
        """
        self._timeout_seconds = timeout_seconds

    @property
    def is_streaming(self):
        """
        Gets the is_streaming of this NotebookTask.
        An optional property to enable or disable the streaming capability for a task.


        :return: The is_streaming of this NotebookTask.
        :rtype: bool
        """
        return self._is_streaming

    @is_streaming.setter
    def is_streaming(self, is_streaming):
        """
        Sets the is_streaming of this NotebookTask.
        An optional property to enable or disable the streaming capability for a task.


        :param is_streaming: The is_streaming of this NotebookTask.
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
