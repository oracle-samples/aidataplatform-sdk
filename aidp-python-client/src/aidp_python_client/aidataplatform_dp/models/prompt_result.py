# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class PromptResult(object):
    """
    Generated text info for prompt result.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new PromptResult object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this PromptResult.
        :type type: str

        :param data:
            The value to assign to the data property of this PromptResult.
        :type data: str

        """
        self.swagger_types = {
            'type': 'str',
            'data': 'str'
        }

        self.attribute_map = {
            'type': 'type',
            'data': 'data'
        }

        self._type = None
        self._data = None

    @property
    def type(self):
        """
        **[Required]** Gets the type of this PromptResult.
        Format of the prompt result (e.g., \"text\", \"markdown\", \"image\").


        :return: The type of this PromptResult.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this PromptResult.
        Format of the prompt result (e.g., \"text\", \"markdown\", \"image\").


        :param type: The type of this PromptResult.
        :type: str
        """
        self._type = type

    @property
    def data(self):
        """
        **[Required]** Gets the data of this PromptResult.
        The generated content from the prompt.


        :return: The data of this PromptResult.
        :rtype: str
        """
        return self._data

    @data.setter
    def data(self, data):
        """
        Sets the data of this PromptResult.
        The generated content from the prompt.


        :param data: The data of this PromptResult.
        :type: str
        """
        self._data = data

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
