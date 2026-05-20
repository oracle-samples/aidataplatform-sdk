# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ChatMessage(object):
    """
    The content of the chat query sent by the user.
    """

    #: A constant which can be used with the type property of a ChatMessage.
    #: This constant has a value of "INPUT_TEXT"
    TYPE_INPUT_TEXT = "INPUT_TEXT"

    #: A constant which can be used with the type property of a ChatMessage.
    #: This constant has a value of "INPUT_IMAGE"
    TYPE_INPUT_IMAGE = "INPUT_IMAGE"

    #: A constant which can be used with the type property of a ChatMessage.
    #: This constant has a value of "INPUT_FILE"
    TYPE_INPUT_FILE = "INPUT_FILE"

    def __init__(self, **kwargs):
        """
        Initializes a new ChatMessage object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this ChatMessage.
            Allowed values for this property are: "INPUT_TEXT", "INPUT_IMAGE", "INPUT_FILE"
        :type type: str

        :param text:
            The value to assign to the text property of this ChatMessage.
        :type text: str

        :param image_url:
            The value to assign to the image_url property of this ChatMessage.
        :type image_url: str

        :param file_url:
            The value to assign to the file_url property of this ChatMessage.
        :type file_url: str

        """
        self.swagger_types = {
            'type': 'str',
            'text': 'str',
            'image_url': 'str',
            'file_url': 'str'
        }

        self.attribute_map = {
            'type': 'type',
            'text': 'text',
            'image_url': 'imageUrl',
            'file_url': 'fileUrl'
        }

        self._type = None
        self._text = None
        self._image_url = None
        self._file_url = None

    @property
    def type(self):
        """
        **[Required]** Gets the type of this ChatMessage.
        Type of input.

        Allowed values for this property are: "INPUT_TEXT", "INPUT_IMAGE", "INPUT_FILE"


        :return: The type of this ChatMessage.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this ChatMessage.
        Type of input.


        :param type: The type of this ChatMessage.
        :type: str
        """
        allowed_values = ["INPUT_TEXT", "INPUT_IMAGE", "INPUT_FILE"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            raise ValueError(
                "Invalid value for `type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._type = type

    @property
    def text(self):
        """
        Gets the text of this ChatMessage.
        Text input from the user. Set this parameter when type is input_text.


        :return: The text of this ChatMessage.
        :rtype: str
        """
        return self._text

    @text.setter
    def text(self, text):
        """
        Sets the text of this ChatMessage.
        Text input from the user. Set this parameter when type is input_text.


        :param text: The text of this ChatMessage.
        :type: str
        """
        self._text = text

    @property
    def image_url(self):
        """
        Gets the image_url of this ChatMessage.
        Image URL for the image user intends to query. Set this parameter when type is input_image.


        :return: The image_url of this ChatMessage.
        :rtype: str
        """
        return self._image_url

    @image_url.setter
    def image_url(self, image_url):
        """
        Sets the image_url of this ChatMessage.
        Image URL for the image user intends to query. Set this parameter when type is input_image.


        :param image_url: The image_url of this ChatMessage.
        :type: str
        """
        self._image_url = image_url

    @property
    def file_url(self):
        """
        Gets the file_url of this ChatMessage.
        File URL for the image user intends to query. Set this parameter when type is input_file.


        :return: The file_url of this ChatMessage.
        :rtype: str
        """
        return self._file_url

    @file_url.setter
    def file_url(self, file_url):
        """
        Sets the file_url of this ChatMessage.
        File URL for the image user intends to query. Set this parameter when type is input_file.


        :param file_url: The file_url of this ChatMessage.
        :type: str
        """
        self._file_url = file_url

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
