# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class IsPrincipalAdmin(object):
    """
    Response indicating whether the principal has admin privileges.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new IsPrincipalAdmin object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param is_admin:
            The value to assign to the is_admin property of this IsPrincipalAdmin.
        :type is_admin: bool

        """
        self.swagger_types = {
            'is_admin': 'bool'
        }

        self.attribute_map = {
            'is_admin': 'isAdmin'
        }

        self._is_admin = None

    @property
    def is_admin(self):
        """
        **[Required]** Gets the is_admin of this IsPrincipalAdmin.
        True if the principal has admin privileges, otherwise false.


        :return: The is_admin of this IsPrincipalAdmin.
        :rtype: bool
        """
        return self._is_admin

    @is_admin.setter
    def is_admin(self, is_admin):
        """
        Sets the is_admin of this IsPrincipalAdmin.
        True if the principal has admin privileges, otherwise false.


        :param is_admin: The is_admin of this IsPrincipalAdmin.
        :type: bool
        """
        self._is_admin = is_admin

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
