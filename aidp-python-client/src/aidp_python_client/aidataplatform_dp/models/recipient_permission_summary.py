# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class RecipientPermissionSummary(object):
    """
    Information about a recipient permission.
    """

    #: A constant which can be used with the grantee_type property of a RecipientPermissionSummary.
    #: This constant has a value of "USER"
    GRANTEE_TYPE_USER = "USER"

    #: A constant which can be used with the grantee_type property of a RecipientPermissionSummary.
    #: This constant has a value of "ROLE"
    GRANTEE_TYPE_ROLE = "ROLE"

    #: A constant which can be used with the grantee_type property of a RecipientPermissionSummary.
    #: This constant has a value of "GROUP"
    GRANTEE_TYPE_GROUP = "GROUP"

    #: A constant which can be used with the grantee_permissions property of a RecipientPermissionSummary.
    #: This constant has a value of "ADMIN"
    GRANTEE_PERMISSIONS_ADMIN = "ADMIN"

    #: A constant which can be used with the grantee_permissions property of a RecipientPermissionSummary.
    #: This constant has a value of "USE"
    GRANTEE_PERMISSIONS_USE = "USE"

    #: A constant which can be used with the grantee_permissions property of a RecipientPermissionSummary.
    #: This constant has a value of "READ"
    GRANTEE_PERMISSIONS_READ = "READ"

    def __init__(self, **kwargs):
        """
        Initializes a new RecipientPermissionSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param grantee:
            The value to assign to the grantee property of this RecipientPermissionSummary.
        :type grantee: str

        :param grantee_name:
            The value to assign to the grantee_name property of this RecipientPermissionSummary.
        :type grantee_name: str

        :param grantee_type:
            The value to assign to the grantee_type property of this RecipientPermissionSummary.
            Allowed values for this property are: "USER", "ROLE", "GROUP", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type grantee_type: str

        :param grantee_permissions:
            The value to assign to the grantee_permissions property of this RecipientPermissionSummary.
            Allowed values for items in this list are: "ADMIN", "USE", "READ", 'UNKNOWN_ENUM_VALUE'.
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
        **[Required]** Gets the grantee of this RecipientPermissionSummary.
        The OCID of user/group and name in case of role.


        :return: The grantee of this RecipientPermissionSummary.
        :rtype: str
        """
        return self._grantee

    @grantee.setter
    def grantee(self, grantee):
        """
        Sets the grantee of this RecipientPermissionSummary.
        The OCID of user/group and name in case of role.


        :param grantee: The grantee of this RecipientPermissionSummary.
        :type: str
        """
        self._grantee = grantee

    @property
    def grantee_name(self):
        """
        Gets the grantee_name of this RecipientPermissionSummary.
        The simplified name of the grantee.


        :return: The grantee_name of this RecipientPermissionSummary.
        :rtype: str
        """
        return self._grantee_name

    @grantee_name.setter
    def grantee_name(self, grantee_name):
        """
        Sets the grantee_name of this RecipientPermissionSummary.
        The simplified name of the grantee.


        :param grantee_name: The grantee_name of this RecipientPermissionSummary.
        :type: str
        """
        self._grantee_name = grantee_name

    @property
    def grantee_type(self):
        """
        **[Required]** Gets the grantee_type of this RecipientPermissionSummary.
        The type of grantee.

        Allowed values for this property are: "USER", "ROLE", "GROUP", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The grantee_type of this RecipientPermissionSummary.
        :rtype: str
        """
        return self._grantee_type

    @grantee_type.setter
    def grantee_type(self, grantee_type):
        """
        Sets the grantee_type of this RecipientPermissionSummary.
        The type of grantee.


        :param grantee_type: The grantee_type of this RecipientPermissionSummary.
        :type: str
        """
        allowed_values = ["USER", "ROLE", "GROUP"]
        if not value_allowed_none_or_none_sentinel(grantee_type, allowed_values):
            grantee_type = 'UNKNOWN_ENUM_VALUE'
        self._grantee_type = grantee_type

    @property
    def grantee_permissions(self):
        """
        **[Required]** Gets the grantee_permissions of this RecipientPermissionSummary.
        The selected permissions for a recipient.

        Allowed values for items in this list are: "ADMIN", "USE", "READ", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The grantee_permissions of this RecipientPermissionSummary.
        :rtype: list[str]
        """
        return self._grantee_permissions

    @grantee_permissions.setter
    def grantee_permissions(self, grantee_permissions):
        """
        Sets the grantee_permissions of this RecipientPermissionSummary.
        The selected permissions for a recipient.


        :param grantee_permissions: The grantee_permissions of this RecipientPermissionSummary.
        :type: list[str]
        """
        allowed_values = ["ADMIN", "USE", "READ"]
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
