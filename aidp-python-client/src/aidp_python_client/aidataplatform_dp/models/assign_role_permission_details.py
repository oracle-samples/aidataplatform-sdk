# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AssignRolePermissionDetails(object):
    """
    The details of the permissions assigned on the role to assignee.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AssignRolePermissionDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param permission_with_resource_details:
            The value to assign to the permission_with_resource_details property of this AssignRolePermissionDetails.
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
        **[Required]** Gets the permission_with_resource_details of this AssignRolePermissionDetails.
        A list of permissions, resourceTypes, and resourceKeys.


        :return: The permission_with_resource_details of this AssignRolePermissionDetails.
        :rtype: list[oci.aidataplatform_dp.models.PermissionWithResourceDetails]
        """
        return self._permission_with_resource_details

    @permission_with_resource_details.setter
    def permission_with_resource_details(self, permission_with_resource_details):
        """
        Sets the permission_with_resource_details of this AssignRolePermissionDetails.
        A list of permissions, resourceTypes, and resourceKeys.


        :param permission_with_resource_details: The permission_with_resource_details of this AssignRolePermissionDetails.
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
