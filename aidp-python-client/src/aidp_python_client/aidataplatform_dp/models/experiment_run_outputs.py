# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ExperimentRunOutputs(object):
    """
    Run outputs.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ExperimentRunOutputs object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param model_outputs:
            The value to assign to the model_outputs property of this ExperimentRunOutputs.
        :type model_outputs: list[oci.aidataplatform_dp.models.ModelOutput]

        """
        self.swagger_types = {
            'model_outputs': 'list[ModelOutput]'
        }

        self.attribute_map = {
            'model_outputs': 'model_outputs'
        }

        self._model_outputs = None

    @property
    def model_outputs(self):
        """
        Gets the model_outputs of this ExperimentRunOutputs.
        Model outputs for the run.


        :return: The model_outputs of this ExperimentRunOutputs.
        :rtype: list[oci.aidataplatform_dp.models.ModelOutput]
        """
        return self._model_outputs

    @model_outputs.setter
    def model_outputs(self, model_outputs):
        """
        Sets the model_outputs of this ExperimentRunOutputs.
        Model outputs for the run.


        :param model_outputs: The model_outputs of this ExperimentRunOutputs.
        :type: list[oci.aidataplatform_dp.models.ModelOutput]
        """
        self._model_outputs = model_outputs

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
