# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class RevokeOntologyProjectPermissionsDetails(object):
    """
    Details for revoking direct Ontology Manager project permissions.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new RevokeOntologyProjectPermissionsDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param permissions:
            The value to assign to the permissions property of this RevokeOntologyProjectPermissionsDetails.
        :type permissions: oci.aidataplatform_dp.models.OntologyManagerPermissions

        """
        self.swagger_types = {
            'permissions': 'OntologyManagerPermissions'
        }
        self.attribute_map = {
            'permissions': 'permissions'
        }
        self._permissions = None

    @property
    def permissions(self):
        """
        **[Required]** Gets the permissions of this RevokeOntologyProjectPermissionsDetails.

        :return: The permissions of this RevokeOntologyProjectPermissionsDetails.
        :rtype: oci.aidataplatform_dp.models.OntologyManagerPermissions
        """
        return self._permissions

    @permissions.setter
    def permissions(self, permissions):
        """
        Sets the permissions of this RevokeOntologyProjectPermissionsDetails.

        :param permissions: The permissions of this RevokeOntologyProjectPermissionsDetails.
        :type: oci.aidataplatform_dp.models.OntologyManagerPermissions
        """
        self._permissions = permissions

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
