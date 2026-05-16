# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ModelParameter(object):
    """
    The parameter details of each model
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ModelParameter object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param model_name:
            The value to assign to the model_name property of this ModelParameter.
        :type model_name: str

        :param model_parameters:
            The value to assign to the model_parameters property of this ModelParameter.
        :type model_parameters: oci.aidataplatform_dp.models.ModelParameterResponse

        """
        self.swagger_types = {
            'model_name': 'str',
            'model_parameters': 'ModelParameterResponse'
        }

        self.attribute_map = {
            'model_name': 'modelName',
            'model_parameters': 'modelParameters'
        }

        self._model_name = None
        self._model_parameters = None

    @property
    def model_name(self):
        """
        **[Required]** Gets the model_name of this ModelParameter.
        name of the model


        :return: The model_name of this ModelParameter.
        :rtype: str
        """
        return self._model_name

    @model_name.setter
    def model_name(self, model_name):
        """
        Sets the model_name of this ModelParameter.
        name of the model


        :param model_name: The model_name of this ModelParameter.
        :type: str
        """
        self._model_name = model_name

    @property
    def model_parameters(self):
        """
        **[Required]** Gets the model_parameters of this ModelParameter.

        :return: The model_parameters of this ModelParameter.
        :rtype: oci.aidataplatform_dp.models.ModelParameterResponse
        """
        return self._model_parameters

    @model_parameters.setter
    def model_parameters(self, model_parameters):
        """
        Sets the model_parameters of this ModelParameter.

        :param model_parameters: The model_parameters of this ModelParameter.
        :type: oci.aidataplatform_dp.models.ModelParameterResponse
        """
        self._model_parameters = model_parameters

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
