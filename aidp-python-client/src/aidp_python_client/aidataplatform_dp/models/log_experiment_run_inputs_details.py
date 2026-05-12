# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class LogExperimentRunInputsDetails(object):
    """
    Run inputs.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new LogExperimentRunInputsDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param run_id:
            The value to assign to the run_id property of this LogExperimentRunInputsDetails.
        :type run_id: str

        :param dataset_inputs:
            The value to assign to the dataset_inputs property of this LogExperimentRunInputsDetails.
        :type dataset_inputs: list[oci.aidataplatform_dp.models.DatasetInput]

        """
        self.swagger_types = {
            'run_id': 'str',
            'dataset_inputs': 'list[DatasetInput]'
        }

        self.attribute_map = {
            'run_id': 'run_id',
            'dataset_inputs': 'dataset_inputs'
        }

        self._run_id = None
        self._dataset_inputs = None

    @property
    def run_id(self):
        """
        **[Required]** Gets the run_id of this LogExperimentRunInputsDetails.
        Unique identifier for the run.


        :return: The run_id of this LogExperimentRunInputsDetails.
        :rtype: str
        """
        return self._run_id

    @run_id.setter
    def run_id(self, run_id):
        """
        Sets the run_id of this LogExperimentRunInputsDetails.
        Unique identifier for the run.


        :param run_id: The run_id of this LogExperimentRunInputsDetails.
        :type: str
        """
        self._run_id = run_id

    @property
    def dataset_inputs(self):
        """
        Gets the dataset_inputs of this LogExperimentRunInputsDetails.
        Dataset inputs for the run.


        :return: The dataset_inputs of this LogExperimentRunInputsDetails.
        :rtype: list[oci.aidataplatform_dp.models.DatasetInput]
        """
        return self._dataset_inputs

    @dataset_inputs.setter
    def dataset_inputs(self, dataset_inputs):
        """
        Sets the dataset_inputs of this LogExperimentRunInputsDetails.
        Dataset inputs for the run.


        :param dataset_inputs: The dataset_inputs of this LogExperimentRunInputsDetails.
        :type: list[oci.aidataplatform_dp.models.DatasetInput]
        """
        self._dataset_inputs = dataset_inputs

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
