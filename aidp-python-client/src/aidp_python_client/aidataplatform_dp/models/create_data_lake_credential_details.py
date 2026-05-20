# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateDataLakeCredentialDetails(object):
    """
    The set of details required to create a new credential object.
    """

    #: A constant which can be used with the type property of a CreateDataLakeCredentialDetails.
    #: This constant has a value of "SECRET_TOKEN"
    TYPE_SECRET_TOKEN = "SECRET_TOKEN"

    #: A constant which can be used with the type property of a CreateDataLakeCredentialDetails.
    #: This constant has a value of "VAULT_REFERENCE"
    TYPE_VAULT_REFERENCE = "VAULT_REFERENCE"

    #: A constant which can be used with the type property of a CreateDataLakeCredentialDetails.
    #: This constant has a value of "SERVICE_ACCOUNT"
    TYPE_SERVICE_ACCOUNT = "SERVICE_ACCOUNT"

    def __init__(self, **kwargs):
        """
        Initializes a new CreateDataLakeCredentialDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param display_name:
            The value to assign to the display_name property of this CreateDataLakeCredentialDetails.
        :type display_name: str

        :param credential_description:
            The value to assign to the credential_description property of this CreateDataLakeCredentialDetails.
        :type credential_description: str

        :param type:
            The value to assign to the type property of this CreateDataLakeCredentialDetails.
            Allowed values for this property are: "SECRET_TOKEN", "VAULT_REFERENCE", "SERVICE_ACCOUNT"
        :type type: str

        :param credential_details:
            The value to assign to the credential_details property of this CreateDataLakeCredentialDetails.
        :type credential_details: oci.aidataplatform_dp.models.CredentialDetails

        """
        self.swagger_types = {
            'display_name': 'str',
            'credential_description': 'str',
            'type': 'str',
            'credential_details': 'CredentialDetails'
        }

        self.attribute_map = {
            'display_name': 'displayName',
            'credential_description': 'credentialDescription',
            'type': 'type',
            'credential_details': 'credentialDetails'
        }

        self._display_name = None
        self._credential_description = None
        self._type = None
        self._credential_details = None

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this CreateDataLakeCredentialDetails.
        A user-friendly name for the credential object. This value does not have to be unique and can be changed. Must start with a letter and contain only letters, numbers, or underscores. Avoid entering confidential information.


        :return: The display_name of this CreateDataLakeCredentialDetails.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this CreateDataLakeCredentialDetails.
        A user-friendly name for the credential object. This value does not have to be unique and can be changed. Must start with a letter and contain only letters, numbers, or underscores. Avoid entering confidential information.


        :param display_name: The display_name of this CreateDataLakeCredentialDetails.
        :type: str
        """
        self._display_name = display_name

    @property
    def credential_description(self):
        """
        Gets the credential_description of this CreateDataLakeCredentialDetails.
        A brief summary of the credential object and its purpose.


        :return: The credential_description of this CreateDataLakeCredentialDetails.
        :rtype: str
        """
        return self._credential_description

    @credential_description.setter
    def credential_description(self, credential_description):
        """
        Sets the credential_description of this CreateDataLakeCredentialDetails.
        A brief summary of the credential object and its purpose.


        :param credential_description: The credential_description of this CreateDataLakeCredentialDetails.
        :type: str
        """
        self._credential_description = credential_description

    @property
    def type(self):
        """
        **[Required]** Gets the type of this CreateDataLakeCredentialDetails.
        The type of credential stored. Allowed values are defined in CredentialType.

        Allowed values for this property are: "SECRET_TOKEN", "VAULT_REFERENCE", "SERVICE_ACCOUNT"


        :return: The type of this CreateDataLakeCredentialDetails.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this CreateDataLakeCredentialDetails.
        The type of credential stored. Allowed values are defined in CredentialType.


        :param type: The type of this CreateDataLakeCredentialDetails.
        :type: str
        """
        allowed_values = ["SECRET_TOKEN", "VAULT_REFERENCE", "SERVICE_ACCOUNT"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            raise ValueError(
                "Invalid value for `type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._type = type

    @property
    def credential_details(self):
        """
        **[Required]** Gets the credential_details of this CreateDataLakeCredentialDetails.

        :return: The credential_details of this CreateDataLakeCredentialDetails.
        :rtype: oci.aidataplatform_dp.models.CredentialDetails
        """
        return self._credential_details

    @credential_details.setter
    def credential_details(self, credential_details):
        """
        Sets the credential_details of this CreateDataLakeCredentialDetails.

        :param credential_details: The credential_details of this CreateDataLakeCredentialDetails.
        :type: oci.aidataplatform_dp.models.CredentialDetails
        """
        self._credential_details = credential_details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
