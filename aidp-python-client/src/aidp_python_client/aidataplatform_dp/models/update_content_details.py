# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdateContentDetails(object):
    """
    Content model provides a programmatic interface to interact with notebooks, files and directories within DataLake Notebook environment.
    Type field is used to describe content types like file, directory or notebook.
    Other notable fields are content and format. The content and format keys may be null if content is not contained.
    """

    #: A constant which can be used with the type property of a UpdateContentDetails.
    #: This constant has a value of "notebook"
    TYPE_NOTEBOOK = "notebook"

    #: A constant which can be used with the type property of a UpdateContentDetails.
    #: This constant has a value of "file"
    TYPE_FILE = "file"

    #: A constant which can be used with the type property of a UpdateContentDetails.
    #: This constant has a value of "directory"
    TYPE_DIRECTORY = "directory"

    #: A constant which can be used with the format property of a UpdateContentDetails.
    #: This constant has a value of "NULL"
    FORMAT_NULL = "NULL"

    #: A constant which can be used with the format property of a UpdateContentDetails.
    #: This constant has a value of "json"
    FORMAT_JSON = "json"

    #: A constant which can be used with the format property of a UpdateContentDetails.
    #: This constant has a value of "text"
    FORMAT_TEXT = "text"

    #: A constant which can be used with the format property of a UpdateContentDetails.
    #: This constant has a value of "base64"
    FORMAT_BASE64 = "base64"

    def __init__(self, **kwargs):
        """
        Initializes a new UpdateContentDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param name:
            The value to assign to the name property of this UpdateContentDetails.
        :type name: str

        :param path:
            The value to assign to the path property of this UpdateContentDetails.
        :type path: str

        :param type:
            The value to assign to the type property of this UpdateContentDetails.
            Allowed values for this property are: "notebook", "file", "directory"
        :type type: str

        :param content:
            The value to assign to the content property of this UpdateContentDetails.
        :type content: object

        :param format:
            The value to assign to the format property of this UpdateContentDetails.
            Allowed values for this property are: "NULL", "json", "text", "base64"
        :type format: str

        """
        self.swagger_types = {
            'name': 'str',
            'path': 'str',
            'type': 'str',
            'content': 'object',
            'format': 'str'
        }

        self.attribute_map = {
            'name': 'name',
            'path': 'path',
            'type': 'type',
            'content': 'content',
            'format': 'format'
        }

        self._name = None
        self._path = None
        self._type = None
        self._content = None
        self._format = None

    @property
    def name(self):
        """
        Gets the name of this UpdateContentDetails.
        Name of notebook, file or directory, equivalent to the last part of the path


        :return: The name of this UpdateContentDetails.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this UpdateContentDetails.
        Name of notebook, file or directory, equivalent to the last part of the path


        :param name: The name of this UpdateContentDetails.
        :type: str
        """
        self._name = name

    @property
    def path(self):
        """
        Gets the path of this UpdateContentDetails.
        Full path for notebook, file, or directory.


        :return: The path of this UpdateContentDetails.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path):
        """
        Sets the path of this UpdateContentDetails.
        Full path for notebook, file, or directory.


        :param path: The path of this UpdateContentDetails.
        :type: str
        """
        self._path = path

    @property
    def type(self):
        """
        Gets the type of this UpdateContentDetails.
        Type of Content model

        Allowed values for this property are: "notebook", "file", "directory"


        :return: The type of this UpdateContentDetails.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this UpdateContentDetails.
        Type of Content model


        :param type: The type of this UpdateContentDetails.
        :type: str
        """
        allowed_values = ["notebook", "file", "directory"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            raise ValueError(
                "Invalid value for `type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._type = type

    @property
    def content(self):
        """
        Gets the content of this UpdateContentDetails.
        Content if requested (otherwise null).
        For Notebook model, this contains a nbformat NotebookNode representing the .ipynb file represented by the model.
        For File model, content field is always of type unicode. For text-format file models, content simply contains the file\u2019s bytes after decoding as UTF-8.
        Non-text (base64) files are read as bytes, base64 encoded, and then decoded as UTF-8.
        For Directory model, content field contains a list of content-free models representing the entities in the directory.


        :return: The content of this UpdateContentDetails.
        :rtype: object
        """
        return self._content

    @content.setter
    def content(self, content):
        """
        Sets the content of this UpdateContentDetails.
        Content if requested (otherwise null).
        For Notebook model, this contains a nbformat NotebookNode representing the .ipynb file represented by the model.
        For File model, content field is always of type unicode. For text-format file models, content simply contains the file\u2019s bytes after decoding as UTF-8.
        Non-text (base64) files are read as bytes, base64 encoded, and then decoded as UTF-8.
        For Directory model, content field contains a list of content-free models representing the entities in the directory.


        :param content: The content of this UpdateContentDetails.
        :type: object
        """
        self._content = content

    @property
    def format(self):
        """
        Gets the format of this UpdateContentDetails.
        Format of content. For Notebook model, format field is always JSON. For File model, format field is either Text or Base64.
        For Directory model, format field is always JSON.

        Allowed values for this property are: "NULL", "json", "text", "base64"


        :return: The format of this UpdateContentDetails.
        :rtype: str
        """
        return self._format

    @format.setter
    def format(self, format):
        """
        Sets the format of this UpdateContentDetails.
        Format of content. For Notebook model, format field is always JSON. For File model, format field is either Text or Base64.
        For Directory model, format field is always JSON.


        :param format: The format of this UpdateContentDetails.
        :type: str
        """
        allowed_values = ["NULL", "json", "text", "base64"]
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
