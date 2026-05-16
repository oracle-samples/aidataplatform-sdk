# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class NlToSqlToolConfiguration(object):
    """
    Tool configurations are set by the agent developer when they create the tool. | The agent does not see those configurations and can NOT modify their values
    """

    def __init__(self, **kwargs):
        """
        Initializes a new NlToSqlToolConfiguration object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param catalog_key:
            The value to assign to the catalog_key property of this NlToSqlToolConfiguration.
        :type catalog_key: str

        :param schema_key:
            The value to assign to the schema_key property of this NlToSqlToolConfiguration.
        :type schema_key: str

        :param tables:
            The value to assign to the tables property of this NlToSqlToolConfiguration.
        :type tables: list[str]

        :param columns:
            The value to assign to the columns property of this NlToSqlToolConfiguration.
        :type columns: list[str]

        :param in_context_learning:
            The value to assign to the in_context_learning property of this NlToSqlToolConfiguration.
        :type in_context_learning: str

        :param additional_instructions:
            The value to assign to the additional_instructions property of this NlToSqlToolConfiguration.
        :type additional_instructions: str

        """
        self.swagger_types = {
            'catalog_key': 'str',
            'schema_key': 'str',
            'tables': 'list[str]',
            'columns': 'list[str]',
            'in_context_learning': 'str',
            'additional_instructions': 'str'
        }

        self.attribute_map = {
            'catalog_key': 'catalogKey',
            'schema_key': 'schemaKey',
            'tables': 'tables',
            'columns': 'columns',
            'in_context_learning': 'inContextLearning',
            'additional_instructions': 'additionalInstructions'
        }

        self._catalog_key = None
        self._schema_key = None
        self._tables = None
        self._columns = None
        self._in_context_learning = None
        self._additional_instructions = None

    @property
    def catalog_key(self):
        """
        **[Required]** Gets the catalog_key of this NlToSqlToolConfiguration.
        The Catalog to use for SQL query execution


        :return: The catalog_key of this NlToSqlToolConfiguration.
        :rtype: str
        """
        return self._catalog_key

    @catalog_key.setter
    def catalog_key(self, catalog_key):
        """
        Sets the catalog_key of this NlToSqlToolConfiguration.
        The Catalog to use for SQL query execution


        :param catalog_key: The catalog_key of this NlToSqlToolConfiguration.
        :type: str
        """
        self._catalog_key = catalog_key

    @property
    def schema_key(self):
        """
        **[Required]** Gets the schema_key of this NlToSqlToolConfiguration.
        The Schema to use for SQL query execution


        :return: The schema_key of this NlToSqlToolConfiguration.
        :rtype: str
        """
        return self._schema_key

    @schema_key.setter
    def schema_key(self, schema_key):
        """
        Sets the schema_key of this NlToSqlToolConfiguration.
        The Schema to use for SQL query execution


        :param schema_key: The schema_key of this NlToSqlToolConfiguration.
        :type: str
        """
        self._schema_key = schema_key

    @property
    def tables(self):
        """
        **[Required]** Gets the tables of this NlToSqlToolConfiguration.
        The fully qualified table names to use in SQL query generation


        :return: The tables of this NlToSqlToolConfiguration.
        :rtype: list[str]
        """
        return self._tables

    @tables.setter
    def tables(self, tables):
        """
        Sets the tables of this NlToSqlToolConfiguration.
        The fully qualified table names to use in SQL query generation


        :param tables: The tables of this NlToSqlToolConfiguration.
        :type: list[str]
        """
        self._tables = tables

    @property
    def columns(self):
        """
        **[Required]** Gets the columns of this NlToSqlToolConfiguration.
        The fully qualified column names to use in SQL query generation


        :return: The columns of this NlToSqlToolConfiguration.
        :rtype: list[str]
        """
        return self._columns

    @columns.setter
    def columns(self, columns):
        """
        Sets the columns of this NlToSqlToolConfiguration.
        The fully qualified column names to use in SQL query generation


        :param columns: The columns of this NlToSqlToolConfiguration.
        :type: list[str]
        """
        self._columns = columns

    @property
    def in_context_learning(self):
        """
        Gets the in_context_learning of this NlToSqlToolConfiguration.
        Optional few-shot examples (NL \u2192 SQL pairs) for better generation.


        :return: The in_context_learning of this NlToSqlToolConfiguration.
        :rtype: str
        """
        return self._in_context_learning

    @in_context_learning.setter
    def in_context_learning(self, in_context_learning):
        """
        Sets the in_context_learning of this NlToSqlToolConfiguration.
        Optional few-shot examples (NL \u2192 SQL pairs) for better generation.


        :param in_context_learning: The in_context_learning of this NlToSqlToolConfiguration.
        :type: str
        """
        self._in_context_learning = in_context_learning

    @property
    def additional_instructions(self):
        """
        Gets the additional_instructions of this NlToSqlToolConfiguration.
        Additional instructions that is injected in the system prompt


        :return: The additional_instructions of this NlToSqlToolConfiguration.
        :rtype: str
        """
        return self._additional_instructions

    @additional_instructions.setter
    def additional_instructions(self, additional_instructions):
        """
        Sets the additional_instructions of this NlToSqlToolConfiguration.
        Additional instructions that is injected in the system prompt


        :param additional_instructions: The additional_instructions of this NlToSqlToolConfiguration.
        :type: str
        """
        self._additional_instructions = additional_instructions

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
