# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ExperimentRunInputs(object):
    """
    Run inputs.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ExperimentRunInputs object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param dataset_inputs:
            The value to assign to the dataset_inputs property of this ExperimentRunInputs.
        :type dataset_inputs: list[oci.aidataplatform_dp.models.DatasetInput]

        :param model_inputs:
            The value to assign to the model_inputs property of this ExperimentRunInputs.
        :type model_inputs: list[oci.aidataplatform_dp.models.ModelInput]

        """
        self.swagger_types = {
            'dataset_inputs': 'list[DatasetInput]',
            'model_inputs': 'list[ModelInput]'
        }

        self.attribute_map = {
            'dataset_inputs': 'dataset_inputs',
            'model_inputs': 'model_inputs'
        }

        self._dataset_inputs = None
        self._model_inputs = None

    @property
    def dataset_inputs(self):
        """
        Gets the dataset_inputs of this ExperimentRunInputs.
        Dataset inputs for the run.


        :return: The dataset_inputs of this ExperimentRunInputs.
        :rtype: list[oci.aidataplatform_dp.models.DatasetInput]
        """
        return self._dataset_inputs

    @dataset_inputs.setter
    def dataset_inputs(self, dataset_inputs):
        """
        Sets the dataset_inputs of this ExperimentRunInputs.
        Dataset inputs for the run.


        :param dataset_inputs: The dataset_inputs of this ExperimentRunInputs.
        :type: list[oci.aidataplatform_dp.models.DatasetInput]
        """
        self._dataset_inputs = dataset_inputs

    @property
    def model_inputs(self):
        """
        Gets the model_inputs of this ExperimentRunInputs.
        Model inputs for the run.


        :return: The model_inputs of this ExperimentRunInputs.
        :rtype: list[oci.aidataplatform_dp.models.ModelInput]
        """
        return self._model_inputs

    @model_inputs.setter
    def model_inputs(self, model_inputs):
        """
        Sets the model_inputs of this ExperimentRunInputs.
        Model inputs for the run.


        :param model_inputs: The model_inputs of this ExperimentRunInputs.
        :type: list[oci.aidataplatform_dp.models.ModelInput]
        """
        self._model_inputs = model_inputs

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
