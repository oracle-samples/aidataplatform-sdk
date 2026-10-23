# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyManagerPermissionCollection(object):
    """
    Direct permission grants on an Ontology Manager scope.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyManagerPermissionCollection object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param permissions:
            The value to assign to the permissions property of this OntologyManagerPermissionCollection.
        :type permissions: oci.aidataplatform_dp.models.OntologyManagerReadPermissions

        :param d:
            The value to assign to the d property of this OntologyManagerPermissionCollection.
        :type d: dict(str, str)

        """
        self.swagger_types = {
            'permissions': 'OntologyManagerReadPermissions',
            'd': 'dict(str, str)'
        }
        self.attribute_map = {
            'permissions': 'permissions',
            'd': 'd'
        }
        self._permissions = None
        self._d = None

    @property
    def permissions(self):
        """
        **[Required]** Gets the permissions of this OntologyManagerPermissionCollection.

        :return: The permissions of this OntologyManagerPermissionCollection.
        :rtype: oci.aidataplatform_dp.models.OntologyManagerReadPermissions
        """
        return self._permissions

    @permissions.setter
    def permissions(self, permissions):
        """
        Sets the permissions of this OntologyManagerPermissionCollection.

        :param permissions: The permissions of this OntologyManagerPermissionCollection.
        :type: oci.aidataplatform_dp.models.OntologyManagerReadPermissions
        """
        self._permissions = permissions

    @property
    def d(self):
        """
        **[Required]** Gets the d of this OntologyManagerPermissionCollection.
        One-based display-name map referenced by each grant's d field. Indices are deterministic only within this response.


        :return: The d of this OntologyManagerPermissionCollection.
        :rtype: dict(str, str)
        """
        return self._d

    @d.setter
    def d(self, d):
        """
        Sets the d of this OntologyManagerPermissionCollection.
        One-based display-name map referenced by each grant's d field. Indices are deterministic only within this response.


        :param d: The d of this OntologyManagerPermissionCollection.
        :type: dict(str, str)
        """
        self._d = d

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
