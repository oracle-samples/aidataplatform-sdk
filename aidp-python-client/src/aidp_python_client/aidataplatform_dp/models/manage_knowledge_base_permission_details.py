# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ManageKnowledgeBasePermissionDetails(object):
    """
    Information to update permissions on a Knowledge Base.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ManageKnowledgeBasePermissionDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param assign_knowledge_base_permission_details:
            The value to assign to the assign_knowledge_base_permission_details property of this ManageKnowledgeBasePermissionDetails.
        :type assign_knowledge_base_permission_details: oci.aidataplatform_dp.models.AssignKnowledgeBasePermissionDetails

        :param revoke_knowledge_base_permission_details:
            The value to assign to the revoke_knowledge_base_permission_details property of this ManageKnowledgeBasePermissionDetails.
        :type revoke_knowledge_base_permission_details: oci.aidataplatform_dp.models.RevokeKnowledgeBasePermissionDetails

        """
        self.swagger_types = {
            'assign_knowledge_base_permission_details': 'AssignKnowledgeBasePermissionDetails',
            'revoke_knowledge_base_permission_details': 'RevokeKnowledgeBasePermissionDetails'
        }

        self.attribute_map = {
            'assign_knowledge_base_permission_details': 'assignKnowledgeBasePermissionDetails',
            'revoke_knowledge_base_permission_details': 'revokeKnowledgeBasePermissionDetails'
        }

        self._assign_knowledge_base_permission_details = None
        self._revoke_knowledge_base_permission_details = None

    @property
    def assign_knowledge_base_permission_details(self):
        """
        Gets the assign_knowledge_base_permission_details of this ManageKnowledgeBasePermissionDetails.

        :return: The assign_knowledge_base_permission_details of this ManageKnowledgeBasePermissionDetails.
        :rtype: oci.aidataplatform_dp.models.AssignKnowledgeBasePermissionDetails
        """
        return self._assign_knowledge_base_permission_details

    @assign_knowledge_base_permission_details.setter
    def assign_knowledge_base_permission_details(self, assign_knowledge_base_permission_details):
        """
        Sets the assign_knowledge_base_permission_details of this ManageKnowledgeBasePermissionDetails.

        :param assign_knowledge_base_permission_details: The assign_knowledge_base_permission_details of this ManageKnowledgeBasePermissionDetails.
        :type: oci.aidataplatform_dp.models.AssignKnowledgeBasePermissionDetails
        """
        self._assign_knowledge_base_permission_details = assign_knowledge_base_permission_details

    @property
    def revoke_knowledge_base_permission_details(self):
        """
        Gets the revoke_knowledge_base_permission_details of this ManageKnowledgeBasePermissionDetails.

        :return: The revoke_knowledge_base_permission_details of this ManageKnowledgeBasePermissionDetails.
        :rtype: oci.aidataplatform_dp.models.RevokeKnowledgeBasePermissionDetails
        """
        return self._revoke_knowledge_base_permission_details

    @revoke_knowledge_base_permission_details.setter
    def revoke_knowledge_base_permission_details(self, revoke_knowledge_base_permission_details):
        """
        Sets the revoke_knowledge_base_permission_details of this ManageKnowledgeBasePermissionDetails.

        :param revoke_knowledge_base_permission_details: The revoke_knowledge_base_permission_details of this ManageKnowledgeBasePermissionDetails.
        :type: oci.aidataplatform_dp.models.RevokeKnowledgeBasePermissionDetails
        """
        self._revoke_knowledge_base_permission_details = revoke_knowledge_base_permission_details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
