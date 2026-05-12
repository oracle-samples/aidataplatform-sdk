# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class SecretPair(object):
    """
    Represents a key-value pair for a secret, consisting of a secret key and its corresponding value.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new SecretPair object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param secret_key:
            The value to assign to the secret_key property of this SecretPair.
        :type secret_key: str

        :param secret_value:
            The value to assign to the secret_value property of this SecretPair.
        :type secret_value: str

        """
        self.swagger_types = {
            'secret_key': 'str',
            'secret_value': 'str'
        }

        self.attribute_map = {
            'secret_key': 'secretKey',
            'secret_value': 'secretValue'
        }

        self._secret_key = None
        self._secret_value = None

    @property
    def secret_key(self):
        """
        **[Required]** Gets the secret_key of this SecretPair.
        The secret key. The minimum length is 1 character and the maximum is 255 characters.


        :return: The secret_key of this SecretPair.
        :rtype: str
        """
        return self._secret_key

    @secret_key.setter
    def secret_key(self, secret_key):
        """
        Sets the secret_key of this SecretPair.
        The secret key. The minimum length is 1 character and the maximum is 255 characters.


        :param secret_key: The secret_key of this SecretPair.
        :type: str
        """
        self._secret_key = secret_key

    @property
    def secret_value(self):
        """
        **[Required]** Gets the secret_value of this SecretPair.
        The secret value. The minimum length is 1 character and the maximum is 1 MB.


        :return: The secret_value of this SecretPair.
        :rtype: str
        """
        return self._secret_value

    @secret_value.setter
    def secret_value(self, secret_value):
        """
        Sets the secret_value of this SecretPair.
        The secret value. The minimum length is 1 character and the maximum is 1 MB.


        :param secret_value: The secret_value of this SecretPair.
        :type: str
        """
        self._secret_value = secret_value

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
