# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class WorkspaceSummary(object):
    """
    Summary information about a Workspace.
    """

    #: A constant which can be used with the type property of a WorkspaceSummary.
    #: This constant has a value of "DEFAULT"
    TYPE_DEFAULT = "DEFAULT"

    #: A constant which can be used with the type property of a WorkspaceSummary.
    #: This constant has a value of "USER"
    TYPE_USER = "USER"

    def __init__(self, **kwargs):
        """
        Initializes a new WorkspaceSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this WorkspaceSummary.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this WorkspaceSummary.
        :type display_name: str

        :param type:
            The value to assign to the type property of this WorkspaceSummary.
            Allowed values for this property are: "DEFAULT", "USER", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type type: str

        :param description:
            The value to assign to the description property of this WorkspaceSummary.
        :type description: str

        :param time_created:
            The value to assign to the time_created property of this WorkspaceSummary.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this WorkspaceSummary.
        :type time_updated: datetime

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this WorkspaceSummary.
        :type lifecycle_state: str

        :param lifecycle_details:
            The value to assign to the lifecycle_details property of this WorkspaceSummary.
        :type lifecycle_details: str

        :param system_tags:
            The value to assign to the system_tags property of this WorkspaceSummary.
        :type system_tags: dict(str, dict(str, object))

        :param created_by:
            The value to assign to the created_by property of this WorkspaceSummary.
        :type created_by: str

        :param created_by_name:
            The value to assign to the created_by_name property of this WorkspaceSummary.
        :type created_by_name: str

        :param updated_by:
            The value to assign to the updated_by property of this WorkspaceSummary.
        :type updated_by: str

        :param updated_by_name:
            The value to assign to the updated_by_name property of this WorkspaceSummary.
        :type updated_by_name: str

        :param default_catalog_key:
            The value to assign to the default_catalog_key property of this WorkspaceSummary.
        :type default_catalog_key: str

        :param is_private_network_enabled:
            The value to assign to the is_private_network_enabled property of this WorkspaceSummary.
        :type is_private_network_enabled: bool

        :param aic_user_schema_name:
            The value to assign to the aic_user_schema_name property of this WorkspaceSummary.
        :type aic_user_schema_name: str

        """
        self.swagger_types = {
            'key': 'str',
            'display_name': 'str',
            'type': 'str',
            'description': 'str',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'lifecycle_state': 'str',
            'lifecycle_details': 'str',
            'system_tags': 'dict(str, dict(str, object))',
            'created_by': 'str',
            'created_by_name': 'str',
            'updated_by': 'str',
            'updated_by_name': 'str',
            'default_catalog_key': 'str',
            'is_private_network_enabled': 'bool',
            'aic_user_schema_name': 'str'
        }

        self.attribute_map = {
            'key': 'key',
            'display_name': 'displayName',
            'type': 'type',
            'description': 'description',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'lifecycle_state': 'lifecycleState',
            'lifecycle_details': 'lifecycleDetails',
            'system_tags': 'systemTags',
            'created_by': 'createdBy',
            'created_by_name': 'createdByName',
            'updated_by': 'updatedBy',
            'updated_by_name': 'updatedByName',
            'default_catalog_key': 'defaultCatalogKey',
            'is_private_network_enabled': 'isPrivateNetworkEnabled',
            'aic_user_schema_name': 'aicUserSchemaName'
        }

        self._key = None
        self._display_name = None
        self._type = None
        self._description = None
        self._time_created = None
        self._time_updated = None
        self._lifecycle_state = None
        self._lifecycle_details = None
        self._system_tags = None
        self._created_by = None
        self._created_by_name = None
        self._updated_by = None
        self._updated_by_name = None
        self._default_catalog_key = None
        self._is_private_network_enabled = None
        self._aic_user_schema_name = None

    @property
    def key(self):
        """
        **[Required]** Gets the key of this WorkspaceSummary.
        The key of the AI Data Platform Workbench workspace.


        :return: The key of this WorkspaceSummary.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this WorkspaceSummary.
        The key of the AI Data Platform Workbench workspace.


        :param key: The key of this WorkspaceSummary.
        :type: str
        """
        self._key = key

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this WorkspaceSummary.
        A user-friendly name that has to be unique in a AI Data Platform Workbench instance.


        :return: The display_name of this WorkspaceSummary.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this WorkspaceSummary.
        A user-friendly name that has to be unique in a AI Data Platform Workbench instance.


        :param display_name: The display_name of this WorkspaceSummary.
        :type: str
        """
        self._display_name = display_name

    @property
    def type(self):
        """
        **[Required]** Gets the type of this WorkspaceSummary.
        Workspace type. Type is DEFAULT for workspace created at AI Data Platform Workbench creation, type is USER for workspace created by AI Data Platform Workbench user.

        Allowed values for this property are: "DEFAULT", "USER", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The type of this WorkspaceSummary.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this WorkspaceSummary.
        Workspace type. Type is DEFAULT for workspace created at AI Data Platform Workbench creation, type is USER for workspace created by AI Data Platform Workbench user.


        :param type: The type of this WorkspaceSummary.
        :type: str
        """
        allowed_values = ["DEFAULT", "USER"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            type = 'UNKNOWN_ENUM_VALUE'
        self._type = type

    @property
    def description(self):
        """
        Gets the description of this WorkspaceSummary.
        Description of the workspace.


        :return: The description of this WorkspaceSummary.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this WorkspaceSummary.
        Description of the workspace.


        :param description: The description of this WorkspaceSummary.
        :type: str
        """
        self._description = description

    @property
    def time_created(self):
        """
        **[Required]** Gets the time_created of this WorkspaceSummary.
        The date and time the AI Data Platform Workbench workspace was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :return: The time_created of this WorkspaceSummary.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this WorkspaceSummary.
        The date and time the AI Data Platform Workbench workspace was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :param time_created: The time_created of this WorkspaceSummary.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this WorkspaceSummary.
        The date and time the AI Data Platform Workbench workspace was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :return: The time_updated of this WorkspaceSummary.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this WorkspaceSummary.
        The date and time the AI Data Platform Workbench workspace was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :param time_updated: The time_updated of this WorkspaceSummary.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def lifecycle_state(self):
        """
        **[Required]** Gets the lifecycle_state of this WorkspaceSummary.
        The current state of the AI Data Platform Workbench workspace.


        :return: The lifecycle_state of this WorkspaceSummary.
        :rtype: str
        """
        return self._lifecycle_state

    @lifecycle_state.setter
    def lifecycle_state(self, lifecycle_state):
        """
        Sets the lifecycle_state of this WorkspaceSummary.
        The current state of the AI Data Platform Workbench workspace.


        :param lifecycle_state: The lifecycle_state of this WorkspaceSummary.
        :type: str
        """
        self._lifecycle_state = lifecycle_state

    @property
    def lifecycle_details(self):
        """
        Gets the lifecycle_details of this WorkspaceSummary.
        A message that describes the current state of the workspace in more detail. For example,
        can be used to provide actionable information for a resource in the Failed state.


        :return: The lifecycle_details of this WorkspaceSummary.
        :rtype: str
        """
        return self._lifecycle_details

    @lifecycle_details.setter
    def lifecycle_details(self, lifecycle_details):
        """
        Sets the lifecycle_details of this WorkspaceSummary.
        A message that describes the current state of the workspace in more detail. For example,
        can be used to provide actionable information for a resource in the Failed state.


        :param lifecycle_details: The lifecycle_details of this WorkspaceSummary.
        :type: str
        """
        self._lifecycle_details = lifecycle_details

    @property
    def system_tags(self):
        """
        Gets the system_tags of this WorkspaceSummary.
        System tags for this resource. Each key is predefined and scoped to a namespace.

        Example: `{\"orcl-cloud\": {\"free-tier-retained\": \"true\"}}`


        :return: The system_tags of this WorkspaceSummary.
        :rtype: dict(str, dict(str, object))
        """
        return self._system_tags

    @system_tags.setter
    def system_tags(self, system_tags):
        """
        Sets the system_tags of this WorkspaceSummary.
        System tags for this resource. Each key is predefined and scoped to a namespace.

        Example: `{\"orcl-cloud\": {\"free-tier-retained\": \"true\"}}`


        :param system_tags: The system_tags of this WorkspaceSummary.
        :type: dict(str, dict(str, object))
        """
        self._system_tags = system_tags

    @property
    def created_by(self):
        """
        Gets the created_by of this WorkspaceSummary.
        OCID of the user who created this record.


        :return: The created_by of this WorkspaceSummary.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this WorkspaceSummary.
        OCID of the user who created this record.


        :param created_by: The created_by of this WorkspaceSummary.
        :type: str
        """
        self._created_by = created_by

    @property
    def created_by_name(self):
        """
        Gets the created_by_name of this WorkspaceSummary.
        Name of the user who created this record.


        :return: The created_by_name of this WorkspaceSummary.
        :rtype: str
        """
        return self._created_by_name

    @created_by_name.setter
    def created_by_name(self, created_by_name):
        """
        Sets the created_by_name of this WorkspaceSummary.
        Name of the user who created this record.


        :param created_by_name: The created_by_name of this WorkspaceSummary.
        :type: str
        """
        self._created_by_name = created_by_name

    @property
    def updated_by(self):
        """
        Gets the updated_by of this WorkspaceSummary.
        OCID of the user who updated this record.


        :return: The updated_by of this WorkspaceSummary.
        :rtype: str
        """
        return self._updated_by

    @updated_by.setter
    def updated_by(self, updated_by):
        """
        Sets the updated_by of this WorkspaceSummary.
        OCID of the user who updated this record.


        :param updated_by: The updated_by of this WorkspaceSummary.
        :type: str
        """
        self._updated_by = updated_by

    @property
    def updated_by_name(self):
        """
        Gets the updated_by_name of this WorkspaceSummary.
        Name of the user who updated this record.


        :return: The updated_by_name of this WorkspaceSummary.
        :rtype: str
        """
        return self._updated_by_name

    @updated_by_name.setter
    def updated_by_name(self, updated_by_name):
        """
        Sets the updated_by_name of this WorkspaceSummary.
        Name of the user who updated this record.


        :param updated_by_name: The updated_by_name of this WorkspaceSummary.
        :type: str
        """
        self._updated_by_name = updated_by_name

    @property
    def default_catalog_key(self):
        """
        Gets the default_catalog_key of this WorkspaceSummary.
        The key of the catalog to be used as the default catalog for this workspace.
        A default catalog in the workspace will allow users to use that
        catalog without the need to refer it in the notebook. For example, if default catalog is iCat1, and it has
        schema1 and table1, you can refer to the table in a notebook using: schema1.table1.


        :return: The default_catalog_key of this WorkspaceSummary.
        :rtype: str
        """
        return self._default_catalog_key

    @default_catalog_key.setter
    def default_catalog_key(self, default_catalog_key):
        """
        Sets the default_catalog_key of this WorkspaceSummary.
        The key of the catalog to be used as the default catalog for this workspace.
        A default catalog in the workspace will allow users to use that
        catalog without the need to refer it in the notebook. For example, if default catalog is iCat1, and it has
        schema1 and table1, you can refer to the table in a notebook using: schema1.table1.


        :param default_catalog_key: The default_catalog_key of this WorkspaceSummary.
        :type: str
        """
        self._default_catalog_key = default_catalog_key

    @property
    def is_private_network_enabled(self):
        """
        Gets the is_private_network_enabled of this WorkspaceSummary.
        A flag to display whether workspace is private network enabled or not.


        :return: The is_private_network_enabled of this WorkspaceSummary.
        :rtype: bool
        """
        return self._is_private_network_enabled

    @is_private_network_enabled.setter
    def is_private_network_enabled(self, is_private_network_enabled):
        """
        Sets the is_private_network_enabled of this WorkspaceSummary.
        A flag to display whether workspace is private network enabled or not.


        :param is_private_network_enabled: The is_private_network_enabled of this WorkspaceSummary.
        :type: bool
        """
        self._is_private_network_enabled = is_private_network_enabled

    @property
    def aic_user_schema_name(self):
        """
        Gets the aic_user_schema_name of this WorkspaceSummary.
        The name of the AIC user schema if created.


        :return: The aic_user_schema_name of this WorkspaceSummary.
        :rtype: str
        """
        return self._aic_user_schema_name

    @aic_user_schema_name.setter
    def aic_user_schema_name(self, aic_user_schema_name):
        """
        Sets the aic_user_schema_name of this WorkspaceSummary.
        The name of the AIC user schema if created.


        :param aic_user_schema_name: The aic_user_schema_name of this WorkspaceSummary.
        :type: str
        """
        self._aic_user_schema_name = aic_user_schema_name

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
