# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ModelInput(object):
    """
    Model input.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ModelInput object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param model_id:
            The value to assign to the model_id property of this ModelInput.
        :type model_id: str

        """
        self.swagger_types = {
            'model_id': 'str'
        }

        self.attribute_map = {
            'model_id': 'model_id'
        }

        self._model_id = None

    @property
    def model_id(self):
        """
        **[Required]** Gets the model_id of this ModelInput.
        ID of the model input


        :return: The model_id of this ModelInput.
        :rtype: str
        """
        return self._model_id

    @model_id.setter
    def model_id(self, model_id):
        """
        Sets the model_id of this ModelInput.
        ID of the model input


        :param model_id: The model_id of this ModelInput.
        :type: str
        """
        self._model_id = model_id

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
