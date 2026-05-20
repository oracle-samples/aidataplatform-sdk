# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class RevokeMasterCatalogPermissionDetails(object):
    """
    The details of the permissions revoked from assignees for a MasterCatalog.
    """

    #: A constant which can be used with the permissions property of a RevokeMasterCatalogPermissionDetails.
    #: This constant has a value of "CREATE_CATALOG"
    PERMISSIONS_CREATE_CATALOG = "CREATE_CATALOG"

    #: A constant which can be used with the permissions property of a RevokeMasterCatalogPermissionDetails.
    #: This constant has a value of "ADMIN"
    PERMISSIONS_ADMIN = "ADMIN"

    #: A constant which can be used with the permissions property of a RevokeMasterCatalogPermissionDetails.
    #: This constant has a value of "CREATE_SHARE"
    PERMISSIONS_CREATE_SHARE = "CREATE_SHARE"

    #: A constant which can be used with the permissions property of a RevokeMasterCatalogPermissionDetails.
    #: This constant has a value of "CREATE_RECIPIENT"
    PERMISSIONS_CREATE_RECIPIENT = "CREATE_RECIPIENT"

    #: A constant which can be used with the permissions property of a RevokeMasterCatalogPermissionDetails.
    #: This constant has a value of "CREATE_CREDENTIAL"
    PERMISSIONS_CREATE_CREDENTIAL = "CREATE_CREDENTIAL"

    def __init__(self, **kwargs):
        """
        Initializes a new RevokeMasterCatalogPermissionDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param assignees:
            The value to assign to the assignees property of this RevokeMasterCatalogPermissionDetails.
        :type assignees: oci.aidataplatform_dp.models.PermissionAssignees

        :param permissions:
            The value to assign to the permissions property of this RevokeMasterCatalogPermissionDetails.
            Allowed values for items in this list are: "CREATE_CATALOG", "ADMIN", "CREATE_SHARE", "CREATE_RECIPIENT", "CREATE_CREDENTIAL"
        :type permissions: list[str]

        """
        self.swagger_types = {
            'assignees': 'PermissionAssignees',
            'permissions': 'list[str]'
        }

        self.attribute_map = {
            'assignees': 'assignees',
            'permissions': 'permissions'
        }

        self._assignees = None
        self._permissions = None

    @property
    def assignees(self):
        """
        **[Required]** Gets the assignees of this RevokeMasterCatalogPermissionDetails.

        :return: The assignees of this RevokeMasterCatalogPermissionDetails.
        :rtype: oci.aidataplatform_dp.models.PermissionAssignees
        """
        return self._assignees

    @assignees.setter
    def assignees(self, assignees):
        """
        Sets the assignees of this RevokeMasterCatalogPermissionDetails.

        :param assignees: The assignees of this RevokeMasterCatalogPermissionDetails.
        :type: oci.aidataplatform_dp.models.PermissionAssignees
        """
        self._assignees = assignees

    @property
    def permissions(self):
        """
        **[Required]** Gets the permissions of this RevokeMasterCatalogPermissionDetails.
        The permissions revoked from the assignees

        Allowed values for items in this list are: "CREATE_CATALOG", "ADMIN", "CREATE_SHARE", "CREATE_RECIPIENT", "CREATE_CREDENTIAL"


        :return: The permissions of this RevokeMasterCatalogPermissionDetails.
        :rtype: list[str]
        """
        return self._permissions

    @permissions.setter
    def permissions(self, permissions):
        """
        Sets the permissions of this RevokeMasterCatalogPermissionDetails.
        The permissions revoked from the assignees


        :param permissions: The permissions of this RevokeMasterCatalogPermissionDetails.
        :type: list[str]
        """
        allowed_values = ["CREATE_CATALOG", "ADMIN", "CREATE_SHARE", "CREATE_RECIPIENT", "CREATE_CREDENTIAL"]
        
        if permissions and permissions is not NONE_SENTINEL:
            for value in permissions:
                if not value_allowed_none_or_none_sentinel(value, allowed_values):
                    raise ValueError(
                        "Invalid value for `permissions`, must be None or one of {0}"
                        .format(allowed_values)
                    )
        self._permissions = permissions

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
