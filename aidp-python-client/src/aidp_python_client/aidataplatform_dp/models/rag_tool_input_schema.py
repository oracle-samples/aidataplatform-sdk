# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class RagToolInputSchema(object):
    """
    The input schema definition of a RAG Tool
    """

    def __init__(self, **kwargs):
        """
        Initializes a new RagToolInputSchema object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param query:
            The value to assign to the query property of this RagToolInputSchema.
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
        Gets the query of this RagToolInputSchema.
        The user question to answer using relevant documents


        :return: The query of this RagToolInputSchema.
        :rtype: str
        """
        return self._query

    @query.setter
    def query(self, query):
        """
        Sets the query of this RagToolInputSchema.
        The user question to answer using relevant documents


        :param query: The query of this RagToolInputSchema.
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
