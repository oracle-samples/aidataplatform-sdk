# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateTableDetails(object):
    """
    The data to create a table.
    """

    #: A constant which can be used with the table_type property of a CreateTableDetails.
    #: This constant has a value of "MANAGED"
    TABLE_TYPE_MANAGED = "MANAGED"

    #: A constant which can be used with the table_type property of a CreateTableDetails.
    #: This constant has a value of "EXTERNAL"
    TABLE_TYPE_EXTERNAL = "EXTERNAL"

    def __init__(self, **kwargs):
        """
        Initializes a new CreateTableDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param display_name:
            The value to assign to the display_name property of this CreateTableDetails.
        :type display_name: str

        :param catalog_key:
            The value to assign to the catalog_key property of this CreateTableDetails.
        :type catalog_key: str

        :param schema_key:
            The value to assign to the schema_key property of this CreateTableDetails.
        :type schema_key: str

        :param description:
            The value to assign to the description property of this CreateTableDetails.
        :type description: str

        :param table_type:
            The value to assign to the table_type property of this CreateTableDetails.
            Allowed values for this property are: "MANAGED", "EXTERNAL"
        :type table_type: str

        :param managed_table_definition:
            The value to assign to the managed_table_definition property of this CreateTableDetails.
        :type managed_table_definition: oci.aidataplatform_dp.models.ManagedTableDefinition

        :param external_table_definition:
            The value to assign to the external_table_definition property of this CreateTableDetails.
        :type external_table_definition: oci.aidataplatform_dp.models.ExternalTableDefinition

        :param table_fields:
            The value to assign to the table_fields property of this CreateTableDetails.
        :type table_fields: list[oci.aidataplatform_dp.models.TableFieldDetails]

        :param partition_keys:
            The value to assign to the partition_keys property of this CreateTableDetails.
        :type partition_keys: list[oci.aidataplatform_dp.models.TableFieldDetails]

        :param table_properties:
            The value to assign to the table_properties property of this CreateTableDetails.
        :type table_properties: list[oci.aidataplatform_dp.models.TableProperty]

        """
        self.swagger_types = {
            'display_name': 'str',
            'catalog_key': 'str',
            'schema_key': 'str',
            'description': 'str',
            'table_type': 'str',
            'managed_table_definition': 'ManagedTableDefinition',
            'external_table_definition': 'ExternalTableDefinition',
            'table_fields': 'list[TableFieldDetails]',
            'partition_keys': 'list[TableFieldDetails]',
            'table_properties': 'list[TableProperty]'
        }

        self.attribute_map = {
            'display_name': 'displayName',
            'catalog_key': 'catalogKey',
            'schema_key': 'schemaKey',
            'description': 'description',
            'table_type': 'tableType',
            'managed_table_definition': 'managedTableDefinition',
            'external_table_definition': 'externalTableDefinition',
            'table_fields': 'tableFields',
            'partition_keys': 'partitionKeys',
            'table_properties': 'tableProperties'
        }

        self._display_name = None
        self._catalog_key = None
        self._schema_key = None
        self._description = None
        self._table_type = None
        self._managed_table_definition = None
        self._external_table_definition = None
        self._table_fields = None
        self._partition_keys = None
        self._table_properties = None

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this CreateTableDetails.
        Table name.


        :return: The display_name of this CreateTableDetails.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this CreateTableDetails.
        Table name.


        :param display_name: The display_name of this CreateTableDetails.
        :type: str
        """
        self._display_name = display_name

    @property
    def catalog_key(self):
        """
        **[Required]** Gets the catalog_key of this CreateTableDetails.
        The name of the catalog to which this table belongs.


        :return: The catalog_key of this CreateTableDetails.
        :rtype: str
        """
        return self._catalog_key

    @catalog_key.setter
    def catalog_key(self, catalog_key):
        """
        Sets the catalog_key of this CreateTableDetails.
        The name of the catalog to which this table belongs.


        :param catalog_key: The catalog_key of this CreateTableDetails.
        :type: str
        """
        self._catalog_key = catalog_key

    @property
    def schema_key(self):
        """
        **[Required]** Gets the schema_key of this CreateTableDetails.
        The name of the schema to which this table belongs.


        :return: The schema_key of this CreateTableDetails.
        :rtype: str
        """
        return self._schema_key

    @schema_key.setter
    def schema_key(self, schema_key):
        """
        Sets the schema_key of this CreateTableDetails.
        The name of the schema to which this table belongs.


        :param schema_key: The schema_key of this CreateTableDetails.
        :type: str
        """
        self._schema_key = schema_key

    @property
    def description(self):
        """
        Gets the description of this CreateTableDetails.
        Table description.


        :return: The description of this CreateTableDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this CreateTableDetails.
        Table description.


        :param description: The description of this CreateTableDetails.
        :type: str
        """
        self._description = description

    @property
    def table_type(self):
        """
        **[Required]** Gets the table_type of this CreateTableDetails.
        Type of table. Managed, external or mount table.

        Allowed values for this property are: "MANAGED", "EXTERNAL"


        :return: The table_type of this CreateTableDetails.
        :rtype: str
        """
        return self._table_type

    @table_type.setter
    def table_type(self, table_type):
        """
        Sets the table_type of this CreateTableDetails.
        Type of table. Managed, external or mount table.


        :param table_type: The table_type of this CreateTableDetails.
        :type: str
        """
        allowed_values = ["MANAGED", "EXTERNAL"]
        if not value_allowed_none_or_none_sentinel(table_type, allowed_values):
            raise ValueError(
                "Invalid value for `table_type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._table_type = table_type

    @property
    def managed_table_definition(self):
        """
        Gets the managed_table_definition of this CreateTableDetails.

        :return: The managed_table_definition of this CreateTableDetails.
        :rtype: oci.aidataplatform_dp.models.ManagedTableDefinition
        """
        return self._managed_table_definition

    @managed_table_definition.setter
    def managed_table_definition(self, managed_table_definition):
        """
        Sets the managed_table_definition of this CreateTableDetails.

        :param managed_table_definition: The managed_table_definition of this CreateTableDetails.
        :type: oci.aidataplatform_dp.models.ManagedTableDefinition
        """
        self._managed_table_definition = managed_table_definition

    @property
    def external_table_definition(self):
        """
        Gets the external_table_definition of this CreateTableDetails.

        :return: The external_table_definition of this CreateTableDetails.
        :rtype: oci.aidataplatform_dp.models.ExternalTableDefinition
        """
        return self._external_table_definition

    @external_table_definition.setter
    def external_table_definition(self, external_table_definition):
        """
        Sets the external_table_definition of this CreateTableDetails.

        :param external_table_definition: The external_table_definition of this CreateTableDetails.
        :type: oci.aidataplatform_dp.models.ExternalTableDefinition
        """
        self._external_table_definition = external_table_definition

    @property
    def table_fields(self):
        """
        Gets the table_fields of this CreateTableDetails.
        Columns for table.


        :return: The table_fields of this CreateTableDetails.
        :rtype: list[oci.aidataplatform_dp.models.TableFieldDetails]
        """
        return self._table_fields

    @table_fields.setter
    def table_fields(self, table_fields):
        """
        Sets the table_fields of this CreateTableDetails.
        Columns for table.


        :param table_fields: The table_fields of this CreateTableDetails.
        :type: list[oci.aidataplatform_dp.models.TableFieldDetails]
        """
        self._table_fields = table_fields

    @property
    def partition_keys(self):
        """
        Gets the partition_keys of this CreateTableDetails.
        Columns to be used in partition for table.


        :return: The partition_keys of this CreateTableDetails.
        :rtype: list[oci.aidataplatform_dp.models.TableFieldDetails]
        """
        return self._partition_keys

    @partition_keys.setter
    def partition_keys(self, partition_keys):
        """
        Sets the partition_keys of this CreateTableDetails.
        Columns to be used in partition for table.


        :param partition_keys: The partition_keys of this CreateTableDetails.
        :type: list[oci.aidataplatform_dp.models.TableFieldDetails]
        """
        self._partition_keys = partition_keys

    @property
    def table_properties(self):
        """
        Gets the table_properties of this CreateTableDetails.
        Table properties.


        :return: The table_properties of this CreateTableDetails.
        :rtype: list[oci.aidataplatform_dp.models.TableProperty]
        """
        return self._table_properties

    @table_properties.setter
    def table_properties(self, table_properties):
        """
        Sets the table_properties of this CreateTableDetails.
        Table properties.


        :param table_properties: The table_properties of this CreateTableDetails.
        :type: list[oci.aidataplatform_dp.models.TableProperty]
        """
        self._table_properties = table_properties

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
