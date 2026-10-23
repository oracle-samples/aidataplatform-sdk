# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ManageRegisteredModelPermissionDetails(object):
    """
    Information to grant or revoke permissions on a registered model's dedicated volume.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ManageRegisteredModelPermissionDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param assign_registered_model_permission_details:
            The value to assign to the assign_registered_model_permission_details property of this ManageRegisteredModelPermissionDetails.
        :type assign_registered_model_permission_details: oci.aidataplatform_dp.models.AssignRegisteredModelPermissionDetails

        :param revoke_registered_model_permission_details:
            The value to assign to the revoke_registered_model_permission_details property of this ManageRegisteredModelPermissionDetails.
        :type revoke_registered_model_permission_details: oci.aidataplatform_dp.models.RevokeRegisteredModelPermissionDetails

        """
        self.swagger_types = {
            'assign_registered_model_permission_details': 'AssignRegisteredModelPermissionDetails',
            'revoke_registered_model_permission_details': 'RevokeRegisteredModelPermissionDetails'
        }
        self.attribute_map = {
            'assign_registered_model_permission_details': 'assignRegisteredModelPermissionDetails',
            'revoke_registered_model_permission_details': 'revokeRegisteredModelPermissionDetails'
        }
        self._assign_registered_model_permission_details = None
        self._revoke_registered_model_permission_details = None

    @property
    def assign_registered_model_permission_details(self):
        """
        Gets the assign_registered_model_permission_details of this ManageRegisteredModelPermissionDetails.

        :return: The assign_registered_model_permission_details of this ManageRegisteredModelPermissionDetails.
        :rtype: oci.aidataplatform_dp.models.AssignRegisteredModelPermissionDetails
        """
        return self._assign_registered_model_permission_details

    @assign_registered_model_permission_details.setter
    def assign_registered_model_permission_details(self, assign_registered_model_permission_details):
        """
        Sets the assign_registered_model_permission_details of this ManageRegisteredModelPermissionDetails.

        :param assign_registered_model_permission_details: The assign_registered_model_permission_details of this ManageRegisteredModelPermissionDetails.
        :type: oci.aidataplatform_dp.models.AssignRegisteredModelPermissionDetails
        """
        self._assign_registered_model_permission_details = assign_registered_model_permission_details

    @property
    def revoke_registered_model_permission_details(self):
        """
        Gets the revoke_registered_model_permission_details of this ManageRegisteredModelPermissionDetails.

        :return: The revoke_registered_model_permission_details of this ManageRegisteredModelPermissionDetails.
        :rtype: oci.aidataplatform_dp.models.RevokeRegisteredModelPermissionDetails
        """
        return self._revoke_registered_model_permission_details

    @revoke_registered_model_permission_details.setter
    def revoke_registered_model_permission_details(self, revoke_registered_model_permission_details):
        """
        Sets the revoke_registered_model_permission_details of this ManageRegisteredModelPermissionDetails.

        :param revoke_registered_model_permission_details: The revoke_registered_model_permission_details of this ManageRegisteredModelPermissionDetails.
        :type: oci.aidataplatform_dp.models.RevokeRegisteredModelPermissionDetails
        """
        self._revoke_registered_model_permission_details = revoke_registered_model_permission_details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
