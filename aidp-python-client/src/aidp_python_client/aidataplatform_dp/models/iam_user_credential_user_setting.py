# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .setting_data import SettingData
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class IamUserCredentialUserSetting(SettingData):
    """
    IAM user credential setting details
    """

    def __init__(self, **kwargs):
        """
        Initializes a new IamUserCredentialUserSetting object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.IamUserCredentialUserSetting.type` attribute
        of this class is ``IAM_USER_CREDENTIAL`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this IamUserCredentialUserSetting.
            Allowed values for this property are: "IAM_USER_CREDENTIAL", "GIT_ACCOUNT", "OAUTH"
        :type type: str

        :param user_id:
            The value to assign to the user_id property of this IamUserCredentialUserSetting.
        :type user_id: str

        :param tenancy:
            The value to assign to the tenancy property of this IamUserCredentialUserSetting.
        :type tenancy: str

        :param region:
            The value to assign to the region property of this IamUserCredentialUserSetting.
        :type region: str

        :param fingerprint:
            The value to assign to the fingerprint property of this IamUserCredentialUserSetting.
        :type fingerprint: str

        :param private_api_key:
            The value to assign to the private_api_key property of this IamUserCredentialUserSetting.
        :type private_api_key: str

        """
        self.swagger_types = {
            'type': 'str',
            'user_id': 'str',
            'tenancy': 'str',
            'region': 'str',
            'fingerprint': 'str',
            'private_api_key': 'str'
        }

        self.attribute_map = {
            'type': 'type',
            'user_id': 'userId',
            'tenancy': 'tenancy',
            'region': 'region',
            'fingerprint': 'fingerprint',
            'private_api_key': 'privateApiKey'
        }

        self._type = None
        self._user_id = None
        self._tenancy = None
        self._region = None
        self._fingerprint = None
        self._private_api_key = None
        self._type = 'IAM_USER_CREDENTIAL'

    @property
    def user_id(self):
        """
        **[Required]** Gets the user_id of this IamUserCredentialUserSetting.
        User OCID or User Name


        :return: The user_id of this IamUserCredentialUserSetting.
        :rtype: str
        """
        return self._user_id

    @user_id.setter
    def user_id(self, user_id):
        """
        Sets the user_id of this IamUserCredentialUserSetting.
        User OCID or User Name


        :param user_id: The user_id of this IamUserCredentialUserSetting.
        :type: str
        """
        self._user_id = user_id

    @property
    def tenancy(self):
        """
        **[Required]** Gets the tenancy of this IamUserCredentialUserSetting.
        Tenancy


        :return: The tenancy of this IamUserCredentialUserSetting.
        :rtype: str
        """
        return self._tenancy

    @tenancy.setter
    def tenancy(self, tenancy):
        """
        Sets the tenancy of this IamUserCredentialUserSetting.
        Tenancy


        :param tenancy: The tenancy of this IamUserCredentialUserSetting.
        :type: str
        """
        self._tenancy = tenancy

    @property
    def region(self):
        """
        **[Required]** Gets the region of this IamUserCredentialUserSetting.
        Region


        :return: The region of this IamUserCredentialUserSetting.
        :rtype: str
        """
        return self._region

    @region.setter
    def region(self, region):
        """
        Sets the region of this IamUserCredentialUserSetting.
        Region


        :param region: The region of this IamUserCredentialUserSetting.
        :type: str
        """
        self._region = region

    @property
    def fingerprint(self):
        """
        **[Required]** Gets the fingerprint of this IamUserCredentialUserSetting.
        Fingerprint


        :return: The fingerprint of this IamUserCredentialUserSetting.
        :rtype: str
        """
        return self._fingerprint

    @fingerprint.setter
    def fingerprint(self, fingerprint):
        """
        Sets the fingerprint of this IamUserCredentialUserSetting.
        Fingerprint


        :param fingerprint: The fingerprint of this IamUserCredentialUserSetting.
        :type: str
        """
        self._fingerprint = fingerprint

    @property
    def private_api_key(self):
        """
        **[Required]** Gets the private_api_key of this IamUserCredentialUserSetting.
        Private API Key


        :return: The private_api_key of this IamUserCredentialUserSetting.
        :rtype: str
        """
        return self._private_api_key

    @private_api_key.setter
    def private_api_key(self, private_api_key):
        """
        Sets the private_api_key of this IamUserCredentialUserSetting.
        Private API Key


        :param private_api_key: The private_api_key of this IamUserCredentialUserSetting.
        :type: str
        """
        self._private_api_key = private_api_key

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
