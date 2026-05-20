# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class NlToSqlToolInputSchema(object):
    """
    The input schema definition of a NL to SQL Tool
    """

    def __init__(self, **kwargs):
        """
        Initializes a new NlToSqlToolInputSchema object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param query:
            The value to assign to the query property of this NlToSqlToolInputSchema.
        :type query: str

        """
        self.swagger_types = {
            'query': 'str'
        }

        self.attribute_map = {
            'query': 'query'
        }

        self._query = None

    @property
    def query(self):
        """
        **[Required]** Gets the query of this NlToSqlToolInputSchema.
        The user question to answer using relevant documents


        :return: The query of this NlToSqlToolInputSchema.
        :rtype: str
        """
        return self._query

    @query.setter
    def query(self, query):
        """
        Sets the query of this NlToSqlToolInputSchema.
        The user question to answer using relevant documents


        :param query: The query of this NlToSqlToolInputSchema.
        :type: str
        """
        self._query = query

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
