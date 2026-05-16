# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ManageVolumePermissionDetails(object):
    """
    Information to update permissions on a volume.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ManageVolumePermissionDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param assign_volume_permission_details:
            The value to assign to the assign_volume_permission_details property of this ManageVolumePermissionDetails.
        :type assign_volume_permission_details: oci.aidataplatform_dp.models.AssignVolumePermissionDetails

        :param revoke_volume_permission_details:
            The value to assign to the revoke_volume_permission_details property of this ManageVolumePermissionDetails.
        :type revoke_volume_permission_details: oci.aidataplatform_dp.models.RevokeVolumePermissionDetails

        """
        self.swagger_types = {
            'assign_volume_permission_details': 'AssignVolumePermissionDetails',
            'revoke_volume_permission_details': 'RevokeVolumePermissionDetails'
        }

        self.attribute_map = {
            'assign_volume_permission_details': 'assignVolumePermissionDetails',
            'revoke_volume_permission_details': 'revokeVolumePermissionDetails'
        }

        self._assign_volume_permission_details = None
        self._revoke_volume_permission_details = None

    @property
    def assign_volume_permission_details(self):
        """
        Gets the assign_volume_permission_details of this ManageVolumePermissionDetails.

        :return: The assign_volume_permission_details of this ManageVolumePermissionDetails.
        :rtype: oci.aidataplatform_dp.models.AssignVolumePermissionDetails
        """
        return self._assign_volume_permission_details

    @assign_volume_permission_details.setter
    def assign_volume_permission_details(self, assign_volume_permission_details):
        """
        Sets the assign_volume_permission_details of this ManageVolumePermissionDetails.

        :param assign_volume_permission_details: The assign_volume_permission_details of this ManageVolumePermissionDetails.
        :type: oci.aidataplatform_dp.models.AssignVolumePermissionDetails
        """
        self._assign_volume_permission_details = assign_volume_permission_details

    @property
    def revoke_volume_permission_details(self):
        """
        Gets the revoke_volume_permission_details of this ManageVolumePermissionDetails.

        :return: The revoke_volume_permission_details of this ManageVolumePermissionDetails.
        :rtype: oci.aidataplatform_dp.models.RevokeVolumePermissionDetails
        """
        return self._revoke_volume_permission_details

    @revoke_volume_permission_details.setter
    def revoke_volume_permission_details(self, revoke_volume_permission_details):
        """
        Sets the revoke_volume_permission_details of this ManageVolumePermissionDetails.

        :param revoke_volume_permission_details: The revoke_volume_permission_details of this ManageVolumePermissionDetails.
        :type: oci.aidataplatform_dp.models.RevokeVolumePermissionDetails
        """
        self._revoke_volume_permission_details = revoke_volume_permission_details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
