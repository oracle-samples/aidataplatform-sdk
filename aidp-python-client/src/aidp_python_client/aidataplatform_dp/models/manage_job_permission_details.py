# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ManageJobPermissionDetails(object):
    """
    Information to update permissions on a job.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ManageJobPermissionDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param assign_job_permission_details:
            The value to assign to the assign_job_permission_details property of this ManageJobPermissionDetails.
        :type assign_job_permission_details: oci.aidataplatform_dp.models.AssignJobPermissionDetails

        :param revoke_job_permission_details:
            The value to assign to the revoke_job_permission_details property of this ManageJobPermissionDetails.
        :type revoke_job_permission_details: oci.aidataplatform_dp.models.RevokeJobPermissionDetails

        """
        self.swagger_types = {
            'assign_job_permission_details': 'AssignJobPermissionDetails',
            'revoke_job_permission_details': 'RevokeJobPermissionDetails'
        }

        self.attribute_map = {
            'assign_job_permission_details': 'assignJobPermissionDetails',
            'revoke_job_permission_details': 'revokeJobPermissionDetails'
        }

        self._assign_job_permission_details = None
        self._revoke_job_permission_details = None

    @property
    def assign_job_permission_details(self):
        """
        Gets the assign_job_permission_details of this ManageJobPermissionDetails.

        :return: The assign_job_permission_details of this ManageJobPermissionDetails.
        :rtype: oci.aidataplatform_dp.models.AssignJobPermissionDetails
        """
        return self._assign_job_permission_details

    @assign_job_permission_details.setter
    def assign_job_permission_details(self, assign_job_permission_details):
        """
        Sets the assign_job_permission_details of this ManageJobPermissionDetails.

        :param assign_job_permission_details: The assign_job_permission_details of this ManageJobPermissionDetails.
        :type: oci.aidataplatform_dp.models.AssignJobPermissionDetails
        """
        self._assign_job_permission_details = assign_job_permission_details

    @property
    def revoke_job_permission_details(self):
        """
        Gets the revoke_job_permission_details of this ManageJobPermissionDetails.

        :return: The revoke_job_permission_details of this ManageJobPermissionDetails.
        :rtype: oci.aidataplatform_dp.models.RevokeJobPermissionDetails
        """
        return self._revoke_job_permission_details

    @revoke_job_permission_details.setter
    def revoke_job_permission_details(self, revoke_job_permission_details):
        """
        Sets the revoke_job_permission_details of this ManageJobPermissionDetails.

        :param revoke_job_permission_details: The revoke_job_permission_details of this ManageJobPermissionDetails.
        :type: oci.aidataplatform_dp.models.RevokeJobPermissionDetails
        """
        self._revoke_job_permission_details = revoke_job_permission_details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
