# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateDataTableDetails(object):
    """
    The details to create a managed table with data.
    """

    #: A constant which can be used with the file_format property of a CreateDataTableDetails.
    #: This constant has a value of "AVRO"
    FILE_FORMAT_AVRO = "AVRO"

    #: A constant which can be used with the file_format property of a CreateDataTableDetails.
    #: This constant has a value of "ORC"
    FILE_FORMAT_ORC = "ORC"

    #: A constant which can be used with the file_format property of a CreateDataTableDetails.
    #: This constant has a value of "PARQUET"
    FILE_FORMAT_PARQUET = "PARQUET"

    #: A constant which can be used with the file_format property of a CreateDataTableDetails.
    #: This constant has a value of "TEXTFILE"
    FILE_FORMAT_TEXTFILE = "TEXTFILE"

    #: A constant which can be used with the file_format property of a CreateDataTableDetails.
    #: This constant has a value of "JSON"
    FILE_FORMAT_JSON = "JSON"

    #: A constant which can be used with the file_format property of a CreateDataTableDetails.
    #: This constant has a value of "CSV"
    FILE_FORMAT_CSV = "CSV"

    #: A constant which can be used with the file_format property of a CreateDataTableDetails.
    #: This constant has a value of "DELTA"
    FILE_FORMAT_DELTA = "DELTA"

    #: A constant which can be used with the file_format property of a CreateDataTableDetails.
    #: This constant has a value of "ICEBERG"
    FILE_FORMAT_ICEBERG = "ICEBERG"

    def __init__(self, **kwargs):
        """
        Initializes a new CreateDataTableDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param display_name:
            The value to assign to the display_name property of this CreateDataTableDetails.
        :type display_name: str

        :param description:
            The value to assign to the description property of this CreateDataTableDetails.
        :type description: str

        :param catalog_key:
            The value to assign to the catalog_key property of this CreateDataTableDetails.
        :type catalog_key: str

        :param schema_key:
            The value to assign to the schema_key property of this CreateDataTableDetails.
        :type schema_key: str

        :param table_fields:
            The value to assign to the table_fields property of this CreateDataTableDetails.
        :type table_fields: list[oci.aidataplatform_dp.models.TableFieldDetails]

        :param partition_keys:
            The value to assign to the partition_keys property of this CreateDataTableDetails.
        :type partition_keys: list[oci.aidataplatform_dp.models.TableFieldDetails]

        :param table_properties:
            The value to assign to the table_properties property of this CreateDataTableDetails.
        :type table_properties: list[oci.aidataplatform_dp.models.TableProperty]

        :param managed_table_definition:
            The value to assign to the managed_table_definition property of this CreateDataTableDetails.
        :type managed_table_definition: oci.aidataplatform_dp.models.ManagedTableDefinition

        :param selected_columns:
            The value to assign to the selected_columns property of this CreateDataTableDetails.
        :type selected_columns: list[str]

        :param file_format:
            The value to assign to the file_format property of this CreateDataTableDetails.
            Allowed values for this property are: "AVRO", "ORC", "PARQUET", "TEXTFILE", "JSON", "CSV", "DELTA", "ICEBERG"
        :type file_format: str

        :param object_storage_location_path:
            The value to assign to the object_storage_location_path property of this CreateDataTableDetails.
        :type object_storage_location_path: str

        """
        self.swagger_types = {
            'display_name': 'str',
            'description': 'str',
            'catalog_key': 'str',
            'schema_key': 'str',
            'table_fields': 'list[TableFieldDetails]',
            'partition_keys': 'list[TableFieldDetails]',
            'table_properties': 'list[TableProperty]',
            'managed_table_definition': 'ManagedTableDefinition',
            'selected_columns': 'list[str]',
            'file_format': 'str',
            'object_storage_location_path': 'str'
        }

        self.attribute_map = {
            'display_name': 'displayName',
            'description': 'description',
            'catalog_key': 'catalogKey',
            'schema_key': 'schemaKey',
            'table_fields': 'tableFields',
            'partition_keys': 'partitionKeys',
            'table_properties': 'tableProperties',
            'managed_table_definition': 'managedTableDefinition',
            'selected_columns': 'selectedColumns',
            'file_format': 'fileFormat',
            'object_storage_location_path': 'objectStorageLocationPath'
        }

        self._display_name = None
        self._description = None
        self._catalog_key = None
        self._schema_key = None
        self._table_fields = None
        self._partition_keys = None
        self._table_properties = None
        self._managed_table_definition = None
        self._selected_columns = None
        self._file_format = None
        self._object_storage_location_path = None

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this CreateDataTableDetails.
        Table name.


        :return: The display_name of this CreateDataTableDetails.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this CreateDataTableDetails.
        Table name.


        :param display_name: The display_name of this CreateDataTableDetails.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this CreateDataTableDetails.
        Table description.


        :return: The description of this CreateDataTableDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this CreateDataTableDetails.
        Table description.


        :param description: The description of this CreateDataTableDetails.
        :type: str
        """
        self._description = description

    @property
    def catalog_key(self):
        """
        **[Required]** Gets the catalog_key of this CreateDataTableDetails.
        The name of the catalog to which this table belongs.


        :return: The catalog_key of this CreateDataTableDetails.
        :rtype: str
        """
        return self._catalog_key

    @catalog_key.setter
    def catalog_key(self, catalog_key):
        """
        Sets the catalog_key of this CreateDataTableDetails.
        The name of the catalog to which this table belongs.


        :param catalog_key: The catalog_key of this CreateDataTableDetails.
        :type: str
        """
        self._catalog_key = catalog_key

    @property
    def schema_key(self):
        """
        **[Required]** Gets the schema_key of this CreateDataTableDetails.
        The name of the schema to which this table belongs.


        :return: The schema_key of this CreateDataTableDetails.
        :rtype: str
        """
        return self._schema_key

    @schema_key.setter
    def schema_key(self, schema_key):
        """
        Sets the schema_key of this CreateDataTableDetails.
        The name of the schema to which this table belongs.


        :param schema_key: The schema_key of this CreateDataTableDetails.
        :type: str
        """
        self._schema_key = schema_key

    @property
    def table_fields(self):
        """
        **[Required]** Gets the table_fields of this CreateDataTableDetails.
        Columns for table.


        :return: The table_fields of this CreateDataTableDetails.
        :rtype: list[oci.aidataplatform_dp.models.TableFieldDetails]
        """
        return self._table_fields

    @table_fields.setter
    def table_fields(self, table_fields):
        """
        Sets the table_fields of this CreateDataTableDetails.
        Columns for table.


        :param table_fields: The table_fields of this CreateDataTableDetails.
        :type: list[oci.aidataplatform_dp.models.TableFieldDetails]
        """
        self._table_fields = table_fields

    @property
    def partition_keys(self):
        """
        Gets the partition_keys of this CreateDataTableDetails.
        Columns to be used in partition for table.


        :return: The partition_keys of this CreateDataTableDetails.
        :rtype: list[oci.aidataplatform_dp.models.TableFieldDetails]
        """
        return self._partition_keys

    @partition_keys.setter
    def partition_keys(self, partition_keys):
        """
        Sets the partition_keys of this CreateDataTableDetails.
        Columns to be used in partition for table.


        :param partition_keys: The partition_keys of this CreateDataTableDetails.
        :type: list[oci.aidataplatform_dp.models.TableFieldDetails]
        """
        self._partition_keys = partition_keys

    @property
    def table_properties(self):
        """
        Gets the table_properties of this CreateDataTableDetails.
        Table properties.


        :return: The table_properties of this CreateDataTableDetails.
        :rtype: list[oci.aidataplatform_dp.models.TableProperty]
        """
        return self._table_properties

    @table_properties.setter
    def table_properties(self, table_properties):
        """
        Sets the table_properties of this CreateDataTableDetails.
        Table properties.


        :param table_properties: The table_properties of this CreateDataTableDetails.
        :type: list[oci.aidataplatform_dp.models.TableProperty]
        """
        self._table_properties = table_properties

    @property
    def managed_table_definition(self):
        """
        **[Required]** Gets the managed_table_definition of this CreateDataTableDetails.

        :return: The managed_table_definition of this CreateDataTableDetails.
        :rtype: oci.aidataplatform_dp.models.ManagedTableDefinition
        """
        return self._managed_table_definition

    @managed_table_definition.setter
    def managed_table_definition(self, managed_table_definition):
        """
        Sets the managed_table_definition of this CreateDataTableDetails.

        :param managed_table_definition: The managed_table_definition of this CreateDataTableDetails.
        :type: oci.aidataplatform_dp.models.ManagedTableDefinition
        """
        self._managed_table_definition = managed_table_definition

    @property
    def selected_columns(self):
        """
        **[Required]** Gets the selected_columns of this CreateDataTableDetails.
        The list of the columns from which data needs to be copied.


        :return: The selected_columns of this CreateDataTableDetails.
        :rtype: list[str]
        """
        return self._selected_columns

    @selected_columns.setter
    def selected_columns(self, selected_columns):
        """
        Sets the selected_columns of this CreateDataTableDetails.
        The list of the columns from which data needs to be copied.


        :param selected_columns: The selected_columns of this CreateDataTableDetails.
        :type: list[str]
        """
        self._selected_columns = selected_columns

    @property
    def file_format(self):
        """
        **[Required]** Gets the file_format of this CreateDataTableDetails.
        Format of the sample file from which data needs to be copied.

        Allowed values for this property are: "AVRO", "ORC", "PARQUET", "TEXTFILE", "JSON", "CSV", "DELTA", "ICEBERG"


        :return: The file_format of this CreateDataTableDetails.
        :rtype: str
        """
        return self._file_format

    @file_format.setter
    def file_format(self, file_format):
        """
        Sets the file_format of this CreateDataTableDetails.
        Format of the sample file from which data needs to be copied.


        :param file_format: The file_format of this CreateDataTableDetails.
        :type: str
        """
        allowed_values = ["AVRO", "ORC", "PARQUET", "TEXTFILE", "JSON", "CSV", "DELTA", "ICEBERG"]
        if not value_allowed_none_or_none_sentinel(file_format, allowed_values):
            raise ValueError(
                "Invalid value for `file_format`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._file_format = file_format

    @property
    def object_storage_location_path(self):
        """
        **[Required]** Gets the object_storage_location_path of this CreateDataTableDetails.
        The file location from which table details will be used.


        :return: The object_storage_location_path of this CreateDataTableDetails.
        :rtype: str
        """
        return self._object_storage_location_path

    @object_storage_location_path.setter
    def object_storage_location_path(self, object_storage_location_path):
        """
        Sets the object_storage_location_path of this CreateDataTableDetails.
        The file location from which table details will be used.


        :param object_storage_location_path: The object_storage_location_path of this CreateDataTableDetails.
        :type: str
        """
        self._object_storage_location_path = object_storage_location_path

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
