# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ManageSharePermissionDetails(object):
    """
    Information to update permissions on a share.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ManageSharePermissionDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param assign_share_permission_details:
            The value to assign to the assign_share_permission_details property of this ManageSharePermissionDetails.
        :type assign_share_permission_details: oci.aidataplatform_dp.models.AssignSharePermissionDetails

        :param revoke_share_permission_details:
            The value to assign to the revoke_share_permission_details property of this ManageSharePermissionDetails.
        :type revoke_share_permission_details: oci.aidataplatform_dp.models.RevokeSharePermissionDetails

        """
        self.swagger_types = {
            'assign_share_permission_details': 'AssignSharePermissionDetails',
            'revoke_share_permission_details': 'RevokeSharePermissionDetails'
        }

        self.attribute_map = {
            'assign_share_permission_details': 'assignSharePermissionDetails',
            'revoke_share_permission_details': 'revokeSharePermissionDetails'
        }

        self._assign_share_permission_details = None
        self._revoke_share_permission_details = None

    @property
    def assign_share_permission_details(self):
        """
        Gets the assign_share_permission_details of this ManageSharePermissionDetails.

        :return: The assign_share_permission_details of this ManageSharePermissionDetails.
        :rtype: oci.aidataplatform_dp.models.AssignSharePermissionDetails
        """
        return self._assign_share_permission_details

    @assign_share_permission_details.setter
    def assign_share_permission_details(self, assign_share_permission_details):
        """
        Sets the assign_share_permission_details of this ManageSharePermissionDetails.

        :param assign_share_permission_details: The assign_share_permission_details of this ManageSharePermissionDetails.
        :type: oci.aidataplatform_dp.models.AssignSharePermissionDetails
        """
        self._assign_share_permission_details = assign_share_permission_details

    @property
    def revoke_share_permission_details(self):
        """
        Gets the revoke_share_permission_details of this ManageSharePermissionDetails.

        :return: The revoke_share_permission_details of this ManageSharePermissionDetails.
        :rtype: oci.aidataplatform_dp.models.RevokeSharePermissionDetails
        """
        return self._revoke_share_permission_details

    @revoke_share_permission_details.setter
    def revoke_share_permission_details(self, revoke_share_permission_details):
        """
        Sets the revoke_share_permission_details of this ManageSharePermissionDetails.

        :param revoke_share_permission_details: The revoke_share_permission_details of this ManageSharePermissionDetails.
        :type: oci.aidataplatform_dp.models.RevokeSharePermissionDetails
        """
        self._revoke_share_permission_details = revoke_share_permission_details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
