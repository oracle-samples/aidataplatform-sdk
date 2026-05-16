# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class SqlToolConfiguration(object):
    """
    Tool configurations are set by the agent developer when they create the tool. | The agent does not see those configurations and can NOT modify their values
    """

    def __init__(self, **kwargs):
        """
        Initializes a new SqlToolConfiguration object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param catalog_key:
            The value to assign to the catalog_key property of this SqlToolConfiguration.
        :type catalog_key: str

        :param schema_key:
            The value to assign to the schema_key property of this SqlToolConfiguration.
        :type schema_key: str

        :param query:
            The value to assign to the query property of this SqlToolConfiguration.
        :type query: str

        :param is_row_limit_enabled:
            The value to assign to the is_row_limit_enabled property of this SqlToolConfiguration.
        :type is_row_limit_enabled: bool

        :param max_rows:
            The value to assign to the max_rows property of this SqlToolConfiguration.
        :type max_rows: int

        """
        self.swagger_types = {
            'catalog_key': 'str',
            'schema_key': 'str',
            'query': 'str',
            'is_row_limit_enabled': 'bool',
            'max_rows': 'int'
        }

        self.attribute_map = {
            'catalog_key': 'catalogKey',
            'schema_key': 'schemaKey',
            'query': 'query',
            'is_row_limit_enabled': 'isRowLimitEnabled',
            'max_rows': 'maxRows'
        }

        self._catalog_key = None
        self._schema_key = None
        self._query = None
        self._is_row_limit_enabled = None
        self._max_rows = None

    @property
    def catalog_key(self):
        """
        Gets the catalog_key of this SqlToolConfiguration.
        The Catalog to use for SQL query execution


        :return: The catalog_key of this SqlToolConfiguration.
        :rtype: str
        """
        return self._catalog_key

    @catalog_key.setter
    def catalog_key(self, catalog_key):
        """
        Sets the catalog_key of this SqlToolConfiguration.
        The Catalog to use for SQL query execution


        :param catalog_key: The catalog_key of this SqlToolConfiguration.
        :type: str
        """
        self._catalog_key = catalog_key

    @property
    def schema_key(self):
        """
        Gets the schema_key of this SqlToolConfiguration.
        The Schema to use for SQL query execution


        :return: The schema_key of this SqlToolConfiguration.
        :rtype: str
        """
        return self._schema_key

    @schema_key.setter
    def schema_key(self, schema_key):
        """
        Sets the schema_key of this SqlToolConfiguration.
        The Schema to use for SQL query execution


        :param schema_key: The schema_key of this SqlToolConfiguration.
        :type: str
        """
        self._schema_key = schema_key

    @property
    def query(self):
        """
        Gets the query of this SqlToolConfiguration.
        The SQL query to execute


        :return: The query of this SqlToolConfiguration.
        :rtype: str
        """
        return self._query

    @query.setter
    def query(self, query):
        """
        Sets the query of this SqlToolConfiguration.
        The SQL query to execute


        :param query: The query of this SqlToolConfiguration.
        :type: str
        """
        self._query = query

    @property
    def is_row_limit_enabled(self):
        """
        Gets the is_row_limit_enabled of this SqlToolConfiguration.
        Whether to enforce the row limit when running the SQL tool


        :return: The is_row_limit_enabled of this SqlToolConfiguration.
        :rtype: bool
        """
        return self._is_row_limit_enabled

    @is_row_limit_enabled.setter
    def is_row_limit_enabled(self, is_row_limit_enabled):
        """
        Sets the is_row_limit_enabled of this SqlToolConfiguration.
        Whether to enforce the row limit when running the SQL tool


        :param is_row_limit_enabled: The is_row_limit_enabled of this SqlToolConfiguration.
        :type: bool
        """
        self._is_row_limit_enabled = is_row_limit_enabled

    @property
    def max_rows(self):
        """
        Gets the max_rows of this SqlToolConfiguration.
        Maximum number of result rows returned per SQL tool execution to prevent oversized result sets


        :return: The max_rows of this SqlToolConfiguration.
        :rtype: int
        """
        return self._max_rows

    @max_rows.setter
    def max_rows(self, max_rows):
        """
        Sets the max_rows of this SqlToolConfiguration.
        Maximum number of result rows returned per SQL tool execution to prevent oversized result sets


        :param max_rows: The max_rows of this SqlToolConfiguration.
        :type: int
        """
        self._max_rows = max_rows

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
