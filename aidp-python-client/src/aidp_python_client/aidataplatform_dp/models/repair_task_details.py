# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class RepairTaskDetails(object):
    """
    Repair task details for a specific task selection.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new RepairTaskDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param task_key:
            The value to assign to the task_key property of this RepairTaskDetails.
        :type task_key: str

        :param should_include_downstream:
            The value to assign to the should_include_downstream property of this RepairTaskDetails.
        :type should_include_downstream: bool

        :param should_include_upstream:
            The value to assign to the should_include_upstream property of this RepairTaskDetails.
        :type should_include_upstream: bool

        """
        self.swagger_types = {
            'task_key': 'str',
            'should_include_downstream': 'bool',
            'should_include_upstream': 'bool'
        }

        self.attribute_map = {
            'task_key': 'taskKey',
            'should_include_downstream': 'shouldIncludeDownstream',
            'should_include_upstream': 'shouldIncludeUpstream'
        }

        self._task_key = None
        self._should_include_downstream = None
        self._should_include_upstream = None

    @property
    def task_key(self):
        """
        **[Required]** Gets the task_key of this RepairTaskDetails.
        The display name of the task. User can specify a value for this.


        :return: The task_key of this RepairTaskDetails.
        :rtype: str
        """
        return self._task_key

    @task_key.setter
    def task_key(self, task_key):
        """
        Sets the task_key of this RepairTaskDetails.
        The display name of the task. User can specify a value for this.


        :param task_key: The task_key of this RepairTaskDetails.
        :type: str
        """
        self._task_key = task_key

    @property
    def should_include_downstream(self):
        """
        Gets the should_include_downstream of this RepairTaskDetails.
        Include transitive downstream tasks for this task selection.


        :return: The should_include_downstream of this RepairTaskDetails.
        :rtype: bool
        """
        return self._should_include_downstream

    @should_include_downstream.setter
    def should_include_downstream(self, should_include_downstream):
        """
        Sets the should_include_downstream of this RepairTaskDetails.
        Include transitive downstream tasks for this task selection.


        :param should_include_downstream: The should_include_downstream of this RepairTaskDetails.
        :type: bool
        """
        self._should_include_downstream = should_include_downstream

    @property
    def should_include_upstream(self):
        """
        Gets the should_include_upstream of this RepairTaskDetails.
        Include transitive upstream tasks for this task selection.


        :return: The should_include_upstream of this RepairTaskDetails.
        :rtype: bool
        """
        return self._should_include_upstream

    @should_include_upstream.setter
    def should_include_upstream(self, should_include_upstream):
        """
        Sets the should_include_upstream of this RepairTaskDetails.
        Include transitive upstream tasks for this task selection.


        :param should_include_upstream: The should_include_upstream of this RepairTaskDetails.
        :type: bool
        """
        self._should_include_upstream = should_include_upstream

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
