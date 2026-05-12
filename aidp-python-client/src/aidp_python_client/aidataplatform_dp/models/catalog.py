# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class Catalog(object):
    """
    AI Data Platform Workbench catalogs enable you to manage your data and metadata.

    To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized, talk to
    an administrator. If you're an administrator who needs to write policies to give users access, see
    <a href=\"https://docs.oracle.com/en/cloud/paas/ai-data-platform/aidug/iam-policies-oracle-ai-data-platform.html\" target=\"_blank\" rel=\"noopener noreferrer\">IAM Policies for Oracle AI Data Platform Workbench</a>.
    """

    #: A constant which can be used with the catalog_type property of a Catalog.
    #: This constant has a value of "EXTERNAL"
    CATALOG_TYPE_EXTERNAL = "EXTERNAL"

    #: A constant which can be used with the catalog_type property of a Catalog.
    #: This constant has a value of "INTERNAL"
    CATALOG_TYPE_INTERNAL = "INTERNAL"

    #: A constant which can be used with the source_type property of a Catalog.
    #: This constant has a value of "ADW"
    SOURCE_TYPE_ADW = "ADW"

    #: A constant which can be used with the source_type property of a Catalog.
    #: This constant has a value of "ALH"
    SOURCE_TYPE_ALH = "ALH"

    #: A constant which can be used with the source_type property of a Catalog.
    #: This constant has a value of "KAFKA"
    SOURCE_TYPE_KAFKA = "KAFKA"

    #: A constant which can be used with the source_type property of a Catalog.
    #: This constant has a value of "ATP"
    SOURCE_TYPE_ATP = "ATP"

    #: A constant which can be used with the source_type property of a Catalog.
    #: This constant has a value of "ORACLE"
    SOURCE_TYPE_ORACLE = "ORACLE"

    #: A constant which can be used with the source_type property of a Catalog.
    #: This constant has a value of "EXADATA"
    SOURCE_TYPE_EXADATA = "EXADATA"

    #: A constant which can be used with the lifecycle_state property of a Catalog.
    #: This constant has a value of "ACTIVE"
    LIFECYCLE_STATE_ACTIVE = "ACTIVE"

    #: A constant which can be used with the lifecycle_state property of a Catalog.
    #: This constant has a value of "CREATING"
    LIFECYCLE_STATE_CREATING = "CREATING"

    #: A constant which can be used with the lifecycle_state property of a Catalog.
    #: This constant has a value of "DELETING"
    LIFECYCLE_STATE_DELETING = "DELETING"

    #: A constant which can be used with the lifecycle_state property of a Catalog.
    #: This constant has a value of "UPDATING"
    LIFECYCLE_STATE_UPDATING = "UPDATING"

    def __init__(self, **kwargs):
        """
        Initializes a new Catalog object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this Catalog.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this Catalog.
        :type display_name: str

        :param description:
            The value to assign to the description property of this Catalog.
        :type description: str

        :param catalog_guid:
            The value to assign to the catalog_guid property of this Catalog.
        :type catalog_guid: str

        :param catalog_type:
            The value to assign to the catalog_type property of this Catalog.
            Allowed values for this property are: "EXTERNAL", "INTERNAL", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type catalog_type: str

        :param source_type:
            The value to assign to the source_type property of this Catalog.
            Allowed values for this property are: "ADW", "ALH", "KAFKA", "ATP", "ORACLE", "EXADATA", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type source_type: str

        :param connection_details:
            The value to assign to the connection_details property of this Catalog.
        :type connection_details: oci.aidataplatform_dp.models.CatalogConnectionDetails

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this Catalog.
            Allowed values for this property are: "ACTIVE", "CREATING", "DELETING", "UPDATING", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type lifecycle_state: str

        :param lifecycle_state_details:
            The value to assign to the lifecycle_state_details property of this Catalog.
        :type lifecycle_state_details: str

        :param time_created:
            The value to assign to the time_created property of this Catalog.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this Catalog.
        :type time_updated: datetime

        :param created_by:
            The value to assign to the created_by property of this Catalog.
        :type created_by: str

        :param updated_by:
            The value to assign to the updated_by property of this Catalog.
        :type updated_by: str

        :param properties:
            The value to assign to the properties property of this Catalog.
        :type properties: dict(str, str)

        """
        self.swagger_types = {
            'key': 'str',
            'display_name': 'str',
            'description': 'str',
            'catalog_guid': 'str',
            'catalog_type': 'str',
            'source_type': 'str',
            'connection_details': 'CatalogConnectionDetails',
            'lifecycle_state': 'str',
            'lifecycle_state_details': 'str',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'created_by': 'str',
            'updated_by': 'str',
            'properties': 'dict(str, str)'
        }

        self.attribute_map = {
            'key': 'key',
            'display_name': 'displayName',
            'description': 'description',
            'catalog_guid': 'catalogGuid',
            'catalog_type': 'catalogType',
            'source_type': 'sourceType',
            'connection_details': 'connectionDetails',
            'lifecycle_state': 'lifecycleState',
            'lifecycle_state_details': 'lifecycleStateDetails',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'created_by': 'createdBy',
            'updated_by': 'updatedBy',
            'properties': 'properties'
        }

        self._key = None
        self._display_name = None
        self._description = None
        self._catalog_guid = None
        self._catalog_type = None
        self._source_type = None
        self._connection_details = None
        self._lifecycle_state = None
        self._lifecycle_state_details = None
        self._time_created = None
        self._time_updated = None
        self._created_by = None
        self._updated_by = None
        self._properties = None

    @property
    def key(self):
        """
        **[Required]** Gets the key of this Catalog.
        The AI Data Platform Workbench catalog key.


        :return: The key of this Catalog.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this Catalog.
        The AI Data Platform Workbench catalog key.


        :param key: The key of this Catalog.
        :type: str
        """
        self._key = key

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this Catalog.
        Catalog display name.


        :return: The display_name of this Catalog.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this Catalog.
        Catalog display name.


        :param display_name: The display_name of this Catalog.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this Catalog.
        Short description of the catalog.


        :return: The description of this Catalog.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this Catalog.
        Short description of the catalog.


        :param description: The description of this Catalog.
        :type: str
        """
        self._description = description

    @property
    def catalog_guid(self):
        """
        Gets the catalog_guid of this Catalog.
        Unique identifier for catalog.


        :return: The catalog_guid of this Catalog.
        :rtype: str
        """
        return self._catalog_guid

    @catalog_guid.setter
    def catalog_guid(self, catalog_guid):
        """
        Sets the catalog_guid of this Catalog.
        Unique identifier for catalog.


        :param catalog_guid: The catalog_guid of this Catalog.
        :type: str
        """
        self._catalog_guid = catalog_guid

    @property
    def catalog_type(self):
        """
        Gets the catalog_type of this Catalog.
        Type of catalog.

        Allowed values for this property are: "EXTERNAL", "INTERNAL", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The catalog_type of this Catalog.
        :rtype: str
        """
        return self._catalog_type

    @catalog_type.setter
    def catalog_type(self, catalog_type):
        """
        Sets the catalog_type of this Catalog.
        Type of catalog.


        :param catalog_type: The catalog_type of this Catalog.
        :type: str
        """
        allowed_values = ["EXTERNAL", "INTERNAL"]
        if not value_allowed_none_or_none_sentinel(catalog_type, allowed_values):
            catalog_type = 'UNKNOWN_ENUM_VALUE'
        self._catalog_type = catalog_type

    @property
    def source_type(self):
        """
        Gets the source_type of this Catalog.
        External catalog source type.

        Allowed values for this property are: "ADW", "ALH", "KAFKA", "ATP", "ORACLE", "EXADATA", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The source_type of this Catalog.
        :rtype: str
        """
        return self._source_type

    @source_type.setter
    def source_type(self, source_type):
        """
        Sets the source_type of this Catalog.
        External catalog source type.


        :param source_type: The source_type of this Catalog.
        :type: str
        """
        allowed_values = ["ADW", "ALH", "KAFKA", "ATP", "ORACLE", "EXADATA"]
        if not value_allowed_none_or_none_sentinel(source_type, allowed_values):
            source_type = 'UNKNOWN_ENUM_VALUE'
        self._source_type = source_type

    @property
    def connection_details(self):
        """
        Gets the connection_details of this Catalog.

        :return: The connection_details of this Catalog.
        :rtype: oci.aidataplatform_dp.models.CatalogConnectionDetails
        """
        return self._connection_details

    @connection_details.setter
    def connection_details(self, connection_details):
        """
        Sets the connection_details of this Catalog.

        :param connection_details: The connection_details of this Catalog.
        :type: oci.aidataplatform_dp.models.CatalogConnectionDetails
        """
        self._connection_details = connection_details

    @property
    def lifecycle_state(self):
        """
        Gets the lifecycle_state of this Catalog.
        The current status of the catalog.

        Allowed values for this property are: "ACTIVE", "CREATING", "DELETING", "UPDATING", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The lifecycle_state of this Catalog.
        :rtype: str
        """
        return self._lifecycle_state

    @lifecycle_state.setter
    def lifecycle_state(self, lifecycle_state):
        """
        Sets the lifecycle_state of this Catalog.
        The current status of the catalog.


        :param lifecycle_state: The lifecycle_state of this Catalog.
        :type: str
        """
        allowed_values = ["ACTIVE", "CREATING", "DELETING", "UPDATING"]
        if not value_allowed_none_or_none_sentinel(lifecycle_state, allowed_values):
            lifecycle_state = 'UNKNOWN_ENUM_VALUE'
        self._lifecycle_state = lifecycle_state

    @property
    def lifecycle_state_details(self):
        """
        Gets the lifecycle_state_details of this Catalog.
        A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.


        :return: The lifecycle_state_details of this Catalog.
        :rtype: str
        """
        return self._lifecycle_state_details

    @lifecycle_state_details.setter
    def lifecycle_state_details(self, lifecycle_state_details):
        """
        Sets the lifecycle_state_details of this Catalog.
        A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.


        :param lifecycle_state_details: The lifecycle_state_details of this Catalog.
        :type: str
        """
        self._lifecycle_state_details = lifecycle_state_details

    @property
    def time_created(self):
        """
        **[Required]** Gets the time_created of this Catalog.
        The date and time the AI Data Platform Workbench catalog was created.


        :return: The time_created of this Catalog.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this Catalog.
        The date and time the AI Data Platform Workbench catalog was created.


        :param time_created: The time_created of this Catalog.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this Catalog.
        The date and time the AI Data Platform Workbench catalog was updated.


        :return: The time_updated of this Catalog.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this Catalog.
        The date and time the AI Data Platform Workbench catalog was updated.


        :param time_updated: The time_updated of this Catalog.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def created_by(self):
        """
        Gets the created_by of this Catalog.
        The ID of the user that created the catalog.


        :return: The created_by of this Catalog.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this Catalog.
        The ID of the user that created the catalog.


        :param created_by: The created_by of this Catalog.
        :type: str
        """
        self._created_by = created_by

    @property
    def updated_by(self):
        """
        Gets the updated_by of this Catalog.
        The ID of the last user to update the catalog.


        :return: The updated_by of this Catalog.
        :rtype: str
        """
        return self._updated_by

    @updated_by.setter
    def updated_by(self, updated_by):
        """
        Sets the updated_by of this Catalog.
        The ID of the last user to update the catalog.


        :param updated_by: The updated_by of this Catalog.
        :type: str
        """
        self._updated_by = updated_by

    @property
    def properties(self):
        """
        Gets the properties of this Catalog.
        Key-value pair used to provide catalog properties like the subCompartment OCID where the buckets need to reside.


        :return: The properties of this Catalog.
        :rtype: dict(str, str)
        """
        return self._properties

    @properties.setter
    def properties(self, properties):
        """
        Sets the properties of this Catalog.
        Key-value pair used to provide catalog properties like the subCompartment OCID where the buckets need to reside.


        :param properties: The properties of this Catalog.
        :type: dict(str, str)
        """
        self._properties = properties

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
