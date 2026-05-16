# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .task import Task
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class IfElseTask(Task):
    """
    The information about the If Else task.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new IfElseTask object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.IfElseTask.type` attribute
        of this class is ``IF_ELSE_TASK`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this IfElseTask.
            Allowed values for this property are: "NOTEBOOK_TASK", "PYTHON_TASK", "SPARK_SUBMIT_TASK", "IF_ELSE_TASK", "JOB_TASK", "JAR_TASK"
        :type type: str

        :param task_key:
            The value to assign to the task_key property of this IfElseTask.
        :type task_key: str

        :param depends_on:
            The value to assign to the depends_on property of this IfElseTask.
        :type depends_on: list[oci.aidataplatform_dp.models.DependsOn]

        :param run_if:
            The value to assign to the run_if property of this IfElseTask.
            Allowed values for this property are: "ALL_SUCCESS", "ALL_DONE", "NONE_FAILED", "AT_LEAST_ONE_SUCCESS", "ALL_FAILED", "AT_LEAST_ONE_FAILED"
        :type run_if: str

        :param max_retries:
            The value to assign to the max_retries property of this IfElseTask.
        :type max_retries: int

        :param min_retry_interval_millis:
            The value to assign to the min_retry_interval_millis property of this IfElseTask.
        :type min_retry_interval_millis: int

        :param is_retry_on_timeout:
            The value to assign to the is_retry_on_timeout property of this IfElseTask.
        :type is_retry_on_timeout: bool

        :param expressions:
            The value to assign to the expressions property of this IfElseTask.
        :type expressions: list[oci.aidataplatform_dp.models.Expression]

        :param condition:
            The value to assign to the condition property of this IfElseTask.
        :type condition: str

        :param parameters:
            The value to assign to the parameters property of this IfElseTask.
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
            'expressions': 'list[Expression]',
            'condition': 'str',
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
            'expressions': 'expressions',
            'condition': 'condition',
            'parameters': 'parameters'
        }

        self._type = None
        self._task_key = None
        self._depends_on = None
        self._run_if = None
        self._max_retries = None
        self._min_retry_interval_millis = None
        self._is_retry_on_timeout = None
        self._expressions = None
        self._condition = None
        self._parameters = None
        self._type = 'IF_ELSE_TASK'

    @property
    def expressions(self):
        """
        **[Required]** Gets the expressions of this IfElseTask.
        List of expressions.


        :return: The expressions of this IfElseTask.
        :rtype: list[oci.aidataplatform_dp.models.Expression]
        """
        return self._expressions

    @expressions.setter
    def expressions(self, expressions):
        """
        Sets the expressions of this IfElseTask.
        List of expressions.


        :param expressions: The expressions of this IfElseTask.
        :type: list[oci.aidataplatform_dp.models.Expression]
        """
        self._expressions = expressions

    @property
    def condition(self):
        """
        **[Required]** Gets the condition of this IfElseTask.
        The condition string which binds expressions from expressions list using AND, OR or NOT operator. Expression key should be used to bind the expressions.


        :return: The condition of this IfElseTask.
        :rtype: str
        """
        return self._condition

    @condition.setter
    def condition(self, condition):
        """
        Sets the condition of this IfElseTask.
        The condition string which binds expressions from expressions list using AND, OR or NOT operator. Expression key should be used to bind the expressions.


        :param condition: The condition of this IfElseTask.
        :type: str
        """
        self._condition = condition

    @property
    def parameters(self):
        """
        Gets the parameters of this IfElseTask.
        An optional list of parameters.


        :return: The parameters of this IfElseTask.
        :rtype: list[oci.aidataplatform_dp.models.Parameter]
        """
        return self._parameters

    @parameters.setter
    def parameters(self, parameters):
        """
        Sets the parameters of this IfElseTask.
        An optional list of parameters.


        :param parameters: The parameters of this IfElseTask.
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
