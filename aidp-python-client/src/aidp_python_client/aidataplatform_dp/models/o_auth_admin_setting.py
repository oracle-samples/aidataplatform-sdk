# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.

from .setting_data import SettingData
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OAuthAdminSetting(SettingData):
    """
    OAuth admin setting details
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OAuthAdminSetting object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.OAuthAdminSetting.type` attribute
        of this class is ``OAUTH`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this OAuthAdminSetting.
            Allowed values for this property are: "IAM_USER_CREDENTIAL", "GIT_ACCOUNT", "OAUTH"
        :type type: str

        :param identity_provider_url:
            The value to assign to the identity_provider_url property of this OAuthAdminSetting.
        :type identity_provider_url: str

        :param retrieve_jks_url:
            The value to assign to the retrieve_jks_url property of this OAuthAdminSetting.
        :type retrieve_jks_url: str

        """
        self.swagger_types = {
            'type': 'str',
            'identity_provider_url': 'str',
            'retrieve_jks_url': 'str'
        }

        self.attribute_map = {
            'type': 'type',
            'identity_provider_url': 'identityProviderUrl',
            'retrieve_jks_url': 'retrieveJksUrl'
        }

        self._type = None
        self._identity_provider_url = None
        self._retrieve_jks_url = None
        self._type = 'OAUTH'

    @property
    def identity_provider_url(self):
        """
        **[Required]** Gets the identity_provider_url of this OAuthAdminSetting.
        Issuer / authorization server base URL


        :return: The identity_provider_url of this OAuthAdminSetting.
        :rtype: str
        """
        return self._identity_provider_url

    @identity_provider_url.setter
    def identity_provider_url(self, identity_provider_url):
        """
        Sets the identity_provider_url of this OAuthAdminSetting.
        Issuer / authorization server base URL


        :param identity_provider_url: The identity_provider_url of this OAuthAdminSetting.
        :type: str
        """
        self._identity_provider_url = identity_provider_url

    @property
    def retrieve_jks_url(self):
        """
        **[Required]** Gets the retrieve_jks_url of this OAuthAdminSetting.
        URL to retrieve JKS keystore


        :return: The retrieve_jks_url of this OAuthAdminSetting.
        :rtype: str
        """
        return self._retrieve_jks_url

    @retrieve_jks_url.setter
    def retrieve_jks_url(self, retrieve_jks_url):
        """
        Sets the retrieve_jks_url of this OAuthAdminSetting.
        URL to retrieve JKS keystore


        :param retrieve_jks_url: The retrieve_jks_url of this OAuthAdminSetting.
        :type: str
        """
        self._retrieve_jks_url = retrieve_jks_url

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
