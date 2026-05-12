# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class PermissionAssignees(object):
    """
    The information about the assignees
    """

    #: A constant which can be used with the type property of a PermissionAssignees.
    #: This constant has a value of "USER"
    TYPE_USER = "USER"

    #: A constant which can be used with the type property of a PermissionAssignees.
    #: This constant has a value of "ROLE"
    TYPE_ROLE = "ROLE"

    #: A constant which can be used with the type property of a PermissionAssignees.
    #: This constant has a value of "GROUP"
    TYPE_GROUP = "GROUP"

    def __init__(self, **kwargs):
        """
        Initializes a new PermissionAssignees object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this PermissionAssignees.
            Allowed values for this property are: "USER", "ROLE", "GROUP"
        :type type: str

        :param targets:
            The value to assign to the targets property of this PermissionAssignees.
        :type targets: list[str]

        """
        self.swagger_types = {
            'type': 'str',
            'targets': 'list[str]'
        }

        self.attribute_map = {
            'type': 'type',
            'targets': 'targets'
        }

        self._type = None
        self._targets = None

    @property
    def type(self):
        """
        **[Required]** Gets the type of this PermissionAssignees.
        Grantee type.

        Allowed values for this property are: "USER", "ROLE", "GROUP"


        :return: The type of this PermissionAssignees.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this PermissionAssignees.
        Grantee type.


        :param type: The type of this PermissionAssignees.
        :type: str
        """
        allowed_values = ["USER", "ROLE", "GROUP"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            raise ValueError(
                "Invalid value for `type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._type = type

    @property
    def targets(self):
        """
        **[Required]** Gets the targets of this PermissionAssignees.
        The names/ocids of the users, groups or roles.


        :return: The targets of this PermissionAssignees.
        :rtype: list[str]
        """
        return self._targets

    @targets.setter
    def targets(self, targets):
        """
        Sets the targets of this PermissionAssignees.
        The names/ocids of the users, groups or roles.


        :param targets: The targets of this PermissionAssignees.
        :type: list[str]
        """
        self._targets = targets

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
