# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class WorkspaceObjectPermissionSummary(object):
    """
    Information about a workspace object permission.
    """

    #: A constant which can be used with the grantee_type property of a WorkspaceObjectPermissionSummary.
    #: This constant has a value of "USER"
    GRANTEE_TYPE_USER = "USER"

    #: A constant which can be used with the grantee_type property of a WorkspaceObjectPermissionSummary.
    #: This constant has a value of "ROLE"
    GRANTEE_TYPE_ROLE = "ROLE"

    #: A constant which can be used with the grantee_type property of a WorkspaceObjectPermissionSummary.
    #: This constant has a value of "GROUP"
    GRANTEE_TYPE_GROUP = "GROUP"

    #: A constant which can be used with the grantee_permissions property of a WorkspaceObjectPermissionSummary.
    #: This constant has a value of "READ"
    GRANTEE_PERMISSIONS_READ = "READ"

    #: A constant which can be used with the grantee_permissions property of a WorkspaceObjectPermissionSummary.
    #: This constant has a value of "USE"
    GRANTEE_PERMISSIONS_USE = "USE"

    #: A constant which can be used with the grantee_permissions property of a WorkspaceObjectPermissionSummary.
    #: This constant has a value of "MANAGE"
    GRANTEE_PERMISSIONS_MANAGE = "MANAGE"

    #: A constant which can be used with the grantee_permissions property of a WorkspaceObjectPermissionSummary.
    #: This constant has a value of "ADMIN"
    GRANTEE_PERMISSIONS_ADMIN = "ADMIN"

    def __init__(self, **kwargs):
        """
        Initializes a new WorkspaceObjectPermissionSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param grantee:
            The value to assign to the grantee property of this WorkspaceObjectPermissionSummary.
        :type grantee: str

        :param grantee_name:
            The value to assign to the grantee_name property of this WorkspaceObjectPermissionSummary.
        :type grantee_name: str

        :param grantee_type:
            The value to assign to the grantee_type property of this WorkspaceObjectPermissionSummary.
            Allowed values for this property are: "USER", "ROLE", "GROUP", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type grantee_type: str

        :param grantee_permissions:
            The value to assign to the grantee_permissions property of this WorkspaceObjectPermissionSummary.
            Allowed values for items in this list are: "READ", "USE", "MANAGE", "ADMIN", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type grantee_permissions: list[str]

        :param is_permissions_inheritable:
            The value to assign to the is_permissions_inheritable property of this WorkspaceObjectPermissionSummary.
        :type is_permissions_inheritable: bool

        """
        self.swagger_types = {
            'grantee': 'str',
            'grantee_name': 'str',
            'grantee_type': 'str',
            'grantee_permissions': 'list[str]',
            'is_permissions_inheritable': 'bool'
        }

        self.attribute_map = {
            'grantee': 'grantee',
            'grantee_name': 'granteeName',
            'grantee_type': 'granteeType',
            'grantee_permissions': 'granteePermissions',
            'is_permissions_inheritable': 'isPermissionsInheritable'
        }

        self._grantee = None
        self._grantee_name = None
        self._grantee_type = None
        self._grantee_permissions = None
        self._is_permissions_inheritable = None

    @property
    def grantee(self):
        """
        **[Required]** Gets the grantee of this WorkspaceObjectPermissionSummary.
        The OCID of user/group and name in case of role.


        :return: The grantee of this WorkspaceObjectPermissionSummary.
        :rtype: str
        """
        return self._grantee

    @grantee.setter
    def grantee(self, grantee):
        """
        Sets the grantee of this WorkspaceObjectPermissionSummary.
        The OCID of user/group and name in case of role.


        :param grantee: The grantee of this WorkspaceObjectPermissionSummary.
        :type: str
        """
        self._grantee = grantee

    @property
    def grantee_name(self):
        """
        Gets the grantee_name of this WorkspaceObjectPermissionSummary.
        The simplified name of the grantee.


        :return: The grantee_name of this WorkspaceObjectPermissionSummary.
        :rtype: str
        """
        return self._grantee_name

    @grantee_name.setter
    def grantee_name(self, grantee_name):
        """
        Sets the grantee_name of this WorkspaceObjectPermissionSummary.
        The simplified name of the grantee.


        :param grantee_name: The grantee_name of this WorkspaceObjectPermissionSummary.
        :type: str
        """
        self._grantee_name = grantee_name

    @property
    def grantee_type(self):
        """
        **[Required]** Gets the grantee_type of this WorkspaceObjectPermissionSummary.
        The type of grantee.

        Allowed values for this property are: "USER", "ROLE", "GROUP", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The grantee_type of this WorkspaceObjectPermissionSummary.
        :rtype: str
        """
        return self._grantee_type

    @grantee_type.setter
    def grantee_type(self, grantee_type):
        """
        Sets the grantee_type of this WorkspaceObjectPermissionSummary.
        The type of grantee.


        :param grantee_type: The grantee_type of this WorkspaceObjectPermissionSummary.
        :type: str
        """
        allowed_values = ["USER", "ROLE", "GROUP"]
        if not value_allowed_none_or_none_sentinel(grantee_type, allowed_values):
            grantee_type = 'UNKNOWN_ENUM_VALUE'
        self._grantee_type = grantee_type

    @property
    def grantee_permissions(self):
        """
        **[Required]** Gets the grantee_permissions of this WorkspaceObjectPermissionSummary.
        The selected permissions for a workspace object.

        Allowed values for items in this list are: "READ", "USE", "MANAGE", "ADMIN", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The grantee_permissions of this WorkspaceObjectPermissionSummary.
        :rtype: list[str]
        """
        return self._grantee_permissions

    @grantee_permissions.setter
    def grantee_permissions(self, grantee_permissions):
        """
        Sets the grantee_permissions of this WorkspaceObjectPermissionSummary.
        The selected permissions for a workspace object.


        :param grantee_permissions: The grantee_permissions of this WorkspaceObjectPermissionSummary.
        :type: list[str]
        """
        allowed_values = ["READ", "USE", "MANAGE", "ADMIN"]
        if grantee_permissions:
            grantee_permissions[:] = ['UNKNOWN_ENUM_VALUE' if not value_allowed_none_or_none_sentinel(x, allowed_values) else x for x in grantee_permissions]
        self._grantee_permissions = grantee_permissions

    @property
    def is_permissions_inheritable(self):
        """
        Gets the is_permissions_inheritable of this WorkspaceObjectPermissionSummary.
        Property to determine if permission is inheritable or not. This is applicable only on workspace folders not on files.


        :return: The is_permissions_inheritable of this WorkspaceObjectPermissionSummary.
        :rtype: bool
        """
        return self._is_permissions_inheritable

    @is_permissions_inheritable.setter
    def is_permissions_inheritable(self, is_permissions_inheritable):
        """
        Sets the is_permissions_inheritable of this WorkspaceObjectPermissionSummary.
        Property to determine if permission is inheritable or not. This is applicable only on workspace folders not on files.


        :param is_permissions_inheritable: The is_permissions_inheritable of this WorkspaceObjectPermissionSummary.
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
