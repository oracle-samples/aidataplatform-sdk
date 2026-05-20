# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ManageCatalogPermissionDetails(object):
    """
    Information to update permissions on a catalog.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ManageCatalogPermissionDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param assign_catalog_permission_details:
            The value to assign to the assign_catalog_permission_details property of this ManageCatalogPermissionDetails.
        :type assign_catalog_permission_details: oci.aidataplatform_dp.models.AssignCatalogPermissionDetails

        :param revoke_catalog_permission_details:
            The value to assign to the revoke_catalog_permission_details property of this ManageCatalogPermissionDetails.
        :type revoke_catalog_permission_details: oci.aidataplatform_dp.models.RevokeCatalogPermissionDetails

        """
        self.swagger_types = {
            'assign_catalog_permission_details': 'AssignCatalogPermissionDetails',
            'revoke_catalog_permission_details': 'RevokeCatalogPermissionDetails'
        }

        self.attribute_map = {
            'assign_catalog_permission_details': 'assignCatalogPermissionDetails',
            'revoke_catalog_permission_details': 'revokeCatalogPermissionDetails'
        }

        self._assign_catalog_permission_details = None
        self._revoke_catalog_permission_details = None

    @property
    def assign_catalog_permission_details(self):
        """
        Gets the assign_catalog_permission_details of this ManageCatalogPermissionDetails.

        :return: The assign_catalog_permission_details of this ManageCatalogPermissionDetails.
        :rtype: oci.aidataplatform_dp.models.AssignCatalogPermissionDetails
        """
        return self._assign_catalog_permission_details

    @assign_catalog_permission_details.setter
    def assign_catalog_permission_details(self, assign_catalog_permission_details):
        """
        Sets the assign_catalog_permission_details of this ManageCatalogPermissionDetails.

        :param assign_catalog_permission_details: The assign_catalog_permission_details of this ManageCatalogPermissionDetails.
        :type: oci.aidataplatform_dp.models.AssignCatalogPermissionDetails
        """
        self._assign_catalog_permission_details = assign_catalog_permission_details

    @property
    def revoke_catalog_permission_details(self):
        """
        Gets the revoke_catalog_permission_details of this ManageCatalogPermissionDetails.

        :return: The revoke_catalog_permission_details of this ManageCatalogPermissionDetails.
        :rtype: oci.aidataplatform_dp.models.RevokeCatalogPermissionDetails
        """
        return self._revoke_catalog_permission_details

    @revoke_catalog_permission_details.setter
    def revoke_catalog_permission_details(self, revoke_catalog_permission_details):
        """
        Sets the revoke_catalog_permission_details of this ManageCatalogPermissionDetails.

        :param revoke_catalog_permission_details: The revoke_catalog_permission_details of this ManageCatalogPermissionDetails.
        :type: oci.aidataplatform_dp.models.RevokeCatalogPermissionDetails
        """
        self._revoke_catalog_permission_details = revoke_catalog_permission_details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
