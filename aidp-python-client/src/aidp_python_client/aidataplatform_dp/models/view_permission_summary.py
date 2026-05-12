# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ViewPermissionSummary(object):
    """
    Information about a view permission.
    """

    #: A constant which can be used with the grantee_type property of a ViewPermissionSummary.
    #: This constant has a value of "USER"
    GRANTEE_TYPE_USER = "USER"

    #: A constant which can be used with the grantee_type property of a ViewPermissionSummary.
    #: This constant has a value of "ROLE"
    GRANTEE_TYPE_ROLE = "ROLE"

    #: A constant which can be used with the grantee_type property of a ViewPermissionSummary.
    #: This constant has a value of "GROUP"
    GRANTEE_TYPE_GROUP = "GROUP"

    #: A constant which can be used with the grantee_permissions property of a ViewPermissionSummary.
    #: This constant has a value of "SELECT"
    GRANTEE_PERMISSIONS_SELECT = "SELECT"

    #: A constant which can be used with the grantee_permissions property of a ViewPermissionSummary.
    #: This constant has a value of "MANAGE"
    GRANTEE_PERMISSIONS_MANAGE = "MANAGE"

    #: A constant which can be used with the grantee_permissions property of a ViewPermissionSummary.
    #: This constant has a value of "WRITE"
    GRANTEE_PERMISSIONS_WRITE = "WRITE"

    #: A constant which can be used with the grantee_permissions property of a ViewPermissionSummary.
    #: This constant has a value of "INSERT"
    GRANTEE_PERMISSIONS_INSERT = "INSERT"

    #: A constant which can be used with the grantee_permissions property of a ViewPermissionSummary.
    #: This constant has a value of "UPDATE"
    GRANTEE_PERMISSIONS_UPDATE = "UPDATE"

    #: A constant which can be used with the grantee_permissions property of a ViewPermissionSummary.
    #: This constant has a value of "DELETE"
    GRANTEE_PERMISSIONS_DELETE = "DELETE"

    #: A constant which can be used with the grantee_permissions property of a ViewPermissionSummary.
    #: This constant has a value of "ALTER"
    GRANTEE_PERMISSIONS_ALTER = "ALTER"

    #: A constant which can be used with the grantee_permissions property of a ViewPermissionSummary.
    #: This constant has a value of "ADMIN"
    GRANTEE_PERMISSIONS_ADMIN = "ADMIN"

    def __init__(self, **kwargs):
        """
        Initializes a new ViewPermissionSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param grantee:
            The value to assign to the grantee property of this ViewPermissionSummary.
        :type grantee: str

        :param grantee_name:
            The value to assign to the grantee_name property of this ViewPermissionSummary.
        :type grantee_name: str

        :param grantee_type:
            The value to assign to the grantee_type property of this ViewPermissionSummary.
            Allowed values for this property are: "USER", "ROLE", "GROUP", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type grantee_type: str

        :param grantee_permissions:
            The value to assign to the grantee_permissions property of this ViewPermissionSummary.
            Allowed values for items in this list are: "SELECT", "MANAGE", "WRITE", "INSERT", "UPDATE", "DELETE", "ALTER", "ADMIN", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type grantee_permissions: list[str]

        :param columns:
            The value to assign to the columns property of this ViewPermissionSummary.
        :type columns: list[str]

        :param excluded_columns:
            The value to assign to the excluded_columns property of this ViewPermissionSummary.
        :type excluded_columns: list[str]

        :param is_inherited:
            The value to assign to the is_inherited property of this ViewPermissionSummary.
        :type is_inherited: bool

        :param resource_name:
            The value to assign to the resource_name property of this ViewPermissionSummary.
        :type resource_name: str

        """
        self.swagger_types = {
            'grantee': 'str',
            'grantee_name': 'str',
            'grantee_type': 'str',
            'grantee_permissions': 'list[str]',
            'columns': 'list[str]',
            'excluded_columns': 'list[str]',
            'is_inherited': 'bool',
            'resource_name': 'str'
        }

        self.attribute_map = {
            'grantee': 'grantee',
            'grantee_name': 'granteeName',
            'grantee_type': 'granteeType',
            'grantee_permissions': 'granteePermissions',
            'columns': 'columns',
            'excluded_columns': 'excludedColumns',
            'is_inherited': 'isInherited',
            'resource_name': 'resourceName'
        }

        self._grantee = None
        self._grantee_name = None
        self._grantee_type = None
        self._grantee_permissions = None
        self._columns = None
        self._excluded_columns = None
        self._is_inherited = None
        self._resource_name = None

    @property
    def grantee(self):
        """
        **[Required]** Gets the grantee of this ViewPermissionSummary.
        The OCID of user/group and name in case of role.


        :return: The grantee of this ViewPermissionSummary.
        :rtype: str
        """
        return self._grantee

    @grantee.setter
    def grantee(self, grantee):
        """
        Sets the grantee of this ViewPermissionSummary.
        The OCID of user/group and name in case of role.


        :param grantee: The grantee of this ViewPermissionSummary.
        :type: str
        """
        self._grantee = grantee

    @property
    def grantee_name(self):
        """
        Gets the grantee_name of this ViewPermissionSummary.
        The simplified name of the grantee.


        :return: The grantee_name of this ViewPermissionSummary.
        :rtype: str
        """
        return self._grantee_name

    @grantee_name.setter
    def grantee_name(self, grantee_name):
        """
        Sets the grantee_name of this ViewPermissionSummary.
        The simplified name of the grantee.


        :param grantee_name: The grantee_name of this ViewPermissionSummary.
        :type: str
        """
        self._grantee_name = grantee_name

    @property
    def grantee_type(self):
        """
        **[Required]** Gets the grantee_type of this ViewPermissionSummary.
        The type of grantee.

        Allowed values for this property are: "USER", "ROLE", "GROUP", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The grantee_type of this ViewPermissionSummary.
        :rtype: str
        """
        return self._grantee_type

    @grantee_type.setter
    def grantee_type(self, grantee_type):
        """
        Sets the grantee_type of this ViewPermissionSummary.
        The type of grantee.


        :param grantee_type: The grantee_type of this ViewPermissionSummary.
        :type: str
        """
        allowed_values = ["USER", "ROLE", "GROUP"]
        if not value_allowed_none_or_none_sentinel(grantee_type, allowed_values):
            grantee_type = 'UNKNOWN_ENUM_VALUE'
        self._grantee_type = grantee_type

    @property
    def grantee_permissions(self):
        """
        **[Required]** Gets the grantee_permissions of this ViewPermissionSummary.
        The selected permissions for a view.

        Allowed values for items in this list are: "SELECT", "MANAGE", "WRITE", "INSERT", "UPDATE", "DELETE", "ALTER", "ADMIN", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The grantee_permissions of this ViewPermissionSummary.
        :rtype: list[str]
        """
        return self._grantee_permissions

    @grantee_permissions.setter
    def grantee_permissions(self, grantee_permissions):
        """
        Sets the grantee_permissions of this ViewPermissionSummary.
        The selected permissions for a view.


        :param grantee_permissions: The grantee_permissions of this ViewPermissionSummary.
        :type: list[str]
        """
        allowed_values = ["SELECT", "MANAGE", "WRITE", "INSERT", "UPDATE", "DELETE", "ALTER", "ADMIN"]
        if grantee_permissions:
            grantee_permissions[:] = ['UNKNOWN_ENUM_VALUE' if not value_allowed_none_or_none_sentinel(x, allowed_values) else x for x in grantee_permissions]
        self._grantee_permissions = grantee_permissions

    @property
    def columns(self):
        """
        Gets the columns of this ViewPermissionSummary.
        The list of the columns included for permission assignment.


        :return: The columns of this ViewPermissionSummary.
        :rtype: list[str]
        """
        return self._columns

    @columns.setter
    def columns(self, columns):
        """
        Sets the columns of this ViewPermissionSummary.
        The list of the columns included for permission assignment.


        :param columns: The columns of this ViewPermissionSummary.
        :type: list[str]
        """
        self._columns = columns

    @property
    def excluded_columns(self):
        """
        Gets the excluded_columns of this ViewPermissionSummary.
        The list of the columns excluded from permission assignment.


        :return: The excluded_columns of this ViewPermissionSummary.
        :rtype: list[str]
        """
        return self._excluded_columns

    @excluded_columns.setter
    def excluded_columns(self, excluded_columns):
        """
        Sets the excluded_columns of this ViewPermissionSummary.
        The list of the columns excluded from permission assignment.


        :param excluded_columns: The excluded_columns of this ViewPermissionSummary.
        :type: list[str]
        """
        self._excluded_columns = excluded_columns

    @property
    def is_inherited(self):
        """
        Gets the is_inherited of this ViewPermissionSummary.
        The permission listed is inherited or not from object up in hierarchy.


        :return: The is_inherited of this ViewPermissionSummary.
        :rtype: bool
        """
        return self._is_inherited

    @is_inherited.setter
    def is_inherited(self, is_inherited):
        """
        Sets the is_inherited of this ViewPermissionSummary.
        The permission listed is inherited or not from object up in hierarchy.


        :param is_inherited: The is_inherited of this ViewPermissionSummary.
        :type: bool
        """
        self._is_inherited = is_inherited

    @property
    def resource_name(self):
        """
        Gets the resource_name of this ViewPermissionSummary.
        Name of the object to which this permission belong to. This would be the name of view if permission is not inherited or name of object up in hierarchy if permission is inherited.


        :return: The resource_name of this ViewPermissionSummary.
        :rtype: str
        """
        return self._resource_name

    @resource_name.setter
    def resource_name(self, resource_name):
        """
        Sets the resource_name of this ViewPermissionSummary.
        Name of the object to which this permission belong to. This would be the name of view if permission is not inherited or name of object up in hierarchy if permission is inherited.


        :param resource_name: The resource_name of this ViewPermissionSummary.
        :type: str
        """
        self._resource_name = resource_name

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
