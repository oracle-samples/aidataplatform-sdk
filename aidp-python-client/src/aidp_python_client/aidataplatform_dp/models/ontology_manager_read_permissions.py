# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyManagerReadPermissions(object):
    """
    Normalized permission map returned by Ontology Manager permission GET operations.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyManagerReadPermissions object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param r:
            The value to assign to the r property of this OntologyManagerReadPermissions.
        :type r: list[oci.aidataplatform_dp.models.OntologyManagerPermissionGrant]

        :param u:
            The value to assign to the u property of this OntologyManagerReadPermissions.
        :type u: list[oci.aidataplatform_dp.models.OntologyManagerPermissionGrant]

        :param m:
            The value to assign to the m property of this OntologyManagerReadPermissions.
        :type m: list[oci.aidataplatform_dp.models.OntologyManagerPermissionGrant]

        :param a:
            The value to assign to the a property of this OntologyManagerReadPermissions.
        :type a: list[oci.aidataplatform_dp.models.OntologyManagerPermissionGrant]

        """
        self.swagger_types = {
            'r': 'list[OntologyManagerPermissionGrant]',
            'u': 'list[OntologyManagerPermissionGrant]',
            'm': 'list[OntologyManagerPermissionGrant]',
            'a': 'list[OntologyManagerPermissionGrant]'
        }
        self.attribute_map = {
            'r': 'r',
            'u': 'u',
            'm': 'm',
            'a': 'a'
        }
        self._r = None
        self._u = None
        self._m = None
        self._a = None

    @property
    def r(self):
        """
        Gets the r of this OntologyManagerReadPermissions.
        Normalized principals with direct read access.


        :return: The r of this OntologyManagerReadPermissions.
        :rtype: list[oci.aidataplatform_dp.models.OntologyManagerPermissionGrant]
        """
        return self._r

    @r.setter
    def r(self, r):
        """
        Sets the r of this OntologyManagerReadPermissions.
        Normalized principals with direct read access.


        :param r: The r of this OntologyManagerReadPermissions.
        :type: list[oci.aidataplatform_dp.models.OntologyManagerPermissionGrant]
        """
        self._r = r

    @property
    def u(self):
        """
        Gets the u of this OntologyManagerReadPermissions.
        Normalized principals with direct use or execute access.


        :return: The u of this OntologyManagerReadPermissions.
        :rtype: list[oci.aidataplatform_dp.models.OntologyManagerPermissionGrant]
        """
        return self._u

    @u.setter
    def u(self, u):
        """
        Sets the u of this OntologyManagerReadPermissions.
        Normalized principals with direct use or execute access.


        :param u: The u of this OntologyManagerReadPermissions.
        :type: list[oci.aidataplatform_dp.models.OntologyManagerPermissionGrant]
        """
        self._u = u

    @property
    def m(self):
        """
        Gets the m of this OntologyManagerReadPermissions.
        Normalized principals with direct manage access.


        :return: The m of this OntologyManagerReadPermissions.
        :rtype: list[oci.aidataplatform_dp.models.OntologyManagerPermissionGrant]
        """
        return self._m

    @m.setter
    def m(self, m):
        """
        Sets the m of this OntologyManagerReadPermissions.
        Normalized principals with direct manage access.


        :param m: The m of this OntologyManagerReadPermissions.
        :type: list[oci.aidataplatform_dp.models.OntologyManagerPermissionGrant]
        """
        self._m = m

    @property
    def a(self):
        """
        Gets the a of this OntologyManagerReadPermissions.
        Normalized principals with direct admin access.


        :return: The a of this OntologyManagerReadPermissions.
        :rtype: list[oci.aidataplatform_dp.models.OntologyManagerPermissionGrant]
        """
        return self._a

    @a.setter
    def a(self, a):
        """
        Sets the a of this OntologyManagerReadPermissions.
        Normalized principals with direct admin access.


        :param a: The a of this OntologyManagerReadPermissions.
        :type: list[oci.aidataplatform_dp.models.OntologyManagerPermissionGrant]
        """
        self._a = a

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
