# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class MasterCatalogPermissionSummary(object):
    """
    Summary information about a Master Catalog Permission.
    """

    #: A constant which can be used with the grantee_type property of a MasterCatalogPermissionSummary.
    #: This constant has a value of "USER"
    GRANTEE_TYPE_USER = "USER"

    #: A constant which can be used with the grantee_type property of a MasterCatalogPermissionSummary.
    #: This constant has a value of "ROLE"
    GRANTEE_TYPE_ROLE = "ROLE"

    #: A constant which can be used with the grantee_type property of a MasterCatalogPermissionSummary.
    #: This constant has a value of "GROUP"
    GRANTEE_TYPE_GROUP = "GROUP"

    #: A constant which can be used with the grantee_permissions property of a MasterCatalogPermissionSummary.
    #: This constant has a value of "CREATE_CATALOG"
    GRANTEE_PERMISSIONS_CREATE_CATALOG = "CREATE_CATALOG"

    #: A constant which can be used with the grantee_permissions property of a MasterCatalogPermissionSummary.
    #: This constant has a value of "ADMIN"
    GRANTEE_PERMISSIONS_ADMIN = "ADMIN"

    #: A constant which can be used with the grantee_permissions property of a MasterCatalogPermissionSummary.
    #: This constant has a value of "CREATE_SHARE"
    GRANTEE_PERMISSIONS_CREATE_SHARE = "CREATE_SHARE"

    #: A constant which can be used with the grantee_permissions property of a MasterCatalogPermissionSummary.
    #: This constant has a value of "CREATE_RECIPIENT"
    GRANTEE_PERMISSIONS_CREATE_RECIPIENT = "CREATE_RECIPIENT"

    #: A constant which can be used with the grantee_permissions property of a MasterCatalogPermissionSummary.
    #: This constant has a value of "CREATE_CREDENTIAL"
    GRANTEE_PERMISSIONS_CREATE_CREDENTIAL = "CREATE_CREDENTIAL"

    def __init__(self, **kwargs):
        """
        Initializes a new MasterCatalogPermissionSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param grantee:
            The value to assign to the grantee property of this MasterCatalogPermissionSummary.
        :type grantee: str

        :param grantee_name:
            The value to assign to the grantee_name property of this MasterCatalogPermissionSummary.
        :type grantee_name: str

        :param grantee_type:
            The value to assign to the grantee_type property of this MasterCatalogPermissionSummary.
            Allowed values for this property are: "USER", "ROLE", "GROUP"
        :type grantee_type: str

        :param grantee_permissions:
            The value to assign to the grantee_permissions property of this MasterCatalogPermissionSummary.
            Allowed values for items in this list are: "CREATE_CATALOG", "ADMIN", "CREATE_SHARE", "CREATE_RECIPIENT", "CREATE_CREDENTIAL"
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
        Gets the grantee of this MasterCatalogPermissionSummary.
        The ocid of user/group and name in case of role.


        :return: The grantee of this MasterCatalogPermissionSummary.
        :rtype: str
        """
        return self._grantee

    @grantee.setter
    def grantee(self, grantee):
        """
        Sets the grantee of this MasterCatalogPermissionSummary.
        The ocid of user/group and name in case of role.


        :param grantee: The grantee of this MasterCatalogPermissionSummary.
        :type: str
        """
        self._grantee = grantee

    @property
    def grantee_name(self):
        """
        Gets the grantee_name of this MasterCatalogPermissionSummary.
        The simplified name of the grantee.


        :return: The grantee_name of this MasterCatalogPermissionSummary.
        :rtype: str
        """
        return self._grantee_name

    @grantee_name.setter
    def grantee_name(self, grantee_name):
        """
        Sets the grantee_name of this MasterCatalogPermissionSummary.
        The simplified name of the grantee.


        :param grantee_name: The grantee_name of this MasterCatalogPermissionSummary.
        :type: str
        """
        self._grantee_name = grantee_name

    @property
    def grantee_type(self):
        """
        Gets the grantee_type of this MasterCatalogPermissionSummary.
        The type of grantee.

        Allowed values for this property are: "USER", "ROLE", "GROUP"


        :return: The grantee_type of this MasterCatalogPermissionSummary.
        :rtype: str
        """
        return self._grantee_type

    @grantee_type.setter
    def grantee_type(self, grantee_type):
        """
        Sets the grantee_type of this MasterCatalogPermissionSummary.
        The type of grantee.


        :param grantee_type: The grantee_type of this MasterCatalogPermissionSummary.
        :type: str
        """
        allowed_values = ["USER", "ROLE", "GROUP"]
        if not value_allowed_none_or_none_sentinel(grantee_type, allowed_values):
            raise ValueError(
                "Invalid value for `grantee_type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._grantee_type = grantee_type

    @property
    def grantee_permissions(self):
        """
        Gets the grantee_permissions of this MasterCatalogPermissionSummary.
        The selected permissions for a Master Catalog.

        Allowed values for items in this list are: "CREATE_CATALOG", "ADMIN", "CREATE_SHARE", "CREATE_RECIPIENT", "CREATE_CREDENTIAL"


        :return: The grantee_permissions of this MasterCatalogPermissionSummary.
        :rtype: list[str]
        """
        return self._grantee_permissions

    @grantee_permissions.setter
    def grantee_permissions(self, grantee_permissions):
        """
        Sets the grantee_permissions of this MasterCatalogPermissionSummary.
        The selected permissions for a Master Catalog.


        :param grantee_permissions: The grantee_permissions of this MasterCatalogPermissionSummary.
        :type: list[str]
        """
        allowed_values = ["CREATE_CATALOG", "ADMIN", "CREATE_SHARE", "CREATE_RECIPIENT", "CREATE_CREDENTIAL"]
        
        if grantee_permissions and grantee_permissions is not NONE_SENTINEL:
            for value in grantee_permissions:
                if not value_allowed_none_or_none_sentinel(value, allowed_values):
                    raise ValueError(
                        "Invalid value for `grantee_permissions`, must be None or one of {0}"
                        .format(allowed_values)
                    )
        self._grantee_permissions = grantee_permissions

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
