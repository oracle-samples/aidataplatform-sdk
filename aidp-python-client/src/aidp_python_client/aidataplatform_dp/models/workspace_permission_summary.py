# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class WorkspacePermissionSummary(object):
    """
    Information about a workspace permission.
    """

    #: A constant which can be used with the grantee_type property of a WorkspacePermissionSummary.
    #: This constant has a value of "USER"
    GRANTEE_TYPE_USER = "USER"

    #: A constant which can be used with the grantee_type property of a WorkspacePermissionSummary.
    #: This constant has a value of "ROLE"
    GRANTEE_TYPE_ROLE = "ROLE"

    #: A constant which can be used with the grantee_type property of a WorkspacePermissionSummary.
    #: This constant has a value of "GROUP"
    GRANTEE_TYPE_GROUP = "GROUP"

    #: A constant which can be used with the grantee_permissions property of a WorkspacePermissionSummary.
    #: This constant has a value of "USER"
    GRANTEE_PERMISSIONS_USER = "USER"

    #: A constant which can be used with the grantee_permissions property of a WorkspacePermissionSummary.
    #: This constant has a value of "PRIVILEGED_USER"
    GRANTEE_PERMISSIONS_PRIVILEGED_USER = "PRIVILEGED_USER"

    #: A constant which can be used with the grantee_permissions property of a WorkspacePermissionSummary.
    #: This constant has a value of "ADMINISTRATOR"
    GRANTEE_PERMISSIONS_ADMINISTRATOR = "ADMINISTRATOR"

    def __init__(self, **kwargs):
        """
        Initializes a new WorkspacePermissionSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param grantee:
            The value to assign to the grantee property of this WorkspacePermissionSummary.
        :type grantee: str

        :param grantee_name:
            The value to assign to the grantee_name property of this WorkspacePermissionSummary.
        :type grantee_name: str

        :param grantee_type:
            The value to assign to the grantee_type property of this WorkspacePermissionSummary.
            Allowed values for this property are: "USER", "ROLE", "GROUP", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type grantee_type: str

        :param grantee_permissions:
            The value to assign to the grantee_permissions property of this WorkspacePermissionSummary.
            Allowed values for items in this list are: "USER", "PRIVILEGED_USER", "ADMINISTRATOR", 'UNKNOWN_ENUM_VALUE'.
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
        **[Required]** Gets the grantee of this WorkspacePermissionSummary.
        The OCID of user/group and name in case of role.


        :return: The grantee of this WorkspacePermissionSummary.
        :rtype: str
        """
        return self._grantee

    @grantee.setter
    def grantee(self, grantee):
        """
        Sets the grantee of this WorkspacePermissionSummary.
        The OCID of user/group and name in case of role.


        :param grantee: The grantee of this WorkspacePermissionSummary.
        :type: str
        """
        self._grantee = grantee

    @property
    def grantee_name(self):
        """
        Gets the grantee_name of this WorkspacePermissionSummary.
        The simplified name of the grantee.


        :return: The grantee_name of this WorkspacePermissionSummary.
        :rtype: str
        """
        return self._grantee_name

    @grantee_name.setter
    def grantee_name(self, grantee_name):
        """
        Sets the grantee_name of this WorkspacePermissionSummary.
        The simplified name of the grantee.


        :param grantee_name: The grantee_name of this WorkspacePermissionSummary.
        :type: str
        """
        self._grantee_name = grantee_name

    @property
    def grantee_type(self):
        """
        **[Required]** Gets the grantee_type of this WorkspacePermissionSummary.
        The type of grantee.

        Allowed values for this property are: "USER", "ROLE", "GROUP", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The grantee_type of this WorkspacePermissionSummary.
        :rtype: str
        """
        return self._grantee_type

    @grantee_type.setter
    def grantee_type(self, grantee_type):
        """
        Sets the grantee_type of this WorkspacePermissionSummary.
        The type of grantee.


        :param grantee_type: The grantee_type of this WorkspacePermissionSummary.
        :type: str
        """
        allowed_values = ["USER", "ROLE", "GROUP"]
        if not value_allowed_none_or_none_sentinel(grantee_type, allowed_values):
            grantee_type = 'UNKNOWN_ENUM_VALUE'
        self._grantee_type = grantee_type

    @property
    def grantee_permissions(self):
        """
        **[Required]** Gets the grantee_permissions of this WorkspacePermissionSummary.
        The selected permissions for a workspace.

        Allowed values for items in this list are: "USER", "PRIVILEGED_USER", "ADMINISTRATOR", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The grantee_permissions of this WorkspacePermissionSummary.
        :rtype: list[str]
        """
        return self._grantee_permissions

    @grantee_permissions.setter
    def grantee_permissions(self, grantee_permissions):
        """
        Sets the grantee_permissions of this WorkspacePermissionSummary.
        The selected permissions for a workspace.


        :param grantee_permissions: The grantee_permissions of this WorkspacePermissionSummary.
        :type: list[str]
        """
        allowed_values = ["USER", "PRIVILEGED_USER", "ADMINISTRATOR"]
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
