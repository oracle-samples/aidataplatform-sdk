# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class PerformInferSchemaDetails(object):
    """
    Infer schema details.
    """

    #: A constant which can be used with the data_format property of a PerformInferSchemaDetails.
    #: This constant has a value of "AVRO"
    DATA_FORMAT_AVRO = "AVRO"

    #: A constant which can be used with the data_format property of a PerformInferSchemaDetails.
    #: This constant has a value of "ORC"
    DATA_FORMAT_ORC = "ORC"

    #: A constant which can be used with the data_format property of a PerformInferSchemaDetails.
    #: This constant has a value of "PARQUET"
    DATA_FORMAT_PARQUET = "PARQUET"

    #: A constant which can be used with the data_format property of a PerformInferSchemaDetails.
    #: This constant has a value of "TEXTFILE"
    DATA_FORMAT_TEXTFILE = "TEXTFILE"

    #: A constant which can be used with the data_format property of a PerformInferSchemaDetails.
    #: This constant has a value of "JSON"
    DATA_FORMAT_JSON = "JSON"

    #: A constant which can be used with the data_format property of a PerformInferSchemaDetails.
    #: This constant has a value of "CSV"
    DATA_FORMAT_CSV = "CSV"

    #: A constant which can be used with the data_format property of a PerformInferSchemaDetails.
    #: This constant has a value of "DELTA"
    DATA_FORMAT_DELTA = "DELTA"

    #: A constant which can be used with the data_format property of a PerformInferSchemaDetails.
    #: This constant has a value of "ICEBERG"
    DATA_FORMAT_ICEBERG = "ICEBERG"

    def __init__(self, **kwargs):
        """
        Initializes a new PerformInferSchemaDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param data_format:
            The value to assign to the data_format property of this PerformInferSchemaDetails.
            Allowed values for this property are: "AVRO", "ORC", "PARQUET", "TEXTFILE", "JSON", "CSV", "DELTA", "ICEBERG"
        :type data_format: str

        :param location:
            The value to assign to the location property of this PerformInferSchemaDetails.
        :type location: str

        :param number_of_partitions:
            The value to assign to the number_of_partitions property of this PerformInferSchemaDetails.
        :type number_of_partitions: int

        :param infer_schema_properties:
            The value to assign to the infer_schema_properties property of this PerformInferSchemaDetails.
        :type infer_schema_properties: list[oci.aidataplatform_dp.models.InferSchemaProperties]

        """
        self.swagger_types = {
            'data_format': 'str',
            'location': 'str',
            'number_of_partitions': 'int',
            'infer_schema_properties': 'list[InferSchemaProperties]'
        }

        self.attribute_map = {
            'data_format': 'dataFormat',
            'location': 'location',
            'number_of_partitions': 'numberOfPartitions',
            'infer_schema_properties': 'inferSchemaProperties'
        }

        self._data_format = None
        self._location = None
        self._number_of_partitions = None
        self._infer_schema_properties = None

    @property
    def data_format(self):
        """
        **[Required]** Gets the data_format of this PerformInferSchemaDetails.
        Data format of the schema location.

        Allowed values for this property are: "AVRO", "ORC", "PARQUET", "TEXTFILE", "JSON", "CSV", "DELTA", "ICEBERG"


        :return: The data_format of this PerformInferSchemaDetails.
        :rtype: str
        """
        return self._data_format

    @data_format.setter
    def data_format(self, data_format):
        """
        Sets the data_format of this PerformInferSchemaDetails.
        Data format of the schema location.


        :param data_format: The data_format of this PerformInferSchemaDetails.
        :type: str
        """
        allowed_values = ["AVRO", "ORC", "PARQUET", "TEXTFILE", "JSON", "CSV", "DELTA", "ICEBERG"]
        if not value_allowed_none_or_none_sentinel(data_format, allowed_values):
            raise ValueError(
                "Invalid value for `data_format`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._data_format = data_format

    @property
    def location(self):
        """
        **[Required]** Gets the location of this PerformInferSchemaDetails.
        Location of the table to infer schema.


        :return: The location of this PerformInferSchemaDetails.
        :rtype: str
        """
        return self._location

    @location.setter
    def location(self, location):
        """
        Sets the location of this PerformInferSchemaDetails.
        Location of the table to infer schema.


        :param location: The location of this PerformInferSchemaDetails.
        :type: str
        """
        self._location = location

    @property
    def number_of_partitions(self):
        """
        Gets the number_of_partitions of this PerformInferSchemaDetails.
        Number of root partition folders to scan.


        :return: The number_of_partitions of this PerformInferSchemaDetails.
        :rtype: int
        """
        return self._number_of_partitions

    @number_of_partitions.setter
    def number_of_partitions(self, number_of_partitions):
        """
        Sets the number_of_partitions of this PerformInferSchemaDetails.
        Number of root partition folders to scan.


        :param number_of_partitions: The number_of_partitions of this PerformInferSchemaDetails.
        :type: int
        """
        self._number_of_partitions = number_of_partitions

    @property
    def infer_schema_properties(self):
        """
        Gets the infer_schema_properties of this PerformInferSchemaDetails.
        Properties which are needed for inferring schema.


        :return: The infer_schema_properties of this PerformInferSchemaDetails.
        :rtype: list[oci.aidataplatform_dp.models.InferSchemaProperties]
        """
        return self._infer_schema_properties

    @infer_schema_properties.setter
    def infer_schema_properties(self, infer_schema_properties):
        """
        Sets the infer_schema_properties of this PerformInferSchemaDetails.
        Properties which are needed for inferring schema.


        :param infer_schema_properties: The infer_schema_properties of this PerformInferSchemaDetails.
        :type: list[oci.aidataplatform_dp.models.InferSchemaProperties]
        """
        self._infer_schema_properties = infer_schema_properties

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
