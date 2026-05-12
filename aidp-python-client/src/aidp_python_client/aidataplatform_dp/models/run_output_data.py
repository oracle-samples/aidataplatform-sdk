# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class RunOutputData(object):
    """
    An object representing execution output of a command.
    """

    #: A constant which can be used with the type property of a RunOutputData.
    #: This constant has a value of "TEXT_PLAIN"
    TYPE_TEXT_PLAIN = "TEXT_PLAIN"

    #: A constant which can be used with the type property of a RunOutputData.
    #: This constant has a value of "NOTEBOOK"
    TYPE_NOTEBOOK = "NOTEBOOK"

    #: A constant which can be used with the type property of a RunOutputData.
    #: This constant has a value of "TEXT_HTML"
    TYPE_TEXT_HTML = "TEXT_HTML"

    #: A constant which can be used with the type property of a RunOutputData.
    #: This constant has a value of "IMAGE_PNG"
    TYPE_IMAGE_PNG = "IMAGE_PNG"

    #: A constant which can be used with the type property of a RunOutputData.
    #: This constant has a value of "IMAGE_SVG"
    TYPE_IMAGE_SVG = "IMAGE_SVG"

    #: A constant which can be used with the type property of a RunOutputData.
    #: This constant has a value of "IMAGE_JPEG"
    TYPE_IMAGE_JPEG = "IMAGE_JPEG"

    #: A constant which can be used with the type property of a RunOutputData.
    #: This constant has a value of "APPLICATION_PDF"
    TYPE_APPLICATION_PDF = "APPLICATION_PDF"

    #: A constant which can be used with the type property of a RunOutputData.
    #: This constant has a value of "APPLICATION_JSON"
    TYPE_APPLICATION_JSON = "APPLICATION_JSON"

    #: A constant which can be used with the type property of a RunOutputData.
    #: This constant has a value of "FILE_PATH"
    TYPE_FILE_PATH = "FILE_PATH"

    #: A constant which can be used with the type property of a RunOutputData.
    #: This constant has a value of "NOTEBOOK_PATH"
    TYPE_NOTEBOOK_PATH = "NOTEBOOK_PATH"

    #: A constant which can be used with the charset property of a RunOutputData.
    #: This constant has a value of "UTF_8"
    CHARSET_UTF_8 = "UTF_8"

    #: A constant which can be used with the charset property of a RunOutputData.
    #: This constant has a value of "UTF_16"
    CHARSET_UTF_16 = "UTF_16"

    #: A constant which can be used with the compression property of a RunOutputData.
    #: This constant has a value of "GZIP"
    COMPRESSION_GZIP = "GZIP"

    #: A constant which can be used with the compression property of a RunOutputData.
    #: This constant has a value of "DEFLATE"
    COMPRESSION_DEFLATE = "DEFLATE"

    #: A constant which can be used with the compression property of a RunOutputData.
    #: This constant has a value of "COMPRESS"
    COMPRESSION_COMPRESS = "COMPRESS"

    #: A constant which can be used with the compression property of a RunOutputData.
    #: This constant has a value of "BZIP2"
    COMPRESSION_BZIP2 = "BZIP2"

    def __init__(self, **kwargs):
        """
        Initializes a new RunOutputData object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this RunOutputData.
            Allowed values for this property are: "TEXT_PLAIN", "NOTEBOOK", "TEXT_HTML", "IMAGE_PNG", "IMAGE_SVG", "IMAGE_JPEG", "APPLICATION_PDF", "APPLICATION_JSON", "FILE_PATH", "NOTEBOOK_PATH", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type type: str

        :param length:
            The value to assign to the length property of this RunOutputData.
        :type length: str

        :param charset:
            The value to assign to the charset property of this RunOutputData.
            Allowed values for this property are: "UTF_8", "UTF_16", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type charset: str

        :param is_base64:
            The value to assign to the is_base64 property of this RunOutputData.
        :type is_base64: bool

        :param compression:
            The value to assign to the compression property of this RunOutputData.
            Allowed values for this property are: "GZIP", "DEFLATE", "COMPRESS", "BZIP2", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type compression: str

        :param value:
            The value to assign to the value property of this RunOutputData.
        :type value: str

        """
        self.swagger_types = {
            'type': 'str',
            'length': 'str',
            'charset': 'str',
            'is_base64': 'bool',
            'compression': 'str',
            'value': 'str'
        }

        self.attribute_map = {
            'type': 'type',
            'length': 'length',
            'charset': 'charset',
            'is_base64': 'isBase64',
            'compression': 'compression',
            'value': 'value'
        }

        self._type = None
        self._length = None
        self._charset = None
        self._is_base64 = None
        self._compression = None
        self._value = None

    @property
    def type(self):
        """
        **[Required]** Gets the type of this RunOutputData.
        The type of the RunOutputData. For example, `TEXT_PLAIN`, `TEXT_HTML`, or `IMAGE`.

        Allowed values for this property are: "TEXT_PLAIN", "NOTEBOOK", "TEXT_HTML", "IMAGE_PNG", "IMAGE_SVG", "IMAGE_JPEG", "APPLICATION_PDF", "APPLICATION_JSON", "FILE_PATH", "NOTEBOOK_PATH", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The type of this RunOutputData.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this RunOutputData.
        The type of the RunOutputData. For example, `TEXT_PLAIN`, `TEXT_HTML`, or `IMAGE`.


        :param type: The type of this RunOutputData.
        :type: str
        """
        allowed_values = ["TEXT_PLAIN", "NOTEBOOK", "TEXT_HTML", "IMAGE_PNG", "IMAGE_SVG", "IMAGE_JPEG", "APPLICATION_PDF", "APPLICATION_JSON", "FILE_PATH", "NOTEBOOK_PATH"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            type = 'UNKNOWN_ENUM_VALUE'
        self._type = type

    @property
    def length(self):
        """
        Gets the length of this RunOutputData.
        Size of object in bytes.


        :return: The length of this RunOutputData.
        :rtype: str
        """
        return self._length

    @length.setter
    def length(self, length):
        """
        Sets the length of this RunOutputData.
        Size of object in bytes.


        :param length: The length of this RunOutputData.
        :type: str
        """
        self._length = length

    @property
    def charset(self):
        """
        Gets the charset of this RunOutputData.
        Charset of the result.

        Allowed values for this property are: "UTF_8", "UTF_16", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The charset of this RunOutputData.
        :rtype: str
        """
        return self._charset

    @charset.setter
    def charset(self, charset):
        """
        Sets the charset of this RunOutputData.
        Charset of the result.


        :param charset: The charset of this RunOutputData.
        :type: str
        """
        allowed_values = ["UTF_8", "UTF_16"]
        if not value_allowed_none_or_none_sentinel(charset, allowed_values):
            charset = 'UNKNOWN_ENUM_VALUE'
        self._charset = charset

    @property
    def is_base64(self):
        """
        Gets the is_base64 of this RunOutputData.
        Boolean to identify if output data is base64-encoded.


        :return: The is_base64 of this RunOutputData.
        :rtype: bool
        """
        return self._is_base64

    @is_base64.setter
    def is_base64(self, is_base64):
        """
        Sets the is_base64 of this RunOutputData.
        Boolean to identify if output data is base64-encoded.


        :param is_base64: The is_base64 of this RunOutputData.
        :type: bool
        """
        self._is_base64 = is_base64

    @property
    def compression(self):
        """
        Gets the compression of this RunOutputData.
        Content-Encoding or compression

        Allowed values for this property are: "GZIP", "DEFLATE", "COMPRESS", "BZIP2", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The compression of this RunOutputData.
        :rtype: str
        """
        return self._compression

    @compression.setter
    def compression(self, compression):
        """
        Sets the compression of this RunOutputData.
        Content-Encoding or compression


        :param compression: The compression of this RunOutputData.
        :type: str
        """
        allowed_values = ["GZIP", "DEFLATE", "COMPRESS", "BZIP2"]
        if not value_allowed_none_or_none_sentinel(compression, allowed_values):
            compression = 'UNKNOWN_ENUM_VALUE'
        self._compression = compression

    @property
    def value(self):
        """
        Gets the value of this RunOutputData.
        The output content string format.


        :return: The value of this RunOutputData.
        :rtype: str
        """
        return self._value

    @value.setter
    def value(self, value):
        """
        Sets the value of this RunOutputData.
        The output content string format.


        :param value: The value of this RunOutputData.
        :type: str
        """
        self._value = value

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
