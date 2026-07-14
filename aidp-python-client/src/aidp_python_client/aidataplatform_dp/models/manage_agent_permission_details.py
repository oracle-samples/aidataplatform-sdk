# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ManageAgentPermissionDetails(object):
    """
    Information to update permissions on a agent.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ManageAgentPermissionDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param assign_agent_permission_details:
            The value to assign to the assign_agent_permission_details property of this ManageAgentPermissionDetails.
        :type assign_agent_permission_details: oci.aidataplatform_dp.models.AssignAgentPermissionDetails

        :param revoke_agent_permission_details:
            The value to assign to the revoke_agent_permission_details property of this ManageAgentPermissionDetails.
        :type revoke_agent_permission_details: oci.aidataplatform_dp.models.RevokeAgentPermissionDetails

        """
        self.swagger_types = {
            'assign_agent_permission_details': 'AssignAgentPermissionDetails',
            'revoke_agent_permission_details': 'RevokeAgentPermissionDetails'
        }

        self.attribute_map = {
            'assign_agent_permission_details': 'assignAgentPermissionDetails',
            'revoke_agent_permission_details': 'revokeAgentPermissionDetails'
        }

        self._assign_agent_permission_details = None
        self._revoke_agent_permission_details = None

    @property
    def assign_agent_permission_details(self):
        """
        Gets the assign_agent_permission_details of this ManageAgentPermissionDetails.

        :return: The assign_agent_permission_details of this ManageAgentPermissionDetails.
        :rtype: oci.aidataplatform_dp.models.AssignAgentPermissionDetails
        """
        return self._assign_agent_permission_details

    @assign_agent_permission_details.setter
    def assign_agent_permission_details(self, assign_agent_permission_details):
        """
        Sets the assign_agent_permission_details of this ManageAgentPermissionDetails.

        :param assign_agent_permission_details: The assign_agent_permission_details of this ManageAgentPermissionDetails.
        :type: oci.aidataplatform_dp.models.AssignAgentPermissionDetails
        """
        self._assign_agent_permission_details = assign_agent_permission_details

    @property
    def revoke_agent_permission_details(self):
        """
        Gets the revoke_agent_permission_details of this ManageAgentPermissionDetails.

        :return: The revoke_agent_permission_details of this ManageAgentPermissionDetails.
        :rtype: oci.aidataplatform_dp.models.RevokeAgentPermissionDetails
        """
        return self._revoke_agent_permission_details

    @revoke_agent_permission_details.setter
    def revoke_agent_permission_details(self, revoke_agent_permission_details):
        """
        Sets the revoke_agent_permission_details of this ManageAgentPermissionDetails.

        :param revoke_agent_permission_details: The revoke_agent_permission_details of this ManageAgentPermissionDetails.
        :type: oci.aidataplatform_dp.models.RevokeAgentPermissionDetails
        """
        self._revoke_agent_permission_details = revoke_agent_permission_details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
