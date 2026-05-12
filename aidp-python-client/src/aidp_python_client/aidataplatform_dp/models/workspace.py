# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class Workspace(object):
    """
    A AI Data Platform Workbench Workspace is a logical container that provides users with a collaborative development and runtime environment.
    Workspace organizes and manages resources such as compute clusters, motebooks, and data orchestration workflows.
    Workspace provides shared file system areas to allow for storage of notebooks, SQL scripts, and other files.
    Collaboration features such as version control integration (e.g. GitHub) as well as CI/CD tools integration.
    To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized, talk to
    an administrator. If you're an administrator who needs to write policies to give users access, see
    <a href=\"https://docs.oracle.com/en/cloud/paas/ai-data-platform/aidug/iam-policies-oracle-ai-data-platform.html\" target=\"_blank\" rel=\"noopener noreferrer\">IAM Policies for Oracle AI Data Platform Workbench</a>.
    """

    #: A constant which can be used with the type property of a Workspace.
    #: This constant has a value of "DEFAULT"
    TYPE_DEFAULT = "DEFAULT"

    #: A constant which can be used with the type property of a Workspace.
    #: This constant has a value of "USER"
    TYPE_USER = "USER"

    #: A constant which can be used with the lifecycle_state property of a Workspace.
    #: This constant has a value of "CREATING"
    LIFECYCLE_STATE_CREATING = "CREATING"

    #: A constant which can be used with the lifecycle_state property of a Workspace.
    #: This constant has a value of "UPDATING"
    LIFECYCLE_STATE_UPDATING = "UPDATING"

    #: A constant which can be used with the lifecycle_state property of a Workspace.
    #: This constant has a value of "ACTIVE"
    LIFECYCLE_STATE_ACTIVE = "ACTIVE"

    #: A constant which can be used with the lifecycle_state property of a Workspace.
    #: This constant has a value of "DELETING"
    LIFECYCLE_STATE_DELETING = "DELETING"

    #: A constant which can be used with the lifecycle_state property of a Workspace.
    #: This constant has a value of "DELETED"
    LIFECYCLE_STATE_DELETED = "DELETED"

    #: A constant which can be used with the lifecycle_state property of a Workspace.
    #: This constant has a value of "FAILED"
    LIFECYCLE_STATE_FAILED = "FAILED"

    def __init__(self, **kwargs):
        """
        Initializes a new Workspace object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this Workspace.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this Workspace.
        :type display_name: str

        :param description:
            The value to assign to the description property of this Workspace.
        :type description: str

        :param type:
            The value to assign to the type property of this Workspace.
            Allowed values for this property are: "DEFAULT", "USER", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type type: str

        :param time_created:
            The value to assign to the time_created property of this Workspace.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this Workspace.
        :type time_updated: datetime

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this Workspace.
            Allowed values for this property are: "CREATING", "UPDATING", "ACTIVE", "DELETING", "DELETED", "FAILED", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type lifecycle_state: str

        :param lifecycle_details:
            The value to assign to the lifecycle_details property of this Workspace.
        :type lifecycle_details: str

        :param system_tags:
            The value to assign to the system_tags property of this Workspace.
        :type system_tags: dict(str, dict(str, object))

        :param created_by:
            The value to assign to the created_by property of this Workspace.
        :type created_by: str

        :param created_by_name:
            The value to assign to the created_by_name property of this Workspace.
        :type created_by_name: str

        :param updated_by:
            The value to assign to the updated_by property of this Workspace.
        :type updated_by: str

        :param updated_by_name:
            The value to assign to the updated_by_name property of this Workspace.
        :type updated_by_name: str

        :param default_catalog_key:
            The value to assign to the default_catalog_key property of this Workspace.
        :type default_catalog_key: str

        :param is_private_network_enabled:
            The value to assign to the is_private_network_enabled property of this Workspace.
        :type is_private_network_enabled: bool

        :param network_configuration_details:
            The value to assign to the network_configuration_details property of this Workspace.
        :type network_configuration_details: oci.aidataplatform_dp.models.WorkspaceNetworkConfigurationDetails

        :param log_group_id:
            The value to assign to the log_group_id property of this Workspace.
        :type log_group_id: str

        :param aic_user_schema_name:
            The value to assign to the aic_user_schema_name property of this Workspace.
        :type aic_user_schema_name: str

        """
        self.swagger_types = {
            'key': 'str',
            'display_name': 'str',
            'description': 'str',
            'type': 'str',
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
            'network_configuration_details': 'WorkspaceNetworkConfigurationDetails',
            'log_group_id': 'str',
            'aic_user_schema_name': 'str'
        }

        self.attribute_map = {
            'key': 'key',
            'display_name': 'displayName',
            'description': 'description',
            'type': 'type',
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
            'network_configuration_details': 'networkConfigurationDetails',
            'log_group_id': 'logGroupId',
            'aic_user_schema_name': 'aicUserSchemaName'
        }

        self._key = None
        self._display_name = None
        self._description = None
        self._type = None
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
        self._network_configuration_details = None
        self._log_group_id = None
        self._aic_user_schema_name = None

    @property
    def key(self):
        """
        **[Required]** Gets the key of this Workspace.
        The key of the AI Data Platform Workbench workspace.


        :return: The key of this Workspace.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this Workspace.
        The key of the AI Data Platform Workbench workspace.


        :param key: The key of this Workspace.
        :type: str
        """
        self._key = key

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this Workspace.
        A user-friendly name that has to be unique in a AI Data Platform Workbench instance.


        :return: The display_name of this Workspace.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this Workspace.
        A user-friendly name that has to be unique in a AI Data Platform Workbench instance.


        :param display_name: The display_name of this Workspace.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this Workspace.
        Description of the workspace.


        :return: The description of this Workspace.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this Workspace.
        Description of the workspace.


        :param description: The description of this Workspace.
        :type: str
        """
        self._description = description

    @property
    def type(self):
        """
        Gets the type of this Workspace.
        Workspace type. Type is DEFAULT for workspace created at AI Data Platform Workbench creation, type is USER for workspace created by AI Data Platform Workbench user.

        Allowed values for this property are: "DEFAULT", "USER", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The type of this Workspace.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this Workspace.
        Workspace type. Type is DEFAULT for workspace created at AI Data Platform Workbench creation, type is USER for workspace created by AI Data Platform Workbench user.


        :param type: The type of this Workspace.
        :type: str
        """
        allowed_values = ["DEFAULT", "USER"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            type = 'UNKNOWN_ENUM_VALUE'
        self._type = type

    @property
    def time_created(self):
        """
        **[Required]** Gets the time_created of this Workspace.
        The date and time the AI Data Platform Workbench workspace was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :return: The time_created of this Workspace.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this Workspace.
        The date and time the AI Data Platform Workbench workspace was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :param time_created: The time_created of this Workspace.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this Workspace.
        The date and time the AI Data Platform Workbench workspace was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :return: The time_updated of this Workspace.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this Workspace.
        The date and time the AI Data Platform Workbench workspace was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :param time_updated: The time_updated of this Workspace.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def lifecycle_state(self):
        """
        **[Required]** Gets the lifecycle_state of this Workspace.
        The current state of the AI Data Platform Workbench workspace.

        Allowed values for this property are: "CREATING", "UPDATING", "ACTIVE", "DELETING", "DELETED", "FAILED", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The lifecycle_state of this Workspace.
        :rtype: str
        """
        return self._lifecycle_state

    @lifecycle_state.setter
    def lifecycle_state(self, lifecycle_state):
        """
        Sets the lifecycle_state of this Workspace.
        The current state of the AI Data Platform Workbench workspace.


        :param lifecycle_state: The lifecycle_state of this Workspace.
        :type: str
        """
        allowed_values = ["CREATING", "UPDATING", "ACTIVE", "DELETING", "DELETED", "FAILED"]
        if not value_allowed_none_or_none_sentinel(lifecycle_state, allowed_values):
            lifecycle_state = 'UNKNOWN_ENUM_VALUE'
        self._lifecycle_state = lifecycle_state

    @property
    def lifecycle_details(self):
        """
        Gets the lifecycle_details of this Workspace.
        A message that describes the current state of the workspace in more detail. For example,
        can be used to provide actionable information for a resource in the Failed state.


        :return: The lifecycle_details of this Workspace.
        :rtype: str
        """
        return self._lifecycle_details

    @lifecycle_details.setter
    def lifecycle_details(self, lifecycle_details):
        """
        Sets the lifecycle_details of this Workspace.
        A message that describes the current state of the workspace in more detail. For example,
        can be used to provide actionable information for a resource in the Failed state.


        :param lifecycle_details: The lifecycle_details of this Workspace.
        :type: str
        """
        self._lifecycle_details = lifecycle_details

    @property
    def system_tags(self):
        """
        Gets the system_tags of this Workspace.
        System tags for this resource. Each key is predefined and scoped to a namespace.

        Example: `{\"orcl-cloud\": {\"free-tier-retained\": \"true\"}}`


        :return: The system_tags of this Workspace.
        :rtype: dict(str, dict(str, object))
        """
        return self._system_tags

    @system_tags.setter
    def system_tags(self, system_tags):
        """
        Sets the system_tags of this Workspace.
        System tags for this resource. Each key is predefined and scoped to a namespace.

        Example: `{\"orcl-cloud\": {\"free-tier-retained\": \"true\"}}`


        :param system_tags: The system_tags of this Workspace.
        :type: dict(str, dict(str, object))
        """
        self._system_tags = system_tags

    @property
    def created_by(self):
        """
        Gets the created_by of this Workspace.
        OCID of the user who created this record.


        :return: The created_by of this Workspace.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this Workspace.
        OCID of the user who created this record.


        :param created_by: The created_by of this Workspace.
        :type: str
        """
        self._created_by = created_by

    @property
    def created_by_name(self):
        """
        Gets the created_by_name of this Workspace.
        Name of the user who created this record.


        :return: The created_by_name of this Workspace.
        :rtype: str
        """
        return self._created_by_name

    @created_by_name.setter
    def created_by_name(self, created_by_name):
        """
        Sets the created_by_name of this Workspace.
        Name of the user who created this record.


        :param created_by_name: The created_by_name of this Workspace.
        :type: str
        """
        self._created_by_name = created_by_name

    @property
    def updated_by(self):
        """
        Gets the updated_by of this Workspace.
        OCID of the user who updated this record.


        :return: The updated_by of this Workspace.
        :rtype: str
        """
        return self._updated_by

    @updated_by.setter
    def updated_by(self, updated_by):
        """
        Sets the updated_by of this Workspace.
        OCID of the user who updated this record.


        :param updated_by: The updated_by of this Workspace.
        :type: str
        """
        self._updated_by = updated_by

    @property
    def updated_by_name(self):
        """
        Gets the updated_by_name of this Workspace.
        Name of the user who updated this record.


        :return: The updated_by_name of this Workspace.
        :rtype: str
        """
        return self._updated_by_name

    @updated_by_name.setter
    def updated_by_name(self, updated_by_name):
        """
        Sets the updated_by_name of this Workspace.
        Name of the user who updated this record.


        :param updated_by_name: The updated_by_name of this Workspace.
        :type: str
        """
        self._updated_by_name = updated_by_name

    @property
    def default_catalog_key(self):
        """
        Gets the default_catalog_key of this Workspace.
        The key of the catalog to be used as the default catalog for this workspace.
        A default catalog in the workspace will allow users to use that
        catalog without the need to refer it in the notebook. For example, if default catalog is iCat1, and it has
        schema1 and table1, you can refer to the table in a notebook using: schema1.table1.


        :return: The default_catalog_key of this Workspace.
        :rtype: str
        """
        return self._default_catalog_key

    @default_catalog_key.setter
    def default_catalog_key(self, default_catalog_key):
        """
        Sets the default_catalog_key of this Workspace.
        The key of the catalog to be used as the default catalog for this workspace.
        A default catalog in the workspace will allow users to use that
        catalog without the need to refer it in the notebook. For example, if default catalog is iCat1, and it has
        schema1 and table1, you can refer to the table in a notebook using: schema1.table1.


        :param default_catalog_key: The default_catalog_key of this Workspace.
        :type: str
        """
        self._default_catalog_key = default_catalog_key

    @property
    def is_private_network_enabled(self):
        """
        Gets the is_private_network_enabled of this Workspace.
        A flag to display whether workspace is private network enabled or not.


        :return: The is_private_network_enabled of this Workspace.
        :rtype: bool
        """
        return self._is_private_network_enabled

    @is_private_network_enabled.setter
    def is_private_network_enabled(self, is_private_network_enabled):
        """
        Sets the is_private_network_enabled of this Workspace.
        A flag to display whether workspace is private network enabled or not.


        :param is_private_network_enabled: The is_private_network_enabled of this Workspace.
        :type: bool
        """
        self._is_private_network_enabled = is_private_network_enabled

    @property
    def network_configuration_details(self):
        """
        Gets the network_configuration_details of this Workspace.

        :return: The network_configuration_details of this Workspace.
        :rtype: oci.aidataplatform_dp.models.WorkspaceNetworkConfigurationDetails
        """
        return self._network_configuration_details

    @network_configuration_details.setter
    def network_configuration_details(self, network_configuration_details):
        """
        Sets the network_configuration_details of this Workspace.

        :param network_configuration_details: The network_configuration_details of this Workspace.
        :type: oci.aidataplatform_dp.models.WorkspaceNetworkConfigurationDetails
        """
        self._network_configuration_details = network_configuration_details

    @property
    def log_group_id(self):
        """
        Gets the log_group_id of this Workspace.
        The OCID of the log group that contains the logs.
        This uniquely identifies a collection of logs within OCI Logging Service.


        :return: The log_group_id of this Workspace.
        :rtype: str
        """
        return self._log_group_id

    @log_group_id.setter
    def log_group_id(self, log_group_id):
        """
        Sets the log_group_id of this Workspace.
        The OCID of the log group that contains the logs.
        This uniquely identifies a collection of logs within OCI Logging Service.


        :param log_group_id: The log_group_id of this Workspace.
        :type: str
        """
        self._log_group_id = log_group_id

    @property
    def aic_user_schema_name(self):
        """
        Gets the aic_user_schema_name of this Workspace.
        The name of the AIC user schema if created.


        :return: The aic_user_schema_name of this Workspace.
        :rtype: str
        """
        return self._aic_user_schema_name

    @aic_user_schema_name.setter
    def aic_user_schema_name(self, aic_user_schema_name):
        """
        Sets the aic_user_schema_name of this Workspace.
        The name of the AIC user schema if created.


        :param aic_user_schema_name: The aic_user_schema_name of this Workspace.
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
