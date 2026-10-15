# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyManagerPermissionGrant(object):
    """
    A normalized permission grantee. Exactly one of u, g, or r identifies the user, group, or role without the compact prefix; the other principal keys are omitted rather than returned with null values. d indexes the collection-level display-name map.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyManagerPermissionGrant object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param u:
            The value to assign to the u property of this OntologyManagerPermissionGrant.
        :type u: str

        :param g:
            The value to assign to the g property of this OntologyManagerPermissionGrant.
        :type g: str

        :param r:
            The value to assign to the r property of this OntologyManagerPermissionGrant.
        :type r: str

        :param d:
            The value to assign to the d property of this OntologyManagerPermissionGrant.
        :type d: int

        """
        self.swagger_types = {
            'u': 'str',
            'g': 'str',
            'r': 'str',
            'd': 'int'
        }
        self.attribute_map = {
            'u': 'u',
            'g': 'g',
            'r': 'r',
            'd': 'd'
        }
        self._u = None
        self._g = None
        self._r = None
        self._d = None

    @property
    def u(self):
        """
        Gets the u of this OntologyManagerPermissionGrant.
        User OCID when this grant targets a user.


        :return: The u of this OntologyManagerPermissionGrant.
        :rtype: str
        """
        return self._u

    @u.setter
    def u(self, u):
        """
        Sets the u of this OntologyManagerPermissionGrant.
        User OCID when this grant targets a user.


        :param u: The u of this OntologyManagerPermissionGrant.
        :type: str
        """
        self._u = u

    @property
    def g(self):
        """
        Gets the g of this OntologyManagerPermissionGrant.
        Group OCID when this grant targets a group.


        :return: The g of this OntologyManagerPermissionGrant.
        :rtype: str
        """
        return self._g

    @g.setter
    def g(self, g):
        """
        Sets the g of this OntologyManagerPermissionGrant.
        Group OCID when this grant targets a group.


        :param g: The g of this OntologyManagerPermissionGrant.
        :type: str
        """
        self._g = g

    @property
    def r(self):
        """
        Gets the r of this OntologyManagerPermissionGrant.
        Role identifier when this grant targets a role.


        :return: The r of this OntologyManagerPermissionGrant.
        :rtype: str
        """
        return self._r

    @r.setter
    def r(self, r):
        """
        Sets the r of this OntologyManagerPermissionGrant.
        Role identifier when this grant targets a role.


        :param r: The r of this OntologyManagerPermissionGrant.
        :type: str
        """
        self._r = r

    @property
    def d(self):
        """
        **[Required]** Gets the d of this OntologyManagerPermissionGrant.
        One-based index into the collection-level display-name map.


        :return: The d of this OntologyManagerPermissionGrant.
        :rtype: int
        """
        return self._d

    @d.setter
    def d(self, d):
        """
        Sets the d of this OntologyManagerPermissionGrant.
        One-based index into the collection-level display-name map.


        :param d: The d of this OntologyManagerPermissionGrant.
        :type: int
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
