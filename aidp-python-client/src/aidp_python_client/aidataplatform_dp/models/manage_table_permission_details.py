# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ManageTablePermissionDetails(object):
    """
    Information to update permissions on a table.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ManageTablePermissionDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param assign_table_permission_details:
            The value to assign to the assign_table_permission_details property of this ManageTablePermissionDetails.
        :type assign_table_permission_details: oci.aidataplatform_dp.models.AssignTablePermissionDetails

        :param revoke_table_permission_details:
            The value to assign to the revoke_table_permission_details property of this ManageTablePermissionDetails.
        :type revoke_table_permission_details: oci.aidataplatform_dp.models.RevokeTablePermissionDetails

        """
        self.swagger_types = {
            'assign_table_permission_details': 'AssignTablePermissionDetails',
            'revoke_table_permission_details': 'RevokeTablePermissionDetails'
        }

        self.attribute_map = {
            'assign_table_permission_details': 'assignTablePermissionDetails',
            'revoke_table_permission_details': 'revokeTablePermissionDetails'
        }

        self._assign_table_permission_details = None
        self._revoke_table_permission_details = None

    @property
    def assign_table_permission_details(self):
        """
        Gets the assign_table_permission_details of this ManageTablePermissionDetails.

        :return: The assign_table_permission_details of this ManageTablePermissionDetails.
        :rtype: oci.aidataplatform_dp.models.AssignTablePermissionDetails
        """
        return self._assign_table_permission_details

    @assign_table_permission_details.setter
    def assign_table_permission_details(self, assign_table_permission_details):
        """
        Sets the assign_table_permission_details of this ManageTablePermissionDetails.

        :param assign_table_permission_details: The assign_table_permission_details of this ManageTablePermissionDetails.
        :type: oci.aidataplatform_dp.models.AssignTablePermissionDetails
        """
        self._assign_table_permission_details = assign_table_permission_details

    @property
    def revoke_table_permission_details(self):
        """
        Gets the revoke_table_permission_details of this ManageTablePermissionDetails.

        :return: The revoke_table_permission_details of this ManageTablePermissionDetails.
        :rtype: oci.aidataplatform_dp.models.RevokeTablePermissionDetails
        """
        return self._revoke_table_permission_details

    @revoke_table_permission_details.setter
    def revoke_table_permission_details(self, revoke_table_permission_details):
        """
        Sets the revoke_table_permission_details of this ManageTablePermissionDetails.

        :param revoke_table_permission_details: The revoke_table_permission_details of this ManageTablePermissionDetails.
        :type: oci.aidataplatform_dp.models.RevokeTablePermissionDetails
        """
        self._revoke_table_permission_details = revoke_table_permission_details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
