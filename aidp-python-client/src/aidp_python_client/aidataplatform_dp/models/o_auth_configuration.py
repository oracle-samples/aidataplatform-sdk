# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OAuthConfiguration(object):
    """
    OAuth configuration for agent flow
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OAuthConfiguration object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param issuer_claim:
            The value to assign to the issuer_claim property of this OAuthConfiguration.
        :type issuer_claim: str

        :param audience_claim:
            The value to assign to the audience_claim property of this OAuthConfiguration.
        :type audience_claim: list[str]

        :param jwks_uri:
            The value to assign to the jwks_uri property of this OAuthConfiguration.
        :type jwks_uri: str

        """
        self.swagger_types = {
            'issuer_claim': 'str',
            'audience_claim': 'list[str]',
            'jwks_uri': 'str'
        }

        self.attribute_map = {
            'issuer_claim': 'issuerClaim',
            'audience_claim': 'audienceClaim',
            'jwks_uri': 'jwksUri'
        }

        self._issuer_claim = None
        self._audience_claim = None
        self._jwks_uri = None

    @property
    def issuer_claim(self):
        """
        Gets the issuer_claim of this OAuthConfiguration.
        Issuer Claim of OAuthConfiguration


        :return: The issuer_claim of this OAuthConfiguration.
        :rtype: str
        """
        return self._issuer_claim

    @issuer_claim.setter
    def issuer_claim(self, issuer_claim):
        """
        Sets the issuer_claim of this OAuthConfiguration.
        Issuer Claim of OAuthConfiguration


        :param issuer_claim: The issuer_claim of this OAuthConfiguration.
        :type: str
        """
        self._issuer_claim = issuer_claim

    @property
    def audience_claim(self):
        """
        Gets the audience_claim of this OAuthConfiguration.
        List of Audience Claim of OAuthConfiguration


        :return: The audience_claim of this OAuthConfiguration.
        :rtype: list[str]
        """
        return self._audience_claim

    @audience_claim.setter
    def audience_claim(self, audience_claim):
        """
        Sets the audience_claim of this OAuthConfiguration.
        List of Audience Claim of OAuthConfiguration


        :param audience_claim: The audience_claim of this OAuthConfiguration.
        :type: list[str]
        """
        self._audience_claim = audience_claim

    @property
    def jwks_uri(self):
        """
        Gets the jwks_uri of this OAuthConfiguration.
        JWKS URI of OAuthConfiguration


        :return: The jwks_uri of this OAuthConfiguration.
        :rtype: str
        """
        return self._jwks_uri

    @jwks_uri.setter
    def jwks_uri(self, jwks_uri):
        """
        Sets the jwks_uri of this OAuthConfiguration.
        JWKS URI of OAuthConfiguration


        :param jwks_uri: The jwks_uri of this OAuthConfiguration.
        :type: str
        """
        self._jwks_uri = jwks_uri

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
