# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ManageSchemaPermissionDetails(object):
    """
    Information to update permissions on a schema.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ManageSchemaPermissionDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param assign_schema_permission_details:
            The value to assign to the assign_schema_permission_details property of this ManageSchemaPermissionDetails.
        :type assign_schema_permission_details: oci.aidataplatform_dp.models.AssignSchemaPermissionDetails

        :param revoke_schema_permission_details:
            The value to assign to the revoke_schema_permission_details property of this ManageSchemaPermissionDetails.
        :type revoke_schema_permission_details: oci.aidataplatform_dp.models.RevokeSchemaPermissionDetails

        """
        self.swagger_types = {
            'assign_schema_permission_details': 'AssignSchemaPermissionDetails',
            'revoke_schema_permission_details': 'RevokeSchemaPermissionDetails'
        }

        self.attribute_map = {
            'assign_schema_permission_details': 'assignSchemaPermissionDetails',
            'revoke_schema_permission_details': 'revokeSchemaPermissionDetails'
        }

        self._assign_schema_permission_details = None
        self._revoke_schema_permission_details = None

    @property
    def assign_schema_permission_details(self):
        """
        Gets the assign_schema_permission_details of this ManageSchemaPermissionDetails.

        :return: The assign_schema_permission_details of this ManageSchemaPermissionDetails.
        :rtype: oci.aidataplatform_dp.models.AssignSchemaPermissionDetails
        """
        return self._assign_schema_permission_details

    @assign_schema_permission_details.setter
    def assign_schema_permission_details(self, assign_schema_permission_details):
        """
        Sets the assign_schema_permission_details of this ManageSchemaPermissionDetails.

        :param assign_schema_permission_details: The assign_schema_permission_details of this ManageSchemaPermissionDetails.
        :type: oci.aidataplatform_dp.models.AssignSchemaPermissionDetails
        """
        self._assign_schema_permission_details = assign_schema_permission_details

    @property
    def revoke_schema_permission_details(self):
        """
        Gets the revoke_schema_permission_details of this ManageSchemaPermissionDetails.

        :return: The revoke_schema_permission_details of this ManageSchemaPermissionDetails.
        :rtype: oci.aidataplatform_dp.models.RevokeSchemaPermissionDetails
        """
        return self._revoke_schema_permission_details

    @revoke_schema_permission_details.setter
    def revoke_schema_permission_details(self, revoke_schema_permission_details):
        """
        Sets the revoke_schema_permission_details of this ManageSchemaPermissionDetails.

        :param revoke_schema_permission_details: The revoke_schema_permission_details of this ManageSchemaPermissionDetails.
        :type: oci.aidataplatform_dp.models.RevokeSchemaPermissionDetails
        """
        self._revoke_schema_permission_details = revoke_schema_permission_details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
