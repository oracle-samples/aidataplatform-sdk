# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class RolePermissionSummary(object):
    """
    Summary of role permissions.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new RolePermissionSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param permissions_with_resource_details:
            The value to assign to the permissions_with_resource_details property of this RolePermissionSummary.
        :type permissions_with_resource_details: oci.aidataplatform_dp.models.ListPermissionsWithResourceDetails

        :param role_key:
            The value to assign to the role_key property of this RolePermissionSummary.
        :type role_key: str

        :param role_description:
            The value to assign to the role_description property of this RolePermissionSummary.
        :type role_description: str

        """
        self.swagger_types = {
            'permissions_with_resource_details': 'ListPermissionsWithResourceDetails',
            'role_key': 'str',
            'role_description': 'str'
        }

        self.attribute_map = {
            'permissions_with_resource_details': 'permissionsWithResourceDetails',
            'role_key': 'roleKey',
            'role_description': 'roleDescription'
        }

        self._permissions_with_resource_details = None
        self._role_key = None
        self._role_description = None

    @property
    def permissions_with_resource_details(self):
        """
        **[Required]** Gets the permissions_with_resource_details of this RolePermissionSummary.

        :return: The permissions_with_resource_details of this RolePermissionSummary.
        :rtype: oci.aidataplatform_dp.models.ListPermissionsWithResourceDetails
        """
        return self._permissions_with_resource_details

    @permissions_with_resource_details.setter
    def permissions_with_resource_details(self, permissions_with_resource_details):
        """
        Sets the permissions_with_resource_details of this RolePermissionSummary.

        :param permissions_with_resource_details: The permissions_with_resource_details of this RolePermissionSummary.
        :type: oci.aidataplatform_dp.models.ListPermissionsWithResourceDetails
        """
        self._permissions_with_resource_details = permissions_with_resource_details

    @property
    def role_key(self):
        """
        **[Required]** Gets the role_key of this RolePermissionSummary.
        Role attached to this permission entry.


        :return: The role_key of this RolePermissionSummary.
        :rtype: str
        """
        return self._role_key

    @role_key.setter
    def role_key(self, role_key):
        """
        Sets the role_key of this RolePermissionSummary.
        Role attached to this permission entry.


        :param role_key: The role_key of this RolePermissionSummary.
        :type: str
        """
        self._role_key = role_key

    @property
    def role_description(self):
        """
        Gets the role_description of this RolePermissionSummary.
        The description of the role.


        :return: The role_description of this RolePermissionSummary.
        :rtype: str
        """
        return self._role_description

    @role_description.setter
    def role_description(self, role_description):
        """
        Sets the role_description of this RolePermissionSummary.
        The description of the role.


        :param role_description: The role_description of this RolePermissionSummary.
        :type: str
        """
        self._role_description = role_description

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
