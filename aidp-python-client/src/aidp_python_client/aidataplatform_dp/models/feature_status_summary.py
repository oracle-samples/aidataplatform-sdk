# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class FeatureStatusSummary(object):
    """
    A single feature summary and its value.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new FeatureStatusSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param feature_name:
            The value to assign to the feature_name property of this FeatureStatusSummary.
        :type feature_name: str

        :param value:
            The value to assign to the value property of this FeatureStatusSummary.
        :type value: str

        :param error:
            The value to assign to the error property of this FeatureStatusSummary.
        :type error: str

        """
        self.swagger_types = {
            'feature_name': 'str',
            'value': 'str',
            'error': 'str'
        }

        self.attribute_map = {
            'feature_name': 'featureName',
            'value': 'value',
            'error': 'error'
        }

        self._feature_name = None
        self._value = None
        self._error = None

    @property
    def feature_name(self):
        """
        **[Required]** Gets the feature_name of this FeatureStatusSummary.
        The name of the queried feature.


        :return: The feature_name of this FeatureStatusSummary.
        :rtype: str
        """
        return self._feature_name

    @feature_name.setter
    def feature_name(self, feature_name):
        """
        Sets the feature_name of this FeatureStatusSummary.
        The name of the queried feature.


        :param feature_name: The feature_name of this FeatureStatusSummary.
        :type: str
        """
        self._feature_name = feature_name

    @property
    def value(self):
        """
        **[Required]** Gets the value of this FeatureStatusSummary.
        The status value of the feature.


        :return: The value of this FeatureStatusSummary.
        :rtype: str
        """
        return self._value

    @value.setter
    def value(self, value):
        """
        Sets the value of this FeatureStatusSummary.
        The status value of the feature.


        :param value: The value of this FeatureStatusSummary.
        :type: str
        """
        self._value = value

    @property
    def error(self):
        """
        Gets the error of this FeatureStatusSummary.
        Error message, if error with featureName like unsupported.


        :return: The error of this FeatureStatusSummary.
        :rtype: str
        """
        return self._error

    @error.setter
    def error(self, error):
        """
        Sets the error of this FeatureStatusSummary.
        Error message, if error with featureName like unsupported.


        :param error: The error of this FeatureStatusSummary.
        :type: str
        """
        self._error = error

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
