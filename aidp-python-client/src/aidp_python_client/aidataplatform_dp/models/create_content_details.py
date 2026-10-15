# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateContentDetails(object):
    """
    Path of file to copy. A POST to /api/contents/path creates a New untitled, empty file or directory. A POST to /api/contents/path with body {'copy_from': '/path/to/OtherNotebook.ipynb'} creates a new copy of OtherNotebook in path.
    """

    #: A constant which can be used with the format property of a CreateContentDetails.
    #: This constant has a value of "json"
    FORMAT_JSON = "json"

    def __init__(self, **kwargs):
        """
        Initializes a new CreateContentDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param copy_from:
            The value to assign to the copy_from property of this CreateContentDetails.
        :type copy_from: str

        :param ext:
            The value to assign to the ext property of this CreateContentDetails.
        :type ext: str

        :param type:
            The value to assign to the type property of this CreateContentDetails.
        :type type: str

        :param format:
            The value to assign to the format property of this CreateContentDetails.
            Allowed values for this property are: "json"
        :type format: str

        :param content:
            The value to assign to the content property of this CreateContentDetails.
        :type content: object

        :param upload_id:
            The value to assign to the upload_id property of this CreateContentDetails.
        :type upload_id: str

        :param upload_chunk_index:
            The value to assign to the upload_chunk_index property of this CreateContentDetails.
        :type upload_chunk_index: int

        :param total_chunks:
            The value to assign to the total_chunks property of this CreateContentDetails.
        :type total_chunks: int

        :param total_size_bytes:
            The value to assign to the total_size_bytes property of this CreateContentDetails.
        :type total_size_bytes: int

        :param sha256:
            The value to assign to the sha256 property of this CreateContentDetails.
        :type sha256: str

        """
        self.swagger_types = {
            'copy_from': 'str',
            'ext': 'str',
            'type': 'str',
            'format': 'str',
            'content': 'object',
            'upload_id': 'str',
            'upload_chunk_index': 'int',
            'total_chunks': 'int',
            'total_size_bytes': 'int',
            'sha256': 'str'
        }
        self.attribute_map = {
            'copy_from': 'copy_from',
            'ext': 'ext',
            'type': 'type',
            'format': 'format',
            'content': 'content',
            'upload_id': 'upload_id',
            'upload_chunk_index': 'upload_chunk_index',
            'total_chunks': 'total_chunks',
            'total_size_bytes': 'total_size_bytes',
            'sha256': 'sha256'
        }
        self._copy_from = None
        self._ext = None
        self._type = None
        self._format = None
        self._content = None
        self._upload_id = None
        self._upload_chunk_index = None
        self._total_chunks = None
        self._total_size_bytes = None
        self._sha256 = None

    @property
    def copy_from(self):
        """
        Gets the copy_from of this CreateContentDetails.
        Copy from Path. For example, /path/to/OtherNotebook.ipynb.


        :return: The copy_from of this CreateContentDetails.
        :rtype: str
        """
        return self._copy_from

    @copy_from.setter
    def copy_from(self, copy_from):
        """
        Sets the copy_from of this CreateContentDetails.
        Copy from Path. For example, /path/to/OtherNotebook.ipynb.


        :param copy_from: The copy_from of this CreateContentDetails.
        :type: str
        """
        self._copy_from = copy_from

    @property
    def ext(self):
        """
        Gets the ext of this CreateContentDetails.
        File format extension


        :return: The ext of this CreateContentDetails.
        :rtype: str
        """
        return self._ext

    @ext.setter
    def ext(self, ext):
        """
        Sets the ext of this CreateContentDetails.
        File format extension


        :param ext: The ext of this CreateContentDetails.
        :type: str
        """
        self._ext = ext

    @property
    def type(self):
        """
        Gets the type of this CreateContentDetails.
        Type of Content model. Either notebook, file, or directory.


        :return: The type of this CreateContentDetails.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this CreateContentDetails.
        Type of Content model. Either notebook, file, or directory.


        :param type: The type of this CreateContentDetails.
        :type: str
        """
        self._type = type

    @property
    def format(self):
        """
        Gets the format of this CreateContentDetails.
        Content format. Chunked notebook uploads require json.

        Allowed values for this property are: "json"


        :return: The format of this CreateContentDetails.
        :rtype: str
        """
        return self._format

    @format.setter
    def format(self, format):
        """
        Sets the format of this CreateContentDetails.
        Content format. Chunked notebook uploads require json.


        :param format: The format of this CreateContentDetails.
        :type: str
        """
        allowed_values = ["json"]
        if not value_allowed_none_or_none_sentinel(format, allowed_values):
            raise ValueError(
                f"Invalid value for `format`, must be None or one of {allowed_values}"
            )
        self._format = format

    @property
    def content(self):
        """
        Gets the content of this CreateContentDetails.
        Base64-encoded notebook content chunk when upload_id is supplied.


        :return: The content of this CreateContentDetails.
        :rtype: object
        """
        return self._content

    @content.setter
    def content(self, content):
        """
        Sets the content of this CreateContentDetails.
        Base64-encoded notebook content chunk when upload_id is supplied.


        :param content: The content of this CreateContentDetails.
        :type: object
        """
        self._content = content

    @property
    def upload_id(self):
        """
        Gets the upload_id of this CreateContentDetails.
        UI-generated UUID that identifies one notebook upload.


        :return: The upload_id of this CreateContentDetails.
        :rtype: str
        """
        return self._upload_id

    @upload_id.setter
    def upload_id(self, upload_id):
        """
        Sets the upload_id of this CreateContentDetails.
        UI-generated UUID that identifies one notebook upload.


        :param upload_id: The upload_id of this CreateContentDetails.
        :type: str
        """
        self._upload_id = upload_id

    @property
    def upload_chunk_index(self):
        """
        Gets the upload_chunk_index of this CreateContentDetails.
        One-based upload chunk index, or -1 for the final upload chunk.


        :return: The upload_chunk_index of this CreateContentDetails.
        :rtype: int
        """
        return self._upload_chunk_index

    @upload_chunk_index.setter
    def upload_chunk_index(self, upload_chunk_index):
        """
        Sets the upload_chunk_index of this CreateContentDetails.
        One-based upload chunk index, or -1 for the final upload chunk.


        :param upload_chunk_index: The upload_chunk_index of this CreateContentDetails.
        :type: int
        """
        self._upload_chunk_index = upload_chunk_index

    @property
    def total_chunks(self):
        """
        Gets the total_chunks of this CreateContentDetails.
        Total request chunks, including the final chunk.


        :return: The total_chunks of this CreateContentDetails.
        :rtype: int
        """
        return self._total_chunks

    @total_chunks.setter
    def total_chunks(self, total_chunks):
        """
        Sets the total_chunks of this CreateContentDetails.
        Total request chunks, including the final chunk.


        :param total_chunks: The total_chunks of this CreateContentDetails.
        :type: int
        """
        self._total_chunks = total_chunks

    @property
    def total_size_bytes(self):
        """
        Gets the total_size_bytes of this CreateContentDetails.
        Total decoded notebook bytes.


        :return: The total_size_bytes of this CreateContentDetails.
        :rtype: int
        """
        return self._total_size_bytes

    @total_size_bytes.setter
    def total_size_bytes(self, total_size_bytes):
        """
        Sets the total_size_bytes of this CreateContentDetails.
        Total decoded notebook bytes.


        :param total_size_bytes: The total_size_bytes of this CreateContentDetails.
        :type: int
        """
        self._total_size_bytes = total_size_bytes

    @property
    def sha256(self):
        """
        Gets the sha256 of this CreateContentDetails.
        SHA-256 digest of the complete decoded notebook content.


        :return: The sha256 of this CreateContentDetails.
        :rtype: str
        """
        return self._sha256

    @sha256.setter
    def sha256(self, sha256):
        """
        Sets the sha256 of this CreateContentDetails.
        SHA-256 digest of the complete decoded notebook content.


        :param sha256: The sha256 of this CreateContentDetails.
        :type: str
        """
        self._sha256 = sha256

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
