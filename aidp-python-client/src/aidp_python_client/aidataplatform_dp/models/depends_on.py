# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DependsOn(object):
    """
    Specifies the dependency graph of the task. All the tasks mentioned in this field need to be completed before executing this task.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new DependsOn object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param task_key:
            The value to assign to the task_key property of this DependsOn.
        :type task_key: str

        :param outcome:
            The value to assign to the outcome property of this DependsOn.
        :type outcome: str

        """
        self.swagger_types = {
            'task_key': 'str',
            'outcome': 'str'
        }

        self.attribute_map = {
            'task_key': 'taskKey',
            'outcome': 'outcome'
        }

        self._task_key = None
        self._outcome = None

    @property
    def task_key(self):
        """
        **[Required]** Gets the task_key of this DependsOn.
        The name of the task that it depends on.


        :return: The task_key of this DependsOn.
        :rtype: str
        """
        return self._task_key

    @task_key.setter
    def task_key(self, task_key):
        """
        Sets the task_key of this DependsOn.
        The name of the task that it depends on.


        :param task_key: The task_key of this DependsOn.
        :type: str
        """
        self._task_key = task_key

    @property
    def outcome(self):
        """
        Gets the outcome of this DependsOn.
        Specified on condition task dependencies. The outcome of the dependent task should be met for this task to be executed.


        :return: The outcome of this DependsOn.
        :rtype: str
        """
        return self._outcome

    @outcome.setter
    def outcome(self, outcome):
        """
        Sets the outcome of this DependsOn.
        Specified on condition task dependencies. The outcome of the dependent task should be met for this task to be executed.


        :param outcome: The outcome of this DependsOn.
        :type: str
        """
        self._outcome = outcome

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
