# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class MemoryLimitConfigurationDetails(object):
    """
    Configuration details for memory limits.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new MemoryLimitConfigurationDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param message_limit:
            The value to assign to the message_limit property of this MemoryLimitConfigurationDetails.
        :type message_limit: int

        :param token_limit:
            The value to assign to the token_limit property of this MemoryLimitConfigurationDetails.
        :type token_limit: int

        """
        self.swagger_types = {
            'message_limit': 'int',
            'token_limit': 'int'
        }

        self.attribute_map = {
            'message_limit': 'messageLimit',
            'token_limit': 'tokenLimit'
        }

        self._message_limit = None
        self._token_limit = None

    @property
    def message_limit(self):
        """
        Gets the message_limit of this MemoryLimitConfigurationDetails.
        Message-count limit for truncation middleware.


        :return: The message_limit of this MemoryLimitConfigurationDetails.
        :rtype: int
        """
        return self._message_limit

    @message_limit.setter
    def message_limit(self, message_limit):
        """
        Sets the message_limit of this MemoryLimitConfigurationDetails.
        Message-count limit for truncation middleware.


        :param message_limit: The message_limit of this MemoryLimitConfigurationDetails.
        :type: int
        """
        self._message_limit = message_limit

    @property
    def token_limit(self):
        """
        Gets the token_limit of this MemoryLimitConfigurationDetails.
        Approximate token-count limit for truncation middleware.


        :return: The token_limit of this MemoryLimitConfigurationDetails.
        :rtype: int
        """
        return self._token_limit

    @token_limit.setter
    def token_limit(self, token_limit):
        """
        Sets the token_limit of this MemoryLimitConfigurationDetails.
        Approximate token-count limit for truncation middleware.


        :param token_limit: The token_limit of this MemoryLimitConfigurationDetails.
        :type: int
        """
        self._token_limit = token_limit

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
