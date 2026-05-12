# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.

from .auth import Auth
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OciResourcePrincipalAuth(Auth):
    """
    Auth configuration while using AIDP resource principal for auth
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OciResourcePrincipalAuth object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.OciResourcePrincipalAuth.auth_type` attribute
        of this class is ``OCI_RESOURCE_PRINCIPAL`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param auth_type:
            The value to assign to the auth_type property of this OciResourcePrincipalAuth.
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
        self._auth_type = 'OCI_RESOURCE_PRINCIPAL'

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
