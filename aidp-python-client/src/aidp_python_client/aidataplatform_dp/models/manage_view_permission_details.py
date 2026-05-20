# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ManageViewPermissionDetails(object):
    """
    Information to update permissions on a view.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ManageViewPermissionDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param assign_view_permission_details:
            The value to assign to the assign_view_permission_details property of this ManageViewPermissionDetails.
        :type assign_view_permission_details: oci.aidataplatform_dp.models.AssignViewPermissionDetails

        :param revoke_view_permission_details:
            The value to assign to the revoke_view_permission_details property of this ManageViewPermissionDetails.
        :type revoke_view_permission_details: oci.aidataplatform_dp.models.RevokeViewPermissionDetails

        """
        self.swagger_types = {
            'assign_view_permission_details': 'AssignViewPermissionDetails',
            'revoke_view_permission_details': 'RevokeViewPermissionDetails'
        }

        self.attribute_map = {
            'assign_view_permission_details': 'assignViewPermissionDetails',
            'revoke_view_permission_details': 'revokeViewPermissionDetails'
        }

        self._assign_view_permission_details = None
        self._revoke_view_permission_details = None

    @property
    def assign_view_permission_details(self):
        """
        Gets the assign_view_permission_details of this ManageViewPermissionDetails.

        :return: The assign_view_permission_details of this ManageViewPermissionDetails.
        :rtype: oci.aidataplatform_dp.models.AssignViewPermissionDetails
        """
        return self._assign_view_permission_details

    @assign_view_permission_details.setter
    def assign_view_permission_details(self, assign_view_permission_details):
        """
        Sets the assign_view_permission_details of this ManageViewPermissionDetails.

        :param assign_view_permission_details: The assign_view_permission_details of this ManageViewPermissionDetails.
        :type: oci.aidataplatform_dp.models.AssignViewPermissionDetails
        """
        self._assign_view_permission_details = assign_view_permission_details

    @property
    def revoke_view_permission_details(self):
        """
        Gets the revoke_view_permission_details of this ManageViewPermissionDetails.

        :return: The revoke_view_permission_details of this ManageViewPermissionDetails.
        :rtype: oci.aidataplatform_dp.models.RevokeViewPermissionDetails
        """
        return self._revoke_view_permission_details

    @revoke_view_permission_details.setter
    def revoke_view_permission_details(self, revoke_view_permission_details):
        """
        Sets the revoke_view_permission_details of this ManageViewPermissionDetails.

        :param revoke_view_permission_details: The revoke_view_permission_details of this ManageViewPermissionDetails.
        :type: oci.aidataplatform_dp.models.RevokeViewPermissionDetails
        """
        self._revoke_view_permission_details = revoke_view_permission_details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
