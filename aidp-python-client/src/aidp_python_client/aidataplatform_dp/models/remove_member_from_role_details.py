# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class RemoveMemberFromRoleDetails(object):
    """
    The details of revoking the role.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new RemoveMemberFromRoleDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param assignees:
            The value to assign to the assignees property of this RemoveMemberFromRoleDetails.
        :type assignees: list[oci.aidataplatform_dp.models.RoleAssignee]

        """
        self.swagger_types = {
            'assignees': 'list[RoleAssignee]'
        }

        self.attribute_map = {
            'assignees': 'assignees'
        }

        self._assignees = None

    @property
    def assignees(self):
        """
        **[Required]** Gets the assignees of this RemoveMemberFromRoleDetails.
        The assignees on the role.


        :return: The assignees of this RemoveMemberFromRoleDetails.
        :rtype: list[oci.aidataplatform_dp.models.RoleAssignee]
        """
        return self._assignees

    @assignees.setter
    def assignees(self, assignees):
        """
        Sets the assignees of this RemoveMemberFromRoleDetails.
        The assignees on the role.


        :param assignees: The assignees of this RemoveMemberFromRoleDetails.
        :type: list[oci.aidataplatform_dp.models.RoleAssignee]
        """
        self._assignees = assignees

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
