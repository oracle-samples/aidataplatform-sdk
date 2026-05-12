# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class Table(object):
    """
    Information about the table in the schema.
    """

    #: A constant which can be used with the entity_type property of a Table.
    #: This constant has a value of "ADW"
    ENTITY_TYPE_ADW = "ADW"

    #: A constant which can be used with the entity_type property of a Table.
    #: This constant has a value of "ALH"
    ENTITY_TYPE_ALH = "ALH"

    #: A constant which can be used with the entity_type property of a Table.
    #: This constant has a value of "STANDARD"
    ENTITY_TYPE_STANDARD = "STANDARD"

    #: A constant which can be used with the entity_type property of a Table.
    #: This constant has a value of "ATP"
    ENTITY_TYPE_ATP = "ATP"

    #: A constant which can be used with the entity_type property of a Table.
    #: This constant has a value of "ORACLE"
    ENTITY_TYPE_ORACLE = "ORACLE"

    #: A constant which can be used with the entity_type property of a Table.
    #: This constant has a value of "EXADATA"
    ENTITY_TYPE_EXADATA = "EXADATA"

    #: A constant which can be used with the table_type property of a Table.
    #: This constant has a value of "MANAGED"
    TABLE_TYPE_MANAGED = "MANAGED"

    #: A constant which can be used with the table_type property of a Table.
    #: This constant has a value of "EXTERNAL"
    TABLE_TYPE_EXTERNAL = "EXTERNAL"

    #: A constant which can be used with the lifecycle_state property of a Table.
    #: This constant has a value of "ACTIVE"
    LIFECYCLE_STATE_ACTIVE = "ACTIVE"

    #: A constant which can be used with the lifecycle_state property of a Table.
    #: This constant has a value of "CREATING"
    LIFECYCLE_STATE_CREATING = "CREATING"

    #: A constant which can be used with the lifecycle_state property of a Table.
    #: This constant has a value of "DELETING"
    LIFECYCLE_STATE_DELETING = "DELETING"

    #: A constant which can be used with the lifecycle_state property of a Table.
    #: This constant has a value of "UPDATING"
    LIFECYCLE_STATE_UPDATING = "UPDATING"

    def __init__(self, **kwargs):
        """
        Initializes a new Table object with values from keyword arguments. This class has the following subclasses and if you are using this class as input
        to a service operations then you should favor using a subclass over the base class:

        * :class:`~oci.aidataplatform_dp.models.OracleTable`
        * :class:`~oci.aidataplatform_dp.models.AdwTable`
        * :class:`~oci.aidataplatform_dp.models.AlhTable`
        * :class:`~oci.aidataplatform_dp.models.StandardTable`
        * :class:`~oci.aidataplatform_dp.models.ExadataTable`
        * :class:`~oci.aidataplatform_dp.models.AtpTable`

        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param entity_type:
            The value to assign to the entity_type property of this Table.
            Allowed values for this property are: "ADW", "ALH", "STANDARD", "ATP", "ORACLE", "EXADATA", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type entity_type: str

        :param key:
            The value to assign to the key property of this Table.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this Table.
        :type display_name: str

        :param catalog_key:
            The value to assign to the catalog_key property of this Table.
        :type catalog_key: str

        :param schema_key:
            The value to assign to the schema_key property of this Table.
        :type schema_key: str

        :param location:
            The value to assign to the location property of this Table.
        :type location: str

        :param description:
            The value to assign to the description property of this Table.
        :type description: str

        :param table_type:
            The value to assign to the table_type property of this Table.
            Allowed values for this property are: "MANAGED", "EXTERNAL", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type table_type: str

        :param managed_table_definition:
            The value to assign to the managed_table_definition property of this Table.
        :type managed_table_definition: oci.aidataplatform_dp.models.ManagedTableDefinition

        :param external_table_definition:
            The value to assign to the external_table_definition property of this Table.
        :type external_table_definition: oci.aidataplatform_dp.models.ExternalTableDefinition

        :param table_fields:
            The value to assign to the table_fields property of this Table.
        :type table_fields: list[oci.aidataplatform_dp.models.TableFieldDetails]

        :param partition_keys:
            The value to assign to the partition_keys property of this Table.
        :type partition_keys: list[oci.aidataplatform_dp.models.TableFieldDetails]

        :param table_properties:
            The value to assign to the table_properties property of this Table.
        :type table_properties: list[oci.aidataplatform_dp.models.TableProperty]

        :param time_created:
            The value to assign to the time_created property of this Table.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this Table.
        :type time_updated: datetime

        :param created_by:
            The value to assign to the created_by property of this Table.
        :type created_by: str

        :param updated_by:
            The value to assign to the updated_by property of this Table.
        :type updated_by: str

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this Table.
            Allowed values for this property are: "ACTIVE", "CREATING", "DELETING", "UPDATING", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type lifecycle_state: str

        :param lifecycle_state_details:
            The value to assign to the lifecycle_state_details property of this Table.
        :type lifecycle_state_details: str

        """
        self.swagger_types = {
            'entity_type': 'str',
            'key': 'str',
            'display_name': 'str',
            'catalog_key': 'str',
            'schema_key': 'str',
            'location': 'str',
            'description': 'str',
            'table_type': 'str',
            'managed_table_definition': 'ManagedTableDefinition',
            'external_table_definition': 'ExternalTableDefinition',
            'table_fields': 'list[TableFieldDetails]',
            'partition_keys': 'list[TableFieldDetails]',
            'table_properties': 'list[TableProperty]',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'created_by': 'str',
            'updated_by': 'str',
            'lifecycle_state': 'str',
            'lifecycle_state_details': 'str'
        }

        self.attribute_map = {
            'entity_type': 'entityType',
            'key': 'key',
            'display_name': 'displayName',
            'catalog_key': 'catalogKey',
            'schema_key': 'schemaKey',
            'location': 'location',
            'description': 'description',
            'table_type': 'tableType',
            'managed_table_definition': 'managedTableDefinition',
            'external_table_definition': 'externalTableDefinition',
            'table_fields': 'tableFields',
            'partition_keys': 'partitionKeys',
            'table_properties': 'tableProperties',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'created_by': 'createdBy',
            'updated_by': 'updatedBy',
            'lifecycle_state': 'lifecycleState',
            'lifecycle_state_details': 'lifecycleStateDetails'
        }

        self._entity_type = None
        self._key = None
        self._display_name = None
        self._catalog_key = None
        self._schema_key = None
        self._location = None
        self._description = None
        self._table_type = None
        self._managed_table_definition = None
        self._external_table_definition = None
        self._table_fields = None
        self._partition_keys = None
        self._table_properties = None
        self._time_created = None
        self._time_updated = None
        self._created_by = None
        self._updated_by = None
        self._lifecycle_state = None
        self._lifecycle_state_details = None

    @staticmethod
    def get_subtype(object_dictionary):
        """
        Given the hash representation of a subtype of this class,
        use the info in the hash to return the class of the subtype.
        """
        type = object_dictionary['entityType']

        if type == 'ORACLE':
            return 'OracleTable'

        if type == 'ADW':
            return 'AdwTable'

        if type == 'ALH':
            return 'AlhTable'

        if type == 'STANDARD':
            return 'StandardTable'

        if type == 'EXADATA':
            return 'ExadataTable'

        if type == 'ATP':
            return 'AtpTable'
        else:
            return 'Table'

    @property
    def entity_type(self):
        """
        **[Required]** Gets the entity_type of this Table.
        An enum to decide the type of the derived model

        Allowed values for this property are: "ADW", "ALH", "STANDARD", "ATP", "ORACLE", "EXADATA", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The entity_type of this Table.
        :rtype: str
        """
        return self._entity_type

    @entity_type.setter
    def entity_type(self, entity_type):
        """
        Sets the entity_type of this Table.
        An enum to decide the type of the derived model


        :param entity_type: The entity_type of this Table.
        :type: str
        """
        allowed_values = ["ADW", "ALH", "STANDARD", "ATP", "ORACLE", "EXADATA"]
        if not value_allowed_none_or_none_sentinel(entity_type, allowed_values):
            entity_type = 'UNKNOWN_ENUM_VALUE'
        self._entity_type = entity_type

    @property
    def key(self):
        """
        Gets the key of this Table.
        The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.


        :return: The key of this Table.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this Table.
        The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.


        :param key: The key of this Table.
        :type: str
        """
        self._key = key

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this Table.
        Table name.


        :return: The display_name of this Table.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this Table.
        Table name.


        :param display_name: The display_name of this Table.
        :type: str
        """
        self._display_name = display_name

    @property
    def catalog_key(self):
        """
        Gets the catalog_key of this Table.
        The name of the catalog to which this table belongs.


        :return: The catalog_key of this Table.
        :rtype: str
        """
        return self._catalog_key

    @catalog_key.setter
    def catalog_key(self, catalog_key):
        """
        Sets the catalog_key of this Table.
        The name of the catalog to which this table belongs.


        :param catalog_key: The catalog_key of this Table.
        :type: str
        """
        self._catalog_key = catalog_key

    @property
    def schema_key(self):
        """
        Gets the schema_key of this Table.
        The name of the schema to which this table belongs.


        :return: The schema_key of this Table.
        :rtype: str
        """
        return self._schema_key

    @schema_key.setter
    def schema_key(self, schema_key):
        """
        Sets the schema_key of this Table.
        The name of the schema to which this table belongs.


        :param schema_key: The schema_key of this Table.
        :type: str
        """
        self._schema_key = schema_key

    @property
    def location(self):
        """
        Gets the location of this Table.
        Location of the table data.


        :return: The location of this Table.
        :rtype: str
        """
        return self._location

    @location.setter
    def location(self, location):
        """
        Sets the location of this Table.
        Location of the table data.


        :param location: The location of this Table.
        :type: str
        """
        self._location = location

    @property
    def description(self):
        """
        Gets the description of this Table.
        Table description.


        :return: The description of this Table.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this Table.
        Table description.


        :param description: The description of this Table.
        :type: str
        """
        self._description = description

    @property
    def table_type(self):
        """
        Gets the table_type of this Table.
        Type of table. Managed, external or mount table.

        Allowed values for this property are: "MANAGED", "EXTERNAL", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The table_type of this Table.
        :rtype: str
        """
        return self._table_type

    @table_type.setter
    def table_type(self, table_type):
        """
        Sets the table_type of this Table.
        Type of table. Managed, external or mount table.


        :param table_type: The table_type of this Table.
        :type: str
        """
        allowed_values = ["MANAGED", "EXTERNAL"]
        if not value_allowed_none_or_none_sentinel(table_type, allowed_values):
            table_type = 'UNKNOWN_ENUM_VALUE'
        self._table_type = table_type

    @property
    def managed_table_definition(self):
        """
        Gets the managed_table_definition of this Table.

        :return: The managed_table_definition of this Table.
        :rtype: oci.aidataplatform_dp.models.ManagedTableDefinition
        """
        return self._managed_table_definition

    @managed_table_definition.setter
    def managed_table_definition(self, managed_table_definition):
        """
        Sets the managed_table_definition of this Table.

        :param managed_table_definition: The managed_table_definition of this Table.
        :type: oci.aidataplatform_dp.models.ManagedTableDefinition
        """
        self._managed_table_definition = managed_table_definition

    @property
    def external_table_definition(self):
        """
        Gets the external_table_definition of this Table.

        :return: The external_table_definition of this Table.
        :rtype: oci.aidataplatform_dp.models.ExternalTableDefinition
        """
        return self._external_table_definition

    @external_table_definition.setter
    def external_table_definition(self, external_table_definition):
        """
        Sets the external_table_definition of this Table.

        :param external_table_definition: The external_table_definition of this Table.
        :type: oci.aidataplatform_dp.models.ExternalTableDefinition
        """
        self._external_table_definition = external_table_definition

    @property
    def table_fields(self):
        """
        Gets the table_fields of this Table.
        Columns for table.


        :return: The table_fields of this Table.
        :rtype: list[oci.aidataplatform_dp.models.TableFieldDetails]
        """
        return self._table_fields

    @table_fields.setter
    def table_fields(self, table_fields):
        """
        Sets the table_fields of this Table.
        Columns for table.


        :param table_fields: The table_fields of this Table.
        :type: list[oci.aidataplatform_dp.models.TableFieldDetails]
        """
        self._table_fields = table_fields

    @property
    def partition_keys(self):
        """
        Gets the partition_keys of this Table.
        Columns to be used in partition for table.


        :return: The partition_keys of this Table.
        :rtype: list[oci.aidataplatform_dp.models.TableFieldDetails]
        """
        return self._partition_keys

    @partition_keys.setter
    def partition_keys(self, partition_keys):
        """
        Sets the partition_keys of this Table.
        Columns to be used in partition for table.


        :param partition_keys: The partition_keys of this Table.
        :type: list[oci.aidataplatform_dp.models.TableFieldDetails]
        """
        self._partition_keys = partition_keys

    @property
    def table_properties(self):
        """
        Gets the table_properties of this Table.
        Table properties.


        :return: The table_properties of this Table.
        :rtype: list[oci.aidataplatform_dp.models.TableProperty]
        """
        return self._table_properties

    @table_properties.setter
    def table_properties(self, table_properties):
        """
        Sets the table_properties of this Table.
        Table properties.


        :param table_properties: The table_properties of this Table.
        :type: list[oci.aidataplatform_dp.models.TableProperty]
        """
        self._table_properties = table_properties

    @property
    def time_created(self):
        """
        Gets the time_created of this Table.
        The date and time the table was created.


        :return: The time_created of this Table.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this Table.
        The date and time the table was created.


        :param time_created: The time_created of this Table.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this Table.
        The date and time the table was updated.


        :return: The time_updated of this Table.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this Table.
        The date and time the table was updated.


        :param time_updated: The time_updated of this Table.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def created_by(self):
        """
        Gets the created_by of this Table.
        The OCID of the user/principal who created the table.


        :return: The created_by of this Table.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this Table.
        The OCID of the user/principal who created the table.


        :param created_by: The created_by of this Table.
        :type: str
        """
        self._created_by = created_by

    @property
    def updated_by(self):
        """
        Gets the updated_by of this Table.
        The ID of the user who last updated the schema.


        :return: The updated_by of this Table.
        :rtype: str
        """
        return self._updated_by

    @updated_by.setter
    def updated_by(self, updated_by):
        """
        Sets the updated_by of this Table.
        The ID of the user who last updated the schema.


        :param updated_by: The updated_by of this Table.
        :type: str
        """
        self._updated_by = updated_by

    @property
    def lifecycle_state(self):
        """
        Gets the lifecycle_state of this Table.
        The state of the table.

        Allowed values for this property are: "ACTIVE", "CREATING", "DELETING", "UPDATING", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The lifecycle_state of this Table.
        :rtype: str
        """
        return self._lifecycle_state

    @lifecycle_state.setter
    def lifecycle_state(self, lifecycle_state):
        """
        Sets the lifecycle_state of this Table.
        The state of the table.


        :param lifecycle_state: The lifecycle_state of this Table.
        :type: str
        """
        allowed_values = ["ACTIVE", "CREATING", "DELETING", "UPDATING"]
        if not value_allowed_none_or_none_sentinel(lifecycle_state, allowed_values):
            lifecycle_state = 'UNKNOWN_ENUM_VALUE'
        self._lifecycle_state = lifecycle_state

    @property
    def lifecycle_state_details(self):
        """
        Gets the lifecycle_state_details of this Table.
        A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.


        :return: The lifecycle_state_details of this Table.
        :rtype: str
        """
        return self._lifecycle_state_details

    @lifecycle_state_details.setter
    def lifecycle_state_details(self, lifecycle_state_details):
        """
        Sets the lifecycle_state_details of this Table.
        A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.


        :param lifecycle_state_details: The lifecycle_state_details of this Table.
        :type: str
        """
        self._lifecycle_state_details = lifecycle_state_details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
