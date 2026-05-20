# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ExportContentsDetails(object):
    """
    Payload required to export contents of a file.
    """

    #: A constant which can be used with the format property of a ExportContentsDetails.
    #: This constant has a value of "ipynb"
    FORMAT_IPYNB = "ipynb"

    #: A constant which can be used with the format property of a ExportContentsDetails.
    #: This constant has a value of "html"
    FORMAT_HTML = "html"

    def __init__(self, **kwargs):
        """
        Initializes a new ExportContentsDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param format:
            The value to assign to the format property of this ExportContentsDetails.
            Allowed values for this property are: "ipynb", "html"
        :type format: str

        """
        self.swagger_types = {
            'format': 'str'
        }

        self.attribute_map = {
            'format': 'format'
        }

        self._format = None

    @property
    def format(self):
        """
        Gets the format of this ExportContentsDetails.
        The format in which contents should be exported, supported formats are HTML and ipynb only.

        Allowed values for this property are: "ipynb", "html"


        :return: The format of this ExportContentsDetails.
        :rtype: str
        """
        return self._format

    @format.setter
    def format(self, format):
        """
        Sets the format of this ExportContentsDetails.
        The format in which contents should be exported, supported formats are HTML and ipynb only.


        :param format: The format of this ExportContentsDetails.
        :type: str
        """
        allowed_values = ["ipynb", "html"]
        if not value_allowed_none_or_none_sentinel(format, allowed_values):
            raise ValueError(
                "Invalid value for `format`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._format = format

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
