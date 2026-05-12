# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ExternalTableDefinition(object):
    """
    The details about the new external table.
    """

    #: A constant which can be used with the external_table_location_type property of a ExternalTableDefinition.
    #: This constant has a value of "OBJECT_STORAGE"
    EXTERNAL_TABLE_LOCATION_TYPE_OBJECT_STORAGE = "OBJECT_STORAGE"

    #: A constant which can be used with the external_table_location_type property of a ExternalTableDefinition.
    #: This constant has a value of "MOUNT"
    EXTERNAL_TABLE_LOCATION_TYPE_MOUNT = "MOUNT"

    #: A constant which can be used with the external_table_data_format property of a ExternalTableDefinition.
    #: This constant has a value of "AVRO"
    EXTERNAL_TABLE_DATA_FORMAT_AVRO = "AVRO"

    #: A constant which can be used with the external_table_data_format property of a ExternalTableDefinition.
    #: This constant has a value of "ORC"
    EXTERNAL_TABLE_DATA_FORMAT_ORC = "ORC"

    #: A constant which can be used with the external_table_data_format property of a ExternalTableDefinition.
    #: This constant has a value of "PARQUET"
    EXTERNAL_TABLE_DATA_FORMAT_PARQUET = "PARQUET"

    #: A constant which can be used with the external_table_data_format property of a ExternalTableDefinition.
    #: This constant has a value of "TEXTFILE"
    EXTERNAL_TABLE_DATA_FORMAT_TEXTFILE = "TEXTFILE"

    #: A constant which can be used with the external_table_data_format property of a ExternalTableDefinition.
    #: This constant has a value of "JSON"
    EXTERNAL_TABLE_DATA_FORMAT_JSON = "JSON"

    #: A constant which can be used with the external_table_data_format property of a ExternalTableDefinition.
    #: This constant has a value of "CSV"
    EXTERNAL_TABLE_DATA_FORMAT_CSV = "CSV"

    #: A constant which can be used with the external_table_data_format property of a ExternalTableDefinition.
    #: This constant has a value of "DELTA"
    EXTERNAL_TABLE_DATA_FORMAT_DELTA = "DELTA"

    #: A constant which can be used with the external_table_data_format property of a ExternalTableDefinition.
    #: This constant has a value of "ICEBERG"
    EXTERNAL_TABLE_DATA_FORMAT_ICEBERG = "ICEBERG"

    def __init__(self, **kwargs):
        """
        Initializes a new ExternalTableDefinition object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param external_table_location_type:
            The value to assign to the external_table_location_type property of this ExternalTableDefinition.
            Allowed values for this property are: "OBJECT_STORAGE", "MOUNT", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type external_table_location_type: str

        :param object_storage_location_path:
            The value to assign to the object_storage_location_path property of this ExternalTableDefinition.
        :type object_storage_location_path: str

        :param external_table_data_format:
            The value to assign to the external_table_data_format property of this ExternalTableDefinition.
            Allowed values for this property are: "AVRO", "ORC", "PARQUET", "TEXTFILE", "JSON", "CSV", "DELTA", "ICEBERG", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type external_table_data_format: str

        :param txt_file_definition:
            The value to assign to the txt_file_definition property of this ExternalTableDefinition.
        :type txt_file_definition: oci.aidataplatform_dp.models.TxtFileDefinition

        """
        self.swagger_types = {
            'external_table_location_type': 'str',
            'object_storage_location_path': 'str',
            'external_table_data_format': 'str',
            'txt_file_definition': 'TxtFileDefinition'
        }

        self.attribute_map = {
            'external_table_location_type': 'externalTableLocationType',
            'object_storage_location_path': 'objectStorageLocationPath',
            'external_table_data_format': 'externalTableDataFormat',
            'txt_file_definition': 'txtFileDefinition'
        }

        self._external_table_location_type = None
        self._object_storage_location_path = None
        self._external_table_data_format = None
        self._txt_file_definition = None

    @property
    def external_table_location_type(self):
        """
        Gets the external_table_location_type of this ExternalTableDefinition.
        External table location type, either object store location or mount location.

        Allowed values for this property are: "OBJECT_STORAGE", "MOUNT", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The external_table_location_type of this ExternalTableDefinition.
        :rtype: str
        """
        return self._external_table_location_type

    @external_table_location_type.setter
    def external_table_location_type(self, external_table_location_type):
        """
        Sets the external_table_location_type of this ExternalTableDefinition.
        External table location type, either object store location or mount location.


        :param external_table_location_type: The external_table_location_type of this ExternalTableDefinition.
        :type: str
        """
        allowed_values = ["OBJECT_STORAGE", "MOUNT"]
        if not value_allowed_none_or_none_sentinel(external_table_location_type, allowed_values):
            external_table_location_type = 'UNKNOWN_ENUM_VALUE'
        self._external_table_location_type = external_table_location_type

    @property
    def object_storage_location_path(self):
        """
        Gets the object_storage_location_path of this ExternalTableDefinition.
        The file location from which table properties are loaded.


        :return: The object_storage_location_path of this ExternalTableDefinition.
        :rtype: str
        """
        return self._object_storage_location_path

    @object_storage_location_path.setter
    def object_storage_location_path(self, object_storage_location_path):
        """
        Sets the object_storage_location_path of this ExternalTableDefinition.
        The file location from which table properties are loaded.


        :param object_storage_location_path: The object_storage_location_path of this ExternalTableDefinition.
        :type: str
        """
        self._object_storage_location_path = object_storage_location_path

    @property
    def external_table_data_format(self):
        """
        **[Required]** Gets the external_table_data_format of this ExternalTableDefinition.
        External table data format.

        Allowed values for this property are: "AVRO", "ORC", "PARQUET", "TEXTFILE", "JSON", "CSV", "DELTA", "ICEBERG", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The external_table_data_format of this ExternalTableDefinition.
        :rtype: str
        """
        return self._external_table_data_format

    @external_table_data_format.setter
    def external_table_data_format(self, external_table_data_format):
        """
        Sets the external_table_data_format of this ExternalTableDefinition.
        External table data format.


        :param external_table_data_format: The external_table_data_format of this ExternalTableDefinition.
        :type: str
        """
        allowed_values = ["AVRO", "ORC", "PARQUET", "TEXTFILE", "JSON", "CSV", "DELTA", "ICEBERG"]
        if not value_allowed_none_or_none_sentinel(external_table_data_format, allowed_values):
            external_table_data_format = 'UNKNOWN_ENUM_VALUE'
        self._external_table_data_format = external_table_data_format

    @property
    def txt_file_definition(self):
        """
        Gets the txt_file_definition of this ExternalTableDefinition.

        :return: The txt_file_definition of this ExternalTableDefinition.
        :rtype: oci.aidataplatform_dp.models.TxtFileDefinition
        """
        return self._txt_file_definition

    @txt_file_definition.setter
    def txt_file_definition(self, txt_file_definition):
        """
        Sets the txt_file_definition of this ExternalTableDefinition.

        :param txt_file_definition: The txt_file_definition of this ExternalTableDefinition.
        :type: oci.aidataplatform_dp.models.TxtFileDefinition
        """
        self._txt_file_definition = txt_file_definition

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
