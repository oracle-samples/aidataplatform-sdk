# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ModelOutput(object):
    """
    Model output.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ModelOutput object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param model_id:
            The value to assign to the model_id property of this ModelOutput.
        :type model_id: str

        :param step:
            The value to assign to the step property of this ModelOutput.
        :type step: int

        """
        self.swagger_types = {
            'model_id': 'str',
            'step': 'int'
        }

        self.attribute_map = {
            'model_id': 'model_id',
            'step': 'step'
        }

        self._model_id = None
        self._step = None

    @property
    def model_id(self):
        """
        **[Required]** Gets the model_id of this ModelOutput.
        ID of the model input


        :return: The model_id of this ModelOutput.
        :rtype: str
        """
        return self._model_id

    @model_id.setter
    def model_id(self, model_id):
        """
        Sets the model_id of this ModelOutput.
        ID of the model input


        :param model_id: The model_id of this ModelOutput.
        :type: str
        """
        self._model_id = model_id

    @property
    def step(self):
        """
        Gets the step of this ModelOutput.
        Step at which the model was produced.


        :return: The step of this ModelOutput.
        :rtype: int
        """
        return self._step

    @step.setter
    def step(self, step):
        """
        Sets the step of this ModelOutput.
        Step at which the model was produced.


        :param step: The step of this ModelOutput.
        :type: int
        """
        self._step = step

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
