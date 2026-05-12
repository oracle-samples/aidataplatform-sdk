# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class RevokeSchemaPermissionDetails(object):
    """
    The details of the permissions revoked from assignees for a schema.
    """

    #: A constant which can be used with the permissions property of a RevokeSchemaPermissionDetails.
    #: This constant has a value of "SELECT"
    PERMISSIONS_SELECT = "SELECT"

    #: A constant which can be used with the permissions property of a RevokeSchemaPermissionDetails.
    #: This constant has a value of "WRITE"
    PERMISSIONS_WRITE = "WRITE"

    #: A constant which can be used with the permissions property of a RevokeSchemaPermissionDetails.
    #: This constant has a value of "CREATE_VIEW"
    PERMISSIONS_CREATE_VIEW = "CREATE_VIEW"

    #: A constant which can be used with the permissions property of a RevokeSchemaPermissionDetails.
    #: This constant has a value of "CREATE_VOLUME"
    PERMISSIONS_CREATE_VOLUME = "CREATE_VOLUME"

    #: A constant which can be used with the permissions property of a RevokeSchemaPermissionDetails.
    #: This constant has a value of "CREATE_TABLE"
    PERMISSIONS_CREATE_TABLE = "CREATE_TABLE"

    #: A constant which can be used with the permissions property of a RevokeSchemaPermissionDetails.
    #: This constant has a value of "ADMIN"
    PERMISSIONS_ADMIN = "ADMIN"

    #: A constant which can be used with the permissions property of a RevokeSchemaPermissionDetails.
    #: This constant has a value of "CREATE_KNOWLEDGE_BASE"
    PERMISSIONS_CREATE_KNOWLEDGE_BASE = "CREATE_KNOWLEDGE_BASE"

    def __init__(self, **kwargs):
        """
        Initializes a new RevokeSchemaPermissionDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param assignees:
            The value to assign to the assignees property of this RevokeSchemaPermissionDetails.
        :type assignees: oci.aidataplatform_dp.models.PermissionAssignees

        :param permissions:
            The value to assign to the permissions property of this RevokeSchemaPermissionDetails.
            Allowed values for items in this list are: "SELECT", "WRITE", "CREATE_VIEW", "CREATE_VOLUME", "CREATE_TABLE", "ADMIN", "CREATE_KNOWLEDGE_BASE"
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
        **[Required]** Gets the assignees of this RevokeSchemaPermissionDetails.

        :return: The assignees of this RevokeSchemaPermissionDetails.
        :rtype: oci.aidataplatform_dp.models.PermissionAssignees
        """
        return self._assignees

    @assignees.setter
    def assignees(self, assignees):
        """
        Sets the assignees of this RevokeSchemaPermissionDetails.

        :param assignees: The assignees of this RevokeSchemaPermissionDetails.
        :type: oci.aidataplatform_dp.models.PermissionAssignees
        """
        self._assignees = assignees

    @property
    def permissions(self):
        """
        **[Required]** Gets the permissions of this RevokeSchemaPermissionDetails.
        The permissions revoked from the assignees.

        Allowed values for items in this list are: "SELECT", "WRITE", "CREATE_VIEW", "CREATE_VOLUME", "CREATE_TABLE", "ADMIN", "CREATE_KNOWLEDGE_BASE"


        :return: The permissions of this RevokeSchemaPermissionDetails.
        :rtype: list[str]
        """
        return self._permissions

    @permissions.setter
    def permissions(self, permissions):
        """
        Sets the permissions of this RevokeSchemaPermissionDetails.
        The permissions revoked from the assignees.


        :param permissions: The permissions of this RevokeSchemaPermissionDetails.
        :type: list[str]
        """
        allowed_values = ["SELECT", "WRITE", "CREATE_VIEW", "CREATE_VOLUME", "CREATE_TABLE", "ADMIN", "CREATE_KNOWLEDGE_BASE"]
        
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
