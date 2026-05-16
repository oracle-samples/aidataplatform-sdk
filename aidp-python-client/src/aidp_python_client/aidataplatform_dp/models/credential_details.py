# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CredentialDetails(object):
    """
    The base object containing credential information, extended by specific credential types
    such as SecretTokenCredentialDetails or VaultReferenceCredentialDetails. The type of credential
    is identified by the `credentialType` property.
    """

    #: A constant which can be used with the credential_type property of a CredentialDetails.
    #: This constant has a value of "SECRET_TOKEN"
    CREDENTIAL_TYPE_SECRET_TOKEN = "SECRET_TOKEN"

    #: A constant which can be used with the credential_type property of a CredentialDetails.
    #: This constant has a value of "VAULT_REFERENCE"
    CREDENTIAL_TYPE_VAULT_REFERENCE = "VAULT_REFERENCE"

    #: A constant which can be used with the credential_type property of a CredentialDetails.
    #: This constant has a value of "SERVICE_ACCOUNT"
    CREDENTIAL_TYPE_SERVICE_ACCOUNT = "SERVICE_ACCOUNT"

    def __init__(self, **kwargs):
        """
        Initializes a new CredentialDetails object with values from keyword arguments. This class has the following subclasses and if you are using this class as input
        to a service operations then you should favor using a subclass over the base class:

        * :class:`~oci.aidataplatform_dp.models.ServiceAccountCredentialDetails`
        * :class:`~oci.aidataplatform_dp.models.SecretTokenCredentialDetails`
        * :class:`~oci.aidataplatform_dp.models.VaultReferenceCredentialDetails`

        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param credential_type:
            The value to assign to the credential_type property of this CredentialDetails.
            Allowed values for this property are: "SECRET_TOKEN", "VAULT_REFERENCE", "SERVICE_ACCOUNT", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type credential_type: str

        """
        self.swagger_types = {
            'credential_type': 'str'
        }

        self.attribute_map = {
            'credential_type': 'credentialType'
        }

        self._credential_type = None

    @staticmethod
    def get_subtype(object_dictionary):
        """
        Given the hash representation of a subtype of this class,
        use the info in the hash to return the class of the subtype.
        """
        type = object_dictionary['credentialType']

        if type == 'SERVICE_ACCOUNT':
            return 'ServiceAccountCredentialDetails'

        if type == 'SECRET_TOKEN':
            return 'SecretTokenCredentialDetails'

        if type == 'VAULT_REFERENCE':
            return 'VaultReferenceCredentialDetails'
        else:
            return 'CredentialDetails'

    @property
    def credential_type(self):
        """
        **[Required]** Gets the credential_type of this CredentialDetails.
        Specifies the type of credential. Allowed values are defined in CredentialType.

        Allowed values for this property are: "SECRET_TOKEN", "VAULT_REFERENCE", "SERVICE_ACCOUNT", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The credential_type of this CredentialDetails.
        :rtype: str
        """
        return self._credential_type

    @credential_type.setter
    def credential_type(self, credential_type):
        """
        Sets the credential_type of this CredentialDetails.
        Specifies the type of credential. Allowed values are defined in CredentialType.


        :param credential_type: The credential_type of this CredentialDetails.
        :type: str
        """
        allowed_values = ["SECRET_TOKEN", "VAULT_REFERENCE", "SERVICE_ACCOUNT"]
        if not value_allowed_none_or_none_sentinel(credential_type, allowed_values):
            credential_type = 'UNKNOWN_ENUM_VALUE'
        self._credential_type = credential_type

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
