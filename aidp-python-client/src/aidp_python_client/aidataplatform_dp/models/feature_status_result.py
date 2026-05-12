# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class FeatureStatusResult(object):
    """
    Model representing the response for checking the status of a single feature.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new FeatureStatusResult object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param feature:
            The value to assign to the feature property of this FeatureStatusResult.
        :type feature: oci.aidataplatform_dp.models.Feature

        """
        self.swagger_types = {
            'feature': 'Feature'
        }

        self.attribute_map = {
            'feature': 'feature'
        }

        self._feature = None

    @property
    def feature(self):
        """
        **[Required]** Gets the feature of this FeatureStatusResult.

        :return: The feature of this FeatureStatusResult.
        :rtype: oci.aidataplatform_dp.models.Feature
        """
        return self._feature

    @feature.setter
    def feature(self, feature):
        """
        Sets the feature of this FeatureStatusResult.

        :param feature: The feature of this FeatureStatusResult.
        :type: oci.aidataplatform_dp.models.Feature
        """
        self._feature = feature

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
