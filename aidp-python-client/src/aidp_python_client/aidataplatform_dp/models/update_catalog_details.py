# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdateCatalogDetails(object):
    """
    The details to update in a catalog.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new UpdateCatalogDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param display_name:
            The value to assign to the display_name property of this UpdateCatalogDetails.
        :type display_name: str

        :param description:
            The value to assign to the description property of this UpdateCatalogDetails.
        :type description: str

        :param connection_details:
            The value to assign to the connection_details property of this UpdateCatalogDetails.
        :type connection_details: oci.aidataplatform_dp.models.UpdateConnectionDetails

        :param properties:
            The value to assign to the properties property of this UpdateCatalogDetails.
        :type properties: dict(str, str)

        """
        self.swagger_types = {
            'display_name': 'str',
            'description': 'str',
            'connection_details': 'UpdateConnectionDetails',
            'properties': 'dict(str, str)'
        }

        self.attribute_map = {
            'display_name': 'displayName',
            'description': 'description',
            'connection_details': 'connectionDetails',
            'properties': 'properties'
        }

        self._display_name = None
        self._description = None
        self._connection_details = None
        self._properties = None

    @property
    def display_name(self):
        """
        Gets the display_name of this UpdateCatalogDetails.
        Catalog display name.


        :return: The display_name of this UpdateCatalogDetails.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this UpdateCatalogDetails.
        Catalog display name.


        :param display_name: The display_name of this UpdateCatalogDetails.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this UpdateCatalogDetails.
        Short description of the catalog.


        :return: The description of this UpdateCatalogDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this UpdateCatalogDetails.
        Short description of the catalog.


        :param description: The description of this UpdateCatalogDetails.
        :type: str
        """
        self._description = description

    @property
    def connection_details(self):
        """
        Gets the connection_details of this UpdateCatalogDetails.

        :return: The connection_details of this UpdateCatalogDetails.
        :rtype: oci.aidataplatform_dp.models.UpdateConnectionDetails
        """
        return self._connection_details

    @connection_details.setter
    def connection_details(self, connection_details):
        """
        Sets the connection_details of this UpdateCatalogDetails.

        :param connection_details: The connection_details of this UpdateCatalogDetails.
        :type: oci.aidataplatform_dp.models.UpdateConnectionDetails
        """
        self._connection_details = connection_details

    @property
    def properties(self):
        """
        Gets the properties of this UpdateCatalogDetails.
        Key-value pair used to provide catalog properties like the subCompartment OCID where the buckets need to reside.


        :return: The properties of this UpdateCatalogDetails.
        :rtype: dict(str, str)
        """
        return self._properties

    @properties.setter
    def properties(self, properties):
        """
        Sets the properties of this UpdateCatalogDetails.
        Key-value pair used to provide catalog properties like the subCompartment OCID where the buckets need to reside.


        :param properties: The properties of this UpdateCatalogDetails.
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
