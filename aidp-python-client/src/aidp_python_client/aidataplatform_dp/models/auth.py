# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class Auth(object):
    """
    agent flow to communicate with MCP using the defined auth mode
    """

    #: A constant which can be used with the auth_type property of a Auth.
    #: This constant has a value of "NO_AUTH"
    AUTH_TYPE_NO_AUTH = "NO_AUTH"

    #: A constant which can be used with the auth_type property of a Auth.
    #: This constant has a value of "BEARER_TOKEN"
    AUTH_TYPE_BEARER_TOKEN = "BEARER_TOKEN"

    #: A constant which can be used with the auth_type property of a Auth.
    #: This constant has a value of "OAUTH"
    AUTH_TYPE_OAUTH = "OAUTH"

    #: A constant which can be used with the auth_type property of a Auth.
    #: This constant has a value of "OCI_RESOURCE_PRINCIPAL"
    AUTH_TYPE_OCI_RESOURCE_PRINCIPAL = "OCI_RESOURCE_PRINCIPAL"

    def __init__(self, **kwargs):
        """
        Initializes a new Auth object with values from keyword arguments. This class has the following subclasses and if you are using this class as input
        to a service operations then you should favor using a subclass over the base class:

        * :class:`~oci.aidataplatform_dp.models.OciResourcePrincipalAuth`
        * :class:`~oci.aidataplatform_dp.models.BearerTokenAuth`
        * :class:`~oci.aidataplatform_dp.models.NoAuth`
        * :class:`~oci.aidataplatform_dp.models.OAuth`

        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param auth_type:
            The value to assign to the auth_type property of this Auth.
            Allowed values for this property are: "NO_AUTH", "BEARER_TOKEN", "OAUTH", "OCI_RESOURCE_PRINCIPAL"
        :type auth_type: str

        """
        self.swagger_types = {
            'auth_type': 'str'
        }

        self.attribute_map = {
            'auth_type': 'authType'
        }

        self._auth_type = None

    @staticmethod
    def get_subtype(object_dictionary):
        """
        Given the hash representation of a subtype of this class,
        use the info in the hash to return the class of the subtype.
        """
        type = object_dictionary['authType']

        if type == 'OCI_RESOURCE_PRINCIPAL':
            return 'OciResourcePrincipalAuth'

        if type == 'BEARER_TOKEN':
            return 'BearerTokenAuth'

        if type == 'NO_AUTH':
            return 'NoAuth'

        if type == 'OAUTH':
            return 'OAuth'
        else:
            return 'Auth'

    @property
    def auth_type(self):
        """
        Gets the auth_type of this Auth.
        Type of auth used by MCP. Basic or bearer token or resource principal.

        Allowed values for this property are: "NO_AUTH", "BEARER_TOKEN", "OAUTH", "OCI_RESOURCE_PRINCIPAL"


        :return: The auth_type of this Auth.
        :rtype: str
        """
        return self._auth_type

    @auth_type.setter
    def auth_type(self, auth_type):
        """
        Sets the auth_type of this Auth.
        Type of auth used by MCP. Basic or bearer token or resource principal.


        :param auth_type: The auth_type of this Auth.
        :type: str
        """
        allowed_values = ["NO_AUTH", "BEARER_TOKEN", "OAUTH", "OCI_RESOURCE_PRINCIPAL"]
        if not value_allowed_none_or_none_sentinel(auth_type, allowed_values):
            raise ValueError(
                "Invalid value for `auth_type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._auth_type = auth_type

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
