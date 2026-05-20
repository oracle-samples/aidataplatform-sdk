# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CredentialV2NameAndSecretKey(object):
    """
    Represents the name of a credential and an optional secret key name used when
    retrieving details via GetDataLakeCredentialByName.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new CredentialV2NameAndSecretKey object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param display_name:
            The value to assign to the display_name property of this CredentialV2NameAndSecretKey.
        :type display_name: str

        :param secret_key:
            The value to assign to the secret_key property of this CredentialV2NameAndSecretKey.
        :type secret_key: str

        """
        self.swagger_types = {
            'display_name': 'str',
            'secret_key': 'str'
        }

        self.attribute_map = {
            'display_name': 'displayName',
            'secret_key': 'secretKey'
        }

        self._display_name = None
        self._secret_key = None

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this CredentialV2NameAndSecretKey.
        The display name of the credential. Must start with a letter and contain only letters, numbers, or underscores.


        :return: The display_name of this CredentialV2NameAndSecretKey.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this CredentialV2NameAndSecretKey.
        The display name of the credential. Must start with a letter and contain only letters, numbers, or underscores.


        :param display_name: The display_name of this CredentialV2NameAndSecretKey.
        :type: str
        """
        self._display_name = display_name

    @property
    def secret_key(self):
        """
        Gets the secret_key of this CredentialV2NameAndSecretKey.
        The secret key name to filter SecretToken credentials.


        :return: The secret_key of this CredentialV2NameAndSecretKey.
        :rtype: str
        """
        return self._secret_key

    @secret_key.setter
    def secret_key(self, secret_key):
        """
        Sets the secret_key of this CredentialV2NameAndSecretKey.
        The secret key name to filter SecretToken credentials.


        :param secret_key: The secret_key of this CredentialV2NameAndSecretKey.
        :type: str
        """
        self._secret_key = secret_key

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
