# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ManageCredentialPermissionDetails(object):
    """
    Information to update permissions on a Credential.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ManageCredentialPermissionDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param assign_credential_permission_details:
            The value to assign to the assign_credential_permission_details property of this ManageCredentialPermissionDetails.
        :type assign_credential_permission_details: oci.aidataplatform_dp.models.AssignCredentialPermissionDetails

        :param revoke_credential_permission_details:
            The value to assign to the revoke_credential_permission_details property of this ManageCredentialPermissionDetails.
        :type revoke_credential_permission_details: oci.aidataplatform_dp.models.RevokeCredentialPermissionDetails

        """
        self.swagger_types = {
            'assign_credential_permission_details': 'AssignCredentialPermissionDetails',
            'revoke_credential_permission_details': 'RevokeCredentialPermissionDetails'
        }

        self.attribute_map = {
            'assign_credential_permission_details': 'assignCredentialPermissionDetails',
            'revoke_credential_permission_details': 'revokeCredentialPermissionDetails'
        }

        self._assign_credential_permission_details = None
        self._revoke_credential_permission_details = None

    @property
    def assign_credential_permission_details(self):
        """
        Gets the assign_credential_permission_details of this ManageCredentialPermissionDetails.

        :return: The assign_credential_permission_details of this ManageCredentialPermissionDetails.
        :rtype: oci.aidataplatform_dp.models.AssignCredentialPermissionDetails
        """
        return self._assign_credential_permission_details

    @assign_credential_permission_details.setter
    def assign_credential_permission_details(self, assign_credential_permission_details):
        """
        Sets the assign_credential_permission_details of this ManageCredentialPermissionDetails.

        :param assign_credential_permission_details: The assign_credential_permission_details of this ManageCredentialPermissionDetails.
        :type: oci.aidataplatform_dp.models.AssignCredentialPermissionDetails
        """
        self._assign_credential_permission_details = assign_credential_permission_details

    @property
    def revoke_credential_permission_details(self):
        """
        Gets the revoke_credential_permission_details of this ManageCredentialPermissionDetails.

        :return: The revoke_credential_permission_details of this ManageCredentialPermissionDetails.
        :rtype: oci.aidataplatform_dp.models.RevokeCredentialPermissionDetails
        """
        return self._revoke_credential_permission_details

    @revoke_credential_permission_details.setter
    def revoke_credential_permission_details(self, revoke_credential_permission_details):
        """
        Sets the revoke_credential_permission_details of this ManageCredentialPermissionDetails.

        :param revoke_credential_permission_details: The revoke_credential_permission_details of this ManageCredentialPermissionDetails.
        :type: oci.aidataplatform_dp.models.RevokeCredentialPermissionDetails
        """
        self._revoke_credential_permission_details = revoke_credential_permission_details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
