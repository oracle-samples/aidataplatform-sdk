# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class RepairJobRunDetails(object):
    """
    The data to repair a job run.
    """

    #: A constant which can be used with the repair_mode property of a RepairJobRunDetails.
    #: This constant has a value of "RESUME"
    REPAIR_MODE_RESUME = "RESUME"

    #: A constant which can be used with the repair_mode property of a RepairJobRunDetails.
    #: This constant has a value of "RERUN"
    REPAIR_MODE_RERUN = "RERUN"

    def __init__(self, **kwargs):
        """
        Initializes a new RepairJobRunDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param task_keys:
            The value to assign to the task_keys property of this RepairJobRunDetails.
        :type task_keys: list[str]

        :param repair_mode:
            The value to assign to the repair_mode property of this RepairJobRunDetails.
            Allowed values for this property are: "RESUME", "RERUN"
        :type repair_mode: str

        :param repair_tasks:
            The value to assign to the repair_tasks property of this RepairJobRunDetails.
        :type repair_tasks: list[oci.aidataplatform_dp.models.RepairTaskDetails]

        :param parameters:
            The value to assign to the parameters property of this RepairJobRunDetails.
        :type parameters: list[oci.aidataplatform_dp.models.Parameter]

        """
        self.swagger_types = {
            'task_keys': 'list[str]',
            'repair_mode': 'str',
            'repair_tasks': 'list[RepairTaskDetails]',
            'parameters': 'list[Parameter]'
        }

        self.attribute_map = {
            'task_keys': 'taskKeys',
            'repair_mode': 'repairMode',
            'repair_tasks': 'repairTasks',
            'parameters': 'parameters'
        }

        self._task_keys = None
        self._repair_mode = None
        self._repair_tasks = None
        self._parameters = None

    @property
    def task_keys(self):
        """
        Gets the task_keys of this RepairJobRunDetails.
        The collection of selected task IDs to be repaired.


        :return: The task_keys of this RepairJobRunDetails.
        :rtype: list[str]
        """
        return self._task_keys

    @task_keys.setter
    def task_keys(self, task_keys):
        """
        Sets the task_keys of this RepairJobRunDetails.
        The collection of selected task IDs to be repaired.


        :param task_keys: The task_keys of this RepairJobRunDetails.
        :type: list[str]
        """
        self._task_keys = task_keys

    @property
    def repair_mode(self):
        """
        Gets the repair_mode of this RepairJobRunDetails.
        Repair mode to be used for this repair scope.

        Allowed values for this property are: "RESUME", "RERUN"


        :return: The repair_mode of this RepairJobRunDetails.
        :rtype: str
        """
        return self._repair_mode

    @repair_mode.setter
    def repair_mode(self, repair_mode):
        """
        Sets the repair_mode of this RepairJobRunDetails.
        Repair mode to be used for this repair scope.


        :param repair_mode: The repair_mode of this RepairJobRunDetails.
        :type: str
        """
        allowed_values = ["RESUME", "RERUN"]
        if not value_allowed_none_or_none_sentinel(repair_mode, allowed_values):
            raise ValueError(
                "Invalid value for `repair_mode`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._repair_mode = repair_mode

    @property
    def repair_tasks(self):
        """
        Gets the repair_tasks of this RepairJobRunDetails.
        The collection of selected task details to be repaired.


        :return: The repair_tasks of this RepairJobRunDetails.
        :rtype: list[oci.aidataplatform_dp.models.RepairTaskDetails]
        """
        return self._repair_tasks

    @repair_tasks.setter
    def repair_tasks(self, repair_tasks):
        """
        Sets the repair_tasks of this RepairJobRunDetails.
        The collection of selected task details to be repaired.


        :param repair_tasks: The repair_tasks of this RepairJobRunDetails.
        :type: list[oci.aidataplatform_dp.models.RepairTaskDetails]
        """
        self._repair_tasks = repair_tasks

    @property
    def parameters(self):
        """
        Gets the parameters of this RepairJobRunDetails.
        An optional list of parameters.


        :return: The parameters of this RepairJobRunDetails.
        :rtype: list[oci.aidataplatform_dp.models.Parameter]
        """
        return self._parameters

    @parameters.setter
    def parameters(self, parameters):
        """
        Sets the parameters of this RepairJobRunDetails.
        An optional list of parameters.


        :param parameters: The parameters of this RepairJobRunDetails.
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
