# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ManageClusterPermissionDetails(object):
    """
    Information to update permissions on a cluster.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ManageClusterPermissionDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param assign_cluster_permission_details:
            The value to assign to the assign_cluster_permission_details property of this ManageClusterPermissionDetails.
        :type assign_cluster_permission_details: oci.aidataplatform_dp.models.AssignClusterPermissionDetails

        :param revoke_cluster_permission_details:
            The value to assign to the revoke_cluster_permission_details property of this ManageClusterPermissionDetails.
        :type revoke_cluster_permission_details: oci.aidataplatform_dp.models.RevokeClusterPermissionDetails

        """
        self.swagger_types = {
            'assign_cluster_permission_details': 'AssignClusterPermissionDetails',
            'revoke_cluster_permission_details': 'RevokeClusterPermissionDetails'
        }

        self.attribute_map = {
            'assign_cluster_permission_details': 'assignClusterPermissionDetails',
            'revoke_cluster_permission_details': 'revokeClusterPermissionDetails'
        }

        self._assign_cluster_permission_details = None
        self._revoke_cluster_permission_details = None

    @property
    def assign_cluster_permission_details(self):
        """
        Gets the assign_cluster_permission_details of this ManageClusterPermissionDetails.

        :return: The assign_cluster_permission_details of this ManageClusterPermissionDetails.
        :rtype: oci.aidataplatform_dp.models.AssignClusterPermissionDetails
        """
        return self._assign_cluster_permission_details

    @assign_cluster_permission_details.setter
    def assign_cluster_permission_details(self, assign_cluster_permission_details):
        """
        Sets the assign_cluster_permission_details of this ManageClusterPermissionDetails.

        :param assign_cluster_permission_details: The assign_cluster_permission_details of this ManageClusterPermissionDetails.
        :type: oci.aidataplatform_dp.models.AssignClusterPermissionDetails
        """
        self._assign_cluster_permission_details = assign_cluster_permission_details

    @property
    def revoke_cluster_permission_details(self):
        """
        Gets the revoke_cluster_permission_details of this ManageClusterPermissionDetails.

        :return: The revoke_cluster_permission_details of this ManageClusterPermissionDetails.
        :rtype: oci.aidataplatform_dp.models.RevokeClusterPermissionDetails
        """
        return self._revoke_cluster_permission_details

    @revoke_cluster_permission_details.setter
    def revoke_cluster_permission_details(self, revoke_cluster_permission_details):
        """
        Sets the revoke_cluster_permission_details of this ManageClusterPermissionDetails.

        :param revoke_cluster_permission_details: The revoke_cluster_permission_details of this ManageClusterPermissionDetails.
        :type: oci.aidataplatform_dp.models.RevokeClusterPermissionDetails
        """
        self._revoke_cluster_permission_details = revoke_cluster_permission_details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
