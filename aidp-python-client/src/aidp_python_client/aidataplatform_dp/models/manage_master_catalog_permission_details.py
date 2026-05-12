# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ManageMasterCatalogPermissionDetails(object):
    """
    Information to update permissions on a Master Catalog.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ManageMasterCatalogPermissionDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param assign_master_catalog_permission_details:
            The value to assign to the assign_master_catalog_permission_details property of this ManageMasterCatalogPermissionDetails.
        :type assign_master_catalog_permission_details: oci.aidataplatform_dp.models.AssignMasterCatalogPermissionDetails

        :param revoke_master_catalog_permission_details:
            The value to assign to the revoke_master_catalog_permission_details property of this ManageMasterCatalogPermissionDetails.
        :type revoke_master_catalog_permission_details: oci.aidataplatform_dp.models.RevokeMasterCatalogPermissionDetails

        """
        self.swagger_types = {
            'assign_master_catalog_permission_details': 'AssignMasterCatalogPermissionDetails',
            'revoke_master_catalog_permission_details': 'RevokeMasterCatalogPermissionDetails'
        }

        self.attribute_map = {
            'assign_master_catalog_permission_details': 'assignMasterCatalogPermissionDetails',
            'revoke_master_catalog_permission_details': 'revokeMasterCatalogPermissionDetails'
        }

        self._assign_master_catalog_permission_details = None
        self._revoke_master_catalog_permission_details = None

    @property
    def assign_master_catalog_permission_details(self):
        """
        Gets the assign_master_catalog_permission_details of this ManageMasterCatalogPermissionDetails.

        :return: The assign_master_catalog_permission_details of this ManageMasterCatalogPermissionDetails.
        :rtype: oci.aidataplatform_dp.models.AssignMasterCatalogPermissionDetails
        """
        return self._assign_master_catalog_permission_details

    @assign_master_catalog_permission_details.setter
    def assign_master_catalog_permission_details(self, assign_master_catalog_permission_details):
        """
        Sets the assign_master_catalog_permission_details of this ManageMasterCatalogPermissionDetails.

        :param assign_master_catalog_permission_details: The assign_master_catalog_permission_details of this ManageMasterCatalogPermissionDetails.
        :type: oci.aidataplatform_dp.models.AssignMasterCatalogPermissionDetails
        """
        self._assign_master_catalog_permission_details = assign_master_catalog_permission_details

    @property
    def revoke_master_catalog_permission_details(self):
        """
        Gets the revoke_master_catalog_permission_details of this ManageMasterCatalogPermissionDetails.

        :return: The revoke_master_catalog_permission_details of this ManageMasterCatalogPermissionDetails.
        :rtype: oci.aidataplatform_dp.models.RevokeMasterCatalogPermissionDetails
        """
        return self._revoke_master_catalog_permission_details

    @revoke_master_catalog_permission_details.setter
    def revoke_master_catalog_permission_details(self, revoke_master_catalog_permission_details):
        """
        Sets the revoke_master_catalog_permission_details of this ManageMasterCatalogPermissionDetails.

        :param revoke_master_catalog_permission_details: The revoke_master_catalog_permission_details of this ManageMasterCatalogPermissionDetails.
        :type: oci.aidataplatform_dp.models.RevokeMasterCatalogPermissionDetails
        """
        self._revoke_master_catalog_permission_details = revoke_master_catalog_permission_details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
