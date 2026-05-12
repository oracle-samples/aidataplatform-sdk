# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ManageRecipientPermissionDetails(object):
    """
    Information to update permissions on a recipient.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ManageRecipientPermissionDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param assign_recipient_permission_details:
            The value to assign to the assign_recipient_permission_details property of this ManageRecipientPermissionDetails.
        :type assign_recipient_permission_details: oci.aidataplatform_dp.models.AssignRecipientPermissionDetails

        :param revoke_recipient_permission_details:
            The value to assign to the revoke_recipient_permission_details property of this ManageRecipientPermissionDetails.
        :type revoke_recipient_permission_details: oci.aidataplatform_dp.models.RevokeRecipientPermissionDetails

        """
        self.swagger_types = {
            'assign_recipient_permission_details': 'AssignRecipientPermissionDetails',
            'revoke_recipient_permission_details': 'RevokeRecipientPermissionDetails'
        }

        self.attribute_map = {
            'assign_recipient_permission_details': 'assignRecipientPermissionDetails',
            'revoke_recipient_permission_details': 'revokeRecipientPermissionDetails'
        }

        self._assign_recipient_permission_details = None
        self._revoke_recipient_permission_details = None

    @property
    def assign_recipient_permission_details(self):
        """
        Gets the assign_recipient_permission_details of this ManageRecipientPermissionDetails.

        :return: The assign_recipient_permission_details of this ManageRecipientPermissionDetails.
        :rtype: oci.aidataplatform_dp.models.AssignRecipientPermissionDetails
        """
        return self._assign_recipient_permission_details

    @assign_recipient_permission_details.setter
    def assign_recipient_permission_details(self, assign_recipient_permission_details):
        """
        Sets the assign_recipient_permission_details of this ManageRecipientPermissionDetails.

        :param assign_recipient_permission_details: The assign_recipient_permission_details of this ManageRecipientPermissionDetails.
        :type: oci.aidataplatform_dp.models.AssignRecipientPermissionDetails
        """
        self._assign_recipient_permission_details = assign_recipient_permission_details

    @property
    def revoke_recipient_permission_details(self):
        """
        Gets the revoke_recipient_permission_details of this ManageRecipientPermissionDetails.

        :return: The revoke_recipient_permission_details of this ManageRecipientPermissionDetails.
        :rtype: oci.aidataplatform_dp.models.RevokeRecipientPermissionDetails
        """
        return self._revoke_recipient_permission_details

    @revoke_recipient_permission_details.setter
    def revoke_recipient_permission_details(self, revoke_recipient_permission_details):
        """
        Sets the revoke_recipient_permission_details of this ManageRecipientPermissionDetails.

        :param revoke_recipient_permission_details: The revoke_recipient_permission_details of this ManageRecipientPermissionDetails.
        :type: oci.aidataplatform_dp.models.RevokeRecipientPermissionDetails
        """
        self._revoke_recipient_permission_details = revoke_recipient_permission_details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
