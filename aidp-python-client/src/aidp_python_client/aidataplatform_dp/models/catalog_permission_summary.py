# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CatalogPermissionSummary(object):
    """
    Summary information about a Catalog Permission.
    """

    #: A constant which can be used with the grantee_type property of a CatalogPermissionSummary.
    #: This constant has a value of "USER"
    GRANTEE_TYPE_USER = "USER"

    #: A constant which can be used with the grantee_type property of a CatalogPermissionSummary.
    #: This constant has a value of "ROLE"
    GRANTEE_TYPE_ROLE = "ROLE"

    #: A constant which can be used with the grantee_type property of a CatalogPermissionSummary.
    #: This constant has a value of "GROUP"
    GRANTEE_TYPE_GROUP = "GROUP"

    #: A constant which can be used with the grantee_permissions property of a CatalogPermissionSummary.
    #: This constant has a value of "SELECT"
    GRANTEE_PERMISSIONS_SELECT = "SELECT"

    #: A constant which can be used with the grantee_permissions property of a CatalogPermissionSummary.
    #: This constant has a value of "MANAGE"
    GRANTEE_PERMISSIONS_MANAGE = "MANAGE"

    #: A constant which can be used with the grantee_permissions property of a CatalogPermissionSummary.
    #: This constant has a value of "CREATE_SCHEMA"
    GRANTEE_PERMISSIONS_CREATE_SCHEMA = "CREATE_SCHEMA"

    #: A constant which can be used with the grantee_permissions property of a CatalogPermissionSummary.
    #: This constant has a value of "ADMIN"
    GRANTEE_PERMISSIONS_ADMIN = "ADMIN"

    def __init__(self, **kwargs):
        """
        Initializes a new CatalogPermissionSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param grantee:
            The value to assign to the grantee property of this CatalogPermissionSummary.
        :type grantee: str

        :param grantee_name:
            The value to assign to the grantee_name property of this CatalogPermissionSummary.
        :type grantee_name: str

        :param grantee_type:
            The value to assign to the grantee_type property of this CatalogPermissionSummary.
            Allowed values for this property are: "USER", "ROLE", "GROUP", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type grantee_type: str

        :param grantee_permissions:
            The value to assign to the grantee_permissions property of this CatalogPermissionSummary.
            Allowed values for items in this list are: "SELECT", "MANAGE", "CREATE_SCHEMA", "ADMIN", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type grantee_permissions: list[str]

        """
        self.swagger_types = {
            'grantee': 'str',
            'grantee_name': 'str',
            'grantee_type': 'str',
            'grantee_permissions': 'list[str]'
        }

        self.attribute_map = {
            'grantee': 'grantee',
            'grantee_name': 'granteeName',
            'grantee_type': 'granteeType',
            'grantee_permissions': 'granteePermissions'
        }

        self._grantee = None
        self._grantee_name = None
        self._grantee_type = None
        self._grantee_permissions = None

    @property
    def grantee(self):
        """
        Gets the grantee of this CatalogPermissionSummary.
        The OCID of user/group and name in case of role.


        :return: The grantee of this CatalogPermissionSummary.
        :rtype: str
        """
        return self._grantee

    @grantee.setter
    def grantee(self, grantee):
        """
        Sets the grantee of this CatalogPermissionSummary.
        The OCID of user/group and name in case of role.


        :param grantee: The grantee of this CatalogPermissionSummary.
        :type: str
        """
        self._grantee = grantee

    @property
    def grantee_name(self):
        """
        Gets the grantee_name of this CatalogPermissionSummary.
        The simplified name of the grantee.


        :return: The grantee_name of this CatalogPermissionSummary.
        :rtype: str
        """
        return self._grantee_name

    @grantee_name.setter
    def grantee_name(self, grantee_name):
        """
        Sets the grantee_name of this CatalogPermissionSummary.
        The simplified name of the grantee.


        :param grantee_name: The grantee_name of this CatalogPermissionSummary.
        :type: str
        """
        self._grantee_name = grantee_name

    @property
    def grantee_type(self):
        """
        Gets the grantee_type of this CatalogPermissionSummary.
        The type of grantee.

        Allowed values for this property are: "USER", "ROLE", "GROUP", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The grantee_type of this CatalogPermissionSummary.
        :rtype: str
        """
        return self._grantee_type

    @grantee_type.setter
    def grantee_type(self, grantee_type):
        """
        Sets the grantee_type of this CatalogPermissionSummary.
        The type of grantee.


        :param grantee_type: The grantee_type of this CatalogPermissionSummary.
        :type: str
        """
        allowed_values = ["USER", "ROLE", "GROUP"]
        if not value_allowed_none_or_none_sentinel(grantee_type, allowed_values):
            grantee_type = 'UNKNOWN_ENUM_VALUE'
        self._grantee_type = grantee_type

    @property
    def grantee_permissions(self):
        """
        Gets the grantee_permissions of this CatalogPermissionSummary.
        The selected permissions for a catalog.

        Allowed values for items in this list are: "SELECT", "MANAGE", "CREATE_SCHEMA", "ADMIN", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The grantee_permissions of this CatalogPermissionSummary.
        :rtype: list[str]
        """
        return self._grantee_permissions

    @grantee_permissions.setter
    def grantee_permissions(self, grantee_permissions):
        """
        Sets the grantee_permissions of this CatalogPermissionSummary.
        The selected permissions for a catalog.


        :param grantee_permissions: The grantee_permissions of this CatalogPermissionSummary.
        :type: list[str]
        """
        allowed_values = ["SELECT", "MANAGE", "CREATE_SCHEMA", "ADMIN"]
        if grantee_permissions:
            grantee_permissions[:] = ['UNKNOWN_ENUM_VALUE' if not value_allowed_none_or_none_sentinel(x, allowed_values) else x for x in grantee_permissions]
        self._grantee_permissions = grantee_permissions

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
