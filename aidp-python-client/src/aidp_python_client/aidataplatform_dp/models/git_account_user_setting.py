# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .setting_data import SettingData
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class GitAccountUserSetting(SettingData):
    """
    Git account setting details
    """

    #: A constant which can be used with the provider_name property of a GitAccountUserSetting.
    #: This constant has a value of "GITHUB"
    PROVIDER_NAME_GITHUB = "GITHUB"

    #: A constant which can be used with the provider_name property of a GitAccountUserSetting.
    #: This constant has a value of "BITBUCKET"
    PROVIDER_NAME_BITBUCKET = "BITBUCKET"

    #: A constant which can be used with the provider_name property of a GitAccountUserSetting.
    #: This constant has a value of "GITLAB"
    PROVIDER_NAME_GITLAB = "GITLAB"

    #: A constant which can be used with the provider_name property of a GitAccountUserSetting.
    #: This constant has a value of "OCI_DEVOPS"
    PROVIDER_NAME_OCI_DEVOPS = "OCI_DEVOPS"

    #: A constant which can be used with the entity_type property of a GitAccountUserSetting.
    #: This constant has a value of "PERSONAL_ACCESS_TOKEN"
    ENTITY_TYPE_PERSONAL_ACCESS_TOKEN = "PERSONAL_ACCESS_TOKEN"

    def __init__(self, **kwargs):
        """
        Initializes a new GitAccountUserSetting object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.GitAccountUserSetting.type` attribute
        of this class is ``GIT_ACCOUNT`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this GitAccountUserSetting.
            Allowed values for this property are: "IAM_USER_CREDENTIAL", "GIT_ACCOUNT", "OAUTH", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type type: str

        :param provider_name:
            The value to assign to the provider_name property of this GitAccountUserSetting.
            Allowed values for this property are: "GITHUB", "BITBUCKET", "GITLAB", "OCI_DEVOPS", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type provider_name: str

        :param entity_type:
            The value to assign to the entity_type property of this GitAccountUserSetting.
            Allowed values for this property are: "PERSONAL_ACCESS_TOKEN", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type entity_type: str

        :param username:
            The value to assign to the username property of this GitAccountUserSetting.
        :type username: str

        :param personal_access_token:
            The value to assign to the personal_access_token property of this GitAccountUserSetting.
        :type personal_access_token: str

        """
        self.swagger_types = {
            'type': 'str',
            'provider_name': 'str',
            'entity_type': 'str',
            'username': 'str',
            'personal_access_token': 'str'
        }

        self.attribute_map = {
            'type': 'type',
            'provider_name': 'providerName',
            'entity_type': 'entityType',
            'username': 'username',
            'personal_access_token': 'personalAccessToken'
        }

        self._type = None
        self._provider_name = None
        self._entity_type = None
        self._username = None
        self._personal_access_token = None
        self._type = 'GIT_ACCOUNT'

    @property
    def provider_name(self):
        """
        **[Required]** Gets the provider_name of this GitAccountUserSetting.
        The name of the Git provider.

        Allowed values for this property are: "GITHUB", "BITBUCKET", "GITLAB", "OCI_DEVOPS", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The provider_name of this GitAccountUserSetting.
        :rtype: str
        """
        return self._provider_name

    @provider_name.setter
    def provider_name(self, provider_name):
        """
        Sets the provider_name of this GitAccountUserSetting.
        The name of the Git provider.


        :param provider_name: The provider_name of this GitAccountUserSetting.
        :type: str
        """
        allowed_values = ["GITHUB", "BITBUCKET", "GITLAB", "OCI_DEVOPS"]
        if not value_allowed_none_or_none_sentinel(provider_name, allowed_values):
            provider_name = 'UNKNOWN_ENUM_VALUE'
        self._provider_name = provider_name

    @property
    def entity_type(self):
        """
        **[Required]** Gets the entity_type of this GitAccountUserSetting.
        The type of git account entity.

        Allowed values for this property are: "PERSONAL_ACCESS_TOKEN", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The entity_type of this GitAccountUserSetting.
        :rtype: str
        """
        return self._entity_type

    @entity_type.setter
    def entity_type(self, entity_type):
        """
        Sets the entity_type of this GitAccountUserSetting.
        The type of git account entity.


        :param entity_type: The entity_type of this GitAccountUserSetting.
        :type: str
        """
        allowed_values = ["PERSONAL_ACCESS_TOKEN"]
        if not value_allowed_none_or_none_sentinel(entity_type, allowed_values):
            entity_type = 'UNKNOWN_ENUM_VALUE'
        self._entity_type = entity_type

    @property
    def username(self):
        """
        Gets the username of this GitAccountUserSetting.
        The username for the Git account.


        :return: The username of this GitAccountUserSetting.
        :rtype: str
        """
        return self._username

    @username.setter
    def username(self, username):
        """
        Sets the username of this GitAccountUserSetting.
        The username for the Git account.


        :param username: The username of this GitAccountUserSetting.
        :type: str
        """
        self._username = username

    @property
    def personal_access_token(self):
        """
        Gets the personal_access_token of this GitAccountUserSetting.
        The personal access token for the Git account.


        :return: The personal_access_token of this GitAccountUserSetting.
        :rtype: str
        """
        return self._personal_access_token

    @personal_access_token.setter
    def personal_access_token(self, personal_access_token):
        """
        Sets the personal_access_token of this GitAccountUserSetting.
        The personal access token for the Git account.


        :param personal_access_token: The personal_access_token of this GitAccountUserSetting.
        :type: str
        """
        self._personal_access_token = personal_access_token

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
