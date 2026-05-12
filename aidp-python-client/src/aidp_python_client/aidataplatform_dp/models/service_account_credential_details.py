# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.

from .credential_details import CredentialDetails
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ServiceAccountCredentialDetails(CredentialDetails):
    """
    Credential details for representing service account object. This extends
    the base CredentialDetails object, with the credential type set as SERVICE_ACCOUNT.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ServiceAccountCredentialDetails object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.ServiceAccountCredentialDetails.credential_type` attribute
        of this class is ``SERVICE_ACCOUNT`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param credential_type:
            The value to assign to the credential_type property of this ServiceAccountCredentialDetails.
            Allowed values for this property are: "SECRET_TOKEN", "VAULT_REFERENCE", "SERVICE_ACCOUNT"
        :type credential_type: str

        :param user_id:
            The value to assign to the user_id property of this ServiceAccountCredentialDetails.
        :type user_id: str

        :param fingerprint:
            The value to assign to the fingerprint property of this ServiceAccountCredentialDetails.
        :type fingerprint: str

        :param tenancy:
            The value to assign to the tenancy property of this ServiceAccountCredentialDetails.
        :type tenancy: str

        :param region:
            The value to assign to the region property of this ServiceAccountCredentialDetails.
        :type region: str

        :param is_read_only:
            The value to assign to the is_read_only property of this ServiceAccountCredentialDetails.
        :type is_read_only: bool

        :param private_key:
            The value to assign to the private_key property of this ServiceAccountCredentialDetails.
        :type private_key: str

        """
        self.swagger_types = {
            'credential_type': 'str',
            'user_id': 'str',
            'fingerprint': 'str',
            'tenancy': 'str',
            'region': 'str',
            'is_read_only': 'bool',
            'private_key': 'str'
        }

        self.attribute_map = {
            'credential_type': 'credentialType',
            'user_id': 'userId',
            'fingerprint': 'fingerprint',
            'tenancy': 'tenancy',
            'region': 'region',
            'is_read_only': 'isReadOnly',
            'private_key': 'privateKey'
        }

        self._credential_type = None
        self._user_id = None
        self._fingerprint = None
        self._tenancy = None
        self._region = None
        self._is_read_only = None
        self._private_key = None
        self._credential_type = 'SERVICE_ACCOUNT'

    @property
    def user_id(self):
        """
        **[Required]** Gets the user_id of this ServiceAccountCredentialDetails.
        The OCID of the user for the service account.


        :return: The user_id of this ServiceAccountCredentialDetails.
        :rtype: str
        """
        return self._user_id

    @user_id.setter
    def user_id(self, user_id):
        """
        Sets the user_id of this ServiceAccountCredentialDetails.
        The OCID of the user for the service account.


        :param user_id: The user_id of this ServiceAccountCredentialDetails.
        :type: str
        """
        self._user_id = user_id

    @property
    def fingerprint(self):
        """
        **[Required]** Gets the fingerprint of this ServiceAccountCredentialDetails.
        The fingerprint of the service account's API key.


        :return: The fingerprint of this ServiceAccountCredentialDetails.
        :rtype: str
        """
        return self._fingerprint

    @fingerprint.setter
    def fingerprint(self, fingerprint):
        """
        Sets the fingerprint of this ServiceAccountCredentialDetails.
        The fingerprint of the service account's API key.


        :param fingerprint: The fingerprint of this ServiceAccountCredentialDetails.
        :type: str
        """
        self._fingerprint = fingerprint

    @property
    def tenancy(self):
        """
        **[Required]** Gets the tenancy of this ServiceAccountCredentialDetails.
        The OCID of the tenancy for the service account.


        :return: The tenancy of this ServiceAccountCredentialDetails.
        :rtype: str
        """
        return self._tenancy

    @tenancy.setter
    def tenancy(self, tenancy):
        """
        Sets the tenancy of this ServiceAccountCredentialDetails.
        The OCID of the tenancy for the service account.


        :param tenancy: The tenancy of this ServiceAccountCredentialDetails.
        :type: str
        """
        self._tenancy = tenancy

    @property
    def region(self):
        """
        **[Required]** Gets the region of this ServiceAccountCredentialDetails.
        The region for the service account (e.g., us-ashburn-1).


        :return: The region of this ServiceAccountCredentialDetails.
        :rtype: str
        """
        return self._region

    @region.setter
    def region(self, region):
        """
        Sets the region of this ServiceAccountCredentialDetails.
        The region for the service account (e.g., us-ashburn-1).


        :param region: The region of this ServiceAccountCredentialDetails.
        :type: str
        """
        self._region = region

    @property
    def is_read_only(self):
        """
        **[Required]** Gets the is_read_only of this ServiceAccountCredentialDetails.
        Whether the credentials are read-only.


        :return: The is_read_only of this ServiceAccountCredentialDetails.
        :rtype: bool
        """
        return self._is_read_only

    @is_read_only.setter
    def is_read_only(self, is_read_only):
        """
        Sets the is_read_only of this ServiceAccountCredentialDetails.
        Whether the credentials are read-only.


        :param is_read_only: The is_read_only of this ServiceAccountCredentialDetails.
        :type: bool
        """
        self._is_read_only = is_read_only

    @property
    def private_key(self):
        """
        **[Required]** Gets the private_key of this ServiceAccountCredentialDetails.
        The private key associated with the service account.


        :return: The private_key of this ServiceAccountCredentialDetails.
        :rtype: str
        """
        return self._private_key

    @private_key.setter
    def private_key(self, private_key):
        """
        Sets the private_key of this ServiceAccountCredentialDetails.
        The private key associated with the service account.


        :param private_key: The private_key of this ServiceAccountCredentialDetails.
        :type: str
        """
        self._private_key = private_key

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
