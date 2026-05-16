# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ManageCreateWorkspacePermissionDetails(object):
    """
    Information to update permissions on a workspace.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ManageCreateWorkspacePermissionDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param assign_create_workspace_permission_details:
            The value to assign to the assign_create_workspace_permission_details property of this ManageCreateWorkspacePermissionDetails.
        :type assign_create_workspace_permission_details: oci.aidataplatform_dp.models.AssignCreateWorkspacePermissionDetails

        :param revoke_create_workspace_permission_details:
            The value to assign to the revoke_create_workspace_permission_details property of this ManageCreateWorkspacePermissionDetails.
        :type revoke_create_workspace_permission_details: oci.aidataplatform_dp.models.RevokeCreateWorkspacePermissionDetails

        """
        self.swagger_types = {
            'assign_create_workspace_permission_details': 'AssignCreateWorkspacePermissionDetails',
            'revoke_create_workspace_permission_details': 'RevokeCreateWorkspacePermissionDetails'
        }

        self.attribute_map = {
            'assign_create_workspace_permission_details': 'assignCreateWorkspacePermissionDetails',
            'revoke_create_workspace_permission_details': 'revokeCreateWorkspacePermissionDetails'
        }

        self._assign_create_workspace_permission_details = None
        self._revoke_create_workspace_permission_details = None

    @property
    def assign_create_workspace_permission_details(self):
        """
        Gets the assign_create_workspace_permission_details of this ManageCreateWorkspacePermissionDetails.

        :return: The assign_create_workspace_permission_details of this ManageCreateWorkspacePermissionDetails.
        :rtype: oci.aidataplatform_dp.models.AssignCreateWorkspacePermissionDetails
        """
        return self._assign_create_workspace_permission_details

    @assign_create_workspace_permission_details.setter
    def assign_create_workspace_permission_details(self, assign_create_workspace_permission_details):
        """
        Sets the assign_create_workspace_permission_details of this ManageCreateWorkspacePermissionDetails.

        :param assign_create_workspace_permission_details: The assign_create_workspace_permission_details of this ManageCreateWorkspacePermissionDetails.
        :type: oci.aidataplatform_dp.models.AssignCreateWorkspacePermissionDetails
        """
        self._assign_create_workspace_permission_details = assign_create_workspace_permission_details

    @property
    def revoke_create_workspace_permission_details(self):
        """
        Gets the revoke_create_workspace_permission_details of this ManageCreateWorkspacePermissionDetails.

        :return: The revoke_create_workspace_permission_details of this ManageCreateWorkspacePermissionDetails.
        :rtype: oci.aidataplatform_dp.models.RevokeCreateWorkspacePermissionDetails
        """
        return self._revoke_create_workspace_permission_details

    @revoke_create_workspace_permission_details.setter
    def revoke_create_workspace_permission_details(self, revoke_create_workspace_permission_details):
        """
        Sets the revoke_create_workspace_permission_details of this ManageCreateWorkspacePermissionDetails.

        :param revoke_create_workspace_permission_details: The revoke_create_workspace_permission_details of this ManageCreateWorkspacePermissionDetails.
        :type: oci.aidataplatform_dp.models.RevokeCreateWorkspacePermissionDetails
        """
        self._revoke_create_workspace_permission_details = revoke_create_workspace_permission_details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
