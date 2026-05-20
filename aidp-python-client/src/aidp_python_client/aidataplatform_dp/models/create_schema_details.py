# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateSchemaDetails(object):
    """
    The data to create a schema.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new CreateSchemaDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param display_name:
            The value to assign to the display_name property of this CreateSchemaDetails.
        :type display_name: str

        :param description:
            The value to assign to the description property of this CreateSchemaDetails.
        :type description: str

        :param properties:
            The value to assign to the properties property of this CreateSchemaDetails.
        :type properties: dict(str, str)

        :param catalog_name:
            The value to assign to the catalog_name property of this CreateSchemaDetails.
        :type catalog_name: str

        """
        self.swagger_types = {
            'display_name': 'str',
            'description': 'str',
            'properties': 'dict(str, str)',
            'catalog_name': 'str'
        }

        self.attribute_map = {
            'display_name': 'displayName',
            'description': 'description',
            'properties': 'properties',
            'catalog_name': 'catalogName'
        }

        self._display_name = None
        self._description = None
        self._properties = None
        self._catalog_name = None

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this CreateSchemaDetails.
        Schema name.


        :return: The display_name of this CreateSchemaDetails.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this CreateSchemaDetails.
        Schema name.


        :param display_name: The display_name of this CreateSchemaDetails.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this CreateSchemaDetails.
        Schema description.


        :return: The description of this CreateSchemaDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this CreateSchemaDetails.
        Schema description.


        :param description: The description of this CreateSchemaDetails.
        :type: str
        """
        self._description = description

    @property
    def properties(self):
        """
        Gets the properties of this CreateSchemaDetails.
        Key-value pair representing a defined tag key and value.


        :return: The properties of this CreateSchemaDetails.
        :rtype: dict(str, str)
        """
        return self._properties

    @properties.setter
    def properties(self, properties):
        """
        Sets the properties of this CreateSchemaDetails.
        Key-value pair representing a defined tag key and value.


        :param properties: The properties of this CreateSchemaDetails.
        :type: dict(str, str)
        """
        self._properties = properties

    @property
    def catalog_name(self):
        """
        **[Required]** Gets the catalog_name of this CreateSchemaDetails.
        The name of the catalog to which this schema belongs.


        :return: The catalog_name of this CreateSchemaDetails.
        :rtype: str
        """
        return self._catalog_name

    @catalog_name.setter
    def catalog_name(self, catalog_name):
        """
        Sets the catalog_name of this CreateSchemaDetails.
        The name of the catalog to which this schema belongs.


        :param catalog_name: The catalog_name of this CreateSchemaDetails.
        :type: str
        """
        self._catalog_name = catalog_name

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
