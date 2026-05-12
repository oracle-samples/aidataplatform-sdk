# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ManageWorkspacePermissionDetails(object):
    """
    Information to update permissions on a workspace.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ManageWorkspacePermissionDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param assign_workspace_permission_details:
            The value to assign to the assign_workspace_permission_details property of this ManageWorkspacePermissionDetails.
        :type assign_workspace_permission_details: oci.aidataplatform_dp.models.AssignWorkspacePermissionDetails

        :param revoke_workspace_permission_details:
            The value to assign to the revoke_workspace_permission_details property of this ManageWorkspacePermissionDetails.
        :type revoke_workspace_permission_details: oci.aidataplatform_dp.models.RevokeWorkspacePermissionDetails

        """
        self.swagger_types = {
            'assign_workspace_permission_details': 'AssignWorkspacePermissionDetails',
            'revoke_workspace_permission_details': 'RevokeWorkspacePermissionDetails'
        }

        self.attribute_map = {
            'assign_workspace_permission_details': 'assignWorkspacePermissionDetails',
            'revoke_workspace_permission_details': 'revokeWorkspacePermissionDetails'
        }

        self._assign_workspace_permission_details = None
        self._revoke_workspace_permission_details = None

    @property
    def assign_workspace_permission_details(self):
        """
        Gets the assign_workspace_permission_details of this ManageWorkspacePermissionDetails.

        :return: The assign_workspace_permission_details of this ManageWorkspacePermissionDetails.
        :rtype: oci.aidataplatform_dp.models.AssignWorkspacePermissionDetails
        """
        return self._assign_workspace_permission_details

    @assign_workspace_permission_details.setter
    def assign_workspace_permission_details(self, assign_workspace_permission_details):
        """
        Sets the assign_workspace_permission_details of this ManageWorkspacePermissionDetails.

        :param assign_workspace_permission_details: The assign_workspace_permission_details of this ManageWorkspacePermissionDetails.
        :type: oci.aidataplatform_dp.models.AssignWorkspacePermissionDetails
        """
        self._assign_workspace_permission_details = assign_workspace_permission_details

    @property
    def revoke_workspace_permission_details(self):
        """
        Gets the revoke_workspace_permission_details of this ManageWorkspacePermissionDetails.

        :return: The revoke_workspace_permission_details of this ManageWorkspacePermissionDetails.
        :rtype: oci.aidataplatform_dp.models.RevokeWorkspacePermissionDetails
        """
        return self._revoke_workspace_permission_details

    @revoke_workspace_permission_details.setter
    def revoke_workspace_permission_details(self, revoke_workspace_permission_details):
        """
        Sets the revoke_workspace_permission_details of this ManageWorkspacePermissionDetails.

        :param revoke_workspace_permission_details: The revoke_workspace_permission_details of this ManageWorkspacePermissionDetails.
        :type: oci.aidataplatform_dp.models.RevokeWorkspacePermissionDetails
        """
        self._revoke_workspace_permission_details = revoke_workspace_permission_details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
