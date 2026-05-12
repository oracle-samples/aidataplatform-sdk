# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class Content(object):
    """
    Content model provides a programmatic interface to interact with notebooks, files and directories within the AI Data Platform Workbench Notebook environment.
    Type field is used to describe content types like file, directory or notebook.
    Other notable fields are content and format. The content and format keys may be null if content is not contained.
    """

    #: A constant which can be used with the type property of a Content.
    #: This constant has a value of "notebook"
    TYPE_NOTEBOOK = "notebook"

    #: A constant which can be used with the type property of a Content.
    #: This constant has a value of "file"
    TYPE_FILE = "file"

    #: A constant which can be used with the type property of a Content.
    #: This constant has a value of "directory"
    TYPE_DIRECTORY = "directory"

    #: A constant which can be used with the format property of a Content.
    #: This constant has a value of "NULL"
    FORMAT_NULL = "NULL"

    #: A constant which can be used with the format property of a Content.
    #: This constant has a value of "json"
    FORMAT_JSON = "json"

    #: A constant which can be used with the format property of a Content.
    #: This constant has a value of "text"
    FORMAT_TEXT = "text"

    #: A constant which can be used with the format property of a Content.
    #: This constant has a value of "base64"
    FORMAT_BASE64 = "base64"

    def __init__(self, **kwargs):
        """
        Initializes a new Content object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param name:
            The value to assign to the name property of this Content.
        :type name: str

        :param path:
            The value to assign to the path property of this Content.
        :type path: str

        :param type:
            The value to assign to the type property of this Content.
            Allowed values for this property are: "notebook", "file", "directory", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type type: str

        :param writable:
            The value to assign to the writable property of this Content.
        :type writable: bool

        :param created:
            The value to assign to the created property of this Content.
        :type created: datetime

        :param last_modified:
            The value to assign to the last_modified property of this Content.
        :type last_modified: datetime

        :param size:
            The value to assign to the size property of this Content.
        :type size: int

        :param mimetype:
            The value to assign to the mimetype property of this Content.
        :type mimetype: str

        :param content:
            The value to assign to the content property of this Content.
        :type content: object

        :param format:
            The value to assign to the format property of this Content.
            Allowed values for this property are: "NULL", "json", "text", "base64", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type format: str

        :param hash:
            The value to assign to the hash property of this Content.
        :type hash: str

        :param hash_algorithm:
            The value to assign to the hash_algorithm property of this Content.
        :type hash_algorithm: str

        :param description:
            The value to assign to the description property of this Content.
        :type description: str

        """
        self.swagger_types = {
            'name': 'str',
            'path': 'str',
            'type': 'str',
            'writable': 'bool',
            'created': 'datetime',
            'last_modified': 'datetime',
            'size': 'int',
            'mimetype': 'str',
            'content': 'object',
            'format': 'str',
            'hash': 'str',
            'hash_algorithm': 'str',
            'description': 'str'
        }

        self.attribute_map = {
            'name': 'name',
            'path': 'path',
            'type': 'type',
            'writable': 'writable',
            'created': 'created',
            'last_modified': 'last_modified',
            'size': 'size',
            'mimetype': 'mimetype',
            'content': 'content',
            'format': 'format',
            'hash': 'hash',
            'hash_algorithm': 'hash_algorithm',
            'description': 'description'
        }

        self._name = None
        self._path = None
        self._type = None
        self._writable = None
        self._created = None
        self._last_modified = None
        self._size = None
        self._mimetype = None
        self._content = None
        self._format = None
        self._hash = None
        self._hash_algorithm = None
        self._description = None

    @property
    def name(self):
        """
        **[Required]** Gets the name of this Content.
        Name of notebook, file or directory, equivalent to the last part of the path.


        :return: The name of this Content.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this Content.
        Name of notebook, file or directory, equivalent to the last part of the path.


        :param name: The name of this Content.
        :type: str
        """
        self._name = name

    @property
    def path(self):
        """
        **[Required]** Gets the path of this Content.
        Full path for notebook, file or directory.


        :return: The path of this Content.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path):
        """
        Sets the path of this Content.
        Full path for notebook, file or directory.


        :param path: The path of this Content.
        :type: str
        """
        self._path = path

    @property
    def type(self):
        """
        **[Required]** Gets the type of this Content.
        Type of content model.

        Allowed values for this property are: "notebook", "file", "directory", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The type of this Content.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this Content.
        Type of content model.


        :param type: The type of this Content.
        :type: str
        """
        allowed_values = ["notebook", "file", "directory"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            type = 'UNKNOWN_ENUM_VALUE'
        self._type = type

    @property
    def writable(self):
        """
        **[Required]** Gets the writable of this Content.
        Indicates whether the requester has permission to edit the file.


        :return: The writable of this Content.
        :rtype: bool
        """
        return self._writable

    @writable.setter
    def writable(self, writable):
        """
        Sets the writable of this Content.
        Indicates whether the requester has permission to edit the file.


        :param writable: The writable of this Content.
        :type: bool
        """
        self._writable = writable

    @property
    def created(self):
        """
        **[Required]** Gets the created of this Content.
        Creation timestamp.


        :return: The created of this Content.
        :rtype: datetime
        """
        return self._created

    @created.setter
    def created(self, created):
        """
        Sets the created of this Content.
        Creation timestamp.


        :param created: The created of this Content.
        :type: datetime
        """
        self._created = created

    @property
    def last_modified(self):
        """
        **[Required]** Gets the last_modified of this Content.
        Last modified timestamp.


        :return: The last_modified of this Content.
        :rtype: datetime
        """
        return self._last_modified

    @last_modified.setter
    def last_modified(self, last_modified):
        """
        Sets the last_modified of this Content.
        Last modified timestamp.


        :param last_modified: The last_modified of this Content.
        :type: datetime
        """
        self._last_modified = last_modified

    @property
    def size(self):
        """
        Gets the size of this Content.
        Size of file or notebook in bytes. If no size is provided, defaults to null.


        :return: The size of this Content.
        :rtype: int
        """
        return self._size

    @size.setter
    def size(self, size):
        """
        Sets the size of this Content.
        Size of file or notebook in bytes. If no size is provided, defaults to null.


        :param size: The size of this Content.
        :type: int
        """
        self._size = size

    @property
    def mimetype(self):
        """
        **[Required]** Gets the mimetype of this Content.
        Mimetype is only applicable for File model. For other models, it is None. If content is not null, and type is 'file',
        this contains the mimetype of file. For example, text/plain application/octet-stream. Otherwise this is null.


        :return: The mimetype of this Content.
        :rtype: str
        """
        return self._mimetype

    @mimetype.setter
    def mimetype(self, mimetype):
        """
        Sets the mimetype of this Content.
        Mimetype is only applicable for File model. For other models, it is None. If content is not null, and type is 'file',
        this contains the mimetype of file. For example, text/plain application/octet-stream. Otherwise this is null.


        :param mimetype: The mimetype of this Content.
        :type: str
        """
        self._mimetype = mimetype

    @property
    def content(self):
        """
        **[Required]** Gets the content of this Content.
        Content if requested, otherwise is Null.
        For Notebook model, this contains a nbformat NotebookNode representing the .ipynb file represented by the model.
        For File model, content field is always Unicode type. For text-format file models, content simply contains the bytes of the file after decoding as UTF-8.
        Non-text (base64) files are read as bytes, base64 encoded, and then decoded as UTF-8.
        For Directory model, content field contains a list of content-free models representing the entities in the directory.


        :return: The content of this Content.
        :rtype: object
        """
        return self._content

    @content.setter
    def content(self, content):
        """
        Sets the content of this Content.
        Content if requested, otherwise is Null.
        For Notebook model, this contains a nbformat NotebookNode representing the .ipynb file represented by the model.
        For File model, content field is always Unicode type. For text-format file models, content simply contains the bytes of the file after decoding as UTF-8.
        Non-text (base64) files are read as bytes, base64 encoded, and then decoded as UTF-8.
        For Directory model, content field contains a list of content-free models representing the entities in the directory.


        :param content: The content of this Content.
        :type: object
        """
        self._content = content

    @property
    def format(self):
        """
        **[Required]** Gets the format of this Content.
        Format of content. For Notebook model, format field is always 'json'. For File model, format field is either 'text' or 'base64'.
        For directory model, format field is always 'json'.

        Allowed values for this property are: "NULL", "json", "text", "base64", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The format of this Content.
        :rtype: str
        """
        return self._format

    @format.setter
    def format(self, format):
        """
        Sets the format of this Content.
        Format of content. For Notebook model, format field is always 'json'. For File model, format field is either 'text' or 'base64'.
        For directory model, format field is always 'json'.


        :param format: The format of this Content.
        :type: str
        """
        allowed_values = ["NULL", "json", "text", "base64"]
        if not value_allowed_none_or_none_sentinel(format, allowed_values):
            format = 'UNKNOWN_ENUM_VALUE'
        self._format = format

    @property
    def hash(self):
        """
        Gets the hash of this Content.
        [optional] The hexdigest hash string of content, if requested, otherwise null. It cannot be null if hashAlgorithm is defined.


        :return: The hash of this Content.
        :rtype: str
        """
        return self._hash

    @hash.setter
    def hash(self, hash):
        """
        Sets the hash of this Content.
        [optional] The hexdigest hash string of content, if requested, otherwise null. It cannot be null if hashAlgorithm is defined.


        :param hash: The hash of this Content.
        :type: str
        """
        self._hash = hash

    @property
    def hash_algorithm(self):
        """
        Gets the hash_algorithm of this Content.
        [optional] The algorithm used to produce the hash, if requested, (otherwise null). It cannot be null if hash is defined.
         <a href=\"https://docs.python.org/3/library/hashlib.html#hashlib.algorithms_available\" target=\"_blank\" rel=\"noopener noreferrer\">Available algorithms</a>.


        :return: The hash_algorithm of this Content.
        :rtype: str
        """
        return self._hash_algorithm

    @hash_algorithm.setter
    def hash_algorithm(self, hash_algorithm):
        """
        Sets the hash_algorithm of this Content.
        [optional] The algorithm used to produce the hash, if requested, (otherwise null). It cannot be null if hash is defined.
         <a href=\"https://docs.python.org/3/library/hashlib.html#hashlib.algorithms_available\" target=\"_blank\" rel=\"noopener noreferrer\">Available algorithms</a>.


        :param hash_algorithm: The hash_algorithm of this Content.
        :type: str
        """
        self._hash_algorithm = hash_algorithm

    @property
    def description(self):
        """
        Gets the description of this Content.
        A user-provided description of the file.


        :return: The description of this Content.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this Content.
        A user-provided description of the file.


        :param description: The description of this Content.
        :type: str
        """
        self._description = description

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
