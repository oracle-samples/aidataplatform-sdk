# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class RepairJobRunDetails(object):
    """
    The data to repair a job run.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new RepairJobRunDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param task_keys:
            The value to assign to the task_keys property of this RepairJobRunDetails.
        :type task_keys: list[str]

        :param parameters:
            The value to assign to the parameters property of this RepairJobRunDetails.
        :type parameters: list[oci.aidataplatform_dp.models.Parameter]

        """
        self.swagger_types = {
            'task_keys': 'list[str]',
            'parameters': 'list[Parameter]'
        }

        self.attribute_map = {
            'task_keys': 'taskKeys',
            'parameters': 'parameters'
        }

        self._task_keys = None
        self._parameters = None

    @property
    def task_keys(self):
        """
        **[Required]** Gets the task_keys of this RepairJobRunDetails.
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
