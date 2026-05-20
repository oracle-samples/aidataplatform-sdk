# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CatalogTestConnectionDetails(object):
    """
    Information needed to test connection to an external catalog.
    """

    #: A constant which can be used with the source_type property of a CatalogTestConnectionDetails.
    #: This constant has a value of "ADW"
    SOURCE_TYPE_ADW = "ADW"

    #: A constant which can be used with the source_type property of a CatalogTestConnectionDetails.
    #: This constant has a value of "ALH"
    SOURCE_TYPE_ALH = "ALH"

    #: A constant which can be used with the source_type property of a CatalogTestConnectionDetails.
    #: This constant has a value of "KAFKA"
    SOURCE_TYPE_KAFKA = "KAFKA"

    #: A constant which can be used with the source_type property of a CatalogTestConnectionDetails.
    #: This constant has a value of "ATP"
    SOURCE_TYPE_ATP = "ATP"

    #: A constant which can be used with the source_type property of a CatalogTestConnectionDetails.
    #: This constant has a value of "ORACLE"
    SOURCE_TYPE_ORACLE = "ORACLE"

    #: A constant which can be used with the source_type property of a CatalogTestConnectionDetails.
    #: This constant has a value of "EXADATA"
    SOURCE_TYPE_EXADATA = "EXADATA"

    #: A constant which can be used with the source_type property of a CatalogTestConnectionDetails.
    #: This constant has a value of "ORACLE_ANALYTICS"
    SOURCE_TYPE_ORACLE_ANALYTICS = "ORACLE_ANALYTICS"

    def __init__(self, **kwargs):
        """
        Initializes a new CatalogTestConnectionDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this CatalogTestConnectionDetails.
        :type key: str

        :param source_type:
            The value to assign to the source_type property of this CatalogTestConnectionDetails.
            Allowed values for this property are: "ADW", "ALH", "KAFKA", "ATP", "ORACLE", "EXADATA", "ORACLE_ANALYTICS"
        :type source_type: str

        :param connection_details:
            The value to assign to the connection_details property of this CatalogTestConnectionDetails.
        :type connection_details: oci.aidataplatform_dp.models.CatalogConnectionDetails

        """
        self.swagger_types = {
            'key': 'str',
            'source_type': 'str',
            'connection_details': 'CatalogConnectionDetails'
        }

        self.attribute_map = {
            'key': 'key',
            'source_type': 'sourceType',
            'connection_details': 'connectionDetails'
        }

        self._key = None
        self._source_type = None
        self._connection_details = None

    @property
    def key(self):
        """
        Gets the key of this CatalogTestConnectionDetails.
        The AI Data Platform Workbench catalog key.


        :return: The key of this CatalogTestConnectionDetails.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this CatalogTestConnectionDetails.
        The AI Data Platform Workbench catalog key.


        :param key: The key of this CatalogTestConnectionDetails.
        :type: str
        """
        self._key = key

    @property
    def source_type(self):
        """
        Gets the source_type of this CatalogTestConnectionDetails.
        External catalog source type.

        Allowed values for this property are: "ADW", "ALH", "KAFKA", "ATP", "ORACLE", "EXADATA", "ORACLE_ANALYTICS"


        :return: The source_type of this CatalogTestConnectionDetails.
        :rtype: str
        """
        return self._source_type

    @source_type.setter
    def source_type(self, source_type):
        """
        Sets the source_type of this CatalogTestConnectionDetails.
        External catalog source type.


        :param source_type: The source_type of this CatalogTestConnectionDetails.
        :type: str
        """
        allowed_values = ["ADW", "ALH", "KAFKA", "ATP", "ORACLE", "EXADATA", "ORACLE_ANALYTICS"]
        if not value_allowed_none_or_none_sentinel(source_type, allowed_values):
            raise ValueError(
                "Invalid value for `source_type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._source_type = source_type

    @property
    def connection_details(self):
        """
        Gets the connection_details of this CatalogTestConnectionDetails.

        :return: The connection_details of this CatalogTestConnectionDetails.
        :rtype: oci.aidataplatform_dp.models.CatalogConnectionDetails
        """
        return self._connection_details

    @connection_details.setter
    def connection_details(self, connection_details):
        """
        Sets the connection_details of this CatalogTestConnectionDetails.

        :param connection_details: The connection_details of this CatalogTestConnectionDetails.
        :type: oci.aidataplatform_dp.models.CatalogConnectionDetails
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
