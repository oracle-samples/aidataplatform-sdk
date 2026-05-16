# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .credential_details import CredentialDetails
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class VaultReferenceCredentialDetails(CredentialDetails):
    """
    Credential details for referencing existing secrets managed outside the IDL. This extends
    the base CredentialDetails object, with the credential type set as VAULT_REFERENCE.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new VaultReferenceCredentialDetails object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.VaultReferenceCredentialDetails.credential_type` attribute
        of this class is ``VAULT_REFERENCE`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param credential_type:
            The value to assign to the credential_type property of this VaultReferenceCredentialDetails.
            Allowed values for this property are: "SECRET_TOKEN", "VAULT_REFERENCE", "SERVICE_ACCOUNT"
        :type credential_type: str

        :param secret_id:
            The value to assign to the secret_id property of this VaultReferenceCredentialDetails.
        :type secret_id: str

        """
        self.swagger_types = {
            'credential_type': 'str',
            'secret_id': 'str'
        }

        self.attribute_map = {
            'credential_type': 'credentialType',
            'secret_id': 'secretId'
        }

        self._credential_type = None
        self._secret_id = None
        self._credential_type = 'VAULT_REFERENCE'

    @property
    def secret_id(self):
        """
        **[Required]** Gets the secret_id of this VaultReferenceCredentialDetails.
        The OCID of the external secret to reference.


        :return: The secret_id of this VaultReferenceCredentialDetails.
        :rtype: str
        """
        return self._secret_id

    @secret_id.setter
    def secret_id(self, secret_id):
        """
        Sets the secret_id of this VaultReferenceCredentialDetails.
        The OCID of the external secret to reference.


        :param secret_id: The secret_id of this VaultReferenceCredentialDetails.
        :type: str
        """
        self._secret_id = secret_id

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
