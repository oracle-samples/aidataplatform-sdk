# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ManageRolePermissionDetails(object):
    """
    Information to update permissions on a role.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ManageRolePermissionDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param assign_role_permission_details:
            The value to assign to the assign_role_permission_details property of this ManageRolePermissionDetails.
        :type assign_role_permission_details: oci.aidataplatform_dp.models.AssignRolePermissionDetails

        :param revoke_role_permission_details:
            The value to assign to the revoke_role_permission_details property of this ManageRolePermissionDetails.
        :type revoke_role_permission_details: oci.aidataplatform_dp.models.RevokeRolePermissionDetails

        """
        self.swagger_types = {
            'assign_role_permission_details': 'AssignRolePermissionDetails',
            'revoke_role_permission_details': 'RevokeRolePermissionDetails'
        }

        self.attribute_map = {
            'assign_role_permission_details': 'assignRolePermissionDetails',
            'revoke_role_permission_details': 'revokeRolePermissionDetails'
        }

        self._assign_role_permission_details = None
        self._revoke_role_permission_details = None

    @property
    def assign_role_permission_details(self):
        """
        Gets the assign_role_permission_details of this ManageRolePermissionDetails.

        :return: The assign_role_permission_details of this ManageRolePermissionDetails.
        :rtype: oci.aidataplatform_dp.models.AssignRolePermissionDetails
        """
        return self._assign_role_permission_details

    @assign_role_permission_details.setter
    def assign_role_permission_details(self, assign_role_permission_details):
        """
        Sets the assign_role_permission_details of this ManageRolePermissionDetails.

        :param assign_role_permission_details: The assign_role_permission_details of this ManageRolePermissionDetails.
        :type: oci.aidataplatform_dp.models.AssignRolePermissionDetails
        """
        self._assign_role_permission_details = assign_role_permission_details

    @property
    def revoke_role_permission_details(self):
        """
        Gets the revoke_role_permission_details of this ManageRolePermissionDetails.

        :return: The revoke_role_permission_details of this ManageRolePermissionDetails.
        :rtype: oci.aidataplatform_dp.models.RevokeRolePermissionDetails
        """
        return self._revoke_role_permission_details

    @revoke_role_permission_details.setter
    def revoke_role_permission_details(self, revoke_role_permission_details):
        """
        Sets the revoke_role_permission_details of this ManageRolePermissionDetails.

        :param revoke_role_permission_details: The revoke_role_permission_details of this ManageRolePermissionDetails.
        :type: oci.aidataplatform_dp.models.RevokeRolePermissionDetails
        """
        self._revoke_role_permission_details = revoke_role_permission_details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
