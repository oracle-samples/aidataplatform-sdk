# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdateModelVersionResponseDetails(object):
    """
    Updated ModelVersion details.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new UpdateModelVersionResponseDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param model_version:
            The value to assign to the model_version property of this UpdateModelVersionResponseDetails.
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
        **[Required]** Gets the model_version of this UpdateModelVersionResponseDetails.

        :return: The model_version of this UpdateModelVersionResponseDetails.
        :rtype: oci.aidataplatform_dp.models.ModelVersion
        """
        return self._model_version

    @model_version.setter
    def model_version(self, model_version):
        """
        Sets the model_version of this UpdateModelVersionResponseDetails.

        :param model_version: The model_version of this UpdateModelVersionResponseDetails.
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
