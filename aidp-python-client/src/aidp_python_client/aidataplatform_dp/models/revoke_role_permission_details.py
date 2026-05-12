# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class RevokeRolePermissionDetails(object):
    """
    The details of the permissions revoked from assignees for a role.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new RevokeRolePermissionDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param permission_with_resource_details:
            The value to assign to the permission_with_resource_details property of this RevokeRolePermissionDetails.
        :type permission_with_resource_details: list[oci.aidataplatform_dp.models.PermissionWithResourceDetails]

        """
        self.swagger_types = {
            'permission_with_resource_details': 'list[PermissionWithResourceDetails]'
        }

        self.attribute_map = {
            'permission_with_resource_details': 'permissionWithResourceDetails'
        }

        self._permission_with_resource_details = None

    @property
    def permission_with_resource_details(self):
        """
        **[Required]** Gets the permission_with_resource_details of this RevokeRolePermissionDetails.
        A list of permissions, resourceTypes, and resourceKeys.


        :return: The permission_with_resource_details of this RevokeRolePermissionDetails.
        :rtype: list[oci.aidataplatform_dp.models.PermissionWithResourceDetails]
        """
        return self._permission_with_resource_details

    @permission_with_resource_details.setter
    def permission_with_resource_details(self, permission_with_resource_details):
        """
        Sets the permission_with_resource_details of this RevokeRolePermissionDetails.
        A list of permissions, resourceTypes, and resourceKeys.


        :param permission_with_resource_details: The permission_with_resource_details of this RevokeRolePermissionDetails.
        :type: list[oci.aidataplatform_dp.models.PermissionWithResourceDetails]
        """
        self._permission_with_resource_details = permission_with_resource_details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
