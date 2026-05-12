# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ListPermissionsWithResourceDetails(object):
    """
    List of permissions/privileges with resource details.
    """

    #: A constant which can be used with the resource_type property of a ListPermissionsWithResourceDetails.
    #: This constant has a value of "WORKSPACE"
    RESOURCE_TYPE_WORKSPACE = "WORKSPACE"

    #: A constant which can be used with the resource_type property of a ListPermissionsWithResourceDetails.
    #: This constant has a value of "WORKFLOW"
    RESOURCE_TYPE_WORKFLOW = "WORKFLOW"

    #: A constant which can be used with the resource_type property of a ListPermissionsWithResourceDetails.
    #: This constant has a value of "FOLDER"
    RESOURCE_TYPE_FOLDER = "FOLDER"

    #: A constant which can be used with the resource_type property of a ListPermissionsWithResourceDetails.
    #: This constant has a value of "FILE"
    RESOURCE_TYPE_FILE = "FILE"

    #: A constant which can be used with the resource_type property of a ListPermissionsWithResourceDetails.
    #: This constant has a value of "CLUSTER"
    RESOURCE_TYPE_CLUSTER = "CLUSTER"

    #: A constant which can be used with the resource_type property of a ListPermissionsWithResourceDetails.
    #: This constant has a value of "MASTER_CATALOG"
    RESOURCE_TYPE_MASTER_CATALOG = "MASTER_CATALOG"

    #: A constant which can be used with the resource_type property of a ListPermissionsWithResourceDetails.
    #: This constant has a value of "CATALOG"
    RESOURCE_TYPE_CATALOG = "CATALOG"

    #: A constant which can be used with the resource_type property of a ListPermissionsWithResourceDetails.
    #: This constant has a value of "SCHEMA"
    RESOURCE_TYPE_SCHEMA = "SCHEMA"

    #: A constant which can be used with the resource_type property of a ListPermissionsWithResourceDetails.
    #: This constant has a value of "TABLE"
    RESOURCE_TYPE_TABLE = "TABLE"

    #: A constant which can be used with the resource_type property of a ListPermissionsWithResourceDetails.
    #: This constant has a value of "SHARE"
    RESOURCE_TYPE_SHARE = "SHARE"

    #: A constant which can be used with the resource_type property of a ListPermissionsWithResourceDetails.
    #: This constant has a value of "RECIPIENT"
    RESOURCE_TYPE_RECIPIENT = "RECIPIENT"

    #: A constant which can be used with the resource_type property of a ListPermissionsWithResourceDetails.
    #: This constant has a value of "VOLUME"
    RESOURCE_TYPE_VOLUME = "VOLUME"

    #: A constant which can be used with the resource_type property of a ListPermissionsWithResourceDetails.
    #: This constant has a value of "VIEW"
    RESOURCE_TYPE_VIEW = "VIEW"

    #: A constant which can be used with the resource_type property of a ListPermissionsWithResourceDetails.
    #: This constant has a value of "KNOWLEDGE_BASE"
    RESOURCE_TYPE_KNOWLEDGE_BASE = "KNOWLEDGE_BASE"

    def __init__(self, **kwargs):
        """
        Initializes a new ListPermissionsWithResourceDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param permissions:
            The value to assign to the permissions property of this ListPermissionsWithResourceDetails.
        :type permissions: list[oci.aidataplatform_dp.models.AllPrivilegeType]

        :param resource_type:
            The value to assign to the resource_type property of this ListPermissionsWithResourceDetails.
            Allowed values for this property are: "WORKSPACE", "WORKFLOW", "FOLDER", "FILE", "CLUSTER", "MASTER_CATALOG", "CATALOG", "SCHEMA", "TABLE", "SHARE", "RECIPIENT", "VOLUME", "VIEW", "KNOWLEDGE_BASE", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type resource_type: str

        :param resource_key:
            The value to assign to the resource_key property of this ListPermissionsWithResourceDetails.
        :type resource_key: str

        """
        self.swagger_types = {
            'permissions': 'list[AllPrivilegeType]',
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
        **[Required]** Gets the permissions of this ListPermissionsWithResourceDetails.
        List of privilege names.


        :return: The permissions of this ListPermissionsWithResourceDetails.
        :rtype: list[oci.aidataplatform_dp.models.AllPrivilegeType]
        """
        return self._permissions

    @permissions.setter
    def permissions(self, permissions):
        """
        Sets the permissions of this ListPermissionsWithResourceDetails.
        List of privilege names.


        :param permissions: The permissions of this ListPermissionsWithResourceDetails.
        :type: list[oci.aidataplatform_dp.models.AllPrivilegeType]
        """
        self._permissions = permissions

    @property
    def resource_type(self):
        """
        **[Required]** Gets the resource_type of this ListPermissionsWithResourceDetails.
        All sub-resources in catalog and workspace.

        Allowed values for this property are: "WORKSPACE", "WORKFLOW", "FOLDER", "FILE", "CLUSTER", "MASTER_CATALOG", "CATALOG", "SCHEMA", "TABLE", "SHARE", "RECIPIENT", "VOLUME", "VIEW", "KNOWLEDGE_BASE", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The resource_type of this ListPermissionsWithResourceDetails.
        :rtype: str
        """
        return self._resource_type

    @resource_type.setter
    def resource_type(self, resource_type):
        """
        Sets the resource_type of this ListPermissionsWithResourceDetails.
        All sub-resources in catalog and workspace.


        :param resource_type: The resource_type of this ListPermissionsWithResourceDetails.
        :type: str
        """
        allowed_values = ["WORKSPACE", "WORKFLOW", "FOLDER", "FILE", "CLUSTER", "MASTER_CATALOG", "CATALOG", "SCHEMA", "TABLE", "SHARE", "RECIPIENT", "VOLUME", "VIEW", "KNOWLEDGE_BASE"]
        if not value_allowed_none_or_none_sentinel(resource_type, allowed_values):
            resource_type = 'UNKNOWN_ENUM_VALUE'
        self._resource_type = resource_type

    @property
    def resource_key(self):
        """
        **[Required]** Gets the resource_key of this ListPermissionsWithResourceDetails.
        Workspace and its sub-resources key.
        For example - For workspaceKey, clusterKey its a UUID
        Within catalog its a 3 level namespace
           tableKey - <catalogName>.<schemaName>.<tableName>
           schemaKey - <catalogName>.<schemaName>
           catalogKey - <catalogName>


        :return: The resource_key of this ListPermissionsWithResourceDetails.
        :rtype: str
        """
        return self._resource_key

    @resource_key.setter
    def resource_key(self, resource_key):
        """
        Sets the resource_key of this ListPermissionsWithResourceDetails.
        Workspace and its sub-resources key.
        For example - For workspaceKey, clusterKey its a UUID
        Within catalog its a 3 level namespace
           tableKey - <catalogName>.<schemaName>.<tableName>
           schemaKey - <catalogName>.<schemaName>
           catalogKey - <catalogName>


        :param resource_key: The resource_key of this ListPermissionsWithResourceDetails.
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
