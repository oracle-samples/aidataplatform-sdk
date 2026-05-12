# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ManagedTableDefinition(object):
    """
    The details about the new managed table.
    """

    #: A constant which can be used with the managed_table_data_format property of a ManagedTableDefinition.
    #: This constant has a value of "AVRO"
    MANAGED_TABLE_DATA_FORMAT_AVRO = "AVRO"

    #: A constant which can be used with the managed_table_data_format property of a ManagedTableDefinition.
    #: This constant has a value of "ORC"
    MANAGED_TABLE_DATA_FORMAT_ORC = "ORC"

    #: A constant which can be used with the managed_table_data_format property of a ManagedTableDefinition.
    #: This constant has a value of "PARQUET"
    MANAGED_TABLE_DATA_FORMAT_PARQUET = "PARQUET"

    #: A constant which can be used with the managed_table_data_format property of a ManagedTableDefinition.
    #: This constant has a value of "TEXTFILE"
    MANAGED_TABLE_DATA_FORMAT_TEXTFILE = "TEXTFILE"

    #: A constant which can be used with the managed_table_data_format property of a ManagedTableDefinition.
    #: This constant has a value of "JSON"
    MANAGED_TABLE_DATA_FORMAT_JSON = "JSON"

    #: A constant which can be used with the managed_table_data_format property of a ManagedTableDefinition.
    #: This constant has a value of "CSV"
    MANAGED_TABLE_DATA_FORMAT_CSV = "CSV"

    #: A constant which can be used with the managed_table_data_format property of a ManagedTableDefinition.
    #: This constant has a value of "DELTA"
    MANAGED_TABLE_DATA_FORMAT_DELTA = "DELTA"

    #: A constant which can be used with the managed_table_data_format property of a ManagedTableDefinition.
    #: This constant has a value of "ICEBERG"
    MANAGED_TABLE_DATA_FORMAT_ICEBERG = "ICEBERG"

    def __init__(self, **kwargs):
        """
        Initializes a new ManagedTableDefinition object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param managed_table_data_format:
            The value to assign to the managed_table_data_format property of this ManagedTableDefinition.
            Allowed values for this property are: "AVRO", "ORC", "PARQUET", "TEXTFILE", "JSON", "CSV", "DELTA", "ICEBERG", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type managed_table_data_format: str

        """
        self.swagger_types = {
            'managed_table_data_format': 'str'
        }

        self.attribute_map = {
            'managed_table_data_format': 'managedTableDataFormat'
        }

        self._managed_table_data_format = None

    @property
    def managed_table_data_format(self):
        """
        **[Required]** Gets the managed_table_data_format of this ManagedTableDefinition.
        Data format of the managed table.

        Allowed values for this property are: "AVRO", "ORC", "PARQUET", "TEXTFILE", "JSON", "CSV", "DELTA", "ICEBERG", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The managed_table_data_format of this ManagedTableDefinition.
        :rtype: str
        """
        return self._managed_table_data_format

    @managed_table_data_format.setter
    def managed_table_data_format(self, managed_table_data_format):
        """
        Sets the managed_table_data_format of this ManagedTableDefinition.
        Data format of the managed table.


        :param managed_table_data_format: The managed_table_data_format of this ManagedTableDefinition.
        :type: str
        """
        allowed_values = ["AVRO", "ORC", "PARQUET", "TEXTFILE", "JSON", "CSV", "DELTA", "ICEBERG"]
        if not value_allowed_none_or_none_sentinel(managed_table_data_format, allowed_values):
            managed_table_data_format = 'UNKNOWN_ENUM_VALUE'
        self._managed_table_data_format = managed_table_data_format

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
