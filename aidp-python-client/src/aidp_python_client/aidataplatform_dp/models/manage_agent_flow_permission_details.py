# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ManageAgentFlowPermissionDetails(object):
    """
    Information to update permissions on a Agent flow.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ManageAgentFlowPermissionDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param assign_agent_flow_permission_details:
            The value to assign to the assign_agent_flow_permission_details property of this ManageAgentFlowPermissionDetails.
        :type assign_agent_flow_permission_details: oci.aidataplatform_dp.models.AssignAgentFlowPermissionDetails

        :param revoke_agent_flow_permission_details:
            The value to assign to the revoke_agent_flow_permission_details property of this ManageAgentFlowPermissionDetails.
        :type revoke_agent_flow_permission_details: oci.aidataplatform_dp.models.RevokeAgentFlowPermissionDetails

        """
        self.swagger_types = {
            'assign_agent_flow_permission_details': 'AssignAgentFlowPermissionDetails',
            'revoke_agent_flow_permission_details': 'RevokeAgentFlowPermissionDetails'
        }

        self.attribute_map = {
            'assign_agent_flow_permission_details': 'assignAgentFlowPermissionDetails',
            'revoke_agent_flow_permission_details': 'revokeAgentFlowPermissionDetails'
        }

        self._assign_agent_flow_permission_details = None
        self._revoke_agent_flow_permission_details = None

    @property
    def assign_agent_flow_permission_details(self):
        """
        Gets the assign_agent_flow_permission_details of this ManageAgentFlowPermissionDetails.

        :return: The assign_agent_flow_permission_details of this ManageAgentFlowPermissionDetails.
        :rtype: oci.aidataplatform_dp.models.AssignAgentFlowPermissionDetails
        """
        return self._assign_agent_flow_permission_details

    @assign_agent_flow_permission_details.setter
    def assign_agent_flow_permission_details(self, assign_agent_flow_permission_details):
        """
        Sets the assign_agent_flow_permission_details of this ManageAgentFlowPermissionDetails.

        :param assign_agent_flow_permission_details: The assign_agent_flow_permission_details of this ManageAgentFlowPermissionDetails.
        :type: oci.aidataplatform_dp.models.AssignAgentFlowPermissionDetails
        """
        self._assign_agent_flow_permission_details = assign_agent_flow_permission_details

    @property
    def revoke_agent_flow_permission_details(self):
        """
        Gets the revoke_agent_flow_permission_details of this ManageAgentFlowPermissionDetails.

        :return: The revoke_agent_flow_permission_details of this ManageAgentFlowPermissionDetails.
        :rtype: oci.aidataplatform_dp.models.RevokeAgentFlowPermissionDetails
        """
        return self._revoke_agent_flow_permission_details

    @revoke_agent_flow_permission_details.setter
    def revoke_agent_flow_permission_details(self, revoke_agent_flow_permission_details):
        """
        Sets the revoke_agent_flow_permission_details of this ManageAgentFlowPermissionDetails.

        :param revoke_agent_flow_permission_details: The revoke_agent_flow_permission_details of this ManageAgentFlowPermissionDetails.
        :type: oci.aidataplatform_dp.models.RevokeAgentFlowPermissionDetails
        """
        self._revoke_agent_flow_permission_details = revoke_agent_flow_permission_details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
