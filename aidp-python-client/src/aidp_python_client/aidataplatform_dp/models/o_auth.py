# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.

from .auth import Auth
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OAuth(Auth):
    """
    Auth configuration while using oauth token
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OAuth object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.OAuth.auth_type` attribute
        of this class is ``OAUTH`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param auth_type:
            The value to assign to the auth_type property of this OAuth.
            Allowed values for this property are: "NO_AUTH", "BEARER_TOKEN", "OAUTH", "OCI_RESOURCE_PRINCIPAL"
        :type auth_type: str

        :param client_id:
            The value to assign to the client_id property of this OAuth.
        :type client_id: str

        :param client_secret:
            The value to assign to the client_secret property of this OAuth.
        :type client_secret: str

        :param issuer_idp_endpoint:
            The value to assign to the issuer_idp_endpoint property of this OAuth.
        :type issuer_idp_endpoint: str

        :param scopes:
            The value to assign to the scopes property of this OAuth.
        :type scopes: list[str]

        """
        self.swagger_types = {
            'auth_type': 'str',
            'client_id': 'str',
            'client_secret': 'str',
            'issuer_idp_endpoint': 'str',
            'scopes': 'list[str]'
        }

        self.attribute_map = {
            'auth_type': 'authType',
            'client_id': 'clientId',
            'client_secret': 'clientSecret',
            'issuer_idp_endpoint': 'issuerIdpEndpoint',
            'scopes': 'scopes'
        }

        self._auth_type = None
        self._client_id = None
        self._client_secret = None
        self._issuer_idp_endpoint = None
        self._scopes = None
        self._auth_type = 'OAUTH'

    @property
    def client_id(self):
        """
        Gets the client_id of this OAuth.
        The clientId of the confidential app for auth


        :return: The client_id of this OAuth.
        :rtype: str
        """
        return self._client_id

    @client_id.setter
    def client_id(self, client_id):
        """
        Sets the client_id of this OAuth.
        The clientId of the confidential app for auth


        :param client_id: The client_id of this OAuth.
        :type: str
        """
        self._client_id = client_id

    @property
    def client_secret(self):
        """
        Gets the client_secret of this OAuth.
        The secret of the confidential app for auth


        :return: The client_secret of this OAuth.
        :rtype: str
        """
        return self._client_secret

    @client_secret.setter
    def client_secret(self, client_secret):
        """
        Sets the client_secret of this OAuth.
        The secret of the confidential app for auth


        :param client_secret: The client_secret of this OAuth.
        :type: str
        """
        self._client_secret = client_secret

    @property
    def issuer_idp_endpoint(self):
        """
        Gets the issuer_idp_endpoint of this OAuth.
        The endpoint for the issuer idp


        :return: The issuer_idp_endpoint of this OAuth.
        :rtype: str
        """
        return self._issuer_idp_endpoint

    @issuer_idp_endpoint.setter
    def issuer_idp_endpoint(self, issuer_idp_endpoint):
        """
        Sets the issuer_idp_endpoint of this OAuth.
        The endpoint for the issuer idp


        :param issuer_idp_endpoint: The issuer_idp_endpoint of this OAuth.
        :type: str
        """
        self._issuer_idp_endpoint = issuer_idp_endpoint

    @property
    def scopes(self):
        """
        Gets the scopes of this OAuth.
        The list of scopes for oauth


        :return: The scopes of this OAuth.
        :rtype: list[str]
        """
        return self._scopes

    @scopes.setter
    def scopes(self, scopes):
        """
        Sets the scopes of this OAuth.
        The list of scopes for oauth


        :param scopes: The scopes of this OAuth.
        :type: list[str]
        """
        self._scopes = scopes

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
