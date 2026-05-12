# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class PermissionWithResourceDetails(object):
    """
    A permission string with resource details.
    """

    #: A constant which can be used with the permissions property of a PermissionWithResourceDetails.
    #: This constant has a value of "USER"
    PERMISSIONS_USER = "USER"

    #: A constant which can be used with the permissions property of a PermissionWithResourceDetails.
    #: This constant has a value of "ADMINISTRATOR"
    PERMISSIONS_ADMINISTRATOR = "ADMINISTRATOR"

    #: A constant which can be used with the permissions property of a PermissionWithResourceDetails.
    #: This constant has a value of "READ"
    PERMISSIONS_READ = "READ"

    #: A constant which can be used with the permissions property of a PermissionWithResourceDetails.
    #: This constant has a value of "USE"
    PERMISSIONS_USE = "USE"

    #: A constant which can be used with the permissions property of a PermissionWithResourceDetails.
    #: This constant has a value of "MANAGE"
    PERMISSIONS_MANAGE = "MANAGE"

    #: A constant which can be used with the permissions property of a PermissionWithResourceDetails.
    #: This constant has a value of "ADMIN"
    PERMISSIONS_ADMIN = "ADMIN"

    #: A constant which can be used with the permissions property of a PermissionWithResourceDetails.
    #: This constant has a value of "CREATE_CATALOG"
    PERMISSIONS_CREATE_CATALOG = "CREATE_CATALOG"

    #: A constant which can be used with the permissions property of a PermissionWithResourceDetails.
    #: This constant has a value of "SELECT"
    PERMISSIONS_SELECT = "SELECT"

    #: A constant which can be used with the permissions property of a PermissionWithResourceDetails.
    #: This constant has a value of "INSERT"
    PERMISSIONS_INSERT = "INSERT"

    #: A constant which can be used with the permissions property of a PermissionWithResourceDetails.
    #: This constant has a value of "UPDATE"
    PERMISSIONS_UPDATE = "UPDATE"

    #: A constant which can be used with the permissions property of a PermissionWithResourceDetails.
    #: This constant has a value of "DELETE"
    PERMISSIONS_DELETE = "DELETE"

    #: A constant which can be used with the permissions property of a PermissionWithResourceDetails.
    #: This constant has a value of "ALTER"
    PERMISSIONS_ALTER = "ALTER"

    #: A constant which can be used with the permissions property of a PermissionWithResourceDetails.
    #: This constant has a value of "CREATE_SCHEMA"
    PERMISSIONS_CREATE_SCHEMA = "CREATE_SCHEMA"

    #: A constant which can be used with the permissions property of a PermissionWithResourceDetails.
    #: This constant has a value of "WRITE"
    PERMISSIONS_WRITE = "WRITE"

    #: A constant which can be used with the permissions property of a PermissionWithResourceDetails.
    #: This constant has a value of "CREATE_VIEW"
    PERMISSIONS_CREATE_VIEW = "CREATE_VIEW"

    #: A constant which can be used with the permissions property of a PermissionWithResourceDetails.
    #: This constant has a value of "CREATE_VOLUME"
    PERMISSIONS_CREATE_VOLUME = "CREATE_VOLUME"

    #: A constant which can be used with the permissions property of a PermissionWithResourceDetails.
    #: This constant has a value of "CREATE_TABLE"
    PERMISSIONS_CREATE_TABLE = "CREATE_TABLE"

    #: A constant which can be used with the permissions property of a PermissionWithResourceDetails.
    #: This constant has a value of "CREATE_KNOWLEDGE_BASE"
    PERMISSIONS_CREATE_KNOWLEDGE_BASE = "CREATE_KNOWLEDGE_BASE"

    #: A constant which can be used with the resource_type property of a PermissionWithResourceDetails.
    #: This constant has a value of "WORKSPACE"
    RESOURCE_TYPE_WORKSPACE = "WORKSPACE"

    #: A constant which can be used with the resource_type property of a PermissionWithResourceDetails.
    #: This constant has a value of "WORKFLOW"
    RESOURCE_TYPE_WORKFLOW = "WORKFLOW"

    #: A constant which can be used with the resource_type property of a PermissionWithResourceDetails.
    #: This constant has a value of "FOLDER"
    RESOURCE_TYPE_FOLDER = "FOLDER"

    #: A constant which can be used with the resource_type property of a PermissionWithResourceDetails.
    #: This constant has a value of "FILE"
    RESOURCE_TYPE_FILE = "FILE"

    #: A constant which can be used with the resource_type property of a PermissionWithResourceDetails.
    #: This constant has a value of "CLUSTER"
    RESOURCE_TYPE_CLUSTER = "CLUSTER"

    #: A constant which can be used with the resource_type property of a PermissionWithResourceDetails.
    #: This constant has a value of "MASTER_CATALOG"
    RESOURCE_TYPE_MASTER_CATALOG = "MASTER_CATALOG"

    #: A constant which can be used with the resource_type property of a PermissionWithResourceDetails.
    #: This constant has a value of "CATALOG"
    RESOURCE_TYPE_CATALOG = "CATALOG"

    #: A constant which can be used with the resource_type property of a PermissionWithResourceDetails.
    #: This constant has a value of "SCHEMA"
    RESOURCE_TYPE_SCHEMA = "SCHEMA"

    #: A constant which can be used with the resource_type property of a PermissionWithResourceDetails.
    #: This constant has a value of "TABLE"
    RESOURCE_TYPE_TABLE = "TABLE"

    #: A constant which can be used with the resource_type property of a PermissionWithResourceDetails.
    #: This constant has a value of "SHARE"
    RESOURCE_TYPE_SHARE = "SHARE"

    #: A constant which can be used with the resource_type property of a PermissionWithResourceDetails.
    #: This constant has a value of "RECIPIENT"
    RESOURCE_TYPE_RECIPIENT = "RECIPIENT"

    #: A constant which can be used with the resource_type property of a PermissionWithResourceDetails.
    #: This constant has a value of "VOLUME"
    RESOURCE_TYPE_VOLUME = "VOLUME"

    #: A constant which can be used with the resource_type property of a PermissionWithResourceDetails.
    #: This constant has a value of "VIEW"
    RESOURCE_TYPE_VIEW = "VIEW"

    #: A constant which can be used with the resource_type property of a PermissionWithResourceDetails.
    #: This constant has a value of "KNOWLEDGE_BASE"
    RESOURCE_TYPE_KNOWLEDGE_BASE = "KNOWLEDGE_BASE"

    def __init__(self, **kwargs):
        """
        Initializes a new PermissionWithResourceDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param permissions:
            The value to assign to the permissions property of this PermissionWithResourceDetails.
            Allowed values for this property are: "USER", "ADMINISTRATOR", "READ", "USE", "MANAGE", "ADMIN", "CREATE_CATALOG", "SELECT", "INSERT", "UPDATE", "DELETE", "ALTER", "CREATE_SCHEMA", "WRITE", "CREATE_VIEW", "CREATE_VOLUME", "CREATE_TABLE", "CREATE_KNOWLEDGE_BASE"
        :type permissions: str

        :param resource_type:
            The value to assign to the resource_type property of this PermissionWithResourceDetails.
            Allowed values for this property are: "WORKSPACE", "WORKFLOW", "FOLDER", "FILE", "CLUSTER", "MASTER_CATALOG", "CATALOG", "SCHEMA", "TABLE", "SHARE", "RECIPIENT", "VOLUME", "VIEW", "KNOWLEDGE_BASE"
        :type resource_type: str

        :param resource_key:
            The value to assign to the resource_key property of this PermissionWithResourceDetails.
        :type resource_key: str

        """
        self.swagger_types = {
            'permissions': 'str',
            'resource_type': 'str',
            'resource_key': 'str'
        }

        self.attribute_map = {
            'permissions': 'permissions',
            'resource_type': 'resourceType',
            'resource_key': 'resourceKey'
        }

        self._permissions = None
        self._resource_type = None
        self._resource_key = None

    @property
    def permissions(self):
        """
        **[Required]** Gets the permissions of this PermissionWithResourceDetails.
        Permission or privilege name.

        Allowed values for this property are: "USER", "ADMINISTRATOR", "READ", "USE", "MANAGE", "ADMIN", "CREATE_CATALOG", "SELECT", "INSERT", "UPDATE", "DELETE", "ALTER", "CREATE_SCHEMA", "WRITE", "CREATE_VIEW", "CREATE_VOLUME", "CREATE_TABLE", "CREATE_KNOWLEDGE_BASE"


        :return: The permissions of this PermissionWithResourceDetails.
        :rtype: str
        """
        return self._permissions

    @permissions.setter
    def permissions(self, permissions):
        """
        Sets the permissions of this PermissionWithResourceDetails.
        Permission or privilege name.


        :param permissions: The permissions of this PermissionWithResourceDetails.
        :type: str
        """
        allowed_values = ["USER", "ADMINISTRATOR", "READ", "USE", "MANAGE", "ADMIN", "CREATE_CATALOG", "SELECT", "INSERT", "UPDATE", "DELETE", "ALTER", "CREATE_SCHEMA", "WRITE", "CREATE_VIEW", "CREATE_VOLUME", "CREATE_TABLE", "CREATE_KNOWLEDGE_BASE"]
        if not value_allowed_none_or_none_sentinel(permissions, allowed_values):
            raise ValueError(
                "Invalid value for `permissions`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._permissions = permissions

    @property
    def resource_type(self):
        """
        **[Required]** Gets the resource_type of this PermissionWithResourceDetails.
        All sub-resources in catalog and workspace.

        Allowed values for this property are: "WORKSPACE", "WORKFLOW", "FOLDER", "FILE", "CLUSTER", "MASTER_CATALOG", "CATALOG", "SCHEMA", "TABLE", "SHARE", "RECIPIENT", "VOLUME", "VIEW", "KNOWLEDGE_BASE"


        :return: The resource_type of this PermissionWithResourceDetails.
        :rtype: str
        """
        return self._resource_type

    @resource_type.setter
    def resource_type(self, resource_type):
        """
        Sets the resource_type of this PermissionWithResourceDetails.
        All sub-resources in catalog and workspace.


        :param resource_type: The resource_type of this PermissionWithResourceDetails.
        :type: str
        """
        allowed_values = ["WORKSPACE", "WORKFLOW", "FOLDER", "FILE", "CLUSTER", "MASTER_CATALOG", "CATALOG", "SCHEMA", "TABLE", "SHARE", "RECIPIENT", "VOLUME", "VIEW", "KNOWLEDGE_BASE"]
        if not value_allowed_none_or_none_sentinel(resource_type, allowed_values):
            raise ValueError(
                "Invalid value for `resource_type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._resource_type = resource_type

    @property
    def resource_key(self):
        """
        **[Required]** Gets the resource_key of this PermissionWithResourceDetails.
        Workspace and its sub-resources key.
        For example - For workspaceKey, clusterKey its a UUID
        Within catalog its a 3 level namespace
           tableKey - <catalogName>.<schemaName>.<tableName>
           schemaKey - <catalogName>.<schemaName>
           catalogKey - <catalogName>


        :return: The resource_key of this PermissionWithResourceDetails.
        :rtype: str
        """
        return self._resource_key

    @resource_key.setter
    def resource_key(self, resource_key):
        """
        Sets the resource_key of this PermissionWithResourceDetails.
        Workspace and its sub-resources key.
        For example - For workspaceKey, clusterKey its a UUID
        Within catalog its a 3 level namespace
           tableKey - <catalogName>.<schemaName>.<tableName>
           schemaKey - <catalogName>.<schemaName>
           catalogKey - <catalogName>


        :param resource_key: The resource_key of this PermissionWithResourceDetails.
        :type: str
        """
        self._resource_key = resource_key

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
