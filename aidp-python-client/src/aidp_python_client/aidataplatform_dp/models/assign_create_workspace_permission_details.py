# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AssignCreateWorkspacePermissionDetails(object):
    """
    The details of the permissions assigned on the workspace to assignee.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AssignCreateWorkspacePermissionDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param assignees:
            The value to assign to the assignees property of this AssignCreateWorkspacePermissionDetails.
        :type assignees: oci.aidataplatform_dp.models.PermissionAssignees

        """
        self.swagger_types = {
            'assignees': 'PermissionAssignees'
        }

        self.attribute_map = {
            'assignees': 'assignees'
        }

        self._assignees = None

    @property
    def assignees(self):
        """
        **[Required]** Gets the assignees of this AssignCreateWorkspacePermissionDetails.

        :return: The assignees of this AssignCreateWorkspacePermissionDetails.
        :rtype: oci.aidataplatform_dp.models.PermissionAssignees
        """
        return self._assignees

    @assignees.setter
    def assignees(self, assignees):
        """
        Sets the assignees of this AssignCreateWorkspacePermissionDetails.

        :param assignees: The assignees of this AssignCreateWorkspacePermissionDetails.
        :type: oci.aidataplatform_dp.models.PermissionAssignees
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
