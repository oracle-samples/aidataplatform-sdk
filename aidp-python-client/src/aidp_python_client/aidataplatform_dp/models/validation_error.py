# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ValidationError(object):
    """
    Validation error for a component in agent diagram.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ValidationError object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this ValidationError.
        :type type: str

        :param message:
            The value to assign to the message property of this ValidationError.
        :type message: str

        :param name:
            The value to assign to the name property of this ValidationError.
        :type name: str

        :param key:
            The value to assign to the key property of this ValidationError.
        :type key: str

        """
        self.swagger_types = {
            'type': 'str',
            'message': 'str',
            'name': 'str',
            'key': 'str'
        }

        self.attribute_map = {
            'type': 'type',
            'message': 'message',
            'name': 'name',
            'key': 'key'
        }

        self._type = None
        self._message = None
        self._name = None
        self._key = None

    @property
    def type(self):
        """
        **[Required]** Gets the type of this ValidationError.
        Type of error.


        :return: The type of this ValidationError.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this ValidationError.
        Type of error.


        :param type: The type of this ValidationError.
        :type: str
        """
        self._type = type

    @property
    def message(self):
        """
        **[Required]** Gets the message of this ValidationError.
        Error message.


        :return: The message of this ValidationError.
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message):
        """
        Sets the message of this ValidationError.
        Error message.


        :param message: The message of this ValidationError.
        :type: str
        """
        self._message = message

    @property
    def name(self):
        """
        **[Required]** Gets the name of this ValidationError.
        Error name


        :return: The name of this ValidationError.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this ValidationError.
        Error name


        :param name: The name of this ValidationError.
        :type: str
        """
        self._name = name

    @property
    def key(self):
        """
        **[Required]** Gets the key of this ValidationError.
        Id of the component that caused the error


        :return: The key of this ValidationError.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this ValidationError.
        Id of the component that caused the error


        :param key: The key of this ValidationError.
        :type: str
        """
        self._key = key

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
