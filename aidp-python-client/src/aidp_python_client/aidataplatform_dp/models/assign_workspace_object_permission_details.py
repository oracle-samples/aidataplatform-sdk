# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AssignWorkspaceObjectPermissionDetails(object):
    """
    The details of the permissions assigned on the workspace object to assignee.
    """

    #: A constant which can be used with the permissions property of a AssignWorkspaceObjectPermissionDetails.
    #: This constant has a value of "READ"
    PERMISSIONS_READ = "READ"

    #: A constant which can be used with the permissions property of a AssignWorkspaceObjectPermissionDetails.
    #: This constant has a value of "USE"
    PERMISSIONS_USE = "USE"

    #: A constant which can be used with the permissions property of a AssignWorkspaceObjectPermissionDetails.
    #: This constant has a value of "MANAGE"
    PERMISSIONS_MANAGE = "MANAGE"

    #: A constant which can be used with the permissions property of a AssignWorkspaceObjectPermissionDetails.
    #: This constant has a value of "ADMIN"
    PERMISSIONS_ADMIN = "ADMIN"

    def __init__(self, **kwargs):
        """
        Initializes a new AssignWorkspaceObjectPermissionDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param assignees:
            The value to assign to the assignees property of this AssignWorkspaceObjectPermissionDetails.
        :type assignees: oci.aidataplatform_dp.models.PermissionAssignees

        :param permissions:
            The value to assign to the permissions property of this AssignWorkspaceObjectPermissionDetails.
            Allowed values for items in this list are: "READ", "USE", "MANAGE", "ADMIN"
        :type permissions: list[str]

        :param is_permissions_inheritable:
            The value to assign to the is_permissions_inheritable property of this AssignWorkspaceObjectPermissionDetails.
        :type is_permissions_inheritable: bool

        """
        self.swagger_types = {
            'assignees': 'PermissionAssignees',
            'permissions': 'list[str]',
            'is_permissions_inheritable': 'bool'
        }

        self.attribute_map = {
            'assignees': 'assignees',
            'permissions': 'permissions',
            'is_permissions_inheritable': 'isPermissionsInheritable'
        }

        self._assignees = None
        self._permissions = None
        self._is_permissions_inheritable = None

    @property
    def assignees(self):
        """
        **[Required]** Gets the assignees of this AssignWorkspaceObjectPermissionDetails.

        :return: The assignees of this AssignWorkspaceObjectPermissionDetails.
        :rtype: oci.aidataplatform_dp.models.PermissionAssignees
        """
        return self._assignees

    @assignees.setter
    def assignees(self, assignees):
        """
        Sets the assignees of this AssignWorkspaceObjectPermissionDetails.

        :param assignees: The assignees of this AssignWorkspaceObjectPermissionDetails.
        :type: oci.aidataplatform_dp.models.PermissionAssignees
        """
        self._assignees = assignees

    @property
    def permissions(self):
        """
        **[Required]** Gets the permissions of this AssignWorkspaceObjectPermissionDetails.
        The permissions assigned to the assignees.

        Allowed values for items in this list are: "READ", "USE", "MANAGE", "ADMIN"


        :return: The permissions of this AssignWorkspaceObjectPermissionDetails.
        :rtype: list[str]
        """
        return self._permissions

    @permissions.setter
    def permissions(self, permissions):
        """
        Sets the permissions of this AssignWorkspaceObjectPermissionDetails.
        The permissions assigned to the assignees.


        :param permissions: The permissions of this AssignWorkspaceObjectPermissionDetails.
        :type: list[str]
        """
        allowed_values = ["READ", "USE", "MANAGE", "ADMIN"]
        
        if permissions and permissions is not NONE_SENTINEL:
            for value in permissions:
                if not value_allowed_none_or_none_sentinel(value, allowed_values):
                    raise ValueError(
                        "Invalid value for `permissions`, must be None or one of {0}"
                        .format(allowed_values)
                    )
        self._permissions = permissions

    @property
    def is_permissions_inheritable(self):
        """
        Gets the is_permissions_inheritable of this AssignWorkspaceObjectPermissionDetails.
        Property to determine if permission should be inheritable or not, its default value is true. This is applicable only on workspace folders not on files.


        :return: The is_permissions_inheritable of this AssignWorkspaceObjectPermissionDetails.
        :rtype: bool
        """
        return self._is_permissions_inheritable

    @is_permissions_inheritable.setter
    def is_permissions_inheritable(self, is_permissions_inheritable):
        """
        Sets the is_permissions_inheritable of this AssignWorkspaceObjectPermissionDetails.
        Property to determine if permission should be inheritable or not, its default value is true. This is applicable only on workspace folders not on files.


        :param is_permissions_inheritable: The is_permissions_inheritable of this AssignWorkspaceObjectPermissionDetails.
        :type: bool
        """
        self._is_permissions_inheritable = is_permissions_inheritable

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
