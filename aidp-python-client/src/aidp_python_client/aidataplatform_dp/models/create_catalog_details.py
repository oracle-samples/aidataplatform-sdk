# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateCatalogDetails(object):
    """
    The required details for creating catalog.
    """

    #: A constant which can be used with the catalog_type property of a CreateCatalogDetails.
    #: This constant has a value of "EXTERNAL"
    CATALOG_TYPE_EXTERNAL = "EXTERNAL"

    #: A constant which can be used with the catalog_type property of a CreateCatalogDetails.
    #: This constant has a value of "INTERNAL"
    CATALOG_TYPE_INTERNAL = "INTERNAL"

    #: A constant which can be used with the source_type property of a CreateCatalogDetails.
    #: This constant has a value of "ADW"
    SOURCE_TYPE_ADW = "ADW"

    #: A constant which can be used with the source_type property of a CreateCatalogDetails.
    #: This constant has a value of "ALH"
    SOURCE_TYPE_ALH = "ALH"

    #: A constant which can be used with the source_type property of a CreateCatalogDetails.
    #: This constant has a value of "KAFKA"
    SOURCE_TYPE_KAFKA = "KAFKA"

    #: A constant which can be used with the source_type property of a CreateCatalogDetails.
    #: This constant has a value of "ATP"
    SOURCE_TYPE_ATP = "ATP"

    #: A constant which can be used with the source_type property of a CreateCatalogDetails.
    #: This constant has a value of "ORACLE"
    SOURCE_TYPE_ORACLE = "ORACLE"

    #: A constant which can be used with the source_type property of a CreateCatalogDetails.
    #: This constant has a value of "EXADATA"
    SOURCE_TYPE_EXADATA = "EXADATA"

    #: A constant which can be used with the source_type property of a CreateCatalogDetails.
    #: This constant has a value of "MYSQL"
    SOURCE_TYPE_MYSQL = "MYSQL"

    #: A constant which can be used with the source_type property of a CreateCatalogDetails.
    #: This constant has a value of "AZURE_SQLSERVER"
    SOURCE_TYPE_AZURE_SQLSERVER = "AZURE_SQLSERVER"

    #: A constant which can be used with the source_type property of a CreateCatalogDetails.
    #: This constant has a value of "SNOWFLAKE"
    SOURCE_TYPE_SNOWFLAKE = "SNOWFLAKE"

    #: A constant which can be used with the source_type property of a CreateCatalogDetails.
    #: This constant has a value of "GOOGLE_BIGQUERY"
    SOURCE_TYPE_GOOGLE_BIGQUERY = "GOOGLE_BIGQUERY"

    #: A constant which can be used with the source_type property of a CreateCatalogDetails.
    #: This constant has a value of "ORACLE_ANALYTICS"
    SOURCE_TYPE_ORACLE_ANALYTICS = "ORACLE_ANALYTICS"

    def __init__(self, **kwargs):
        """
        Initializes a new CreateCatalogDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param display_name:
            The value to assign to the display_name property of this CreateCatalogDetails.
        :type display_name: str

        :param description:
            The value to assign to the description property of this CreateCatalogDetails.
        :type description: str

        :param catalog_type:
            The value to assign to the catalog_type property of this CreateCatalogDetails.
            Allowed values for this property are: "EXTERNAL", "INTERNAL"
        :type catalog_type: str

        :param source_type:
            The value to assign to the source_type property of this CreateCatalogDetails.
            Allowed values for this property are: "ADW", "ALH", "KAFKA", "ATP", "ORACLE", "EXADATA", "MYSQL", "AZURE_SQLSERVER", "SNOWFLAKE", "GOOGLE_BIGQUERY", "ORACLE_ANALYTICS"
        :type source_type: str

        :param properties:
            The value to assign to the properties property of this CreateCatalogDetails.
        :type properties: dict(str, str)

        :param connection_details:
            The value to assign to the connection_details property of this CreateCatalogDetails.
        :type connection_details: oci.aidataplatform_dp.models.CreateConnectionDetails

        """
        self.swagger_types = {
            'display_name': 'str',
            'description': 'str',
            'catalog_type': 'str',
            'source_type': 'str',
            'properties': 'dict(str, str)',
            'connection_details': 'CreateConnectionDetails'
        }

        self.attribute_map = {
            'display_name': 'displayName',
            'description': 'description',
            'catalog_type': 'catalogType',
            'source_type': 'sourceType',
            'properties': 'properties',
            'connection_details': 'connectionDetails'
        }

        self._display_name = None
        self._description = None
        self._catalog_type = None
        self._source_type = None
        self._properties = None
        self._connection_details = None

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this CreateCatalogDetails.
        Catalog display name.


        :return: The display_name of this CreateCatalogDetails.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this CreateCatalogDetails.
        Catalog display name.


        :param display_name: The display_name of this CreateCatalogDetails.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this CreateCatalogDetails.
        Short description of the catalog.


        :return: The description of this CreateCatalogDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this CreateCatalogDetails.
        Short description of the catalog.


        :param description: The description of this CreateCatalogDetails.
        :type: str
        """
        self._description = description

    @property
    def catalog_type(self):
        """
        Gets the catalog_type of this CreateCatalogDetails.
        Type of catalog.

        Allowed values for this property are: "EXTERNAL", "INTERNAL"


        :return: The catalog_type of this CreateCatalogDetails.
        :rtype: str
        """
        return self._catalog_type

    @catalog_type.setter
    def catalog_type(self, catalog_type):
        """
        Sets the catalog_type of this CreateCatalogDetails.
        Type of catalog.


        :param catalog_type: The catalog_type of this CreateCatalogDetails.
        :type: str
        """
        allowed_values = ["EXTERNAL", "INTERNAL"]
        if not value_allowed_none_or_none_sentinel(catalog_type, allowed_values):
            raise ValueError(
                "Invalid value for `catalog_type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._catalog_type = catalog_type

    @property
    def source_type(self):
        """
        Gets the source_type of this CreateCatalogDetails.
        External catalog source type.

        Allowed values for this property are: "ADW", "ALH", "KAFKA", "ATP", "ORACLE", "EXADATA", "MYSQL", "AZURE_SQLSERVER", "SNOWFLAKE", "GOOGLE_BIGQUERY", "ORACLE_ANALYTICS"


        :return: The source_type of this CreateCatalogDetails.
        :rtype: str
        """
        return self._source_type

    @source_type.setter
    def source_type(self, source_type):
        """
        Sets the source_type of this CreateCatalogDetails.
        External catalog source type.


        :param source_type: The source_type of this CreateCatalogDetails.
        :type: str
        """
        allowed_values = ["ADW", "ALH", "KAFKA", "ATP", "ORACLE", "EXADATA", "MYSQL", "AZURE_SQLSERVER", "SNOWFLAKE", "GOOGLE_BIGQUERY", "ORACLE_ANALYTICS"]
        if not value_allowed_none_or_none_sentinel(source_type, allowed_values):
            raise ValueError(
                "Invalid value for `source_type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._source_type = source_type

    @property
    def properties(self):
        """
        Gets the properties of this CreateCatalogDetails.
        Key-value pair used to provide catalog properties like the subCompartment OCID where the buckets need to reside.


        :return: The properties of this CreateCatalogDetails.
        :rtype: dict(str, str)
        """
        return self._properties

    @properties.setter
    def properties(self, properties):
        """
        Sets the properties of this CreateCatalogDetails.
        Key-value pair used to provide catalog properties like the subCompartment OCID where the buckets need to reside.


        :param properties: The properties of this CreateCatalogDetails.
        :type: dict(str, str)
        """
        self._properties = properties

    @property
    def connection_details(self):
        """
        Gets the connection_details of this CreateCatalogDetails.

        :return: The connection_details of this CreateCatalogDetails.
        :rtype: oci.aidataplatform_dp.models.CreateConnectionDetails
        """
        return self._connection_details

    @connection_details.setter
    def connection_details(self, connection_details):
        """
        Sets the connection_details of this CreateCatalogDetails.

        :param connection_details: The connection_details of this CreateCatalogDetails.
        :type: oci.aidataplatform_dp.models.CreateConnectionDetails
        """
        self._connection_details = connection_details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
