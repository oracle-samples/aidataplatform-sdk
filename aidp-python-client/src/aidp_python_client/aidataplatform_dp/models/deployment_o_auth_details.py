# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DeploymentOAuthDetails(object):
    """
    OAuth trust configuration for a model deployment's query endpoint. Required when authType is OAUTH and must be omitted for AIDP. A closed schema: the gateway turns these values into the token policy it enforces, so a member outside this set is not accepted -- it is discarded rather than stored or forwarded, and a misspelled member therefore leaves the one it was meant to be unset, which fails validation. The serialized object must not exceed 16000 characters. Cannot be changed while the deployment is ACTIVE.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new DeploymentOAuthDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param issuer_claim:
            The value to assign to the issuer_claim property of this DeploymentOAuthDetails.
        :type issuer_claim: str

        :param audience_claim:
            The value to assign to the audience_claim property of this DeploymentOAuthDetails.
        :type audience_claim: list[str]

        :param jwks_uri:
            The value to assign to the jwks_uri property of this DeploymentOAuthDetails.
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
        **[Required]** Gets the issuer_claim of this DeploymentOAuthDetails.
        OAuth issuer claim (iss) the query endpoint requires. An https URI whose host is a fully qualified domain name, not an IP literal in any notation, and which carries no userinfo and no fragment.


        :return: The issuer_claim of this DeploymentOAuthDetails.
        :rtype: str
        """
        return self._issuer_claim

    @issuer_claim.setter
    def issuer_claim(self, issuer_claim):
        """
        Sets the issuer_claim of this DeploymentOAuthDetails.
        OAuth issuer claim (iss) the query endpoint requires. An https URI whose host is a fully qualified domain name, not an IP literal in any notation, and which carries no userinfo and no fragment.


        :param issuer_claim: The issuer_claim of this DeploymentOAuthDetails.
        :type: str
        """
        self._issuer_claim = issuer_claim

    @property
    def audience_claim(self):
        """
        **[Required]** Gets the audience_claim of this DeploymentOAuthDetails.
        OAuth audience claims (aud) the query endpoint accepts. Entries must be unique.


        :return: The audience_claim of this DeploymentOAuthDetails.
        :rtype: list[str]
        """
        return self._audience_claim

    @audience_claim.setter
    def audience_claim(self, audience_claim):
        """
        Sets the audience_claim of this DeploymentOAuthDetails.
        OAuth audience claims (aud) the query endpoint accepts. Entries must be unique.


        :param audience_claim: The audience_claim of this DeploymentOAuthDetails.
        :type: list[str]
        """
        self._audience_claim = audience_claim

    @property
    def jwks_uri(self):
        """
        **[Required]** Gets the jwks_uri of this DeploymentOAuthDetails.
        URI the gateway retrieves the signing keys (JWKS) from. An https URI whose host is a fully qualified domain name, not an IP literal in any notation, and which carries no userinfo and no fragment. A query string and a non-default port are permitted: published provider JWKS endpoints use both.


        :return: The jwks_uri of this DeploymentOAuthDetails.
        :rtype: str
        """
        return self._jwks_uri

    @jwks_uri.setter
    def jwks_uri(self, jwks_uri):
        """
        Sets the jwks_uri of this DeploymentOAuthDetails.
        URI the gateway retrieves the signing keys (JWKS) from. An https URI whose host is a fully qualified domain name, not an IP literal in any notation, and which carries no userinfo and no fragment. A query string and a non-default port are permitted: published provider JWKS endpoints use both.


        :param jwks_uri: The jwks_uri of this DeploymentOAuthDetails.
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
