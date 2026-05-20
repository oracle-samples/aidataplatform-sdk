# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class RoleAssignee(object):
    """
    The user/principal/role the role can be assigned to.
    """

    #: A constant which can be used with the type property of a RoleAssignee.
    #: This constant has a value of "USER"
    TYPE_USER = "USER"

    #: A constant which can be used with the type property of a RoleAssignee.
    #: This constant has a value of "ROLE"
    TYPE_ROLE = "ROLE"

    #: A constant which can be used with the type property of a RoleAssignee.
    #: This constant has a value of "GROUP"
    TYPE_GROUP = "GROUP"

    def __init__(self, **kwargs):
        """
        Initializes a new RoleAssignee object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this RoleAssignee.
            Allowed values for this property are: "USER", "ROLE", "GROUP", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type type: str

        :param target:
            The value to assign to the target property of this RoleAssignee.
        :type target: str

        :param target_name:
            The value to assign to the target_name property of this RoleAssignee.
        :type target_name: str

        """
        self.swagger_types = {
            'type': 'str',
            'target': 'str',
            'target_name': 'str'
        }

        self.attribute_map = {
            'type': 'type',
            'target': 'target',
            'target_name': 'targetName'
        }

        self._type = None
        self._target = None
        self._target_name = None

    @property
    def type(self):
        """
        **[Required]** Gets the type of this RoleAssignee.
        assignee type.

        Allowed values for this property are: "USER", "ROLE", "GROUP", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The type of this RoleAssignee.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this RoleAssignee.
        assignee type.


        :param type: The type of this RoleAssignee.
        :type: str
        """
        allowed_values = ["USER", "ROLE", "GROUP"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            type = 'UNKNOWN_ENUM_VALUE'
        self._type = type

    @property
    def target(self):
        """
        **[Required]** Gets the target of this RoleAssignee.
        The OCID for a principal or role.


        :return: The target of this RoleAssignee.
        :rtype: str
        """
        return self._target

    @target.setter
    def target(self, target):
        """
        Sets the target of this RoleAssignee.
        The OCID for a principal or role.


        :param target: The target of this RoleAssignee.
        :type: str
        """
        self._target = target

    @property
    def target_name(self):
        """
        Gets the target_name of this RoleAssignee.
        The name for a principal or role.


        :return: The target_name of this RoleAssignee.
        :rtype: str
        """
        return self._target_name

    @target_name.setter
    def target_name(self, target_name):
        """
        Sets the target_name of this RoleAssignee.
        The name for a principal or role.


        :param target_name: The target_name of this RoleAssignee.
        :type: str
        """
        self._target_name = target_name

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
