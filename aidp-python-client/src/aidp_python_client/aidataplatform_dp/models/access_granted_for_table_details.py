# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AccessGrantedForTableDetails(object):
    """
    Lakeproxy Table resource details.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AccessGrantedForTableDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param catalog_name:
            The value to assign to the catalog_name property of this AccessGrantedForTableDetails.
        :type catalog_name: str

        :param database_name:
            The value to assign to the database_name property of this AccessGrantedForTableDetails.
        :type database_name: str

        :param table_name:
            The value to assign to the table_name property of this AccessGrantedForTableDetails.
        :type table_name: str

        """
        self.swagger_types = {
            'catalog_name': 'str',
            'database_name': 'str',
            'table_name': 'str'
        }
        self.attribute_map = {
            'catalog_name': 'catalogName',
            'database_name': 'databaseName',
            'table_name': 'tableName'
        }
        self._catalog_name = None
        self._database_name = None
        self._table_name = None

    @property
    def catalog_name(self):
        """
        **[Required]** Gets the catalog_name of this AccessGrantedForTableDetails.
        Lakeproxy catalogName.


        :return: The catalog_name of this AccessGrantedForTableDetails.
        :rtype: str
        """
        return self._catalog_name

    @catalog_name.setter
    def catalog_name(self, catalog_name):
        """
        Sets the catalog_name of this AccessGrantedForTableDetails.
        Lakeproxy catalogName.


        :param catalog_name: The catalog_name of this AccessGrantedForTableDetails.
        :type: str
        """
        self._catalog_name = catalog_name

    @property
    def database_name(self):
        """
        **[Required]** Gets the database_name of this AccessGrantedForTableDetails.
        Lakeproxy databaseName.


        :return: The database_name of this AccessGrantedForTableDetails.
        :rtype: str
        """
        return self._database_name

    @database_name.setter
    def database_name(self, database_name):
        """
        Sets the database_name of this AccessGrantedForTableDetails.
        Lakeproxy databaseName.


        :param database_name: The database_name of this AccessGrantedForTableDetails.
        :type: str
        """
        self._database_name = database_name

    @property
    def table_name(self):
        """
        **[Required]** Gets the table_name of this AccessGrantedForTableDetails.
        Lakeproxy tableName.


        :return: The table_name of this AccessGrantedForTableDetails.
        :rtype: str
        """
        return self._table_name

    @table_name.setter
    def table_name(self, table_name):
        """
        Sets the table_name of this AccessGrantedForTableDetails.
        Lakeproxy tableName.


        :param table_name: The table_name of this AccessGrantedForTableDetails.
        :type: str
        """
        self._table_name = table_name

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
