# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdateRegisteredModelResponseDetails(object):
    """
    Response object for updating a RegisteredModel
    """

    def __init__(self, **kwargs):
        """
        Initializes a new UpdateRegisteredModelResponseDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param registered_model:
            The value to assign to the registered_model property of this UpdateRegisteredModelResponseDetails.
        :type registered_model: oci.aidataplatform_dp.models.RegisteredModel

        """
        self.swagger_types = {
            'registered_model': 'RegisteredModel'
        }

        self.attribute_map = {
            'registered_model': 'registered_model'
        }

        self._registered_model = None

    @property
    def registered_model(self):
        """
        **[Required]** Gets the registered_model of this UpdateRegisteredModelResponseDetails.

        :return: The registered_model of this UpdateRegisteredModelResponseDetails.
        :rtype: oci.aidataplatform_dp.models.RegisteredModel
        """
        return self._registered_model

    @registered_model.setter
    def registered_model(self, registered_model):
        """
        Sets the registered_model of this UpdateRegisteredModelResponseDetails.

        :param registered_model: The registered_model of this UpdateRegisteredModelResponseDetails.
        :type: oci.aidataplatform_dp.models.RegisteredModel
        """
        self._registered_model = registered_model

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
