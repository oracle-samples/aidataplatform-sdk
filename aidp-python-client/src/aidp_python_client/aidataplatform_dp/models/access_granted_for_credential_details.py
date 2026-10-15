# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AccessGrantedForCredentialDetails(object):
    """
    Lakeproxy Credential resource details.
    """

    #: A constant which can be used with the credential_operation_target property of a AccessGrantedForCredentialDetails.
    #: This constant has a value of "CENTRIFY_CATALOG"
    CREDENTIAL_OPERATION_TARGET_CENTRIFY_CATALOG = "CENTRIFY_CATALOG"

    #: A constant which can be used with the credential_operation_target property of a AccessGrantedForCredentialDetails.
    #: This constant has a value of "CREDENTIAL"
    CREDENTIAL_OPERATION_TARGET_CREDENTIAL = "CREDENTIAL"

    def __init__(self, **kwargs):
        """
        Initializes a new AccessGrantedForCredentialDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param credential_operation_target:
            The value to assign to the credential_operation_target property of this AccessGrantedForCredentialDetails.
            Allowed values for this property are: "CENTRIFY_CATALOG", "CREDENTIAL", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type credential_operation_target: str

        :param credential_details:
            The value to assign to the credential_details property of this AccessGrantedForCredentialDetails.
        :type credential_details: str

        """
        self.swagger_types = {
            'credential_operation_target': 'str',
            'credential_details': 'str'
        }
        self.attribute_map = {
            'credential_operation_target': 'credentialOperationTarget',
            'credential_details': 'credentialDetails'
        }
        self._credential_operation_target = None
        self._credential_details = None

    @property
    def credential_operation_target(self):
        """
        **[Required]** Gets the credential_operation_target of this AccessGrantedForCredentialDetails.
        Lakeproxy credentialOperationTarget.

        Allowed values for this property are: "CENTRIFY_CATALOG", "CREDENTIAL", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The credential_operation_target of this AccessGrantedForCredentialDetails.
        :rtype: str
        """
        return self._credential_operation_target

    @credential_operation_target.setter
    def credential_operation_target(self, credential_operation_target):
        """
        Sets the credential_operation_target of this AccessGrantedForCredentialDetails.
        Lakeproxy credentialOperationTarget.


        :param credential_operation_target: The credential_operation_target of this AccessGrantedForCredentialDetails.
        :type: str
        """
        allowed_values = ["CENTRIFY_CATALOG", "CREDENTIAL"]
        if not value_allowed_none_or_none_sentinel(credential_operation_target, allowed_values):
            credential_operation_target = 'UNKNOWN_ENUM_VALUE'
        self._credential_operation_target = credential_operation_target

    @property
    def credential_details(self):
        """
        Gets the credential_details of this AccessGrantedForCredentialDetails.
        Lakeproxy credentialDetails.


        :return: The credential_details of this AccessGrantedForCredentialDetails.
        :rtype: str
        """
        return self._credential_details

    @credential_details.setter
    def credential_details(self, credential_details):
        """
        Sets the credential_details of this AccessGrantedForCredentialDetails.
        Lakeproxy credentialDetails.


        :param credential_details: The credential_details of this AccessGrantedForCredentialDetails.
        :type: str
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
