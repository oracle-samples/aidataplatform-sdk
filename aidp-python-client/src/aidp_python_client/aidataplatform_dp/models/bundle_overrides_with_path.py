# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class BundleOverridesWithPath(object):
    """
    Response payload for creating or updating bundle overrides.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new BundleOverridesWithPath object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param path:
            The value to assign to the path property of this BundleOverridesWithPath.
        :type path: str

        :param overrides:
            The value to assign to the overrides property of this BundleOverridesWithPath.
        :type overrides: oci.aidataplatform_dp.models.BundleOverrides

        """
        self.swagger_types = {
            'path': 'str',
            'overrides': 'BundleOverrides'
        }

        self.attribute_map = {
            'path': 'path',
            'overrides': 'overrides'
        }

        self._path = None
        self._overrides = None

    @property
    def path(self):
        """
        **[Required]** Gets the path of this BundleOverridesWithPath.
        Target folder for the new bundle


        :return: The path of this BundleOverridesWithPath.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path):
        """
        Sets the path of this BundleOverridesWithPath.
        Target folder for the new bundle


        :param path: The path of this BundleOverridesWithPath.
        :type: str
        """
        self._path = path

    @property
    def overrides(self):
        """
        **[Required]** Gets the overrides of this BundleOverridesWithPath.

        :return: The overrides of this BundleOverridesWithPath.
        :rtype: oci.aidataplatform_dp.models.BundleOverrides
        """
        return self._overrides

    @overrides.setter
    def overrides(self, overrides):
        """
        Sets the overrides of this BundleOverridesWithPath.

        :param overrides: The overrides of this BundleOverridesWithPath.
        :type: oci.aidataplatform_dp.models.BundleOverrides
        """
        self._overrides = overrides

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
