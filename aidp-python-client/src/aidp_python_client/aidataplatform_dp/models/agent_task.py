# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .task import Task
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AgentTask(Task):
    """
    The information about an Agent task that invokes an active PROD Agent deployment from a workflow. Resolved parameters whose names start with `sessionvariables.` are forwarded unchanged as A2A message metadata; Credential Store keys remain opaque to Workflow.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AgentTask object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.AgentTask.type` attribute
        of this class is ``AGENT_TASK`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this AgentTask.
            Allowed values for this property are: "NOTEBOOK_TASK", "PYTHON_TASK", "SPARK_SUBMIT_TASK", "IF_ELSE_TASK", "JOB_TASK", "JAR_TASK", "AGENT_TASK"
        :type type: str

        :param task_key:
            The value to assign to the task_key property of this AgentTask.
        :type task_key: str

        :param depends_on:
            The value to assign to the depends_on property of this AgentTask.
        :type depends_on: list[oci.aidataplatform_dp.models.DependsOn]

        :param run_if:
            The value to assign to the run_if property of this AgentTask.
            Allowed values for this property are: "ALL_SUCCESS", "ALL_DONE", "NONE_FAILED", "AT_LEAST_ONE_SUCCESS", "ALL_FAILED", "AT_LEAST_ONE_FAILED"
        :type run_if: str

        :param max_retries:
            The value to assign to the max_retries property of this AgentTask.
        :type max_retries: int

        :param min_retry_interval_millis:
            The value to assign to the min_retry_interval_millis property of this AgentTask.
        :type min_retry_interval_millis: int

        :param is_retry_on_timeout:
            The value to assign to the is_retry_on_timeout property of this AgentTask.
        :type is_retry_on_timeout: bool

        :param agent_key:
            The value to assign to the agent_key property of this AgentTask.
        :type agent_key: str

        :param prompt:
            The value to assign to the prompt property of this AgentTask.
        :type prompt: str

        :param parameters:
            The value to assign to the parameters property of this AgentTask.
        :type parameters: list[oci.aidataplatform_dp.models.Parameter]

        """
        self.swagger_types = {
            'type': 'str',
            'task_key': 'str',
            'depends_on': 'list[DependsOn]',
            'run_if': 'str',
            'max_retries': 'int',
            'min_retry_interval_millis': 'int',
            'is_retry_on_timeout': 'bool',
            'agent_key': 'str',
            'prompt': 'str',
            'parameters': 'list[Parameter]'
        }
        self.attribute_map = {
            'type': 'type',
            'task_key': 'taskKey',
            'depends_on': 'dependsOn',
            'run_if': 'runIf',
            'max_retries': 'maxRetries',
            'min_retry_interval_millis': 'minRetryIntervalMillis',
            'is_retry_on_timeout': 'isRetryOnTimeout',
            'agent_key': 'agentKey',
            'prompt': 'prompt',
            'parameters': 'parameters'
        }
        self._type = None
        self._task_key = None
        self._depends_on = None
        self._run_if = None
        self._max_retries = None
        self._min_retry_interval_millis = None
        self._is_retry_on_timeout = None
        self._agent_key = None
        self._prompt = None
        self._parameters = None
        self._type = 'AGENT_TASK'

    @property
    def agent_key(self):
        """
        **[Required]** Gets the agent_key of this AgentTask.
        Unique key of the deployed Agent or Multi-Agent System. At execution time, DataHub resolves this key to one active PROD deployment, fetches its Agent Card through a workload-authenticated internal route, and invokes the validated internal JSON-RPC URL advertised by the Card. AgentTask supports A2A protocol 0.3.x.


        :return: The agent_key of this AgentTask.
        :rtype: str
        """
        return self._agent_key

    @agent_key.setter
    def agent_key(self, agent_key):
        """
        Sets the agent_key of this AgentTask.
        Unique key of the deployed Agent or Multi-Agent System. At execution time, DataHub resolves this key to one active PROD deployment, fetches its Agent Card through a workload-authenticated internal route, and invokes the validated internal JSON-RPC URL advertised by the Card. AgentTask supports A2A protocol 0.3.x.


        :param agent_key: The agent_key of this AgentTask.
        :type: str
        """
        self._agent_key = agent_key

    @property
    def prompt(self):
        """
        **[Required]** Gets the prompt of this AgentTask.
        Required user input text sent as an A2A user message part.


        :return: The prompt of this AgentTask.
        :rtype: str
        """
        return self._prompt

    @prompt.setter
    def prompt(self, prompt):
        """
        Sets the prompt of this AgentTask.
        Required user input text sent as an A2A user message part.


        :param prompt: The prompt of this AgentTask.
        :type: str
        """
        self._prompt = prompt

    @property
    def parameters(self):
        """
        Gets the parameters of this AgentTask.
        An optional list of parameters.


        :return: The parameters of this AgentTask.
        :rtype: list[oci.aidataplatform_dp.models.Parameter]
        """
        return self._parameters

    @parameters.setter
    def parameters(self, parameters):
        """
        Sets the parameters of this AgentTask.
        An optional list of parameters.


        :param parameters: The parameters of this AgentTask.
        :type: list[oci.aidataplatform_dp.models.Parameter]
        """
        self._parameters = parameters

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
