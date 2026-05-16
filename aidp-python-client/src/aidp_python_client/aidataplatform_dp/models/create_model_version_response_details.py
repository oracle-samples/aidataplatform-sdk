# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateModelVersionResponseDetails(object):
    """
    Created ModelVersion details.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new CreateModelVersionResponseDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param model_version:
            The value to assign to the model_version property of this CreateModelVersionResponseDetails.
        :type model_version: oci.aidataplatform_dp.models.ModelVersion

        """
        self.swagger_types = {
            'model_version': 'ModelVersion'
        }

        self.attribute_map = {
            'model_version': 'model_version'
        }

        self._model_version = None

    @property
    def model_version(self):
        """
        **[Required]** Gets the model_version of this CreateModelVersionResponseDetails.

        :return: The model_version of this CreateModelVersionResponseDetails.
        :rtype: oci.aidataplatform_dp.models.ModelVersion
        """
        return self._model_version

    @model_version.setter
    def model_version(self, model_version):
        """
        Sets the model_version of this CreateModelVersionResponseDetails.

        :param model_version: The model_version of this CreateModelVersionResponseDetails.
        :type: oci.aidataplatform_dp.models.ModelVersion
        """
        self._model_version = model_version

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
