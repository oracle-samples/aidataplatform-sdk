# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class TxtFileDefinition(object):
    """
    Properties specific to a text file.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new TxtFileDefinition object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param delimiter:
            The value to assign to the delimiter property of this TxtFileDefinition.
        :type delimiter: str

        :param quote:
            The value to assign to the quote property of this TxtFileDefinition.
        :type quote: str

        """
        self.swagger_types = {
            'delimiter': 'str',
            'quote': 'str'
        }

        self.attribute_map = {
            'delimiter': 'delimiter',
            'quote': 'quote'
        }

        self._delimiter = None
        self._quote = None

    @property
    def delimiter(self):
        """
        Gets the delimiter of this TxtFileDefinition.
        Delimiter to be used with text file.


        :return: The delimiter of this TxtFileDefinition.
        :rtype: str
        """
        return self._delimiter

    @delimiter.setter
    def delimiter(self, delimiter):
        """
        Sets the delimiter of this TxtFileDefinition.
        Delimiter to be used with text file.


        :param delimiter: The delimiter of this TxtFileDefinition.
        :type: str
        """
        self._delimiter = delimiter

    @property
    def quote(self):
        """
        Gets the quote of this TxtFileDefinition.
        Type of quote to be used with text file.


        :return: The quote of this TxtFileDefinition.
        :rtype: str
        """
        return self._quote

    @quote.setter
    def quote(self, quote):
        """
        Sets the quote of this TxtFileDefinition.
        Type of quote to be used with text file.


        :param quote: The quote of this TxtFileDefinition.
        :type: str
        """
        self._quote = quote

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
