# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class SearchResult(object):
    """
    A single search result.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new SearchResult object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param data:
            The value to assign to the data property of this SearchResult.
        :type data: object

        """
        self.swagger_types = {
            'data': 'object'
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = None

    @property
    def data(self):
        """
        **[Required]** Gets the data of this SearchResult.
        The actual log data with field mappings.


        :return: The data of this SearchResult.
        :rtype: object
        """
        return self._data

    @data.setter
    def data(self, data):
        """
        Sets the data of this SearchResult.
        The actual log data with field mappings.


        :param data: The data of this SearchResult.
        :type: object
        """
        self._data = data

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
