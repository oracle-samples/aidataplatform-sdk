# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ExportedTaskRunOutputContents(object):
    """
    This model represents a file with contents, format, and other details.
    """

    #: A constant which can be used with the format property of a ExportedTaskRunOutputContents.
    #: This constant has a value of "HTML"
    FORMAT_HTML = "HTML"

    #: A constant which can be used with the format property of a ExportedTaskRunOutputContents.
    #: This constant has a value of "IPYNB"
    FORMAT_IPYNB = "IPYNB"

    def __init__(self, **kwargs):
        """
        Initializes a new ExportedTaskRunOutputContents object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param name:
            The value to assign to the name property of this ExportedTaskRunOutputContents.
        :type name: str

        :param path:
            The value to assign to the path property of this ExportedTaskRunOutputContents.
        :type path: str

        :param content:
            The value to assign to the content property of this ExportedTaskRunOutputContents.
        :type content: object

        :param format:
            The value to assign to the format property of this ExportedTaskRunOutputContents.
            Allowed values for this property are: "HTML", "IPYNB", 'UNKNOWN_ENUM_VALUE'.
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
        **[Required]** Gets the name of this ExportedTaskRunOutputContents.
        Name of file, equivalent to the last part of the path.


        :return: The name of this ExportedTaskRunOutputContents.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this ExportedTaskRunOutputContents.
        Name of file, equivalent to the last part of the path.


        :param name: The name of this ExportedTaskRunOutputContents.
        :type: str
        """
        self._name = name

    @property
    def path(self):
        """
        **[Required]** Gets the path of this ExportedTaskRunOutputContents.
        Full path of the file.


        :return: The path of this ExportedTaskRunOutputContents.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path):
        """
        Sets the path of this ExportedTaskRunOutputContents.
        Full path of the file.


        :param path: The path of this ExportedTaskRunOutputContents.
        :type: str
        """
        self._path = path

    @property
    def content(self):
        """
        **[Required]** Gets the content of this ExportedTaskRunOutputContents.
        For ipynb format, this contains a string representing the .ipynb file.
        For HTML format, this contains a string representing the HTML page. It has base64-encoded data for images.


        :return: The content of this ExportedTaskRunOutputContents.
        :rtype: object
        """
        return self._content

    @content.setter
    def content(self, content):
        """
        Sets the content of this ExportedTaskRunOutputContents.
        For ipynb format, this contains a string representing the .ipynb file.
        For HTML format, this contains a string representing the HTML page. It has base64-encoded data for images.


        :param content: The content of this ExportedTaskRunOutputContents.
        :type: object
        """
        self._content = content

    @property
    def format(self):
        """
        **[Required]** Gets the format of this ExportedTaskRunOutputContents.
        Format of content as requested by the client. HTML format by default.

        Allowed values for this property are: "HTML", "IPYNB", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The format of this ExportedTaskRunOutputContents.
        :rtype: str
        """
        return self._format

    @format.setter
    def format(self, format):
        """
        Sets the format of this ExportedTaskRunOutputContents.
        Format of content as requested by the client. HTML format by default.


        :param format: The format of this ExportedTaskRunOutputContents.
        :type: str
        """
        allowed_values = ["HTML", "IPYNB"]
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
