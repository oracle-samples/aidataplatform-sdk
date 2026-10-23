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

        :param upload_id:
            The value to assign to the upload_id property of this UpdateContentDetails.
        :type upload_id: str

        :param upload_chunk_index:
            The value to assign to the upload_chunk_index property of this UpdateContentDetails.
        :type upload_chunk_index: int

        :param total_chunks:
            The value to assign to the total_chunks property of this UpdateContentDetails.
        :type total_chunks: int

        :param total_size_bytes:
            The value to assign to the total_size_bytes property of this UpdateContentDetails.
        :type total_size_bytes: int

        :param sha256:
            The value to assign to the sha256 property of this UpdateContentDetails.
        :type sha256: str

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
            'upload_id': 'str',
            'upload_chunk_index': 'int',
            'total_chunks': 'int',
            'total_size_bytes': 'int',
            'sha256': 'str',
            'format': 'str'
        }
        self.attribute_map = {
            'name': 'name',
            'path': 'path',
            'type': 'type',
            'content': 'content',
            'upload_id': 'upload_id',
            'upload_chunk_index': 'upload_chunk_index',
            'total_chunks': 'total_chunks',
            'total_size_bytes': 'total_size_bytes',
            'sha256': 'sha256',
            'format': 'format'
        }
        self._name = None
        self._path = None
        self._type = None
        self._content = None
        self._upload_id = None
        self._upload_chunk_index = None
        self._total_chunks = None
        self._total_size_bytes = None
        self._sha256 = None
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
                f"Invalid value for `type`, must be None or one of {allowed_values}"
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
    def upload_id(self):
        """
        Gets the upload_id of this UpdateContentDetails.
        UI-generated UUID that identifies one notebook upload.


        :return: The upload_id of this UpdateContentDetails.
        :rtype: str
        """
        return self._upload_id

    @upload_id.setter
    def upload_id(self, upload_id):
        """
        Sets the upload_id of this UpdateContentDetails.
        UI-generated UUID that identifies one notebook upload.


        :param upload_id: The upload_id of this UpdateContentDetails.
        :type: str
        """
        self._upload_id = upload_id

    @property
    def upload_chunk_index(self):
        """
        Gets the upload_chunk_index of this UpdateContentDetails.
        One-based upload chunk index, or -1 for the final upload chunk.


        :return: The upload_chunk_index of this UpdateContentDetails.
        :rtype: int
        """
        return self._upload_chunk_index

    @upload_chunk_index.setter
    def upload_chunk_index(self, upload_chunk_index):
        """
        Sets the upload_chunk_index of this UpdateContentDetails.
        One-based upload chunk index, or -1 for the final upload chunk.


        :param upload_chunk_index: The upload_chunk_index of this UpdateContentDetails.
        :type: int
        """
        self._upload_chunk_index = upload_chunk_index

    @property
    def total_chunks(self):
        """
        Gets the total_chunks of this UpdateContentDetails.
        Total request chunks, including the final chunk.


        :return: The total_chunks of this UpdateContentDetails.
        :rtype: int
        """
        return self._total_chunks

    @total_chunks.setter
    def total_chunks(self, total_chunks):
        """
        Sets the total_chunks of this UpdateContentDetails.
        Total request chunks, including the final chunk.


        :param total_chunks: The total_chunks of this UpdateContentDetails.
        :type: int
        """
        self._total_chunks = total_chunks

    @property
    def total_size_bytes(self):
        """
        Gets the total_size_bytes of this UpdateContentDetails.
        Total decoded notebook bytes.


        :return: The total_size_bytes of this UpdateContentDetails.
        :rtype: int
        """
        return self._total_size_bytes

    @total_size_bytes.setter
    def total_size_bytes(self, total_size_bytes):
        """
        Sets the total_size_bytes of this UpdateContentDetails.
        Total decoded notebook bytes.


        :param total_size_bytes: The total_size_bytes of this UpdateContentDetails.
        :type: int
        """
        self._total_size_bytes = total_size_bytes

    @property
    def sha256(self):
        """
        Gets the sha256 of this UpdateContentDetails.
        SHA-256 digest of the complete decoded notebook content.


        :return: The sha256 of this UpdateContentDetails.
        :rtype: str
        """
        return self._sha256

    @sha256.setter
    def sha256(self, sha256):
        """
        Sets the sha256 of this UpdateContentDetails.
        SHA-256 digest of the complete decoded notebook content.


        :param sha256: The sha256 of this UpdateContentDetails.
        :type: str
        """
        self._sha256 = sha256

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
                f"Invalid value for `format`, must be None or one of {allowed_values}"
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
