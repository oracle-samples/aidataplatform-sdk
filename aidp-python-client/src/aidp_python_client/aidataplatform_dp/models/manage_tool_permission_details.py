# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ManageToolPermissionDetails(object):
    """
    Information to update permissions on a tool.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ManageToolPermissionDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param assign_tool_permission_details:
            The value to assign to the assign_tool_permission_details property of this ManageToolPermissionDetails.
        :type assign_tool_permission_details: oci.aidataplatform_dp.models.AssignToolPermissionDetails

        :param revoke_tool_permission_details:
            The value to assign to the revoke_tool_permission_details property of this ManageToolPermissionDetails.
        :type revoke_tool_permission_details: oci.aidataplatform_dp.models.RevokeToolPermissionDetails

        """
        self.swagger_types = {
            'assign_tool_permission_details': 'AssignToolPermissionDetails',
            'revoke_tool_permission_details': 'RevokeToolPermissionDetails'
        }

        self.attribute_map = {
            'assign_tool_permission_details': 'assignToolPermissionDetails',
            'revoke_tool_permission_details': 'revokeToolPermissionDetails'
        }

        self._assign_tool_permission_details = None
        self._revoke_tool_permission_details = None

    @property
    def assign_tool_permission_details(self):
        """
        Gets the assign_tool_permission_details of this ManageToolPermissionDetails.

        :return: The assign_tool_permission_details of this ManageToolPermissionDetails.
        :rtype: oci.aidataplatform_dp.models.AssignToolPermissionDetails
        """
        return self._assign_tool_permission_details

    @assign_tool_permission_details.setter
    def assign_tool_permission_details(self, assign_tool_permission_details):
        """
        Sets the assign_tool_permission_details of this ManageToolPermissionDetails.

        :param assign_tool_permission_details: The assign_tool_permission_details of this ManageToolPermissionDetails.
        :type: oci.aidataplatform_dp.models.AssignToolPermissionDetails
        """
        self._assign_tool_permission_details = assign_tool_permission_details

    @property
    def revoke_tool_permission_details(self):
        """
        Gets the revoke_tool_permission_details of this ManageToolPermissionDetails.

        :return: The revoke_tool_permission_details of this ManageToolPermissionDetails.
        :rtype: oci.aidataplatform_dp.models.RevokeToolPermissionDetails
        """
        return self._revoke_tool_permission_details

    @revoke_tool_permission_details.setter
    def revoke_tool_permission_details(self, revoke_tool_permission_details):
        """
        Sets the revoke_tool_permission_details of this ManageToolPermissionDetails.

        :param revoke_tool_permission_details: The revoke_tool_permission_details of this ManageToolPermissionDetails.
        :type: oci.aidataplatform_dp.models.RevokeToolPermissionDetails
        """
        self._revoke_tool_permission_details = revoke_tool_permission_details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
