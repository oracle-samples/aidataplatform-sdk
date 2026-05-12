# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class BundleOverrides(object):
    """
    Override candidates grouped by dependency for compute and aicompute.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new BundleOverrides object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param compute:
            The value to assign to the compute property of this BundleOverrides.
        :type compute: list[oci.aidataplatform_dp.models.ComputeOverrideItem]

        :param aicompute:
            The value to assign to the aicompute property of this BundleOverrides.
        :type aicompute: list[oci.aidataplatform_dp.models.AiComputeOverrideItem]

        """
        self.swagger_types = {
            'compute': 'list[ComputeOverrideItem]',
            'aicompute': 'list[AiComputeOverrideItem]'
        }

        self.attribute_map = {
            'compute': 'compute',
            'aicompute': 'aicompute'
        }

        self._compute = None
        self._aicompute = None

    @property
    def compute(self):
        """
        **[Required]** Gets the compute of this BundleOverrides.
        Compute override candidates grouped by dependency.


        :return: The compute of this BundleOverrides.
        :rtype: list[oci.aidataplatform_dp.models.ComputeOverrideItem]
        """
        return self._compute

    @compute.setter
    def compute(self, compute):
        """
        Sets the compute of this BundleOverrides.
        Compute override candidates grouped by dependency.


        :param compute: The compute of this BundleOverrides.
        :type: list[oci.aidataplatform_dp.models.ComputeOverrideItem]
        """
        self._compute = compute

    @property
    def aicompute(self):
        """
        **[Required]** Gets the aicompute of this BundleOverrides.
        Aicompute override candidates grouped by dependency.


        :return: The aicompute of this BundleOverrides.
        :rtype: list[oci.aidataplatform_dp.models.AiComputeOverrideItem]
        """
        return self._aicompute

    @aicompute.setter
    def aicompute(self, aicompute):
        """
        Sets the aicompute of this BundleOverrides.
        Aicompute override candidates grouped by dependency.


        :param aicompute: The aicompute of this BundleOverrides.
        :type: list[oci.aidataplatform_dp.models.AiComputeOverrideItem]
        """
        self._aicompute = aicompute

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
