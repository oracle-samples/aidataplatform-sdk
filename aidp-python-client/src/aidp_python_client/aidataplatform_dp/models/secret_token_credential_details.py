# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.

from .credential_details import CredentialDetails
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class SecretTokenCredentialDetails(CredentialDetails):
    """
    Credential details for storing secret tokens or API keys. This extends the base CredentialDetails
    object, with the credential type set as SECRET_TOKEN.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new SecretTokenCredentialDetails object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.SecretTokenCredentialDetails.credential_type` attribute
        of this class is ``SECRET_TOKEN`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param credential_type:
            The value to assign to the credential_type property of this SecretTokenCredentialDetails.
            Allowed values for this property are: "SECRET_TOKEN", "VAULT_REFERENCE", "SERVICE_ACCOUNT"
        :type credential_type: str

        :param secret_token_pair:
            The value to assign to the secret_token_pair property of this SecretTokenCredentialDetails.
        :type secret_token_pair: list[oci.aidataplatform_dp.models.SecretPair]

        """
        self.swagger_types = {
            'credential_type': 'str',
            'secret_token_pair': 'list[SecretPair]'
        }

        self.attribute_map = {
            'credential_type': 'credentialType',
            'secret_token_pair': 'secretTokenPair'
        }

        self._credential_type = None
        self._secret_token_pair = None
        self._credential_type = 'SECRET_TOKEN'

    @property
    def secret_token_pair(self):
        """
        **[Required]** Gets the secret_token_pair of this SecretTokenCredentialDetails.
        A list of secret key-value pairs used as secret tokens or API keys.


        :return: The secret_token_pair of this SecretTokenCredentialDetails.
        :rtype: list[oci.aidataplatform_dp.models.SecretPair]
        """
        return self._secret_token_pair

    @secret_token_pair.setter
    def secret_token_pair(self, secret_token_pair):
        """
        Sets the secret_token_pair of this SecretTokenCredentialDetails.
        A list of secret key-value pairs used as secret tokens or API keys.


        :param secret_token_pair: The secret_token_pair of this SecretTokenCredentialDetails.
        :type: list[oci.aidataplatform_dp.models.SecretPair]
        """
        self._secret_token_pair = secret_token_pair

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
