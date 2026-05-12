# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ExportedContents(object):
    """
    This model represents a file with contents, format and other details.
    """

    #: A constant which can be used with the format property of a ExportedContents.
    #: This constant has a value of "html"
    FORMAT_HTML = "html"

    #: A constant which can be used with the format property of a ExportedContents.
    #: This constant has a value of "ipynb"
    FORMAT_IPYNB = "ipynb"

    def __init__(self, **kwargs):
        """
        Initializes a new ExportedContents object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param name:
            The value to assign to the name property of this ExportedContents.
        :type name: str

        :param path:
            The value to assign to the path property of this ExportedContents.
        :type path: str

        :param content:
            The value to assign to the content property of this ExportedContents.
        :type content: object

        :param format:
            The value to assign to the format property of this ExportedContents.
            Allowed values for this property are: "html", "ipynb", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type format: str

        """
        self.swagger_types = {
            'name': 'str',
            'path': 'str',
            'content': 'object',
            'format': 'str'
        }

        self.attribute_map = {
            'name': 'name',
            'path': 'path',
            'content': 'content',
            'format': 'format'
        }

        self._name = None
        self._path = None
        self._content = None
        self._format = None

    @property
    def name(self):
        """
        **[Required]** Gets the name of this ExportedContents.
        Name of file, equivalent to the last part of the path.


        :return: The name of this ExportedContents.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this ExportedContents.
        Name of file, equivalent to the last part of the path.


        :param name: The name of this ExportedContents.
        :type: str
        """
        self._name = name

    @property
    def path(self):
        """
        **[Required]** Gets the path of this ExportedContents.
        Full path of the file.


        :return: The path of this ExportedContents.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path):
        """
        Sets the path of this ExportedContents.
        Full path of the file.


        :param path: The path of this ExportedContents.
        :type: str
        """
        self._path = path

    @property
    def content(self):
        """
        **[Required]** Gets the content of this ExportedContents.
        For ipynb format, this contains a string representing the .ipynb file.
        For html format, this contains a string representing the HTML page, it has base64 encoded data for images.


        :return: The content of this ExportedContents.
        :rtype: object
        """
        return self._content

    @content.setter
    def content(self, content):
        """
        Sets the content of this ExportedContents.
        For ipynb format, this contains a string representing the .ipynb file.
        For html format, this contains a string representing the HTML page, it has base64 encoded data for images.


        :param content: The content of this ExportedContents.
        :type: object
        """
        self._content = content

    @property
    def format(self):
        """
        **[Required]** Gets the format of this ExportedContents.
        Format of content as requested by the client. By default, ipynb format.

        Allowed values for this property are: "html", "ipynb", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The format of this ExportedContents.
        :rtype: str
        """
        return self._format

    @format.setter
    def format(self, format):
        """
        Sets the format of this ExportedContents.
        Format of content as requested by the client. By default, ipynb format.


        :param format: The format of this ExportedContents.
        :type: str
        """
        allowed_values = ["html", "ipynb"]
        if not value_allowed_none_or_none_sentinel(format, allowed_values):
            format = 'UNKNOWN_ENUM_VALUE'
        self._format = format

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
